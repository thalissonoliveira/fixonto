package fixture.owl.model.rule;


public class CompositionRule extends Rule {
	
	@Override
	public boolean isCompositionRule() {
		return true;
	}
	
	@Override
	public boolean isContextRule() {
		return false;
	}

} // RegraDeComposicao
