/**
 */
package fr.imag.mosig.seacs.roboconf.graphDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.imag.mosig.seacs.roboconf.graphDsl.Properties#getInstallerProperty <em>Installer Property</em>}</li>
 *   <li>{@link fr.imag.mosig.seacs.roboconf.graphDsl.Properties#getOptionalProperties <em>Optional Properties</em>}</li>
 * </ul>
 *
 * @see fr.imag.mosig.seacs.roboconf.graphDsl.GraphDslPackage#getProperties()
 * @model
 * @generated
 */
public interface Properties extends EObject
{
  /**
   * Returns the value of the '<em><b>Installer Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Installer Property</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Installer Property</em>' containment reference.
   * @see #setInstallerProperty(InstallerProperty)
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.GraphDslPackage#getProperties_InstallerProperty()
   * @model containment="true"
   * @generated
   */
  InstallerProperty getInstallerProperty();

  /**
   * Sets the value of the '{@link fr.imag.mosig.seacs.roboconf.graphDsl.Properties#getInstallerProperty <em>Installer Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Installer Property</em>' containment reference.
   * @see #getInstallerProperty()
   * @generated
   */
  void setInstallerProperty(InstallerProperty value);

  /**
   * Returns the value of the '<em><b>Optional Properties</b></em>' containment reference list.
   * The list contents are of type {@link fr.imag.mosig.seacs.roboconf.graphDsl.OptionalProperty}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Optional Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Optional Properties</em>' containment reference list.
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.GraphDslPackage#getProperties_OptionalProperties()
   * @model containment="true"
   * @generated
   */
  EList<OptionalProperty> getOptionalProperties();

} // Properties
