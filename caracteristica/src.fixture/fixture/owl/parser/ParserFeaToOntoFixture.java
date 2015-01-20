package fixture.owl.parser;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLIndividual;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;

import fixture.owl.enumeration.OWLObjectPropertyTypeEnum;
import fixture.owl.enumeration.ObjectRestrictionType;
import fixture.owl.factory.OWLObjectPropertyFactory;
import fixture.owl.factory.SPLConceptFactory;
import fixture.owl.model.SPL;
import fixture.owl.model.element.Attribute;
import fixture.owl.model.element.ContextEntity;
import fixture.owl.model.element.ContextInfo;
import fixture.owl.model.element.ContextRoot;
import fixture.owl.model.element.Feature;
import fixture.owl.model.element.RootFeature;
import fixture.owl.model.enumeration.LogicalOperator;
import fixture.owl.model.intefaces.Element;
import fixture.owl.model.intefaces.Nameable;
import fixture.owl.model.product.Product;
import fixture.owl.model.product.ProductAttribute;
import fixture.owl.model.product.ProductFeature;
import fixture.owl.model.rule.Action;
import fixture.owl.model.rule.ActionLiteral;
import fixture.owl.model.rule.Antecedent;
import fixture.owl.model.rule.CompositionLiteral;
import fixture.owl.model.rule.CompositionRule;
import fixture.owl.model.rule.ContextRule;
import fixture.owl.model.rule.Designate;
import fixture.owl.model.rule.Event;
import fixture.owl.model.rule.LogicalAction;
import fixture.owl.model.rule.LogicalEvent;
import fixture.owl.model.rule.LogicalExpression;
import fixture.owl.model.rule.RelationalEvent;
import fixture.owl.model.rule.RelationalExpression;
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
public class ParserFeaToOntoFixture {
	
	private OntoHelper ontoHelper;
	private OWLUtils feaToOntoFixtureUtils;
	private Map<String, OWLNamedIndividual> owlOracle;
	private Map<String, OWLClass> owlClassOracle;
	private Map<String, Nameable> fixtureOracle;
		
	public ParserFeaToOntoFixture() {
		ontoHelper = new OntoHelper();
		owlOracle = new HashMap<String, OWLNamedIndividual>();
		owlClassOracle = new HashMap<String, OWLClass>();
		fixtureOracle = new HashMap<String, Nameable>();
	}
	
	public void run(SPL spl) {
		//LOAD META-ONTOLOGY
		try {
			ontoHelper.loadMetaOntology();
			feaToOntoFixtureUtils = OWLUtils.getInstance(ontoHelper);
//			Utils.printSPLInfo(spl);
			populateOWL(spl);
			instatiateProducts(spl.getProducts());
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
	
	private void instatiateProducts(Set<Product> products) {
		for (Product product : products) {
			Feature feature = getFeatureByName(product.getName());
			buildOntologyFromProduct(feature);
		}
		
	}
	
	private void buildOntologyFromProduct(Feature feature) {

		OWLIndividual currentFeatureOwl = feaToOntoFixtureUtils.createNewOWLNamedIndividual(feature, owlOracle);
		feaToOntoFixtureUtils.addFeatureFromProductClassification(feature, currentFeatureOwl);
		
		Feature fatherFeature = feature.getFatherFeature();
		if (fatherFeature != null) {
			OWLIndividual currentFatherFeatureOwl = null;
			String fatherId = fatherFeature.getId();
			
			if (owlOracle.containsKey(fatherId)) {
				currentFatherFeatureOwl = owlOracle.get(fatherId);
			} else {
				//TODO Acho que esse c�digo est� errado, pois n�o h� classifica��o da feature nesse ponto. Verificar se esse peda�o de c�digo � chamado. Se for, ver o comportamento.
				currentFatherFeatureOwl = feaToOntoFixtureUtils.createNewOWLNamedIndividual(fatherFeature, owlOracle);
			}
			feaToOntoFixtureUtils.addParentalRelationBetweenFeatures(currentFeatureOwl, currentFatherFeatureOwl);
		}
		
		Set<Attribute> attributes = feature.getAttributes();

		OWLIndividual currentAttributeOwl;
		for (Attribute attribute : attributes) {
			currentAttributeOwl = feaToOntoFixtureUtils.createNewOWLNamedIndividual(attribute, owlOracle);
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

	private void populateOWL(SPL spl) {
		//Declarar todos os conceitos (classes) que vou construir a ontologia
		RootFeature feature = Utils.getRootFeatureOf(spl.getSystem());;
		
		ContextRoot contextRoot;
		CompositionRule compositionRule;
		ContextRule contextRule;
		
		buildOntology(feature);
		feaToOntoFixtureUtils.addDisjuctionBetweenFeatureOWLClasses();
		
		
		for (Element element : spl.getElements()) {
			if (element.isContextRoot()) {
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
				buildOntology(contextRule);
			}
		}
		
		for (Product product : spl.getProducts()) {
			buildOntology(product);
		}
		
	}
	
	private void buildOntology(ProductFeature productFeature) {

		OWLIndividual currentFeatureOwl = feaToOntoFixtureUtils.createNewOWLNamedIndividual(productFeature, owlOracle);
		feaToOntoFixtureUtils.addProductFeatureClassification(productFeature, currentFeatureOwl);
		
		ProductFeature fatherProductFeature = productFeature.getFatherProductFeature();
		if (fatherProductFeature != null) {
			OWLIndividual currentFatherFeatureOwl = null;
			String fatherId = fatherProductFeature.getId();
			
			if (owlOracle.containsKey(fatherId)) {
				currentFatherFeatureOwl = owlOracle.get(fatherId);
			} else {
				//TODO Acho que esse c�digo est� errado, pois n�o h� classifica��o da feature nesse ponto. Verificar se esse peda�o de c�digo � chamado. Se for, ver o comportamento.
				currentFatherFeatureOwl = feaToOntoFixtureUtils.createNewOWLNamedIndividual(fatherProductFeature, owlOracle);
			}
			feaToOntoFixtureUtils.addParentalRelationBetweenProductFeatures(currentFeatureOwl, currentFatherFeatureOwl);
		}
		
		Set<ProductAttribute> attributes = productFeature.getProductAttribute();

		OWLIndividual currentAttributeOwl;
		for (ProductAttribute attribute : attributes) {
			currentAttributeOwl = feaToOntoFixtureUtils.createNewOWLNamedIndividual(attribute, owlOracle);
			feaToOntoFixtureUtils.addProductAttributeClassification(currentAttributeOwl);
			feaToOntoFixtureUtils.addParentalRelationBetweenProductFeatureAndProductAttribute(currentFeatureOwl, currentAttributeOwl);
		}
		
		Set<ProductFeature> childrenFeatures = productFeature.getChildProductFeature();
		if (!childrenFeatures.isEmpty()) {
			for (ProductFeature childFeature : childrenFeatures) {
				buildOntology(childFeature);
			}
		} else {
			return;
		}
		
	}

	private void buildOntology(ContextRule contextRule) {
	
		OWLIndividual currentContextRuleOWL = feaToOntoFixtureUtils.createNewOWLNamedIndividual(contextRule, owlOracle);
		feaToOntoFixtureUtils.addContextRuleClassification(currentContextRuleOWL);
		
		Event event = contextRule.getEvent();
		OWLIndividual currentEventOWL = feaToOntoFixtureUtils.createNewOWLNamedIndividual(event, owlOracle);
		feaToOntoFixtureUtils.addEventClassification(event, currentEventOWL);
		buildOntology(event, currentEventOWL);
		feaToOntoFixtureUtils.addParentalRelationBetweenContextRuleAndEvent(currentContextRuleOWL, currentEventOWL);
		
		
		Action action = contextRule.getAction();
		OWLIndividual currentActionOWL = feaToOntoFixtureUtils.createNewOWLNamedIndividual(action, owlOracle);
		feaToOntoFixtureUtils.addActionClassification(action, currentActionOWL);
		buildOntology(action, currentActionOWL);
		feaToOntoFixtureUtils.addParentalRelationBetweenContextRuleAndAction(currentContextRuleOWL, currentActionOWL);
		
	}

	private void buildOntology(Action action, OWLIndividual currentActionOWL) {
		if (action.isActionLiteral()) {
			ActionLiteral actionLiteral = (ActionLiteral) action;
			feaToOntoFixtureUtils.addPresenceActionLiteralRelation(currentActionOWL, actionLiteral.getPresence().getValue());
			//TODO Nesse momento n�o h� indiv�duos de features
			
			String actionLiteralFeaturedElementId = actionLiteral.getFeaturedElement().getId();
			Nameable currentFeatureElement = fixtureOracle.get(actionLiteralFeaturedElementId);
			String simpleName = currentFeatureElement.getClass().getSimpleName();
			feaToOntoFixtureUtils.addEntityClassificationRestrictionToOntology(currentActionOWL, OWLObjectPropertyFactory.getInstance(ontoHelper).get(OWLObjectPropertyTypeEnum.HAS_FEAUTURED_ELEMENT), ObjectRestrictionType.ONLY_UNIVERSAL,  owlClassOracle.get(actionLiteralFeaturedElementId));
		} else if (action.isDesignate()) {
			Designate designate = (Designate) action;
			feaToOntoFixtureUtils.addRelationBetweenDesignateAndAttribute(currentActionOWL, owlOracle.get(designate.getAttribute().getId()));
			feaToOntoFixtureUtils.addValueDesignateRelation(currentActionOWL, designate.getValue());
			feaToOntoFixtureUtils.addValueTypeDesignateRelation(currentActionOWL, designate.getValueType().getValue());
			
		} else if (action.isLogicalAction()) {
			LogicalAction logicalAction = (LogicalAction) action;
			
			Action leftSideAction = logicalAction.getLeftSideAction();
			OWLIndividual currentLeftSideAction = feaToOntoFixtureUtils.createNewOWLNamedIndividual(leftSideAction, owlOracle);
			feaToOntoFixtureUtils.addParentalRelationBetweenActionAndLeftSideAction(currentActionOWL, currentLeftSideAction);
			
			Action rightSideAction = logicalAction.getRightSideAction();
			OWLIndividual currentRightSideAction = feaToOntoFixtureUtils.createNewOWLNamedIndividual(rightSideAction, owlOracle);
			feaToOntoFixtureUtils.addParentalRelationBetweenActionAndRightSideAction(currentActionOWL, currentRightSideAction);
			buildOntology(leftSideAction, currentLeftSideAction);
			buildOntology(rightSideAction, currentRightSideAction);
			
			feaToOntoFixtureUtils.addLogicalActionOperatorLogicalActionRelation(currentActionOWL, logicalAction.getLogicalActionOperator().getValue());
			
		} else {
			throw new RuntimeException("Action Error.");
		}
	}

	private void buildOntology(Event event, OWLIndividual currentEventOWL) {
		if (event.isLogicalEvent()) {
			LogicalEvent logicalEvent = (LogicalEvent) event;
			
			Event leftSideEvent = logicalEvent.getLeftSideEvent();
			OWLIndividual currentLeftSideEvent = feaToOntoFixtureUtils.createNewOWLNamedIndividual(leftSideEvent, owlOracle);
			feaToOntoFixtureUtils.addParentalRelationBetweenEventAndLeftSideEvent(currentEventOWL, currentLeftSideEvent);
			
			Event rightSideEvent = logicalEvent.getRightSideEvent();
			OWLIndividual currentRightSideEvent = feaToOntoFixtureUtils.createNewOWLNamedIndividual(rightSideEvent, owlOracle);
			feaToOntoFixtureUtils.addParentalRelationBetweenEventAndRightSideEvent(currentEventOWL, currentRightSideEvent);
			
			buildOntology(leftSideEvent, currentLeftSideEvent);
			buildOntology(rightSideEvent, currentRightSideEvent);
			
			LogicalOperator logicalOperator = logicalEvent.getLogicalOperator();
			feaToOntoFixtureUtils.addLogicalOperatorLogicalEventRelation(currentEventOWL, logicalOperator.getValue());
		} else if (event.isRelationalEvent()) {
			RelationalEvent relationalEvent = (RelationalEvent) event;
			
			feaToOntoFixtureUtils.addRelationBetweenRelationalEventAndContextVariable(currentEventOWL, owlOracle.get(relationalEvent.getContextVariable().getId()));
			feaToOntoFixtureUtils.addRelationalOperatorRelationalEventRelation(currentEventOWL, relationalEvent.getRelationalOperator().getValue());
			feaToOntoFixtureUtils.addValueRelationalEventRelation(currentEventOWL, relationalEvent.getValue());
		} else {
			throw new RuntimeException("Event error");
		}
	}

	private void buildOntology(CompositionRule compositionRule) {
		OWLIndividual currentCompositionRuleOWL = feaToOntoFixtureUtils.createNewOWLNamedIndividual(compositionRule, owlOracle);
		feaToOntoFixtureUtils.addCompositionRuleClassification(currentCompositionRuleOWL);
		
		Antecedent antecedent = compositionRule.getAntecedent();
		OWLIndividual currentAntecedentRuleOWL = feaToOntoFixtureUtils.createNewOWLNamedIndividual(antecedent, owlOracle);
		feaToOntoFixtureUtils.addAntecedentClassification(antecedent, currentAntecedentRuleOWL);
		buildOntology(antecedent, currentAntecedentRuleOWL);
		feaToOntoFixtureUtils.addParentalRelationBetweenCompositionRuleAndAntecedent(currentCompositionRuleOWL, currentAntecedentRuleOWL);
		
		
		Antecedent consequent = compositionRule.getConsequent();
		OWLIndividual currentConsequentRuleOWL = feaToOntoFixtureUtils.createNewOWLNamedIndividual(consequent, owlOracle);
		feaToOntoFixtureUtils.addAntecedentClassification(consequent, currentConsequentRuleOWL);
		buildOntology(consequent, currentAntecedentRuleOWL);
		feaToOntoFixtureUtils.addParentalRelationBetweenCompositionRuleAndConsequent(currentCompositionRuleOWL, currentConsequentRuleOWL);
	}

	private void buildOntology(Antecedent antecedent, OWLIndividual currentAntecedentRuleOWL) {
		
		if (antecedent.isCompositionLiteral()) {
			CompositionLiteral compositionLiteral = (CompositionLiteral) antecedent;
			feaToOntoFixtureUtils.addPresenceCompositionLiteralRelation(currentAntecedentRuleOWL, compositionLiteral.getPresence().getValue());
			
			
			String compositionLiteralFeaturedElementId = compositionLiteral.getFeaturedElement().getId();
			Nameable currentFeatureElement = fixtureOracle.get(compositionLiteralFeaturedElementId);
			String simpleName = currentFeatureElement.getClass().getSimpleName();
			feaToOntoFixtureUtils.addEntityClassificationRestrictionToOntology(currentAntecedentRuleOWL, OWLObjectPropertyFactory.getInstance(ontoHelper).get(OWLObjectPropertyTypeEnum.HAS_FEAUTURED_ELEMENT), ObjectRestrictionType.ONLY_UNIVERSAL,  owlClassOracle.get(compositionLiteralFeaturedElementId));
		} else if (antecedent.isLogicalExpression()) {
			LogicalExpression logicalExpression = (LogicalExpression) antecedent;

			Antecedent leftSideComposition = logicalExpression.getLeftSideComposition();
			OWLIndividual currentLeftSideComposition = feaToOntoFixtureUtils.createNewOWLNamedIndividual(leftSideComposition, owlOracle);
			feaToOntoFixtureUtils.addParentalRelationBetweenAntecedentAndLeftSideComposition(currentAntecedentRuleOWL, currentLeftSideComposition);
			
			Antecedent rightSideComposition = logicalExpression.getRightSideComposition();
			OWLIndividual currentRightSideComposition = feaToOntoFixtureUtils.createNewOWLNamedIndividual(rightSideComposition, owlOracle);
			feaToOntoFixtureUtils.addParentalRelationBetweenAntecedentAndRightSideComposition(currentAntecedentRuleOWL, currentRightSideComposition);
			
			buildOntology(leftSideComposition, currentLeftSideComposition);
			buildOntology(rightSideComposition, currentRightSideComposition);
			
			feaToOntoFixtureUtils.addLogicalOperatorLogicalExpressionRelation(currentAntecedentRuleOWL, logicalExpression.getLogicalOperator().getValue());
		} else if (antecedent.isRelationalExpression()) {
			RelationalExpression relationalExpression = (RelationalExpression) antecedent;
			
			feaToOntoFixtureUtils.addRelationBetweenRelationalExpressionAndExpressionVariable(currentAntecedentRuleOWL, owlOracle.get(relationalExpression.getExpressionVariable().getId()));
			feaToOntoFixtureUtils.addRelationalOperatorRelationalExpressionRelation(currentAntecedentRuleOWL, relationalExpression.getRelationalOperator().getValue());
			feaToOntoFixtureUtils.addValueRelationalExpressionRelation(currentAntecedentRuleOWL, relationalExpression.getValue());
		} else {
			throw new RuntimeException("SEE EXAMPLE OF FEATURE.");
		}
		
	}

	private void buildOntology(ContextRoot contextRoot) {
		OWLIndividual currentContextRootOWL = feaToOntoFixtureUtils.createNewOWLNamedIndividual(contextRoot, owlOracle);
		feaToOntoFixtureUtils.addContextRootClassification(currentContextRootOWL);
		
		OWLIndividual currentContextEntityOWL;
		OWLIndividual currentContextInfoOWL;
		for (ContextEntity contextEntity : contextRoot.getContextEntities()) {
			currentContextEntityOWL = feaToOntoFixtureUtils.createNewOWLNamedIndividual(contextEntity, owlOracle);
			feaToOntoFixtureUtils.addContextEntityClassification(currentContextEntityOWL);
			feaToOntoFixtureUtils.addParentalRelationBetweenContextRootAndEntity(currentContextRootOWL, currentContextEntityOWL);
			
			for (ContextInfo contextInfo : contextEntity.getContextInfos()) {
				currentContextInfoOWL = feaToOntoFixtureUtils.createNewOWLNamedIndividual(contextInfo, owlOracle);
				feaToOntoFixtureUtils.addContextInfoClassification(currentContextInfoOWL);
				feaToOntoFixtureUtils.addParentalRelationBetweenContextEntityAndInfo(currentContextEntityOWL, currentContextInfoOWL);
			}
			
		}
		
	}

	private void buildOntology(Feature feature) {
		
		OWLClass createNewOLWClass = feaToOntoFixtureUtils.createNewOLWClass(feature, owlClassOracle);
		feaToOntoFixtureUtils.addSubClassOfClassification(feature, createNewOLWClass);

		Feature fatherFeature = feature.getFatherFeature();
		if (fatherFeature != null) {
			
			OWLClass currentFatherFeatureOwl = null;
			String fatherId = fatherFeature.getId();
			
			if (owlClassOracle.containsKey(fatherId)) {
				currentFatherFeatureOwl = owlClassOracle.get(fatherId);
			} else {
				currentFatherFeatureOwl = feaToOntoFixtureUtils.createNewOLWClass(fatherFeature, owlClassOracle);
			}
			
			feaToOntoFixtureUtils.addParentalRelationBetweenFeatures(createNewOLWClass, currentFatherFeatureOwl);
		}
		
		Set<Attribute> attributes = feature.getAttributes();

		OWLIndividual currentAttributeOwl;
		for (Attribute attribute : attributes) {
			currentAttributeOwl = feaToOntoFixtureUtils.createNewOWLNamedIndividual(attribute, owlOracle);
			feaToOntoFixtureUtils.addAttributeClassification(currentAttributeOwl);
			//TODO Continuar
//			feaToOntoFixtureUtils.addParentalRelationBetweenFeatureAndAttribute(currentFeatureOwl, currentAttributeOwl);
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
	public SPLConceptFactory getSplConceptFactory() {
		return SPLConceptFactory.getFactory();
	}

	public Map<String, Nameable> getOracle() {
		return fixtureOracle;
	}
	
	public Nameable getElementById(String id) {
		Nameable element = getOracle().get(id);
		return element;
	}
	
	public Feature getFeatureByName(String name) {
		for (Nameable nameable : getOracle().values()) {
			if (nameable.getName().equals(name) && nameable instanceof Feature) {
				return (Feature) nameable;
			}
		}
		return null;
	}
	
	public void addToFixtureOracle(Nameable nameable) {
		String id = nameable.getId();
		if (!fixtureOracle.containsKey(id)) {
			fixtureOracle.put(id, nameable);
		} else {
			throw new RuntimeException("Problema ao adicionar um elemento ao or�culo.");
		}
	}
	
}

