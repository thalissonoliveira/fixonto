package fixture.owl.model.element;


public class MandatoryFeature extends Feature {

	public MandatoryFeature() {
		super();
	}
	
	public MandatoryFeature(String id, String name) {
		super(id, name);
	}

	@Override
	public boolean isMandatoryFeature() {
		return true;
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
	
	@Override
	public boolean isContextEntity() {
		return false;
	}

	@Override
	public boolean isContextInfo() {
		return false;
	}
	
	
} // CaracteristicaMandatoria
