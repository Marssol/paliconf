/**
 */
package fr.imag.mosig.seacs.roboconf.graphDsl.impl;

import fr.imag.mosig.seacs.roboconf.graphDsl.ChildrenProperty;
import fr.imag.mosig.seacs.roboconf.graphDsl.Component;
import fr.imag.mosig.seacs.roboconf.graphDsl.ComponentOrFacet;
import fr.imag.mosig.seacs.roboconf.graphDsl.ComponentProperties;
import fr.imag.mosig.seacs.roboconf.graphDsl.ExportsProperty;
import fr.imag.mosig.seacs.roboconf.graphDsl.ExportsVariable;
import fr.imag.mosig.seacs.roboconf.graphDsl.ExtendsProperty;
import fr.imag.mosig.seacs.roboconf.graphDsl.Facet;
import fr.imag.mosig.seacs.roboconf.graphDsl.FacetProperties;
import fr.imag.mosig.seacs.roboconf.graphDsl.FacetProperty;
import fr.imag.mosig.seacs.roboconf.graphDsl.FacetsProperty;
import fr.imag.mosig.seacs.roboconf.graphDsl.Graph;
import fr.imag.mosig.seacs.roboconf.graphDsl.GraphDslFactory;
import fr.imag.mosig.seacs.roboconf.graphDsl.GraphDslPackage;
import fr.imag.mosig.seacs.roboconf.graphDsl.ImportsProperty;
import fr.imag.mosig.seacs.roboconf.graphDsl.ImportsVariable;
import fr.imag.mosig.seacs.roboconf.graphDsl.InstallerProperty;
import fr.imag.mosig.seacs.roboconf.graphDsl.OptionalProperty;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GraphDslPackageImpl extends EPackageImpl implements GraphDslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass graphEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass componentOrFacetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass componentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass facetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass componentPropertiesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass facetPropertiesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass facetPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass optionalPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass installerPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass childrenPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exportsPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exportsVariableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importsPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importsVariableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass facetsPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass extendsPropertyEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.GraphDslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private GraphDslPackageImpl()
  {
    super(eNS_URI, GraphDslFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link GraphDslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static GraphDslPackage init()
  {
    if (isInited) return (GraphDslPackage)EPackage.Registry.INSTANCE.getEPackage(GraphDslPackage.eNS_URI);

    // Obtain or create and register package
    GraphDslPackageImpl theGraphDslPackage = (GraphDslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GraphDslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GraphDslPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theGraphDslPackage.createPackageContents();

    // Initialize created meta-data
    theGraphDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theGraphDslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(GraphDslPackage.eNS_URI, theGraphDslPackage);
    return theGraphDslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGraph()
  {
    return graphEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGraph_Components()
  {
    return (EReference)graphEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComponentOrFacet()
  {
    return componentOrFacetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentOrFacet_Component()
  {
    return (EReference)componentOrFacetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentOrFacet_Facet()
  {
    return (EReference)componentOrFacetEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComponent()
  {
    return componentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponent_Name()
  {
    return (EAttribute)componentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponent_Properties()
  {
    return (EReference)componentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFacet()
  {
    return facetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFacet_Name()
  {
    return (EAttribute)facetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFacet_Properties()
  {
    return (EReference)facetEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComponentProperties()
  {
    return componentPropertiesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentProperties_OptionalProperties()
  {
    return (EReference)componentPropertiesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentProperties_InstallerProperty()
  {
    return (EReference)componentPropertiesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFacetProperties()
  {
    return facetPropertiesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFacetProperties_Properties()
  {
    return (EReference)facetPropertiesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFacetProperty()
  {
    return facetPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFacetProperty_ChildrenProperty()
  {
    return (EReference)facetPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFacetProperty_ExportsProperty()
  {
    return (EReference)facetPropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOptionalProperty()
  {
    return optionalPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOptionalProperty_ChildrenProperty()
  {
    return (EReference)optionalPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOptionalProperty_ExportsProperty()
  {
    return (EReference)optionalPropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOptionalProperty_ImportsProperty()
  {
    return (EReference)optionalPropertyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOptionalProperty_FacetsProperty()
  {
    return (EReference)optionalPropertyEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOptionalProperty_ExtendsProperty()
  {
    return (EReference)optionalPropertyEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstallerProperty()
  {
    return installerPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInstallerProperty_Name()
  {
    return (EAttribute)installerPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getChildrenProperty()
  {
    return childrenPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getChildrenProperty_Name()
  {
    return (EAttribute)childrenPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExportsProperty()
  {
    return exportsPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExportsProperty_ExportsVariables()
  {
    return (EReference)exportsPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExportsVariable()
  {
    return exportsVariableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExportsVariable_Name()
  {
    return (EAttribute)exportsVariableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExportsVariable_Value()
  {
    return (EAttribute)exportsVariableEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImportsProperty()
  {
    return importsPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImportsProperty_ImportsVariables()
  {
    return (EReference)importsPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImportsVariable()
  {
    return importsVariableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImportsVariable_IsExternal()
  {
    return (EAttribute)importsVariableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImportsVariable_ComponentName()
  {
    return (EAttribute)importsVariableEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImportsVariable_ComponentProperty()
  {
    return (EAttribute)importsVariableEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImportsVariable_IsOptional()
  {
    return (EAttribute)importsVariableEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFacetsProperty()
  {
    return facetsPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFacetsProperty_FacetsNames()
  {
    return (EAttribute)facetsPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExtendsProperty()
  {
    return extendsPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExtendsProperty_ExtendsNames()
  {
    return (EAttribute)extendsPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GraphDslFactory getGraphDslFactory()
  {
    return (GraphDslFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    graphEClass = createEClass(GRAPH);
    createEReference(graphEClass, GRAPH__COMPONENTS);

    componentOrFacetEClass = createEClass(COMPONENT_OR_FACET);
    createEReference(componentOrFacetEClass, COMPONENT_OR_FACET__COMPONENT);
    createEReference(componentOrFacetEClass, COMPONENT_OR_FACET__FACET);

    componentEClass = createEClass(COMPONENT);
    createEAttribute(componentEClass, COMPONENT__NAME);
    createEReference(componentEClass, COMPONENT__PROPERTIES);

    facetEClass = createEClass(FACET);
    createEAttribute(facetEClass, FACET__NAME);
    createEReference(facetEClass, FACET__PROPERTIES);

    componentPropertiesEClass = createEClass(COMPONENT_PROPERTIES);
    createEReference(componentPropertiesEClass, COMPONENT_PROPERTIES__OPTIONAL_PROPERTIES);
    createEReference(componentPropertiesEClass, COMPONENT_PROPERTIES__INSTALLER_PROPERTY);

    facetPropertiesEClass = createEClass(FACET_PROPERTIES);
    createEReference(facetPropertiesEClass, FACET_PROPERTIES__PROPERTIES);

    facetPropertyEClass = createEClass(FACET_PROPERTY);
    createEReference(facetPropertyEClass, FACET_PROPERTY__CHILDREN_PROPERTY);
    createEReference(facetPropertyEClass, FACET_PROPERTY__EXPORTS_PROPERTY);

    optionalPropertyEClass = createEClass(OPTIONAL_PROPERTY);
    createEReference(optionalPropertyEClass, OPTIONAL_PROPERTY__CHILDREN_PROPERTY);
    createEReference(optionalPropertyEClass, OPTIONAL_PROPERTY__EXPORTS_PROPERTY);
    createEReference(optionalPropertyEClass, OPTIONAL_PROPERTY__IMPORTS_PROPERTY);
    createEReference(optionalPropertyEClass, OPTIONAL_PROPERTY__FACETS_PROPERTY);
    createEReference(optionalPropertyEClass, OPTIONAL_PROPERTY__EXTENDS_PROPERTY);

    installerPropertyEClass = createEClass(INSTALLER_PROPERTY);
    createEAttribute(installerPropertyEClass, INSTALLER_PROPERTY__NAME);

    childrenPropertyEClass = createEClass(CHILDREN_PROPERTY);
    createEAttribute(childrenPropertyEClass, CHILDREN_PROPERTY__NAME);

    exportsPropertyEClass = createEClass(EXPORTS_PROPERTY);
    createEReference(exportsPropertyEClass, EXPORTS_PROPERTY__EXPORTS_VARIABLES);

    exportsVariableEClass = createEClass(EXPORTS_VARIABLE);
    createEAttribute(exportsVariableEClass, EXPORTS_VARIABLE__NAME);
    createEAttribute(exportsVariableEClass, EXPORTS_VARIABLE__VALUE);

    importsPropertyEClass = createEClass(IMPORTS_PROPERTY);
    createEReference(importsPropertyEClass, IMPORTS_PROPERTY__IMPORTS_VARIABLES);

    importsVariableEClass = createEClass(IMPORTS_VARIABLE);
    createEAttribute(importsVariableEClass, IMPORTS_VARIABLE__IS_EXTERNAL);
    createEAttribute(importsVariableEClass, IMPORTS_VARIABLE__COMPONENT_NAME);
    createEAttribute(importsVariableEClass, IMPORTS_VARIABLE__COMPONENT_PROPERTY);
    createEAttribute(importsVariableEClass, IMPORTS_VARIABLE__IS_OPTIONAL);

    facetsPropertyEClass = createEClass(FACETS_PROPERTY);
    createEAttribute(facetsPropertyEClass, FACETS_PROPERTY__FACETS_NAMES);

    extendsPropertyEClass = createEClass(EXTENDS_PROPERTY);
    createEAttribute(extendsPropertyEClass, EXTENDS_PROPERTY__EXTENDS_NAMES);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(graphEClass, Graph.class, "Graph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGraph_Components(), this.getComponentOrFacet(), null, "components", null, 0, -1, Graph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(componentOrFacetEClass, ComponentOrFacet.class, "ComponentOrFacet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getComponentOrFacet_Component(), this.getComponent(), null, "component", null, 0, 1, ComponentOrFacet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponentOrFacet_Facet(), this.getFacet(), null, "facet", null, 0, 1, ComponentOrFacet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getComponent_Name(), ecorePackage.getEString(), "name", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponent_Properties(), this.getComponentProperties(), null, "properties", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(facetEClass, Facet.class, "Facet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFacet_Name(), ecorePackage.getEString(), "name", null, 0, 1, Facet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFacet_Properties(), this.getFacetProperties(), null, "properties", null, 0, 1, Facet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(componentPropertiesEClass, ComponentProperties.class, "ComponentProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getComponentProperties_OptionalProperties(), this.getOptionalProperty(), null, "optionalProperties", null, 0, -1, ComponentProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponentProperties_InstallerProperty(), this.getInstallerProperty(), null, "installerProperty", null, 0, 1, ComponentProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(facetPropertiesEClass, FacetProperties.class, "FacetProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFacetProperties_Properties(), this.getFacetProperty(), null, "properties", null, 0, -1, FacetProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(facetPropertyEClass, FacetProperty.class, "FacetProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFacetProperty_ChildrenProperty(), this.getChildrenProperty(), null, "childrenProperty", null, 0, 1, FacetProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFacetProperty_ExportsProperty(), this.getExportsProperty(), null, "exportsProperty", null, 0, 1, FacetProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(optionalPropertyEClass, OptionalProperty.class, "OptionalProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOptionalProperty_ChildrenProperty(), this.getChildrenProperty(), null, "childrenProperty", null, 0, 1, OptionalProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOptionalProperty_ExportsProperty(), this.getExportsProperty(), null, "exportsProperty", null, 0, 1, OptionalProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOptionalProperty_ImportsProperty(), this.getImportsProperty(), null, "importsProperty", null, 0, 1, OptionalProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOptionalProperty_FacetsProperty(), this.getFacetsProperty(), null, "facetsProperty", null, 0, 1, OptionalProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOptionalProperty_ExtendsProperty(), this.getExtendsProperty(), null, "extendsProperty", null, 0, 1, OptionalProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(installerPropertyEClass, InstallerProperty.class, "InstallerProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInstallerProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, InstallerProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(childrenPropertyEClass, ChildrenProperty.class, "ChildrenProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getChildrenProperty_Name(), ecorePackage.getEString(), "name", null, 0, -1, ChildrenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exportsPropertyEClass, ExportsProperty.class, "ExportsProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExportsProperty_ExportsVariables(), this.getExportsVariable(), null, "exportsVariables", null, 0, -1, ExportsProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exportsVariableEClass, ExportsVariable.class, "ExportsVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExportsVariable_Name(), ecorePackage.getEString(), "name", null, 0, 1, ExportsVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExportsVariable_Value(), ecorePackage.getEInt(), "value", null, 0, 1, ExportsVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importsPropertyEClass, ImportsProperty.class, "ImportsProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getImportsProperty_ImportsVariables(), this.getImportsVariable(), null, "importsVariables", null, 0, -1, ImportsProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importsVariableEClass, ImportsVariable.class, "ImportsVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImportsVariable_IsExternal(), ecorePackage.getEBoolean(), "isExternal", null, 0, 1, ImportsVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImportsVariable_ComponentName(), ecorePackage.getEString(), "componentName", null, 0, 1, ImportsVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImportsVariable_ComponentProperty(), ecorePackage.getEString(), "componentProperty", null, 0, 1, ImportsVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImportsVariable_IsOptional(), ecorePackage.getEBoolean(), "isOptional", null, 0, 1, ImportsVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(facetsPropertyEClass, FacetsProperty.class, "FacetsProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFacetsProperty_FacetsNames(), ecorePackage.getEString(), "facetsNames", null, 0, -1, FacetsProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(extendsPropertyEClass, ExtendsProperty.class, "ExtendsProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExtendsProperty_ExtendsNames(), ecorePackage.getEString(), "extendsNames", null, 0, -1, ExtendsProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //GraphDslPackageImpl
