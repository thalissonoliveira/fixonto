package fixture.owl.model.element;

import fixture.owl.model.intefaces.FeaturedElement;

public class OptionalFeature extends Feature implements FeaturedElement {

	public OptionalFeature() {
		super();
	}

	public OptionalFeature(String id, String name) {
		super(id, name);
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
	
	@Override
	public boolean isContextEntity() {
		return false;
	}

	@Override
	public boolean isContextInfo() {
		return false;
	}
	
} // CaracteristicaOpcional
