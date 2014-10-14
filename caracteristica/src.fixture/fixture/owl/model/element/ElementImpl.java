package fixture.owl.model.element;

import fixture.owl.model.intefaces.Element;

public abstract class ElementImpl implements Element {
	
	private String name;
	
	private int id;
	
	public ElementImpl() {}
	
	public ElementImpl(String name, int id) {
		this.setName(name);
		this.setId(id);
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
} // Elemento
