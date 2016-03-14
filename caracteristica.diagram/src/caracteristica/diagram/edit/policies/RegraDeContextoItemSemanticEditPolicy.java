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

import caracteristica.diagram.edit.commands.RegraDeContextoAcaoCreateCommand;
import caracteristica.diagram.edit.commands.RegraDeContextoAcaoReorientCommand;
import caracteristica.diagram.edit.commands.RegraDeContextoEventoCreateCommand;
import caracteristica.diagram.edit.commands.RegraDeContextoEventoReorientCommand;
import caracteristica.diagram.edit.parts.RegraDeContextoAcaoEditPart;
import caracteristica.diagram.edit.parts.RegraDeContextoEventoEditPart;
import caracteristica.diagram.part.CaracteristicaVisualIDRegistry;
import caracteristica.diagram.providers.CaracteristicaElementTypes;

/**
 * @generated
 */
public class RegraDeContextoItemSemanticEditPolicy extends
		CaracteristicaBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RegraDeContextoItemSemanticEditPolicy() {
		super(CaracteristicaElementTypes.RegraDeContexto_2022);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (CaracteristicaVisualIDRegistry.getVisualID(outgoingLink) == RegraDeContextoEventoEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (CaracteristicaVisualIDRegistry.getVisualID(outgoingLink) == RegraDeContextoAcaoEditPart.VISUAL_ID) {
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
		if (CaracteristicaElementTypes.RegraDeContextoEvento_4014 == req
				.getElementType()) {
			return getGEFWrapper(new RegraDeContextoEventoCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (CaracteristicaElementTypes.RegraDeContextoAcao_4015 == req
				.getElementType()) {
			return getGEFWrapper(new RegraDeContextoAcaoCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (CaracteristicaElementTypes.RegraDeContextoEvento_4014 == req
				.getElementType()) {
			return null;
		}
		if (CaracteristicaElementTypes.RegraDeContextoAcao_4015 == req
				.getElementType()) {
			return null;
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
		case RegraDeContextoEventoEditPart.VISUAL_ID:
			return getGEFWrapper(new RegraDeContextoEventoReorientCommand(req));
		case RegraDeContextoAcaoEditPart.VISUAL_ID:
			return getGEFWrapper(new RegraDeContextoAcaoReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
