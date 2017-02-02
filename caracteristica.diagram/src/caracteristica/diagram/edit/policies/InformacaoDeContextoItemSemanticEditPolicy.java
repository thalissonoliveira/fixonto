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

import caracteristica.diagram.edit.commands.ContextoCaracteristicasExcluirCreateCommand;
import caracteristica.diagram.edit.commands.ContextoCaracteristicasExcluirReorientCommand;
import caracteristica.diagram.edit.commands.ContextoCaracteristicasIncluirCreateCommand;
import caracteristica.diagram.edit.commands.ContextoCaracteristicasIncluirReorientCommand;
import caracteristica.diagram.edit.commands.EntidadeDeContextoInformacoesDeContextoCreateCommand;
import caracteristica.diagram.edit.commands.EntidadeDeContextoInformacoesDeContextoReorientCommand;
import caracteristica.diagram.edit.parts.ContextoCaracteristicasExcluirEditPart;
import caracteristica.diagram.edit.parts.ContextoCaracteristicasIncluirEditPart;
import caracteristica.diagram.edit.parts.EntidadeDeContextoInformacoesDeContextoEditPart;
import caracteristica.diagram.part.CaracteristicaVisualIDRegistry;
import caracteristica.diagram.providers.CaracteristicaElementTypes;

/**
 * @generated
 */
public class InformacaoDeContextoItemSemanticEditPolicy extends
		CaracteristicaBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public InformacaoDeContextoItemSemanticEditPolicy() {
		super(CaracteristicaElementTypes.InformacaoDeContexto_2036);
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
			if (CaracteristicaVisualIDRegistry.getVisualID(incomingLink) == EntidadeDeContextoInformacoesDeContextoEditPart.VISUAL_ID) {
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
			if (CaracteristicaVisualIDRegistry.getVisualID(outgoingLink) == ContextoCaracteristicasIncluirEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (CaracteristicaVisualIDRegistry.getVisualID(outgoingLink) == ContextoCaracteristicasExcluirEditPart.VISUAL_ID) {
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
		if (CaracteristicaElementTypes.ContextoCaracteristicasIncluir_4025 == req
				.getElementType()) {
			return getGEFWrapper(new ContextoCaracteristicasIncluirCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (CaracteristicaElementTypes.ContextoCaracteristicasExcluir_4026 == req
				.getElementType()) {
			return getGEFWrapper(new ContextoCaracteristicasExcluirCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (CaracteristicaElementTypes.EntidadeDeContextoInformacoesDeContexto_4028 == req
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
		if (CaracteristicaElementTypes.ContextoCaracteristicasIncluir_4025 == req
				.getElementType()) {
			return null;
		}
		if (CaracteristicaElementTypes.ContextoCaracteristicasExcluir_4026 == req
				.getElementType()) {
			return null;
		}
		if (CaracteristicaElementTypes.EntidadeDeContextoInformacoesDeContexto_4028 == req
				.getElementType()) {
			return getGEFWrapper(new EntidadeDeContextoInformacoesDeContextoCreateCommand(
					req, req.getSource(), req.getTarget()));
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
		case ContextoCaracteristicasIncluirEditPart.VISUAL_ID:
			return getGEFWrapper(new ContextoCaracteristicasIncluirReorientCommand(
					req));
		case ContextoCaracteristicasExcluirEditPart.VISUAL_ID:
			return getGEFWrapper(new ContextoCaracteristicasExcluirReorientCommand(
					req));
		case EntidadeDeContextoInformacoesDeContextoEditPart.VISUAL_ID:
			return getGEFWrapper(new EntidadeDeContextoInformacoesDeContextoReorientCommand(
					req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
