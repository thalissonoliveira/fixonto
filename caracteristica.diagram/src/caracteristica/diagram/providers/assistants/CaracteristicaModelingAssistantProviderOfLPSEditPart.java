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
		List<IElementType> types = new ArrayList<IElementType>(14);
		types.add(CaracteristicaElementTypes.CaracteristicaOpcional_2001);
		types.add(CaracteristicaElementTypes.CaracteristicaAgrupada_2033);
		types.add(CaracteristicaElementTypes.VariacaoDois_2002);
		types.add(CaracteristicaElementTypes.CaracteristicaRaiz_2003);
		types.add(CaracteristicaElementTypes.CaracteristicaMandatoria_2004);
		types.add(CaracteristicaElementTypes.RaizDeContexto_2034);
		types.add(CaracteristicaElementTypes.EntidadeDeContexto_2035);
		types.add(CaracteristicaElementTypes.InformacaoDeContexto_2036);
		types.add(CaracteristicaElementTypes.ExpressaoLogica_2038);
		types.add(CaracteristicaElementTypes.ExpressaoRelacional_2039);
		types.add(CaracteristicaElementTypes.LiteralComposicao_2040);
		types.add(CaracteristicaElementTypes.Atributo_2017);
		types.add(CaracteristicaElementTypes.Contexto_2037);
		types.add(CaracteristicaElementTypes.RegraDeComposicao_2041);
		return types;
	}

}
