/**
 */
package fr.imag.mosig.seacs.roboconf.graphDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facets Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.imag.mosig.seacs.roboconf.graphDsl.FacetsProperty#getFacetsNames <em>Facets Names</em>}</li>
 * </ul>
 *
 * @see fr.imag.mosig.seacs.roboconf.graphDsl.GraphDslPackage#getFacetsProperty()
 * @model
 * @generated
 */
public interface FacetsProperty extends EObject
{
  /**
   * Returns the value of the '<em><b>Facets Names</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Facets Names</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Facets Names</em>' attribute list.
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.GraphDslPackage#getFacetsProperty_FacetsNames()
   * @model unique="false"
   * @generated
   */
  EList<String> getFacetsNames();

} // FacetsProperty
