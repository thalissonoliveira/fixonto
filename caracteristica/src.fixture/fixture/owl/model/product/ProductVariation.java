package fixture.owl.model.product;

import java.util.HashSet;
import java.util.Set;

import fixture.owl.model.intefaces.Element;


public class ProductVariation implements ProductElement{	

	private String name;
	
	private Element originalElement;
	
	private int minimumCardinality;
	
	private int maximalCardinality;
	
	private Set<ProductVariation> productVariations;
	
	private ProductFeature fatherProductFeature;
	
	//
	public ProductVariation() {
		productVariations = new  HashSet<ProductVariation>();
			
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

	public int getMinimumCardinality() {
		return minimumCardinality;
	}

	public void setMinimumCardinality(int minimumCardinality) {
		this.minimumCardinality = minimumCardinality;
	}

	public int getMaximalCardinality() {
		return maximalCardinality;
	}

	public void setMaximalCardinality(int maximalCardinality) {
		this.maximalCardinality = maximalCardinality;
	}

	public Set<ProductVariation> getProductVariations() {
		return productVariations;
	}

	public void setProductVariations(Set<ProductVariation> productVariations) {
		this.productVariations = productVariations;
	}

	public ProductFeature getFatherProductFeature() {
		return fatherProductFeature;
	}

	public void setFatherProductFeature(ProductFeature fatherProductFeature) {
		this.fatherProductFeature = fatherProductFeature;
	}
	
	
} // VariacaoProduto
