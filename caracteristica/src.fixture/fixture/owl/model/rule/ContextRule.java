package fixture.owl.model.rule;



public class ContextRule extends Rule {
	
	@Override
	public boolean isCompositionRule() {
		return false;
	}
	
	@Override
	public boolean isContextRule() {
		return true;
	}
	
} // RegraDeContexto
