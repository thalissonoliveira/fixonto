package fixture.owl.enumeration.interfaces;

import org.semanticweb.owlapi.model.OWLClass;

import fixture.owl.enumeration.RulesConstraintsOWLClassTypeEnum;

/**
 * 
 * Interface to markup {@link Enum} representing possible instances of {@link OWLClass}.
 * These instances may don't have a {@link Class} corresponding in code. {@link RulesConstraintsOWLClassTypeEnum} 
 * is an enum example without linked to a "model class".
 * 
 * @author thalissonoliveira
 *
 */
public interface FixtureOWLClassTypeEnumInterface {

	String getIRI();
	int getCode();
	String getDescription();
	String getLabel();
	
}
