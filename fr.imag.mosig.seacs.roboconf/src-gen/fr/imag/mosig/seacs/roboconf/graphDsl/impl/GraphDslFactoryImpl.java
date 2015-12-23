/**
 */
package fr.imag.mosig.seacs.roboconf.graphDsl.impl;

import fr.imag.mosig.seacs.roboconf.graphDsl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GraphDslFactoryImpl extends EFactoryImpl implements GraphDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static GraphDslFactory init()
  {
    try
    {
      GraphDslFactory theGraphDslFactory = (GraphDslFactory)EPackage.Registry.INSTANCE.getEFactory(GraphDslPackage.eNS_URI);
      if (theGraphDslFactory != null)
      {
        return theGraphDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new GraphDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GraphDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case GraphDslPackage.GRAPH: return createGraph();
      case GraphDslPackage.COMPONENT_OR_FACET: return createComponentOrFacet();
      case GraphDslPackage.COMPONENT: return createComponent();
      case GraphDslPackage.FACET: return createFacet();
      case GraphDslPackage.COMPONENT_PROPERTIES: return createComponentProperties();
      case GraphDslPackage.FACET_PROPERTIES: return createFacetProperties();
      case GraphDslPackage.FACET_PROPERTY: return createFacetProperty();
      case GraphDslPackage.OPTIONAL_PROPERTY: return createOptionalProperty();
      case GraphDslPackage.INSTALLER_PROPERTY: return createInstallerProperty();
      case GraphDslPackage.CHILDREN_PROPERTY: return createChildrenProperty();
      case GraphDslPackage.EXPORTS_PROPERTY: return createExportsProperty();
      case GraphDslPackage.EXPORTS_VARIABLE: return createExportsVariable();
      case GraphDslPackage.IMPORTS_PROPERTY: return createImportsProperty();
      case GraphDslPackage.IMPORTS_VARIABLE: return createImportsVariable();
      case GraphDslPackage.FACETS_PROPERTY: return createFacetsProperty();
      case GraphDslPackage.EXTENDS_PROPERTY: return createExtendsProperty();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Graph createGraph()
  {
    GraphImpl graph = new GraphImpl();
    return graph;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentOrFacet createComponentOrFacet()
  {
    ComponentOrFacetImpl componentOrFacet = new ComponentOrFacetImpl();
    return componentOrFacet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component createComponent()
  {
    ComponentImpl component = new ComponentImpl();
    return component;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Facet createFacet()
  {
    FacetImpl facet = new FacetImpl();
    return facet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentProperties createComponentProperties()
  {
    ComponentPropertiesImpl componentProperties = new ComponentPropertiesImpl();
    return componentProperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FacetProperties createFacetProperties()
  {
    FacetPropertiesImpl facetProperties = new FacetPropertiesImpl();
    return facetProperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FacetProperty createFacetProperty()
  {
    FacetPropertyImpl facetProperty = new FacetPropertyImpl();
    return facetProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OptionalProperty createOptionalProperty()
  {
    OptionalPropertyImpl optionalProperty = new OptionalPropertyImpl();
    return optionalProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InstallerProperty createInstallerProperty()
  {
    InstallerPropertyImpl installerProperty = new InstallerPropertyImpl();
    return installerProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChildrenProperty createChildrenProperty()
  {
    ChildrenPropertyImpl childrenProperty = new ChildrenPropertyImpl();
    return childrenProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExportsProperty createExportsProperty()
  {
    ExportsPropertyImpl exportsProperty = new ExportsPropertyImpl();
    return exportsProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExportsVariable createExportsVariable()
  {
    ExportsVariableImpl exportsVariable = new ExportsVariableImpl();
    return exportsVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImportsProperty createImportsProperty()
  {
    ImportsPropertyImpl importsProperty = new ImportsPropertyImpl();
    return importsProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImportsVariable createImportsVariable()
  {
    ImportsVariableImpl importsVariable = new ImportsVariableImpl();
    return importsVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FacetsProperty createFacetsProperty()
  {
    FacetsPropertyImpl facetsProperty = new FacetsPropertyImpl();
    return facetsProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExtendsProperty createExtendsProperty()
  {
    ExtendsPropertyImpl extendsProperty = new ExtendsPropertyImpl();
    return extendsProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GraphDslPackage getGraphDslPackage()
  {
    return (GraphDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static GraphDslPackage getPackage()
  {
    return GraphDslPackage.eINSTANCE;
  }

} //GraphDslFactoryImpl
