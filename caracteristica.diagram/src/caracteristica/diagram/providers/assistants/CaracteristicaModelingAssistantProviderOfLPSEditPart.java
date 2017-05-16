/*
 * 
 */
package caracteristica.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import caracteristica.diagram.providers.CaracteristicaElementTypes;
import caracteristica.diagram.providers.CaracteristicaModelingAssistantProvider;

/**
 * @generated
 */
public class CaracteristicaModelingAssistantProviderOfLPSEditPart extends CaracteristicaModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(28);
		types.add(CaracteristicaElementTypes.CaracteristicaOpcional_2001);
		types.add(CaracteristicaElementTypes.CaracteristicaAgrupada_2033);
		types.add(CaracteristicaElementTypes.VariacaoDois_2002);
		types.add(CaracteristicaElementTypes.CaracteristicaRaiz_2003);
		types.add(CaracteristicaElementTypes.CaracteristicaMandatoria_2004);
		types.add(CaracteristicaElementTypes.Produto_2005);
		types.add(CaracteristicaElementTypes.EventoLogico_2006);
		types.add(CaracteristicaElementTypes.EventoRelacional_2007);
		types.add(CaracteristicaElementTypes.AcaoLogico_2008);
		types.add(CaracteristicaElementTypes.LiteralAcao_2009);
		types.add(CaracteristicaElementTypes.Designar_2010);
		types.add(CaracteristicaElementTypes.ExpressaoLogica_2011);
		types.add(CaracteristicaElementTypes.ExpressaoRelacional_2012);
		types.add(CaracteristicaElementTypes.LiteralComposicao_2013);
		types.add(CaracteristicaElementTypes.CaracteristicaMandatoriaProduto_2025);
		types.add(CaracteristicaElementTypes.CaracteristicaOpcionalProduto_2026);
		types.add(CaracteristicaElementTypes.VariacaoDoisProduto_2027);
		types.add(CaracteristicaElementTypes.CaracteristicaAgrupadaProduto_2035);
		types.add(CaracteristicaElementTypes.Atributo_2017);
		types.add(CaracteristicaElementTypes.RaizDeContexto_2018);
		types.add(CaracteristicaElementTypes.EntidadeDeContexto_2028);
		types.add(CaracteristicaElementTypes.InformacaoDeContexto_2029);
		types.add(CaracteristicaElementTypes.CasoDeUso_2038);
		types.add(CaracteristicaElementTypes.CasoDeTeste_2039);
		types.add(CaracteristicaElementTypes.RegraDeComposicao_2021);
		types.add(CaracteristicaElementTypes.RegraDeContexto_2022);
		types.add(CaracteristicaElementTypes.AtributoProduto_2030);
		types.add(CaracteristicaElementTypes.Simulacao_2024);
		return types;
	}

}
