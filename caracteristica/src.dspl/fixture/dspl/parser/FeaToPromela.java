package fixture.dspl.parser;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import fixture.owl.factory.SPLConceptFactory;
import fixture.owl.model.SPL;
import fixture.owl.model.element.Feature;
import fixture.owl.model.intefaces.Nameable;
import fixture.owl.utils.DSPLUtils;
import fixture.owl.utils.Utils;
import fmp.featureModel.DSPL;
import fmp.featureModel.FeatureGroup;

public class FeaToPromela {
	
	private DSPL dspl;
	private DSPLUtils dsplUtils;
	private Map<String, Nameable> fixtureOracle;
	private Map<String, fmp.featureModel.Feature> promelaFeatureOracle;
	private Map<String, FeatureGroup> promelaGroupOracle;
	
	public FeaToPromela() {
		super();
		dspl = new DSPL();
		fixtureOracle = new HashMap<String, Nameable>();
		promelaFeatureOracle = new HashMap<String, fmp.featureModel.Feature>();
		promelaGroupOracle = new HashMap<String, FeatureGroup>();
	}

	/**
	 * Used by de EWL file to translate the model in Java objects related to {@link SPL}.
	 * </b>
	 * After that, these java object will be the start point to instantiate objects relatet to {@link DSPL}.
	 * 
	 * 
	 * @return factory to instantiate {@link SPL} concepts classes
	 */
	public SPLConceptFactory getSplConceptFactory() {
		return SPLConceptFactory.getFactory();
	}
	
	public void run(SPL spl) {
		dsplUtils = DSPLUtils.getInstance();
		populateDspl(spl);
		
		dspl.print();
//		CKS cks = new CKS();
//		Parser parser = new Parser(dspl,cks);
//		String promelaCodeGenerated = parser.generatePromelaCodefromDSPL();
//		System.out.println(promelaCodeGenerated);
//		
//		GenerateFiles gen = new GenerateFiles();
//		gen.generatePMLFile(promelaCodeGenerated, "promelaCodeGenerated");
	}

	private void populateDspl(SPL spl) {
		//TODO Finalizar
//		ContextRoot contextRoot;
//		CompositionRule compositionRule;
//		ContextRule contextRule;
		buildDspl(Utils.getRootFeatureOf(spl.getSystem()));
		
		
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
		if (feature.isVariatioTwoFeature()) {
			FeatureGroup featureGroup = dsplUtils.createFeatureGroup(feature);
			addToPromelaGroupOracle(feature.getName(), featureGroup);
		} else {
			fmp.featureModel.Feature currentFeatureDspl = dsplUtils.createFeature(feature);
			dspl.getFeatures().add(currentFeatureDspl);
			addToPromelaFeatureOracle(currentFeatureDspl);
			
			Feature fatherFeature;
			if (feature.isGroupedFeature()) {
				fatherFeature = feature.getFatherFeature().getFatherFeature();
			} else {
				fatherFeature = feature.getFatherFeature();
			}
			if (fatherFeature != null) {
				String fatherName = fatherFeature.getName();
				if (promelaFeatureOracle.containsKey(fatherName)) {
					currentFeatureDspl.setFatherFeature(promelaFeatureOracle.get(fatherName));
				} else {
					throw new RuntimeException("ERRO NO ORÁCULO. VER O MOTIVO DESSA VIAGEM MALUCA (DORGAS)");
				}
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
	
	public Map<String, Nameable> getOracle() {
		return fixtureOracle;
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
			throw new RuntimeException("Problema ao adicionar um elemento Feature ao oráculo.");
		}
	}
	
	public void addToPromelaFeatureOracle(fmp.featureModel.Feature feature) {
		String id = feature.getName();
		if (!promelaFeatureOracle.containsKey(id)) {
			promelaFeatureOracle.put(id, feature);
		} else {
			throw new RuntimeException("Problema ao adicionar um elemento fmp.featureModel.Feature ao oráculo.");
		}
	}
	
	public void addToPromelaGroupOracle(String name, FeatureGroup featureGroup) {
		if (!promelaGroupOracle.containsKey(name)) {
			promelaGroupOracle.put(name, featureGroup);
		} else {
			throw new RuntimeException("Problema ao adicionar um FeatureGroup ao oráculo.");
		}
	}

	
}
