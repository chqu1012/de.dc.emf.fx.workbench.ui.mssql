package de.dc.emf.fx.workbench.ui.mssql.view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.inject.Inject;

import de.dc.emf.fx.workbench.jmetro.core.di.EmfFXPlatform;
import de.dc.emf.fx.workbench.jmetro.core.event.EventContext;
import de.dc.emf.fx.workbench.jmetro.core.event.EventTopic;
import de.dc.emf.fx.workbench.jmetro.core.event.IEventBroker;
import de.dc.emf.fx.workbench.jmetro.core.model.EmfPrint;
import de.dc.emf.fx.workbench.jmetro.core.service.ISelectionService;
import de.dc.emf.fx.workbench.jmetro.ui.EmfFxmlView;
import de.dc.emf.fx.workbench.ui.mssql.Bound;
import de.dc.emf.fx.workbench.ui.mssql.Column;
import de.dc.emf.fx.workbench.ui.mssql.ForeignKey;
import de.dc.emf.fx.workbench.ui.mssql.MssqlFactory;
import de.dc.emf.fx.workbench.ui.mssql.MssqlManager;
import de.dc.emf.fx.workbench.ui.mssql.MssqlServer;
import de.dc.emf.fx.workbench.ui.mssql.PrimaryKey;
import de.dc.emf.fx.workbench.ui.mssql.SqlType;
import de.dc.emf.fx.workbench.ui.mssql.Table;
import de.dc.emf.fx.workbench.ui.mssql.cell.ColumnCell;
import javafx.beans.binding.BooleanBinding;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeItem;
import javafx.scene.input.MouseEvent;
import javafx.util.Callback;

public class MssqlTableFormView extends EmfFxmlView implements ChangeListener<TreeItem<Object>>{

	@Inject
	ISelectionService selectionService;
	
	@Inject IEventBroker eventBroker;

	@FXML
	protected CheckBox checkIncludeForeignKey;

	@FXML
	protected TextField textReferenceColumnName;

	@FXML
	protected TextField textReferenceTableName;

	@FXML
	protected TextField textForeignKeyName;
	
	@FXML
	protected TextField textTableName;

	@FXML
	protected TextField textColumnName;

	@FXML
	protected TextField textPrimaryKeyName;

	@FXML
	protected TextField textColumnBound;

	@FXML
	protected ComboBox<String> comboDatatype;

	@FXML
	protected ComboBox<SqlType> comboSqlType;

	@FXML
	protected CheckBox checkNullable;

	@FXML
	protected CheckBox checkIsPrimaryKey;
	
	@FXML
	protected Button buttonCreateTable;

	@FXML
	protected Button buttonAddColumn;
	
	@FXML
	protected ListView<Column> listViewColumn;
	
	@FXML
	protected TextField textFormSelectedColumn;

	@FXML
	protected TextField textFormForeignKeyName;
	
	@FXML
	protected TextField textFormSearchTable;
	
	@FXML
	protected TextField textFormSearchColumn;
	
	@FXML
	protected TextField textFormCurrentChosenTable;
	
	@FXML
	protected TextField textFormCurrentChosenColumn;
	
	@FXML
	protected ListView<Table> listViewFormTable;
	
	@FXML
	protected ListView<Column> listViewFormColumn;

	@FXML
	protected Button buttonFormAddForeignkey;

	private ObservableList<Column> columns = FXCollections.observableArrayList();

	private ObservableList<Column> masterDataColumns = FXCollections.observableArrayList();
	private FilteredList<Column> filteredColumns = new FilteredList<Column>(masterDataColumns);

	private ObservableList<Table> masterDataTable = FXCollections.observableArrayList();
	private FilteredList<Table> filteredTable = new FilteredList<>(masterDataTable);

	private Table currentRefTable;

	private Column currentRefColumn;

	private Table currentChosenTable;

	private Column currentChosenColumn;

	private Column selectedFormColumn;

	public MssqlTableFormView() {
		super("Table Form", "/de/dc/emf/fx/workbench/ui/mssql/TableForm.fxml", "/de/dc/emf/fx/workbench/ui/mssql/icons/table.png");

		EmfFXPlatform.inject(this);
		selectionService.addListener(this);
		
		initTabGeneral();
		initTabForeignKey();
	}

	private void initTabForeignKey() {
		listViewFormColumn.setItems(filteredColumns);
		listViewFormColumn.setCellFactory(new Callback<ListView<Column>, ListCell<Column>>() {
			@Override
			public ListCell<Column> call(ListView<Column> param) {
				return new ListCell<Column>() {
					@Override
					protected void updateItem(Column item, boolean empty) {
						super.updateItem(item, empty);
						if (item==null || empty) {
							setText(null);
						}else {
							setText(item.getName() + " : "+item.getDatatype());
						}
					}
				};
			}
		});
		listViewFormTable.setItems(filteredTable);		
		listViewFormTable.setCellFactory(new Callback<ListView<Table>, ListCell<Table>>() {
			@Override
			public ListCell<Table> call(ListView<Table> param) {
				return new ListCell<Table>() {
					@Override
					protected void updateItem(Table item, boolean empty) {
						super.updateItem(item, empty);
						if (item==null || empty) {
							setText(null);
						}else {
							setText(item.getName());
						}
					}
				};
			}
		});
		
		BooleanBinding buttonFormForeignKeyDIsableProperty = textFormCurrentChosenColumn.textProperty().isEmpty().or(textFormCurrentChosenTable.textProperty().isEmpty().or(textFormForeignKeyName.textProperty().isEmpty()));
		buttonFormAddForeignkey.disableProperty().bind(buttonFormForeignKeyDIsableProperty);
	}

	private void initTabGeneral() {
		comboSqlType.setItems(FXCollections.observableArrayList(SqlType.values()));
		comboSqlType.getSelectionModel().select(SqlType.VARCHAR);
		comboDatatype.setItems(FXCollections.observableArrayList(Arrays.asList("String", "Integer", "LocalDateTime", "LocalDate", "Double", "Float", "Clob", "Blob")));
		comboDatatype.getSelectionModel().selectFirst();
		comboDatatype.getSelectionModel().selectedItemProperty().addListener(this::onComboDatatypeChanged);
		textPrimaryKeyName.disableProperty().bind(checkIsPrimaryKey.selectedProperty().not());
		listViewColumn.setItems(columns);
		listViewColumn.setCellFactory(e -> new ColumnCell());
		buttonCreateTable.disableProperty().bind(textTableName.textProperty().isEmpty());
		buttonAddColumn.disableProperty().bind(textColumnName.textProperty().isEmpty());
		checkIsPrimaryKey.selectedProperty().addListener(this::onCheckIsPrimaryKeyChanged);
	}

	private void onCheckIsPrimaryKeyChanged(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
		if (newValue) {
			textPrimaryKeyName.setText(textTableName.getText()+"_PK");
		}
	}
	
	private void onComboDatatypeChanged(ObservableValue<? extends String> observable, String oldValue, String newValue) {
		if (newValue!=null) {
			if (newValue.equals("String")) {
				comboSqlType.getSelectionModel().select(SqlType.VARCHAR);
			}else if (newValue.equals("Integer")) {
				comboSqlType.getSelectionModel().select(SqlType.NUMERIC);
			}else if (newValue.equals("LocalDateTime")) {
				comboSqlType.getSelectionModel().select(SqlType.DATETIME);
			}else if (newValue.equals("LocalDate")) {
				comboSqlType.getSelectionModel().select(SqlType.DATE);
			}else if (newValue.equals("Clob")) {
				comboSqlType.getSelectionModel().select(SqlType.VARCHAR);
			}
		}
	}
	
	@FXML
	protected void onListViewFormTableClicked(MouseEvent e) {
		currentChosenTable = listViewFormTable.getSelectionModel().getSelectedItem();
		if (currentChosenTable!=null) {
			masterDataColumns.setAll(currentChosenTable.getColumns());
			textFormCurrentChosenTable.setText(currentChosenTable.getName());
		}
	}
	
	@FXML
	protected void onListViewFormColumnClicked(MouseEvent e) {
		currentChosenColumn = listViewFormColumn.getSelectionModel().getSelectedItem();
		if (currentChosenColumn!=null) {
			textFormCurrentChosenColumn.setText(currentChosenColumn.getName());
		}
	}
	
	@FXML
	protected void onButtonAddForeignKeyAction(ActionEvent e) {
		ForeignKey fk = MssqlFactory.eINSTANCE.createForeignKey();
		fk.setName(textFormForeignKeyName.getText());
		fk.setColumn(currentChosenColumn);
		fk.setTable(currentChosenTable);
		
		Object selection = selectionService.getTreeSelection();
		if (selection instanceof Column) {
			Column column = (Column) selection;
			column.setForeignKey(fk);
			
			textFormForeignKeyName.setText("");
		}else {
			eventBroker.post(new EventContext<>(EventTopic.PRINT_CONSOLE, new EmfPrint("Column may chosen in the tree editor to add a foreign key!")));
		}
	}
	
	@FXML
	protected void onButtonReferenceTableNameAction(ActionEvent event) {
		Object selection = selectionService.getTreeSelection();
		EObject rootContainer = EcoreUtil.getRootContainer((EObject) selection);
		if (rootContainer instanceof MssqlManager) {
			MssqlManager manager = (MssqlManager) rootContainer;
			List<Table> tables = new ArrayList<>();
			for (MssqlServer server : manager.getServers()) {
				tables.addAll(server.getTables());
			}
			ChoiceDialog<Table> choiceDialog = new ChoiceDialog<Table>(null, tables);
			Optional<Table> result = choiceDialog.showAndWait();
			result.ifPresent(e->{
				currentRefTable=e;
				textReferenceTableName.setText(currentRefTable.getName());
			});
		}
	}

	@FXML
	protected void onButtonReferenceColumnNameAction(ActionEvent event) {
		Object selection = selectionService.getTreeSelection();
		EObject rootContainer = EcoreUtil.getRootContainer((EObject) selection);
		if (rootContainer instanceof MssqlManager) {
			MssqlManager manager = (MssqlManager) rootContainer;
			List<Column> columns = new ArrayList<>();
			for (MssqlServer server : manager.getServers()) {
				for (Table table : server.getTables()) {
					columns.addAll(table.getColumns());
				}
			}
			ChoiceDialog<Column> choiceDialog = new ChoiceDialog<>(null, columns);
			Optional<Column> result = choiceDialog.showAndWait();
			result.ifPresent(e->{
				currentRefColumn=e;
				textReferenceColumnName.setText(currentRefColumn.getName());
			});
		}
	}
		
	@FXML
	protected void onButtonColumnAddAction(ActionEvent event) {
		String columnName = textColumnName.getText();
		Column column = MssqlFactory.eINSTANCE.createColumn();
		column.setName(columnName);
		column.setSqlType(comboSqlType.getSelectionModel().getSelectedItem());
		column.setDatatype(comboDatatype.getValue());
		column.setIsNullable(checkNullable.isSelected());
		if (checkIsPrimaryKey.isSelected()) {
			PrimaryKey pk = MssqlFactory.eINSTANCE.createPrimaryKey();
			pk.setName(textPrimaryKeyName.getText());
			column.setPrimaryKey(pk);
		}
		if (checkIncludeForeignKey.isSelected()) {
			ForeignKey fk = MssqlFactory.eINSTANCE.createForeignKey();
			fk.setName(textForeignKeyName.getText());
			fk.setTable(currentRefTable);
			fk.setColumn(currentRefColumn);
			column.setForeignKey(fk);
		}
		if (textColumnBound.getText()!=null) {
			Bound bound = MssqlFactory.eINSTANCE.createBound();
			bound.setValue(Integer.parseInt(textColumnBound.getText()));
			column.setBound(bound);
		}
		columns.add(column);

		checkIsPrimaryKey.setSelected(false);
		textColumnName.setText("");
		textColumnBound.setText("");
		textPrimaryKeyName.setText("");
		textForeignKeyName.setText("");
		checkIncludeForeignKey.setSelected(false);
		checkIsPrimaryKey.setSelected(false);
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

	@Override
	public void changed(ObservableValue<? extends TreeItem<Object>> observable, TreeItem<Object> oldValue,
			TreeItem<Object> newValue) {
		if (newValue!=null) {
			Object value = newValue.getValue();
			if (value instanceof Column) {
				selectedFormColumn = (Column) value;
				textFormSelectedColumn.setText(selectedFormColumn.getName());
				EObject rootContainer = EcoreUtil.getRootContainer(selectedFormColumn);
				if (rootContainer instanceof MssqlManager) {
					MssqlManager manager = (MssqlManager) rootContainer;
					masterDataTable.clear();
					for (MssqlServer server : manager.getServers()) {
						masterDataTable.addAll(server.getTables());
					}
				}
			}
		}
	}

}
