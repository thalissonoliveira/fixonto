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
import caracteristica.diagram.edit.parts.LiteralAcaoEditPart;
import caracteristica.diagram.providers.CaracteristicaElementTypes;
import caracteristica.diagram.providers.CaracteristicaModelingAssistantProvider;

/**
 * @generated
 */
public class CaracteristicaModelingAssistantProviderOfAcaoLogicoEditPart
		extends CaracteristicaModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((AcaoLogicoEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(AcaoLogicoEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(CaracteristicaElementTypes.AcaoLogicoLadoEsquerdoAcao_4018);
		types.add(CaracteristicaElementTypes.AcaoLogicoLadoDireitoAcao_4019);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((AcaoLogicoEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(AcaoLogicoEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof AcaoLogicoEditPart) {
			types.add(CaracteristicaElementTypes.AcaoLogicoLadoEsquerdoAcao_4018);
		}
		if (targetEditPart instanceof LiteralAcaoEditPart) {
			types.add(CaracteristicaElementTypes.AcaoLogicoLadoEsquerdoAcao_4018);
		}
		if (targetEditPart instanceof DesignarEditPart) {
			types.add(CaracteristicaElementTypes.AcaoLogicoLadoEsquerdoAcao_4018);
		}
		if (targetEditPart instanceof AcaoLogicoEditPart) {
			types.add(CaracteristicaElementTypes.AcaoLogicoLadoDireitoAcao_4019);
		}
		if (targetEditPart instanceof LiteralAcaoEditPart) {
			types.add(CaracteristicaElementTypes.AcaoLogicoLadoDireitoAcao_4019);
		}
		if (targetEditPart instanceof DesignarEditPart) {
			types.add(CaracteristicaElementTypes.AcaoLogicoLadoDireitoAcao_4019);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((AcaoLogicoEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(AcaoLogicoEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == CaracteristicaElementTypes.AcaoLogicoLadoEsquerdoAcao_4018) {
			types.add(CaracteristicaElementTypes.AcaoLogico_2008);
			types.add(CaracteristicaElementTypes.LiteralAcao_2009);
			types.add(CaracteristicaElementTypes.Designar_2010);
		} else if (relationshipType == CaracteristicaElementTypes.AcaoLogicoLadoDireitoAcao_4019) {
			types.add(CaracteristicaElementTypes.AcaoLogico_2008);
			types.add(CaracteristicaElementTypes.LiteralAcao_2009);
			types.add(CaracteristicaElementTypes.Designar_2010);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((AcaoLogicoEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(AcaoLogicoEditPart target) {
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
		return doGetTypesForSource((AcaoLogicoEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(AcaoLogicoEditPart target, IElementType relationshipType) {
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
