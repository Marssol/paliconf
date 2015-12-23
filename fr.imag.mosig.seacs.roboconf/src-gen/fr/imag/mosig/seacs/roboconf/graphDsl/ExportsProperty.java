/**
 */
package fr.imag.mosig.seacs.roboconf.graphDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exports Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.imag.mosig.seacs.roboconf.graphDsl.ExportsProperty#getExportsVariables <em>Exports Variables</em>}</li>
 * </ul>
 *
 * @see fr.imag.mosig.seacs.roboconf.graphDsl.GraphDslPackage#getExportsProperty()
 * @model
 * @generated
 */
public interface ExportsProperty extends EObject
{
  /**
   * Returns the value of the '<em><b>Exports Variables</b></em>' containment reference list.
   * The list contents are of type {@link fr.imag.mosig.seacs.roboconf.graphDsl.ExportsVariable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exports Variables</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exports Variables</em>' containment reference list.
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.GraphDslPackage#getExportsProperty_ExportsVariables()
   * @model containment="true"
   * @generated
   */
  EList<ExportsVariable> getExportsVariables();

} // ExportsProperty
