package fixture.owl.parser;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.semanticweb.owlapi.model.OWLIndividual;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;

import fixture.owl.factory.SPLConceptFactory;
import fixture.owl.model.SPL;
import fixture.owl.model.element.Attribute;
import fixture.owl.model.element.ContextEntity;
import fixture.owl.model.element.ContextInfo;
import fixture.owl.model.element.ContextRoot;
import fixture.owl.model.element.Feature;
import fixture.owl.model.element.RootFeature;
import fixture.owl.model.intefaces.Element;
import fixture.owl.model.rule.Antecedent;
import fixture.owl.model.rule.CompositionRule;
import fixture.owl.model.rule.ContextRule;
import fixture.owl.utils.OWLUtils;
import fixture.owl.utils.OntoHelper;
import fixture.owl.utils.Utils;

/**
 * 
 * 
 * 
 * @author thalissonoliveira
 *
 */
public class FeaToOntoFixture {
	
	private OntoHelper ontoHelper;
	private OWLUtils feaToOntoFixtureUtils;
	private Map<String, Set<OWLNamedIndividual>> namedIndividualsOracle;
	
	public FeaToOntoFixture() {
		ontoHelper = new OntoHelper();
		namedIndividualsOracle = new HashMap<String, Set<OWLNamedIndividual>>();
	}
	
	public void run(SPL spl) {
		//LOAD META-ONTOLOGY
		try {
			ontoHelper.loadMetaOntology();
			feaToOntoFixtureUtils = OWLUtils.getInstance(ontoHelper);
			populateOWL(spl);
			
			Set<String> keySet = namedIndividualsOracle.keySet();
			for (String key : keySet) {
				System.out.println(namedIndividualsOracle.get(key));
			}
			
			ontoHelper.saveAndRemoveOntology();
			ontoHelper.deleteTempDir();
		} catch (OWLOntologyCreationException e) {
			e.printStackTrace();
			throw new RuntimeException("FIXTURE2[ERROR] - Parse error! See log.");
		} catch (URISyntaxException e) {
			e.printStackTrace();
			throw new RuntimeException("FIXTURE2[ERROR] - Parse error! See log.");
		}
	}
	
	private void populateOWL(SPL spl) {
		//Declarar todos os conceitos (classes) que vou construir a ontologia
		RootFeature feature;
		
		ContextRoot contextRoot;
		CompositionRule compositionRule;
		ContextRule contextRule;
		
		for (Element element : spl.getElements()) {
			if (element.isRootFeature()) {
				feature = Utils.getRootFeatureOf(element);
				buildOntology(feature);
			} else if (element.isContextRoot()) {
				contextRoot = Utils.getContextRootOf(element);
				buildOntology(contextRoot);
			}
			
		}
		
//		for (Rule rule : spl.getRules()) {
//			if (rule.isCompositionRule()) {
//				compositionRule = Utils.getCompositionRuleOf(rule);
//				buildOntology(compositionRule);
//			} else if(rule.isContextRule()) {
//				contextRule = Utils.getContextRuleOf(rule);
//				buildOntology(contextRule);
//			}
//		}
		
	}
	
	private void buildOntology(ContextRule contextRule) {
		//TODO Sérgio implementar
	}

	private void buildOntology(CompositionRule compositionRule) {
		OWLIndividual currentCompositionRuleOWL = feaToOntoFixtureUtils.createNewOWLNamedIndividual(compositionRule, namedIndividualsOracle);
		feaToOntoFixtureUtils.addCompositionRuleClassification(currentCompositionRuleOWL);
		
		Antecedent antecedent = compositionRule.getAntecedent();
		OWLIndividual currentAntecedentRuleOWL = feaToOntoFixtureUtils.createNewOWLNamedIndividual(antecedent, namedIndividualsOracle);
		feaToOntoFixtureUtils.addAntecedentClassification(currentAntecedentRuleOWL);
		feaToOntoFixtureUtils.addParentalRelationBetweenCompositionRuleAndAntecedent(currentCompositionRuleOWL, currentAntecedentRuleOWL);
		
		buildOntology(antecedent);
		
		Antecedent consequent = compositionRule.getConsequent();
		OWLIndividual currentConsequentRuleOWL = feaToOntoFixtureUtils.createNewOWLNamedIndividual(consequent, namedIndividualsOracle);
		feaToOntoFixtureUtils.addAntecedentClassification(currentConsequentRuleOWL);
		feaToOntoFixtureUtils.addParentalRelationBetweenCompositionRuleAndConsequent(currentCompositionRuleOWL, currentConsequentRuleOWL);
		
		
		
	}

	private void buildOntology(Antecedent antecedent) {
		
//		feaToOntoFixtureUtils.addCompositionRuleClassification(currentCompositionRuleOWL);
//		
//		Antecedent antecedent = compositionRule.getAntecedent();
//		OWLIndividual currentAntecedentRuleOWL = feaToOntoFixtureUtils.createNewOWLNamedIndividual(antecedent);
//		feaToOntoFixtureUtils.addAntecedentClassification(currentAntecedentRuleOWL);
//		feaToOntoFixtureUtils.addParentalRelationBetweenCompositionRuleAndAntecedent(currentCompositionRuleOWL, currentAntecedentRuleOWL);

	}

	private void buildOntology(ContextRoot contextRoot) {
		OWLIndividual currentContextRootOWL = feaToOntoFixtureUtils.createNewOWLNamedIndividual(contextRoot, namedIndividualsOracle);
		feaToOntoFixtureUtils.addContextRootClassification(currentContextRootOWL);
		
		OWLIndividual currentContextEntityOWL;
		OWLIndividual currentContextInfoOWL;
		for (ContextEntity contextEntity : contextRoot.getContextEntities()) {
			currentContextEntityOWL = feaToOntoFixtureUtils.createNewOWLNamedIndividual(contextEntity, namedIndividualsOracle);
			feaToOntoFixtureUtils.addContextEntityClassification(currentContextEntityOWL);
			feaToOntoFixtureUtils.addParentalRelationBetweenContextRootAndEntity(currentContextRootOWL, currentContextEntityOWL);
			
			for (ContextInfo contextInfo : contextEntity.getContextInfos()) {
				currentContextInfoOWL = feaToOntoFixtureUtils.createNewOWLNamedIndividual(contextInfo, namedIndividualsOracle);
				feaToOntoFixtureUtils.addContextInfoClassification(currentContextInfoOWL);
				feaToOntoFixtureUtils.addParentalRelationBetweenContextEntityAndInfo(currentContextEntityOWL, currentContextInfoOWL);
			}
			
		}
		
	}

	private void buildOntology(Feature feature) {
		
		OWLIndividual currentFeatureOwl = feaToOntoFixtureUtils.createNewOWLNamedIndividual(feature, namedIndividualsOracle);
		OWLIndividual currentFatherFeatureOwl = feaToOntoFixtureUtils.createOWLNamedIndividualFatherFeature(feature);
		
		System.out.println("individuo " + currentFeatureOwl.asOWLNamedIndividual().getIRI());
		
		feaToOntoFixtureUtils.addFeatureClassification(feature, currentFeatureOwl);
		
		if (currentFatherFeatureOwl != null) {
			feaToOntoFixtureUtils.addParentalRelationBetweenFeatures(currentFeatureOwl, currentFatherFeatureOwl);
		}
		
		Set<Attribute> attributes = feature.getAttributes();

		OWLIndividual currentAttributeOwl;
		for (Attribute attribute : attributes) {
			currentAttributeOwl = feaToOntoFixtureUtils.createNewOWLNamedIndividual(attribute, namedIndividualsOracle);
			feaToOntoFixtureUtils.addAttributeClassification(currentAttributeOwl);
			feaToOntoFixtureUtils.addParentalRelationBetweenFeatureAndAttribute(currentFeatureOwl, currentAttributeOwl);
		}
		
		Set<Feature> childrenFeatures = feature.getChildrenFeatures();
		if (!childrenFeatures.isEmpty()) {
			for (Feature childFeature : childrenFeatures) {
				buildOntology(childFeature);
			}
		} else {
			return;
		}
		
	}
	
	/**
	 *
	 * This element is for plugin use
	 * 
	 * @return
	 */
	public SPLConceptFactory getSplElementsFactory() {
		return SPLConceptFactory.getFactory();
	}

}

