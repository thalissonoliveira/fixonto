package fixture.owl.rules.error;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.reasoner.Node;
import org.semanticweb.owlapi.reasoner.NodeSet;

import com.clarkparsia.pellet.owlapiv3.PelletReasoner;

import fixture.owl.enumeration.RulesConstraintsOWLClassTypeEnum;
import fixture.owl.enumeration.RulesConstraintsOWLClassTypeEnumOld;

public class SWRLErrorBuilder {
	
	public static SWRLError build(RulesConstraintsOWLClassTypeEnum rulesConstraintsOWLClassTypeEnum, PelletReasoner pelletReasoner, OWLClass owlClass) {
		NodeSet<OWLNamedIndividual> individualsError = pelletReasoner.getInstances(owlClass, false);
		boolean hasError = individualsError != null && !individualsError.isEmpty();
		
		if (hasError) {
			SWRLError error = new SWRLError();
			error.setDescription(rulesConstraintsOWLClassTypeEnum.getPtExceptionMsg());
			StringBuilder sb = new StringBuilder();
			sb.append("[RULE BROKE]<" + error.getDescription() + ">: \n");
			for (Node<OWLNamedIndividual> node : individualsError) {
				OWLNamedIndividual individual = node.getRepresentativeElement();
				IRI iri = individual.getIRI();
				sb.append("   [INDIVIDUAL]:<" + iri.toString().split("#")[1] + ">\n      [NODES]:");
				NodeSet<OWLClass> types = pelletReasoner.getTypes(individual, true);
				for (Node<OWLClass> classNode : types) {
					sb.append("<" + classNode.getRepresentativeElement().getIRI().getFragment() + ">");
				}
				sb.append("\n");
			}
			error.setDescription(sb.toString());
			error.setRulesConstraintsOWLClassTypeEnum(rulesConstraintsOWLClassTypeEnum);
			return error;
		}
		
		return null;
	}
	
	
	public static SWRLError build(RulesConstraintsOWLClassTypeEnum rulesConstraintsOWLClassTypeEnum, PelletReasoner pelletReasoner, OWLClass owlClass, OWLObjectProperty owlObjectProperty) {
		NodeSet<OWLNamedIndividual> individualsError = pelletReasoner.getInstances(owlClass, false);
		boolean hasError = individualsError != null && !individualsError.isEmpty();
		if (hasError) {
			SWRLError error = new SWRLError();
			error.setDescription(rulesConstraintsOWLClassTypeEnum.getPtExceptionMsg());
			StringBuilder sb = new StringBuilder();
			sb.append("[RULE BROKE]<" + error.getDescription() + ">: \n");
			for (Node<OWLNamedIndividual> node : individualsError) {
				OWLNamedIndividual individual = node.getRepresentativeElement();
				sb.append("   [INDIVIDUAL]:<" + individual.getIRI().toString().split("#")[1] + ">\n      [NODES]:");
				NodeSet<OWLClass> types = pelletReasoner.getTypes(individual, true);
				for (Node<OWLClass> classNode : types) {
					sb.append("<" + classNode.getRepresentativeElement().getIRI().getFragment() + ">");
				}
				sb.append("\n");
				NodeSet<OWLNamedIndividual> objectPropertyValues = pelletReasoner.getObjectPropertyValues(individual, owlObjectProperty);
				sb.append("      [OPASSERTION]:<" + owlObjectProperty.getIRI().getFragment() + ">");
				for (Node<OWLNamedIndividual> subIndividual : objectPropertyValues) {
					sb.append("<" + subIndividual.getRepresentativeElement().getIRI().getFragment() + ">");
				}
				sb.append("\n");
			}
			error.setDescription(sb.toString());
			error.setRulesConstraintsOWLClassTypeEnum(rulesConstraintsOWLClassTypeEnum);
			return error;
		}
		return null;
	}
	
	@Deprecated
	public static SWRLError build(RulesConstraintsOWLClassTypeEnumOld rulesConstraintsOWLClassTypeEnum, PelletReasoner pelletReasoner, OWLClass owlClass, OWLObjectProperty owlObjectProperty) {
		throw new RuntimeException("Só pra não perder o código antigo.");
	}
	
	@Deprecated
	public static SWRLError build(RulesConstraintsOWLClassTypeEnumOld rulesConstraintsOWLClassTypeEnum, PelletReasoner pelletReasoner, OWLClass owlClass) {
		throw new RuntimeException("Só pra não perder o código antigo.");
	}
}
