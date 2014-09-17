package fixture.owl.model.element;

import fixture.owl.model.intefaces.Element;

public abstract class ElementImpl implements Element {
	
	private String name;
	
	public ElementImpl() {}
	
	public ElementImpl(String name) {
		this.setName(name);
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
} // Elemento
