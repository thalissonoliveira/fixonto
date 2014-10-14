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
	private int count;
	
	private SPLConceptFactory() {}
	
	public static SPLConceptFactory getFactory() {
		if (factory == null) {
			factory = new SPLConceptFactory();
			factory.count = 0;
		}
		return factory;
	}

	public SPL createSpl(String name) {
		count++;
		return new SPL(name, count);
	}
	
	public MandatoryFeature createMandatoryFeature(String nome) {
		count++;
		return new MandatoryFeature(nome, count);
	}
	
	public OptionalFeature createOptionalFeature(String nome) {
		count++;
		return new OptionalFeature(nome, count);
	}
	
	public RootFeature createRootFeature(String nome) {
		count++;
		return new RootFeature(nome, count);
	}
	
	public VariationTwo createVariationTwo(String nome) {
		count++;
		return new VariationTwo(nome, count);
	}
	
	public GroupedFeature createGroupedFeature(String nome) {
		count++;
		return new GroupedFeature(nome, count);
	}
	
	public Attribute createAttribute(String name) {
		count++;
		return new Attribute(name, count);
	}
	
	public ContextRoot createContextRoot(String name) {
		count++;
		return new ContextRoot(name, count);
	}
	
	public ContextEntity createContextEntity(String name) {
		count++;
		return new ContextEntity(name, count);
	}
	
	public ContextInfo createContextInfo(String name) {
		count++;
		return new ContextInfo(name, count);
	}
	
	public CompositionRule createCompositionRule(String name) {
		count++;
		return new CompositionRule(name, count);
	}
	
	public ContextRule createContextRule(String name) {
		count++;
		return new ContextRule(name, count);
	}
	
	public LogicalExpression createLogicalExpression(String name) {
		count++;
		return new LogicalExpression(name, count);
	}
	
	
	public CompositionLiteral createCompositionLiteral(String name) {
		count++;
		return new CompositionLiteral(name, count);
	}
	
	public RelationalExpression createRelationalExpression(String name) {
		count++;
		return new RelationalExpression(name, count);
	}
	
	public LogicalEvent createLogicalEvent(String name) {
		count++;
		return new LogicalEvent(name, count);
	}
	
	public RelationalEvent createRelationalEvent(String name) {
		count++;
		return new RelationalEvent(name, count);
	}
	
	public LogicalAction createLogicalAction(String name) {
		count++;
		return new LogicalAction(name, count);
	}
	
	public ActionLiteral createActionLiteral(String name) {
		count++;
		return new ActionLiteral(name, count);
	}
	
	public Designate createDesignate(String name) {
		count++;
		return new Designate(name, count);
	}

}

