package fixture.owl.model.product;

import fixture.owl.model.enumeration.MaximalCardinality;
import fixture.owl.model.intefaces.Element;

public class ProductVariationTwo extends ProductFeature implements ProductElement {

	private String name;
	
	private Element originalElement;
	
	MaximalCardinality maximalCardinality;
	
	
//
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Element getOriginalElement() {
		return originalElement;
	}

	public void setOriginalElement(Element originalElement) {
		this.originalElement = originalElement;
	}

	public MaximalCardinality getMaximalCardinality() {
		return maximalCardinality;
	}

	public void setMaximalCardinality(MaximalCardinality maximalCardinality) {
		this.maximalCardinality = maximalCardinality;
	}

	
	
} // VariacaoDoisProduto
