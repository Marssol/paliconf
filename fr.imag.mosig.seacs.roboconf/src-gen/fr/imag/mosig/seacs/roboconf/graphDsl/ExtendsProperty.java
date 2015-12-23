/**
 */
package fr.imag.mosig.seacs.roboconf.graphDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extends Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.imag.mosig.seacs.roboconf.graphDsl.ExtendsProperty#getExtendsNames <em>Extends Names</em>}</li>
 * </ul>
 *
 * @see fr.imag.mosig.seacs.roboconf.graphDsl.GraphDslPackage#getExtendsProperty()
 * @model
 * @generated
 */
public interface ExtendsProperty extends EObject
{
  /**
   * Returns the value of the '<em><b>Extends Names</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extends Names</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extends Names</em>' attribute list.
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.GraphDslPackage#getExtendsProperty_ExtendsNames()
   * @model unique="false"
   * @generated
   */
  EList<String> getExtendsNames();

} // ExtendsProperty
