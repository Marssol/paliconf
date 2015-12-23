/**
 */
package fr.imag.mosig.seacs.roboconf.graphDsl.impl;

import fr.imag.mosig.seacs.roboconf.graphDsl.ComponentProperties;
import fr.imag.mosig.seacs.roboconf.graphDsl.GraphDslPackage;
import fr.imag.mosig.seacs.roboconf.graphDsl.InstallerProperty;
import fr.imag.mosig.seacs.roboconf.graphDsl.OptionalProperty;

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
 * An implementation of the model object '<em><b>Component Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.imag.mosig.seacs.roboconf.graphDsl.impl.ComponentPropertiesImpl#getOptionalProperties <em>Optional Properties</em>}</li>
 *   <li>{@link fr.imag.mosig.seacs.roboconf.graphDsl.impl.ComponentPropertiesImpl#getInstallerProperty <em>Installer Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentPropertiesImpl extends MinimalEObjectImpl.Container implements ComponentProperties
{
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
   * The cached value of the '{@link #getInstallerProperty() <em>Installer Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstallerProperty()
   * @generated
   * @ordered
   */
  protected InstallerProperty installerProperty;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComponentPropertiesImpl()
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
    return GraphDslPackage.Literals.COMPONENT_PROPERTIES;
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
      optionalProperties = new EObjectContainmentEList<OptionalProperty>(OptionalProperty.class, this, GraphDslPackage.COMPONENT_PROPERTIES__OPTIONAL_PROPERTIES);
    }
    return optionalProperties;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphDslPackage.COMPONENT_PROPERTIES__INSTALLER_PROPERTY, oldInstallerProperty, newInstallerProperty);
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
        msgs = ((InternalEObject)installerProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraphDslPackage.COMPONENT_PROPERTIES__INSTALLER_PROPERTY, null, msgs);
      if (newInstallerProperty != null)
        msgs = ((InternalEObject)newInstallerProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraphDslPackage.COMPONENT_PROPERTIES__INSTALLER_PROPERTY, null, msgs);
      msgs = basicSetInstallerProperty(newInstallerProperty, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraphDslPackage.COMPONENT_PROPERTIES__INSTALLER_PROPERTY, newInstallerProperty, newInstallerProperty));
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
      case GraphDslPackage.COMPONENT_PROPERTIES__OPTIONAL_PROPERTIES:
        return ((InternalEList<?>)getOptionalProperties()).basicRemove(otherEnd, msgs);
      case GraphDslPackage.COMPONENT_PROPERTIES__INSTALLER_PROPERTY:
        return basicSetInstallerProperty(null, msgs);
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
      case GraphDslPackage.COMPONENT_PROPERTIES__OPTIONAL_PROPERTIES:
        return getOptionalProperties();
      case GraphDslPackage.COMPONENT_PROPERTIES__INSTALLER_PROPERTY:
        return getInstallerProperty();
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
      case GraphDslPackage.COMPONENT_PROPERTIES__OPTIONAL_PROPERTIES:
        getOptionalProperties().clear();
        getOptionalProperties().addAll((Collection<? extends OptionalProperty>)newValue);
        return;
      case GraphDslPackage.COMPONENT_PROPERTIES__INSTALLER_PROPERTY:
        setInstallerProperty((InstallerProperty)newValue);
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
      case GraphDslPackage.COMPONENT_PROPERTIES__OPTIONAL_PROPERTIES:
        getOptionalProperties().clear();
        return;
      case GraphDslPackage.COMPONENT_PROPERTIES__INSTALLER_PROPERTY:
        setInstallerProperty((InstallerProperty)null);
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
      case GraphDslPackage.COMPONENT_PROPERTIES__OPTIONAL_PROPERTIES:
        return optionalProperties != null && !optionalProperties.isEmpty();
      case GraphDslPackage.COMPONENT_PROPERTIES__INSTALLER_PROPERTY:
        return installerProperty != null;
    }
    return super.eIsSet(featureID);
  }

} //ComponentPropertiesImpl
