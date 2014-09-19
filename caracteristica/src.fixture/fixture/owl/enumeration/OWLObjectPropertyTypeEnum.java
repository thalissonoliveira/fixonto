package fixture.owl.enumeration;

import fixture.owl.utils.Utils;

public enum OWLObjectPropertyTypeEnum {
	
	HAS_FATHER_FEATURE (1, "Has Father Feature", "hasFatherFeature"),
	HAS_CHILD_FEATURE (2, "Has Child Feature", "hasChildFeature"),
	
	HAS_PARENTAL_INCONSISTENCY (3, "Has Parental Inconsistency", "hasParentalInconsistency"),
	
	HAS_CONTEXT_ENTITY (4, "Has Context Entity", "hasContextEntity"),
	HAS_CONTEXT_INFO (5, "Has Context Information", "hasContextInfo"),
	HAS_FATHER_CONTEXT_ROOT (7, "Has Father Context Root", "hasFatherContextRoot"),
	HAS_FATHER_CONTEXT_ENTITY (8, "Has Father Context Entitt", "hasFatherContextEntity"),
	
	HAS_ATTRIBUTE (9, "Has Attribute", "hasAttribute"),
	
	HAS_ANTECEDENT (10, "Has Antecedent", "hasAntecedent"),
	HAS_CONSEQUENT (11, "Has Consequent", "hasConsequent");
	
	private int code;
	private String description;
	private String label;
	
		
	private OWLObjectPropertyTypeEnum(int code, String description, String label) {
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
