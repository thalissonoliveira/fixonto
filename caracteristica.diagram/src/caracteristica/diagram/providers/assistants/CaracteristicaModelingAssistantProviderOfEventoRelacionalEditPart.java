/*
 * 
 */
package caracteristica.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import caracteristica.diagram.edit.parts.EventoRelacionalEditPart;
import caracteristica.diagram.providers.CaracteristicaElementTypes;
import caracteristica.diagram.providers.CaracteristicaModelingAssistantProvider;

/**
 * @generated
 */
public class CaracteristicaModelingAssistantProviderOfEventoRelacionalEditPart
		extends CaracteristicaModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((EventoRelacionalEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(EventoRelacionalEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(CaracteristicaElementTypes.RegraDeContextoEvento_4014);
		types.add(CaracteristicaElementTypes.EventoLogicoLadoDireitoEvento_4016);
		types.add(CaracteristicaElementTypes.EventoLogicoLadoEsquerdoEvento_4017);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((EventoRelacionalEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(EventoRelacionalEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == CaracteristicaElementTypes.RegraDeContextoEvento_4014) {
			types.add(CaracteristicaElementTypes.RegraDeContexto_2022);
		} else if (relationshipType == CaracteristicaElementTypes.EventoLogicoLadoDireitoEvento_4016) {
			types.add(CaracteristicaElementTypes.EventoLogico_2006);
		} else if (relationshipType == CaracteristicaElementTypes.EventoLogicoLadoEsquerdoEvento_4017) {
			types.add(CaracteristicaElementTypes.EventoLogico_2006);
		}
		return types;
	}

}
