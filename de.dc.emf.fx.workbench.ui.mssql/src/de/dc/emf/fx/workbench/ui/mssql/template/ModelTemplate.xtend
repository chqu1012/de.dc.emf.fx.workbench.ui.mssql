package de.dc.emf.fx.workbench.ui.mssql.template

import de.dc.emf.fx.workbench.ui.mssql.Table

class ModelTemplate implements IGenerator<Table>{
	
	override gen(Table input)'''
	«val name = input.name.toLowerCase.toFirstUpper»
	
	import java.math.*;
	
	public class «name»{
		
		«FOR f : input.columns»
		private «f.datatype» «f.name.toLowerCase»;
		«ENDFOR»
		
		«FOR f : input.columns»
		public void set«f.name.toLowerCase.toFirstUpper»(«f.datatype» «f.name.toLowerCase» ){
			this.«f.name.toLowerCase» = «f.name.toLowerCase»;
		}
		
		public «f.datatype» get«f.name.toLowerCase.toFirstUpper»(){
			return this.«f.name.toLowerCase»;
		}
		«ENDFOR»
	}
	'''
	
	override name(Table input)'''«input.name.toLowerCase.toFirstUpper»'''
	
}