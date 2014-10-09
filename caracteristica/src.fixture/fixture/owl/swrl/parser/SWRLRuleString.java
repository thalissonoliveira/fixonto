package fixture.owl.swrl.parser;

import java.util.ArrayList;
import java.util.List;

public class SWRLRuleString {
	
	private String rule;
	private List<AtomString> antecedentAtoms;
	private List<AtomString> consequentAtoms;
	
	public static class AtomString {
		private String atomType;
		private String[] variables;
		public String getAtomType() {
			return atomType;
		}
		public void setAtomType(String atomType) {
			this.atomType = atomType;
		}
		public String[] getVariables() {
			return variables;
		}
		public void setVariables(String[] variables) {
			this.variables = variables;
		}
		
	}
	
	public SWRLRuleString(String rule) {
		this.rule = rule;
		antecedentAtoms = new ArrayList<AtomString>();
		consequentAtoms = new ArrayList<AtomString>();
		processParts(rule);
	}
	
	
	private void processParts(String rule) {
		String ruleTrim = rule.replace(" ", "");
		ruleTrim = ruleTrim.replace("\n", "");
		String[] parts = ruleTrim.split("->");
		
		String[] antecedent = parts[0].split("\\^");
		String[] consequent = parts[1].split("\\^");
		
		for (String atom : antecedent) {
			processAtom(atom, antecedentAtoms);
		}
		for (String atom : consequent) {
			processAtom(atom, consequentAtoms);
		}
		
	}

	private void processAtom(String atom, List<AtomString> atoms) {
		int openPerentesisIndex = atom.indexOf("(");
		int closePerentesisIndex = atom.indexOf(")");
		String atomType = atom.substring(0, openPerentesisIndex);
		String[] variables = atom.substring(openPerentesisIndex+1, closePerentesisIndex).split(",");
		
		AtomString atomString = new AtomString();
		atomString.setAtomType(atomType);
		atomString.setVariables(variables);
		atoms.add(atomString);
	}


	public String getRule() {
		return rule;
	}


	public List<AtomString> getAntecedentAtoms() {
		return antecedentAtoms;
	}


	public List<AtomString> getConsequentAtoms() {
		return consequentAtoms;
	}
	
}
