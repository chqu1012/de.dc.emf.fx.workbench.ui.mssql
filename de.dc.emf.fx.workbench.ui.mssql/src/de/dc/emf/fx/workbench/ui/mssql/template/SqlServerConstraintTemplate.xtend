package de.dc.emf.fx.workbench.ui.mssql.template

import de.dc.emf.fx.workbench.ui.mssql.MssqlServer
import de.dc.emf.fx.workbench.ui.mssql.template.IGenerator

class SqlServerConstraintTemplate implements IGenerator<MssqlServer>{
	
	override gen(MssqlServer input)'''
	«FOR table : input.tables»
	«TableTemplates::ADD_CONSTRAINTS.generator.gen(table)»
	«ENDFOR»
	'''
	
	override name(MssqlServer input)'''add_constraints.sql'''
	
}