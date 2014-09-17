package caracteristica;

import java.net.URISyntaxException;

import org.semanticweb.owlapi.model.OWLOntologyCreationException;

import fixture.owl.model.SPL;
import fixture.owl.model.element.Feature;
import fixture.owl.model.element.GroupedFeature;
import fixture.owl.model.element.MandatoryFeature;
import fixture.owl.model.element.OptionalFeature;
import fixture.owl.model.element.RootFeature;
import fixture.owl.model.element.VariationTwo;
import fixture.owl.parser.FeaToOntoFixture;
import fixture.owl.reasoner.RulesAnalyser;
import fixture.owl.utils.OWLUtils;
import fixture.owl.utils.OntoHelper;
import fixture.owl.utils.Utils;

public class FixtureTwoMainRun {
	
	public static void main(String[] args) throws OWLOntologyCreationException, URISyntaxException {
		runFeaToOntoFixtureTest();
//		runRulesAnalyser();
//		runCoung();
		
	}


	public static void runFeaToOntoFixtureTest() {
		FeaToOntoFixture fixture = new FeaToOntoFixture();
		
		Feature f1 = new RootFeature("RootFeatureA");
		Feature f2 = new VariationTwo("VariationTwoB");
		Feature f3 = new MandatoryFeature("MandatoryFeatureC");
		Feature f4 = new OptionalFeature("OptionalFeatureD");
		Feature f5 = new OptionalFeature("OptionalFeatureE");
		Feature f6 = new OptionalFeature("OptionalFeatureF");
		Feature f7 = new OptionalFeature("OptionalFeatureG");
		
		Feature f8 = new VariationTwo("VariationTwoC");
		Feature f9 = new GroupedFeature("GroupedFeatureA");
		Feature f10 = new GroupedFeature("GroupedFeatureB");
		Feature f11 = new GroupedFeature("GroupedFeatureC");
		
		f1.addChild(f3);
		f1.addChild(f2);
		
		f3.addChild(f6);
		
		f2.addChild(f4);
		f2.addChild(f5);
		
		f4.addChild(f7);
		
		f7.addChild(f8);
		
		f8.addChild(f9);
		f8.addChild(f10);
		f8.addChild(f11);
		
		
		SPL spl = new SPL("TESTE", (RootFeature) f1);
		spl.addElement(f1);
		spl.addElement(f2);
		spl.addElement(f3);
		spl.addElement(f4);
		spl.addElement(f5);
		spl.addElement(f6);
		spl.addElement(f7);
		spl.addElement(f8);
		spl.addElement(f9);
		spl.addElement(f10);
		spl.addElement(f11);
		
		
		fixture.run(spl);
	}
	
	
	public static void runRulesAnalyser() throws OWLOntologyCreationException {
		RulesAnalyser analyser = new RulesAnalyser();
		analyser.run();
	}
	
	public static void runCoung() throws OWLOntologyCreationException {
		OntoHelper ontoHelper = new OntoHelper();
		ontoHelper.loadOntology(Utils.SPLiSEM_OUTPUT_PATH, Utils.SPLiSEM_OUTPUT_PATH);
		Double countFromOntology = OWLUtils.getInstance(ontoHelper).getCountFromOntology();
		System.out.println("OI? " + countFromOntology);
		OWLUtils.getInstance(ontoHelper).addMaxIdCountToOntology();
		ontoHelper.saveAndRemoveOntology();
	}
	
}
