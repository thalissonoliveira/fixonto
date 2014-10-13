package fixture.owl.enumeration;

import org.semanticweb.owlapi.model.AddAxiom;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.SWRLRule;

import com.clarkparsia.pellet.owlapiv3.PelletReasoner;

import fixture.owl.enumeration.interfaces.FixtureOWLClassTypeEnumInterface;
import fixture.owl.factory.OWLClassFactory;
import fixture.owl.factory.OWLObjectPropertyFactory;
import fixture.owl.rules.error.SWRLError;
import fixture.owl.rules.error.SWRLErrorBuilder;
import fixture.owl.swrl.parser.SWRLRuleStringParser;
import fixture.owl.utils.OntoHelper;
import fixture.owl.utils.Utils;

public enum RulesConstraintsOWLClassTypeEnum implements FixtureOWLClassTypeEnumInterface {
	
	EQUAL_NAME_FEATURE_RULE (1, "'Features with same name' Rule",  "GFR1", "Características diferentes não podem ter o mesmo nome", "") {

		@Override
		public SWRLError execute(OntoHelper ontoHelper, PelletReasoner pelletReasoner) {
			String ruleString = "Feature(?x) ^ Feature(?y) ^ hasName(?x,?n) ^ hasName(?y,?m) ^ fix:equalname(?x,?y,?n,?m) -> hasEqualName(?x,?y) ^ GFR1(?x)";
			
			OWLClass gfr1OWLClass = OWLClassFactory.getInstance(ontoHelper).get(RulesConstraintsOWLClassTypeEnum.EQUAL_NAME_FEATURE_RULE);
			OWLObjectProperty hasEqualNameObjectProperty = OWLObjectPropertyFactory.getInstance(ontoHelper).get(OWLObjectPropertyTypeEnum.HAS_EQUAL_NAME);

			SWRLRule rule = new SWRLRuleStringParser(ontoHelper).parse(ruleString);
			
			ontoHelper.getManager().applyChange(new AddAxiom(ontoHelper.getMetaOntology(), rule));
			ontoHelper.saveOntology();
			pelletReasoner.flush();
			
			return SWRLErrorBuilder.build(this, pelletReasoner, gfr1OWLClass, hasEqualNameObjectProperty);
		}
		
		
	},
	EQUAL_NAME_ATTRIBUTE_RULE (2, "'Attributes with same name' Rule",  "GFR2", "Atributos diferentes não podem ter o mesmo nome.", "") {
		@Override
		public SWRLError execute(OntoHelper ontoHelper, PelletReasoner pelletReasoner) {
			String ruleString = "Feature(?x) ^ hasAttribute(?x,?m) ^ hasAttribute(?x,?n) ^ hasName(?m,?k) ^ hasName(?n,?l) ^ fix:equalname(?m,?n,?k,?l) -> hasEqualName(?m,?n) ^ GFR2(?x)";
			
			OWLClass gfr2OWLClass = OWLClassFactory.getInstance(ontoHelper).get(RulesConstraintsOWLClassTypeEnum.EQUAL_NAME_ATTRIBUTE_RULE);
			OWLObjectProperty hasEqualNameObjectProperty = OWLObjectPropertyFactory.getInstance(ontoHelper).get(OWLObjectPropertyTypeEnum.HAS_EQUAL_NAME);

			SWRLRule rule = new SWRLRuleStringParser(ontoHelper).parse(ruleString);
			
			ontoHelper.getManager().applyChange(new AddAxiom(ontoHelper.getMetaOntology(), rule));
			ontoHelper.saveOntology();
			pelletReasoner.flush();
			
			return SWRLErrorBuilder.build(this, pelletReasoner, gfr2OWLClass, hasEqualNameObjectProperty);

		}
	},
	PARENTAL_INCONSISTENCY (3, "'Parental Inconsistency' Rule",  "ParentalInconsistency", "Uma característica não pode ser filha dela mesma.", "A feature can't be child of itself.") {
		@Override
		public SWRLError execute(OntoHelper ontoHelper, PelletReasoner pelletReasoner) {
			String ruleString = "hasChildFeature(?x,?x) -> ParentalInconsistency(?x)";
			
			OWLClass parentalInconsistencyOWLClass = OWLClassFactory.getInstance(ontoHelper).get(RulesConstraintsOWLClassTypeEnum.PARENTAL_INCONSISTENCY);
			
			SWRLRule rule = new SWRLRuleStringParser(ontoHelper).parse(ruleString);

			ontoHelper.getManager().applyChange(new AddAxiom(ontoHelper.getMetaOntology(), rule));
			ontoHelper.saveOntology();
			pelletReasoner.flush();
			
			return SWRLErrorBuilder.build(this, pelletReasoner, parentalInconsistencyOWLClass);
		}
	},
	CYCLICAL_FEATURE_RELATION (4, "Cyclical relation between features.",  "GFR3", "Ciclo detectado.", "Cicle detected.") {
		@Override
		public SWRLError execute(OntoHelper ontoHelper, PelletReasoner pelletReasoner) {
			String ruleString = "hasFatherFeature(?x,?y) ^ hasFatherFeature(?y,?x) -> hasCicle(?x,?y) ^ GFR3(?x)";
			
			OWLClass cicleOWLClass = OWLClassFactory.getInstance(ontoHelper).get(RulesConstraintsOWLClassTypeEnum.CYCLICAL_FEATURE_RELATION);
			OWLObjectProperty hasCicleObjectProperty = OWLObjectPropertyFactory.getInstance(ontoHelper).get(OWLObjectPropertyTypeEnum.HAS_CICLE);
			
			SWRLRule rule = new SWRLRuleStringParser(ontoHelper).parse(ruleString);
			
			ontoHelper.getManager().applyChange(new AddAxiom(ontoHelper.getMetaOntology(), rule));
			ontoHelper.saveOntology();
			pelletReasoner.flush();
			
			return SWRLErrorBuilder.build(this, pelletReasoner, cicleOWLClass, hasCicleObjectProperty);
		}
	},
	UNIQUE_ROOT (5, "Unique root.",  "GFR4", "Uma característica só pode ter uma raíz.", "") {
		@Override
		public SWRLError execute(OntoHelper ontoHelper, PelletReasoner pelletReasoner) {
//			String ruleString = "MandatoryFeature(?x) -> GFR4(?x)";
			String ruleString = "MandatoryFeature(?x) ^ hasFatherFeature min 2 Feature(?x) -> GFR4(?x)";
//			String ruleString = "MandatoryFeature(?x) ^ hasFatherFeature min 1 Feature(?x) ^ hasFatherFeature max 1 Feature(?x) -> GFR4(?x)";
			
			OWLClass uniqueRootClass = OWLClassFactory.getInstance(ontoHelper).get(RulesConstraintsOWLClassTypeEnum.UNIQUE_ROOT);
			
			SWRLRule rule = new SWRLRuleStringParser(ontoHelper).parse(ruleString);
			
			ontoHelper.getManager().applyChange(new AddAxiom(ontoHelper.getMetaOntology(), rule));
			ontoHelper.saveOntology();
			pelletReasoner.flush();
			
			return SWRLErrorBuilder.build(this, pelletReasoner, uniqueRootClass);
		}
	};

	
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
	
	public abstract SWRLError execute(OntoHelper ontoHelper, PelletReasoner pelletReasoner);
	
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