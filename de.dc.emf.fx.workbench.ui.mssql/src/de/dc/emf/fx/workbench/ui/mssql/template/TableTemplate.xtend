package de.dc.emf.fx.workbench.ui.mssql.template

import de.dc.emf.fx.workbench.ui.mssql.Table
import de.dc.emf.fx.workbench.ui.mssql.template.IGenerator

class TableTemplate implements IGenerator<Table>{
	
	override name(Table input)'''create_«input.name».sql'''
	
	override gen(Table input)'''
	CREATE TABLE «input.name» (
		«FOR c : input.columns SEPARATOR ','»
		«ENDFOR»
	) 
	'''
	
}