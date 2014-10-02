package fixture.owl.reasoner;

import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.reasoner.Node;
import org.semanticweb.owlapi.reasoner.NodeSet;

import com.clarkparsia.pellet.owlapiv3.PelletReasoner;
import com.clarkparsia.pellet.owlapiv3.PelletReasonerFactory;
import com.clarkparsia.pellet.rules.builtins.BuiltInRegistry;

import fixture.owl.enumeration.FixtureSWRLBuiltinEnum;
import fixture.owl.enumeration.RulesConstraintsOWLClassTypeEnum;
import fixture.owl.rules.error.SWRLError;
import fixture.owl.swrl.FixtureEqualNameSWRLFunction;
import fixture.owl.swrl.FixtureSWRLBuiltin;
import fixture.owl.utils.OntoHelper;
import fixture.owl.utils.Utils;

public class RulesAnalyser {
	
	private OntoHelper ontoHelper;
	
	public void run() throws OWLOntologyCreationException {
		BuiltInRegistry.instance.registerBuiltIn(FixtureSWRLBuiltinEnum.EQUAL_NAME.getPathUri(), new FixtureSWRLBuiltin(new FixtureEqualNameSWRLFunction()));
    	ontoHelper = new OntoHelper();
    	ontoHelper.loadOntology(Utils.SPLiSEM_OUTPUT_PATH, Utils.SPLiSEM_OUTPUT_PATH);
        
    	checkRules();
	
	}

	private void checkRules() {
		PelletReasoner reasoner = PelletReasonerFactory.getInstance().createReasoner(ontoHelper.getMetaOntology());
		SWRLError error = RulesConstraintsOWLClassTypeEnum.PARENTAL_INCONSISTENCY.execute(ontoHelper, reasoner);
		SWRLError error2 = RulesConstraintsOWLClassTypeEnum.EQUAL_NAME_FEATURE_RULE.execute(ontoHelper, reasoner);
		
		if (error == null && error2 == null) {
			System.err.println("RAMMMM! SEM ERRO!");
		} else {
			System.out.println("####### CHECK IT OUT! #######");
			System.out.println(error == null ? "--- 1 - " : error.getDescription());
			System.out.println(error2 == null ? "--- 2 - " : error2.getDescription());
		}
		
//		OWLClass parentalInconsistencyOWLClass = executeRuleOne();
//		reasoner.flush();
//		ontoHelper.saveAndRemoveOntology();
//		
//		System.out.println("PRINTING A SIMPLE RULE AFTER");
//		// get all instances of Person class
//		printReasoning(reasoner, parentalInconsistencyOWLClass);
	}

	@SuppressWarnings("unused")
	private void printReasoning(PelletReasoner reasoner, OWLClass featureOWLClass) {
		NodeSet<OWLNamedIndividual> individualsMandatoryFeature = reasoner.getInstances(featureOWLClass, false);
		for(Node<OWLNamedIndividual> sameInd : individualsMandatoryFeature) {
			// sameInd contains information about the individual (and all other individuals that were inferred to be the same)
			OWLNamedIndividual ind =  sameInd.getRepresentativeElement();
			System.out.println("> " + ind);
			NodeSet<OWLClass> types = reasoner.getTypes(ind, true);		
			for (Node<OWLClass> node : types) {
				System.out.println("node: " + node.getRepresentativeElement().toString());
			}
			System.out.println();
		}
	}
	
}
