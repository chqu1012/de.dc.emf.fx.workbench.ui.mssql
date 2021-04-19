package de.dc.emf.fx.workbench.ui.mssql.template;

import de.dc.emf.fx.workbench.ui.mssql.MssqlServer;

public enum ServerTemplates {
	DROP_ALL_TABLES(new SqlDropAllTemplate(), "java"),
	ADD_CONSTRAINTS(new SqlServerConstraintTemplate(), "sql")
	;

	IGenerator<MssqlServer> generator;
	private String language;

	private ServerTemplates(IGenerator<MssqlServer> generator, String language) {
		this.generator = generator;
		this.language = language;
	}

	public IGenerator<MssqlServer> getGenerator() {
		return generator;
	}

	public String getLanguage() {
		return language;
	}
}
