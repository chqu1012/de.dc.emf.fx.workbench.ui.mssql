/**
 */
package de.dc.emf.fx.workbench.ui.mssql;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.emf.fx.workbench.ui.mssql.MssqlManager#getServers <em>Servers</em>}</li>
 *   <li>{@link de.dc.emf.fx.workbench.ui.mssql.MssqlManager#getUsers <em>Users</em>}</li>
 * </ul>
 *
 * @see de.dc.emf.fx.workbench.ui.mssql.MssqlPackage#getMssqlManager()
 * @model
 * @generated
 */
public interface MssqlManager extends EObject {
	/**
	 * Returns the value of the '<em><b>Servers</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.emf.fx.workbench.ui.mssql.MssqlServer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servers</em>' containment reference list.
	 * @see de.dc.emf.fx.workbench.ui.mssql.MssqlPackage#getMssqlManager_Servers()
	 * @model containment="true"
	 * @generated
	 */
	EList<MssqlServer> getServers();

	/**
	 * Returns the value of the '<em><b>Users</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.emf.fx.workbench.ui.mssql.User}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Users</em>' containment reference list.
	 * @see de.dc.emf.fx.workbench.ui.mssql.MssqlPackage#getMssqlManager_Users()
	 * @model containment="true"
	 * @generated
	 */
	EList<User> getUsers();

} // MssqlManager
