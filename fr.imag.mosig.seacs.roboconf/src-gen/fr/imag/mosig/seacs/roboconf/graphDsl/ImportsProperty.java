/**
 */
package fr.imag.mosig.seacs.roboconf.graphDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imports Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.imag.mosig.seacs.roboconf.graphDsl.ImportsProperty#getImportsVariables <em>Imports Variables</em>}</li>
 * </ul>
 *
 * @see fr.imag.mosig.seacs.roboconf.graphDsl.GraphDslPackage#getImportsProperty()
 * @model
 * @generated
 */
public interface ImportsProperty extends EObject
{
  /**
   * Returns the value of the '<em><b>Imports Variables</b></em>' containment reference list.
   * The list contents are of type {@link fr.imag.mosig.seacs.roboconf.graphDsl.ImportsVariable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports Variables</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports Variables</em>' containment reference list.
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.GraphDslPackage#getImportsProperty_ImportsVariables()
   * @model containment="true"
   * @generated
   */
  EList<ImportsVariable> getImportsVariables();

} // ImportsProperty
