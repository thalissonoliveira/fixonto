package fixture.owl.model.product;

import fixture.owl.model.intefaces.Element;


public class ProductVariant implements ProductElement{
	
	private String name;
	
	private int id;

	private Element originalElement;

	private ProductVariation fatherProductVariation;
	
	//
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Element getOriginalElement() {
		return originalElement;
	}

	public void setOriginalElement(Element originalElement) {
		this.originalElement = originalElement;
	}

	public ProductVariation getFatherProductVariation() {
		return fatherProductVariation;
	}

	public void setFatherProductVariation(ProductVariation fatherProductVariation) {
		this.fatherProductVariation = fatherProductVariation;
	}

	@Override
	public boolean isProduct() {
		return false;
	}
	
	} // VarianteProduto
