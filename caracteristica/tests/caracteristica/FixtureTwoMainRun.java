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
		
		Attribute attribute = new Attribute("ATT1",1);
		attribute.setValueType(ValueType.TBOOLEAN);
		
		Attribute attribute2 = new Attribute("ATT1",2);
		attribute2.setValueType(ValueType.TINTEGER);
		
		Attribute attribute3 = new Attribute("ATT2",3);
		attribute3.setValueType(ValueType.TINTEGER);
		
		Attribute attribute4 = new Attribute("ATT2",4);
		attribute4.setValueType(ValueType.TINTEGER);
		
		Feature f1 = new RootFeature("RF",5);
		
		Feature f2 = new VariationTwo("VT1",6);
//		f2.addAttribute(attribute);
//		f2.addAttribute(attribute2);
		
		Feature f3 = new MandatoryFeature("MF",7);
//		f3.addAttribute(attribute3);
//		f3.addAttribute(attribute4);
		
		Feature f4 = new OptionalFeature("OF1",8);
		Feature f5 = new OptionalFeature("OF2",9);
		Feature f6 = new OptionalFeature("OF3",10);
		Feature f7 = new OptionalFeature("OF3",11);
		
		Feature f8 = new VariationTwo("VT2",12);
		Feature f9 = new GroupedFeature("GF1",13);
		Feature f10 = new GroupedFeature("GF2",14);
		Feature f11 = new GroupedFeature("GF3",15);
//		Feature f1 = new RootFeature("RootFeatureA");
//		Feature f2 = new VariationTwo("VariationTwoB");
//		Feature f3 = new MandatoryFeature("MandatoryFeatureC");
//		Feature f4 = new OptionalFeature("OptionalFeatureD");
//		Feature f5 = new OptionalFeature("OptionalFeatureE");
//		Feature f6 = new OptionalFeature("OptionalFeatureF");
//		Feature f7 = new OptionalFeature("OptionalFeatureG");
//		
//		Feature f8 = new VariationTwo("VariationTwoC");
//		Feature f9 = new GroupedFeature("GroupedFeatureA");
//		Feature f10 = new GroupedFeature("GroupedFeatureB");
//		Feature f11 = new GroupedFeature("GroupedFeaturec");
		
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
		
		SPL spl = new SPL("TESTE", 13, (RootFeature) f1);
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
