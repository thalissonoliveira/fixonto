package fixture.owl.enumeration;

import fixture.owl.enumeration.interfaces.FixtureOWLClassTypeEnumInterface;
import fixture.owl.utils.Utils;

public enum RulesConstraintsOWLClassTypeEnum implements FixtureOWLClassTypeEnumInterface {
	
	EQUAL_NAME_FEATURE_RULE (1, "'Features with same name' Rule",  "GFR1", "Características diferentes não podem ter o mesmo nome", ""),
	EQUAL_NAME_ATTRIBUTE_RULE (2, "'Attributes with same name' Rule",  "GFR1", "Atributos diferentes não podem ter o mesmo nome.", ""),
	PARENTAL_INCONSISTENCY (3, "'Parental Inconsistency' Rule",  "ParentalInconsistency", "Uma característica não pode ser filha dela mesma.", "A feature can't be child of itself."),
	CYCLICAL_FEATURE_RELATION (4, "Cyclical relation between features.",  "GFR3", "Ciclo detectado.", "Cicle detected."),
	UNIQUE_ROOT (5, "Unique root.",  "GFR4", "Uma característica só pode ter uma raíz.", ""),
	GFR5 (6, "",  "GFR5", "", ""),
	GFR6 (7, "",  "GFR6", "", ""),
	GFR7 (8, "",  "GFR7", "", ""),
	TEST_ERROR (6, "",  "GFR8", "", "");

	
	private int code;
	private String description;
	private String label;
	private String ptExceptionMsg;
	private String enExceptionMsg;
	
	private RulesConstraintsOWLClassTypeEnum(int code, String description, String label, String ptExceptionMsg, String enExceptionMsg) {
		this.code = code;
		this.description = description;
		this.label = label;
		this.ptExceptionMsg = ptExceptionMsg;
		this.enExceptionMsg = enExceptionMsg;
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
	
	public String getPtExceptionMsg() {
		return ptExceptionMsg;
	}

	public String getEnExceptionMsg() {
		return enExceptionMsg;
	}

}