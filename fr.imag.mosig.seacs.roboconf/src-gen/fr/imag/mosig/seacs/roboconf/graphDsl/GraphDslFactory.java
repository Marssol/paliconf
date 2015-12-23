/**
 */
package fr.imag.mosig.seacs.roboconf.graphDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.imag.mosig.seacs.roboconf.graphDsl.GraphDslPackage
 * @generated
 */
public interface GraphDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GraphDslFactory eINSTANCE = fr.imag.mosig.seacs.roboconf.graphDsl.impl.GraphDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Graph</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Graph</em>'.
   * @generated
   */
  Graph createGraph();

  /**
   * Returns a new object of class '<em>Component Or Facet</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Component Or Facet</em>'.
   * @generated
   */
  ComponentOrFacet createComponentOrFacet();

  /**
   * Returns a new object of class '<em>Component</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Component</em>'.
   * @generated
   */
  Component createComponent();

  /**
   * Returns a new object of class '<em>Facet</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Facet</em>'.
   * @generated
   */
  Facet createFacet();

  /**
   * Returns a new object of class '<em>Component Properties</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Component Properties</em>'.
   * @generated
   */
  ComponentProperties createComponentProperties();

  /**
   * Returns a new object of class '<em>Facet Properties</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Facet Properties</em>'.
   * @generated
   */
  FacetProperties createFacetProperties();

  /**
   * Returns a new object of class '<em>Facet Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Facet Property</em>'.
   * @generated
   */
  FacetProperty createFacetProperty();

  /**
   * Returns a new object of class '<em>Optional Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Optional Property</em>'.
   * @generated
   */
  OptionalProperty createOptionalProperty();

  /**
   * Returns a new object of class '<em>Installer Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Installer Property</em>'.
   * @generated
   */
  InstallerProperty createInstallerProperty();

  /**
   * Returns a new object of class '<em>Children Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Children Property</em>'.
   * @generated
   */
  ChildrenProperty createChildrenProperty();

  /**
   * Returns a new object of class '<em>Exports Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exports Property</em>'.
   * @generated
   */
  ExportsProperty createExportsProperty();

  /**
   * Returns a new object of class '<em>Exports Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exports Variable</em>'.
   * @generated
   */
  ExportsVariable createExportsVariable();

  /**
   * Returns a new object of class '<em>Imports Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Imports Property</em>'.
   * @generated
   */
  ImportsProperty createImportsProperty();

  /**
   * Returns a new object of class '<em>Imports Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Imports Variable</em>'.
   * @generated
   */
  ImportsVariable createImportsVariable();

  /**
   * Returns a new object of class '<em>Facets Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Facets Property</em>'.
   * @generated
   */
  FacetsProperty createFacetsProperty();

  /**
   * Returns a new object of class '<em>Extends Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Extends Property</em>'.
   * @generated
   */
  ExtendsProperty createExtendsProperty();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  GraphDslPackage getGraphDslPackage();

} //GraphDslFactory
