package fixture.owl.model.element;

import fixture.owl.model.intefaces.FeaturedElement;
import fixture.owl.model.intefaces.VariationPoint;

public class Variant implements VariationPoint, FeaturedElement {

	@Override
	public String getName() {
		return null;
	}
	
	@Override
	public int getId() {
		return 0;
	}

	@Override
	public boolean isMandatoryFeature() {
		return false;
	}

	@Override
	public boolean isOptionalFeature() {
		return false;
	}

	@Override
	public boolean isVariatioTwoFeature() {
		return false;
	}

	@Override
	public boolean isRootFeature() {
		return false;
	}
	
	@Override
	public boolean isAttribute() {
		return false;
	}
	
	@Override
	public boolean isContextRoot() {
		return false;
	}
	
	@Override
	public boolean isGroupedFeature() {
		return false;
	}
	
	
	
} // Variante
