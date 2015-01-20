package fixture.owl.model.product;


public class ProductGroupedFeature extends ProductFeature {

	
	public ProductGroupedFeature() {
		super();
	}

	public ProductGroupedFeature(String id, String name) {
		super(id, name);
	}

	//
	
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
		return true;
	}

} // VariacaoDoisProduto
