/**
 */
package de.dc.emf.fx.workbench.ui.mssql;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.dc.emf.fx.workbench.ui.mssql.MssqlFactory
 * @model kind="package"
 * @generated
 */
public interface MssqlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mssql";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.frateranatis.org/emf/mssql";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mssql";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MssqlPackage eINSTANCE = de.dc.emf.fx.workbench.ui.mssql.impl.MssqlPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dc.emf.fx.workbench.ui.mssql.impl.MssqlManagerImpl <em>Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.emf.fx.workbench.ui.mssql.impl.MssqlManagerImpl
	 * @see de.dc.emf.fx.workbench.ui.mssql.impl.MssqlPackageImpl#getMssqlManager()
	 * @generated
	 */
	int MSSQL_MANAGER = 0;

	/**
	 * The feature id for the '<em><b>Servers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSSQL_MANAGER__SERVERS = 0;

	/**
	 * The feature id for the '<em><b>Users</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSSQL_MANAGER__USERS = 1;

	/**
	 * The number of structural features of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSSQL_MANAGER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSSQL_MANAGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.emf.fx.workbench.ui.mssql.impl.MssqlServerImpl <em>Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.emf.fx.workbench.ui.mssql.impl.MssqlServerImpl
	 * @see de.dc.emf.fx.workbench.ui.mssql.impl.MssqlPackageImpl#getMssqlServer()
	 * @generated
	 */
	int MSSQL_SERVER = 1;

	/**
	 * The feature id for the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSSQL_SERVER__HOSTNAME = 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSSQL_SERVER__PORT = 1;

	/**
	 * The feature id for the '<em><b>Database Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSSQL_SERVER__DATABASE_NAME = 2;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSSQL_SERVER__USER = 3;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSSQL_SERVER__TABLES = 4;

	/**
	 * The number of structural features of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSSQL_SERVER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSSQL_SERVER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.emf.fx.workbench.ui.mssql.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.emf.fx.workbench.ui.mssql.impl.TableImpl
	 * @see de.dc.emf.fx.workbench.ui.mssql.impl.MssqlPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__COLUMNS = 1;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.emf.fx.workbench.ui.mssql.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.emf.fx.workbench.ui.mssql.impl.ColumnImpl
	 * @see de.dc.emf.fx.workbench.ui.mssql.impl.MssqlPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__DATATYPE = 1;

	/**
	 * The feature id for the '<em><b>Sql Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__SQL_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Is Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__IS_NULLABLE = 3;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__PRIMARY_KEY = 4;

	/**
	 * The feature id for the '<em><b>Foreign Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__FOREIGN_KEY = 5;

	/**
	 * The feature id for the '<em><b>Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__BOUND = 6;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.emf.fx.workbench.ui.mssql.impl.BoundImpl <em>Bound</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.emf.fx.workbench.ui.mssql.impl.BoundImpl
	 * @see de.dc.emf.fx.workbench.ui.mssql.impl.MssqlPackageImpl#getBound()
	 * @generated
	 */
	int BOUND = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Bound</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Bound</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.emf.fx.workbench.ui.mssql.impl.PrimaryKeyImpl <em>Primary Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.emf.fx.workbench.ui.mssql.impl.PrimaryKeyImpl
	 * @see de.dc.emf.fx.workbench.ui.mssql.impl.MssqlPackageImpl#getPrimaryKey()
	 * @generated
	 */
	int PRIMARY_KEY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__NAME = 0;

	/**
	 * The number of structural features of the '<em>Primary Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Primary Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.emf.fx.workbench.ui.mssql.impl.ForeignKeyImpl <em>Foreign Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.emf.fx.workbench.ui.mssql.impl.ForeignKeyImpl
	 * @see de.dc.emf.fx.workbench.ui.mssql.impl.MssqlPackageImpl#getForeignKey()
	 * @generated
	 */
	int FOREIGN_KEY = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__TABLE = 1;

	/**
	 * The feature id for the '<em><b>Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__COLUMN = 2;

	/**
	 * The number of structural features of the '<em>Foreign Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Foreign Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.emf.fx.workbench.ui.mssql.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.emf.fx.workbench.ui.mssql.impl.UserImpl
	 * @see de.dc.emf.fx.workbench.ui.mssql.impl.MssqlPackageImpl#getUser()
	 * @generated
	 */
	int USER = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__PASSWORD = 1;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__EMAIL = 2;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.emf.fx.workbench.ui.mssql.SqlType <em>Sql Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.emf.fx.workbench.ui.mssql.SqlType
	 * @see de.dc.emf.fx.workbench.ui.mssql.impl.MssqlPackageImpl#getSqlType()
	 * @generated
	 */
	int SQL_TYPE = 8;

	/**
	 * Returns the meta object for class '{@link de.dc.emf.fx.workbench.ui.mssql.MssqlManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manager</em>'.
	 * @see de.dc.emf.fx.workbench.ui.mssql.MssqlManager
	 * @generated
	 */
	EClass getMssqlManager();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.emf.fx.workbench.ui.mssql.MssqlManager#getServers <em>Servers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Servers</em>'.
	 * @see de.dc.emf.fx.workbench.ui.mssql.MssqlManager#getServers()
	 * @see #getMssqlManager()
	 * @generated
	 */
	EReference getMssqlManager_Servers();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.emf.fx.workbench.ui.mssql.MssqlManager#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Users</em>'.
	 * @see de.dc.emf.fx.workbench.ui.mssql.MssqlManager#getUsers()
	 * @see #getMssqlManager()
	 * @generated
	 */
	EReference getMssqlManager_Users();

	/**
	 * Returns the meta object for class '{@link de.dc.emf.fx.workbench.ui.mssql.MssqlServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server</em>'.
	 * @see de.dc.emf.fx.workbench.ui.mssql.MssqlServer
	 * @generated
	 */
	EClass getMssqlServer();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.emf.fx.workbench.ui.mssql.MssqlServer#getHostname <em>Hostname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hostname</em>'.
	 * @see de.dc.emf.fx.workbench.ui.mssql.MssqlServer#getHostname()
	 * @see #getMssqlServer()
	 * @generated
	 */
	EAttribute getMssqlServer_Hostname();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.emf.fx.workbench.ui.mssql.MssqlServer#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see de.dc.emf.fx.workbench.ui.mssql.MssqlServer#getPort()
	 * @see #getMssqlServer()
	 * @generated
	 */
	EAttribute getMssqlServer_Port();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.emf.fx.workbench.ui.mssql.MssqlServer#getDatabaseName <em>Database Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database Name</em>'.
	 * @see de.dc.emf.fx.workbench.ui.mssql.MssqlServer#getDatabaseName()
	 * @see #getMssqlServer()
	 * @generated
	 */
	EAttribute getMssqlServer_DatabaseName();

	/**
	 * Returns the meta object for the reference '{@link de.dc.emf.fx.workbench.ui.mssql.MssqlServer#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User</em>'.
	 * @see de.dc.emf.fx.workbench.ui.mssql.MssqlServer#getUser()
	 * @see #getMssqlServer()
	 * @generated
	 */
	EReference getMssqlServer_User();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.emf.fx.workbench.ui.mssql.MssqlServer#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tables</em>'.
	 * @see de.dc.emf.fx.workbench.ui.mssql.MssqlServer#getTables()
	 * @see #getMssqlServer()
	 * @generated
	 */
	EReference getMssqlServer_Tables();

	/**
	 * Returns the meta object for class '{@link de.dc.emf.fx.workbench.ui.mssql.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see de.dc.emf.fx.workbench.ui.mssql.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.emf.fx.workbench.ui.mssql.Table#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dc.emf.fx.workbench.ui.mssql.Table#getName()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.emf.fx.workbench.ui.mssql.Table#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see de.dc.emf.fx.workbench.ui.mssql.Table#getColumns()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Columns();

	/**
	 * Returns the meta object for class '{@link de.dc.emf.fx.workbench.ui.mssql.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see de.dc.emf.fx.workbench.ui.mssql.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.emf.fx.workbench.ui.mssql.Column#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dc.emf.fx.workbench.ui.mssql.Column#getName()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.emf.fx.workbench.ui.mssql.Column#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datatype</em>'.
	 * @see de.dc.emf.fx.workbench.ui.mssql.Column#getDatatype()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Datatype();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.emf.fx.workbench.ui.mssql.Column#getSqlType <em>Sql Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sql Type</em>'.
	 * @see de.dc.emf.fx.workbench.ui.mssql.Column#getSqlType()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_SqlType();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.emf.fx.workbench.ui.mssql.Column#isIsNullable <em>Is Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Nullable</em>'.
	 * @see de.dc.emf.fx.workbench.ui.mssql.Column#isIsNullable()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_IsNullable();

	/**
	 * Returns the meta object for the containment reference '{@link de.dc.emf.fx.workbench.ui.mssql.Column#getPrimaryKey <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Primary Key</em>'.
	 * @see de.dc.emf.fx.workbench.ui.mssql.Column#getPrimaryKey()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_PrimaryKey();

	/**
	 * Returns the meta object for the containment reference '{@link de.dc.emf.fx.workbench.ui.mssql.Column#getForeignKey <em>Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Foreign Key</em>'.
	 * @see de.dc.emf.fx.workbench.ui.mssql.Column#getForeignKey()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_ForeignKey();

	/**
	 * Returns the meta object for the containment reference '{@link de.dc.emf.fx.workbench.ui.mssql.Column#getBound <em>Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bound</em>'.
	 * @see de.dc.emf.fx.workbench.ui.mssql.Column#getBound()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_Bound();

	/**
	 * Returns the meta object for class '{@link de.dc.emf.fx.workbench.ui.mssql.Bound <em>Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bound</em>'.
	 * @see de.dc.emf.fx.workbench.ui.mssql.Bound
	 * @generated
	 */
	EClass getBound();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.emf.fx.workbench.ui.mssql.Bound#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.dc.emf.fx.workbench.ui.mssql.Bound#getValue()
	 * @see #getBound()
	 * @generated
	 */
	EAttribute getBound_Value();

	/**
	 * Returns the meta object for class '{@link de.dc.emf.fx.workbench.ui.mssql.PrimaryKey <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primary Key</em>'.
	 * @see de.dc.emf.fx.workbench.ui.mssql.PrimaryKey
	 * @generated
	 */
	EClass getPrimaryKey();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.emf.fx.workbench.ui.mssql.PrimaryKey#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dc.emf.fx.workbench.ui.mssql.PrimaryKey#getName()
	 * @see #getPrimaryKey()
	 * @generated
	 */
	EAttribute getPrimaryKey_Name();

	/**
	 * Returns the meta object for class '{@link de.dc.emf.fx.workbench.ui.mssql.ForeignKey <em>Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Foreign Key</em>'.
	 * @see de.dc.emf.fx.workbench.ui.mssql.ForeignKey
	 * @generated
	 */
	EClass getForeignKey();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.emf.fx.workbench.ui.mssql.ForeignKey#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dc.emf.fx.workbench.ui.mssql.ForeignKey#getName()
	 * @see #getForeignKey()
	 * @generated
	 */
	EAttribute getForeignKey_Name();

	/**
	 * Returns the meta object for the reference '{@link de.dc.emf.fx.workbench.ui.mssql.ForeignKey#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Table</em>'.
	 * @see de.dc.emf.fx.workbench.ui.mssql.ForeignKey#getTable()
	 * @see #getForeignKey()
	 * @generated
	 */
	EReference getForeignKey_Table();

	/**
	 * Returns the meta object for the reference '{@link de.dc.emf.fx.workbench.ui.mssql.ForeignKey#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Column</em>'.
	 * @see de.dc.emf.fx.workbench.ui.mssql.ForeignKey#getColumn()
	 * @see #getForeignKey()
	 * @generated
	 */
	EReference getForeignKey_Column();

	/**
	 * Returns the meta object for class '{@link de.dc.emf.fx.workbench.ui.mssql.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see de.dc.emf.fx.workbench.ui.mssql.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.emf.fx.workbench.ui.mssql.User#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dc.emf.fx.workbench.ui.mssql.User#getName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.emf.fx.workbench.ui.mssql.User#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see de.dc.emf.fx.workbench.ui.mssql.User#getPassword()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Password();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.emf.fx.workbench.ui.mssql.User#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see de.dc.emf.fx.workbench.ui.mssql.User#getEmail()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Email();

	/**
	 * Returns the meta object for enum '{@link de.dc.emf.fx.workbench.ui.mssql.SqlType <em>Sql Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sql Type</em>'.
	 * @see de.dc.emf.fx.workbench.ui.mssql.SqlType
	 * @generated
	 */
	EEnum getSqlType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MssqlFactory getMssqlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.dc.emf.fx.workbench.ui.mssql.impl.MssqlManagerImpl <em>Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.emf.fx.workbench.ui.mssql.impl.MssqlManagerImpl
		 * @see de.dc.emf.fx.workbench.ui.mssql.impl.MssqlPackageImpl#getMssqlManager()
		 * @generated
		 */
		EClass MSSQL_MANAGER = eINSTANCE.getMssqlManager();

		/**
		 * The meta object literal for the '<em><b>Servers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSSQL_MANAGER__SERVERS = eINSTANCE.getMssqlManager_Servers();

		/**
		 * The meta object literal for the '<em><b>Users</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSSQL_MANAGER__USERS = eINSTANCE.getMssqlManager_Users();

		/**
		 * The meta object literal for the '{@link de.dc.emf.fx.workbench.ui.mssql.impl.MssqlServerImpl <em>Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.emf.fx.workbench.ui.mssql.impl.MssqlServerImpl
		 * @see de.dc.emf.fx.workbench.ui.mssql.impl.MssqlPackageImpl#getMssqlServer()
		 * @generated
		 */
		EClass MSSQL_SERVER = eINSTANCE.getMssqlServer();

		/**
		 * The meta object literal for the '<em><b>Hostname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MSSQL_SERVER__HOSTNAME = eINSTANCE.getMssqlServer_Hostname();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MSSQL_SERVER__PORT = eINSTANCE.getMssqlServer_Port();

		/**
		 * The meta object literal for the '<em><b>Database Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MSSQL_SERVER__DATABASE_NAME = eINSTANCE.getMssqlServer_DatabaseName();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSSQL_SERVER__USER = eINSTANCE.getMssqlServer_User();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSSQL_SERVER__TABLES = eINSTANCE.getMssqlServer_Tables();

		/**
		 * The meta object literal for the '{@link de.dc.emf.fx.workbench.ui.mssql.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.emf.fx.workbench.ui.mssql.impl.TableImpl
		 * @see de.dc.emf.fx.workbench.ui.mssql.impl.MssqlPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__NAME = eINSTANCE.getTable_Name();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__COLUMNS = eINSTANCE.getTable_Columns();

		/**
		 * The meta object literal for the '{@link de.dc.emf.fx.workbench.ui.mssql.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.emf.fx.workbench.ui.mssql.impl.ColumnImpl
		 * @see de.dc.emf.fx.workbench.ui.mssql.impl.MssqlPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__NAME = eINSTANCE.getColumn_Name();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__DATATYPE = eINSTANCE.getColumn_Datatype();

		/**
		 * The meta object literal for the '<em><b>Sql Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__SQL_TYPE = eINSTANCE.getColumn_SqlType();

		/**
		 * The meta object literal for the '<em><b>Is Nullable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__IS_NULLABLE = eINSTANCE.getColumn_IsNullable();

		/**
		 * The meta object literal for the '<em><b>Primary Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN__PRIMARY_KEY = eINSTANCE.getColumn_PrimaryKey();

		/**
		 * The meta object literal for the '<em><b>Foreign Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN__FOREIGN_KEY = eINSTANCE.getColumn_ForeignKey();

		/**
		 * The meta object literal for the '<em><b>Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN__BOUND = eINSTANCE.getColumn_Bound();

		/**
		 * The meta object literal for the '{@link de.dc.emf.fx.workbench.ui.mssql.impl.BoundImpl <em>Bound</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.emf.fx.workbench.ui.mssql.impl.BoundImpl
		 * @see de.dc.emf.fx.workbench.ui.mssql.impl.MssqlPackageImpl#getBound()
		 * @generated
		 */
		EClass BOUND = eINSTANCE.getBound();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUND__VALUE = eINSTANCE.getBound_Value();

		/**
		 * The meta object literal for the '{@link de.dc.emf.fx.workbench.ui.mssql.impl.PrimaryKeyImpl <em>Primary Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.emf.fx.workbench.ui.mssql.impl.PrimaryKeyImpl
		 * @see de.dc.emf.fx.workbench.ui.mssql.impl.MssqlPackageImpl#getPrimaryKey()
		 * @generated
		 */
		EClass PRIMARY_KEY = eINSTANCE.getPrimaryKey();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMARY_KEY__NAME = eINSTANCE.getPrimaryKey_Name();

		/**
		 * The meta object literal for the '{@link de.dc.emf.fx.workbench.ui.mssql.impl.ForeignKeyImpl <em>Foreign Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.emf.fx.workbench.ui.mssql.impl.ForeignKeyImpl
		 * @see de.dc.emf.fx.workbench.ui.mssql.impl.MssqlPackageImpl#getForeignKey()
		 * @generated
		 */
		EClass FOREIGN_KEY = eINSTANCE.getForeignKey();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOREIGN_KEY__NAME = eINSTANCE.getForeignKey_Name();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_KEY__TABLE = eINSTANCE.getForeignKey_Table();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_KEY__COLUMN = eINSTANCE.getForeignKey_Column();

		/**
		 * The meta object literal for the '{@link de.dc.emf.fx.workbench.ui.mssql.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.emf.fx.workbench.ui.mssql.impl.UserImpl
		 * @see de.dc.emf.fx.workbench.ui.mssql.impl.MssqlPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__NAME = eINSTANCE.getUser_Name();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__PASSWORD = eINSTANCE.getUser_Password();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__EMAIL = eINSTANCE.getUser_Email();

		/**
		 * The meta object literal for the '{@link de.dc.emf.fx.workbench.ui.mssql.SqlType <em>Sql Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.emf.fx.workbench.ui.mssql.SqlType
		 * @see de.dc.emf.fx.workbench.ui.mssql.impl.MssqlPackageImpl#getSqlType()
		 * @generated
		 */
		EEnum SQL_TYPE = eINSTANCE.getSqlType();

	}

} //MssqlPackage
