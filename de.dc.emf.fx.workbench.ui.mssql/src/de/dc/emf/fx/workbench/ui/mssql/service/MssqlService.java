package de.dc.emf.fx.workbench.ui.mssql.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Optional;

import de.dc.emf.fx.workbench.ui.mssql.MssqlServer;
import de.dc.emf.fx.workbench.ui.mssql.Table;
import de.dc.emf.fx.workbench.ui.mssql.User;

public class MssqlService implements IMssqlService {

	private Connection connection;

	@Override
	public void connect(String host, String port, String user, String password, String databaseName) throws SQLException {
		String connectionUrl = "jdbc:sqlserver://"+host+":"+port+";databaseName="+databaseName+";user="+user+";password="+password;

		System.out.print("Connecting to SQL Server ... ");
		connection = DriverManager.getConnection(connectionUrl);
		System.out.println("Done.");
	}

	@Override
	public ResultSet query(String sql) throws SQLException {
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		return resultSet;
	}

	@Override
	public void createTable(Table table) throws SQLException {
		connect((MssqlServer) table.eContainer());
		
		StringBuilder sql = new StringBuilder().append("CREATE TABLE "+table.getName()+" ( ");
				
		Optional<String> columns = table.getColumns().stream().map(e->{
			String pk = e.getPrimaryKey()!=null ? " PRIMARY KEY" : "";
			return e.getName()+" "+e.getSqlType()+pk;
		}).reduce((e1, e2)-> e1+", "+e2);
		if (columns.isPresent()) {
			sql.append(columns);
		}
		sql.append("); ");
		
		Statement statement = connection.createStatement();
		statement.executeUpdate(sql.toString());
		System.out.println("Done -> "+sql.toString() );
		
		disconnect();
	}

	@Override
	public void connect(MssqlServer server) throws SQLException {
		User user = server.getUser();
		connect(server.getHostname(), server.getPort(), user.getName(), user.getPassword(), server.getDatabaseName());
	}

	@Override
	public void disconnect() throws SQLException {
		// TODO Auto-generated method stub
		
	}

}
