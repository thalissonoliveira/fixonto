package fixture.owl.utils;

import java.util.HashSet;
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
	private OntoHelper ontoHelper;
	
	
	public RulesHelper(OntoHelper ontoHelper, PelletReasoner pelletReasoner) {
		this.ontoHelper = ontoHelper;
		this.pelletReasoner = pelletReasoner;
	}



	@SuppressWarnings("unchecked")
	public Set<SWRLError> processRules() {
		Set<SWRLError> errors = new HashSet<SWRLError>();
		AxiomType<?> type = AxiomType.getAxiomType("Rule");
		OWLOntology metaOntology = ontoHelper.getMetaOntology();
		Set<OWLAxiom> ruleAxioms = (Set<OWLAxiom>) metaOntology.getAxioms(type);
		SWRLRule rule = null;
		SWRLError error;
		for (OWLAxiom ruleAxiom : ruleAxioms) {
			rule = (SWRLRule) ruleAxiom;
			Set<SWRLAtom> head = rule.getHead();
			error = execute(ontoHelper, pelletReasoner, head);
			if (error != null) {
				errors.add(error);
			}
		}
		return errors;
	}
	
	private SWRLError execute(OntoHelper ontoHelper, PelletReasoner pelletReasoner, Set<SWRLAtom> head) {
		
		//TODO PEGAR O HEAD E VERIFICAR SE TEM UM HEAD (CLASS) OU DOIS (CLASS, OBJECT PROPERTY). SE TIVER OBJECT PROPERTY CHAMA O MÉTODO ABAIXO. SENÃO TEM OUTRO MÉTODO NO ERROR BUILDER SÓ COM OWL CLASS
		
		RulesConstraintsOWLClassTypeEnum ruleEnum = RulesConstraintsOWLClassTypeEnum.valueOf("string que vem do axioma");
		OWLObjectPropertyTypeEnum objectPropertyEnum = OWLObjectPropertyTypeEnum.valueOf("string que vem do axioma");
		//Exemplo: OWLObjectPropertyTypeEnum.HAS_EQUAL_NAME
		
		OWLClass gfrOWLClass = OWLClassFactory.getInstance(ontoHelper).get(ruleEnum);
		OWLObjectProperty hasEqualNameObjectProperty = OWLObjectPropertyFactory.getInstance(ontoHelper).get(objectPropertyEnum);
		return SWRLErrorBuilder.build(ruleEnum, pelletReasoner, gfrOWLClass, hasEqualNameObjectProperty);
	}

	public static void main(String[] args) throws OWLOntologyCreationException {
		OntoHelper ontoHelper = new OntoHelper();
		ontoHelper.loadOntology(Utils.SPLiSEM_OUTPUT_PATH, Utils.SPLiSEM_OUTPUT_PATH);
		
		PelletReasoner reasoner = PelletReasonerFactory.getInstance().createReasoner(ontoHelper.getMetaOntology());
		reasoner.flush();
		
		ontoHelper.saveOntology();
		
		BuiltInRegistry.instance.registerBuiltIn(FixtureSWRLBuiltinEnum.EQUAL_NAME.getPathUri(), new FixtureBuiltin(new FixtureEqualNameFeatureBuiltinHelper()));
		new RulesHelper(ontoHelper, reasoner).processRules();
	}


}
