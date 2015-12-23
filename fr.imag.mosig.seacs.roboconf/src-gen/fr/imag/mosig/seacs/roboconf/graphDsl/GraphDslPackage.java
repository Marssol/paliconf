/**
 */
package fr.imag.mosig.seacs.roboconf.graphDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.imag.mosig.seacs.roboconf.graphDsl.GraphDslFactory
 * @model kind="package"
 * @generated
 */
public interface GraphDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "graphDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.imag.fr/mosig/seacs/roboconf/GraphDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "graphDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GraphDslPackage eINSTANCE = fr.imag.mosig.seacs.roboconf.graphDsl.impl.GraphDslPackageImpl.init();

  /**
   * The meta object id for the '{@link fr.imag.mosig.seacs.roboconf.graphDsl.impl.GraphImpl <em>Graph</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.impl.GraphImpl
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.impl.GraphDslPackageImpl#getGraph()
   * @generated
   */
  int GRAPH = 0;

  /**
   * The feature id for the '<em><b>Components</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAPH__COMPONENTS = 0;

  /**
   * The number of structural features of the '<em>Graph</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAPH_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.imag.mosig.seacs.roboconf.graphDsl.impl.ComponentOrFacetImpl <em>Component Or Facet</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.impl.ComponentOrFacetImpl
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.impl.GraphDslPackageImpl#getComponentOrFacet()
   * @generated
   */
  int COMPONENT_OR_FACET = 1;

  /**
   * The feature id for the '<em><b>Component</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_OR_FACET__COMPONENT = 0;

  /**
   * The feature id for the '<em><b>Facet</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_OR_FACET__FACET = 1;

  /**
   * The number of structural features of the '<em>Component Or Facet</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_OR_FACET_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.imag.mosig.seacs.roboconf.graphDsl.impl.ComponentImpl <em>Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.impl.ComponentImpl
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.impl.GraphDslPackageImpl#getComponent()
   * @generated
   */
  int COMPONENT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__PROPERTIES = 1;

  /**
   * The number of structural features of the '<em>Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.imag.mosig.seacs.roboconf.graphDsl.impl.FacetImpl <em>Facet</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.impl.FacetImpl
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.impl.GraphDslPackageImpl#getFacet()
   * @generated
   */
  int FACET = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACET__NAME = 0;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACET__PROPERTIES = 1;

  /**
   * The number of structural features of the '<em>Facet</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACET_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.imag.mosig.seacs.roboconf.graphDsl.impl.ComponentPropertiesImpl <em>Component Properties</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.impl.ComponentPropertiesImpl
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.impl.GraphDslPackageImpl#getComponentProperties()
   * @generated
   */
  int COMPONENT_PROPERTIES = 4;

  /**
   * The feature id for the '<em><b>Optional Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_PROPERTIES__OPTIONAL_PROPERTIES = 0;

  /**
   * The feature id for the '<em><b>Installer Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_PROPERTIES__INSTALLER_PROPERTY = 1;

  /**
   * The number of structural features of the '<em>Component Properties</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_PROPERTIES_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.imag.mosig.seacs.roboconf.graphDsl.impl.FacetPropertiesImpl <em>Facet Properties</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.impl.FacetPropertiesImpl
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.impl.GraphDslPackageImpl#getFacetProperties()
   * @generated
   */
  int FACET_PROPERTIES = 5;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACET_PROPERTIES__PROPERTIES = 0;

  /**
   * The number of structural features of the '<em>Facet Properties</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACET_PROPERTIES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.imag.mosig.seacs.roboconf.graphDsl.impl.FacetPropertyImpl <em>Facet Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.impl.FacetPropertyImpl
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.impl.GraphDslPackageImpl#getFacetProperty()
   * @generated
   */
  int FACET_PROPERTY = 6;

  /**
   * The feature id for the '<em><b>Children Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACET_PROPERTY__CHILDREN_PROPERTY = 0;

  /**
   * The feature id for the '<em><b>Exports Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACET_PROPERTY__EXPORTS_PROPERTY = 1;

  /**
   * The number of structural features of the '<em>Facet Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACET_PROPERTY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.imag.mosig.seacs.roboconf.graphDsl.impl.OptionalPropertyImpl <em>Optional Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.impl.OptionalPropertyImpl
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.impl.GraphDslPackageImpl#getOptionalProperty()
   * @generated
   */
  int OPTIONAL_PROPERTY = 7;

  /**
   * The feature id for the '<em><b>Children Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_PROPERTY__CHILDREN_PROPERTY = 0;

  /**
   * The feature id for the '<em><b>Exports Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_PROPERTY__EXPORTS_PROPERTY = 1;

  /**
   * The feature id for the '<em><b>Imports Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_PROPERTY__IMPORTS_PROPERTY = 2;

  /**
   * The feature id for the '<em><b>Facets Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_PROPERTY__FACETS_PROPERTY = 3;

  /**
   * The feature id for the '<em><b>Extends Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_PROPERTY__EXTENDS_PROPERTY = 4;

  /**
   * The number of structural features of the '<em>Optional Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_PROPERTY_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link fr.imag.mosig.seacs.roboconf.graphDsl.impl.InstallerPropertyImpl <em>Installer Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.impl.InstallerPropertyImpl
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.impl.GraphDslPackageImpl#getInstallerProperty()
   * @generated
   */
  int INSTALLER_PROPERTY = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTALLER_PROPERTY__NAME = 0;

  /**
   * The number of structural features of the '<em>Installer Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTALLER_PROPERTY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.imag.mosig.seacs.roboconf.graphDsl.impl.ChildrenPropertyImpl <em>Children Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.impl.ChildrenPropertyImpl
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.impl.GraphDslPackageImpl#getChildrenProperty()
   * @generated
   */
  int CHILDREN_PROPERTY = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHILDREN_PROPERTY__NAME = 0;

  /**
   * The number of structural features of the '<em>Children Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHILDREN_PROPERTY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.imag.mosig.seacs.roboconf.graphDsl.impl.ExportsPropertyImpl <em>Exports Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.impl.ExportsPropertyImpl
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.impl.GraphDslPackageImpl#getExportsProperty()
   * @generated
   */
  int EXPORTS_PROPERTY = 10;

  /**
   * The feature id for the '<em><b>Exports Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPORTS_PROPERTY__EXPORTS_VARIABLES = 0;

  /**
   * The number of structural features of the '<em>Exports Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPORTS_PROPERTY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.imag.mosig.seacs.roboconf.graphDsl.impl.ExportsVariableImpl <em>Exports Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.impl.ExportsVariableImpl
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.impl.GraphDslPackageImpl#getExportsVariable()
   * @generated
   */
  int EXPORTS_VARIABLE = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPORTS_VARIABLE__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPORTS_VARIABLE__VALUE = 1;

  /**
   * The number of structural features of the '<em>Exports Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPORTS_VARIABLE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.imag.mosig.seacs.roboconf.graphDsl.impl.ImportsPropertyImpl <em>Imports Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.impl.ImportsPropertyImpl
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.impl.GraphDslPackageImpl#getImportsProperty()
   * @generated
   */
  int IMPORTS_PROPERTY = 12;

  /**
   * The feature id for the '<em><b>Imports Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORTS_PROPERTY__IMPORTS_VARIABLES = 0;

  /**
   * The number of structural features of the '<em>Imports Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORTS_PROPERTY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.imag.mosig.seacs.roboconf.graphDsl.impl.ImportsVariableImpl <em>Imports Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.impl.ImportsVariableImpl
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.impl.GraphDslPackageImpl#getImportsVariable()
   * @generated
   */
  int IMPORTS_VARIABLE = 13;

  /**
   * The feature id for the '<em><b>Is External</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORTS_VARIABLE__IS_EXTERNAL = 0;

  /**
   * The feature id for the '<em><b>Component Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORTS_VARIABLE__COMPONENT_NAME = 1;

  /**
   * The feature id for the '<em><b>Component Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORTS_VARIABLE__COMPONENT_PROPERTY = 2;

  /**
   * The feature id for the '<em><b>Is Optional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORTS_VARIABLE__IS_OPTIONAL = 3;

  /**
   * The number of structural features of the '<em>Imports Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORTS_VARIABLE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link fr.imag.mosig.seacs.roboconf.graphDsl.impl.FacetsPropertyImpl <em>Facets Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.impl.FacetsPropertyImpl
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.impl.GraphDslPackageImpl#getFacetsProperty()
   * @generated
   */
  int FACETS_PROPERTY = 14;

  /**
   * The feature id for the '<em><b>Facets Names</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACETS_PROPERTY__FACETS_NAMES = 0;

  /**
   * The number of structural features of the '<em>Facets Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACETS_PROPERTY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.imag.mosig.seacs.roboconf.graphDsl.impl.ExtendsPropertyImpl <em>Extends Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.impl.ExtendsPropertyImpl
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.impl.GraphDslPackageImpl#getExtendsProperty()
   * @generated
   */
  int EXTENDS_PROPERTY = 15;

  /**
   * The feature id for the '<em><b>Extends Names</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDS_PROPERTY__EXTENDS_NAMES = 0;

  /**
   * The number of structural features of the '<em>Extends Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDS_PROPERTY_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link fr.imag.mosig.seacs.roboconf.graphDsl.Graph <em>Graph</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Graph</em>'.
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.Graph
   * @generated
   */
  EClass getGraph();

  /**
   * Returns the meta object for the containment reference list '{@link fr.imag.mosig.seacs.roboconf.graphDsl.Graph#getComponents <em>Components</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Components</em>'.
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.Graph#getComponents()
   * @see #getGraph()
   * @generated
   */
  EReference getGraph_Components();

  /**
   * Returns the meta object for class '{@link fr.imag.mosig.seacs.roboconf.graphDsl.ComponentOrFacet <em>Component Or Facet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component Or Facet</em>'.
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.ComponentOrFacet
   * @generated
   */
  EClass getComponentOrFacet();

  /**
   * Returns the meta object for the containment reference '{@link fr.imag.mosig.seacs.roboconf.graphDsl.ComponentOrFacet#getComponent <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Component</em>'.
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.ComponentOrFacet#getComponent()
   * @see #getComponentOrFacet()
   * @generated
   */
  EReference getComponentOrFacet_Component();

  /**
   * Returns the meta object for the containment reference '{@link fr.imag.mosig.seacs.roboconf.graphDsl.ComponentOrFacet#getFacet <em>Facet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Facet</em>'.
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.ComponentOrFacet#getFacet()
   * @see #getComponentOrFacet()
   * @generated
   */
  EReference getComponentOrFacet_Facet();

  /**
   * Returns the meta object for class '{@link fr.imag.mosig.seacs.roboconf.graphDsl.Component <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component</em>'.
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.Component
   * @generated
   */
  EClass getComponent();

  /**
   * Returns the meta object for the attribute '{@link fr.imag.mosig.seacs.roboconf.graphDsl.Component#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.Component#getName()
   * @see #getComponent()
   * @generated
   */
  EAttribute getComponent_Name();

  /**
   * Returns the meta object for the containment reference '{@link fr.imag.mosig.seacs.roboconf.graphDsl.Component#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Properties</em>'.
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.Component#getProperties()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Properties();

  /**
   * Returns the meta object for class '{@link fr.imag.mosig.seacs.roboconf.graphDsl.Facet <em>Facet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Facet</em>'.
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.Facet
   * @generated
   */
  EClass getFacet();

  /**
   * Returns the meta object for the attribute '{@link fr.imag.mosig.seacs.roboconf.graphDsl.Facet#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.Facet#getName()
   * @see #getFacet()
   * @generated
   */
  EAttribute getFacet_Name();

  /**
   * Returns the meta object for the containment reference '{@link fr.imag.mosig.seacs.roboconf.graphDsl.Facet#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Properties</em>'.
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.Facet#getProperties()
   * @see #getFacet()
   * @generated
   */
  EReference getFacet_Properties();

  /**
   * Returns the meta object for class '{@link fr.imag.mosig.seacs.roboconf.graphDsl.ComponentProperties <em>Component Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component Properties</em>'.
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.ComponentProperties
   * @generated
   */
  EClass getComponentProperties();

  /**
   * Returns the meta object for the containment reference list '{@link fr.imag.mosig.seacs.roboconf.graphDsl.ComponentProperties#getOptionalProperties <em>Optional Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Optional Properties</em>'.
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.ComponentProperties#getOptionalProperties()
   * @see #getComponentProperties()
   * @generated
   */
  EReference getComponentProperties_OptionalProperties();

  /**
   * Returns the meta object for the containment reference '{@link fr.imag.mosig.seacs.roboconf.graphDsl.ComponentProperties#getInstallerProperty <em>Installer Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Installer Property</em>'.
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.ComponentProperties#getInstallerProperty()
   * @see #getComponentProperties()
   * @generated
   */
  EReference getComponentProperties_InstallerProperty();

  /**
   * Returns the meta object for class '{@link fr.imag.mosig.seacs.roboconf.graphDsl.FacetProperties <em>Facet Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Facet Properties</em>'.
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.FacetProperties
   * @generated
   */
  EClass getFacetProperties();

  /**
   * Returns the meta object for the containment reference list '{@link fr.imag.mosig.seacs.roboconf.graphDsl.FacetProperties#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.FacetProperties#getProperties()
   * @see #getFacetProperties()
   * @generated
   */
  EReference getFacetProperties_Properties();

  /**
   * Returns the meta object for class '{@link fr.imag.mosig.seacs.roboconf.graphDsl.FacetProperty <em>Facet Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Facet Property</em>'.
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.FacetProperty
   * @generated
   */
  EClass getFacetProperty();

  /**
   * Returns the meta object for the containment reference '{@link fr.imag.mosig.seacs.roboconf.graphDsl.FacetProperty#getChildrenProperty <em>Children Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Children Property</em>'.
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.FacetProperty#getChildrenProperty()
   * @see #getFacetProperty()
   * @generated
   */
  EReference getFacetProperty_ChildrenProperty();

  /**
   * Returns the meta object for the containment reference '{@link fr.imag.mosig.seacs.roboconf.graphDsl.FacetProperty#getExportsProperty <em>Exports Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exports Property</em>'.
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.FacetProperty#getExportsProperty()
   * @see #getFacetProperty()
   * @generated
   */
  EReference getFacetProperty_ExportsProperty();

  /**
   * Returns the meta object for class '{@link fr.imag.mosig.seacs.roboconf.graphDsl.OptionalProperty <em>Optional Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Optional Property</em>'.
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.OptionalProperty
   * @generated
   */
  EClass getOptionalProperty();

  /**
   * Returns the meta object for the containment reference '{@link fr.imag.mosig.seacs.roboconf.graphDsl.OptionalProperty#getChildrenProperty <em>Children Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Children Property</em>'.
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.OptionalProperty#getChildrenProperty()
   * @see #getOptionalProperty()
   * @generated
   */
  EReference getOptionalProperty_ChildrenProperty();

  /**
   * Returns the meta object for the containment reference '{@link fr.imag.mosig.seacs.roboconf.graphDsl.OptionalProperty#getExportsProperty <em>Exports Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exports Property</em>'.
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.OptionalProperty#getExportsProperty()
   * @see #getOptionalProperty()
   * @generated
   */
  EReference getOptionalProperty_ExportsProperty();

  /**
   * Returns the meta object for the containment reference '{@link fr.imag.mosig.seacs.roboconf.graphDsl.OptionalProperty#getImportsProperty <em>Imports Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Imports Property</em>'.
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.OptionalProperty#getImportsProperty()
   * @see #getOptionalProperty()
   * @generated
   */
  EReference getOptionalProperty_ImportsProperty();

  /**
   * Returns the meta object for the containment reference '{@link fr.imag.mosig.seacs.roboconf.graphDsl.OptionalProperty#getFacetsProperty <em>Facets Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Facets Property</em>'.
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.OptionalProperty#getFacetsProperty()
   * @see #getOptionalProperty()
   * @generated
   */
  EReference getOptionalProperty_FacetsProperty();

  /**
   * Returns the meta object for the containment reference '{@link fr.imag.mosig.seacs.roboconf.graphDsl.OptionalProperty#getExtendsProperty <em>Extends Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Extends Property</em>'.
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.OptionalProperty#getExtendsProperty()
   * @see #getOptionalProperty()
   * @generated
   */
  EReference getOptionalProperty_ExtendsProperty();

  /**
   * Returns the meta object for class '{@link fr.imag.mosig.seacs.roboconf.graphDsl.InstallerProperty <em>Installer Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Installer Property</em>'.
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.InstallerProperty
   * @generated
   */
  EClass getInstallerProperty();

  /**
   * Returns the meta object for the attribute '{@link fr.imag.mosig.seacs.roboconf.graphDsl.InstallerProperty#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.InstallerProperty#getName()
   * @see #getInstallerProperty()
   * @generated
   */
  EAttribute getInstallerProperty_Name();

  /**
   * Returns the meta object for class '{@link fr.imag.mosig.seacs.roboconf.graphDsl.ChildrenProperty <em>Children Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Children Property</em>'.
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.ChildrenProperty
   * @generated
   */
  EClass getChildrenProperty();

  /**
   * Returns the meta object for the attribute list '{@link fr.imag.mosig.seacs.roboconf.graphDsl.ChildrenProperty#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Name</em>'.
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.ChildrenProperty#getName()
   * @see #getChildrenProperty()
   * @generated
   */
  EAttribute getChildrenProperty_Name();

  /**
   * Returns the meta object for class '{@link fr.imag.mosig.seacs.roboconf.graphDsl.ExportsProperty <em>Exports Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exports Property</em>'.
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.ExportsProperty
   * @generated
   */
  EClass getExportsProperty();

  /**
   * Returns the meta object for the containment reference list '{@link fr.imag.mosig.seacs.roboconf.graphDsl.ExportsProperty#getExportsVariables <em>Exports Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exports Variables</em>'.
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.ExportsProperty#getExportsVariables()
   * @see #getExportsProperty()
   * @generated
   */
  EReference getExportsProperty_ExportsVariables();

  /**
   * Returns the meta object for class '{@link fr.imag.mosig.seacs.roboconf.graphDsl.ExportsVariable <em>Exports Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exports Variable</em>'.
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.ExportsVariable
   * @generated
   */
  EClass getExportsVariable();

  /**
   * Returns the meta object for the attribute '{@link fr.imag.mosig.seacs.roboconf.graphDsl.ExportsVariable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.ExportsVariable#getName()
   * @see #getExportsVariable()
   * @generated
   */
  EAttribute getExportsVariable_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.imag.mosig.seacs.roboconf.graphDsl.ExportsVariable#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.ExportsVariable#getValue()
   * @see #getExportsVariable()
   * @generated
   */
  EAttribute getExportsVariable_Value();

  /**
   * Returns the meta object for class '{@link fr.imag.mosig.seacs.roboconf.graphDsl.ImportsProperty <em>Imports Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Imports Property</em>'.
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.ImportsProperty
   * @generated
   */
  EClass getImportsProperty();

  /**
   * Returns the meta object for the containment reference list '{@link fr.imag.mosig.seacs.roboconf.graphDsl.ImportsProperty#getImportsVariables <em>Imports Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports Variables</em>'.
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.ImportsProperty#getImportsVariables()
   * @see #getImportsProperty()
   * @generated
   */
  EReference getImportsProperty_ImportsVariables();

  /**
   * Returns the meta object for class '{@link fr.imag.mosig.seacs.roboconf.graphDsl.ImportsVariable <em>Imports Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Imports Variable</em>'.
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.ImportsVariable
   * @generated
   */
  EClass getImportsVariable();

  /**
   * Returns the meta object for the attribute '{@link fr.imag.mosig.seacs.roboconf.graphDsl.ImportsVariable#isIsExternal <em>Is External</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is External</em>'.
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.ImportsVariable#isIsExternal()
   * @see #getImportsVariable()
   * @generated
   */
  EAttribute getImportsVariable_IsExternal();

  /**
   * Returns the meta object for the attribute '{@link fr.imag.mosig.seacs.roboconf.graphDsl.ImportsVariable#getComponentName <em>Component Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Component Name</em>'.
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.ImportsVariable#getComponentName()
   * @see #getImportsVariable()
   * @generated
   */
  EAttribute getImportsVariable_ComponentName();

  /**
   * Returns the meta object for the attribute '{@link fr.imag.mosig.seacs.roboconf.graphDsl.ImportsVariable#getComponentProperty <em>Component Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Component Property</em>'.
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.ImportsVariable#getComponentProperty()
   * @see #getImportsVariable()
   * @generated
   */
  EAttribute getImportsVariable_ComponentProperty();

  /**
   * Returns the meta object for the attribute '{@link fr.imag.mosig.seacs.roboconf.graphDsl.ImportsVariable#isIsOptional <em>Is Optional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Optional</em>'.
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.ImportsVariable#isIsOptional()
   * @see #getImportsVariable()
   * @generated
   */
  EAttribute getImportsVariable_IsOptional();

  /**
   * Returns the meta object for class '{@link fr.imag.mosig.seacs.roboconf.graphDsl.FacetsProperty <em>Facets Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Facets Property</em>'.
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.FacetsProperty
   * @generated
   */
  EClass getFacetsProperty();

  /**
   * Returns the meta object for the attribute list '{@link fr.imag.mosig.seacs.roboconf.graphDsl.FacetsProperty#getFacetsNames <em>Facets Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Facets Names</em>'.
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.FacetsProperty#getFacetsNames()
   * @see #getFacetsProperty()
   * @generated
   */
  EAttribute getFacetsProperty_FacetsNames();

  /**
   * Returns the meta object for class '{@link fr.imag.mosig.seacs.roboconf.graphDsl.ExtendsProperty <em>Extends Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Extends Property</em>'.
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.ExtendsProperty
   * @generated
   */
  EClass getExtendsProperty();

  /**
   * Returns the meta object for the attribute list '{@link fr.imag.mosig.seacs.roboconf.graphDsl.ExtendsProperty#getExtendsNames <em>Extends Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Extends Names</em>'.
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.ExtendsProperty#getExtendsNames()
   * @see #getExtendsProperty()
   * @generated
   */
  EAttribute getExtendsProperty_ExtendsNames();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  GraphDslFactory getGraphDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link fr.imag.mosig.seacs.roboconf.graphDsl.impl.GraphImpl <em>Graph</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imag.mosig.seacs.roboconf.graphDsl.impl.GraphImpl
     * @see fr.imag.mosig.seacs.roboconf.graphDsl.impl.GraphDslPackageImpl#getGraph()
     * @generated
     */
    EClass GRAPH = eINSTANCE.getGraph();

    /**
     * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GRAPH__COMPONENTS = eINSTANCE.getGraph_Components();

    /**
     * The meta object literal for the '{@link fr.imag.mosig.seacs.roboconf.graphDsl.impl.ComponentOrFacetImpl <em>Component Or Facet</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imag.mosig.seacs.roboconf.graphDsl.impl.ComponentOrFacetImpl
     * @see fr.imag.mosig.seacs.roboconf.graphDsl.impl.GraphDslPackageImpl#getComponentOrFacet()
     * @generated
     */
    EClass COMPONENT_OR_FACET = eINSTANCE.getComponentOrFacet();

    /**
     * The meta object literal for the '<em><b>Component</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT_OR_FACET__COMPONENT = eINSTANCE.getComponentOrFacet_Component();

    /**
     * The meta object literal for the '<em><b>Facet</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT_OR_FACET__FACET = eINSTANCE.getComponentOrFacet_Facet();

    /**
     * The meta object literal for the '{@link fr.imag.mosig.seacs.roboconf.graphDsl.impl.ComponentImpl <em>Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imag.mosig.seacs.roboconf.graphDsl.impl.ComponentImpl
     * @see fr.imag.mosig.seacs.roboconf.graphDsl.impl.GraphDslPackageImpl#getComponent()
     * @generated
     */
    EClass COMPONENT = eINSTANCE.getComponent();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__PROPERTIES = eINSTANCE.getComponent_Properties();

    /**
     * The meta object literal for the '{@link fr.imag.mosig.seacs.roboconf.graphDsl.impl.FacetImpl <em>Facet</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imag.mosig.seacs.roboconf.graphDsl.impl.FacetImpl
     * @see fr.imag.mosig.seacs.roboconf.graphDsl.impl.GraphDslPackageImpl#getFacet()
     * @generated
     */
    EClass FACET = eINSTANCE.getFacet();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FACET__NAME = eINSTANCE.getFacet_Name();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FACET__PROPERTIES = eINSTANCE.getFacet_Properties();

    /**
     * The meta object literal for the '{@link fr.imag.mosig.seacs.roboconf.graphDsl.impl.ComponentPropertiesImpl <em>Component Properties</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imag.mosig.seacs.roboconf.graphDsl.impl.ComponentPropertiesImpl
     * @see fr.imag.mosig.seacs.roboconf.graphDsl.impl.GraphDslPackageImpl#getComponentProperties()
     * @generated
     */
    EClass COMPONENT_PROPERTIES = eINSTANCE.getComponentProperties();

    /**
     * The meta object literal for the '<em><b>Optional Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT_PROPERTIES__OPTIONAL_PROPERTIES = eINSTANCE.getComponentProperties_OptionalProperties();

    /**
     * The meta object literal for the '<em><b>Installer Property</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT_PROPERTIES__INSTALLER_PROPERTY = eINSTANCE.getComponentProperties_InstallerProperty();

    /**
     * The meta object literal for the '{@link fr.imag.mosig.seacs.roboconf.graphDsl.impl.FacetPropertiesImpl <em>Facet Properties</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imag.mosig.seacs.roboconf.graphDsl.impl.FacetPropertiesImpl
     * @see fr.imag.mosig.seacs.roboconf.graphDsl.impl.GraphDslPackageImpl#getFacetProperties()
     * @generated
     */
    EClass FACET_PROPERTIES = eINSTANCE.getFacetProperties();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FACET_PROPERTIES__PROPERTIES = eINSTANCE.getFacetProperties_Properties();

    /**
     * The meta object literal for the '{@link fr.imag.mosig.seacs.roboconf.graphDsl.impl.FacetPropertyImpl <em>Facet Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imag.mosig.seacs.roboconf.graphDsl.impl.FacetPropertyImpl
     * @see fr.imag.mosig.seacs.roboconf.graphDsl.impl.GraphDslPackageImpl#getFacetProperty()
     * @generated
     */
    EClass FACET_PROPERTY = eINSTANCE.getFacetProperty();

    /**
     * The meta object literal for the '<em><b>Children Property</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FACET_PROPERTY__CHILDREN_PROPERTY = eINSTANCE.getFacetProperty_ChildrenProperty();

    /**
     * The meta object literal for the '<em><b>Exports Property</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FACET_PROPERTY__EXPORTS_PROPERTY = eINSTANCE.getFacetProperty_ExportsProperty();

    /**
     * The meta object literal for the '{@link fr.imag.mosig.seacs.roboconf.graphDsl.impl.OptionalPropertyImpl <em>Optional Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imag.mosig.seacs.roboconf.graphDsl.impl.OptionalPropertyImpl
     * @see fr.imag.mosig.seacs.roboconf.graphDsl.impl.GraphDslPackageImpl#getOptionalProperty()
     * @generated
     */
    EClass OPTIONAL_PROPERTY = eINSTANCE.getOptionalProperty();

    /**
     * The meta object literal for the '<em><b>Children Property</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPTIONAL_PROPERTY__CHILDREN_PROPERTY = eINSTANCE.getOptionalProperty_ChildrenProperty();

    /**
     * The meta object literal for the '<em><b>Exports Property</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPTIONAL_PROPERTY__EXPORTS_PROPERTY = eINSTANCE.getOptionalProperty_ExportsProperty();

    /**
     * The meta object literal for the '<em><b>Imports Property</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPTIONAL_PROPERTY__IMPORTS_PROPERTY = eINSTANCE.getOptionalProperty_ImportsProperty();

    /**
     * The meta object literal for the '<em><b>Facets Property</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPTIONAL_PROPERTY__FACETS_PROPERTY = eINSTANCE.getOptionalProperty_FacetsProperty();

    /**
     * The meta object literal for the '<em><b>Extends Property</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPTIONAL_PROPERTY__EXTENDS_PROPERTY = eINSTANCE.getOptionalProperty_ExtendsProperty();

    /**
     * The meta object literal for the '{@link fr.imag.mosig.seacs.roboconf.graphDsl.impl.InstallerPropertyImpl <em>Installer Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imag.mosig.seacs.roboconf.graphDsl.impl.InstallerPropertyImpl
     * @see fr.imag.mosig.seacs.roboconf.graphDsl.impl.GraphDslPackageImpl#getInstallerProperty()
     * @generated
     */
    EClass INSTALLER_PROPERTY = eINSTANCE.getInstallerProperty();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTALLER_PROPERTY__NAME = eINSTANCE.getInstallerProperty_Name();

    /**
     * The meta object literal for the '{@link fr.imag.mosig.seacs.roboconf.graphDsl.impl.ChildrenPropertyImpl <em>Children Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imag.mosig.seacs.roboconf.graphDsl.impl.ChildrenPropertyImpl
     * @see fr.imag.mosig.seacs.roboconf.graphDsl.impl.GraphDslPackageImpl#getChildrenProperty()
     * @generated
     */
    EClass CHILDREN_PROPERTY = eINSTANCE.getChildrenProperty();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHILDREN_PROPERTY__NAME = eINSTANCE.getChildrenProperty_Name();

    /**
     * The meta object literal for the '{@link fr.imag.mosig.seacs.roboconf.graphDsl.impl.ExportsPropertyImpl <em>Exports Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imag.mosig.seacs.roboconf.graphDsl.impl.ExportsPropertyImpl
     * @see fr.imag.mosig.seacs.roboconf.graphDsl.impl.GraphDslPackageImpl#getExportsProperty()
     * @generated
     */
    EClass EXPORTS_PROPERTY = eINSTANCE.getExportsProperty();

    /**
     * The meta object literal for the '<em><b>Exports Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPORTS_PROPERTY__EXPORTS_VARIABLES = eINSTANCE.getExportsProperty_ExportsVariables();

    /**
     * The meta object literal for the '{@link fr.imag.mosig.seacs.roboconf.graphDsl.impl.ExportsVariableImpl <em>Exports Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imag.mosig.seacs.roboconf.graphDsl.impl.ExportsVariableImpl
     * @see fr.imag.mosig.seacs.roboconf.graphDsl.impl.GraphDslPackageImpl#getExportsVariable()
     * @generated
     */
    EClass EXPORTS_VARIABLE = eINSTANCE.getExportsVariable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPORTS_VARIABLE__NAME = eINSTANCE.getExportsVariable_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPORTS_VARIABLE__VALUE = eINSTANCE.getExportsVariable_Value();

    /**
     * The meta object literal for the '{@link fr.imag.mosig.seacs.roboconf.graphDsl.impl.ImportsPropertyImpl <em>Imports Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imag.mosig.seacs.roboconf.graphDsl.impl.ImportsPropertyImpl
     * @see fr.imag.mosig.seacs.roboconf.graphDsl.impl.GraphDslPackageImpl#getImportsProperty()
     * @generated
     */
    EClass IMPORTS_PROPERTY = eINSTANCE.getImportsProperty();

    /**
     * The meta object literal for the '<em><b>Imports Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPORTS_PROPERTY__IMPORTS_VARIABLES = eINSTANCE.getImportsProperty_ImportsVariables();

    /**
     * The meta object literal for the '{@link fr.imag.mosig.seacs.roboconf.graphDsl.impl.ImportsVariableImpl <em>Imports Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imag.mosig.seacs.roboconf.graphDsl.impl.ImportsVariableImpl
     * @see fr.imag.mosig.seacs.roboconf.graphDsl.impl.GraphDslPackageImpl#getImportsVariable()
     * @generated
     */
    EClass IMPORTS_VARIABLE = eINSTANCE.getImportsVariable();

    /**
     * The meta object literal for the '<em><b>Is External</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORTS_VARIABLE__IS_EXTERNAL = eINSTANCE.getImportsVariable_IsExternal();

    /**
     * The meta object literal for the '<em><b>Component Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORTS_VARIABLE__COMPONENT_NAME = eINSTANCE.getImportsVariable_ComponentName();

    /**
     * The meta object literal for the '<em><b>Component Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORTS_VARIABLE__COMPONENT_PROPERTY = eINSTANCE.getImportsVariable_ComponentProperty();

    /**
     * The meta object literal for the '<em><b>Is Optional</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORTS_VARIABLE__IS_OPTIONAL = eINSTANCE.getImportsVariable_IsOptional();

    /**
     * The meta object literal for the '{@link fr.imag.mosig.seacs.roboconf.graphDsl.impl.FacetsPropertyImpl <em>Facets Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imag.mosig.seacs.roboconf.graphDsl.impl.FacetsPropertyImpl
     * @see fr.imag.mosig.seacs.roboconf.graphDsl.impl.GraphDslPackageImpl#getFacetsProperty()
     * @generated
     */
    EClass FACETS_PROPERTY = eINSTANCE.getFacetsProperty();

    /**
     * The meta object literal for the '<em><b>Facets Names</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FACETS_PROPERTY__FACETS_NAMES = eINSTANCE.getFacetsProperty_FacetsNames();

    /**
     * The meta object literal for the '{@link fr.imag.mosig.seacs.roboconf.graphDsl.impl.ExtendsPropertyImpl <em>Extends Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imag.mosig.seacs.roboconf.graphDsl.impl.ExtendsPropertyImpl
     * @see fr.imag.mosig.seacs.roboconf.graphDsl.impl.GraphDslPackageImpl#getExtendsProperty()
     * @generated
     */
    EClass EXTENDS_PROPERTY = eINSTANCE.getExtendsProperty();

    /**
     * The meta object literal for the '<em><b>Extends Names</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXTENDS_PROPERTY__EXTENDS_NAMES = eINSTANCE.getExtendsProperty_ExtendsNames();

  }

} //GraphDslPackage
