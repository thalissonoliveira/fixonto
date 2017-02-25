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
import caracteristica.diagram.edit.parts.EntidadeDeContextoEditPart;
import caracteristica.diagram.edit.parts.InformacaoDeContextoEditPart;
import caracteristica.diagram.edit.parts.VariacaoDoisEditPart;
import caracteristica.diagram.providers.CaracteristicaElementTypes;
import caracteristica.diagram.providers.CaracteristicaModelingAssistantProvider;

/**
 * @generated
 */
public class CaracteristicaModelingAssistantProviderOfEntidadeDeContextoEditPart
		extends CaracteristicaModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((EntidadeDeContextoEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(EntidadeDeContextoEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(CaracteristicaElementTypes.ContextoCaracteristicasIncluir_4025);
		types.add(CaracteristicaElementTypes.ContextoCaracteristicasExcluir_4026);
		types.add(CaracteristicaElementTypes.EntidadeDeContextoInformacoesDeContexto_4028);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((EntidadeDeContextoEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(EntidadeDeContextoEditPart source,
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
		if (targetEditPart instanceof InformacaoDeContextoEditPart) {
			types.add(CaracteristicaElementTypes.EntidadeDeContextoInformacoesDeContexto_4028);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((EntidadeDeContextoEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(EntidadeDeContextoEditPart source, IElementType relationshipType) {
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
		} else if (relationshipType == CaracteristicaElementTypes.EntidadeDeContextoInformacoesDeContexto_4028) {
			types.add(CaracteristicaElementTypes.InformacaoDeContexto_2036);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((EntidadeDeContextoEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(EntidadeDeContextoEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(CaracteristicaElementTypes.RaizDeContextoEntidadesDeContexto_4027);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((EntidadeDeContextoEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(EntidadeDeContextoEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == CaracteristicaElementTypes.RaizDeContextoEntidadesDeContexto_4027) {
			types.add(CaracteristicaElementTypes.RaizDeContexto_2034);
		}
		return types;
	}

}
