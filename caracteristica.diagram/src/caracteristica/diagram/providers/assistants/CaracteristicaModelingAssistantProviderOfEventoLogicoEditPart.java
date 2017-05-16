/*
 * 
 */
package caracteristica.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import caracteristica.diagram.edit.parts.EventoLogicoEditPart;
import caracteristica.diagram.edit.parts.EventoRelacionalEditPart;
import caracteristica.diagram.providers.CaracteristicaElementTypes;
import caracteristica.diagram.providers.CaracteristicaModelingAssistantProvider;

/**
 * @generated
 */
public class CaracteristicaModelingAssistantProviderOfEventoLogicoEditPart
		extends CaracteristicaModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((EventoLogicoEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(EventoLogicoEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(CaracteristicaElementTypes.EventoLogicoLadoDireitoEvento_4016);
		types.add(CaracteristicaElementTypes.EventoLogicoLadoEsquerdoEvento_4017);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((EventoLogicoEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(EventoLogicoEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof EventoLogicoEditPart) {
			types.add(CaracteristicaElementTypes.EventoLogicoLadoDireitoEvento_4016);
		}
		if (targetEditPart instanceof EventoRelacionalEditPart) {
			types.add(CaracteristicaElementTypes.EventoLogicoLadoDireitoEvento_4016);
		}
		if (targetEditPart instanceof EventoLogicoEditPart) {
			types.add(CaracteristicaElementTypes.EventoLogicoLadoEsquerdoEvento_4017);
		}
		if (targetEditPart instanceof EventoRelacionalEditPart) {
			types.add(CaracteristicaElementTypes.EventoLogicoLadoEsquerdoEvento_4017);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((EventoLogicoEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(EventoLogicoEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == CaracteristicaElementTypes.EventoLogicoLadoDireitoEvento_4016) {
			types.add(CaracteristicaElementTypes.EventoLogico_2006);
			types.add(CaracteristicaElementTypes.EventoRelacional_2007);
		} else if (relationshipType == CaracteristicaElementTypes.EventoLogicoLadoEsquerdoEvento_4017) {
			types.add(CaracteristicaElementTypes.EventoLogico_2006);
			types.add(CaracteristicaElementTypes.EventoRelacional_2007);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((EventoLogicoEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(EventoLogicoEditPart target) {
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
		return doGetTypesForSource((EventoLogicoEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(EventoLogicoEditPart target, IElementType relationshipType) {
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
