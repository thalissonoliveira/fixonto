package fixture.owl.model.element;

import fixture.owl.model.intefaces.FeaturedElement;

public class OptionalFeature extends Feature implements FeaturedElement {

	public OptionalFeature() {
		super();
	}

	public OptionalFeature(String name, int id) {
		super(name, id);
	}

	@Override
	public boolean isMandatoryFeature() {
		return false;
	}

	@Override
	public boolean isOptionalFeature() {
		return true;
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
	
} // CaracteristicaOpcional
