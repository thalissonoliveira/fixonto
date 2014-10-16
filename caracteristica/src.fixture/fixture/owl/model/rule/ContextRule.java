package fixture.owl.model.rule;


/**
 * 
 * @author thalissonoliveira
 *
 */
public class ContextRule extends Rule {
	
	private Event event;
	
	private Action action;
	
	public ContextRule() {
		super();
	}

	public ContextRule(String name, int id) {
		super(name, id);
	}

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
