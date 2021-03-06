package fixture.owl.enumeration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.semanticweb.owlapi.model.AddAxiom;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.SWRLAtom;
import org.semanticweb.owlapi.model.SWRLBuiltInAtom;
import org.semanticweb.owlapi.model.SWRLClassAtom;
import org.semanticweb.owlapi.model.SWRLDArgument;
import org.semanticweb.owlapi.model.SWRLDataPropertyAtom;
import org.semanticweb.owlapi.model.SWRLObjectPropertyAtom;
import org.semanticweb.owlapi.model.SWRLRule;
import org.semanticweb.owlapi.model.SWRLVariable;

import com.clarkparsia.pellet.owlapiv3.PelletReasoner;

import fixture.owl.enumeration.interfaces.FixtureOWLClassTypeEnumInterface;
import fixture.owl.factory.OWLClassFactory;
import fixture.owl.factory.OWLDataPropertyFactory;
import fixture.owl.factory.OWLObjectPropertyFactory;
import fixture.owl.rules.error.SWRLError;
import fixture.owl.rules.error.SWRLErrorBuilder;
import fixture.owl.utils.OntoHelper;
import fixture.owl.utils.Utils;

public enum RulesConstraintsOWLClassTypeEnumOld implements FixtureOWLClassTypeEnumInterface {
	
	EQUAL_NAME_FEATURE_RULE (1, "'Features with same name' Rule",  "GFR1", new IRI[]{IRI.create("x"),IRI.create("y"),IRI.create("m"),IRI.create("n")}, "Caracter�sticas diferentes n�o podem ter o mesmo nome", "") {

		@Override
		public SWRLError execute(OntoHelper ontoHelper, PelletReasoner pelletReasoner) {
			//Feature(?x),Feature(?y),hasName(?x,?n),hasName(?y,?m),:fix:equalname(?x,?y,?n,?m) -> hasEqualName(?x,?y),GFR1(?x)
			
			OWLDataFactory dataFactory = ontoHelper.getDataFactory();
			OWLClassFactory owlClassFactory = OWLClassFactory.getInstance(ontoHelper);
			OWLDataPropertyFactory owlDataPropertyFactory = OWLDataPropertyFactory.getInstance(ontoHelper);
			OWLObjectPropertyFactory owlObjectPropertyFactory = OWLObjectPropertyFactory.getInstance(ontoHelper);
			
			OWLClass gfr1OWLClass = owlClassFactory.get(RulesConstraintsOWLClassTypeEnumOld.EQUAL_NAME_FEATURE_RULE);
			OWLClass featureOWLClass = owlClassFactory.get(ModelOWLClassTypeEnum.FEATURE);
			OWLDataProperty hasNameProperty = owlDataPropertyFactory.get(OWLDataPropertyTypeEnum.HAS_NAME);
			OWLObjectProperty hasEqualNameObjectProperty = owlObjectPropertyFactory.get(OWLObjectPropertyTypeEnum.HAS_EQUAL_NAME);
			
			SWRLVariable variableRule1 = dataFactory.getSWRLVariable(this.getIRIs()[0]);//x
			SWRLVariable variableRule2 = dataFactory.getSWRLVariable(this.getIRIs()[1]);//y
			SWRLVariable variableRule3 = dataFactory.getSWRLVariable(this.getIRIs()[2]);//n
			SWRLVariable variableRule4 = dataFactory.getSWRLVariable(this.getIRIs()[3]);//m
			
			SWRLClassAtom body1 = dataFactory.getSWRLClassAtom(featureOWLClass, variableRule1);
			SWRLClassAtom body2 = dataFactory.getSWRLClassAtom(featureOWLClass, variableRule2);
			SWRLDataPropertyAtom body3 = dataFactory.getSWRLDataPropertyAtom(hasNameProperty, variableRule1, variableRule3);
			SWRLDataPropertyAtom body4 = dataFactory.getSWRLDataPropertyAtom(hasNameProperty, variableRule2, variableRule4);
			
			List<SWRLDArgument> arguments =  new ArrayList<SWRLDArgument>();
			arguments.add(variableRule1);
			arguments.add(variableRule2);
			arguments.add(variableRule3);
			arguments.add(variableRule4);
			
			
			SWRLBuiltInAtom body5 = dataFactory.getSWRLBuiltInAtom(FixtureSWRLBuiltinEnum.EQUAL_NAME.getIri(), arguments);
			
			Set<SWRLAtom> body = new HashSet<SWRLAtom>();
			body.add(body1);
			body.add(body2);
			body.add(body3);
			body.add(body4);
			body.add(body5);
			
			SWRLObjectPropertyAtom head1 = dataFactory.getSWRLObjectPropertyAtom(hasEqualNameObjectProperty, variableRule1, variableRule2);
			SWRLClassAtom head2 = dataFactory.getSWRLClassAtom(gfr1OWLClass, variableRule1);
			Set<SWRLAtom> head = new HashSet<SWRLAtom>();
			head.add(head1);
			head.add(head2);
			
//			Collections.singleton(head1)
			SWRLRule rule = dataFactory.getSWRLRule(body, head);
			
			ontoHelper.getManager().applyChange(new AddAxiom(ontoHelper.getMetaOntology(), rule));
			
			ontoHelper.saveOntology();
			pelletReasoner.flush();
//			ontoHelper.saveOntology();
			
			return SWRLErrorBuilder.build(this, pelletReasoner, gfr1OWLClass, hasEqualNameObjectProperty);
		}
		
		
	},
	EQUAL_NAME_ATTRIBUTE_RULE (2, "'Attributes with same name' Rule",  "GFR2", new IRI[]{IRI.create("x"),IRI.create("m"),IRI.create("n"),IRI.create("k"),IRI.create("l")}, "Atributos diferentes n�o podem ter o mesmo nome.", "") {
		@Override
		public SWRLError execute(OntoHelper ontoHelper, PelletReasoner pelletReasoner) {
			//Feature(?x),hasAttribute(?x,?m),hasAttribute(?x,?n),hasName(?m,?k),hasName(?n,?l),:fix:equalname(?m,?n,?k,?l) -> hasEqualName(?m,?n),GFR2(?x)
			OWLDataFactory dataFactory = ontoHelper.getDataFactory();
			OWLClassFactory owlClassFactory = OWLClassFactory.getInstance(ontoHelper);
			OWLDataPropertyFactory owlDataPropertyFactory = OWLDataPropertyFactory.getInstance(ontoHelper);
			OWLObjectPropertyFactory owlObjectPropertyFactory = OWLObjectPropertyFactory.getInstance(ontoHelper);
			
			OWLClass featureOWLClass = owlClassFactory.get(ModelOWLClassTypeEnum.FEATURE);
			
			OWLClass gfr2OWLClass = owlClassFactory.get(RulesConstraintsOWLClassTypeEnumOld.EQUAL_NAME_ATTRIBUTE_RULE);
			OWLDataProperty hasNameProperty = owlDataPropertyFactory.get(OWLDataPropertyTypeEnum.HAS_NAME);
			OWLObjectProperty hasEqualNameObjectProperty = owlObjectPropertyFactory.get(OWLObjectPropertyTypeEnum.HAS_EQUAL_NAME);
			OWLObjectProperty hasAttributeObjectProperty = owlObjectPropertyFactory.get(OWLObjectPropertyTypeEnum.HAS_ATTRIBUTE);
			
			SWRLVariable variableRule1 = dataFactory.getSWRLVariable(this.getIRIs()[0]);//x
			SWRLVariable variableRule2 = dataFactory.getSWRLVariable(this.getIRIs()[1]);//m
			SWRLVariable variableRule3 = dataFactory.getSWRLVariable(this.getIRIs()[2]);//n
			SWRLVariable variableRule4 = dataFactory.getSWRLVariable(this.getIRIs()[3]);//k
			SWRLVariable variableRule5 = dataFactory.getSWRLVariable(this.getIRIs()[4]);//l
			
			SWRLClassAtom body1 = dataFactory.getSWRLClassAtom(featureOWLClass, variableRule1);
			SWRLObjectPropertyAtom body2 = dataFactory.getSWRLObjectPropertyAtom(hasAttributeObjectProperty, variableRule1, variableRule2);
			SWRLObjectPropertyAtom body3 = dataFactory.getSWRLObjectPropertyAtom(hasAttributeObjectProperty, variableRule1, variableRule3);
			SWRLDataPropertyAtom body4 = dataFactory.getSWRLDataPropertyAtom(hasNameProperty, variableRule2, variableRule4);
			SWRLDataPropertyAtom body5 = dataFactory.getSWRLDataPropertyAtom(hasNameProperty, variableRule3, variableRule5);

			List<SWRLDArgument> arguments =  new ArrayList<SWRLDArgument>();
			arguments.add(variableRule2);
			arguments.add(variableRule3);
			arguments.add(variableRule4);
			arguments.add(variableRule5);
			
			
			SWRLBuiltInAtom body6 = dataFactory.getSWRLBuiltInAtom(FixtureSWRLBuiltinEnum.EQUAL_NAME.getIri(), arguments);
			
			Set<SWRLAtom> body = new HashSet<SWRLAtom>();
			body.add(body1);
			body.add(body2);
			body.add(body3);
			body.add(body4);
			body.add(body5);
			body.add(body6);
			
			SWRLObjectPropertyAtom head1 = dataFactory.getSWRLObjectPropertyAtom(hasEqualNameObjectProperty, variableRule2, variableRule3);
			SWRLClassAtom head2 = dataFactory.getSWRLClassAtom(gfr2OWLClass, variableRule1);
			Set<SWRLAtom> head = new HashSet<SWRLAtom>();
			head.add(head1);
			head.add(head2);
			
			SWRLRule rule = dataFactory.getSWRLRule(body, head);
			
			ontoHelper.getManager().applyChange(new AddAxiom(ontoHelper.getMetaOntology(), rule));
			
			ontoHelper.saveOntology();
			pelletReasoner.flush();
//			ontoHelper.saveOntology();
			
			return SWRLErrorBuilder.build(this, pelletReasoner, gfr2OWLClass, hasEqualNameObjectProperty);

		}
	},
	PARENTAL_INCONSISTENCY (3, "'Parental Inconsistency' Rule",  "ParentalInconsistency", new IRI[]{IRI.create("x")}, "Uma caracter�stica n�o pode ser filha dela mesma.", "A feature can't be child of itself.") {
		@Override
		public SWRLError execute(OntoHelper ontoHelper, PelletReasoner pelletReasoner) {
			OWLDataFactory dataFactory = ontoHelper.getDataFactory();
			OWLClass parentalInconsistencyOWLClass = OWLClassFactory.getInstance(ontoHelper).get(RulesConstraintsOWLClassTypeEnumOld.PARENTAL_INCONSISTENCY);
			OWLObjectProperty hasChildFeatureProperty = OWLObjectPropertyFactory.getInstance(ontoHelper).get(OWLObjectPropertyTypeEnum.HAS_CHILD_FEATURE);
			
			SWRLVariable variableRule = dataFactory.getSWRLVariable(this.getIRIs()[0]);
			SWRLObjectPropertyAtom body = dataFactory.getSWRLObjectPropertyAtom(hasChildFeatureProperty, variableRule, variableRule);
			SWRLClassAtom head = dataFactory.getSWRLClassAtom(parentalInconsistencyOWLClass, variableRule);
			SWRLRule rule = dataFactory.getSWRLRule(Collections.singleton(body), Collections.singleton(head));

			ontoHelper.getManager().applyChange(new AddAxiom(ontoHelper.getMetaOntology(), rule));
			ontoHelper.saveOntology();
			pelletReasoner.flush();
//			ontoHelper.saveOntology();
			
			return SWRLErrorBuilder.build(this, pelletReasoner, parentalInconsistencyOWLClass);
		}
	};

	
	private int code;
	private String description;
	private String label;
	private IRI[] variableIris;
	private String ptExceptionMsg;
	private String enExceptionMsg;
	
	
	private RulesConstraintsOWLClassTypeEnumOld(int code, String description, String label, IRI[] variablesIris, String ptExceptionMsg, String enExceptionMsg) {
		this.code = code;
		this.description = description;
		this.label = label;
		this.variableIris = variablesIris;
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

	public IRI[] getIRIs() {
		return variableIris;
	}

	public String getPtExceptionMsg() {
		return ptExceptionMsg;
	}

	public String getEnExceptionMsg() {
		return enExceptionMsg;
	}
	
}