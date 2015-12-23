/**
 */
package fr.imag.mosig.seacs.roboconf.graphDsl.impl;

import fr.imag.mosig.seacs.roboconf.graphDsl.GraphDslPackage;
import fr.imag.mosig.seacs.roboconf.graphDsl.InstallerProperty;
import fr.imag.mosig.seacs.roboconf.graphDsl.OptionalProperty;
import fr.imag.mosig.seacs.roboconf.graphDsl.Properties;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.imag.mosig.seacs.roboconf.graphDsl.impl.PropertiesImpl#getInstallerProperty <em>Installer Property</em>}</li>
 *   <li>{@link fr.imag.mosig.seacs.roboconf.graphDsl.impl.PropertiesImpl#getOptionalProperties <em>Optional Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertiesImpl extends MinimalEObjectImpl.Container implements Properties
{
  /**
   * The cached value of the '{@link #getInstallerProperty() <em>Installer Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstallerProperty()
   * @generated
   * @ordered
   */
  protected InstallerProperty installerProperty;

  /**
   * The cached value of the '{@link #getOptionalProperties() <em>Optional Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOptionalProperties()
   * @generated
   * @ordered
   */
  protected EList<OptionalProperty> optionalProperties;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PropertiesImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GraphDslPackage.Literals.PROPERTIES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InstallerProperty getInstallerProperty()
  {
    return installerProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInstallerProperty(InstallerProperty newInstallerProperty, NotificationChain msgs)
  {
    InstallerProperty oldInstallerProperty = installerProperty;
    installerProperty = newInstallerProperty;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphDslPackage.PROPERTIES__INSTALLER_PROPERTY, oldInstallerProperty, newInstallerProperty);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInstallerProperty(InstallerProperty newInstallerProperty)
  {
    if (newInstallerProperty != installerProperty)
    {
      NotificationChain msgs = null;
      if (installerProperty != null)
        msgs = ((InternalEObject)installerProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraphDslPackage.PROPERTIES__INSTALLER_PROPERTY, null, msgs);
      if (newInstallerProperty != null)
        msgs = ((InternalEObject)newInstallerProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraphDslPackage.PROPERTIES__INSTALLER_PROPERTY, null, msgs);
      msgs = basicSetInstallerProperty(newInstallerProperty, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraphDslPackage.PROPERTIES__INSTALLER_PROPERTY, newInstallerProperty, newInstallerProperty));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<OptionalProperty> getOptionalProperties()
  {
    if (optionalProperties == null)
    {
      optionalProperties = new EObjectContainmentEList<OptionalProperty>(OptionalProperty.class, this, GraphDslPackage.PROPERTIES__OPTIONAL_PROPERTIES);
    }
    return optionalProperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case GraphDslPackage.PROPERTIES__INSTALLER_PROPERTY:
        return basicSetInstallerProperty(null, msgs);
      case GraphDslPackage.PROPERTIES__OPTIONAL_PROPERTIES:
        return ((InternalEList<?>)getOptionalProperties()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GraphDslPackage.PROPERTIES__INSTALLER_PROPERTY:
        return getInstallerProperty();
      case GraphDslPackage.PROPERTIES__OPTIONAL_PROPERTIES:
        return getOptionalProperties();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GraphDslPackage.PROPERTIES__INSTALLER_PROPERTY:
        setInstallerProperty((InstallerProperty)newValue);
        return;
      case GraphDslPackage.PROPERTIES__OPTIONAL_PROPERTIES:
        getOptionalProperties().clear();
        getOptionalProperties().addAll((Collection<? extends OptionalProperty>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GraphDslPackage.PROPERTIES__INSTALLER_PROPERTY:
        setInstallerProperty((InstallerProperty)null);
        return;
      case GraphDslPackage.PROPERTIES__OPTIONAL_PROPERTIES:
        getOptionalProperties().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GraphDslPackage.PROPERTIES__INSTALLER_PROPERTY:
        return installerProperty != null;
      case GraphDslPackage.PROPERTIES__OPTIONAL_PROPERTIES:
        return optionalProperties != null && !optionalProperties.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PropertiesImpl
