package de.dc.emf.fx.workbench.ui.mssql;

import de.dc.emf.fx.workbench.jmetro.core.IEditor;
import de.dc.emf.fx.workbench.jmetro.ui.EmfPerspective;
import de.dc.emf.fx.workbench.ui.mssql.view.MssqlGeneratorView;
import de.dc.emf.fx.workbench.ui.mssql.view.MssqlTableFormView;

public class MssqlPerspective extends EmfPerspective{

	public MssqlPerspective() {
		openViewAtRight(new MssqlGeneratorView());
		MssqlTableFormView tableFormView = new MssqlTableFormView();
		openViewAtRight(tableFormView);
		rightArea.getSelectionModel().select(tableFormView);
	}
	
	@Override
	public String getName() {
		return "MSSQL Perspective";
	}

	@Override
	public Class<? extends IEditor<?>> getDefaultEditor() {
		return MssqlEditor.class;
	}

}
