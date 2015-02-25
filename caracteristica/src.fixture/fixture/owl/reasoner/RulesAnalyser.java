package fixture.owl.reasoner;

import java.io.InputStream;
import java.util.Set;

import org.mindswap.pellet.PelletOptions;
import org.mindswap.pellet.jena.PelletInfGraph;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.reasoner.InconsistentOntologyException;
import org.semanticweb.owlapi.reasoner.Node;
import org.semanticweb.owlapi.reasoner.NodeSet;

import com.clarkparsia.pellet.owlapiv3.PelletReasoner;
import com.clarkparsia.pellet.owlapiv3.PelletReasonerFactory;
import com.clarkparsia.pellet.rules.builtins.BuiltInRegistry;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.rdf.model.InfModel;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.reasoner.Reasoner;

import fixture.owl.enumeration.FixtureSWRLBuiltinEnum;
import fixture.owl.enumeration.ModelOWLClassTypeEnum;
import fixture.owl.enumeration.RulesConstraintsOWLClassTypeEnum;
import fixture.owl.factory.OWLClassFactory;
import fixture.owl.rules.error.SWRLError;
import fixture.owl.swrl.FixtureBuiltin;
import fixture.owl.swrl.FixtureEqualNameFeatureBuiltinHelper;
import fixture.owl.utils.OntoHelper;
import fixture.owl.utils.RulesHelper;
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
		//TODO REFAZER ESSA ESTRUTURA PARA GERAR UM RELATÓRIO DE ERROS GENÉRICO.
		PelletReasoner reasoner = PelletReasonerFactory.getInstance().createReasoner(ontoHelper.getMetaOntology());
		reasoner.flush();
		
		ontoHelper.saveOntology();
	
		//TODO Ver uma maneira de fazer essa verificação sem jena (sem parser de owl pra rdf)
//		verifyOntologyConsistency(ontoHelper.getMetaOntology(), reasoner);
		
		//TODO Ler o arquivo e fazer a verificação. Trazer os dados e colocar em um objeto que trabalha com 
		//     objetos (vide código que não contenha )
		
		
		RulesConstraintsOWLClassTypeEnum[] rules = RulesConstraintsOWLClassTypeEnum.values();
		SWRLError[] swrlErrors = new SWRLError[rules.length];
		
		Set<SWRLError> brokenRules = new RulesHelper(ontoHelper, reasoner).processRules();
		
		//TODO VER OUTRA STRING RESULTANTE, POIS DO JEITO QUE ESTÁ TÁ F. MOSTRAR APENAS OS ERROS. NÃO PRECISA MOSTRAR QUE REGRA X DEU CERTO. >>> ITERAR NAS BROKEN RULES
		
//		int indexError = 0;
//		for (RulesConstraintsOWLClassTypeEnum rulesConstraintsOWLClassTypeEnum : rules) {
//			swrlErrors[indexError] = rulesConstraintsOWLClassTypeEnum.execute(ontoHelper, reasoner);
//			indexError++;
//		}
//
//		System.out.println("####### CHECK IT OUT! #######");
//		
//		boolean hasError = false;
//		StringBuilder sb = new StringBuilder();
//		int index = 0;
//		for (SWRLError swrlError : swrlErrors) {
//			if (swrlError != null) {
//				sb.append(swrlError.getDescription() + "\n");
//				hasError = true;
//			} else {
//				sb.append("RULE" + index +"[OK]" + "\n");
//			}
//			sb.append(".-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-\n");
//			index++;
//		}
//		
//		if (!hasError) {
//			System.err.println("[FIXTURE2][LOG] - NENHUMA REGRA FOI VIOLADA NA VERIFICAÇÃO DO MCSC!");
//		} else {
//			System.out.println(sb.toString());
//		}
//		
//		return sb.toString();
		return "";
			
	}
	
	@SuppressWarnings("unused")
	private void verifyOntologyConsistency(OWLOntology ontology, PelletReasoner reasoner) {
		System.out.println("?????????????????");
		
		Resource resource = null;
		
		// create Pellet reasoner
		Reasoner r = org.mindswap.pellet.jena.PelletReasonerFactory.theInstance().create(resource);
		
		// create an empty non-inferencing model
		OntModel rawModel = ModelFactory.createOntologyModel(org.mindswap.pellet.jena.PelletReasonerFactory.THE_SPEC);
		
		PelletOptions.USE_TRACING = true;
		InfModel model = ModelFactory.createInfModel(r, rawModel);
		InputStream spLiSEM = ontoHelper.getSPLiSEM();
		model.read(spLiSEM, null);
		
		PelletInfGraph pellet = (PelletInfGraph) model.getGraph();
		
		
		if( !pellet.isConsistent() ) {
		 Model explanation = pellet.explainInconsistency();
		 explanation.write( System.out );
		}
		// check for inconsistency
		boolean consistent = pellet.isConsistent();
		boolean empty = pellet.isEmpty();
		System.out.println(consistent);
		System.out.println(empty);
		System.out.println("?????????????????");

		
		
		// check for inconsistency
		try {
			
			OWLClass parentalInconsistencyOWLClass = OWLClassFactory.getInstance(ontoHelper).get(ModelOWLClassTypeEnum.GROUPED_FEATURE);
			
			 
//	        reasoner.getInstances(parentalInconsistencyOWLClass, false).getFlattened();
			
			
		} catch (InconsistentOntologyException e) {
			System.out.println("ADENTROU?");
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
		
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
