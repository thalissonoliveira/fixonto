package fixture.owl.swrl;

import com.clarkparsia.pellet.rules.BindingHelper;
import com.clarkparsia.pellet.rules.builtins.BuiltIn;
import com.clarkparsia.pellet.rules.model.BuiltInAtom;

import fixture.owl.swrl.interfaces.FixtureSWRLFunction;
import fixture.owl.swrl.utils.FixtureSWRLFunctionHelper;

/**
 * General custom SWRL built-in. Modelled after {com.clarkparsia.pellet.rules.builtins.GeneralFunctionBuiltIn}
 * but supports also Individuals, not only Literals..
 *
 * @author Martin Kuba makub@ics.muni.cz
 */
public class FixtureSWRLBuiltin implements BuiltIn {
	
    private FixtureSWRLFunction function;

    public FixtureSWRLBuiltin(FixtureSWRLFunction function) {
        this.function = function;
    }

    @Override
    public BindingHelper createHelper(BuiltInAtom atom) {
        return new FixtureSWRLFunctionHelper(atom, function);
    }

}