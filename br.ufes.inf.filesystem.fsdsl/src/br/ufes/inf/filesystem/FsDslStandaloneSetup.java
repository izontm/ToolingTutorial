
package br.ufes.inf.filesystem;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class FsDslStandaloneSetup extends FsDslStandaloneSetupGenerated{

	public static void doSetup() {
		new FsDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

