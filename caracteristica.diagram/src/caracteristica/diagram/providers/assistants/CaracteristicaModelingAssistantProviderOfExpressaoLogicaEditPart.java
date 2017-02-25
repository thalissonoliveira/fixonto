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

import caracteristica.diagram.edit.parts.ExpressaoLogicaEditPart;
import caracteristica.diagram.edit.parts.ExpressaoRelacionalEditPart;
import caracteristica.diagram.edit.parts.LiteralComposicaoEditPart;
import caracteristica.diagram.providers.CaracteristicaElementTypes;
import caracteristica.diagram.providers.CaracteristicaModelingAssistantProvider;

/**
 * @generated
 */
public class CaracteristicaModelingAssistantProviderOfExpressaoLogicaEditPart
		extends CaracteristicaModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((ExpressaoLogicaEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(ExpressaoLogicaEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(CaracteristicaElementTypes.ExpressaoLogicaLadoDireitoComposicao_4031);
		types.add(CaracteristicaElementTypes.ExpressaoLogicaLadoEsquerdoComposicao_4032);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((ExpressaoLogicaEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(ExpressaoLogicaEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof ExpressaoLogicaEditPart) {
			types.add(CaracteristicaElementTypes.ExpressaoLogicaLadoDireitoComposicao_4031);
		}
		if (targetEditPart instanceof ExpressaoRelacionalEditPart) {
			types.add(CaracteristicaElementTypes.ExpressaoLogicaLadoDireitoComposicao_4031);
		}
		if (targetEditPart instanceof LiteralComposicaoEditPart) {
			types.add(CaracteristicaElementTypes.ExpressaoLogicaLadoDireitoComposicao_4031);
		}
		if (targetEditPart instanceof ExpressaoLogicaEditPart) {
			types.add(CaracteristicaElementTypes.ExpressaoLogicaLadoEsquerdoComposicao_4032);
		}
		if (targetEditPart instanceof ExpressaoRelacionalEditPart) {
			types.add(CaracteristicaElementTypes.ExpressaoLogicaLadoEsquerdoComposicao_4032);
		}
		if (targetEditPart instanceof LiteralComposicaoEditPart) {
			types.add(CaracteristicaElementTypes.ExpressaoLogicaLadoEsquerdoComposicao_4032);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((ExpressaoLogicaEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(ExpressaoLogicaEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == CaracteristicaElementTypes.ExpressaoLogicaLadoDireitoComposicao_4031) {
			types.add(CaracteristicaElementTypes.ExpressaoLogica_2038);
			types.add(CaracteristicaElementTypes.ExpressaoRelacional_2039);
			types.add(CaracteristicaElementTypes.LiteralComposicao_2040);
		} else if (relationshipType == CaracteristicaElementTypes.ExpressaoLogicaLadoEsquerdoComposicao_4032) {
			types.add(CaracteristicaElementTypes.ExpressaoLogica_2038);
			types.add(CaracteristicaElementTypes.ExpressaoRelacional_2039);
			types.add(CaracteristicaElementTypes.LiteralComposicao_2040);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((ExpressaoLogicaEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(ExpressaoLogicaEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(4);
		types.add(CaracteristicaElementTypes.RegraDeComposicaoAntecedente_4029);
		types.add(CaracteristicaElementTypes.RegraDeComposicaoConsequente_4030);
		types.add(CaracteristicaElementTypes.ExpressaoLogicaLadoDireitoComposicao_4031);
		types.add(CaracteristicaElementTypes.ExpressaoLogicaLadoEsquerdoComposicao_4032);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((ExpressaoLogicaEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(ExpressaoLogicaEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == CaracteristicaElementTypes.RegraDeComposicaoAntecedente_4029) {
			types.add(CaracteristicaElementTypes.RegraDeComposicao_2041);
		} else if (relationshipType == CaracteristicaElementTypes.RegraDeComposicaoConsequente_4030) {
			types.add(CaracteristicaElementTypes.RegraDeComposicao_2041);
		} else if (relationshipType == CaracteristicaElementTypes.ExpressaoLogicaLadoDireitoComposicao_4031) {
			types.add(CaracteristicaElementTypes.ExpressaoLogica_2038);
		} else if (relationshipType == CaracteristicaElementTypes.ExpressaoLogicaLadoEsquerdoComposicao_4032) {
			types.add(CaracteristicaElementTypes.ExpressaoLogica_2038);
		}
		return types;
	}

}
