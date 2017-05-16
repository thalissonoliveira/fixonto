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

import caracteristica.diagram.edit.parts.AtributoProdutoEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaAgrupadaProdutoEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaMandatoriaProdutoEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaOpcionalProdutoEditPart;
import caracteristica.diagram.edit.parts.ProdutoEditPart;
import caracteristica.diagram.edit.parts.VariacaoDoisProdutoEditPart;
import caracteristica.diagram.providers.CaracteristicaElementTypes;
import caracteristica.diagram.providers.CaracteristicaModelingAssistantProvider;

/**
 * @generated
 */
public class CaracteristicaModelingAssistantProviderOfCaracteristicaAgrupadaProdutoEditPart
		extends CaracteristicaModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((CaracteristicaAgrupadaProdutoEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(CaracteristicaAgrupadaProdutoEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(CaracteristicaElementTypes.CaracteristicaProdutoCaracteristicaProdutoFilha_4008);
		types.add(CaracteristicaElementTypes.CaracteristicaProdutoAtributoProduto_4009);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((CaracteristicaAgrupadaProdutoEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(CaracteristicaAgrupadaProdutoEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof ProdutoEditPart) {
			types.add(CaracteristicaElementTypes.CaracteristicaProdutoCaracteristicaProdutoFilha_4008);
		}
		if (targetEditPart instanceof CaracteristicaMandatoriaProdutoEditPart) {
			types.add(CaracteristicaElementTypes.CaracteristicaProdutoCaracteristicaProdutoFilha_4008);
		}
		if (targetEditPart instanceof CaracteristicaOpcionalProdutoEditPart) {
			types.add(CaracteristicaElementTypes.CaracteristicaProdutoCaracteristicaProdutoFilha_4008);
		}
		if (targetEditPart instanceof VariacaoDoisProdutoEditPart) {
			types.add(CaracteristicaElementTypes.CaracteristicaProdutoCaracteristicaProdutoFilha_4008);
		}
		if (targetEditPart instanceof CaracteristicaAgrupadaProdutoEditPart) {
			types.add(CaracteristicaElementTypes.CaracteristicaProdutoCaracteristicaProdutoFilha_4008);
		}
		if (targetEditPart instanceof AtributoProdutoEditPart) {
			types.add(CaracteristicaElementTypes.CaracteristicaProdutoAtributoProduto_4009);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((CaracteristicaAgrupadaProdutoEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(CaracteristicaAgrupadaProdutoEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == CaracteristicaElementTypes.CaracteristicaProdutoCaracteristicaProdutoFilha_4008) {
			types.add(CaracteristicaElementTypes.Produto_2005);
			types.add(CaracteristicaElementTypes.CaracteristicaMandatoriaProduto_2025);
			types.add(CaracteristicaElementTypes.CaracteristicaOpcionalProduto_2026);
			types.add(CaracteristicaElementTypes.VariacaoDoisProduto_2027);
			types.add(CaracteristicaElementTypes.CaracteristicaAgrupadaProduto_2035);
		} else if (relationshipType == CaracteristicaElementTypes.CaracteristicaProdutoAtributoProduto_4009) {
			types.add(CaracteristicaElementTypes.AtributoProduto_2030);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((CaracteristicaAgrupadaProdutoEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(CaracteristicaAgrupadaProdutoEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(CaracteristicaElementTypes.CaracteristicaProdutoCaracteristicaProdutoFilha_4008);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((CaracteristicaAgrupadaProdutoEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(CaracteristicaAgrupadaProdutoEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == CaracteristicaElementTypes.CaracteristicaProdutoCaracteristicaProdutoFilha_4008) {
			types.add(CaracteristicaElementTypes.Produto_2005);
			types.add(CaracteristicaElementTypes.CaracteristicaMandatoriaProduto_2025);
			types.add(CaracteristicaElementTypes.CaracteristicaOpcionalProduto_2026);
			types.add(CaracteristicaElementTypes.VariacaoDoisProduto_2027);
			types.add(CaracteristicaElementTypes.CaracteristicaAgrupadaProduto_2035);
		}
		return types;
	}

}
