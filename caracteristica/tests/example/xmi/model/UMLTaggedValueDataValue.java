package example.xmi.model;

public class UMLTaggedValueDataValue implements XMIModel {
	
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	@Override
	public boolean isUmlModelElementTaggedValue() {
		return false;
	}

	@Override
	public boolean isUmlNode() {
		return false;
	}

	@Override
	public boolean isUmlTaggedValue() {
		return false;
	}

	@Override
	public boolean isUmlTaggedValueDataValue() {
		return true;
	}

	@Override
	public boolean isXmi() {
		return false;
	}

	@Override
	public boolean isXmiContent() {
		return false;
	}

}
