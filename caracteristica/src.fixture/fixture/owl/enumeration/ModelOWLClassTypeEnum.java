package fixture.owl.enumeration;

import fixture.owl.enumeration.interfaces.FixtureOWLClassTypeEnumInterface;
import fixture.owl.utils.Utils;

public enum ModelOWLClassTypeEnum implements FixtureOWLClassTypeEnumInterface {
	
	FEATURE (0, "Feature", "Feature"),
	MANDATORY_FEATURE (1, "Mandatory Feature", "MandatoryFeature"),
	OPTIONAL_FEATURE (2, "Optional Feature", "OptionalFeature"),
	ROOT_FEATURE (3, "Root Feature", "RootFeature"),
	VARIATION_TWO (4, "Variation Two", "VariationTwo"),
	GROUPED_FEATURE (5, "Grouped Feature", "GroupedFeature"),
	
	CONTEXT_ROOT (6, "Context Root", "ContextRoot"),
	CONTEXT_ENTITY (7, "Context Entity", "ContextEntity"),
	CONTEXT_INFO (8, "Context Info", "ContextInfo"),
	
	ATTRIBUTE (9, "Attribute", "Attribute"),
	
	COMPOSITION_RULE (10, "Compositin Rule", "CompositionRule"),
	
	COUNT(11, "count", "count");
	
	
	
	private int code;
	private String description;
	private String label;
	
	private ModelOWLClassTypeEnum(int code, String description, String label) {
		this.code = code;
		this.description = description;
		this.label = label;
	}
	
	public String getIRI() {
		return Utils.META_ONTOLOGY_BASE_URL_SHARP + this.getLabel();
	}
	
	//G'n S
	public int getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}

	public String getLabel() {
		return label;
	}

}
