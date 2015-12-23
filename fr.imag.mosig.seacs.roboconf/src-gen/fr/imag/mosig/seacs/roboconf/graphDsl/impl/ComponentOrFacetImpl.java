/**
 */
package fr.imag.mosig.seacs.roboconf.graphDsl.impl;

import fr.imag.mosig.seacs.roboconf.graphDsl.Component;
import fr.imag.mosig.seacs.roboconf.graphDsl.ComponentOrFacet;
import fr.imag.mosig.seacs.roboconf.graphDsl.Facet;
import fr.imag.mosig.seacs.roboconf.graphDsl.GraphDslPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Or Facet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.imag.mosig.seacs.roboconf.graphDsl.impl.ComponentOrFacetImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link fr.imag.mosig.seacs.roboconf.graphDsl.impl.ComponentOrFacetImpl#getFacet <em>Facet</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentOrFacetImpl extends MinimalEObjectImpl.Container implements ComponentOrFacet
{
  /**
   * The cached value of the '{@link #getComponent() <em>Component</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponent()
   * @generated
   * @ordered
   */
  protected Component component;

  /**
   * The cached value of the '{@link #getFacet() <em>Facet</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFacet()
   * @generated
   * @ordered
   */
  protected Facet facet;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComponentOrFacetImpl()
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
    return GraphDslPackage.Literals.COMPONENT_OR_FACET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component getComponent()
  {
    return component;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetComponent(Component newComponent, NotificationChain msgs)
  {
    Component oldComponent = component;
    component = newComponent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphDslPackage.COMPONENT_OR_FACET__COMPONENT, oldComponent, newComponent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComponent(Component newComponent)
  {
    if (newComponent != component)
    {
      NotificationChain msgs = null;
      if (component != null)
        msgs = ((InternalEObject)component).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraphDslPackage.COMPONENT_OR_FACET__COMPONENT, null, msgs);
      if (newComponent != null)
        msgs = ((InternalEObject)newComponent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraphDslPackage.COMPONENT_OR_FACET__COMPONENT, null, msgs);
      msgs = basicSetComponent(newComponent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraphDslPackage.COMPONENT_OR_FACET__COMPONENT, newComponent, newComponent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Facet getFacet()
  {
    return facet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFacet(Facet newFacet, NotificationChain msgs)
  {
    Facet oldFacet = facet;
    facet = newFacet;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphDslPackage.COMPONENT_OR_FACET__FACET, oldFacet, newFacet);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFacet(Facet newFacet)
  {
    if (newFacet != facet)
    {
      NotificationChain msgs = null;
      if (facet != null)
        msgs = ((InternalEObject)facet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraphDslPackage.COMPONENT_OR_FACET__FACET, null, msgs);
      if (newFacet != null)
        msgs = ((InternalEObject)newFacet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraphDslPackage.COMPONENT_OR_FACET__FACET, null, msgs);
      msgs = basicSetFacet(newFacet, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraphDslPackage.COMPONENT_OR_FACET__FACET, newFacet, newFacet));
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
      case GraphDslPackage.COMPONENT_OR_FACET__COMPONENT:
        return basicSetComponent(null, msgs);
      case GraphDslPackage.COMPONENT_OR_FACET__FACET:
        return basicSetFacet(null, msgs);
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
      case GraphDslPackage.COMPONENT_OR_FACET__COMPONENT:
        return getComponent();
      case GraphDslPackage.COMPONENT_OR_FACET__FACET:
        return getFacet();
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
      case GraphDslPackage.COMPONENT_OR_FACET__COMPONENT:
        setComponent((Component)newValue);
        return;
      case GraphDslPackage.COMPONENT_OR_FACET__FACET:
        setFacet((Facet)newValue);
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
      case GraphDslPackage.COMPONENT_OR_FACET__COMPONENT:
        setComponent((Component)null);
        return;
      case GraphDslPackage.COMPONENT_OR_FACET__FACET:
        setFacet((Facet)null);
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
      case GraphDslPackage.COMPONENT_OR_FACET__COMPONENT:
        return component != null;
      case GraphDslPackage.COMPONENT_OR_FACET__FACET:
        return facet != null;
    }
    return super.eIsSet(featureID);
  }

} //ComponentOrFacetImpl
