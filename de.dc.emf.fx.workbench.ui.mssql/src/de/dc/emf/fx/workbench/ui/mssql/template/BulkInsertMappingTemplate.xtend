package de.dc.emf.fx.workbench.ui.mssql.template

import de.dc.emf.fx.workbench.ui.mssql.Table
import de.dc.emf.fx.workbench.ui.mssql.template.IGenerator

class BulkInsertMappingTemplate implements IGenerator<Table>{
	
	override name(Table input)'''«input.name»Mapping.java'''
	
	override gen(Table input)'''
	import de.bytefish.jsqlserverbulkinsert.mapping.AbstractMapping;
	
	public class «input.name»Mapping extends AbstractMapping<«input.name»> {
	
	    public «input.name»Mapping() {
	        super("dbo", "«input.name»");
			«FOR c : input.columns»
			map«c.sqlType.name().toLowerCase.toFirstUpper»("«c.name.toFirstUpper»", «input.name»::get«c.name.toFirstUpper»);
	        «ENDFOR»
	    }
	}
	'''
}