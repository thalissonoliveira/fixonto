package fixture.owl.factory;

import fixture.owl.model.SPL;
import fixture.owl.model.element.Attribute;
import fixture.owl.model.element.ContextEntity;
import fixture.owl.model.element.ContextInfo;
import fixture.owl.model.element.ContextRoot;
import fixture.owl.model.element.GroupedFeature;
import fixture.owl.model.element.MandatoryFeature;
import fixture.owl.model.element.OptionalFeature;
import fixture.owl.model.element.RootFeature;
import fixture.owl.model.element.VariationTwo;
import fixture.owl.model.rule.ActionLiteral;
import fixture.owl.model.rule.CompositionLiteral;
import fixture.owl.model.rule.CompositionRule;
import fixture.owl.model.rule.ContextRule;
import fixture.owl.model.rule.Designate;
import fixture.owl.model.rule.LogicalAction;
import fixture.owl.model.rule.LogicalEvent;
import fixture.owl.model.rule.LogicalExpression;
import fixture.owl.model.rule.RelationalEvent;
import fixture.owl.model.rule.RelationalExpression;

/**
 * 
 * Singleton class to instantiate elements related to SPL, including SPL itself. 
 * 
 * @author thalissonoliveira
 *
 */
public class SPLConceptFactory {
	
	private static SPLConceptFactory factory;
	
	private SPLConceptFactory() {}
	
	public static SPLConceptFactory getFactory() {
		if (factory == null) {
			factory = new SPLConceptFactory(); 
		}
		return factory;
	}

	public SPL createSpl(String name) {
		return new SPL(name);
	}
	
	public MandatoryFeature createMandatoryFeature(String nome) {
		return new MandatoryFeature(nome);
	}
	
	public OptionalFeature createOptionalFeature(String nome) {
		return new OptionalFeature(nome);
	}
	
	public RootFeature createRootFeature(String nome) {
		return new RootFeature(nome);
	}
	
	public VariationTwo createVariationTwo(String nome) {
		return new VariationTwo(nome);
	}
	
	public GroupedFeature createGroupedFeature(String nome) {
		return new GroupedFeature(nome);
	}
	
	public Attribute createAttribute(String name) {
		return new Attribute(name);
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
		return new CompositionRule(name);
	}
	
	public ContextRule createContextRule(String name) {
		return new ContextRule(name);
	}
	
	public LogicalExpression createLogicalExpression(String name) {
		return new LogicalExpression(name);
	}
	
	
	public CompositionLiteral createCompositionLiteral(String name) {
		return new CompositionLiteral(name);
	}
	
	public RelationalExpression createRelationalExpression(String name) {
		return new RelationalExpression(name);
	}
	
	public LogicalEvent createLogicalEvent(String name) {
		return new LogicalEvent(name);
	}
	
	public RelationalEvent createRelationalEvent(String name) {
		return new RelationalEvent(name);
	}
	
	public LogicalAction createLogicalAction(String name) {
		return new LogicalAction(name);
	}
	
	public ActionLiteral createActionLiteral(String name) {
		return new ActionLiteral(name);
	}
	
	public Designate createDesignate(String name) {
		return new Designate(name);
	}

}
