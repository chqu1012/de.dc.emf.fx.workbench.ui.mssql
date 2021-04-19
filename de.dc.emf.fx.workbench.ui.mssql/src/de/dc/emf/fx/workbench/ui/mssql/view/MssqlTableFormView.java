package de.dc.emf.fx.workbench.ui.mssql.view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.inject.Inject;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.dc.emf.fx.workbench.jmetro.core.di.EmfFXPlatform;
import de.dc.emf.fx.workbench.jmetro.core.service.ISelectionService;
import de.dc.emf.fx.workbench.jmetro.ui.EmfFxmlView;
import de.dc.emf.fx.workbench.ui.mssql.Column;
import de.dc.emf.fx.workbench.ui.mssql.ForeignKey;
import de.dc.emf.fx.workbench.ui.mssql.MssqlFactory;
import de.dc.emf.fx.workbench.ui.mssql.MssqlManager;
import de.dc.emf.fx.workbench.ui.mssql.MssqlServer;
import de.dc.emf.fx.workbench.ui.mssql.PrimaryKey;
import de.dc.emf.fx.workbench.ui.mssql.SqlType;
import de.dc.emf.fx.workbench.ui.mssql.Table;
import de.dc.emf.fx.workbench.ui.mssql.cell.ColumnCell;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class MssqlTableFormView extends EmfFxmlView {

	@Inject
	ISelectionService selectionService;

	@FXML
	protected CheckBox checkIncludeForeignKey;

	@FXML
	protected TextField textReferenceColumnName;

	@FXML
	protected TextField textReferenceTableName;

	@FXML
	protected TextField textForeignKeyName;
	
	@FXML
	protected TextField textTableName;

	@FXML
	protected TextField textColumnName;

	@FXML
	protected TextField textPrimaryKeyName;

	@FXML
	protected ComboBox<String> comboDatatype;

	@FXML
	protected ComboBox<SqlType> comboSqlType;

	@FXML
	protected CheckBox checkNullable;

	@FXML
	protected CheckBox checkIsPrimaryKey;
	
	@FXML
	protected Button buttonCreateTable;

	@FXML
	protected Button buttonAddColumn;
	
	@FXML
	protected ListView<Column> listViewColumn;

	private ObservableList<Column> columns = FXCollections.observableArrayList();

	private Table currentRefTable;

	private Column currentRefColumn;
	
	public MssqlTableFormView() {
		super("Table Form", "/de/dc/emf/fx/workbench/ui/mssql/TableForm.fxml");

		EmfFXPlatform.inject(this);

		comboSqlType.setItems(FXCollections.observableArrayList(SqlType.values()));
		comboSqlType.getSelectionModel().select(SqlType.VARCHAR);

		comboDatatype.setItems(FXCollections.observableArrayList(Arrays.asList("String", "Integer", "LocalDateTime", "LocalDate", "Double", "Float", "Clob", "Blob")));
		comboDatatype.getSelectionModel().selectFirst();
		comboDatatype.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				if (newValue!=null) {
					if (newValue.equals("String")) {
						comboSqlType.getSelectionModel().select(SqlType.VARCHAR);
					}else if (newValue.equals("Integer")) {
						comboSqlType.getSelectionModel().select(SqlType.NUMERIC);
					}else if (newValue.equals("LocalDateTime")) {
						comboSqlType.getSelectionModel().select(SqlType.DATETIME);
					}else if (newValue.equals("LocalDate")) {
						comboSqlType.getSelectionModel().select(SqlType.DATE);
					}else if (newValue.equals("Clob")) {
						comboSqlType.getSelectionModel().select(SqlType.VARCHAR);
					}
				}
			}
		});
		
		textPrimaryKeyName.disableProperty().bind(checkIsPrimaryKey.selectedProperty().not());
		
		listViewColumn.setItems(columns);
		listViewColumn.setCellFactory(e -> new ColumnCell());
		
		buttonCreateTable.disableProperty().bind(textTableName.textProperty().isEmpty());
		buttonAddColumn.disableProperty().bind(textColumnName.textProperty().isEmpty());
	}

	@FXML
	protected void onButtonReferenceTableNameAction(ActionEvent event) {
		Object selection = selectionService.getTreeSelection();
		EObject rootContainer = EcoreUtil.getRootContainer((EObject) selection);
		if (rootContainer instanceof MssqlManager) {
			MssqlManager manager = (MssqlManager) rootContainer;
			List<Table> tables = new ArrayList<>();
			for (MssqlServer server : manager.getServers()) {
				tables.addAll(server.getTables());
			}
			ChoiceDialog<Table> choiceDialog = new ChoiceDialog<Table>(null, tables);
			Optional<Table> result = choiceDialog.showAndWait();
			result.ifPresent(e->{
				currentRefTable=e;
				textReferenceTableName.setText(currentRefTable.getName());
			});
		}
	}

	@FXML
	protected void onButtonReferenceColumnNameAction(ActionEvent event) {
		Object selection = selectionService.getTreeSelection();
		EObject rootContainer = EcoreUtil.getRootContainer((EObject) selection);
		if (rootContainer instanceof MssqlManager) {
			MssqlManager manager = (MssqlManager) rootContainer;
			List<Column> columns = new ArrayList<>();
			for (MssqlServer server : manager.getServers()) {
				for (Table table : server.getTables()) {
					columns.addAll(table.getColumns());
				}
			}
			ChoiceDialog<Column> choiceDialog = new ChoiceDialog<>(null, columns);
			Optional<Column> result = choiceDialog.showAndWait();
			result.ifPresent(e->{
				currentRefColumn=e;
				textReferenceColumnName.setText(currentRefColumn.getName());
			});
		}
	}
		
	@FXML
	protected void onButtonColumnAddAction(ActionEvent event) {
		String columnName = textColumnName.getText();
		Column column = MssqlFactory.eINSTANCE.createColumn();
		column.setName(columnName);
		column.setSqlType(comboSqlType.getSelectionModel().getSelectedItem());
		column.setDatatype(comboDatatype.getValue());
		column.setIsNullable(checkNullable.isSelected());
		if (checkIsPrimaryKey.isSelected()) {
			PrimaryKey pk = MssqlFactory.eINSTANCE.createPrimaryKey();
			pk.setName(textPrimaryKeyName.getText());
			column.setPrimaryKey(pk);
		}
		if (checkIncludeForeignKey.isSelected()) {
			ForeignKey fk = MssqlFactory.eINSTANCE.createForeignKey();
			fk.setName(textForeignKeyName.getText());
			fk.setTable(currentRefTable);
			fk.setColumn(currentRefColumn);
			column.setForeignKey(fk);
		}
		columns.add(column);

		checkIsPrimaryKey.setSelected(false);
		textColumnName.setText("");
	}

	@FXML
	protected void onButtonCreateTableAction(ActionEvent event) {
		Object selection = selectionService.getTreeSelection();
		if (selection instanceof MssqlServer) {
			if (textTableName.getText() == null || textTableName.getText().isEmpty()) {
				throw new RuntimeException("Table Name may not null!");
			}
			MssqlServer server = (MssqlServer) selection;
			Table table = MssqlFactory.eINSTANCE.createTable();
			table.setName(textTableName.getText());
			table.getColumns().addAll(columns);
			server.getTables().add(table);

			textTableName.setText("");
			columns.clear();
		} else {
			throw new RuntimeException("No MSSQL Server is selected in the editor!");
		}

	}

	@FXML
	protected void onMenuItemDelecteAction(ActionEvent event) {
		columns.remove(listViewColumn.getSelectionModel().getSelectedItem());
	}

	@FXML
	protected void onMenuItemUpAction(ActionEvent event) {
		reindexItem(-1);
	}

	@FXML
	protected void onMenuItemDownAction(ActionEvent event) {
		reindexItem(1);
	}

	/**
	 * Up -> 1
	 * Down -> -1
	 * @param upOrDown
	 */
	private void reindexItem(int upOrDown) {
		int currentIndex = listViewColumn.getSelectionModel().getSelectedIndex();
		if (currentIndex==0 && upOrDown == -1) {
			throw new RuntimeException("Column Item is on top, moving up is not possible!");
		}
		Column selection = listViewColumn.getSelectionModel().getSelectedItem();
		columns.remove(selection);
		columns.add(currentIndex+(1*upOrDown), selection);
		listViewColumn.getSelectionModel().select(selection);
	}

}
