package fixture.owl.model.rule;

public abstract class Event extends Expression {
	
	public Event() {
		super();
	}
	
	public Event(String name) {
		super();
		this.setName(name);
	}
	public abstract boolean isLogicalEvent();
	public abstract boolean isRelationalEvent();
} // Evento
