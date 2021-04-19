package de.dc.emf.fx.workbench.ui.mssql.template;

import de.dc.emf.fx.workbench.ui.mssql.Column;
import de.dc.emf.fx.workbench.ui.mssql.ForeignKey;
import de.dc.emf.fx.workbench.ui.mssql.Table;
import de.dc.emf.fx.workbench.ui.mssql.template.IGenerator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class SqlTableConstraintTemplate implements IGenerator<Table> {
  @Override
  public String gen(final Table input) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Column> _columns = input.getColumns();
      for(final Column c : _columns) {
        final ForeignKey fk = c.getForeignKey();
        _builder.newLineIfNotEmpty();
        {
          if ((fk != null)) {
            _builder.append("ALTER TABLE ");
            String _name = input.getName();
            _builder.append(_name);
            _builder.append(" ADD CONSTRAINT \"");
            String _name_1 = fk.getName();
            _builder.append(_name_1);
            _builder.append("\" FOREIGN KEY (\"");
            String _name_2 = c.getName();
            _builder.append(_name_2);
            _builder.append("\") REFERENCES \"");
            String _name_3 = fk.getTable().getName();
            _builder.append(_name_3);
            _builder.append("\" (\"");
            String _name_4 = fk.getColumn().getName();
            _builder.append(_name_4);
            _builder.append("\")");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder.toString();
  }
  
  @Override
  public String name(final Table input) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("add_table_constraints.sql");
    return _builder.toString();
  }
}
