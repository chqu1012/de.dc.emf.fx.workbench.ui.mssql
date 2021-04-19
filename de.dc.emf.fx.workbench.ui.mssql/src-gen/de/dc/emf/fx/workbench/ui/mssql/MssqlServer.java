/**
 */
package de.dc.emf.fx.workbench.ui.mssql;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.emf.fx.workbench.ui.mssql.MssqlServer#getHostname <em>Hostname</em>}</li>
 *   <li>{@link de.dc.emf.fx.workbench.ui.mssql.MssqlServer#getPort <em>Port</em>}</li>
 *   <li>{@link de.dc.emf.fx.workbench.ui.mssql.MssqlServer#getDatabaseName <em>Database Name</em>}</li>
 *   <li>{@link de.dc.emf.fx.workbench.ui.mssql.MssqlServer#getUser <em>User</em>}</li>
 *   <li>{@link de.dc.emf.fx.workbench.ui.mssql.MssqlServer#getTables <em>Tables</em>}</li>
 * </ul>
 *
 * @see de.dc.emf.fx.workbench.ui.mssql.MssqlPackage#getMssqlServer()
 * @model
 * @generated
 */
public interface MssqlServer extends EObject {
	/**
	 * Returns the value of the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hostname</em>' attribute.
	 * @see #setHostname(String)
	 * @see de.dc.emf.fx.workbench.ui.mssql.MssqlPackage#getMssqlServer_Hostname()
	 * @model unique="false"
	 * @generated
	 */
	String getHostname();

	/**
	 * Sets the value of the '{@link de.dc.emf.fx.workbench.ui.mssql.MssqlServer#getHostname <em>Hostname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hostname</em>' attribute.
	 * @see #getHostname()
	 * @generated
	 */
	void setHostname(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(String)
	 * @see de.dc.emf.fx.workbench.ui.mssql.MssqlPackage#getMssqlServer_Port()
	 * @model unique="false"
	 * @generated
	 */
	String getPort();

	/**
	 * Sets the value of the '{@link de.dc.emf.fx.workbench.ui.mssql.MssqlServer#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(String value);

	/**
	 * Returns the value of the '<em><b>Database Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Name</em>' attribute.
	 * @see #setDatabaseName(String)
	 * @see de.dc.emf.fx.workbench.ui.mssql.MssqlPackage#getMssqlServer_DatabaseName()
	 * @model unique="false"
	 * @generated
	 */
	String getDatabaseName();

	/**
	 * Sets the value of the '{@link de.dc.emf.fx.workbench.ui.mssql.MssqlServer#getDatabaseName <em>Database Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Name</em>' attribute.
	 * @see #getDatabaseName()
	 * @generated
	 */
	void setDatabaseName(String value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' reference.
	 * @see #setUser(User)
	 * @see de.dc.emf.fx.workbench.ui.mssql.MssqlPackage#getMssqlServer_User()
	 * @model
	 * @generated
	 */
	User getUser();

	/**
	 * Sets the value of the '{@link de.dc.emf.fx.workbench.ui.mssql.MssqlServer#getUser <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(User value);

	/**
	 * Returns the value of the '<em><b>Tables</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.emf.fx.workbench.ui.mssql.Table}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tables</em>' containment reference list.
	 * @see de.dc.emf.fx.workbench.ui.mssql.MssqlPackage#getMssqlServer_Tables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Table> getTables();

} // MssqlServer
