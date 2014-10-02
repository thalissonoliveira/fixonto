package fixture.owl.swrl;

import org.mindswap.pellet.ABox;
import org.mindswap.pellet.Node;
import org.mindswap.pellet.utils.ATermUtils;

import fixture.owl.swrl.interfaces.FixtureSWRLFunction;

/** 
 * The built-in implementation. 
 */ 
public class FixtureEqualNameSWRLFunction implements FixtureSWRLFunction {
	
    @Override 
    public boolean isApplicable(boolean[] boundPositions) { 
        //applicable only to 4 arguments, two bound and two unbound
        return boundPositions.length == 4 && boundPositions[0] && boundPositions[1] && boundPositions[2] && boundPositions[3]; 
    } 

    @Override 
    public boolean apply(ABox abox, Node[] args) { 
    	
//    	System.out.println("EXECUTANDO A VALIDA��O");
        //accepts FixtureIRIparts(individual, individual, nameOne string, nameTwo string) 
        if (!args[0].isIndividual() || !args[1].isIndividual() || args[2] == null || args[3] == null) {
        	return false; 
        }
        
        String individualOneName = args[0].getNameStr().split("#")[1]; 
        String individualTwoName = args[1].getNameStr().split("#")[1];
        
        String hasNameOne = ATermUtils.getLiteralValue(args[2].getTerm());
        String hasNameTwo = ATermUtils.getLiteralValue(args[3].getTerm());
        
        
        if (individualOneName.equalsIgnoreCase(individualTwoName)) {
        	return false;
        } else {
        	if (!hasNameOne.equalsIgnoreCase(hasNameTwo)) {
        		return false; 
        	} else {
        		System.out.println("[" + individualOneName + ", " + individualTwoName + ", " + hasNameOne  + ", " + hasNameTwo + "]");
        		System.out.println("Rum... � aplic�vel?");
        		return true; 
        	}
        }
    } 
} 