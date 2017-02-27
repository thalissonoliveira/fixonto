package fixture.dspl.factory;

import java.util.List;

import fixture.owl.model.element.ContextEntity;
import fixture.owl.model.element.ContextInfo;
import fixture.owl.model.element.ContextRoot;
import fixture.owl.model.element.VariationTwo;
import fixture.owl.model.enumeration.MaximalCardinality;
import fixture.owl.model.externalelement.TestCase;
import fixture.owl.model.externalelement.UseCase;
import fixture.owl.model.product.Product;
import fixture.owl.model.product.ProductAttribute;
import fixture.owl.model.product.ProductGroupedFeature;
import fixture.owl.model.product.ProductMandatoryFeature;
import fixture.owl.model.product.ProductOptionalFeature;
import fixture.owl.model.product.ProductVariant;
import fixture.owl.model.product.ProductVariation;
import fixture.owl.model.product.ProductVariationTwo;
import fixture.owl.model.rule.ActionLiteral;
import fixture.owl.model.rule.CompositionLiteral;
import fixture.owl.model.rule.CompositionRule;
import fixture.owl.model.rule.Designate;
import fixture.owl.model.rule.LogicalAction;
import fixture.owl.model.rule.LogicalEvent;
import fixture.owl.model.rule.LogicalExpression;
import fixture.owl.model.rule.RelationalEvent;
import fixture.owl.model.rule.RelationalExpression;
import fmp.featureModel.DSPL;
import fmp.featureModel.Feature;
import fmp.featureModel.FeatureGroup;
import fmp.featureModel.FeatureGroupType;
import fmp.featureModel.FeatureType;

/**
 * 
 * Singleton class to instantiate elements related to SPL, including SPL itself. 
 * 
 * @author thalissonoliveira
 *
 */
public class DSPLConceptFactory {
	
	private static DSPLConceptFactory factory;
	
	private DSPLConceptFactory() {}
	
	public static DSPLConceptFactory getFactory() {
		if (factory == null) {
			factory = new DSPLConceptFactory();
		}
		return factory;
	}

	public DSPL createSpl() {
		return new DSPL();
	}
	
	public Feature createMandatoryFeature(String name) {
		Feature feature = new Feature();
		feature.setName(name);
		feature.setFeatureType(FeatureType.Mandatory);
		return feature;
	}
	
	public Feature createOptionalFeature(String name) {
		Feature feature = new Feature();
		feature.setName(name);
		feature.setFeatureType(FeatureType.Optional);
		return feature;
	}
	
	public Feature createGroupFeature(String name) {
		Feature feature = new Feature();
		feature.setName(name);
		feature.setFeatureType(FeatureType.Group);
		return feature;
	}
	
	public FeatureGroup createFeatureGroup(FeatureGroupType featureGroupType, List<Feature> features) {
		FeatureGroup featureGroup = new FeatureGroup();
		for (Feature feature : features) {
			featureGroup.getFeatures().add(feature);
		}
		featureGroup.setGroupType(featureGroupType);
		return featureGroup;
	}
	
	public FeatureGroup createFeatureGroup(fixture.owl.model.element.Feature feature) {
		FeatureGroup featureGroup = new FeatureGroup();
		if (((VariationTwo) feature).getMaximalCardinality().equals(MaximalCardinality.OR)) {
			featureGroup.setGroupType(FeatureGroupType.OR_Group);
		} else if (((VariationTwo) feature).getMaximalCardinality().equals(MaximalCardinality.XOR)) {
			featureGroup.setGroupType(FeatureGroupType.Alternative_Group);
		} else {
			throw new RuntimeException("Group Feature inválido");
		}
		return featureGroup;
	}
	
	public ContextRoot createContextRoot(String name) {
		return new ContextRoot(name);
	}
	
	public ContextEntity createContextEntity(String name) {
		return new ContextEntity(name);
	}
	
	public ContextInfo createContextInfo(String name) {
		return new ContextInfo(name);
	}
	
	public CompositionRule createCompositionRule(String name) {
		return new CompositionRule(null, name);
	}
	
	public LogicalExpression createLogicalExpression(String id, String name) {
		return new LogicalExpression(id, name);
	}
	
	
	public CompositionLiteral createCompositionLiteral(String id, String name) {
		return new CompositionLiteral(id, name);
	}
	
	public RelationalExpression createRelationalExpression(String id, String name) {
		return new RelationalExpression(id, name);
	}
	
	public LogicalEvent createLogicalEvent(String id, String name) {
		return new LogicalEvent(id, name);
	}
	
	public RelationalEvent createRelationalEvent(String id, String name) {
		return new RelationalEvent(id, name);
	}
	
	public LogicalAction createLogicalAction(String id, String name) {
		return new LogicalAction(id, name);
	}
	
	public ActionLiteral createActionLiteral(String id, String name) {
		return new ActionLiteral(id, name);
	}
	
	public Designate createDesignate(String id, String name) {
		return new Designate(id, name);
	}
	

	public Product createProduct(String id, String name) {
		return new Product(id, name);
	}
	
	public ProductMandatoryFeature createProductMandatoryFeature(String id, String name) {
		return new ProductMandatoryFeature(id, name);
	}
	
	public ProductOptionalFeature createProductOptionalFeature(String id, String name) {
		return new ProductOptionalFeature(id, name);
	}
	
	public ProductVariationTwo createProductVariationTwo(String id, String name) {
		return new ProductVariationTwo(id, name);
	}
	
	public ProductGroupedFeature createProductGroupedFeature(String id, String name) {
		return new ProductGroupedFeature(id, name);
	}
	
	public ProductVariation createProductVariation(String id, String name) {
		return new ProductVariation(id, name);
	}
	
	public ProductVariant createProductVariant(String id, String name) {
		return new ProductVariant(id, name);
	}
	
	public ProductAttribute createProductAttribute(String id, String name) {
		return new ProductAttribute(id, name);
	}
	
	public UseCase createUseCase(String id, String name) {
		return new UseCase(id, name);
	}
	
	public TestCase createTestCase(String id, String name) {
		return new TestCase(id, name);
	}
	
}

