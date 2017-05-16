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

import caracteristica.diagram.edit.parts.AcaoLogicoEditPart;
import caracteristica.diagram.edit.parts.DesignarEditPart;
import caracteristica.diagram.edit.parts.EventoLogicoEditPart;
import caracteristica.diagram.edit.parts.EventoRelacionalEditPart;
import caracteristica.diagram.edit.parts.LiteralAcaoEditPart;
import caracteristica.diagram.edit.parts.RegraDeContextoEditPart;
import caracteristica.diagram.providers.CaracteristicaElementTypes;
import caracteristica.diagram.providers.CaracteristicaModelingAssistantProvider;

/**
 * @generated
 */
public class CaracteristicaModelingAssistantProviderOfRegraDeContextoEditPart
		extends CaracteristicaModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((RegraDeContextoEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(RegraDeContextoEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(CaracteristicaElementTypes.RegraDeContextoEvento_4014);
		types.add(CaracteristicaElementTypes.RegraDeContextoAcao_4015);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((RegraDeContextoEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(RegraDeContextoEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof EventoLogicoEditPart) {
			types.add(CaracteristicaElementTypes.RegraDeContextoEvento_4014);
		}
		if (targetEditPart instanceof EventoRelacionalEditPart) {
			types.add(CaracteristicaElementTypes.RegraDeContextoEvento_4014);
		}
		if (targetEditPart instanceof AcaoLogicoEditPart) {
			types.add(CaracteristicaElementTypes.RegraDeContextoAcao_4015);
		}
		if (targetEditPart instanceof LiteralAcaoEditPart) {
			types.add(CaracteristicaElementTypes.RegraDeContextoAcao_4015);
		}
		if (targetEditPart instanceof DesignarEditPart) {
			types.add(CaracteristicaElementTypes.RegraDeContextoAcao_4015);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((RegraDeContextoEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(RegraDeContextoEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == CaracteristicaElementTypes.RegraDeContextoEvento_4014) {
			types.add(CaracteristicaElementTypes.EventoLogico_2006);
			types.add(CaracteristicaElementTypes.EventoRelacional_2007);
		} else if (relationshipType == CaracteristicaElementTypes.RegraDeContextoAcao_4015) {
			types.add(CaracteristicaElementTypes.AcaoLogico_2008);
			types.add(CaracteristicaElementTypes.LiteralAcao_2009);
			types.add(CaracteristicaElementTypes.Designar_2010);
		}
		return types;
	}

}
