package de.dc.emf.fx.workbench.ui.mssql.view;

import org.eclipse.emf.ecore.EObject;

import de.dc.emf.fx.workbench.jmetro.ui.monaco.MonacoGeneratorView;
import de.dc.emf.fx.workbench.ui.mssql.Table;
import de.dc.emf.fx.workbench.ui.mssql.template.IGenerator;
import de.dc.emf.fx.workbench.ui.mssql.template.TableTemplates;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class MssqlGeneratorView extends MonacoGeneratorView{

	@Override
	protected ObservableList getTemplates() {
		return FXCollections.observableArrayList(TableTemplates.values());
	}

	@Override
	public String generateCode(EObject currentObject, Object template) {
		if (currentObject instanceof Table) {
			Table table = (Table) currentObject;
			TableTemplates tpl = (TableTemplates) template;
			IGenerator<Table> generator = tpl.getGenerator();
			monacoPane.getEditor().setCurrentLanguage(tpl.getLanguage());
			return generator.gen(table);
		}
		return "";
	}

	@Override
	protected void onChanged(EObject value) {
		String content = generateCode(currentObject, comboFxmlTemplate.getSelectionModel().getSelectedItem());
		monacoPane.getEditor().getDocument().setText(content);
	}
}
