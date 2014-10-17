package caracteristica;

import java.net.URISyntaxException;

import org.semanticweb.owlapi.model.OWLOntologyCreationException;

import fixture.owl.model.SPL;
import fixture.owl.model.element.Attribute;
import fixture.owl.model.element.Feature;
import fixture.owl.model.element.GroupedFeature;
import fixture.owl.model.element.MandatoryFeature;
import fixture.owl.model.element.OptionalFeature;
import fixture.owl.model.element.RootFeature;
import fixture.owl.model.element.VariationTwo;
import fixture.owl.model.enumeration.ValueType;
import fixture.owl.parser.FeaToOntoFixture;
import fixture.owl.reasoner.RulesAnalyser;

public class FixtureTwoMainRun {
	
	public static void main(String[] args) throws OWLOntologyCreationException, URISyntaxException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		runFeaToOntoFixtureTest();
		runRulesAnalyser();
//		runCoung();
	}
	
	
	public static void runFeaToOntoFixtureTest() {
		
		
		
		FeaToOntoFixture fixture = new FeaToOntoFixture();
		SPL spl = new SPL("TESTE", 100);
		
		SPLTestObjectsFactory.inserirFeaturesAndCompositionRuleNaLPS(spl);
		
		fixture.run(spl);
	}
	
	
	public static void runRulesAnalyser() throws InstantiationException, IllegalAccessException, OWLOntologyCreationException, ClassNotFoundException {
		RulesAnalyser analyser = new RulesAnalyser();
		analyser.run();
	}
	
//	public static void runCoung() throws OWLOntologyCreationException {
//		OntoHelper ontoHelper = new OntoHelper();
//		ontoHelper.loadOntology(Utils.SPLiSEM_OUTPUT_PATH, Utils.SPLiSEM_OUTPUT_PATH);
//		int countFromOntology = OWLUtils.getInstance(ontoHelper).getCountFromOntology();
//		System.out.println("OI? " + countFromOntology);
//		OWLUtils.getInstance(ontoHelper).addMaxIdCountToOntology();
//		ontoHelper.saveAndRemoveOntology();
//	}
	
}
