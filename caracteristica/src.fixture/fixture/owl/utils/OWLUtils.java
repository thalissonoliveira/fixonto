package fixture.owl.utils;

import java.util.Map;
import java.util.Set;

import org.semanticweb.owlapi.model.AddAxiom;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassAssertionAxiom;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLDataPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLDataPropertyExpression;
import org.semanticweb.owlapi.model.OWLEntity;
import org.semanticweb.owlapi.model.OWLIndividual;
import org.semanticweb.owlapi.model.OWLLiteral;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLObjectPropertyAssertionAxiom;

import fixture.owl.enumeration.ModelOWLClassTypeEnum;
import fixture.owl.enumeration.OWLDataPropertyTypeEnum;
import fixture.owl.enumeration.OWLObjectPropertyTypeEnum;
import fixture.owl.factory.OWLClassFactory;
import fixture.owl.factory.OWLDataPropertyFactory;
import fixture.owl.factory.OWLObjectPropertyFactory;
import fixture.owl.model.element.Feature;
import fixture.owl.model.intefaces.Nameable;

public class OWLUtils {
	
	private static OWLUtils owlUtils;
	private OntoHelper ontoHelper;
	private static OWLClassFactory owlClassFactory;
	private static OWLObjectPropertyFactory owlObjetcPropertyFactory;
	public static double count;
	
	private OWLUtils() {}
	
	public synchronized static OWLUtils getInstance(OntoHelper ontoHelper) {
		if (owlUtils == null) {
			owlUtils = new OWLUtils();
			owlUtils.ontoHelper = ontoHelper;
			initializeAttributes();
		} else {
			if (!owlUtils.ontoHelper.equals(ontoHelper)) {
				owlUtils.ontoHelper = ontoHelper;
				initializeAttributes();
			}
		}
		return owlUtils;
	}

	
	public void addParentalRelationBetweenFeatures(OWLIndividual currentFeatureOwl, OWLIndividual currentFatherFeatureOwl) {
		OWLObjectProperty hasFatherFeatureProperty = owlObjetcPropertyFactory.get(OWLObjectPropertyTypeEnum.HAS_FATHER_FEATURE);
		OWLObjectProperty hasChildFeatureProperty = owlObjetcPropertyFactory.get(OWLObjectPropertyTypeEnum.HAS_CHILD_FEATURE);
		addBilateralRelationToOntology(currentFeatureOwl, currentFatherFeatureOwl, hasFatherFeatureProperty, hasChildFeatureProperty);
	}
	
	public void addContextRootClassification(OWLIndividual currentContextRootOwl) {
		OWLClass contextRootClass = owlClassFactory.get(ModelOWLClassTypeEnum.ROOT_FEATURE);
		addEntityClassificationToOntology(currentContextRootOwl, contextRootClass);
	}
	
	public void addContextEntityClassification(OWLIndividual currentContextEntityOWL) {
		OWLClass contextEntityClass = owlClassFactory.get(ModelOWLClassTypeEnum.CONTEXT_ENTITY);
		addEntityClassificationToOntology(currentContextEntityOWL, contextEntityClass);
	}
	
	public void addContextInfoClassification(OWLIndividual currentContextInfoOWL) {
		OWLClass contextInfoClass = owlClassFactory.get(ModelOWLClassTypeEnum.CONTEXT_INFO);
		addEntityClassificationToOntology(currentContextInfoOWL, contextInfoClass);
	}
	
	public void addAttributeClassification(OWLIndividual currentAttributeOWL) {
		OWLClass attributeClass = owlClassFactory.get(ModelOWLClassTypeEnum.ATTRIBUTE);
		addEntityClassificationToOntology(currentAttributeOWL, attributeClass);
	}

	public void addCompositionRuleClassification(OWLIndividual currentCompotionRuleOWL) {
		OWLClass compositionRuleClass = owlClassFactory.get(ModelOWLClassTypeEnum.COMPOSITION_RULE);
		addEntityClassificationToOntology(currentCompotionRuleOWL, compositionRuleClass);
	}
	
	public Double getCountFromOntology() {
		OWLEntity[] individualCount = ontoHelper.getMetaOntology().getEntitiesInSignature(IRI.create(Utils.META_ONTOLOGY_BASE_URL_SHARP + "count")).toArray(new OWLEntity[1]);
		Set<OWLEntity> entitiesInSignature = ontoHelper.getMetaOntology().getEntitiesInSignature(IRI.create(Utils.META_ONTOLOGY_BASE_URL_SHARP + "hasMaxId"));
		OWLDataProperty[] dataProperthasMaxId = entitiesInSignature.toArray(new OWLDataProperty[1]);
		Map<OWLDataPropertyExpression, Set<OWLLiteral>> dataPropertyValues = ((OWLIndividual) individualCount[0]).getDataPropertyValues(ontoHelper.getMetaOntology());
		Set<OWLLiteral> set = dataPropertyValues.get((OWLDataProperty) dataProperthasMaxId[0]);
		if (set == null || set.isEmpty()) {
			return -1d;
		}
		return Double.valueOf(set.toArray(new OWLLiteral[1])[0].getLiteral());
	}
	
	public void addFeatureClassification(Feature feature, OWLIndividual currentFeatureOwl) {
		if (feature.isMandatoryFeature()) {
			addEntityClassificationToOntology(currentFeatureOwl, owlClassFactory.get(ModelOWLClassTypeEnum.MANDATORY_FEATURE));
		} else if (feature.isOptionalFeature()) {
			addEntityClassificationToOntology(currentFeatureOwl, owlClassFactory.get(ModelOWLClassTypeEnum.OPTIONAL_FEATURE));
		} else if (feature.isRootFeature()) {
			addEntityClassificationToOntology(currentFeatureOwl, owlClassFactory.get(ModelOWLClassTypeEnum.ROOT_FEATURE));
		} else if (feature.isVariatioTwoFeature()) {
			addEntityClassificationToOntology(currentFeatureOwl, owlClassFactory.get(ModelOWLClassTypeEnum.VARIATION_TWO));
		} else if (feature.isGroupedFeature()) {
			addEntityClassificationToOntology(currentFeatureOwl, owlClassFactory.get(ModelOWLClassTypeEnum.GROUPED_FEATURE));
		} else {
			throw new RuntimeException("Erro ao traduzir uma característica para OWL. Tipo de característica inválido.");
		}
	}

	public void addParentalRelationBetweenContextRootAndEntity(OWLIndividual currentContextRootOWL, OWLIndividual currentContextEntityOWL) {
		OWLObjectProperty hasContextEntityProperty = owlObjetcPropertyFactory.get(OWLObjectPropertyTypeEnum.HAS_CONTEXT_ENTITY);
		OWLObjectProperty hasFatherContextRootProperty = owlObjetcPropertyFactory.get(OWLObjectPropertyTypeEnum.HAS_FATHER_CONTEXT_ROOT);
		addBilateralRelationToOntology(currentContextRootOWL, currentContextEntityOWL, hasContextEntityProperty, hasFatherContextRootProperty);
	}
	
	public void addParentalRelationBetweenContextEntityAndInfo(OWLIndividual currentContextEntityOWL, OWLIndividual currentContextInfoOWL) {
		OWLObjectProperty hasContextInfoProperty = owlObjetcPropertyFactory.get(OWLObjectPropertyTypeEnum.HAS_CONTEXT_INFO);
		OWLObjectProperty hasFatherContextEntityProperty = owlObjetcPropertyFactory.get(OWLObjectPropertyTypeEnum.HAS_FATHER_CONTEXT_ENTITY);
		addBilateralRelationToOntology(currentContextEntityOWL, currentContextInfoOWL, hasContextInfoProperty, hasFatherContextEntityProperty);
	}

	public void addParentalRelationBetweenFeatureAndAttribute(OWLIndividual currentFeatureOwl, OWLIndividual currentAttributeOwl) {
		OWLObjectProperty hasAttribute = owlObjetcPropertyFactory.get(OWLObjectPropertyTypeEnum.HAS_ATTRIBUTE);
		addUnilateralRelationToOntology(currentAttributeOwl, currentFeatureOwl, hasAttribute);
	}
	
	public OWLIndividual createOWLNamedIndividualElementAndDataPropertyName(Nameable element) {
		if (element != null) {
			count++;
			OWLNamedIndividual owlNamedIndividual = ontoHelper.getDataFactory().getOWLNamedIndividual(IRI.create(Utils.META_ONTOLOGY_BASE_URL_SHARP + element.getName() + "_" + count));
			addDataPropertyAssertionToOntology(owlNamedIndividual, OWLDataPropertyFactory.getInstance(ontoHelper).get(OWLDataPropertyTypeEnum.HAS_NAME), element.getName());
			return owlNamedIndividual;
		}
		return null;
	}
	
	public OWLIndividual createOWLNamedIndividualFatherFeature(Feature feature) {
		if (feature != null && feature.getFatherFeature() != null) {
			return createOWLNamedIndividualElementAndDataPropertyName(feature.getFatherFeature());
		}
		return null;
	}

	
	@SuppressWarnings("static-access")
	public void addMaxIdCountToOntology() {
		OWLIndividual countIndividual = (OWLIndividual) ontoHelper.getMetaOntology().getEntitiesInSignature(IRI.create(Utils.META_ONTOLOGY_BASE_URL_SHARP + "count")).toArray(new OWLEntity[1])[0];
		OWLDataProperty hasMaxId = (OWLDataProperty) ontoHelper.getMetaOntology().getEntitiesInSignature(IRI.create(Utils.META_ONTOLOGY_BASE_URL_SHARP + "hasMaxId")).toArray(new OWLDataProperty[1])[0];
		
		Map<OWLDataPropertyExpression, Set<OWLLiteral>> dataPropertyValues = countIndividual.getDataPropertyValues(ontoHelper.getMetaOntology());
		Set<OWLLiteral> collectionLiteralCount = dataPropertyValues.get(hasMaxId);
		
		if (collectionLiteralCount != null) {
			Double literalValue = Double.valueOf(collectionLiteralCount.toArray(new OWLLiteral[1])[0].getLiteral());
			removeDataPropertyFromOntology(countIndividual, hasMaxId, literalValue);
		}
		
		addDataPropertyAssertionToOntology(countIndividual, hasMaxId, this.count);
		
	}

	private void removeDataPropertyFromOntology(OWLIndividual countIndividual, OWLDataProperty hasMaxId, Double literalValue) {
		OWLDataPropertyAssertionAxiom ax = ontoHelper.getDataFactory().getOWLDataPropertyAssertionAxiom(hasMaxId, countIndividual, literalValue);
		ontoHelper.getManager().removeAxiom(ontoHelper.getMetaOntology(), ax);
	}

	private void addDataPropertyAssertionToOntology(OWLIndividual individual, OWLDataProperty dataProperty, double value) {
		OWLDataPropertyAssertionAxiom ax = ontoHelper.getDataFactory().getOWLDataPropertyAssertionAxiom(dataProperty, individual, value);
		AddAxiom addAx = new AddAxiom(ontoHelper.getMetaOntology(), ax);
		ontoHelper.getManager().applyChange(addAx);
	}

	private void addDataPropertyAssertionToOntology(OWLIndividual individual, OWLDataProperty dataProperty, String value) {
		OWLDataPropertyAssertionAxiom ax = ontoHelper.getDataFactory().getOWLDataPropertyAssertionAxiom(dataProperty, individual, value);
		AddAxiom addAx = new AddAxiom(ontoHelper.getMetaOntology(), ax);
		ontoHelper.getManager().applyChange(addAx);
	}

	
	//###### PRIVATE UTILS METHODS CALLED BY PROXIES METHODS #########//
	private static void initializeAttributes() {
		owlClassFactory = OWLClassFactory.getInstance(owlUtils.ontoHelper);
		owlObjetcPropertyFactory = OWLObjectPropertyFactory.getInstance(owlUtils.ontoHelper);
	}
	
	private void addEntityClassificationToOntology(OWLIndividual OWLIndividual, OWLClass OWLClass) {
		OWLClassAssertionAxiom featureClassificationAxiom = ontoHelper.getDataFactory().getOWLClassAssertionAxiom(OWLClass, OWLIndividual);
		ontoHelper.getManager().addAxiom(ontoHelper.getMetaOntology(), featureClassificationAxiom);
	}
	
	/**
	 * 
	 * This method relates the parameters p1, p2, p3 following the formula p1[p3]p2
	 * 
	 * @param individualOWL1
	 * @param individualOWL2
	 * @param objectPropertyOWL
	 */
	private void addUnilateralRelationToOntology(OWLIndividual individualOWL1, OWLIndividual individualOWL2, OWLObjectProperty objectPropertyOWL) {
		OWLObjectPropertyAssertionAxiom parentalRelationBetweenFeaturesAssertion;
		AddAxiom addParentalRelationBetweenFeaturesAxiom;
		
		
		
		parentalRelationBetweenFeaturesAssertion = ontoHelper.getDataFactory().getOWLObjectPropertyAssertionAxiom(objectPropertyOWL, individualOWL1, individualOWL2);
		addParentalRelationBetweenFeaturesAxiom = new AddAxiom(ontoHelper.getMetaOntology(), parentalRelationBetweenFeaturesAssertion);
		ontoHelper.getManager().applyChange(addParentalRelationBetweenFeaturesAxiom);
	}

	/**
	 * 
	 * This method relates the parameters p1, p2, p3, p4 following the formulas p1[p3]p2 and p2[p4]p1
	 * 
	 * @param individualOWL1
	 * @param individualOWL2
	 * @param objectPropertyOWL1
	 * @param objectPropertyOWL2
	 */
	private void addBilateralRelationToOntology(OWLIndividual individualOWL1, OWLIndividual individualOWL2, 
			OWLObjectProperty objectPropertyOWL1, OWLObjectProperty objectPropertyOWL2) {
		
		OWLObjectPropertyAssertionAxiom parentalRelationBetweenFeaturesAssertion;
		AddAxiom addParentalRelationBetweenFeaturesAxiom;
		
		parentalRelationBetweenFeaturesAssertion = ontoHelper.getDataFactory().getOWLObjectPropertyAssertionAxiom(objectPropertyOWL1, individualOWL1, individualOWL2);
		addParentalRelationBetweenFeaturesAxiom = new AddAxiom(ontoHelper.getMetaOntology(), parentalRelationBetweenFeaturesAssertion);
		ontoHelper.getManager().applyChange(addParentalRelationBetweenFeaturesAxiom);
		
		parentalRelationBetweenFeaturesAssertion = ontoHelper.getDataFactory().getOWLObjectPropertyAssertionAxiom(objectPropertyOWL2, individualOWL2, individualOWL1);
		addParentalRelationBetweenFeaturesAxiom = new AddAxiom(ontoHelper.getMetaOntology(), parentalRelationBetweenFeaturesAssertion);
		ontoHelper.getManager().applyChange(addParentalRelationBetweenFeaturesAxiom);
	}



}
