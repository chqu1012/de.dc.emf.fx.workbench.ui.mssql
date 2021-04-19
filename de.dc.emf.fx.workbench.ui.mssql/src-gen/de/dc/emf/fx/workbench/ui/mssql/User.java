/**
 */
package de.dc.emf.fx.workbench.ui.mssql;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.emf.fx.workbench.ui.mssql.User#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.emf.fx.workbench.ui.mssql.User#getPassword <em>Password</em>}</li>
 *   <li>{@link de.dc.emf.fx.workbench.ui.mssql.User#getEmail <em>Email</em>}</li>
 * </ul>
 *
 * @see de.dc.emf.fx.workbench.ui.mssql.MssqlPackage#getUser()
 * @model
 * @generated
 */
public interface User extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.dc.emf.fx.workbench.ui.mssql.MssqlPackage#getUser_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.dc.emf.fx.workbench.ui.mssql.User#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see de.dc.emf.fx.workbench.ui.mssql.MssqlPackage#getUser_Password()
	 * @model unique="false"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link de.dc.emf.fx.workbench.ui.mssql.User#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see de.dc.emf.fx.workbench.ui.mssql.MssqlPackage#getUser_Email()
	 * @model unique="false"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link de.dc.emf.fx.workbench.ui.mssql.User#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

} // User
