package example.xmi.model;

import java.util.HashSet;
import java.util.Set;

public class UMLModelElementTaggedValue {

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
	
	
}
