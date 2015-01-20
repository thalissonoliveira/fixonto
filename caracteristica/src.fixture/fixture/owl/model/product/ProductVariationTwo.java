package fixture.owl.model.product;

import fixture.owl.model.enumeration.MaximalCardinality;
import fixture.owl.model.intefaces.Element;

public class ProductVariationTwo extends ProductFeature {

	private Element originalElement;
	
	private MaximalCardinality maximalCardinality;
	
	public ProductVariationTwo() {
		super();
	}

	public ProductVariationTwo(String id, String name) {
		super(id, name);
	}

	//
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
	
	@Override
	public boolean isProduct() {
		return false;
	}

	@Override
	public boolean isProductAttribute() {
		return false;
	}

	@Override
	public boolean isProductMandatoryFeature() {
		return false;
	}

	@Override
	public boolean isProductOptionalFeature() {
		return false;
	}

	@Override
	public boolean isProductVariationTwoFeature() {
		return true;
	}

	@Override
	public boolean isProductVariant() {
		return false;
	}

	@Override
	public boolean isProductVariation() {
		return false;
	}
	
	@Override
	public boolean isProductGroupedFeature() {
		return false;
	}

} // VariacaoDoisProduto
