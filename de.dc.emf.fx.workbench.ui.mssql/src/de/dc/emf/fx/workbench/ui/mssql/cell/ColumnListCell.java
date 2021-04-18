package de.dc.emf.fx.workbench.ui.mssql.cell;

import de.dc.emf.fx.workbench.ui.mssql.Column;
import javafx.scene.control.ListCell;

public class ColumnListCell extends ListCell<Column>{

	@Override
	protected void updateItem(Column item, boolean empty) {
		super.updateItem(item, empty);
		if (item == null || empty) {
			setText(null);
		}else {
			setText(String.format("Column(name: %s, datatype: %s, sqlType: %s, primaryKey: %s, nullable: %s)", item.getName(), item.getDatatype(), item.getSqlType().name(), item.getPrimaryKey()!=null, item.isIsNullable()));
		}
	}
}
