package de.dc.emf.fx.workbench.ui.mssql.template;

import de.dc.emf.fx.workbench.ui.mssql.Table;
import de.dc.emf.fx.workbench.ui.mssql.template.IGenerator;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class IMigrationServiceTemplate implements IGenerator<Table> {
  @Override
  public String gen(final Table input) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import java.sql.*;");
    _builder.newLine();
    _builder.append("import java.util.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public interface IMigrationService<T>{");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Connection getConnectionSource();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Connection getConnectionDestination();");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("void connect(String sourceJdbcUrl, String destinationJdbcUrl) throws SQLException;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("void connectSource(String sourceJdbcUrl) throws SQLException;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("void connectDestination(String destinationJdbcUrl) throws SQLException;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("void disconnect() throws SQLException;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("void disconnectSource() throws SQLException;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("void disconnectDestination() throws SQLException;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("List<T> migrate(int offset, int countOfRows) throws SQLException;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("int size() throws SQLException;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("String getTableName();");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  @Override
  public String name(final Table input) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("IMigrationService.java");
    return _builder.toString();
  }
}
