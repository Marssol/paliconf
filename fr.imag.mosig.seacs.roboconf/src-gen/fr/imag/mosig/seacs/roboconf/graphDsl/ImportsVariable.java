/**
 */
package fr.imag.mosig.seacs.roboconf.graphDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imports Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.imag.mosig.seacs.roboconf.graphDsl.ImportsVariable#isIsExternal <em>Is External</em>}</li>
 *   <li>{@link fr.imag.mosig.seacs.roboconf.graphDsl.ImportsVariable#getComponentName <em>Component Name</em>}</li>
 *   <li>{@link fr.imag.mosig.seacs.roboconf.graphDsl.ImportsVariable#getComponentProperty <em>Component Property</em>}</li>
 *   <li>{@link fr.imag.mosig.seacs.roboconf.graphDsl.ImportsVariable#isIsOptional <em>Is Optional</em>}</li>
 * </ul>
 *
 * @see fr.imag.mosig.seacs.roboconf.graphDsl.GraphDslPackage#getImportsVariable()
 * @model
 * @generated
 */
public interface ImportsVariable extends EObject
{
  /**
   * Returns the value of the '<em><b>Is External</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is External</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is External</em>' attribute.
   * @see #setIsExternal(boolean)
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.GraphDslPackage#getImportsVariable_IsExternal()
   * @model
   * @generated
   */
  boolean isIsExternal();

  /**
   * Sets the value of the '{@link fr.imag.mosig.seacs.roboconf.graphDsl.ImportsVariable#isIsExternal <em>Is External</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is External</em>' attribute.
   * @see #isIsExternal()
   * @generated
   */
  void setIsExternal(boolean value);

  /**
   * Returns the value of the '<em><b>Component Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Component Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Component Name</em>' attribute.
   * @see #setComponentName(String)
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.GraphDslPackage#getImportsVariable_ComponentName()
   * @model
   * @generated
   */
  String getComponentName();

  /**
   * Sets the value of the '{@link fr.imag.mosig.seacs.roboconf.graphDsl.ImportsVariable#getComponentName <em>Component Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Component Name</em>' attribute.
   * @see #getComponentName()
   * @generated
   */
  void setComponentName(String value);

  /**
   * Returns the value of the '<em><b>Component Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Component Property</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Component Property</em>' attribute.
   * @see #setComponentProperty(String)
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.GraphDslPackage#getImportsVariable_ComponentProperty()
   * @model
   * @generated
   */
  String getComponentProperty();

  /**
   * Sets the value of the '{@link fr.imag.mosig.seacs.roboconf.graphDsl.ImportsVariable#getComponentProperty <em>Component Property</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Component Property</em>' attribute.
   * @see #getComponentProperty()
   * @generated
   */
  void setComponentProperty(String value);

  /**
   * Returns the value of the '<em><b>Is Optional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Optional</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Optional</em>' attribute.
   * @see #setIsOptional(boolean)
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.GraphDslPackage#getImportsVariable_IsOptional()
   * @model
   * @generated
   */
  boolean isIsOptional();

  /**
   * Sets the value of the '{@link fr.imag.mosig.seacs.roboconf.graphDsl.ImportsVariable#isIsOptional <em>Is Optional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Optional</em>' attribute.
   * @see #isIsOptional()
   * @generated
   */
  void setIsOptional(boolean value);

} // ImportsVariable
