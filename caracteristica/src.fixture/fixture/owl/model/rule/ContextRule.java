package fixture.owl.model.rule;



public class ContextRule extends Rule {
	
	private Event event;
	
	private Action action;
	
	
	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public Action getAction() {
		return action;
	}

	public void setAction(Action action) {
		this.action = action;
	}

	@Override
	public boolean isCompositionRule() {
		return false;
	}
	
	@Override
	public boolean isContextRule() {
		return true;
	}
	
} // RegraDeContexto
