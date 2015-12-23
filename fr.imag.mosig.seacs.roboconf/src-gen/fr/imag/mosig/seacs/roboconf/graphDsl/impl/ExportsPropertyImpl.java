/**
 */
package fr.imag.mosig.seacs.roboconf.graphDsl.impl;

import fr.imag.mosig.seacs.roboconf.graphDsl.ExportsProperty;
import fr.imag.mosig.seacs.roboconf.graphDsl.ExportsVariable;
import fr.imag.mosig.seacs.roboconf.graphDsl.GraphDslPackage;

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
 * An implementation of the model object '<em><b>Exports Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.imag.mosig.seacs.roboconf.graphDsl.impl.ExportsPropertyImpl#getExportsVariables <em>Exports Variables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExportsPropertyImpl extends MinimalEObjectImpl.Container implements ExportsProperty
{
  /**
   * The cached value of the '{@link #getExportsVariables() <em>Exports Variables</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExportsVariables()
   * @generated
   * @ordered
   */
  protected EList<ExportsVariable> exportsVariables;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExportsPropertyImpl()
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
    return GraphDslPackage.Literals.EXPORTS_PROPERTY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ExportsVariable> getExportsVariables()
  {
    if (exportsVariables == null)
    {
      exportsVariables = new EObjectContainmentEList<ExportsVariable>(ExportsVariable.class, this, GraphDslPackage.EXPORTS_PROPERTY__EXPORTS_VARIABLES);
    }
    return exportsVariables;
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
      case GraphDslPackage.EXPORTS_PROPERTY__EXPORTS_VARIABLES:
        return ((InternalEList<?>)getExportsVariables()).basicRemove(otherEnd, msgs);
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
      case GraphDslPackage.EXPORTS_PROPERTY__EXPORTS_VARIABLES:
        return getExportsVariables();
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
      case GraphDslPackage.EXPORTS_PROPERTY__EXPORTS_VARIABLES:
        getExportsVariables().clear();
        getExportsVariables().addAll((Collection<? extends ExportsVariable>)newValue);
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
      case GraphDslPackage.EXPORTS_PROPERTY__EXPORTS_VARIABLES:
        getExportsVariables().clear();
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
      case GraphDslPackage.EXPORTS_PROPERTY__EXPORTS_VARIABLES:
        return exportsVariables != null && !exportsVariables.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ExportsPropertyImpl
