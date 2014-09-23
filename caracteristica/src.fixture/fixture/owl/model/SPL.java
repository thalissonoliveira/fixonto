package fixture.owl.model;

import java.util.HashSet;
import java.util.Set;

import fixture.owl.model.element.RootFeature;
import fixture.owl.model.intefaces.Element;
import fixture.owl.model.intefaces.Nameable;
import fixture.owl.model.rule.Rule;

/**
 * @author thalissonoliveira
 *
 */
public class SPL implements Nameable {
	
	private String name;
	
	private RootFeature system;
	
	private Set<Element> elements;
	
	private Set<Rule> rules;
	
	public SPL() {
		elements = new HashSet<Element>();
		rules = new HashSet<Rule>();
	}
	
	public SPL(String name) {
		this();
		this.name = name;
	}
	
	public SPL(String name, RootFeature system) {
		this(name);
		this.system = system;
	}
	
	public void addElement(Element element) {
		getElements().add(element);
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Element> getElements() {
		return elements;
	}

	public void setElements(Set<Element> elements) {
		this.elements = elements;
	}

	public RootFeature getSystem() {
		return system;
	}

	public void setSystem(RootFeature system) {
		this.system = system;
	}

	public Set<Rule> getRules() {
		return rules;
	}

	public void setRules(Set<Rule> rules) {
		this.rules = rules;
	}
	
} // LPS