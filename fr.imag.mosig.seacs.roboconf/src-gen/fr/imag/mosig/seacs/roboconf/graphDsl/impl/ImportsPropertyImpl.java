/**
 */
package fr.imag.mosig.seacs.roboconf.graphDsl.impl;

import fr.imag.mosig.seacs.roboconf.graphDsl.GraphDslPackage;
import fr.imag.mosig.seacs.roboconf.graphDsl.ImportsProperty;
import fr.imag.mosig.seacs.roboconf.graphDsl.ImportsVariable;

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
 * An implementation of the model object '<em><b>Imports Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.imag.mosig.seacs.roboconf.graphDsl.impl.ImportsPropertyImpl#getImportsVariables <em>Imports Variables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImportsPropertyImpl extends MinimalEObjectImpl.Container implements ImportsProperty
{
  /**
   * The cached value of the '{@link #getImportsVariables() <em>Imports Variables</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportsVariables()
   * @generated
   * @ordered
   */
  protected EList<ImportsVariable> importsVariables;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ImportsPropertyImpl()
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
    return GraphDslPackage.Literals.IMPORTS_PROPERTY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ImportsVariable> getImportsVariables()
  {
    if (importsVariables == null)
    {
      importsVariables = new EObjectContainmentEList<ImportsVariable>(ImportsVariable.class, this, GraphDslPackage.IMPORTS_PROPERTY__IMPORTS_VARIABLES);
    }
    return importsVariables;
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
      case GraphDslPackage.IMPORTS_PROPERTY__IMPORTS_VARIABLES:
        return ((InternalEList<?>)getImportsVariables()).basicRemove(otherEnd, msgs);
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
      case GraphDslPackage.IMPORTS_PROPERTY__IMPORTS_VARIABLES:
        return getImportsVariables();
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
      case GraphDslPackage.IMPORTS_PROPERTY__IMPORTS_VARIABLES:
        getImportsVariables().clear();
        getImportsVariables().addAll((Collection<? extends ImportsVariable>)newValue);
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
      case GraphDslPackage.IMPORTS_PROPERTY__IMPORTS_VARIABLES:
        getImportsVariables().clear();
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
      case GraphDslPackage.IMPORTS_PROPERTY__IMPORTS_VARIABLES:
        return importsVariables != null && !importsVariables.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ImportsPropertyImpl
