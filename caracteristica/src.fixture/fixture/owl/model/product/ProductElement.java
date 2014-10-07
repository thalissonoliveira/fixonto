package fixture.owl.model.product;

import fixture.owl.model.intefaces.Element;
import fixture.owl.model.intefaces.Nameable;


public interface ProductElement extends Nameable {
	
	void setName(String name);
	Element getOriginalElement();
	void setOriginalElement(Element element);
	
	boolean isProduct();
	
	
} // ElementodeProduto
