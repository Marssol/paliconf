/**
 */
package fr.imag.mosig.seacs.roboconf.graphDsl.util;

import fr.imag.mosig.seacs.roboconf.graphDsl.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.imag.mosig.seacs.roboconf.graphDsl.GraphDslPackage
 * @generated
 */
public class GraphDslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static GraphDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GraphDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = GraphDslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case GraphDslPackage.GRAPH:
      {
        Graph graph = (Graph)theEObject;
        T result = caseGraph(graph);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraphDslPackage.COMPONENT_OR_FACET:
      {
        ComponentOrFacet componentOrFacet = (ComponentOrFacet)theEObject;
        T result = caseComponentOrFacet(componentOrFacet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraphDslPackage.COMPONENT:
      {
        Component component = (Component)theEObject;
        T result = caseComponent(component);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraphDslPackage.FACET:
      {
        Facet facet = (Facet)theEObject;
        T result = caseFacet(facet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraphDslPackage.COMPONENT_PROPERTIES:
      {
        ComponentProperties componentProperties = (ComponentProperties)theEObject;
        T result = caseComponentProperties(componentProperties);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraphDslPackage.FACET_PROPERTIES:
      {
        FacetProperties facetProperties = (FacetProperties)theEObject;
        T result = caseFacetProperties(facetProperties);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraphDslPackage.FACET_PROPERTY:
      {
        FacetProperty facetProperty = (FacetProperty)theEObject;
        T result = caseFacetProperty(facetProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraphDslPackage.OPTIONAL_PROPERTY:
      {
        OptionalProperty optionalProperty = (OptionalProperty)theEObject;
        T result = caseOptionalProperty(optionalProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraphDslPackage.INSTALLER_PROPERTY:
      {
        InstallerProperty installerProperty = (InstallerProperty)theEObject;
        T result = caseInstallerProperty(installerProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraphDslPackage.CHILDREN_PROPERTY:
      {
        ChildrenProperty childrenProperty = (ChildrenProperty)theEObject;
        T result = caseChildrenProperty(childrenProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraphDslPackage.EXPORTS_PROPERTY:
      {
        ExportsProperty exportsProperty = (ExportsProperty)theEObject;
        T result = caseExportsProperty(exportsProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraphDslPackage.EXPORTS_VARIABLE:
      {
        ExportsVariable exportsVariable = (ExportsVariable)theEObject;
        T result = caseExportsVariable(exportsVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraphDslPackage.IMPORTS_PROPERTY:
      {
        ImportsProperty importsProperty = (ImportsProperty)theEObject;
        T result = caseImportsProperty(importsProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraphDslPackage.IMPORTS_VARIABLE:
      {
        ImportsVariable importsVariable = (ImportsVariable)theEObject;
        T result = caseImportsVariable(importsVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraphDslPackage.FACETS_PROPERTY:
      {
        FacetsProperty facetsProperty = (FacetsProperty)theEObject;
        T result = caseFacetsProperty(facetsProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraphDslPackage.EXTENDS_PROPERTY:
      {
        ExtendsProperty extendsProperty = (ExtendsProperty)theEObject;
        T result = caseExtendsProperty(extendsProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Graph</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Graph</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGraph(Graph object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Component Or Facet</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Component Or Facet</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponentOrFacet(ComponentOrFacet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Component</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponent(Component object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Facet</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Facet</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFacet(Facet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Component Properties</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Component Properties</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponentProperties(ComponentProperties object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Facet Properties</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Facet Properties</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFacetProperties(FacetProperties object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Facet Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Facet Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFacetProperty(FacetProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Optional Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Optional Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOptionalProperty(OptionalProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Installer Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Installer Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstallerProperty(InstallerProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Children Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Children Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChildrenProperty(ChildrenProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exports Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exports Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExportsProperty(ExportsProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exports Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exports Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExportsVariable(ExportsVariable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Imports Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Imports Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImportsProperty(ImportsProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Imports Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Imports Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImportsVariable(ImportsVariable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Facets Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Facets Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFacetsProperty(FacetsProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Extends Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Extends Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExtendsProperty(ExtendsProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //GraphDslSwitch
