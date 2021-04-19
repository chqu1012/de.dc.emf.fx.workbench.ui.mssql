package de.dc.emf.fx.workbench.ui.mssql.template;

import de.dc.emf.fx.workbench.ui.mssql.MssqlServer;
import de.dc.emf.fx.workbench.ui.mssql.Table;
import de.dc.emf.fx.workbench.ui.mssql.template.IGenerator;
import de.dc.emf.fx.workbench.ui.mssql.template.TableTemplates;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class SqlServerConstraintTemplate implements IGenerator<MssqlServer> {
  @Override
  public String gen(final MssqlServer input) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Table> _tables = input.getTables();
      for(final Table table : _tables) {
        String _gen = TableTemplates.ADD_CONSTRAINTS.generator.gen(table);
        _builder.append(_gen);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
  
  @Override
  public String name(final MssqlServer input) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("add_constraints.sql");
    return _builder.toString();
  }
}
