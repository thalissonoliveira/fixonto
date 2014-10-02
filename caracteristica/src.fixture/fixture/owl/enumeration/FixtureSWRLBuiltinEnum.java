package fixture.owl.enumeration;

import org.semanticweb.owlapi.model.IRI;

import fixture.owl.utils.Utils;

public enum FixtureSWRLBuiltinEnum {
	
	
	EQUAL_NAME("equalname", Utils.BUILT_IN_BASE_URL + "equalname");
	
	private String name;
	private String pathUri;
	
	private FixtureSWRLBuiltinEnum(String name, String pathUri) {
		this.name = name;
		this.pathUri = pathUri;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPathUri() {
		return pathUri;
	}

	public IRI getIri() {
		return IRI.create(this.pathUri);
	}
	
}
