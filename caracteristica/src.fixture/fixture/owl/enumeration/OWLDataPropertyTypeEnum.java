package fixture.owl.enumeration;

import fixture.owl.utils.Utils;

public enum OWLDataPropertyTypeEnum {
	
	HAS_NAME (1, "Has Name", "hasName"),
	HAS_MAX_ID (2, "Has Max Id", "hasMaxId");
	
	private int code;
	private String description;
	private String label;
	
		
	private OWLDataPropertyTypeEnum(int code, String description, String label) {
		this.code = code;
		this.description = description;
		this.label = label;
	}
	
	public int getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}

	public String getIRI() {
		return Utils.META_ONTOLOGY_BASE_URL_SHARP + this.getLabel();
	}
	
	public String getLabel() {
		return label;
	}
	
}
