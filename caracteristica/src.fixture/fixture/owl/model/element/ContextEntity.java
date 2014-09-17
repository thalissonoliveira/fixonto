package fixture.owl.model.element;

import java.util.HashSet;
import java.util.Set;

public class ContextEntity extends ElementImpl {
	
	private Set<ContextInfo> contextInfos;
	private ContextRoot fatherContextRoot;
	
	public ContextEntity() {
		contextInfos = new HashSet<ContextInfo>();
	}

	public ContextEntity(String name) {
		super(name);
		contextInfos = new HashSet<ContextInfo>();
	}
	
	public Set<ContextInfo> getContextInfos() {
		return contextInfos;
	}

	public void setContextInfos(Set<ContextInfo> contextInfos) {
		this.contextInfos = contextInfos;
	}
	
	public ContextRoot getFatherContextRoot() {
		return fatherContextRoot;
	}

	public void setFatherContextRoot(ContextRoot fatherContextRoot) {
		this.fatherContextRoot = fatherContextRoot;
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
	
} // EntidadedeContexto
