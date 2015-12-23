/**
 */
package fr.imag.mosig.seacs.roboconf.graphDsl.impl;

import fr.imag.mosig.seacs.roboconf.graphDsl.GraphDslPackage;
import fr.imag.mosig.seacs.roboconf.graphDsl.ImportsVariable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Imports Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.imag.mosig.seacs.roboconf.graphDsl.impl.ImportsVariableImpl#isIsExternal <em>Is External</em>}</li>
 *   <li>{@link fr.imag.mosig.seacs.roboconf.graphDsl.impl.ImportsVariableImpl#getComponentName <em>Component Name</em>}</li>
 *   <li>{@link fr.imag.mosig.seacs.roboconf.graphDsl.impl.ImportsVariableImpl#getComponentProperty <em>Component Property</em>}</li>
 *   <li>{@link fr.imag.mosig.seacs.roboconf.graphDsl.impl.ImportsVariableImpl#isIsOptional <em>Is Optional</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImportsVariableImpl extends MinimalEObjectImpl.Container implements ImportsVariable
{
  /**
   * The default value of the '{@link #isIsExternal() <em>Is External</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsExternal()
   * @generated
   * @ordered
   */
  protected static final boolean IS_EXTERNAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsExternal() <em>Is External</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsExternal()
   * @generated
   * @ordered
   */
  protected boolean isExternal = IS_EXTERNAL_EDEFAULT;

  /**
   * The default value of the '{@link #getComponentName() <em>Component Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponentName()
   * @generated
   * @ordered
   */
  protected static final String COMPONENT_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getComponentName() <em>Component Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponentName()
   * @generated
   * @ordered
   */
  protected String componentName = COMPONENT_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getComponentProperty() <em>Component Property</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponentProperty()
   * @generated
   * @ordered
   */
  protected static final String COMPONENT_PROPERTY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getComponentProperty() <em>Component Property</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponentProperty()
   * @generated
   * @ordered
   */
  protected String componentProperty = COMPONENT_PROPERTY_EDEFAULT;

  /**
   * The default value of the '{@link #isIsOptional() <em>Is Optional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsOptional()
   * @generated
   * @ordered
   */
  protected static final boolean IS_OPTIONAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsOptional() <em>Is Optional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsOptional()
   * @generated
   * @ordered
   */
  protected boolean isOptional = IS_OPTIONAL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ImportsVariableImpl()
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
    return GraphDslPackage.Literals.IMPORTS_VARIABLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsExternal()
  {
    return isExternal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsExternal(boolean newIsExternal)
  {
    boolean oldIsExternal = isExternal;
    isExternal = newIsExternal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraphDslPackage.IMPORTS_VARIABLE__IS_EXTERNAL, oldIsExternal, isExternal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getComponentName()
  {
    return componentName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComponentName(String newComponentName)
  {
    String oldComponentName = componentName;
    componentName = newComponentName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraphDslPackage.IMPORTS_VARIABLE__COMPONENT_NAME, oldComponentName, componentName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getComponentProperty()
  {
    return componentProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComponentProperty(String newComponentProperty)
  {
    String oldComponentProperty = componentProperty;
    componentProperty = newComponentProperty;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraphDslPackage.IMPORTS_VARIABLE__COMPONENT_PROPERTY, oldComponentProperty, componentProperty));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsOptional()
  {
    return isOptional;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsOptional(boolean newIsOptional)
  {
    boolean oldIsOptional = isOptional;
    isOptional = newIsOptional;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraphDslPackage.IMPORTS_VARIABLE__IS_OPTIONAL, oldIsOptional, isOptional));
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
      case GraphDslPackage.IMPORTS_VARIABLE__IS_EXTERNAL:
        return isIsExternal();
      case GraphDslPackage.IMPORTS_VARIABLE__COMPONENT_NAME:
        return getComponentName();
      case GraphDslPackage.IMPORTS_VARIABLE__COMPONENT_PROPERTY:
        return getComponentProperty();
      case GraphDslPackage.IMPORTS_VARIABLE__IS_OPTIONAL:
        return isIsOptional();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GraphDslPackage.IMPORTS_VARIABLE__IS_EXTERNAL:
        setIsExternal((Boolean)newValue);
        return;
      case GraphDslPackage.IMPORTS_VARIABLE__COMPONENT_NAME:
        setComponentName((String)newValue);
        return;
      case GraphDslPackage.IMPORTS_VARIABLE__COMPONENT_PROPERTY:
        setComponentProperty((String)newValue);
        return;
      case GraphDslPackage.IMPORTS_VARIABLE__IS_OPTIONAL:
        setIsOptional((Boolean)newValue);
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
      case GraphDslPackage.IMPORTS_VARIABLE__IS_EXTERNAL:
        setIsExternal(IS_EXTERNAL_EDEFAULT);
        return;
      case GraphDslPackage.IMPORTS_VARIABLE__COMPONENT_NAME:
        setComponentName(COMPONENT_NAME_EDEFAULT);
        return;
      case GraphDslPackage.IMPORTS_VARIABLE__COMPONENT_PROPERTY:
        setComponentProperty(COMPONENT_PROPERTY_EDEFAULT);
        return;
      case GraphDslPackage.IMPORTS_VARIABLE__IS_OPTIONAL:
        setIsOptional(IS_OPTIONAL_EDEFAULT);
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
      case GraphDslPackage.IMPORTS_VARIABLE__IS_EXTERNAL:
        return isExternal != IS_EXTERNAL_EDEFAULT;
      case GraphDslPackage.IMPORTS_VARIABLE__COMPONENT_NAME:
        return COMPONENT_NAME_EDEFAULT == null ? componentName != null : !COMPONENT_NAME_EDEFAULT.equals(componentName);
      case GraphDslPackage.IMPORTS_VARIABLE__COMPONENT_PROPERTY:
        return COMPONENT_PROPERTY_EDEFAULT == null ? componentProperty != null : !COMPONENT_PROPERTY_EDEFAULT.equals(componentProperty);
      case GraphDslPackage.IMPORTS_VARIABLE__IS_OPTIONAL:
        return isOptional != IS_OPTIONAL_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (isExternal: ");
    result.append(isExternal);
    result.append(", componentName: ");
    result.append(componentName);
    result.append(", componentProperty: ");
    result.append(componentProperty);
    result.append(", isOptional: ");
    result.append(isOptional);
    result.append(')');
    return result.toString();
  }

} //ImportsVariableImpl
