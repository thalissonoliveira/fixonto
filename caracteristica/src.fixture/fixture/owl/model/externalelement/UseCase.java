package fixture.owl.model.externalelement;

public class UseCase extends ExternalElementImpl {
	
	public UseCase() {
		super();
	}

	public UseCase(String id, String name) {
		super(id, name);
	}

	@Override
	public boolean isTestCase() {
		return false;
	}

	@Override
	public boolean isUseCase() {
		return true;
	}

}
