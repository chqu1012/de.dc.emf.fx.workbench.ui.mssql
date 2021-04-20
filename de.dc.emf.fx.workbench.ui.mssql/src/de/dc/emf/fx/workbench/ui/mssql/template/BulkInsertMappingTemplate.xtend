package de.dc.emf.fx.workbench.ui.mssql.template

import de.dc.emf.fx.workbench.ui.mssql.Table

class BulkInsertMappingTemplate implements IGenerator<Table>{
	
	override name(Table input)'''«input.name»Mapping.java'''
	
	override gen(Table input)'''
	import de.bytefish.jsqlserverbulkinsert.mapping.AbstractMapping;
	«val name = input.name.toLowerCase.toFirstUpper»
	public class «name»Mapping extends AbstractMapping<«name»> {
	
	    public «name»Mapping() {
	        super("dbo", "«name»");
			«FOR c : input.columns»
			map«c.sqlType.name().toLowerCase.toFirstUpper»("«c.name.toFirstUpper»", «name»::get«c.name.toLowerCase.toFirstUpper»);
	        «ENDFOR»
	    }
	}
	'''
}