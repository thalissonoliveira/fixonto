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
import fixture.owl.swrl.FixtureBuiltin;
import fixture.owl.swrl.FixtureEqualNameFeatureBuiltinHelper;
import fixture.owl.utils.OntoHelper;
import fixture.owl.utils.Utils;

public class RulesAnalyser {
	
	private OntoHelper ontoHelper;
	
	public void run() throws InstantiationException, IllegalAccessException, OWLOntologyCreationException, ClassNotFoundException {
		BuiltInRegistry.instance.registerBuiltIn(FixtureSWRLBuiltinEnum.EQUAL_NAME.getPathUri(), new FixtureBuiltin(new FixtureEqualNameFeatureBuiltinHelper()));
//		BuiltInRegistry.instance.registerBuiltIn(FixtureSWRLBuiltinEnum.EQUAL_NAME.getPathUri(), new FixtureSWRLBuiltin(new FixtureEqualNameSWRLFunction()));
    	ontoHelper = new OntoHelper();
    	ontoHelper.loadOntology(Utils.SPLiSEM_OUTPUT_PATH, Utils.SPLiSEM_OUTPUT_PATH);
    	checkRules();
	}

	private void checkRules() {
		//TODO REFAZER ESSA ESTRUTURA PARA GERAR UM RELATÓRIO DE ERROS GENÉRICO.
		PelletReasoner reasoner = PelletReasonerFactory.getInstance().createReasoner(ontoHelper.getMetaOntology());

		SWRLError[] swrlErrors = new SWRLError[4]; 		
		swrlErrors[0] = RulesConstraintsOWLClassTypeEnum.EQUAL_NAME_FEATURE_RULE.execute(ontoHelper, reasoner);
		swrlErrors[1] = RulesConstraintsOWLClassTypeEnum.EQUAL_NAME_ATTRIBUTE_RULE.execute(ontoHelper, reasoner);
		swrlErrors[2] = RulesConstraintsOWLClassTypeEnum.PARENTAL_INCONSISTENCY.execute(ontoHelper, reasoner);
		swrlErrors[3] = RulesConstraintsOWLClassTypeEnum.CYCLICAL_FEATURE_RELATION.execute(ontoHelper, reasoner);
		
		
		System.out.println("####### CHECK IT OUT! #######");
		
		boolean hasError = false;
		StringBuilder sb = new StringBuilder();
		int index = 0;
		for (SWRLError swrlError : swrlErrors) {
			if (swrlError != null) {
				sb.append(swrlError.getDescription() + "\n");
				hasError = true;
			} else {
				sb.append("GFR" + index +"[OK]" + "\n");
			}
			sb.append(".-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-\n");
			index++;
		}
		
		if (!hasError) {
			System.err.println("[FIXTURE2][LOG] - NENHUMA REGRA FOI VIOLADA NA VERIFICAÇÃO DO MCSC!");
		} else {
			System.out.println(sb.toString());
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
