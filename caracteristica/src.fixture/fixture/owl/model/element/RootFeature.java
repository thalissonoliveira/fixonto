package fixture.owl.model.element;



public class RootFeature extends Feature {
	public RootFeature() {
		super();
	}

	public RootFeature(String name, int id) {
		super(name, id);
	}

	public boolean isMandatoryFeature() {
		return false;
	}

	public boolean isOptionalFeature() {
		return false;
	}

	public boolean isVariatioTwoFeature() {
		return false;
	}

	public boolean isRootFeature() {
		return true;
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
	
} // CaracteristicaRaiz
