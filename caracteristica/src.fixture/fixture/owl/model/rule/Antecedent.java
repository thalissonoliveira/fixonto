package fixture.owl.model.rule;


public abstract class Antecedent extends Expression {
	
	public abstract boolean isCompositionLiteral();
	public abstract boolean isLogicalExpression();
	public abstract boolean isRelationalExpression();

} // Antecedente
