/*
 * generated by Xtext
 */
package fr.imag.mosig.seacs.roboconf;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class GraphDslStandaloneSetup extends GraphDslStandaloneSetupGenerated{

	public static void doSetup() {
		new GraphDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

