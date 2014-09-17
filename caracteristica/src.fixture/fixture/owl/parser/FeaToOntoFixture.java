package fixture.owl.parser;

import java.net.URISyntaxException;
import java.util.Set;

import org.semanticweb.owlapi.model.OWLIndividual;
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
import fixture.owl.model.rule.CompositionRule;
import fixture.owl.model.rule.ContextRule;
import fixture.owl.model.rule.Rule;
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
	
	public FeaToOntoFixture() {
		ontoHelper = new OntoHelper();
	}
	
	public void run(SPL spl) {
		//LOAD META-ONTOLOGY
		try {
			ontoHelper.loadMetaOntology();
			feaToOntoFixtureUtils = OWLUtils.getInstance(ontoHelper);
			populateOWL(spl);
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
		
		for (Rule rule : spl.getRules()) {
			if (rule.isCompositionRule()) {
				compositionRule = Utils.getCompositionRuleOf(rule);
				buildOntology(compositionRule);
			} else if(rule.isContextRule()) {
				contextRule = Utils.getContextRuleOf(rule);
				//TODO Sérgio implementar
			}
		}

		
	}
	
	private void buildOntology(CompositionRule compositionRule) {
		OWLIndividual currentCompotionRuleOWL = feaToOntoFixtureUtils.createNewOWLNamedIndividual(compositionRule);//Criação de Indivíduo OWL
		feaToOntoFixtureUtils.addCompositionRuleClassification(currentCompotionRuleOWL);//Classificação de Classe OWL
	}

	private void buildOntology(ContextRoot contextRoot) {
		OWLIndividual currentContextRootOWL = feaToOntoFixtureUtils.createNewOWLNamedIndividual(contextRoot);
		feaToOntoFixtureUtils.addContextRootClassification(currentContextRootOWL);
		
		OWLIndividual currentContextEntityOWL;
		OWLIndividual currentContextInfoOWL;
		for (ContextEntity contextEntity : contextRoot.getContextEntities()) {
			currentContextEntityOWL = feaToOntoFixtureUtils.createNewOWLNamedIndividual(contextEntity);
			feaToOntoFixtureUtils.addContextEntityClassification(currentContextEntityOWL);
			feaToOntoFixtureUtils.addParentalRelationBetweenContextRootAndEntity(currentContextRootOWL, currentContextEntityOWL);
			
			for (ContextInfo contextInfo : contextEntity.getContextInfos()) {
				currentContextInfoOWL = feaToOntoFixtureUtils.createNewOWLNamedIndividual(contextInfo);
				feaToOntoFixtureUtils.addContextInfoClassification(currentContextInfoOWL);
				feaToOntoFixtureUtils.addParentalRelationBetweenContextEntityAndInfo(currentContextEntityOWL, currentContextInfoOWL);
			}
			
		}
		
	}

	private void buildOntology(Feature feature) {
		
		OWLIndividual currentFeatureOwl = feaToOntoFixtureUtils.createNewOWLNamedIndividual(feature);
		OWLIndividual currentFatherFeatureOwl = feaToOntoFixtureUtils.createOWLNamedIndividualFatherFeature(feature);
		
		feaToOntoFixtureUtils.addFeatureClassification(feature, currentFeatureOwl);
		
		if (currentFatherFeatureOwl != null) {
			feaToOntoFixtureUtils.addParentalRelationBetweenFeatures(currentFeatureOwl, currentFatherFeatureOwl);
		}
		
		Set<Attribute> attributes = feature.getAttributes();

		OWLIndividual currentAttributeOwl;
		for (Attribute attribute : attributes) {
			currentAttributeOwl = feaToOntoFixtureUtils.createNewOWLNamedIndividual(attribute);
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

