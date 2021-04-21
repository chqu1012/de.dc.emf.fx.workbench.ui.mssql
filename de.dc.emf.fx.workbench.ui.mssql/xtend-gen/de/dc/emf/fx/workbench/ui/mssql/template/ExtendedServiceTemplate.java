package de.dc.emf.fx.workbench.ui.mssql.template;

import de.dc.emf.fx.workbench.ui.mssql.Column;
import de.dc.emf.fx.workbench.ui.mssql.Table;
import de.dc.emf.fx.workbench.ui.mssql.template.IGenerator;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class ExtendedServiceTemplate implements IGenerator<Table> {
  @Override
  public String gen(final Table input) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import java.sql.ResultSet;");
    _builder.newLine();
    _builder.append("import java.sql.SQLException;");
    _builder.newLine();
    _builder.append("import java.time.Duration;");
    _builder.newLine();
    _builder.append("import java.time.LocalDateTime;");
    _builder.newLine();
    _builder.append("import java.util.Arrays;");
    _builder.newLine();
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.append("import java.util.logging.Logger;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import de.dc.emf.fx.workbench.jmetro.core.event.IEventBroker;");
    _builder.newLine();
    _builder.append("import de.dc.emf.fx.workbench.jmetro.core.model.EmfPrint;");
    _builder.newLine();
    _builder.append("import de.dc.emf.fx.workbench.jmetro.core.di.EmfFXPlatform;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    String _name = input.getName();
    _builder.append(_name);
    _builder.append("MigrationService extends MigrationService<");
    String _name_1 = input.getName();
    _builder.append(_name_1);
    _builder.append(">{");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public String getTableName() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return \"");
    String _name_2 = input.getName();
    _builder.append(_name_2, "\t\t");
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("protected Table mapData(ResultSet resultSet) {");
    _builder.newLine();
    _builder.append("\t\t");
    String _firstUpper = StringExtensions.toFirstUpper(input.getName().toLowerCase());
    _builder.append(_firstUpper, "\t\t");
    _builder.append(" ");
    String _lowerCase = input.getName().toLowerCase();
    _builder.append(_lowerCase, "\t\t");
    _builder.append(" = new ");
    String _firstUpper_1 = StringExtensions.toFirstUpper(input.getName().toLowerCase());
    _builder.append(_firstUpper_1, "\t\t");
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    {
      int _size = input.getColumns().size();
      int _minus = (_size - 1);
      IntegerRange _upTo = new IntegerRange(0, _minus);
      for(final Integer i : _upTo) {
        _builder.append("        \t");
        final Column c = input.getColumns().get((i).intValue());
        _builder.newLineIfNotEmpty();
        _builder.append("        \t");
        String _lowerCase_1 = input.getName().toLowerCase();
        _builder.append(_lowerCase_1, "        \t");
        _builder.append(".set");
        String _firstUpper_2 = StringExtensions.toFirstUpper(c.getName().toLowerCase());
        _builder.append(_firstUpper_2, "        \t");
        _builder.append("(rs.get");
        String _datatype = c.getDatatype();
        _builder.append(_datatype, "        \t");
        _builder.append("(");
        _builder.append(((i).intValue() + 1), "        \t");
        _builder.append("));");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.append("return ");
    String _lowerCase_2 = input.getName().toLowerCase();
    _builder.append(_lowerCase_2, "\t\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("protected String getMigrationQuery(String tableName, int offset, int countOfRows) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return \"SELECT * FROM \"+getTableName()+\" WHERE rownum >= \"+offset+\" AND rownum <= \"+(offset+countOfRows)+\" order by ID asc\";");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("protected AbstractMapping getMapping() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return new ");
    String _name_3 = input.getName();
    _builder.append(_name_3, "\t\t");
    _builder.append("Mapping;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  @Override
  public String name(final Table input) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = input.getName();
    _builder.append(_name);
    _builder.append("MigrationService.java");
    return _builder.toString();
  }
}
