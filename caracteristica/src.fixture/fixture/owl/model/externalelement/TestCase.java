package fixture.owl.model.externalelement;

public class TestCase extends ExternalElementImpl {
	

	public TestCase() {
		super();
	}

	public TestCase(String id, String name) {
		super(id, name);
	}

	@Override
	public boolean isTestCase() {
		return true;
	}

	@Override
	public boolean isUseCase() {
		return false;
	}

}
