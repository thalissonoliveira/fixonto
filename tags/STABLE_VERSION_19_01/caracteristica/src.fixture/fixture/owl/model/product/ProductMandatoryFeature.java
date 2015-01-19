package fixture.owl.model.product;

public class ProductMandatoryFeature extends ProductFeature {
	
	
	public ProductMandatoryFeature() {
		super();
	}

	public ProductMandatoryFeature(String id, String name) {
		super(id, name);
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
		return true;
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
	
} // CaracteristicaMandatoriaProduto
