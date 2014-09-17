package fixture.owl.factory;

import fixture.owl.model.SPL;
import fixture.owl.model.element.Attribute;
import fixture.owl.model.element.ContextEntity;
import fixture.owl.model.element.ContextInfo;
import fixture.owl.model.element.ContextRoot;
import fixture.owl.model.element.GroupedFeature;
import fixture.owl.model.element.MandatoryFeature;
import fixture.owl.model.element.OptionalFeature;
import fixture.owl.model.element.RootFeature;
import fixture.owl.model.element.VariationTwo;

/**
 * 
 * Singleton class to instantiate elements related to SPL, including SPL itself. 
 * 
 * @author thalissonoliveira
 *
 */
public class SPLConceptFactory {
	
	private static SPLConceptFactory factory;
	
	private SPLConceptFactory() {}
	
	public static SPLConceptFactory getFactory() {
		if (factory == null) {
			factory = new SPLConceptFactory(); 
		}
		return factory;
	}

	public SPL createSpl(String name) {
		return new SPL(name);
	}
	
	public MandatoryFeature createMandatoryFeature(String nome) {
		return new MandatoryFeature(nome);
	}
	
	public OptionalFeature createOptionalFeature(String nome) {
		return new OptionalFeature(nome);
	}
	
	public RootFeature createRootFeature(String nome) {
		return new RootFeature(nome);
	}
	
	public VariationTwo createVariationTwo(String nome) {
		return new VariationTwo(nome);
	}
	
	public GroupedFeature createGroupedFeature(String nome) {
		return new GroupedFeature(nome);
	}
	
	public Attribute createAttribute(String name) {
		return new Attribute(name);
	}
	
	public ContextRoot createContextRoot(String name) {
		return new ContextRoot(name);
	}
	
	public ContextEntity createContextEntity(String name) {
		return new ContextEntity(name);
	}
	
	public ContextInfo createContextInfo(String name) {
		return new ContextInfo(name);
	}
	
}
