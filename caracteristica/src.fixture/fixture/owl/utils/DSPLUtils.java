package fixture.owl.utils;

import fixture.dspl.factory.DSPLConceptFactory;
import fixture.owl.model.element.Feature;
import fmp.featureModel.FeatureGroup;

public class DSPLUtils {
	
	private static DSPLUtils owlUtils;
	private DSPLUtils() {}
	
	public synchronized static DSPLUtils getInstance() {
		if (owlUtils == null) {
			owlUtils = new DSPLUtils();
		}
		return owlUtils;
	}
	
	public fmp.featureModel.Feature createFeature(Feature feature) {
		if (feature.isMandatoryFeature()) {
			return DSPLConceptFactory.getFactory().createMandatoryFeature(feature.getName());
		} else if (feature.isOptionalFeature()) {
			return DSPLConceptFactory.getFactory().createOptionalFeature(feature.getName());
		} else if (feature.isRootFeature()) {
			return DSPLConceptFactory.getFactory().createMandatoryFeature(feature.getName());
		} else if (feature.isVariatioTwoFeature()) {
			return DSPLConceptFactory.getFactory().createMandatoryFeature(feature.getName());
		} else if (feature.isGroupedFeature()) {
			return DSPLConceptFactory.getFactory().createGroupFeature(feature.getName());
		} else {
			throw new RuntimeException("Error translating a feature to OWL. Invalid Feature Type.");
		}
	}
	
	public FeatureGroup createFeatureGroup(Feature feature) {
		return DSPLConceptFactory.getFactory().createFeatureGroup(feature);
	}

}
