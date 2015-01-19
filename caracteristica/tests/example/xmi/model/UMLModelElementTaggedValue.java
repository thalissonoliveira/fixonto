package example.xmi.model;

import java.util.HashSet;
import java.util.Set;

public class UMLModelElementTaggedValue implements XMIModel {

	private Set<UMLTaggedValue> taggedValues;

	public UMLModelElementTaggedValue() {
		taggedValues = new HashSet<UMLTaggedValue>();
	}

	public Set<UMLTaggedValue> getTaggedValues() {
		return taggedValues;
	}

	public void setTaggedValues(Set<UMLTaggedValue> taggedValues) {
		this.taggedValues = taggedValues;
	}

	@Override
	public boolean isUmlModelElementTaggedValue() {
		return true;
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
		return false;
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
