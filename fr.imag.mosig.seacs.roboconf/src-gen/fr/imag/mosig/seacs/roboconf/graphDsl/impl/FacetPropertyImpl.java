/**
 */
package fr.imag.mosig.seacs.roboconf.graphDsl.impl;

import fr.imag.mosig.seacs.roboconf.graphDsl.ChildrenProperty;
import fr.imag.mosig.seacs.roboconf.graphDsl.ExportsProperty;
import fr.imag.mosig.seacs.roboconf.graphDsl.FacetProperty;
import fr.imag.mosig.seacs.roboconf.graphDsl.GraphDslPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facet Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.imag.mosig.seacs.roboconf.graphDsl.impl.FacetPropertyImpl#getChildrenProperty <em>Children Property</em>}</li>
 *   <li>{@link fr.imag.mosig.seacs.roboconf.graphDsl.impl.FacetPropertyImpl#getExportsProperty <em>Exports Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FacetPropertyImpl extends MinimalEObjectImpl.Container implements FacetProperty
{
  /**
   * The cached value of the '{@link #getChildrenProperty() <em>Children Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChildrenProperty()
   * @generated
   * @ordered
   */
  protected ChildrenProperty childrenProperty;

  /**
   * The cached value of the '{@link #getExportsProperty() <em>Exports Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExportsProperty()
   * @generated
   * @ordered
   */
  protected ExportsProperty exportsProperty;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FacetPropertyImpl()
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
    return GraphDslPackage.Literals.FACET_PROPERTY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChildrenProperty getChildrenProperty()
  {
    return childrenProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetChildrenProperty(ChildrenProperty newChildrenProperty, NotificationChain msgs)
  {
    ChildrenProperty oldChildrenProperty = childrenProperty;
    childrenProperty = newChildrenProperty;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphDslPackage.FACET_PROPERTY__CHILDREN_PROPERTY, oldChildrenProperty, newChildrenProperty);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setChildrenProperty(ChildrenProperty newChildrenProperty)
  {
    if (newChildrenProperty != childrenProperty)
    {
      NotificationChain msgs = null;
      if (childrenProperty != null)
        msgs = ((InternalEObject)childrenProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraphDslPackage.FACET_PROPERTY__CHILDREN_PROPERTY, null, msgs);
      if (newChildrenProperty != null)
        msgs = ((InternalEObject)newChildrenProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraphDslPackage.FACET_PROPERTY__CHILDREN_PROPERTY, null, msgs);
      msgs = basicSetChildrenProperty(newChildrenProperty, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraphDslPackage.FACET_PROPERTY__CHILDREN_PROPERTY, newChildrenProperty, newChildrenProperty));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExportsProperty getExportsProperty()
  {
    return exportsProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExportsProperty(ExportsProperty newExportsProperty, NotificationChain msgs)
  {
    ExportsProperty oldExportsProperty = exportsProperty;
    exportsProperty = newExportsProperty;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphDslPackage.FACET_PROPERTY__EXPORTS_PROPERTY, oldExportsProperty, newExportsProperty);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExportsProperty(ExportsProperty newExportsProperty)
  {
    if (newExportsProperty != exportsProperty)
    {
      NotificationChain msgs = null;
      if (exportsProperty != null)
        msgs = ((InternalEObject)exportsProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraphDslPackage.FACET_PROPERTY__EXPORTS_PROPERTY, null, msgs);
      if (newExportsProperty != null)
        msgs = ((InternalEObject)newExportsProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraphDslPackage.FACET_PROPERTY__EXPORTS_PROPERTY, null, msgs);
      msgs = basicSetExportsProperty(newExportsProperty, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraphDslPackage.FACET_PROPERTY__EXPORTS_PROPERTY, newExportsProperty, newExportsProperty));
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
      case GraphDslPackage.FACET_PROPERTY__CHILDREN_PROPERTY:
        return basicSetChildrenProperty(null, msgs);
      case GraphDslPackage.FACET_PROPERTY__EXPORTS_PROPERTY:
        return basicSetExportsProperty(null, msgs);
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
      case GraphDslPackage.FACET_PROPERTY__CHILDREN_PROPERTY:
        return getChildrenProperty();
      case GraphDslPackage.FACET_PROPERTY__EXPORTS_PROPERTY:
        return getExportsProperty();
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
      case GraphDslPackage.FACET_PROPERTY__CHILDREN_PROPERTY:
        setChildrenProperty((ChildrenProperty)newValue);
        return;
      case GraphDslPackage.FACET_PROPERTY__EXPORTS_PROPERTY:
        setExportsProperty((ExportsProperty)newValue);
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
      case GraphDslPackage.FACET_PROPERTY__CHILDREN_PROPERTY:
        setChildrenProperty((ChildrenProperty)null);
        return;
      case GraphDslPackage.FACET_PROPERTY__EXPORTS_PROPERTY:
        setExportsProperty((ExportsProperty)null);
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
      case GraphDslPackage.FACET_PROPERTY__CHILDREN_PROPERTY:
        return childrenProperty != null;
      case GraphDslPackage.FACET_PROPERTY__EXPORTS_PROPERTY:
        return exportsProperty != null;
    }
    return super.eIsSet(featureID);
  }

} //FacetPropertyImpl
