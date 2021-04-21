package de.dc.emf.fx.workbench.ui.mssql.template

import de.dc.emf.fx.workbench.ui.mssql.Table

class ExtendedServiceTemplate implements IGenerator<Table>{
	
	override gen(Table input)'''
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.time.Duration;
	import java.time.LocalDateTime;
	import java.util.Arrays;
	import java.util.List;
	import java.util.logging.Logger;
	
	import de.dc.emf.fx.workbench.jmetro.core.event.IEventBroker;
	import de.dc.emf.fx.workbench.jmetro.core.model.EmfPrint;
	import de.dc.emf.fx.workbench.jmetro.core.di.EmfFXPlatform;
	
	public class «input.name»MigrationService extends MigrationService<«input.name»>{
	
		@Override
		public String getTableName() {
			return "«input.name»";
		}
	
		@Override
		protected Table mapData(ResultSet resultSet) {
			«input.name.toLowerCase.toFirstUpper» «input.name.toLowerCase» = new «input.name.toLowerCase.toFirstUpper»();
        	«FOR i : 0 .. input.columns.size-1»
        	«val c = input.columns.get(i)»
        	«input.name.toLowerCase».set«c.name.toLowerCase.toFirstUpper»(rs.get«c.datatype»(«i+1»));
            «ENDFOR»
			return «input.name.toLowerCase»;
		}
	
		@Override
		protected String getMigrationQuery(String tableName, int offset, int countOfRows) {
			return "SELECT * FROM "+getTableName()+" WHERE rownum >= "+offset+" AND rownum <= "+(offset+countOfRows)+" order by ID asc";
		}
	
		@Override
		protected AbstractMapping getMapping() {
			return new «input.name»Mapping;
		}
	
	}
	'''
	
	override name(Table input)'''«input.name»MigrationService.java'''
	
}