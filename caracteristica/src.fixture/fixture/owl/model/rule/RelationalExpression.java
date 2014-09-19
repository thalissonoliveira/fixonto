package fixture.owl.model.rule;

import fixture.owl.model.element.Attribute;
import fixture.owl.model.enumeration.RelationalOperator;

public class RelationalExpression extends Antecedent {
	
	private Attribute expressionVariable;
	
	private RelationalOperator relationalOperator;
	
	private String valor;

	public Attribute getExpressionVariable() {
		return expressionVariable;
	}

	public void setExpressionVariable(Attribute expressionVariable) {
		this.expressionVariable = expressionVariable;
	}

	public RelationalOperator getRelationalOperator() {
		return relationalOperator;
	}

	public void setRelationalOperator(RelationalOperator relationalOperator) {
		this.relationalOperator = relationalOperator;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	@Override
	public boolean isCompositionLiteral() {
		return false;
	}

	@Override
	public boolean isLogicalExpression() {
		return false;
	}

	@Override
	public boolean isRelationalExpressionj() {
		return true;
	}
	
} // ExpressaoRelacional
