package fixture.owl.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.semanticweb.owlapi.model.OWLClass;

import fixture.owl.enumeration.interfaces.FixtureOWLClassTypeEnumInterface;
import fixture.owl.utils.OntoHelper;
import fixture.owl.utils.Utils;


public class OWLClassFactory {
	
	private Map<FixtureOWLClassTypeEnumInterface, OWLClass> map;
	private OntoHelper ontoHelper;
	
	private static OWLClassFactory owlClassFactory;
	
	private OWLClassFactory() {}

	public synchronized static OWLClassFactory  getInstance(OntoHelper ontoHelper) {
		if (owlClassFactory == null) {
			owlClassFactory = new OWLClassFactory();
			owlClassFactory.ontoHelper = ontoHelper;
			populateMap();
		} else {
			if (!owlClassFactory.ontoHelper.equals(ontoHelper)) {
				owlClassFactory.ontoHelper = ontoHelper;
				populateMap();
			}
		}
		return owlClassFactory;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private static void populateMap() {
		owlClassFactory.map = new HashMap<FixtureOWLClassTypeEnumInterface, OWLClass>();
		
		Set<Class<? extends FixtureOWLClassTypeEnumInterface>> subclassesOf = Utils.getSubclassesOf(FixtureOWLClassTypeEnumInterface.class);
		
		for (Class<? extends FixtureOWLClassTypeEnumInterface> klass : subclassesOf) {
			FixtureOWLClassTypeEnumInterface[] enumConstants = klass.getEnumConstants();
			for (FixtureOWLClassTypeEnumInterface fixtureOWLClassTypeEnumInterface : enumConstants) {
				try {
					Enum enumReflection = Enum.valueOf((Class<? extends Enum>) Class.forName(klass.getName()), fixtureOWLClassTypeEnumInterface.toString());
					FixtureOWLClassTypeEnumInterface owlClassTypeEnum = (FixtureOWLClassTypeEnumInterface) enumReflection;
					owlClassFactory.map.put(owlClassTypeEnum, owlClassFactory.ontoHelper.getDataFactory().getOWLClass(owlClassTypeEnum.getLabel(), owlClassFactory.ontoHelper.getPrefixOWLOntologyFormat()));
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public OWLClass get(FixtureOWLClassTypeEnumInterface owlClassTypeEnum) {
		OWLClass owlClass = map.get(owlClassTypeEnum);
		if (owlClass == null) {
			throw new RuntimeException("Cannot create a OWL Class for " + owlClassTypeEnum.getDescription());
		}
		return owlClass;
	}
	
}
