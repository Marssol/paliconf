/**
 */
package fr.imag.mosig.seacs.roboconf.graphDsl.util;

import fr.imag.mosig.seacs.roboconf.graphDsl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.imag.mosig.seacs.roboconf.graphDsl.GraphDslPackage
 * @generated
 */
public class GraphDslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static GraphDslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GraphDslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = GraphDslPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GraphDslSwitch<Adapter> modelSwitch =
    new GraphDslSwitch<Adapter>()
    {
      @Override
      public Adapter caseGraph(Graph object)
      {
        return createGraphAdapter();
      }
      @Override
      public Adapter caseComponentOrFacet(ComponentOrFacet object)
      {
        return createComponentOrFacetAdapter();
      }
      @Override
      public Adapter caseComponent(Component object)
      {
        return createComponentAdapter();
      }
      @Override
      public Adapter caseFacet(Facet object)
      {
        return createFacetAdapter();
      }
      @Override
      public Adapter caseComponentProperties(ComponentProperties object)
      {
        return createComponentPropertiesAdapter();
      }
      @Override
      public Adapter caseFacetProperties(FacetProperties object)
      {
        return createFacetPropertiesAdapter();
      }
      @Override
      public Adapter caseFacetProperty(FacetProperty object)
      {
        return createFacetPropertyAdapter();
      }
      @Override
      public Adapter caseOptionalProperty(OptionalProperty object)
      {
        return createOptionalPropertyAdapter();
      }
      @Override
      public Adapter caseInstallerProperty(InstallerProperty object)
      {
        return createInstallerPropertyAdapter();
      }
      @Override
      public Adapter caseChildrenProperty(ChildrenProperty object)
      {
        return createChildrenPropertyAdapter();
      }
      @Override
      public Adapter caseExportsProperty(ExportsProperty object)
      {
        return createExportsPropertyAdapter();
      }
      @Override
      public Adapter caseExportsVariable(ExportsVariable object)
      {
        return createExportsVariableAdapter();
      }
      @Override
      public Adapter caseImportsProperty(ImportsProperty object)
      {
        return createImportsPropertyAdapter();
      }
      @Override
      public Adapter caseImportsVariable(ImportsVariable object)
      {
        return createImportsVariableAdapter();
      }
      @Override
      public Adapter caseFacetsProperty(FacetsProperty object)
      {
        return createFacetsPropertyAdapter();
      }
      @Override
      public Adapter caseExtendsProperty(ExtendsProperty object)
      {
        return createExtendsPropertyAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link fr.imag.mosig.seacs.roboconf.graphDsl.Graph <em>Graph</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.Graph
   * @generated
   */
  public Adapter createGraphAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.imag.mosig.seacs.roboconf.graphDsl.ComponentOrFacet <em>Component Or Facet</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.ComponentOrFacet
   * @generated
   */
  public Adapter createComponentOrFacetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.imag.mosig.seacs.roboconf.graphDsl.Component <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.Component
   * @generated
   */
  public Adapter createComponentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.imag.mosig.seacs.roboconf.graphDsl.Facet <em>Facet</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.Facet
   * @generated
   */
  public Adapter createFacetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.imag.mosig.seacs.roboconf.graphDsl.ComponentProperties <em>Component Properties</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.ComponentProperties
   * @generated
   */
  public Adapter createComponentPropertiesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.imag.mosig.seacs.roboconf.graphDsl.FacetProperties <em>Facet Properties</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.FacetProperties
   * @generated
   */
  public Adapter createFacetPropertiesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.imag.mosig.seacs.roboconf.graphDsl.FacetProperty <em>Facet Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.FacetProperty
   * @generated
   */
  public Adapter createFacetPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.imag.mosig.seacs.roboconf.graphDsl.OptionalProperty <em>Optional Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.OptionalProperty
   * @generated
   */
  public Adapter createOptionalPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.imag.mosig.seacs.roboconf.graphDsl.InstallerProperty <em>Installer Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.InstallerProperty
   * @generated
   */
  public Adapter createInstallerPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.imag.mosig.seacs.roboconf.graphDsl.ChildrenProperty <em>Children Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.ChildrenProperty
   * @generated
   */
  public Adapter createChildrenPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.imag.mosig.seacs.roboconf.graphDsl.ExportsProperty <em>Exports Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.ExportsProperty
   * @generated
   */
  public Adapter createExportsPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.imag.mosig.seacs.roboconf.graphDsl.ExportsVariable <em>Exports Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.ExportsVariable
   * @generated
   */
  public Adapter createExportsVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.imag.mosig.seacs.roboconf.graphDsl.ImportsProperty <em>Imports Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.ImportsProperty
   * @generated
   */
  public Adapter createImportsPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.imag.mosig.seacs.roboconf.graphDsl.ImportsVariable <em>Imports Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.ImportsVariable
   * @generated
   */
  public Adapter createImportsVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.imag.mosig.seacs.roboconf.graphDsl.FacetsProperty <em>Facets Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.FacetsProperty
   * @generated
   */
  public Adapter createFacetsPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.imag.mosig.seacs.roboconf.graphDsl.ExtendsProperty <em>Extends Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.imag.mosig.seacs.roboconf.graphDsl.ExtendsProperty
   * @generated
   */
  public Adapter createExtendsPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //GraphDslAdapterFactory
