package fixture.owl.model.product;

import java.util.HashSet;
import java.util.Set;

import fixture.owl.model.intefaces.Element;

public class ProductFeature implements ProductElement {
	
	private String name;
	
	private Element originalElement;

	private ProductFeature fatherProductFeature;
	
	private Set<ProductFeature> daugtherProductFeature;
	
	private Set<ProductAttribute> productAttribute;
	
	
	//
	public ProductFeature() {
		daugtherProductFeature = new HashSet<ProductFeature>();
		productAttribute = new HashSet<ProductAttribute>();
		
	}
	
	
	//Gets e Sets
	
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

	public ProductFeature getFatherProductFeature() {
		return fatherProductFeature;
	}

	public void setFatherProductFeature(ProductFeature fatherProductFeature) {
		this.fatherProductFeature = fatherProductFeature;
	}


	public Set<ProductFeature> getDaugtherProductFeature() {
		return daugtherProductFeature;
	}


	public void setDaugtherProductFeature(Set<ProductFeature> daugtherProductFeature) {
		this.daugtherProductFeature = daugtherProductFeature;
	}


	public Set<ProductAttribute> getProductAttribute() {
		return productAttribute;
	}


	public void setProductAttribute(Set<ProductAttribute> productAttribute) {
		this.productAttribute = productAttribute;
	}
	
	@Override
	public boolean isProduct() {
		return false;
	}
	
	
	
} // CaracteristicaProduto
