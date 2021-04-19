/**
 */
package de.dc.emf.fx.workbench.ui.mssql.impl;

import de.dc.emf.fx.workbench.ui.mssql.MssqlManager;
import de.dc.emf.fx.workbench.ui.mssql.MssqlPackage;
import de.dc.emf.fx.workbench.ui.mssql.MssqlServer;
import de.dc.emf.fx.workbench.ui.mssql.User;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.emf.fx.workbench.ui.mssql.impl.MssqlManagerImpl#getServers <em>Servers</em>}</li>
 *   <li>{@link de.dc.emf.fx.workbench.ui.mssql.impl.MssqlManagerImpl#getUsers <em>Users</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MssqlManagerImpl extends MinimalEObjectImpl.Container implements MssqlManager {
	/**
	 * The cached value of the '{@link #getServers() <em>Servers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServers()
	 * @generated
	 * @ordered
	 */
	protected EList<MssqlServer> servers;

	/**
	 * The cached value of the '{@link #getUsers() <em>Users</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsers()
	 * @generated
	 * @ordered
	 */
	protected EList<User> users;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MssqlManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MssqlPackage.Literals.MSSQL_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MssqlServer> getServers() {
		if (servers == null) {
			servers = new EObjectContainmentEList<MssqlServer>(MssqlServer.class, this,
					MssqlPackage.MSSQL_MANAGER__SERVERS);
		}
		return servers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<User> getUsers() {
		if (users == null) {
			users = new EObjectContainmentEList<User>(User.class, this, MssqlPackage.MSSQL_MANAGER__USERS);
		}
		return users;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MssqlPackage.MSSQL_MANAGER__SERVERS:
			return ((InternalEList<?>) getServers()).basicRemove(otherEnd, msgs);
		case MssqlPackage.MSSQL_MANAGER__USERS:
			return ((InternalEList<?>) getUsers()).basicRemove(otherEnd, msgs);
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
		case MssqlPackage.MSSQL_MANAGER__SERVERS:
			return getServers();
		case MssqlPackage.MSSQL_MANAGER__USERS:
			return getUsers();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MssqlPackage.MSSQL_MANAGER__SERVERS:
			getServers().clear();
			getServers().addAll((Collection<? extends MssqlServer>) newValue);
			return;
		case MssqlPackage.MSSQL_MANAGER__USERS:
			getUsers().clear();
			getUsers().addAll((Collection<? extends User>) newValue);
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
		case MssqlPackage.MSSQL_MANAGER__SERVERS:
			getServers().clear();
			return;
		case MssqlPackage.MSSQL_MANAGER__USERS:
			getUsers().clear();
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
		case MssqlPackage.MSSQL_MANAGER__SERVERS:
			return servers != null && !servers.isEmpty();
		case MssqlPackage.MSSQL_MANAGER__USERS:
			return users != null && !users.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MssqlManagerImpl
