/**
 */
package fr.imag.mosig.seacs.roboconf.graphDsl.impl;

import fr.imag.mosig.seacs.roboconf.graphDsl.ChildrenProperty;
import fr.imag.mosig.seacs.roboconf.graphDsl.ExportsProperty;
import fr.imag.mosig.seacs.roboconf.graphDsl.ExtendsProperty;
import fr.imag.mosig.seacs.roboconf.graphDsl.FacetsProperty;
import fr.imag.mosig.seacs.roboconf.graphDsl.GraphDslPackage;
import fr.imag.mosig.seacs.roboconf.graphDsl.ImportsProperty;
import fr.imag.mosig.seacs.roboconf.graphDsl.OptionalProperty;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Optional Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.imag.mosig.seacs.roboconf.graphDsl.impl.OptionalPropertyImpl#getChildrenProperty <em>Children Property</em>}</li>
 *   <li>{@link fr.imag.mosig.seacs.roboconf.graphDsl.impl.OptionalPropertyImpl#getExportsProperty <em>Exports Property</em>}</li>
 *   <li>{@link fr.imag.mosig.seacs.roboconf.graphDsl.impl.OptionalPropertyImpl#getImportsProperty <em>Imports Property</em>}</li>
 *   <li>{@link fr.imag.mosig.seacs.roboconf.graphDsl.impl.OptionalPropertyImpl#getFacetsProperty <em>Facets Property</em>}</li>
 *   <li>{@link fr.imag.mosig.seacs.roboconf.graphDsl.impl.OptionalPropertyImpl#getExtendsProperty <em>Extends Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OptionalPropertyImpl extends MinimalEObjectImpl.Container implements OptionalProperty
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
   * The cached value of the '{@link #getImportsProperty() <em>Imports Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportsProperty()
   * @generated
   * @ordered
   */
  protected ImportsProperty importsProperty;

  /**
   * The cached value of the '{@link #getFacetsProperty() <em>Facets Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFacetsProperty()
   * @generated
   * @ordered
   */
  protected FacetsProperty facetsProperty;

  /**
   * The cached value of the '{@link #getExtendsProperty() <em>Extends Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtendsProperty()
   * @generated
   * @ordered
   */
  protected ExtendsProperty extendsProperty;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OptionalPropertyImpl()
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
    return GraphDslPackage.Literals.OPTIONAL_PROPERTY;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphDslPackage.OPTIONAL_PROPERTY__CHILDREN_PROPERTY, oldChildrenProperty, newChildrenProperty);
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
        msgs = ((InternalEObject)childrenProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraphDslPackage.OPTIONAL_PROPERTY__CHILDREN_PROPERTY, null, msgs);
      if (newChildrenProperty != null)
        msgs = ((InternalEObject)newChildrenProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraphDslPackage.OPTIONAL_PROPERTY__CHILDREN_PROPERTY, null, msgs);
      msgs = basicSetChildrenProperty(newChildrenProperty, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraphDslPackage.OPTIONAL_PROPERTY__CHILDREN_PROPERTY, newChildrenProperty, newChildrenProperty));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphDslPackage.OPTIONAL_PROPERTY__EXPORTS_PROPERTY, oldExportsProperty, newExportsProperty);
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
        msgs = ((InternalEObject)exportsProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraphDslPackage.OPTIONAL_PROPERTY__EXPORTS_PROPERTY, null, msgs);
      if (newExportsProperty != null)
        msgs = ((InternalEObject)newExportsProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraphDslPackage.OPTIONAL_PROPERTY__EXPORTS_PROPERTY, null, msgs);
      msgs = basicSetExportsProperty(newExportsProperty, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraphDslPackage.OPTIONAL_PROPERTY__EXPORTS_PROPERTY, newExportsProperty, newExportsProperty));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImportsProperty getImportsProperty()
  {
    return importsProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetImportsProperty(ImportsProperty newImportsProperty, NotificationChain msgs)
  {
    ImportsProperty oldImportsProperty = importsProperty;
    importsProperty = newImportsProperty;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphDslPackage.OPTIONAL_PROPERTY__IMPORTS_PROPERTY, oldImportsProperty, newImportsProperty);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImportsProperty(ImportsProperty newImportsProperty)
  {
    if (newImportsProperty != importsProperty)
    {
      NotificationChain msgs = null;
      if (importsProperty != null)
        msgs = ((InternalEObject)importsProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraphDslPackage.OPTIONAL_PROPERTY__IMPORTS_PROPERTY, null, msgs);
      if (newImportsProperty != null)
        msgs = ((InternalEObject)newImportsProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraphDslPackage.OPTIONAL_PROPERTY__IMPORTS_PROPERTY, null, msgs);
      msgs = basicSetImportsProperty(newImportsProperty, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraphDslPackage.OPTIONAL_PROPERTY__IMPORTS_PROPERTY, newImportsProperty, newImportsProperty));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FacetsProperty getFacetsProperty()
  {
    return facetsProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFacetsProperty(FacetsProperty newFacetsProperty, NotificationChain msgs)
  {
    FacetsProperty oldFacetsProperty = facetsProperty;
    facetsProperty = newFacetsProperty;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphDslPackage.OPTIONAL_PROPERTY__FACETS_PROPERTY, oldFacetsProperty, newFacetsProperty);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFacetsProperty(FacetsProperty newFacetsProperty)
  {
    if (newFacetsProperty != facetsProperty)
    {
      NotificationChain msgs = null;
      if (facetsProperty != null)
        msgs = ((InternalEObject)facetsProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraphDslPackage.OPTIONAL_PROPERTY__FACETS_PROPERTY, null, msgs);
      if (newFacetsProperty != null)
        msgs = ((InternalEObject)newFacetsProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraphDslPackage.OPTIONAL_PROPERTY__FACETS_PROPERTY, null, msgs);
      msgs = basicSetFacetsProperty(newFacetsProperty, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraphDslPackage.OPTIONAL_PROPERTY__FACETS_PROPERTY, newFacetsProperty, newFacetsProperty));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExtendsProperty getExtendsProperty()
  {
    return extendsProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExtendsProperty(ExtendsProperty newExtendsProperty, NotificationChain msgs)
  {
    ExtendsProperty oldExtendsProperty = extendsProperty;
    extendsProperty = newExtendsProperty;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphDslPackage.OPTIONAL_PROPERTY__EXTENDS_PROPERTY, oldExtendsProperty, newExtendsProperty);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExtendsProperty(ExtendsProperty newExtendsProperty)
  {
    if (newExtendsProperty != extendsProperty)
    {
      NotificationChain msgs = null;
      if (extendsProperty != null)
        msgs = ((InternalEObject)extendsProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraphDslPackage.OPTIONAL_PROPERTY__EXTENDS_PROPERTY, null, msgs);
      if (newExtendsProperty != null)
        msgs = ((InternalEObject)newExtendsProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraphDslPackage.OPTIONAL_PROPERTY__EXTENDS_PROPERTY, null, msgs);
      msgs = basicSetExtendsProperty(newExtendsProperty, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraphDslPackage.OPTIONAL_PROPERTY__EXTENDS_PROPERTY, newExtendsProperty, newExtendsProperty));
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
      case GraphDslPackage.OPTIONAL_PROPERTY__CHILDREN_PROPERTY:
        return basicSetChildrenProperty(null, msgs);
      case GraphDslPackage.OPTIONAL_PROPERTY__EXPORTS_PROPERTY:
        return basicSetExportsProperty(null, msgs);
      case GraphDslPackage.OPTIONAL_PROPERTY__IMPORTS_PROPERTY:
        return basicSetImportsProperty(null, msgs);
      case GraphDslPackage.OPTIONAL_PROPERTY__FACETS_PROPERTY:
        return basicSetFacetsProperty(null, msgs);
      case GraphDslPackage.OPTIONAL_PROPERTY__EXTENDS_PROPERTY:
        return basicSetExtendsProperty(null, msgs);
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
      case GraphDslPackage.OPTIONAL_PROPERTY__CHILDREN_PROPERTY:
        return getChildrenProperty();
      case GraphDslPackage.OPTIONAL_PROPERTY__EXPORTS_PROPERTY:
        return getExportsProperty();
      case GraphDslPackage.OPTIONAL_PROPERTY__IMPORTS_PROPERTY:
        return getImportsProperty();
      case GraphDslPackage.OPTIONAL_PROPERTY__FACETS_PROPERTY:
        return getFacetsProperty();
      case GraphDslPackage.OPTIONAL_PROPERTY__EXTENDS_PROPERTY:
        return getExtendsProperty();
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
      case GraphDslPackage.OPTIONAL_PROPERTY__CHILDREN_PROPERTY:
        setChildrenProperty((ChildrenProperty)newValue);
        return;
      case GraphDslPackage.OPTIONAL_PROPERTY__EXPORTS_PROPERTY:
        setExportsProperty((ExportsProperty)newValue);
        return;
      case GraphDslPackage.OPTIONAL_PROPERTY__IMPORTS_PROPERTY:
        setImportsProperty((ImportsProperty)newValue);
        return;
      case GraphDslPackage.OPTIONAL_PROPERTY__FACETS_PROPERTY:
        setFacetsProperty((FacetsProperty)newValue);
        return;
      case GraphDslPackage.OPTIONAL_PROPERTY__EXTENDS_PROPERTY:
        setExtendsProperty((ExtendsProperty)newValue);
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
      case GraphDslPackage.OPTIONAL_PROPERTY__CHILDREN_PROPERTY:
        setChildrenProperty((ChildrenProperty)null);
        return;
      case GraphDslPackage.OPTIONAL_PROPERTY__EXPORTS_PROPERTY:
        setExportsProperty((ExportsProperty)null);
        return;
      case GraphDslPackage.OPTIONAL_PROPERTY__IMPORTS_PROPERTY:
        setImportsProperty((ImportsProperty)null);
        return;
      case GraphDslPackage.OPTIONAL_PROPERTY__FACETS_PROPERTY:
        setFacetsProperty((FacetsProperty)null);
        return;
      case GraphDslPackage.OPTIONAL_PROPERTY__EXTENDS_PROPERTY:
        setExtendsProperty((ExtendsProperty)null);
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
      case GraphDslPackage.OPTIONAL_PROPERTY__CHILDREN_PROPERTY:
        return childrenProperty != null;
      case GraphDslPackage.OPTIONAL_PROPERTY__EXPORTS_PROPERTY:
        return exportsProperty != null;
      case GraphDslPackage.OPTIONAL_PROPERTY__IMPORTS_PROPERTY:
        return importsProperty != null;
      case GraphDslPackage.OPTIONAL_PROPERTY__FACETS_PROPERTY:
        return facetsProperty != null;
      case GraphDslPackage.OPTIONAL_PROPERTY__EXTENDS_PROPERTY:
        return extendsProperty != null;
    }
    return super.eIsSet(featureID);
  }

} //OptionalPropertyImpl
