package fixture.owl.model.element;

import java.util.HashSet;
import java.util.Set;

public class ContextRoot extends ElementImpl {
	
	private Set<ContextEntity> contextEntities;
	
	public ContextRoot() {
		contextEntities = new HashSet<ContextEntity>();
	}
	
	public ContextRoot(String id, String name) {
		super(id, name);
		contextEntities = new HashSet<ContextEntity>();
	}

	public Set<ContextEntity> getContextEntities() {
		return contextEntities;
	}

	public void setContextEntities(Set<ContextEntity> contextEntities) {
		this.contextEntities = contextEntities;
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
		return true;
	}
	
	@Override
	public boolean isGroupedFeature() {
		return false;
	}
	
} // RaizDeContexto
