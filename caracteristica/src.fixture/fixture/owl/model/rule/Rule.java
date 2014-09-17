package fixture.owl.model.rule;

import fixture.owl.model.intefaces.Nameable;

public abstract class Rule implements Nameable {
	
	private String name;
	
	public Rule() {
		super();
	}
	
	public abstract boolean isCompositionRule();
	public abstract boolean isContextRule();
	
	public Rule(String name) {
		super();
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return this.name;
	}

} // Regra
