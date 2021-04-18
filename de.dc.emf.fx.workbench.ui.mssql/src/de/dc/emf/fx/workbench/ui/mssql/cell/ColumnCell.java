package de.dc.emf.fx.workbench.ui.mssql.cell;
import java.io.IOException;
import java.util.Arrays;

import de.dc.emf.fx.workbench.ui.mssql.Column;
import de.dc.emf.fx.workbench.ui.mssql.MssqlFactory;
import de.dc.emf.fx.workbench.ui.mssql.SqlType;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListCell;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class ColumnCell extends ListCell<Column> {

    @FXML
    protected HBox root;

    @FXML
    protected TextField textName;

    @FXML
    protected ComboBox<String> comboDatatype;

    @FXML
    protected ComboBox<SqlType> comboSqlType;

    @FXML
    protected CheckBox buttonNullable;

    @FXML
    protected CheckBox buttonPrimaryKey;

    private FXMLLoader mLLoader;

    @Override
    protected void updateItem(Column item, boolean empty) {
        super.updateItem(item, empty);
        if(empty || item == null) {
            setText(null);
            setGraphic(null);

        } else {
            if (mLLoader == null) {
                mLLoader = new FXMLLoader(getClass().getResource("/de/dc/emf/fx/workbench/ui/mssql/ColumnListCell.fxml"));
                mLLoader.setController(this);

                try {
                    mLLoader.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

            textName.setText(item.getName());
            buttonNullable.setSelected(item.isIsNullable());
            buttonPrimaryKey.setSelected(item.getPrimaryKey()!=null);
            
            comboSqlType.setItems(FXCollections.observableArrayList(SqlType.values()));
    		comboSqlType.getSelectionModel().select(item.getSqlType());

    		comboDatatype.setItems(FXCollections.observableArrayList(Arrays.asList("String", "Integer", "LocalDateTime", "LocalDate", "Double", "Float", "Clob", "Blob")));
    		comboDatatype.getSelectionModel().select(item.getDatatype());
    		comboDatatype.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
    			@Override
    			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
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
    		});
            
            setText(null);
            setGraphic(root);
        }

    }
    
    @FXML
    public void onButtonAcceptAction(ActionEvent e) {
    	getItem().setName(textName.getText());
    	getItem().setDatatype(comboDatatype.getSelectionModel().getSelectedItem());
    	getItem().setSqlType(comboSqlType.getSelectionModel().getSelectedItem());
    	getItem().setPrimaryKey(buttonPrimaryKey.isSelected()? MssqlFactory.eINSTANCE.createPrimaryKey() : null);
    	getItem().setIsNullable(buttonNullable.isSelected());
    }
}