package de.dc.emf.fx.workbench.ui.mssql;

import de.dc.emf.fx.workbench.jmetro.core.IEditor;
import de.dc.emf.fx.workbench.jmetro.ui.EmfPerspective;
import de.dc.emf.fx.workbench.ui.mssql.view.MssqlGeneratorView;

public class MssqlPerspective extends EmfPerspective{

	public MssqlPerspective() {
		MssqlGeneratorView view = new MssqlGeneratorView();
		openViewAtRight(view);
		rightArea.getSelectionModel().select(view);
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
