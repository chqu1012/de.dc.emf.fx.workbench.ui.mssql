package de.dc.emf.fx.workbench.ui.mssql.template;

import de.dc.emf.fx.workbench.ui.mssql.Column;
import de.dc.emf.fx.workbench.ui.mssql.Table;
import de.dc.emf.fx.workbench.ui.mssql.template.IGenerator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class ModelTemplate implements IGenerator<Table> {
  @Override
  public String gen(final Table input) {
    StringConcatenation _builder = new StringConcatenation();
    final String name = StringExtensions.toFirstUpper(input.getName().toLowerCase());
    _builder.newLineIfNotEmpty();
    _builder.append("public class ");
    _builder.append(name);
    _builder.append("{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    {
      EList<Column> _columns = input.getColumns();
      for(final Column f : _columns) {
        _builder.append("\t");
        _builder.append("private ");
        String _datatype = f.getDatatype();
        _builder.append(_datatype, "\t");
        _builder.append(" ");
        String _lowerCase = f.getName().toLowerCase();
        _builder.append(_lowerCase, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    {
      EList<Column> _columns_1 = input.getColumns();
      for(final Column f_1 : _columns_1) {
        _builder.append("\t");
        _builder.append("public void set");
        String _firstUpper = StringExtensions.toFirstUpper(f_1.getName().toLowerCase());
        _builder.append(_firstUpper, "\t");
        _builder.append("(");
        String _datatype_1 = f_1.getDatatype();
        _builder.append(_datatype_1, "\t");
        _builder.append(" ");
        String _lowerCase_1 = f_1.getName().toLowerCase();
        _builder.append(_lowerCase_1, "\t");
        _builder.append(" ){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("this.");
        String _lowerCase_2 = f_1.getName().toLowerCase();
        _builder.append(_lowerCase_2, "\t\t");
        _builder.append(" = ");
        String _lowerCase_3 = f_1.getName().toLowerCase();
        _builder.append(_lowerCase_3, "\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public ");
        String _datatype_2 = f_1.getDatatype();
        _builder.append(_datatype_2, "\t");
        _builder.append(" get");
        String _firstUpper_1 = StringExtensions.toFirstUpper(f_1.getName().toLowerCase());
        _builder.append(_firstUpper_1, "\t");
        _builder.append("(){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("return this.");
        String _lowerCase_4 = f_1.getName().toLowerCase();
        _builder.append(_lowerCase_4, "\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  @Override
  public String name(final Table input) {
    StringConcatenation _builder = new StringConcatenation();
    String _firstUpper = StringExtensions.toFirstUpper(input.getName().toLowerCase());
    _builder.append(_firstUpper);
    return _builder.toString();
  }
}
