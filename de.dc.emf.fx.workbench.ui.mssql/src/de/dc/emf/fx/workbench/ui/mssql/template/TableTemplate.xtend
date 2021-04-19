package de.dc.emf.fx.workbench.ui.mssql.template

import de.dc.emf.fx.workbench.ui.mssql.Table

class TableTemplate implements IGenerator<Table>{
	
	override name(Table input)'''create_«input.name».sql'''
	
	override gen(Table input)'''
	CREATE TABLE «input.name» (
		«FOR c : input.columns SEPARATOR ','»
		«c.name» «c.sqlType»
		«ENDFOR»
		«IF input.columns.filter[it.primaryKey!==null].size>0»
		«val pk = input.columns.filter[it.primaryKey!==null].head»
		, CONSTRAINT «pk.primaryKey.name» PRIMARY KEY ("«pk.name»")
		«ENDIF»
	)
	'''
	
}