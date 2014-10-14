package fixture.owl.model.rule;

import fixture.owl.model.element.ContextInfo;
import fixture.owl.model.enumeration.RelationalOperator;

public class RelationalEvent extends Event {
	
	private ContextInfo contextVariable;
	
	private RelationalOperator relationalOperator;
	
	private String value;
	
	public RelationalEvent() {
		super();
	}

	public RelationalEvent(String name, int id) {
		super(name, id);
	}

	public void setRelationalOperator(int relationalOperator) {
		this.relationalOperator = RelationalOperator.get(relationalOperator);
	}

	public ContextInfo getContextVariable() {
		return contextVariable;
	}

	public void setContextVariable(ContextInfo contextVariable) {
		this.contextVariable = contextVariable;
	}

	public RelationalOperator getRelationalOperator() {
		return relationalOperator;
	}

	public void setRelationalOperator(RelationalOperator relationalOperator) {
		this.relationalOperator = relationalOperator;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	@Override
	public boolean isLogicalEvent() {
		return false;
	}
	
	@Override
	public boolean isRelationalEvent() {
		return true;
	}
	
} // EventoRelacional
