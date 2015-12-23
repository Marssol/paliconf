/**
 */
package fr.imag.mosig.seacs.roboconf.graphDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facet Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.imag.mosig.seacs.roboconf.graphDsl.FacetProperty#getChildrenProperty <em>Children Property</em>}</li>
 *   <li>{@link fr.imag.mosig.seacs.roboconf.graphDsl.FacetProperty#getExportsProperty <em>Exports Property</em>}</li>
 * </ul>
 *
 * @see fr.imag.mosig.seacs.roboconf.graphDsl.GraphDslPackage#getFacetProperty()
 * @model
 * @generated
 */
public interface FacetProperty extends EObject
{
  /**
   * Returns the value of the '<em><b>Children Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Children Property</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Children Property</em>' containment reference.
   * @see #setChildrenProperty(ChildrenProperty)
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.GraphDslPackage#getFacetProperty_ChildrenProperty()
   * @model containment="true"
   * @generated
   */
  ChildrenProperty getChildrenProperty();

  /**
   * Sets the value of the '{@link fr.imag.mosig.seacs.roboconf.graphDsl.FacetProperty#getChildrenProperty <em>Children Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Children Property</em>' containment reference.
   * @see #getChildrenProperty()
   * @generated
   */
  void setChildrenProperty(ChildrenProperty value);

  /**
   * Returns the value of the '<em><b>Exports Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exports Property</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exports Property</em>' containment reference.
   * @see #setExportsProperty(ExportsProperty)
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.GraphDslPackage#getFacetProperty_ExportsProperty()
   * @model containment="true"
   * @generated
   */
  ExportsProperty getExportsProperty();

  /**
   * Sets the value of the '{@link fr.imag.mosig.seacs.roboconf.graphDsl.FacetProperty#getExportsProperty <em>Exports Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exports Property</em>' containment reference.
   * @see #getExportsProperty()
   * @generated
   */
  void setExportsProperty(ExportsProperty value);

} // FacetProperty
