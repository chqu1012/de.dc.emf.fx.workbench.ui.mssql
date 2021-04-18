package de.dc.emf.fx.workbench.ui.mssql.template

import de.dc.emf.fx.workbench.ui.mssql.MssqlServer
import de.dc.emf.fx.workbench.ui.mssql.Table

class BulkInsertMainTemplate implements IGenerator<Table>{
	
	override gen(Table input)'''
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	
	public class «input.name»BulkInsertApp{
		«val server = input.eContainer as MssqlServer»
		«val user = server.users.head»
		private static final String connectionUrl =
					                "jdbc:sqlserver://«server.hostname»:«server.port»;"
					                + "database=«server.databaseName»;"
					                + "user=«user.name»;"
					                + "password=«user.password»;"
					                
		public static void main(String[] args){
			List<«input.name»> rows = getRows();
	        «input.name»Mapping mapping = new «input.name»Mapping();
	        SqlServerBulkInsert<«input.name»> bulkInsert = new SqlServerBulkInsert<>(mapping);
			bulkInsert.saveAll(connection, rows.stream());
		}
		
		private List<«input.name»> getRows(){
			List<«input.name»> result = new ArrayList<>();
			
	        ResultSet resultSet = null;
	
	        try (Connection connection = DriverManager.getConnection(connectionUrl);
	                Statement statement = connection.createStatement();) {
	
	            String selectSql = "SELECT * from «input.name»";
	            resultSet = statement.executeQuery(selectSql);
	
	            while (resultSet.next()) {
	            	«input.name» «input.name.toFirstLower» = new «input.name»();
	            	«FOR i : 0 .. input.columns.size-1»
	            	«val c = input.columns.get(i)»
	            	«input.name.toFirstLower».set«c.name.toFirstUpper»(rs.get«c.datatype»(«i+1»));
	                «ENDFOR»
	                result.add(«input.name.toFirstLower»);
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