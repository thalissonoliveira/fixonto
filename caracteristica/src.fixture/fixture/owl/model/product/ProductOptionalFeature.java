package fixture.owl.model.product;


public class ProductOptionalFeature extends ProductFeature {
	
	public ProductOptionalFeature() {
		super();
	}

	public ProductOptionalFeature(String id, String name) {
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
		return false;
	}

	@Override
	public boolean isProductOptionalFeature() {
		return true;
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
	
} // CaracteristicaOpcionalProduto
