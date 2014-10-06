package fixture.owl.semanticrules;

import com.clarkparsia.pellet.rules.BindingHelper;
import com.clarkparsia.pellet.rules.builtins.BuiltIn;
import com.clarkparsia.pellet.rules.model.BuiltInAtom;

public class FixtureBuiltin implements BuiltIn {
	
	@Override
    public BindingHelper createHelper(BuiltInAtom atom) {
        return new FixtureEqualNameBuiltinHelper(atom);
    }

}