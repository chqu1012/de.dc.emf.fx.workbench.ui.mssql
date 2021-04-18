package de.dc.emf.fx.workbench.ui.mssql.view;

import javax.inject.Inject;

import de.dc.emf.fx.workbench.jmetro.core.di.EmfFXPlatform;
import de.dc.emf.fx.workbench.jmetro.core.service.ISelectionService;
import de.dc.emf.fx.workbench.jmetro.ui.EmfFxmlView;
import de.dc.emf.fx.workbench.ui.mssql.Column;
import de.dc.emf.fx.workbench.ui.mssql.MssqlFactory;
import de.dc.emf.fx.workbench.ui.mssql.MssqlServer;
import de.dc.emf.fx.workbench.ui.mssql.SqlType;
import de.dc.emf.fx.workbench.ui.mssql.Table;
import de.dc.emf.fx.workbench.ui.mssql.cell.ColumnListCell;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class MssqlTableFormView extends EmfFxmlView {

	@Inject
	ISelectionService selectionService;

	@FXML
	protected TextField textTableName;

	@FXML
	protected TextField textColumnName;

	@FXML
	protected TextField textColumnDatatype;

	@FXML
	protected ComboBox<SqlType> comboSqlType;

	@FXML
	protected CheckBox checkNullable;

	@FXML
	protected CheckBox checkIsPrimaryKey;

	@FXML
	protected ListView<Column> listViewColumn;

	private ObservableList<Column> columns = FXCollections.observableArrayList();

	public MssqlTableFormView() {
		super("Table Form", "/de/dc/emf/fx/workbench/jmetro/ui/mssql/TableForm.fxml");

		EmfFXPlatform.inject(this);

		comboSqlType.setItems(FXCollections.observableArrayList(SqlType.values()));
		comboSqlType.getSelectionModel().select(SqlType.VARCHAR);
		textColumnDatatype.setText("String");

		listViewColumn.setItems(columns);
		listViewColumn.setCellFactory(e -> new ColumnListCell());
	}

	@FXML
	protected void onButtonColumnAddAction(ActionEvent event) {
		String columnName = textColumnName.getText();
		Column column = MssqlFactory.eINSTANCE.createColumn();
		column.setName(columnName);
		column.setSqlType(comboSqlType.getSelectionModel().getSelectedItem());
		column.setDatatype(textColumnDatatype.getText());
		column.setIsNullable(checkNullable.isSelected());
		if (checkIsPrimaryKey.isSelected()) {
			column.setPrimaryKey(MssqlFactory.eINSTANCE.createPrimaryKey());
		}
		columns.add(column);

		checkIsPrimaryKey.setSelected(false);
		textColumnName.setText("");
	}

	@FXML
	protected void onButtonCreateTableAction(ActionEvent event) {
		Object selection = selectionService.getTreeSelection();
		if (selection instanceof MssqlServer) {
			if (textTableName.getText() == null || textTableName.getText().isEmpty()) {
				throw new RuntimeException("Table Name may not null!");
			}
			MssqlServer server = (MssqlServer) selection;
			Table table = MssqlFactory.eINSTANCE.createTable();
			table.setName(textTableName.getText());
			table.getColumns().addAll(columns);
			server.getTables().add(table);

			textTableName.setText("");
			columns.clear();
		} else {
			throw new RuntimeException("No MSSQL Server is selected in the editor!");
		}

	}

	@FXML
	protected void onMenuItemDelecteAction(ActionEvent event) {
		columns.remove(listViewColumn.getSelectionModel().getSelectedItem());
	}

	@FXML
	protected void onMenuItemUpAction(ActionEvent event) {
		reindexItem(-1);
	}

	@FXML
	protected void onMenuItemDownAction(ActionEvent event) {
		reindexItem(1);
	}

	/**
	 * Up -> 1
	 * Down -> -1
	 * @param upOrDown
	 */
	private void reindexItem(int upOrDown) {
		int currentIndex = listViewColumn.getSelectionModel().getSelectedIndex();
		if (currentIndex==0 && upOrDown == -1) {
			throw new RuntimeException("Column Item is on top, moving up is not possible!");
		}
		Column selection = listViewColumn.getSelectionModel().getSelectedItem();
		columns.remove(selection);
		columns.add(currentIndex+(1*upOrDown), selection);
		listViewColumn.getSelectionModel().select(selection);
	}
}
