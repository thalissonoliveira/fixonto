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
import caracteristica.diagram.edit.parts.RegraDeComposicaoEditPart;
import caracteristica.diagram.providers.CaracteristicaElementTypes;
import caracteristica.diagram.providers.CaracteristicaModelingAssistantProvider;

/**
 * @generated
 */
public class CaracteristicaModelingAssistantProviderOfRegraDeComposicaoEditPart
		extends CaracteristicaModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((RegraDeComposicaoEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(RegraDeComposicaoEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(CaracteristicaElementTypes.RegraDeComposicaoAntecedente_4012);
		types.add(CaracteristicaElementTypes.RegraDeComposicaoConsequente_4013);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((RegraDeComposicaoEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(RegraDeComposicaoEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof ExpressaoLogicaEditPart) {
			types.add(CaracteristicaElementTypes.RegraDeComposicaoAntecedente_4012);
		}
		if (targetEditPart instanceof ExpressaoRelacionalEditPart) {
			types.add(CaracteristicaElementTypes.RegraDeComposicaoAntecedente_4012);
		}
		if (targetEditPart instanceof LiteralComposicaoEditPart) {
			types.add(CaracteristicaElementTypes.RegraDeComposicaoAntecedente_4012);
		}
		if (targetEditPart instanceof ExpressaoLogicaEditPart) {
			types.add(CaracteristicaElementTypes.RegraDeComposicaoConsequente_4013);
		}
		if (targetEditPart instanceof ExpressaoRelacionalEditPart) {
			types.add(CaracteristicaElementTypes.RegraDeComposicaoConsequente_4013);
		}
		if (targetEditPart instanceof LiteralComposicaoEditPart) {
			types.add(CaracteristicaElementTypes.RegraDeComposicaoConsequente_4013);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((RegraDeComposicaoEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(RegraDeComposicaoEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == CaracteristicaElementTypes.RegraDeComposicaoAntecedente_4012) {
			types.add(CaracteristicaElementTypes.ExpressaoLogica_2011);
			types.add(CaracteristicaElementTypes.ExpressaoRelacional_2012);
			types.add(CaracteristicaElementTypes.LiteralComposicao_2013);
		} else if (relationshipType == CaracteristicaElementTypes.RegraDeComposicaoConsequente_4013) {
			types.add(CaracteristicaElementTypes.ExpressaoLogica_2011);
			types.add(CaracteristicaElementTypes.ExpressaoRelacional_2012);
			types.add(CaracteristicaElementTypes.LiteralComposicao_2013);
		}
		return types;
	}

}
