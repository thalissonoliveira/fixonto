package fixture.owl.model.rule;


public abstract class Antecedent extends Expression {
	
	
	public Antecedent() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Antecedent(String name, int id) {
		super();
		this.setName(name);
		this.setId(id);
	}
	
	public abstract boolean isCompositionLiteral();
	public abstract boolean isLogicalExpression();
	public abstract boolean isRelationalExpression();

} // Antecedente
