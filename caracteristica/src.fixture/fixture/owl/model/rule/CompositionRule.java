package fixture.owl.model.rule;


public class CompositionRule extends Rule {
	
	private Antecedent antecedent;
	
	private Antecedent consequent;
	
	public Antecedent getAntecedent() {
		return antecedent;
	}

	public void setAntecedent(Antecedent antecedent) {
		this.antecedent = antecedent;
	}

	public Antecedent getConsequent() {
		return consequent;
	}

	public void setConsequent(Antecedent consequent) {
		this.consequent = consequent;
	}

	@Override
	public boolean isCompositionRule() {
		return true;
	}
	
	@Override
	public boolean isContextRule() {
		return false;
	}

} // RegraDeComposicao
