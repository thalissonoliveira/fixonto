package fixture.owl.model.rule;


public abstract class Action extends Expression {
	
	public Action() {
		super();
	}
	
	public Action(String name, int id) {
		super();
		this.setName(name);
		this.setId(id);
	}
	
	public abstract boolean isActionLiteral();
	public abstract boolean isDesignate();
	public abstract boolean isLogicalAction();
	
}
