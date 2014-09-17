package fixture.owl.enumeration;

import java.util.Collections;

import org.semanticweb.owlapi.model.AddAxiom;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.SWRLClassAtom;
import org.semanticweb.owlapi.model.SWRLObjectPropertyAtom;
import org.semanticweb.owlapi.model.SWRLRule;
import org.semanticweb.owlapi.model.SWRLVariable;
import org.semanticweb.owlapi.reasoner.Node;
import org.semanticweb.owlapi.reasoner.NodeSet;

import com.clarkparsia.pellet.owlapiv3.PelletReasoner;

import fixture.owl.enumeration.interfaces.FixtureOWLClassTypeEnumInterface;
import fixture.owl.factory.OWLClassFactory;
import fixture.owl.factory.OWLObjectPropertyFactory;
import fixture.owl.rules.error.SWRLError;
import fixture.owl.utils.OntoHelper;
import fixture.owl.utils.Utils;

public enum RulesConstraintsOWLClassTypeEnum implements FixtureOWLClassTypeEnumInterface {
	
	PARENTAL_INCONSISTENCY (1, "Parental Inconsistency",  "ParentalInconsistency", new IRI[]{IRI.create("X1")}) {
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
			ontoHelper.saveOntology();
			pelletReasoner.flush();
			ontoHelper.saveOntology();
			
			
			return buildSWRLError(pelletReasoner, parentalInconsistencyOWLClass);
		}
	},
	SAME_NAME_FEATURE_RULE (2, "Features with same name rule",  "ParentalInconsistency", new IRI[]{IRI.create("X1")}) {
		@Override
		public SWRLError execute(OntoHelper ontoHelper, PelletReasoner pelletReasoner) {
			OWLDataFactory dataFactory = ontoHelper.getDataFactory();
			OWLClassFactory owlClassFactory = OWLClassFactory.getInstance(ontoHelper);
			OWLObjectPropertyFactory owlObjectPropertyFactory = OWLObjectPropertyFactory.getInstance(ontoHelper);
			
			OWLClass parentalInconsistencyOWLClass = owlClassFactory.get(RulesConstraintsOWLClassTypeEnum.SAME_NAME_FEATURE_RULE);
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
	private IRI[] iris;
	
	private RulesConstraintsOWLClassTypeEnum(int code, String description, String label, IRI[] iris) {
		this.code = code;
		this.description = description;
		this.label = label;
		this.iris = iris;
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
		return iris;
	}
	
}