package fixture.owl.model.product;

import java.util.Set;

import fixture.owl.model.intefaces.Element;


public class ProductVariation implements ProductElement{	

	private String name;
	
	private Element originalElement;
	
	private int minimumCardinality;
	private int maximalCardinality;
	private Set<ProductVariation> productVariations;
	
	//
	public ProductVariation() {
		
		
	}

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
	
	
} // VariacaoProduto
