package fixture.owl.model.rule;

import fixture.owl.model.element.Attribute;
import fixture.owl.model.enumeration.ValueType;

public class Designate extends Action {
	
	private Attribute attribute;
	
	private ValueType valueType;
	
	private String value;
	
	public Designate() {
		super();
	}

	public Designate(String name, int id) {
		super(name, id);
	}
	
	public void setValueType(int valueType) {
		this.valueType = ValueType.get(valueType);
	}

	public Attribute getAttribute() {
		return attribute;
	}

	public void setAttribute(Attribute attribute) {
		this.attribute = attribute;
	}

	public ValueType getValueType() {
		return valueType;
	}

	public void setValueType(ValueType valueType) {
		this.valueType = valueType;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	@Override
	public boolean isActionLiteral() {
		return false;
	}

	@Override
	public boolean isDesignate() {
		return true;
	}

	@Override
	public boolean isLogicalAction() {
		return false;
	}


} // Designar
