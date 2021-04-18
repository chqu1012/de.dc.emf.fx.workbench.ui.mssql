package de.dc.emf.fx.workbench.ui.mssql.template;

import org.eclipse.emf.ecore.EObject;

public interface IGenerator<T> {

	String gen(T input);
}
