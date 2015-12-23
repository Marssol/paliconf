/**
 */
package fr.imag.mosig.seacs.roboconf.graphDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.imag.mosig.seacs.roboconf.graphDsl.Graph#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @see fr.imag.mosig.seacs.roboconf.graphDsl.GraphDslPackage#getGraph()
 * @model
 * @generated
 */
public interface Graph extends EObject
{
  /**
   * Returns the value of the '<em><b>Components</b></em>' containment reference list.
   * The list contents are of type {@link fr.imag.mosig.seacs.roboconf.graphDsl.ComponentOrFacet}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Components</em>' containment reference list.
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.GraphDslPackage#getGraph_Components()
   * @model containment="true"
   * @generated
   */
  EList<ComponentOrFacet> getComponents();

} // Graph
