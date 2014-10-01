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
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.SWRLAtom;
import org.semanticweb.owlapi.model.SWRLBuiltInAtom;
import org.semanticweb.owlapi.model.SWRLClassAtom;
import org.semanticweb.owlapi.model.SWRLDArgument;
import org.semanticweb.owlapi.model.SWRLDataPropertyAtom;
import org.semanticweb.owlapi.model.SWRLLiteralArgument;
import org.semanticweb.owlapi.model.SWRLObjectPropertyAtom;
import org.semanticweb.owlapi.model.SWRLRule;
import org.semanticweb.owlapi.model.SWRLVariable;
import org.semanticweb.owlapi.reasoner.Node;
import org.semanticweb.owlapi.reasoner.NodeSet;
import org.semanticweb.owlapi.vocab.SWRLBuiltInsVocabulary;

import com.clarkparsia.pellet.owlapiv3.PelletReasoner;

import fixture.owl.enumeration.interfaces.FixtureOWLClassTypeEnumInterface;
import fixture.owl.factory.OWLClassFactory;
import fixture.owl.factory.OWLDataPropertyFactory;
import fixture.owl.factory.OWLObjectPropertyFactory;
import fixture.owl.rules.error.SWRLError;
import fixture.owl.utils.OntoHelper;
import fixture.owl.utils.Utils;

public enum RulesConstraintsOWLClassTypeEnum implements FixtureOWLClassTypeEnumInterface {
	
	PARENTAL_INCONSISTENCY (1, "'Parental Inconsistency' Rule",  "ParentalInconsistency", new IRI[]{IRI.create("x")}, "Uma característica não pode ser filha dela mesma.", "A feature can't be child of itself.") {
		@Override
		public SWRLError execute(OntoHelper ontoHelper, PelletReasoner pelletReasoner) {
			OWLDataFactory dataFactory = ontoHelper.getDataFactory();
			OWLClass parentalInconsistencyOWLClass = OWLClassFactory.getInstance(ontoHelper).get(RulesConstraintsOWLClassTypeEnum.PARENTAL_INCONSISTENCY);
			OWLObjectProperty hasChildFeatureProperty = OWLObjectPropertyFactory.getInstance(ontoHelper).get(OWLObjectPropertyTypeEnum.HAS_CHILD_FEATURE);
			
			SWRLVariable variableRule = dataFactory.getSWRLVariable(this.getIRIs()[0]);
			SWRLObjectPropertyAtom body = dataFactory.getSWRLObjectPropertyAtom(hasChildFeatureProperty, variableRule, variableRule);
			SWRLClassAtom head = dataFactory.getSWRLClassAtom(parentalInconsistencyOWLClass, variableRule);
			SWRLRule rule = dataFactory.getSWRLRule(Collections.singleton(body), Collections.singleton(head));

			ontoHelper.getManager().applyChange(new AddAxiom(ontoHelper.getMetaOntology(), rule));
			
			System.out.println("Agorasssssssss??");
			ontoHelper.saveOntology();
			pelletReasoner.flush();
			ontoHelper.saveOntology();
			
			return buildSWRLError(pelletReasoner, parentalInconsistencyOWLClass);
		}
	},
	EQUAL_NAME_FEATURE_RULE (2, "'Features with same name' Rule",  "GFR1", new IRI[]{IRI.create("x"),IRI.create("y"),IRI.create("n"),IRI.create("m")}, "", "") {
		
		@Override
		public SWRLError execute(OntoHelper ontoHelper, PelletReasoner pelletReasoner) {
			OWLDataFactory dataFactory = ontoHelper.getDataFactory();
			OWLClassFactory owlClassFactory = OWLClassFactory.getInstance(ontoHelper);
			OWLDataPropertyFactory owlDataPropertyFactory = OWLDataPropertyFactory.getInstance(ontoHelper);
			OWLObjectPropertyFactory owlObjectPropertyFactory = OWLObjectPropertyFactory.getInstance(ontoHelper);
			
			OWLClass parentalInconsistencyOWLClass = owlClassFactory.get(RulesConstraintsOWLClassTypeEnum.EQUAL_NAME_FEATURE_RULE);
			OWLClass featureOWLClass = owlClassFactory.get(ModelOWLClassTypeEnum.FEATURE);
			OWLDataProperty hasNameProperty = owlDataPropertyFactory.get(OWLDataPropertyTypeEnum.HAS_NAME);
			OWLObjectProperty hasParentalInconsistencyProperty = owlObjectPropertyFactory.get(OWLObjectPropertyTypeEnum.HAS_PARENTAL_INCONSISTENCY);
			
			SWRLVariable variableRule1 = dataFactory.getSWRLVariable(this.getIRIs()[0]);//x
			SWRLVariable variableRule2 = dataFactory.getSWRLVariable(this.getIRIs()[1]);//y
			SWRLVariable variableRule3 = dataFactory.getSWRLVariable(this.getIRIs()[2]);//n
			SWRLVariable variableRule4 = dataFactory.getSWRLVariable(this.getIRIs()[3]);//m
			
//			List<SWRLDArgument> arguments =  new ArrayList<SWRLDArgument>();
//			arguments.add(variableRule1);
//			arguments.add(variableRule2);
//			arguments.add(variableRule3);
//			arguments.add(variableRule4);
			
			SWRLLiteralArgument lit = dataFactory.getSWRLLiteralArgument(ontoHelper.getDataFactory().getOWLLiteral("10"));
			List<SWRLDArgument> arguments =  new ArrayList<SWRLDArgument>();
			arguments.add(variableRule3);
			arguments.add(lit);
			
			
			SWRLClassAtom body1 = dataFactory.getSWRLClassAtom(featureOWLClass, variableRule1);
			SWRLClassAtom body2 = dataFactory.getSWRLClassAtom(featureOWLClass, variableRule2);
			SWRLDataPropertyAtom body3 = dataFactory.getSWRLDataPropertyAtom(hasNameProperty, variableRule1, variableRule3);
			SWRLDataPropertyAtom body4 = dataFactory.getSWRLDataPropertyAtom(hasNameProperty, variableRule2, variableRule4);
			
			
			
//			SWRLBuiltInAtom body5 = dataFactory.getSWRLBuiltInAtom(IRI.create(Utils.META_ONTOLOGY_BASE_URL_SHARP+"fix:equalname"), arguments);
			
			IRI iri = SWRLBuiltInsVocabulary.EQUAL.getIRI();
			
			System.out.println("####################### " + iri);
			
			SWRLBuiltInAtom body5 = dataFactory.getSWRLBuiltInAtom(iri, arguments);
			
			Set<SWRLAtom> bodies = new HashSet<SWRLAtom>();
			bodies.add(body1);
			bodies.add(body2);
			bodies.add(body3);
			bodies.add(body4);
			bodies.add(body5);
			
			SWRLObjectPropertyAtom head = dataFactory.getSWRLObjectPropertyAtom(hasParentalInconsistencyProperty, variableRule1, variableRule2);
			SWRLRule rule = dataFactory.getSWRLRule(bodies, Collections.singleton(head));
			ontoHelper.getManager().applyChange(new AddAxiom(ontoHelper.getMetaOntology(), rule));
			ontoHelper.saveOntology();
			
			System.out.println("Agora??");
			
			pelletReasoner.flush();
			
			ontoHelper.saveOntology();
			
			return buildSWRLError(pelletReasoner, parentalInconsistencyOWLClass);
		}

	},
	EQUAL_NAME_ATTRIBUTE_RULE (3, "'Attributes with same name' Rule",  "GFR2", new IRI[]{IRI.create("X1")}, "", "") {
		@Override
		public SWRLError execute(OntoHelper ontoHelper, PelletReasoner pelletReasoner) {
			OWLDataFactory dataFactory = ontoHelper.getDataFactory();
			OWLClassFactory owlClassFactory = OWLClassFactory.getInstance(ontoHelper);
			OWLObjectPropertyFactory owlObjectPropertyFactory = OWLObjectPropertyFactory.getInstance(ontoHelper);
			
			OWLClass parentalInconsistencyOWLClass = owlClassFactory.get(RulesConstraintsOWLClassTypeEnum.PARENTAL_INCONSISTENCY);
			OWLObjectProperty hasChildFeatureProperty = owlObjectPropertyFactory.get(OWLObjectPropertyTypeEnum.HAS_CHILD_FEATURE);
			
			SWRLVariable variableRule = dataFactory.getSWRLVariable(this.getIRIs()[0]);
			SWRLObjectPropertyAtom body = dataFactory.getSWRLObjectPropertyAtom(hasChildFeatureProperty, variableRule, variableRule);
			SWRLClassAtom head = dataFactory.getSWRLClassAtom(parentalInconsistencyOWLClass, variableRule);
			SWRLRule rule = dataFactory.getSWRLRule(Collections.singleton(body), Collections.singleton(head));
			ontoHelper.getManager().applyChange(new AddAxiom(ontoHelper.getMetaOntology(), rule));
			ontoHelper.saveOntology();
			pelletReasoner.flush();
			ontoHelper.saveOntology();
			
			return buildSWRLError(pelletReasoner, parentalInconsistencyOWLClass);
		}
	};
	
	private int code;
	private String description;
	private String label;
	private IRI[] variableIris;
	private String ptExceptionMsg;
	private String enExceptionMsg;
	
	
	private RulesConstraintsOWLClassTypeEnum(int code, String description, String label, IRI[] variablesIris, String ptExceptionMsg, String enExceptionMsg) {
		this.code = code;
		this.description = description;
		this.label = label;
		this.variableIris = variablesIris;
		this.ptExceptionMsg = ptExceptionMsg;
		this.enExceptionMsg = enExceptionMsg;
	}
	
	protected SWRLError buildSWRLError(PelletReasoner pelletReasoner, OWLClass owlClass) {
		NodeSet<OWLNamedIndividual> individualsError = pelletReasoner.getInstances(owlClass, false);
		
		if (individualsError != null && !individualsError.isEmpty()) {
			SWRLError error = new SWRLError();
			error.setDescription(this.description);
			StringBuilder sb = new StringBuilder();
			sb.append("[RULE BROKE]<" + error.getDescription() + ">: \n");
			for (Node<OWLNamedIndividual> node : individualsError) {
				OWLNamedIndividual individual = node.getRepresentativeElement();
				sb.append("   [INDIVIDUAL]:<" + individual.getIRI().getFragment() + ">\n      [NODES]:");
				NodeSet<OWLClass> types = pelletReasoner.getTypes(individual, true);
				for (Node<OWLClass> classNode : types) {
					sb.append("<" + classNode.getRepresentativeElement().getIRI().getFragment() + ">");
				}
				sb.append("\n");
			}
			error.setDescription(sb.toString());
			error.setRulesConstraintsOWLClassTypeEnum(this);
			return error;
		}
		
		return null;
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