package fixture.owl.model.rule;

public abstract class Event extends Expression {
	
	public Event() {
		super();
	}
	
	public Event(String name, int id) {
		super();
		this.setName(name);
		this.setId(id);
	}
	public abstract boolean isLogicalEvent();
	public abstract boolean isRelationalEvent();
} // Evento
