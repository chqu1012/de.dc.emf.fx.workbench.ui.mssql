package de.dc.emf.fx.workbench.ui.mssql.template

import de.dc.emf.fx.workbench.ui.mssql.Table

class IMigrationServiceTemplate implements IGenerator<Table>{
	
	override gen(Table input) '''
	import java.sql.*;
	import java.util.*;
	
	public interface IMigrationService<T>{
		
		Connection getConnectionSource();
		Connection getConnectionDestination();
		
		void connect(String sourceJdbcUrl, String destinationJdbcUrl) throws SQLException;
		void connectSource(String sourceJdbcUrl) throws SQLException;
		void connectDestination(String destinationJdbcUrl) throws SQLException;
		
		void disconnect() throws SQLException;
		void disconnectSource() throws SQLException;
		void disconnectDestination() throws SQLException;
		
		List<T> migrate(int offset, int countOfRows) throws SQLException;
		
		int size() throws SQLException;
		
		String getTableName();
	}
	'''
	
	override name(Table input)'''IMigrationService.java'''
	
}