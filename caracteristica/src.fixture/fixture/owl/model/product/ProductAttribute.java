package fixture.owl.model.product;

import caracteristica.TipoValor;
import fixture.owl.model.intefaces.Element;

//TODO Verificar mistura de português com inglês.
public class ProductAttribute implements ProductElement {

	private String name;
	
	private String id;
	
	private Element originalElement;

	private String valor;
	
	private TipoValor tipoValor;
	
	private ProductFeature fatherProductFeature;
	
	
	public ProductAttribute() {
		super();
	}
	
	public ProductAttribute(String id, String name) {
		this();
		this.id = id;
		this.name = name;
	}
	
	
	
	public void setTipoValor(int tv) {
		TipoValor tipoValor = TipoValor.get(tv);
		setTipoValor(tipoValor);
	}
	

	//G 'n S
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	@Override
	public boolean isProductAttribute() {
		return true;
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

} // AtributoProduto
