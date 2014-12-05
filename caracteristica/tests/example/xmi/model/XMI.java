package example.xmi.model;

import java.util.HashSet;
import java.util.Set;

public class XMI implements XMIModel {

	private Set<XMIContent> xmiContents;

	public XMI() {
		xmiContents = new HashSet<XMIContent>();
	}

	public Set<XMIContent> getXmiContents() {
		return xmiContents;
	}

	public void setXmiContents(Set<XMIContent> xmiContents) {
		this.xmiContents = xmiContents;
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
		return true;
	}

	@Override
	public boolean isXmiContent() {
		return false;
	}

}
