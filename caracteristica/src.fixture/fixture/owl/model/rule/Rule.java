package fixture.owl.model.rule;

import fixture.owl.model.intefaces.Nameable;

public abstract class Rule implements Nameable {
	
	private String name;
	
	private int id;
	
	private String conteudo;
	
	public Rule() {
		super();
	}
	
	public abstract boolean isCompositionRule();
	public abstract boolean isContextRule();
	
	public Rule(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return this.name;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	

} // Regra
