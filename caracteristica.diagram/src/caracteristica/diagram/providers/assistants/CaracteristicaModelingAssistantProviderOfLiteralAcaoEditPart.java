/*
 * 
 */
package caracteristica.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import caracteristica.diagram.edit.parts.LiteralAcaoEditPart;
import caracteristica.diagram.providers.CaracteristicaElementTypes;
import caracteristica.diagram.providers.CaracteristicaModelingAssistantProvider;

/**
 * @generated
 */
public class CaracteristicaModelingAssistantProviderOfLiteralAcaoEditPart
		extends CaracteristicaModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((LiteralAcaoEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(LiteralAcaoEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(CaracteristicaElementTypes.RegraDeContextoAcao_4015);
		types.add(CaracteristicaElementTypes.AcaoLogicoLadoEsquerdoAcao_4018);
		types.add(CaracteristicaElementTypes.AcaoLogicoLadoDireitoAcao_4019);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((LiteralAcaoEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(LiteralAcaoEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == CaracteristicaElementTypes.RegraDeContextoAcao_4015) {
			types.add(CaracteristicaElementTypes.RegraDeContexto_2022);
		} else if (relationshipType == CaracteristicaElementTypes.AcaoLogicoLadoEsquerdoAcao_4018) {
			types.add(CaracteristicaElementTypes.AcaoLogico_2008);
		} else if (relationshipType == CaracteristicaElementTypes.AcaoLogicoLadoDireitoAcao_4019) {
			types.add(CaracteristicaElementTypes.AcaoLogico_2008);
		}
		return types;
	}

}
