package fixture.owl.model.element;


public class ContextInfo extends ElementImpl {
	
	private ContextEntity fatherContextEntity;
	
	public ContextInfo() {
		super();
	}

	public ContextInfo(String name, int id) {
		super(name, id);
	}
	
	public ContextEntity getFatherContextEntity() {
		return fatherContextEntity;
	}

	public void setFatherContextEntity(ContextEntity fatherContextEntity) {
		this.fatherContextEntity = fatherContextEntity;
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
	
} // InformacaodeContexto
