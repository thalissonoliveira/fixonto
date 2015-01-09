package fixture.owl.model.element;

import fixture.owl.model.intefaces.FeaturedElement;

public class GroupedFeature extends Feature implements FeaturedElement {

	public GroupedFeature() {
		super();
	}

	public GroupedFeature(String id, String name) {
		super(id, name);
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
		return true;
	}
	
}
