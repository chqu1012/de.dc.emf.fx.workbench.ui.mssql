package de.dc.emf.fx.workbench.ui.mssql.template

import de.dc.emf.fx.workbench.ui.mssql.Table

class MigrationServiceTemplate implements IGenerator<Table>{
	
	override gen(Table input)'''
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.time.Duration;
	import java.time.LocalDateTime;
	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.List;
	import java.util.logging.Logger;
	
	import de.dc.emf.fx.workbench.jmetro.core.di.EmfFXPlatform;
	import de.dc.emf.fx.workbench.jmetro.core.event.IEventBroker;
	import de.dc.emf.fx.workbench.jmetro.core.model.EmfPrint;
	
	import de.bytefish.jsqlserverbulkinsert.*;
	
	public abstract class MigrationService<T> implements IMigrationService<T>{
	
		public static final String MSG_MIGRATION_CONSOLE_PRINT = "/migration/step/console/print";
		private static final Logger LOGGER = Logger.getLogger(MigrationService.class.getSimpleName());
		
		private Connection connectionSource;
		private Connection connectionDestination;
		
		@Override
		public Connection getConnectionSource() {
			if (connectionSource==null) {
				throw new RuntimeException("no source connection available!");
			}
			return connectionSource;
		}
	
		@Override
		public Connection getConnectionDestination() {
			if (connectionDestination==null) {
				throw new RuntimeException("no source connection available!");
			}
			return connectionDestination;
		}
	
		@Override
		public void connect(String sourceJdbcUrl, String destinationJdbcUrl) throws SQLException {
			connectSource(sourceJdbcUrl);
			connectDestination(destinationJdbcUrl);
		}
	
		@Override
		public void connectSource(String sourceJdbcUrl) throws SQLException {
			connectionSource = DriverManager.getConnection(sourceJdbcUrl);		
		}
	
		@Override
		public void connectDestination(String destinationJdbcUrl) throws SQLException {
			connectionDestination = DriverManager.getConnection(destinationJdbcUrl);	
		}
	
		@Override
		public void disconnect() throws SQLException {
			disconnectDestination();
			disconnectSource();
		}
	
		@Override
		public void disconnectSource() throws SQLException {
			connectionSource.close();
		}
	
		@Override
		public void disconnectDestination() throws SQLException {
			connectionDestination.close();
		}
	
		@Override
		public int size() throws SQLException {
			Statement statement = getConnectionSource().createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT count(*) FROM "+getTableName());
			resultSet.next();
			return resultSet.getInt("count");
		}
		
		protected List<T> getRows(String query) throws SQLException{
			List<T> result = new ArrayList<>();
			Statement statement = getConnectionSource().createStatement();
			ResultSet resultSet = statement.executeQuery(query);
			while (resultSet.next()) {
				result.add(mapData(resultSet));
			}
			return result;
		}
	
		protected abstract T mapData(ResultSet resultSet);
		
		@Override
		public List<T> migrate(int offset, int countOfRows) throws SQLException {
			IEventBroker eventBroker = EmfFXPlatform.getInstance(IEventBroker.class);
			eventBroker.post(MSG_MIGRATION_CONSOLE_PRINT, new EmfPrint("Fetch Data from Oracle DB"));
			List<T> rows = getRows(getMigrationQuery(getTableName(), offset, countOfRows));
			
			SqlServerBulkInsert<T> bulkInsert = new SqlServerBulkInsert<>(getMapping());
			
			LocalDateTime start = LocalDateTime.now();
			LOGGER.info("Start:\t"+start);
			eventBroker.post(MSG_MIGRATION_CONSOLE_PRINT, new EmfPrint("Start Bulk Insert:\t"+start));
			
			for (T row : rows) {
				bulkInsert.saveAll(getConnectionDestination(), Arrays.asList(row));
				eventBroker.post(MSG_MIGRATION_CONSOLE_PRINT, new EmfPrint("Stored data: "+row));
				LOGGER.info("Stored data: "+row);
			}
			
			LocalDateTime end = LocalDateTime.now();
			LOGGER.info("End:\t"+end);
			LOGGER.info("Duration:\t"+Duration.between(start, end).getSeconds());
			LOGGER.info("Data imported:\t"+rows.size());
			
			eventBroker.post(MSG_MIGRATION_CONSOLE_PRINT, new EmfPrint("End Bulk Insert:\t"+end));
			eventBroker.post(MSG_MIGRATION_CONSOLE_PRINT, new EmfPrint("Duration:\t"+Duration.between(start, end).getSeconds()));
			eventBroker.post(MSG_MIGRATION_CONSOLE_PRINT, new EmfPrint("Data imported:\t"+rows.size()));
			
			return null;
		}
		
		protected abstract String getMigrationQuery(String tableName, int offset, int countOfRows);
	
		protected abstract AbstractMapping getMapping();
	}
	'''
	
	override name(Table input)'''MigrationService.java'''
	
}