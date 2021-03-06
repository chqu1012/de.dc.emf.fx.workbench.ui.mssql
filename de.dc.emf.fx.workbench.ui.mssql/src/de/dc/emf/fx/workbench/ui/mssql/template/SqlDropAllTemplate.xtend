package de.dc.emf.fx.workbench.ui.mssql.template

import de.dc.emf.fx.workbench.ui.mssql.MssqlServer

class SqlDropAllTemplate implements IGenerator<MssqlServer> {

	override gen(MssqlServer input) '''
	?FOR t : input.tables?
	/****** DROP ALL CONSTRAINTS **********/
	?val fkList = t.columns.filter[it!==null]?
	?FOR fk : fkList?
	ALTER TABLE [dbo].[?t.name?] DROP CONSTRAINT [?fk.name?]
	?ENDFOR?
	?ENDFOR?
	?FOR t : input.tables?
	/****** DROP ALL TABLES **********/
	IF EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[?t.name?]') AND type in (N'U'))
	DROP TABLE [dbo].[?t.name?]
	?ENDFOR?
	'''

	override name(MssqlServer input) '''drop_all_tables.sql'''

}
