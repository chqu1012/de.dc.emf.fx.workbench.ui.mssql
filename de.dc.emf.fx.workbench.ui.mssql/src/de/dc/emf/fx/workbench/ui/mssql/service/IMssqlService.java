package de.dc.emf.fx.workbench.ui.mssql.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import de.dc.emf.fx.workbench.ui.mssql.MssqlServer;
import de.dc.emf.fx.workbench.ui.mssql.Table;

public interface IMssqlService {

	void connect(String host, String port, String user, String password, String databaseName) throws SQLException;
	void connect(MssqlServer server) throws SQLException;
	void disconnect() throws SQLException;
	ResultSet query(String sql) throws SQLException;
	void createTable(Table table) throws SQLException;
}
