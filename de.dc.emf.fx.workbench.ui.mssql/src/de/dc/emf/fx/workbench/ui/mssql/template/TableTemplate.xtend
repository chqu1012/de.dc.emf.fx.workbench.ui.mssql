package de.dc.emf.fx.workbench.ui.mssql.template

import de.dc.emf.fx.workbench.ui.mssql.Table
import de.dc.emf.fx.workbench.ui.mssql.template.IGenerator

class TableTemplate implements IGenerator<Table>{
	
	override gen(Table input)'''
	CREATE TABLE «input.name» («input.columns.map[it.name].reduce[p1, p2|p1+', '+p2]») 
	'''
	
}