/*
 * 
 */
package caracteristica.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import caracteristica.diagram.edit.parts.ExpressaoRelacionalEditPart;
import caracteristica.diagram.providers.CaracteristicaElementTypes;
import caracteristica.diagram.providers.CaracteristicaModelingAssistantProvider;

/**
 * @generated
 */
public class CaracteristicaModelingAssistantProviderOfExpressaoRelacionalEditPart
		extends CaracteristicaModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((ExpressaoRelacionalEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(ExpressaoRelacionalEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(4);
		types.add(CaracteristicaElementTypes.RegraDeComposicaoAntecedente_4012);
		types.add(CaracteristicaElementTypes.RegraDeComposicaoConsequente_4013);
		types.add(CaracteristicaElementTypes.ExpressaoLogicaLadoDireitoComposicao_4020);
		types.add(CaracteristicaElementTypes.ExpressaoLogicaLadoEsquerdoComposicao_4021);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((ExpressaoRelacionalEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(ExpressaoRelacionalEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == CaracteristicaElementTypes.RegraDeComposicaoAntecedente_4012) {
			types.add(CaracteristicaElementTypes.RegraDeComposicao_2021);
		} else if (relationshipType == CaracteristicaElementTypes.RegraDeComposicaoConsequente_4013) {
			types.add(CaracteristicaElementTypes.RegraDeComposicao_2021);
		} else if (relationshipType == CaracteristicaElementTypes.ExpressaoLogicaLadoDireitoComposicao_4020) {
			types.add(CaracteristicaElementTypes.ExpressaoLogica_2011);
		} else if (relationshipType == CaracteristicaElementTypes.ExpressaoLogicaLadoEsquerdoComposicao_4021) {
			types.add(CaracteristicaElementTypes.ExpressaoLogica_2011);
		}
		return types;
	}

}
