package fixture.owl.parser;

import java.util.Map;
import java.util.Set;

import fixture.owl.factory.SPLConceptFactory;
import fixture.owl.model.SPL;
import fixture.owl.model.element.Feature;
import fixture.owl.model.element.RootFeature;
import fixture.owl.model.intefaces.Nameable;
import fixture.owl.utils.DSPLUtils;
import fixture.owl.utils.Utils;
import fmp.contextEvolModel.CKS;
import fmp.featureModel.DSPL;
import fmp.mapping.Parser;
import fmp.utilities.GenerateFiles;

public class FeaToPromela {
	
	private DSPL dspl;
	private DSPLUtils dsplUtils;
	private Map<String, Nameable> fixtureOracle;
	private Map<String, fmp.featureModel.Feature> promelaOracle;
	
	public FeaToPromela() {
		super();
		dspl = new DSPL();
	}

	public SPLConceptFactory getSplConceptFactory() {
		return SPLConceptFactory.getFactory();
	}
	
	public void run(SPL spl) {
		dsplUtils = DSPLUtils.getInstance();
		populateDspl(spl);
		CKS cks = new CKS();
		Parser parser = new Parser(dspl,cks);
		String promelaCodeGenerated = parser.generatePromelaCodefromDSPL();
		System.out.println(promelaCodeGenerated);
		
		GenerateFiles gen = new GenerateFiles();
		gen.generatePMLFile(promelaCodeGenerated, "promelaCodeGenerated");
	}

	private void populateDspl(SPL spl) {
		RootFeature feature = Utils.getRootFeatureOf(spl.getSystem());;
		
		
		//TODO Finalizar
//		ContextRoot contextRoot;
//		CompositionRule compositionRule;
//		ContextRule contextRule;
		
		buildDspl(feature);
		
		
		//TODO Finalizar
//		for (Element element : spl.getElements()) {
//			if (element.isContextRoot()) {
//				contextRoot = Utils.getContextRootOf(element);
//				buildDspl(contextRoot);
//			}
//		}
//		
//		for (Rule rule : spl.getRules()) {
//			if (rule.isCompositionRule()) {
//				compositionRule = Utils.getCompositionRuleOf(rule);
//				buildDspl(compositionRule);
//			} else if(rule.isContextRule()) {
//				contextRule = Utils.getContextRuleOf(rule);
//				buildDspl(contextRule);
//			}
//		}
		
	}
	
	private void buildDspl(Feature feature) {
		
		//TODO Est� dando erro por causa da diferen�a do funcionamento das features agrupadas. J� tenho no��o de como resolver
		//     e esse � o meu pr�ximo passo.
		
		fmp.featureModel.Feature currentFeatureDspl = dsplUtils.createFeature(feature);
		
		dspl.getFeatures().add(currentFeatureDspl);
		
		promelaOracle.put(currentFeatureDspl.getName(), currentFeatureDspl);
		
		Feature fatherFeature = feature.getFatherFeature();
		if (fatherFeature != null) {
			String fatherName = fatherFeature.getName();
			if (promelaOracle.containsKey(fatherName)) {
				currentFeatureDspl.setFatherFeature(promelaOracle.get(fatherName));
			} else {
				throw new RuntimeException("ERRO NO OR�CULO. VER O MOTIVO DESSA VIAGEM MALUCA (DORGAS");
			}
		}
		
		Set<Feature> childrenFeatures = feature.getChildrenFeatures();
		if (!childrenFeatures.isEmpty()) {
			for (Feature childFeature : childrenFeatures) {
				buildDspl(childFeature);
			} 
		} else {
			return;
		}
		
	}
	
//	private void buildDspl(ContextRoot contextRoot) {
//		OWLIndividual currentContextRootOWL = feaToOntoFixtureUtils.createNewOWLNamedIndividual(contextRoot, owlOracle);
//		feaToOntoFixtureUtils.addContextRootClassification(currentContextRootOWL);
//		
//		OWLIndividual currentContextEntityOWL;
//		OWLIndividual currentContextInfoOWL;
//		for (ContextEntity contextEntity : contextRoot.getContextEntities()) {
//			currentContextEntityOWL = feaToOntoFixtureUtils.createNewOWLNamedIndividual(contextEntity, owlOracle);
//			feaToOntoFixtureUtils.addContextEntityClassification(currentContextEntityOWL);
//			feaToOntoFixtureUtils.addParentalRelationBetweenContextRootAndEntity(currentContextRootOWL, currentContextEntityOWL);
//			
//			for (ContextInfo contextInfo : contextEntity.getContextInfos()) {
//				currentContextInfoOWL = feaToOntoFixtureUtils.createNewOWLNamedIndividual(contextInfo, owlOracle);
//				feaToOntoFixtureUtils.addContextInfoClassification(currentContextInfoOWL);
//				feaToOntoFixtureUtils.addParentalRelationBetweenContextEntityAndInfo(currentContextEntityOWL, currentContextInfoOWL);
//			}
//			
//		}
//		
//	}
//	
//	private void buildDspl(CompositionRule compositionRule) {
//		OWLIndividual currentCompositionRuleOWL = feaToOntoFixtureUtils.createNewOWLNamedIndividual(compositionRule, owlOracle);
//		feaToOntoFixtureUtils.addCompositionRuleClassification(currentCompositionRuleOWL);
//		
//		Antecedent antecedent = compositionRule.getAntecedent();
//		OWLIndividual currentAntecedentRuleOWL = feaToOntoFixtureUtils.createNewOWLNamedIndividual(antecedent, owlOracle);
//		feaToOntoFixtureUtils.addAntecedentClassification(antecedent, currentAntecedentRuleOWL);
//		buildOntology(antecedent, currentAntecedentRuleOWL);
//		feaToOntoFixtureUtils.addParentalRelationBetweenCompositionRuleAndAntecedent(currentCompositionRuleOWL, currentAntecedentRuleOWL);
//		
//		
//		Antecedent consequent = compositionRule.getConsequent();
//		OWLIndividual currentConsequentRuleOWL = feaToOntoFixtureUtils.createNewOWLNamedIndividual(consequent, owlOracle);
//		feaToOntoFixtureUtils.addAntecedentClassification(consequent, currentConsequentRuleOWL);
//		buildOntology(consequent, currentAntecedentRuleOWL);
//		feaToOntoFixtureUtils.addParentalRelationBetweenCompositionRuleAndConsequent(currentCompositionRuleOWL, currentConsequentRuleOWL);
//	}
//
//
//	private void buildDspl(ContextRoot contextRoot) {
//		OWLIndividual currentContextRootOWL = feaToOntoFixtureUtils.createNewOWLNamedIndividual(contextRoot, owlOracle);
//		feaToOntoFixtureUtils.addContextRootClassification(currentContextRootOWL);
//		
//		OWLIndividual currentContextEntityOWL;
//		OWLIndividual currentContextInfoOWL;
//		for (ContextEntity contextEntity : contextRoot.getContextEntities()) {
//			currentContextEntityOWL = feaToOntoFixtureUtils.createNewOWLNamedIndividual(contextEntity, owlOracle);
//			feaToOntoFixtureUtils.addContextEntityClassification(currentContextEntityOWL);
//			feaToOntoFixtureUtils.addParentalRelationBetweenContextRootAndEntity(currentContextRootOWL, currentContextEntityOWL);
//			
//			for (ContextInfo contextInfo : contextEntity.getContextInfos()) {
//				currentContextInfoOWL = feaToOntoFixtureUtils.createNewOWLNamedIndividual(contextInfo, owlOracle);
//				feaToOntoFixtureUtils.addContextInfoClassification(currentContextInfoOWL);
//				feaToOntoFixtureUtils.addParentalRelationBetweenContextEntityAndInfo(currentContextEntityOWL, currentContextInfoOWL);
//			}
//			
//		}
//		
//	}
//	
//	private void buildDspl(ContextRule contextRule) {
//		
//		OWLIndividual currentContextRuleOWL = feaToOntoFixtureUtils.createNewOWLNamedIndividual(contextRule, owlOracle);
//		feaToOntoFixtureUtils.addContextRuleClassification(currentContextRuleOWL);
//		
//		Event event = contextRule.getEvent();
//		OWLIndividual currentEventOWL = feaToOntoFixtureUtils.createNewOWLNamedIndividual(event, owlOracle);
//		feaToOntoFixtureUtils.addEventClassification(event, currentEventOWL);
//		buildOntology(event, currentEventOWL);
//		feaToOntoFixtureUtils.addParentalRelationBetweenContextRuleAndEvent(currentContextRuleOWL, currentEventOWL);
//		
//		
//		Action action = contextRule.getAction();
//		OWLIndividual currentActionOWL = feaToOntoFixtureUtils.createNewOWLNamedIndividual(action, owlOracle);
//		feaToOntoFixtureUtils.addActionClassification(action, currentActionOWL);
//		buildOntology(action, currentActionOWL);
//		feaToOntoFixtureUtils.addParentalRelationBetweenContextRuleAndAction(currentContextRuleOWL, currentActionOWL);
//		
//	}
	
	public void addToFixtureOracle(Nameable nameable) {
		String id = nameable.getId();
		if (!fixtureOracle.containsKey(id)) {
			fixtureOracle.put(id, nameable);
		} else {
			throw new RuntimeException("Problema ao adicionar um elemento ao or�culo.");
		}
	}

	
}
