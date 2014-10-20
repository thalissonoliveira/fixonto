package examples.code;

import fixture.owl.model.SPL;
import fixture.owl.model.element.Attribute;
import fixture.owl.model.element.Feature;
import fixture.owl.model.element.GroupedFeature;
import fixture.owl.model.element.MandatoryFeature;
import fixture.owl.model.element.OptionalFeature;
import fixture.owl.model.element.RootFeature;
import fixture.owl.model.element.VariationTwo;
import fixture.owl.model.enumeration.Presence;
import fixture.owl.model.enumeration.ValueType;
import fixture.owl.model.rule.CompositionLiteral;
import fixture.owl.model.rule.CompositionRule;
import fixture.owl.parser.FeaToOntoFixture;

public class SPLTestObjectsFactory {

	
	public static void inserirFeaturesAndCompositionRuleNaLPS(SPL spl, FeaToOntoFixture fixture) {
		
		
		Attribute attribute = new Attribute("1","ATT1");
		attribute.setValueType(ValueType.TBOOLEAN);
		
		Attribute attribute2 = new Attribute("2","ATT1");
		attribute2.setValueType(ValueType.TINTEGER);
		
		Attribute attribute3 = new Attribute("3","ATT2");
		attribute3.setValueType(ValueType.TINTEGER);
		
		Attribute attribute4 = new Attribute("4","ATT2");
		attribute4.setValueType(ValueType.TINTEGER);
		
		Feature f1 = new RootFeature("5","RF");
		
		Feature f2 = new VariationTwo("6","VT1");
		f2.addAttribute(attribute);
//		f2.addAttribute(attribute2);
		
		Feature f3 = new MandatoryFeature("@elementos.0","MF");
//		f3.addAttribute(attribute3);
//		f3.addAttribute(attribute4);
		
		Feature f4 = new OptionalFeature("@elementos.0.8","OF1");
		Feature f5 = new OptionalFeature("9","OF2");
		Feature f6 = new OptionalFeature("@elementos.010","OF3");
		Feature f7 = new OptionalFeature("11","OF3");
		
		Feature f8 = new VariationTwo("12","VT2");
		Feature f9 = new GroupedFeature("13","GF1");
		Feature f10 = new GroupedFeature("14","GF2");
		Feature f11 = new GroupedFeature("15","GF3");
		
		Feature f12 = new MandatoryFeature("16","MF10");
		
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
		
		f4.addChild(f12);
		
		spl.setSystem((RootFeature) f1);
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
		spl.addElement(f12);
		
		
		CompositionLiteral antecedent = new CompositionLiteral("21","Literal Composição");
		antecedent.setPresence(Presence.PRESENTE);
		antecedent.setFeaturedElement(f4);
		
		CompositionLiteral consequent = new CompositionLiteral("22","Literal Composiçao 2");
		consequent.setPresence(Presence.AUSENTE);
		consequent.setFeaturedElement(f11);
		
		CompositionRule compositionRule = new CompositionRule("23","Regra de Composicao 1");
		
		compositionRule.setAntecedent(antecedent);
		compositionRule.setConsequent(consequent);
		
	}

}
