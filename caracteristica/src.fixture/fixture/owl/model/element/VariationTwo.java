package fixture.owl.model.element;

import fixture.owl.model.intefaces.FeaturedElement;

public class VariationTwo extends Feature implements FeaturedElement {

	public VariationTwo() {
		super();
	}

	public VariationTwo(String name) {
		super(name);
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
		return true;
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
	
} // VariacaoDois
