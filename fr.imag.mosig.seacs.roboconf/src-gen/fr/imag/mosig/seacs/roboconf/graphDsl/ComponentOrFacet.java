/**
 */
package fr.imag.mosig.seacs.roboconf.graphDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Or Facet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.imag.mosig.seacs.roboconf.graphDsl.ComponentOrFacet#getComponent <em>Component</em>}</li>
 *   <li>{@link fr.imag.mosig.seacs.roboconf.graphDsl.ComponentOrFacet#getFacet <em>Facet</em>}</li>
 * </ul>
 *
 * @see fr.imag.mosig.seacs.roboconf.graphDsl.GraphDslPackage#getComponentOrFacet()
 * @model
 * @generated
 */
public interface ComponentOrFacet extends EObject
{
  /**
   * Returns the value of the '<em><b>Component</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Component</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Component</em>' containment reference.
   * @see #setComponent(Component)
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.GraphDslPackage#getComponentOrFacet_Component()
   * @model containment="true"
   * @generated
   */
  Component getComponent();

  /**
   * Sets the value of the '{@link fr.imag.mosig.seacs.roboconf.graphDsl.ComponentOrFacet#getComponent <em>Component</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Component</em>' containment reference.
   * @see #getComponent()
   * @generated
   */
  void setComponent(Component value);

  /**
   * Returns the value of the '<em><b>Facet</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Facet</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Facet</em>' containment reference.
   * @see #setFacet(Facet)
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.GraphDslPackage#getComponentOrFacet_Facet()
   * @model containment="true"
   * @generated
   */
  Facet getFacet();

  /**
   * Sets the value of the '{@link fr.imag.mosig.seacs.roboconf.graphDsl.ComponentOrFacet#getFacet <em>Facet</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Facet</em>' containment reference.
   * @see #getFacet()
   * @generated
   */
  void setFacet(Facet value);

} // ComponentOrFacet
