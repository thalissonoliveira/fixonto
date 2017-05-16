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

import caracteristica.diagram.edit.commands.ExpressaoLogicaLadoDireitoComposicaoCreateCommand;
import caracteristica.diagram.edit.commands.ExpressaoLogicaLadoDireitoComposicaoReorientCommand;
import caracteristica.diagram.edit.commands.ExpressaoLogicaLadoEsquerdoComposicaoCreateCommand;
import caracteristica.diagram.edit.commands.ExpressaoLogicaLadoEsquerdoComposicaoReorientCommand;
import caracteristica.diagram.edit.commands.RegraDeComposicaoAntecedenteCreateCommand;
import caracteristica.diagram.edit.commands.RegraDeComposicaoAntecedenteReorientCommand;
import caracteristica.diagram.edit.commands.RegraDeComposicaoConsequenteCreateCommand;
import caracteristica.diagram.edit.commands.RegraDeComposicaoConsequenteReorientCommand;
import caracteristica.diagram.edit.parts.ExpressaoLogicaLadoDireitoComposicaoEditPart;
import caracteristica.diagram.edit.parts.ExpressaoLogicaLadoEsquerdoComposicaoEditPart;
import caracteristica.diagram.edit.parts.RegraDeComposicaoAntecedenteEditPart;
import caracteristica.diagram.edit.parts.RegraDeComposicaoConsequenteEditPart;
import caracteristica.diagram.part.CaracteristicaVisualIDRegistry;
import caracteristica.diagram.providers.CaracteristicaElementTypes;

/**
 * @generated
 */
public class LiteralComposicaoItemSemanticEditPolicy extends CaracteristicaBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public LiteralComposicaoItemSemanticEditPolicy() {
		super(CaracteristicaElementTypes.LiteralComposicao_2013);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (CaracteristicaVisualIDRegistry
					.getVisualID(incomingLink) == RegraDeComposicaoAntecedenteEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (CaracteristicaVisualIDRegistry
					.getVisualID(incomingLink) == RegraDeComposicaoConsequenteEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (CaracteristicaVisualIDRegistry
					.getVisualID(incomingLink) == ExpressaoLogicaLadoDireitoComposicaoEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (CaracteristicaVisualIDRegistry
					.getVisualID(incomingLink) == ExpressaoLogicaLadoEsquerdoComposicaoEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
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
		return command != null ? command : super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (CaracteristicaElementTypes.RegraDeComposicaoAntecedente_4012 == req.getElementType()) {
			return null;
		}
		if (CaracteristicaElementTypes.RegraDeComposicaoConsequente_4013 == req.getElementType()) {
			return null;
		}
		if (CaracteristicaElementTypes.ExpressaoLogicaLadoDireitoComposicao_4020 == req.getElementType()) {
			return null;
		}
		if (CaracteristicaElementTypes.ExpressaoLogicaLadoEsquerdoComposicao_4021 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (CaracteristicaElementTypes.RegraDeComposicaoAntecedente_4012 == req.getElementType()) {
			return getGEFWrapper(new RegraDeComposicaoAntecedenteCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (CaracteristicaElementTypes.RegraDeComposicaoConsequente_4013 == req.getElementType()) {
			return getGEFWrapper(new RegraDeComposicaoConsequenteCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (CaracteristicaElementTypes.ExpressaoLogicaLadoDireitoComposicao_4020 == req.getElementType()) {
			return getGEFWrapper(
					new ExpressaoLogicaLadoDireitoComposicaoCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (CaracteristicaElementTypes.ExpressaoLogicaLadoEsquerdoComposicao_4021 == req.getElementType()) {
			return getGEFWrapper(
					new ExpressaoLogicaLadoEsquerdoComposicaoCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case RegraDeComposicaoAntecedenteEditPart.VISUAL_ID:
			return getGEFWrapper(new RegraDeComposicaoAntecedenteReorientCommand(req));
		case RegraDeComposicaoConsequenteEditPart.VISUAL_ID:
			return getGEFWrapper(new RegraDeComposicaoConsequenteReorientCommand(req));
		case ExpressaoLogicaLadoDireitoComposicaoEditPart.VISUAL_ID:
			return getGEFWrapper(new ExpressaoLogicaLadoDireitoComposicaoReorientCommand(req));
		case ExpressaoLogicaLadoEsquerdoComposicaoEditPart.VISUAL_ID:
			return getGEFWrapper(new ExpressaoLogicaLadoEsquerdoComposicaoReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
