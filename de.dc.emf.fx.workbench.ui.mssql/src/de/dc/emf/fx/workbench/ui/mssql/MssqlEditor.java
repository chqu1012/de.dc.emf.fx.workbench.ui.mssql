package de.dc.emf.fx.workbench.ui.mssql;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import de.dc.emf.fx.workbench.jmetro.ui.SimpleEmfEditor;
import de.dc.emf.fx.workbench.ui.mssql.provider.MssqlItemProviderAdapterFactory;

public class MssqlEditor extends SimpleEmfEditor<MssqlManager>{

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
