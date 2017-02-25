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

import caracteristica.diagram.edit.parts.CaracteristicaAgrupadaEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaMandatoriaEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaOpcionalEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaRaizEditPart;
import caracteristica.diagram.edit.parts.ContextoEditPart;
import caracteristica.diagram.edit.parts.VariacaoDoisEditPart;
import caracteristica.diagram.providers.CaracteristicaElementTypes;
import caracteristica.diagram.providers.CaracteristicaModelingAssistantProvider;

/**
 * @generated
 */
public class CaracteristicaModelingAssistantProviderOfContextoEditPart extends CaracteristicaModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((ContextoEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(ContextoEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(CaracteristicaElementTypes.ContextoCaracteristicasIncluir_4025);
		types.add(CaracteristicaElementTypes.ContextoCaracteristicasExcluir_4026);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((ContextoEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(ContextoEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof CaracteristicaOpcionalEditPart) {
			types.add(CaracteristicaElementTypes.ContextoCaracteristicasIncluir_4025);
		}
		if (targetEditPart instanceof CaracteristicaAgrupadaEditPart) {
			types.add(CaracteristicaElementTypes.ContextoCaracteristicasIncluir_4025);
		}
		if (targetEditPart instanceof VariacaoDoisEditPart) {
			types.add(CaracteristicaElementTypes.ContextoCaracteristicasIncluir_4025);
		}
		if (targetEditPart instanceof CaracteristicaRaizEditPart) {
			types.add(CaracteristicaElementTypes.ContextoCaracteristicasIncluir_4025);
		}
		if (targetEditPart instanceof CaracteristicaMandatoriaEditPart) {
			types.add(CaracteristicaElementTypes.ContextoCaracteristicasIncluir_4025);
		}
		if (targetEditPart instanceof CaracteristicaOpcionalEditPart) {
			types.add(CaracteristicaElementTypes.ContextoCaracteristicasExcluir_4026);
		}
		if (targetEditPart instanceof CaracteristicaAgrupadaEditPart) {
			types.add(CaracteristicaElementTypes.ContextoCaracteristicasExcluir_4026);
		}
		if (targetEditPart instanceof VariacaoDoisEditPart) {
			types.add(CaracteristicaElementTypes.ContextoCaracteristicasExcluir_4026);
		}
		if (targetEditPart instanceof CaracteristicaRaizEditPart) {
			types.add(CaracteristicaElementTypes.ContextoCaracteristicasExcluir_4026);
		}
		if (targetEditPart instanceof CaracteristicaMandatoriaEditPart) {
			types.add(CaracteristicaElementTypes.ContextoCaracteristicasExcluir_4026);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((ContextoEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(ContextoEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == CaracteristicaElementTypes.ContextoCaracteristicasIncluir_4025) {
			types.add(CaracteristicaElementTypes.CaracteristicaOpcional_2001);
			types.add(CaracteristicaElementTypes.CaracteristicaAgrupada_2033);
			types.add(CaracteristicaElementTypes.VariacaoDois_2002);
			types.add(CaracteristicaElementTypes.CaracteristicaRaiz_2003);
			types.add(CaracteristicaElementTypes.CaracteristicaMandatoria_2004);
		} else if (relationshipType == CaracteristicaElementTypes.ContextoCaracteristicasExcluir_4026) {
			types.add(CaracteristicaElementTypes.CaracteristicaOpcional_2001);
			types.add(CaracteristicaElementTypes.CaracteristicaAgrupada_2033);
			types.add(CaracteristicaElementTypes.VariacaoDois_2002);
			types.add(CaracteristicaElementTypes.CaracteristicaRaiz_2003);
			types.add(CaracteristicaElementTypes.CaracteristicaMandatoria_2004);
		}
		return types;
	}

}
