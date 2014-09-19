package fixture.owl.model.rule;

import fixture.owl.model.intefaces.Nameable;

public abstract class Rule implements Nameable {
	
	private String name;
	
	private String conteudo;
	
	public Rule() {
		super();
	}
	
	public abstract boolean isCompositionRule();
	public abstract boolean isContextRule();
	
	public Rule(String name) {
		super();
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return this.name;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	

} // Regra
