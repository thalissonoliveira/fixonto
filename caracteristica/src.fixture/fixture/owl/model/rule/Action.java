package fixture.owl.model.rule;


public abstract class Action extends Expression {
	
	public abstract boolean isActionLiteral();
	public abstract boolean isDesignate();
	public abstract boolean isLogicalAction();
	
}
