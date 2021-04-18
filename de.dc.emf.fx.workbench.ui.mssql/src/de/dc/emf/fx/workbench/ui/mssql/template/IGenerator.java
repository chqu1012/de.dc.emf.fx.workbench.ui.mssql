package de.dc.emf.fx.workbench.ui.mssql.template;

public interface IGenerator<T> {

	String gen(T input);
	
	String name(T input);
}
