package de.dc.emf.fx.workbench.ui.mssql.template;

import de.dc.emf.fx.workbench.ui.mssql.Column;
import de.dc.emf.fx.workbench.ui.mssql.MssqlServer;
import de.dc.emf.fx.workbench.ui.mssql.Table;
import de.dc.emf.fx.workbench.ui.mssql.template.IGenerator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class SqlDropAllTemplate implements IGenerator<MssqlServer> {
  @Override
  public String gen(final MssqlServer input) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Table> _tables = input.getTables();
      for(final Table t : _tables) {
        _builder.append("/****** DROP ALL CONSTRAINTS **********/");
        _builder.newLine();
        final Function1<Column, Boolean> _function = (Column it) -> {
          return Boolean.valueOf((it != null));
        };
        final Iterable<Column> fkList = IterableExtensions.<Column>filter(t.getColumns(), _function);
        _builder.newLineIfNotEmpty();
        {
          for(final Column fk : fkList) {
            _builder.append("ALTER TABLE [dbo].[");
            String _name = t.getName();
            _builder.append(_name);
            _builder.append("] DROP CONSTRAINT [");
            String _name_1 = fk.getName();
            _builder.append(_name_1);
            _builder.append("]");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    {
      EList<Table> _tables_1 = input.getTables();
      for(final Table t_1 : _tables_1) {
        _builder.append("/****** DROP ALL TABLES **********/");
        _builder.newLine();
        _builder.append("IF EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N\'[dbo].[");
        String _name_2 = t_1.getName();
        _builder.append(_name_2);
        _builder.append("]\') AND type in (N\'U\'))");
        _builder.newLineIfNotEmpty();
        _builder.append("DROP TABLE [dbo].[");
        String _name_3 = t_1.getName();
        _builder.append(_name_3);
        _builder.append("]");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
  
  @Override
  public String name(final MssqlServer input) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("drop_all_tables.sql");
    return _builder.toString();
  }
}
