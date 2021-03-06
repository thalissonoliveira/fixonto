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

/**
 * 
 * 
 * @author thalissonoliveira
 *
 */
public class RulesAnalyser {
	
	private OntoHelper ontoHelper;
	
	public String run() throws InstantiationException, IllegalAccessException, OWLOntologyCreationException, ClassNotFoundException {
		BuiltInRegistry.instance.registerBuiltIn(FixtureSWRLBuiltinEnum.EQUAL_NAME.getPathUri(), new FixtureBuiltin(new FixtureEqualNameFeatureBuiltinHelper()));
    	ontoHelper = new OntoHelper();
    	ontoHelper.loadOntology(Utils.SPLiSEM_OUTPUT_PATH, Utils.SPLiSEM_OUTPUT_PATH);
    	String message = checkRules();
    	ontoHelper.saveAndRemoveOntology();
    	return message;
	}

	private String checkRules() {
		//TODO REFAZER ESSA ESTRUTURA PARA GERAR UM RELAT�RIO DE ERROS GEN�RICO.
		PelletReasoner reasoner = PelletReasonerFactory.getInstance().createReasoner(ontoHelper.getMetaOntology());
		reasoner.flush();
		
		ontoHelper.saveOntology();
		
		RulesConstraintsOWLClassTypeEnum[] rules = RulesConstraintsOWLClassTypeEnum.values();
		SWRLError[] swrlErrors = new SWRLError[rules.length];
		int indexError = 0;
		for (RulesConstraintsOWLClassTypeEnum rulesConstraintsOWLClassTypeEnum : rules) {
			swrlErrors[indexError] = rulesConstraintsOWLClassTypeEnum.execute(ontoHelper, reasoner);
			indexError++;
		}

		System.out.println("####### CHECK IT OUT! #######");
		
		boolean hasError = false;
		StringBuilder sb = new StringBuilder();
		int index = 0;
		for (SWRLError swrlError : swrlErrors) {
			if (swrlError != null) {
				sb.append(swrlError.getDescription() + "\n");
				hasError = true;
			} else {
				sb.append("RULE" + index +"[OK]" + "\n");
			}
			sb.append(".-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-\n");
			index++;
		}
		
		if (!hasError) {
			System.err.println("[FIXTURE2][LOG] - NENHUMA REGRA FOI VIOLADA NA VERIFICA��O DO MCSC!");
		} else {
			System.out.println(sb.toString());
		}
		
		return sb.toString();
			
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
//		OWLClass parentalInconsistencyOWLClass = executeRuleOne();
//		reasoner.flush();
//		ontoHelper.saveAndRemoveOntology();
//		
//		System.out.println("PRINTING A SIMPLE RULE AFTER");
//		// get all instances of Person class
//		printReasoning(reasoner, parentalInconsistencyOWLClass);
	}
	
}
