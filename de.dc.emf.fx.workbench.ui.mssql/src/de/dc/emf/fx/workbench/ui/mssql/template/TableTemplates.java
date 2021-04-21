package de.dc.emf.fx.workbench.ui.mssql.template;

import de.dc.emf.fx.workbench.ui.mssql.Table;

public enum TableTemplates {
	TABLE(new TableTemplate(), "sql"), 
	MODEL(new ModelTemplate(), "java"),
	BULK_INSERT_MAPPING(new BulkInsertMappingTemplate(), "java"),
	BULK_INSERT_MAIN(new BulkInsertMainTemplate(), "java"),
	ADD_CONSTRAINTS(new SqlTableConstraintTemplate(), "sql"),
	IMIGRATION_SERVICE(new IMigrationServiceTemplate(), "java"),
	MIGRATION_SERVICE(new MigrationServiceTemplate(), "java"),
	EXTENDED_MIGRATION_SERIVCE(new ExtendedServiceTemplate(), "java")
	;

	IGenerator<Table> generator;
	private String language;

	private TableTemplates(IGenerator<Table> generator, String language) {
		this.generator = generator;
		this.language = language;
	}

	public IGenerator<Table> getGenerator() {
		return generator;
	}

	public String getLanguage() {
		return language;
	}

}
