/*
 * 
 */
package caracteristica.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import caracteristica.diagram.edit.commands.CaracteristicaAtributoCreateCommand;
import caracteristica.diagram.edit.commands.CaracteristicaAtributoReorientCommand;
import caracteristica.diagram.edit.commands.CaracteristicaCaracteristicaFilhaCreateCommand;
import caracteristica.diagram.edit.commands.CaracteristicaCaracteristicaFilhaReorientCommand;
import caracteristica.diagram.edit.commands.CaracteristicaElementosExternosCreateCommand;
import caracteristica.diagram.edit.commands.CaracteristicaElementosExternosReorientCommand;
import caracteristica.diagram.edit.commands.CaracteristicaVariacoesCreateCommand;
import caracteristica.diagram.edit.commands.CaracteristicaVariacoesReorientCommand;
import caracteristica.diagram.edit.commands.ProdutoLinhaDoProdutoCreateCommand;
import caracteristica.diagram.edit.commands.ProdutoLinhaDoProdutoReorientCommand;
import caracteristica.diagram.edit.parts.CaracteristicaAtributoEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaCaracteristicaFilhaEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaElementosExternosEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaVariacoesEditPart;
import caracteristica.diagram.edit.parts.ProdutoLinhaDoProdutoEditPart;
import caracteristica.diagram.part.CaracteristicaVisualIDRegistry;
import caracteristica.diagram.providers.CaracteristicaElementTypes;

/**
 * @generated
 */
public class CaracteristicaRaizItemSemanticEditPolicy extends
		CaracteristicaBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CaracteristicaRaizItemSemanticEditPolicy() {
		super(CaracteristicaElementTypes.CaracteristicaRaiz_2003);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (CaracteristicaVisualIDRegistry.getVisualID(incomingLink) == CaracteristicaCaracteristicaFilhaEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (CaracteristicaVisualIDRegistry.getVisualID(incomingLink) == ProdutoLinhaDoProdutoEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (CaracteristicaVisualIDRegistry.getVisualID(outgoingLink) == CaracteristicaElementosExternosEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (CaracteristicaVisualIDRegistry.getVisualID(outgoingLink) == CaracteristicaCaracteristicaFilhaEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (CaracteristicaVisualIDRegistry.getVisualID(outgoingLink) == CaracteristicaVariacoesEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (CaracteristicaVisualIDRegistry.getVisualID(outgoingLink) == CaracteristicaAtributoEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (CaracteristicaElementTypes.CaracteristicaElementosExternos_4024 == req
				.getElementType()) {
			return getGEFWrapper(new CaracteristicaElementosExternosCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (CaracteristicaElementTypes.CaracteristicaCaracteristicaFilha_4002 == req
				.getElementType()) {
			return getGEFWrapper(new CaracteristicaCaracteristicaFilhaCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (CaracteristicaElementTypes.CaracteristicaVariacoes_4003 == req
				.getElementType()) {
			return getGEFWrapper(new CaracteristicaVariacoesCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (CaracteristicaElementTypes.CaracteristicaAtributo_4004 == req
				.getElementType()) {
			return getGEFWrapper(new CaracteristicaAtributoCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (CaracteristicaElementTypes.ProdutoLinhaDoProduto_4011 == req
				.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (CaracteristicaElementTypes.CaracteristicaElementosExternos_4024 == req
				.getElementType()) {
			return null;
		}
		if (CaracteristicaElementTypes.CaracteristicaCaracteristicaFilha_4002 == req
				.getElementType()) {
			return getGEFWrapper(new CaracteristicaCaracteristicaFilhaCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (CaracteristicaElementTypes.CaracteristicaVariacoes_4003 == req
				.getElementType()) {
			return null;
		}
		if (CaracteristicaElementTypes.CaracteristicaAtributo_4004 == req
				.getElementType()) {
			return null;
		}
		if (CaracteristicaElementTypes.ProdutoLinhaDoProduto_4011 == req
				.getElementType()) {
			return getGEFWrapper(new ProdutoLinhaDoProdutoCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case CaracteristicaElementosExternosEditPart.VISUAL_ID:
			return getGEFWrapper(new CaracteristicaElementosExternosReorientCommand(
					req));
		case CaracteristicaCaracteristicaFilhaEditPart.VISUAL_ID:
			return getGEFWrapper(new CaracteristicaCaracteristicaFilhaReorientCommand(
					req));
		case CaracteristicaVariacoesEditPart.VISUAL_ID:
			return getGEFWrapper(new CaracteristicaVariacoesReorientCommand(req));
		case CaracteristicaAtributoEditPart.VISUAL_ID:
			return getGEFWrapper(new CaracteristicaAtributoReorientCommand(req));
		case ProdutoLinhaDoProdutoEditPart.VISUAL_ID:
			return getGEFWrapper(new ProdutoLinhaDoProdutoReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}