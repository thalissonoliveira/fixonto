package fixture.owl.utils;

import java.util.Set;

import org.semanticweb.owlapi.model.AxiomType;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.SWRLAtom;
import org.semanticweb.owlapi.model.SWRLRule;

import com.clarkparsia.pellet.owlapiv3.PelletReasoner;
import com.clarkparsia.pellet.owlapiv3.PelletReasonerFactory;
import com.clarkparsia.pellet.rules.builtins.BuiltInRegistry;

import fixture.owl.enumeration.FixtureSWRLBuiltinEnum;
import fixture.owl.enumeration.OWLObjectPropertyTypeEnum;
import fixture.owl.enumeration.RulesConstraintsOWLClassTypeEnum;
import fixture.owl.factory.OWLClassFactory;
import fixture.owl.factory.OWLObjectPropertyFactory;
import fixture.owl.rules.error.SWRLError;
import fixture.owl.rules.error.SWRLErrorBuilder;
import fixture.owl.swrl.FixtureBuiltin;
import fixture.owl.swrl.FixtureEqualNameFeatureBuiltinHelper;

public class RulesHelper {
	
	private PelletReasoner pelletReasoner;
	
	public RulesHelper(PelletReasoner pelletReasoner) {
		this.pelletReasoner = pelletReasoner;
	}



	@SuppressWarnings("unchecked")
	public void mapRules(OntoHelper ontoHelper) {
		AxiomType<?> type = AxiomType.getAxiomType("Rule");
		OWLOntology metaOntology = ontoHelper.getMetaOntology();
		Set<OWLAxiom> ruleAxioms = (Set<OWLAxiom>) metaOntology.getAxioms(type);
		SWRLRule rule = null;
		for (OWLAxiom ruleAxiom : ruleAxioms) {
			rule = (SWRLRule) ruleAxiom;
			System.out.println(rule);
			Set<SWRLAtom> head = rule.getHead();
			System.out.println(head.size());
//			System.out.println(head);
			for (SWRLAtom swrlAtom : head) {
				System.out.println(swrlAtom);
				Set<OWLClass> classesInSignature = swrlAtom.getClassesInSignature();
				if (classesInSignature.size() == 1) {
//					System.out.println(head);
//					System.out.println(classesInSignature);
//					throw new RuntimeException("SWRL Typo.");
//					execute(ontoHelper, pelletReasoner);
				}
			}
			System.out.println("------------");
		}
	}
	
	public SWRLError execute(OntoHelper ontoHelper, PelletReasoner pelletReasoner) {
		RulesConstraintsOWLClassTypeEnum ruleEnum = RulesConstraintsOWLClassTypeEnum.valueOf("string que vem do axioma");
		
		OWLClass gfrOWLClass = OWLClassFactory.getInstance(ontoHelper).get(RulesConstraintsOWLClassTypeEnum.EQUAL_NAME_FEATURE_RULE);
		OWLObjectProperty hasEqualNameObjectProperty = OWLObjectPropertyFactory.getInstance(ontoHelper).get(OWLObjectPropertyTypeEnum.HAS_EQUAL_NAME);
		return SWRLErrorBuilder.build(ruleEnum, pelletReasoner, gfrOWLClass, hasEqualNameObjectProperty);
	}

	public static void main(String[] args) throws OWLOntologyCreationException {
		OntoHelper ontoHelper = new OntoHelper();
		ontoHelper.loadOntology(Utils.SPLiSEM_OUTPUT_PATH, Utils.SPLiSEM_OUTPUT_PATH);
		
		PelletReasoner reasoner = PelletReasonerFactory.getInstance().createReasoner(ontoHelper.getMetaOntology());
		reasoner.flush();
		
		ontoHelper.saveOntology();
		
		BuiltInRegistry.instance.registerBuiltIn(FixtureSWRLBuiltinEnum.EQUAL_NAME.getPathUri(), new FixtureBuiltin(new FixtureEqualNameFeatureBuiltinHelper()));
		new RulesHelper(reasoner).mapRules(ontoHelper);
	}


}
