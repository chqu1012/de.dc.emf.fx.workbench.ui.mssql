package de.dc.emf.fx.workbench.ui.mssql.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import de.dc.emf.fx.workbench.ui.mssql.MssqlServer;
import de.dc.emf.fx.workbench.ui.mssql.Table;
import de.dc.emf.fx.workbench.ui.mssql.User;
import de.dc.emf.fx.workbench.ui.mssql.template.ServerTemplates;
import de.dc.emf.fx.workbench.ui.mssql.template.TableTemplates;

public class MssqlService implements IMssqlService {

	private Connection connection;

	@Override
	public void connect(String host, String port, String user, String password, String databaseName) throws SQLException {
		if (!port.isEmpty()) {
			port = ":"+port;
		}else {
			port = "";
		}
		String connectionUrl = "jdbc:sqlserver://"+host+port+";databaseName="+databaseName+";user="+user+";password="+password;

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
		
		String sql = TableTemplates.TABLE.getGenerator().gen(table);
		
		Statement statement = connection.createStatement();
		statement.executeUpdate(sql);
		System.out.println("Done -> "+sql);
		
		disconnect();
	}

	@Override
	public void connect(MssqlServer server) throws SQLException {
		User user = server.getUser();
		connect(server.getHostname(), server.getPort(), user.getName(), user.getPassword(), server.getDatabaseName());
	}

	@Override
	public void disconnect() throws SQLException {
		connection.close();
	}

	@Override
	public void drop(Table table) throws SQLException {
		connect((MssqlServer) table.eContainer());
		
		String sql = TableTemplates.TABLE.getGenerator().gen(table);
		
		Statement statement = connection.createStatement();
		statement.executeUpdate(sql);
		System.out.println("Done -> "+sql);
		
		disconnect();		
	}

	@Override
	public void drop(MssqlServer server) throws SQLException {
		connect(server);
		
		String sql = ServerTemplates.DROP_ALL_TABLES.getGenerator().gen(server);
		
		Statement statement = connection.createStatement();
		statement.executeUpdate(sql);
		System.out.println("Done -> "+sql);
		
		disconnect();			
	}

}
