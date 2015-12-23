/**
 */
package fr.imag.mosig.seacs.roboconf.graphDsl.impl;

import fr.imag.mosig.seacs.roboconf.graphDsl.ExtendsProperty;
import fr.imag.mosig.seacs.roboconf.graphDsl.GraphDslPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extends Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.imag.mosig.seacs.roboconf.graphDsl.impl.ExtendsPropertyImpl#getExtendsNames <em>Extends Names</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtendsPropertyImpl extends MinimalEObjectImpl.Container implements ExtendsProperty
{
  /**
   * The cached value of the '{@link #getExtendsNames() <em>Extends Names</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtendsNames()
   * @generated
   * @ordered
   */
  protected EList<String> extendsNames;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExtendsPropertyImpl()
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
    return GraphDslPackage.Literals.EXTENDS_PROPERTY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getExtendsNames()
  {
    if (extendsNames == null)
    {
      extendsNames = new EDataTypeEList<String>(String.class, this, GraphDslPackage.EXTENDS_PROPERTY__EXTENDS_NAMES);
    }
    return extendsNames;
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
      case GraphDslPackage.EXTENDS_PROPERTY__EXTENDS_NAMES:
        return getExtendsNames();
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
      case GraphDslPackage.EXTENDS_PROPERTY__EXTENDS_NAMES:
        getExtendsNames().clear();
        getExtendsNames().addAll((Collection<? extends String>)newValue);
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
      case GraphDslPackage.EXTENDS_PROPERTY__EXTENDS_NAMES:
        getExtendsNames().clear();
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
      case GraphDslPackage.EXTENDS_PROPERTY__EXTENDS_NAMES:
        return extendsNames != null && !extendsNames.isEmpty();
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
    result.append(" (extendsNames: ");
    result.append(extendsNames);
    result.append(')');
    return result.toString();
  }

} //ExtendsPropertyImpl
