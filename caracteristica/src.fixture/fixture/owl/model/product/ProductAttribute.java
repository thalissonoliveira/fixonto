package fixture.owl.model.product;

import caracteristica.TipoValor;
import fixture.owl.model.intefaces.Element;

//TODO Verificar mistura de portugu�s com ingl�s.
public class ProductAttribute implements ProductElement{

	private String name;
	
	private Element originalElement;

	private String valor;
	
	private TipoValor tipoValor;
	
	private ProductFeature fatherProductFeature;
	
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

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public TipoValor getTipoValor() {
		return tipoValor;
	}

	public void setTipoValor(TipoValor tipoValor) {
		this.tipoValor = tipoValor;
	}

	public ProductFeature getFatherProductFeature() {
		return fatherProductFeature;
	}

	public void setFatherProductFeature(ProductFeature fatherProductFeature) {
		this.fatherProductFeature = fatherProductFeature;
	}
	
	@Override
	public boolean isProduct() {
		return false;
	}

} // AtributoProduto
