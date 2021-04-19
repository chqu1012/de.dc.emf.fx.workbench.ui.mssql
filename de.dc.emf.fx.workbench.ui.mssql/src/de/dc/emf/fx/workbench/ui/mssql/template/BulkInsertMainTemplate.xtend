package de.dc.emf.fx.workbench.ui.mssql.template

import de.dc.emf.fx.workbench.ui.mssql.Table
import de.dc.emf.fx.workbench.ui.mssql.MssqlServer

class BulkInsertMainTemplate implements IGenerator<Table>{
	
	override name(Table input)'''«input.name»BulkInsertApp.java'''
	
	override gen(Table input)'''
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.*;
	import de.bytefish.jsqlserverbulkinsert.*;
	
	«val name = input.name.toLowerCase.toFirstUpper»
	public class «name»BulkInsertApp{
		«val server = input.eContainer as MssqlServer»
		«val user = server.user»
		private static final String sourceUrl = ""
		private static final String destinationUrl =
					                "jdbc:sqlserver://«server.hostname»:«server.port»;"
					                + "database=«server.databaseName»;"
					                + "user=«user.name»;"
					                + "password=«user.password»;";
					                
		public static void main(String[] args){
			List<«name»> rows = getRows();
	        «name»Mapping mapping = new «name»Mapping();
	        Connection connection = DriverManager.getConnection(destinationUrl);
	        SqlServerBulkInsert<«name»> bulkInsert = new SqlServerBulkInsert<>(mapping);
			bulkInsert.saveAll(connection, rows.stream());
		}
		
		private static List<«name»> getRows(){
			List<«name»> result = new ArrayList<>();
			
	        try (Connection connection = DriverManager.getConnection(sourceUrl);
	                Statement statement = connection.createStatement();) {
	
	            String selectSql = "SELECT * from «input.name»";
	            ResultSet rs = statement.executeQuery(selectSql);
	
	            while (rs.next()) {
	            	«input.name.toLowerCase.toFirstUpper» «input.name.toLowerCase» = new «input.name.toLowerCase.toFirstUpper»();
	            	«FOR i : 0 .. input.columns.size-1»
	            	«val c = input.columns.get(i)»
	            	«input.name.toLowerCase».set«c.name.toFirstUpper»(rs.get«c.datatype»(«i+1»));
	                «ENDFOR»
	                result.add(«input.name.toLowerCase»);
	            }
	        }
	        catch (SQLException e) {
	            e.printStackTrace();
	        }
	        
	        return result;
		}
	}
	'''
	
}