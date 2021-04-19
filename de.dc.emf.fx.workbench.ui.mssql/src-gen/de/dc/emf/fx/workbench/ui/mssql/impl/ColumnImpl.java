/**
 */
package de.dc.emf.fx.workbench.ui.mssql.impl;

import de.dc.emf.fx.workbench.ui.mssql.Column;
import de.dc.emf.fx.workbench.ui.mssql.MssqlPackage;
import de.dc.emf.fx.workbench.ui.mssql.PrimaryKey;
import de.dc.emf.fx.workbench.ui.mssql.SqlType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.emf.fx.workbench.ui.mssql.impl.ColumnImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.emf.fx.workbench.ui.mssql.impl.ColumnImpl#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link de.dc.emf.fx.workbench.ui.mssql.impl.ColumnImpl#getSqlType <em>Sql Type</em>}</li>
 *   <li>{@link de.dc.emf.fx.workbench.ui.mssql.impl.ColumnImpl#getPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link de.dc.emf.fx.workbench.ui.mssql.impl.ColumnImpl#isIsNullable <em>Is Nullable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColumnImpl extends MinimalEObjectImpl.Container implements Column {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatatype() <em>Datatype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatatype()
	 * @generated
	 * @ordered
	 */
	protected static final String DATATYPE_EDEFAULT = "String";

	/**
	 * The cached value of the '{@link #getDatatype() <em>Datatype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatatype()
	 * @generated
	 * @ordered
	 */
	protected String datatype = DATATYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSqlType() <em>Sql Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSqlType()
	 * @generated
	 * @ordered
	 */
	protected static final SqlType SQL_TYPE_EDEFAULT = SqlType.VARCHAR;

	/**
	 * The cached value of the '{@link #getSqlType() <em>Sql Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSqlType()
	 * @generated
	 * @ordered
	 */
	protected SqlType sqlType = SQL_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPrimaryKey() <em>Primary Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryKey()
	 * @generated
	 * @ordered
	 */
	protected PrimaryKey primaryKey;

	/**
	 * The default value of the '{@link #isIsNullable() <em>Is Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNullable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_NULLABLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsNullable() <em>Is Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNullable()
	 * @generated
	 * @ordered
	 */
	protected boolean isNullable = IS_NULLABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MssqlPackage.Literals.COLUMN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MssqlPackage.COLUMN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDatatype() {
		return datatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatatype(String newDatatype) {
		String oldDatatype = datatype;
		datatype = newDatatype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MssqlPackage.COLUMN__DATATYPE, oldDatatype,
					datatype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SqlType getSqlType() {
		return sqlType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSqlType(SqlType newSqlType) {
		SqlType oldSqlType = sqlType;
		sqlType = newSqlType == null ? SQL_TYPE_EDEFAULT : newSqlType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MssqlPackage.COLUMN__SQL_TYPE, oldSqlType, sqlType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimaryKey getPrimaryKey() {
		return primaryKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrimaryKey(PrimaryKey newPrimaryKey, NotificationChain msgs) {
		PrimaryKey oldPrimaryKey = primaryKey;
		primaryKey = newPrimaryKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MssqlPackage.COLUMN__PRIMARY_KEY, oldPrimaryKey, newPrimaryKey);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimaryKey(PrimaryKey newPrimaryKey) {
		if (newPrimaryKey != primaryKey) {
			NotificationChain msgs = null;
			if (primaryKey != null)
				msgs = ((InternalEObject) primaryKey).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MssqlPackage.COLUMN__PRIMARY_KEY, null, msgs);
			if (newPrimaryKey != null)
				msgs = ((InternalEObject) newPrimaryKey).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MssqlPackage.COLUMN__PRIMARY_KEY, null, msgs);
			msgs = basicSetPrimaryKey(newPrimaryKey, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MssqlPackage.COLUMN__PRIMARY_KEY, newPrimaryKey,
					newPrimaryKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsNullable() {
		return isNullable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsNullable(boolean newIsNullable) {
		boolean oldIsNullable = isNullable;
		isNullable = newIsNullable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MssqlPackage.COLUMN__IS_NULLABLE, oldIsNullable,
					isNullable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MssqlPackage.COLUMN__PRIMARY_KEY:
			return basicSetPrimaryKey(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MssqlPackage.COLUMN__NAME:
			return getName();
		case MssqlPackage.COLUMN__DATATYPE:
			return getDatatype();
		case MssqlPackage.COLUMN__SQL_TYPE:
			return getSqlType();
		case MssqlPackage.COLUMN__PRIMARY_KEY:
			return getPrimaryKey();
		case MssqlPackage.COLUMN__IS_NULLABLE:
			return isIsNullable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MssqlPackage.COLUMN__NAME:
			setName((String) newValue);
			return;
		case MssqlPackage.COLUMN__DATATYPE:
			setDatatype((String) newValue);
			return;
		case MssqlPackage.COLUMN__SQL_TYPE:
			setSqlType((SqlType) newValue);
			return;
		case MssqlPackage.COLUMN__PRIMARY_KEY:
			setPrimaryKey((PrimaryKey) newValue);
			return;
		case MssqlPackage.COLUMN__IS_NULLABLE:
			setIsNullable((Boolean) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case MssqlPackage.COLUMN__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MssqlPackage.COLUMN__DATATYPE:
			setDatatype(DATATYPE_EDEFAULT);
			return;
		case MssqlPackage.COLUMN__SQL_TYPE:
			setSqlType(SQL_TYPE_EDEFAULT);
			return;
		case MssqlPackage.COLUMN__PRIMARY_KEY:
			setPrimaryKey((PrimaryKey) null);
			return;
		case MssqlPackage.COLUMN__IS_NULLABLE:
			setIsNullable(IS_NULLABLE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MssqlPackage.COLUMN__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MssqlPackage.COLUMN__DATATYPE:
			return DATATYPE_EDEFAULT == null ? datatype != null : !DATATYPE_EDEFAULT.equals(datatype);
		case MssqlPackage.COLUMN__SQL_TYPE:
			return sqlType != SQL_TYPE_EDEFAULT;
		case MssqlPackage.COLUMN__PRIMARY_KEY:
			return primaryKey != null;
		case MssqlPackage.COLUMN__IS_NULLABLE:
			return isNullable != IS_NULLABLE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", datatype: ");
		result.append(datatype);
		result.append(", sqlType: ");
		result.append(sqlType);
		result.append(", isNullable: ");
		result.append(isNullable);
		result.append(')');
		return result.toString();
	}

} //ColumnImpl
