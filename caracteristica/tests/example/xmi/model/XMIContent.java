package example.xmi.model;

import java.util.HashSet;
import java.util.Set;

public class XMIContent implements XMIModel {

	private Set<UMLNode> umlNodes;
	
	public XMIContent() {
		umlNodes = new HashSet<UMLNode>();
	}

	public Set<UMLNode> getUmlNodes() {
		return umlNodes;
	}

	public void setUmlNodes(Set<UMLNode> umlNodes) {
		this.umlNodes = umlNodes;
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
		return false;
	}

	@Override
	public boolean isXmi() {
		return false;
	}

	@Override
	public boolean isXmiContent() {
		return true;
	}

}
