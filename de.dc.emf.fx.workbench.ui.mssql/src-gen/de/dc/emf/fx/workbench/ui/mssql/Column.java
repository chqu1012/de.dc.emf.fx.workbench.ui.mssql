/**
 */
package de.dc.emf.fx.workbench.ui.mssql;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.emf.fx.workbench.ui.mssql.Column#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.emf.fx.workbench.ui.mssql.Column#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link de.dc.emf.fx.workbench.ui.mssql.Column#getSqlType <em>Sql Type</em>}</li>
 *   <li>{@link de.dc.emf.fx.workbench.ui.mssql.Column#getPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link de.dc.emf.fx.workbench.ui.mssql.Column#isIsNullable <em>Is Nullable</em>}</li>
 * </ul>
 *
 * @see de.dc.emf.fx.workbench.ui.mssql.MssqlPackage#getColumn()
 * @model
 * @generated
 */
public interface Column extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.dc.emf.fx.workbench.ui.mssql.MssqlPackage#getColumn_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.dc.emf.fx.workbench.ui.mssql.Column#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Datatype</b></em>' attribute.
	 * The default value is <code>"String"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatype</em>' attribute.
	 * @see #setDatatype(String)
	 * @see de.dc.emf.fx.workbench.ui.mssql.MssqlPackage#getColumn_Datatype()
	 * @model default="String" unique="false"
	 * @generated
	 */
	String getDatatype();

	/**
	 * Sets the value of the '{@link de.dc.emf.fx.workbench.ui.mssql.Column#getDatatype <em>Datatype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype</em>' attribute.
	 * @see #getDatatype()
	 * @generated
	 */
	void setDatatype(String value);

	/**
	 * Returns the value of the '<em><b>Sql Type</b></em>' attribute.
	 * The default value is <code>"VARCHAR"</code>.
	 * The literals are from the enumeration {@link de.dc.emf.fx.workbench.ui.mssql.SqlType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sql Type</em>' attribute.
	 * @see de.dc.emf.fx.workbench.ui.mssql.SqlType
	 * @see #setSqlType(SqlType)
	 * @see de.dc.emf.fx.workbench.ui.mssql.MssqlPackage#getColumn_SqlType()
	 * @model default="VARCHAR" unique="false"
	 * @generated
	 */
	SqlType getSqlType();

	/**
	 * Sets the value of the '{@link de.dc.emf.fx.workbench.ui.mssql.Column#getSqlType <em>Sql Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sql Type</em>' attribute.
	 * @see de.dc.emf.fx.workbench.ui.mssql.SqlType
	 * @see #getSqlType()
	 * @generated
	 */
	void setSqlType(SqlType value);

	/**
	 * Returns the value of the '<em><b>Primary Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Key</em>' containment reference.
	 * @see #setPrimaryKey(PrimaryKey)
	 * @see de.dc.emf.fx.workbench.ui.mssql.MssqlPackage#getColumn_PrimaryKey()
	 * @model containment="true"
	 * @generated
	 */
	PrimaryKey getPrimaryKey();

	/**
	 * Sets the value of the '{@link de.dc.emf.fx.workbench.ui.mssql.Column#getPrimaryKey <em>Primary Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Key</em>' containment reference.
	 * @see #getPrimaryKey()
	 * @generated
	 */
	void setPrimaryKey(PrimaryKey value);

	/**
	 * Returns the value of the '<em><b>Is Nullable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Nullable</em>' attribute.
	 * @see #setIsNullable(boolean)
	 * @see de.dc.emf.fx.workbench.ui.mssql.MssqlPackage#getColumn_IsNullable()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isIsNullable();

	/**
	 * Sets the value of the '{@link de.dc.emf.fx.workbench.ui.mssql.Column#isIsNullable <em>Is Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Nullable</em>' attribute.
	 * @see #isIsNullable()
	 * @generated
	 */
	void setIsNullable(boolean value);

} // Column
