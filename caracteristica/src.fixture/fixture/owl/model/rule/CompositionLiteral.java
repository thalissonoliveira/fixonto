package fixture.owl.model.rule;

import fixture.owl.model.enumeration.Presence;
import fixture.owl.model.intefaces.FeaturedElement;



public class CompositionLiteral extends Antecedent {
	
	private Presence presence;
	
	private FeaturedElement featuredElement;

	public Presence getPresence() {
		return presence;
	}

	public void setPresence(Presence presence) {
		this.presence = presence;
	}

	public FeaturedElement getFeaturedElement() {
		return featuredElement;
	}

	public void setFeaturedElement(FeaturedElement featuredElement) {
		this.featuredElement = featuredElement;
	}

	@Override
	public boolean isCompositionLiteral() {
		return true;
	}

	@Override
	public boolean isLogicalExpression() {
		return false;
	}

	@Override
	public boolean isRelationalExpressionj() {
		return false;
	}
	
} // LiteralComposicao
