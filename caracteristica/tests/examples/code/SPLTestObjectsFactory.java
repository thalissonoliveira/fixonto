package examples.code;

import fixture.owl.model.SPL;
import fixture.owl.model.element.Attribute;
import fixture.owl.model.element.Feature;
import fixture.owl.model.element.GroupedFeature;
import fixture.owl.model.element.MandatoryFeature;
import fixture.owl.model.element.OptionalFeature;
import fixture.owl.model.element.RootFeature;
import fixture.owl.model.element.VariationTwo;
import fixture.owl.model.enumeration.ValueType;
import fixture.owl.model.rule.Antecedent;
import fixture.owl.model.rule.CompositionLiteral;
import fixture.owl.model.rule.CompositionRule;

public class SPLTestObjectsFactory {

	
	public static void inserirFeaturesAndCompositionRuleNaLPS(SPL spl) {
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
		f2.addAttribute(attribute);
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
		
		Feature f12 = new MandatoryFeature("MF10",16);
		
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
		
		Antecedent antecedent = new CompositionLiteral("Literal Composição", 21);
		Antecedent consequent = new CompositionLiteral("Literal Composiçao 2", 22);
		
		CompositionRule compositionRule = new CompositionRule("Regra de Composicao 1", 20);
		compositionRule.setAntecedent(antecedent);
		compositionRule.setConsequent(consequent);

	}

}
