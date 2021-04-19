package de.dc.emf.fx.workbench.ui.mssql.template

import de.dc.emf.fx.workbench.ui.mssql.Table

class SqlTableConstraintTemplate implements IGenerator<Table>{
	
	override gen(Table input)'''
	«FOR c : input.columns»
	«val fk = c.foreignKey»
	«IF fk !== null»
	ALTER TABLE «input.name» ADD CONSTRAINT "«fk.name»" FOREIGN KEY ("«c.name»") REFERENCES "«fk.table.name»" ("«fk.column.name»")
	«ENDIF»
	«ENDFOR»
	'''
	
	override name(Table input)'''add_table_constraints.sql'''
	
}