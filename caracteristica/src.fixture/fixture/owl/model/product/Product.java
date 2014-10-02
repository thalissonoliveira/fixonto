package fixture.owl.model.product;

import fixture.owl.model.element.RootFeature;


public class Product extends ProductFeature {
	
	private RootFeature productLine;

	public RootFeature getProductLine() {
		return productLine;
	}

	public void setProductLine(RootFeature productLine) {
		this.productLine = productLine;
	}
	
	
} // Produto
