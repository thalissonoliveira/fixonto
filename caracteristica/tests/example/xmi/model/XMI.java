package example.xmi.model;

import java.util.HashSet;
import java.util.Set;

public class XMI {

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
	
}
