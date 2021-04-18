package de.dc.emf.fx.workbench.ui.mssql;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.sql.SQLException;

import javax.inject.Inject;

import org.apache.commons.io.FileUtils;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import com.google.common.eventbus.Subscribe;

import de.dc.emf.fx.workbench.jmetro.core.event.EventContext;
import de.dc.emf.fx.workbench.jmetro.core.event.EventTopic;
import de.dc.emf.fx.workbench.jmetro.core.event.IEventBroker;
import de.dc.emf.fx.workbench.jmetro.ui.SimpleEmfEditor;
import de.dc.emf.fx.workbench.ui.mssql.provider.MssqlItemProviderAdapterFactory;
import de.dc.emf.fx.workbench.ui.mssql.service.IMssqlService;
import de.dc.emf.fx.workbench.ui.mssql.service.MssqlService;
import de.dc.emf.fx.workbench.ui.mssql.template.IGenerator;
import de.dc.emf.fx.workbench.ui.mssql.template.TableTemplates;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class MssqlEditor extends SimpleEmfEditor<MssqlManager> {

	private Menu menu = new Menu("Generation");
	private Menu menuRun = new Menu("Run");
	private IMssqlService mssqlService = new MssqlService();

	@Inject
	IEventBroker eventBroker;

	public MssqlEditor() {
		createMenuItem(menu);
		createMenuItem(menuRun);
		eventBroker.register(this);
	}

	@Subscribe
	public void subscribeOnTreeSelectionChanged(EventContext<Object> context) {
		if (context.match(EventTopic.EMF_MODEL_TREE_CLICK)) {
			Object input = context.getInput();
			menu.getItems().clear();
			menuRun.getItems().clear();
			if (input instanceof Table) {
				Table table = (Table) input;
				populateMenuItemForTable(table);
			}else if (input instanceof MssqlServer) {
				MssqlServer server = (MssqlServer) input;
				menuRun.getItems().add(new MenuItem("Create All Tables"));
				for (Table table : server.getTables()) {
					MenuItem menuItem = new MenuItem("Create "+table.getName());
					menuItem.setOnAction(e->{
						try {
							mssqlService.createTable(table);
						} catch (SQLException e1) {
							e1.printStackTrace();
						}
					});
					menuRun.getItems().add(menuItem);
				}
			}
		}
	}

	private void populateMenuItemForTable(Table table) {
		for (TableTemplates tpl : TableTemplates.values()) {
			MenuItem item = new MenuItem(tpl.name());
			item.setOnAction(e -> onMenuItemExportAction(table, tpl));
			menu.getItems().add(item);
		}
		menu.getItems().add(new SeparatorMenuItem());
		MenuItem itemGenerateAll = new MenuItem("Generate All");
		itemGenerateAll.setOnAction(e-> onMenuItemGenerateAllAction(table));
		menu.getItems().add(itemGenerateAll);
	}

	private void onMenuItemGenerateAllAction(Table table) {
		DirectoryChooser dc = new DirectoryChooser();
		File file = dc.showDialog(new Stage());
		if (file != null) {
			for (TableTemplates tpl : TableTemplates.values()) {
				IGenerator<Table> generator = tpl.getGenerator();
				String content = generator.gen(table);
				try {
					FileUtils.write(new File(file.getAbsolutePath()+"/"+generator.name(table)), content, StandardCharsets.UTF_8);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}
	}

	private void onMenuItemExportAction(Table table, TableTemplates tpl) {
		IGenerator<Table> generator = tpl.getGenerator();
		String content = generator.gen(table);
		
		FileChooser fc = new FileChooser();
		fc.setInitialFileName(generator.name(table));
		File file = fc.showSaveDialog(new Stage());
		if (file != null) {
			try {
				FileUtils.write(file, content, StandardCharsets.UTF_8);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}

	@Override
	protected AdapterFactory getModelItemProviderAdapterFactory() {
		return new MssqlItemProviderAdapterFactory();
	}

	@Override
	protected String getEFilextension() {
		return MssqlPackage.eNS_PREFIX;
	}

	@Override
	protected EObject createRootModel() {
		return MssqlFactory.eINSTANCE.createMssqlManager();
	}

	@Override
	protected EFactory getEFactory() {
		return MssqlFactory.eINSTANCE;
	}

	@Override
	protected EPackage getEPackage() {
		return MssqlPackage.eINSTANCE;
	}
}
