package fixture.owl.model.product;

import fixture.owl.model.element.RootFeature;


public class Product extends ProductFeature {
	
	private RootFeature productLine;
	
	public Product() {
		super();
	}

	public Product(String id, String name) {
		super(id, name);
	}

	public RootFeature getProductLine() {
		return productLine;
	}

	public void setProductLine(RootFeature productLine) {
		this.productLine = productLine;
	}

	@Override
	public boolean isProduct() {
		return true;
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
		return false;
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
	
} // Produto
