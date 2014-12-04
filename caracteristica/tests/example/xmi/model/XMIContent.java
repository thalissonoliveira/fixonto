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
	
}
