/*
 * 
 */
package caracteristica.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import caracteristica.Estado;
import caracteristica.Simulacao;
import caracteristica.Transicao;
import caracteristica.diagram.edit.policies.CaracteristicaBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class TransicaoReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public TransicaoReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Transicao) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof Estado && newEnd instanceof Estado)) {
			return false;
		}
		Estado target = getLink().getENovo();
		if (!(getLink().eContainer() instanceof Simulacao)) {
			return false;
		}
		Simulacao container = (Simulacao) getLink().eContainer();
		return CaracteristicaBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistTransicao_4001(container, getLink(), getNewSource(),
						target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Estado && newEnd instanceof Estado)) {
			return false;
		}
		Estado source = getLink().getEAntigo();
		if (!(getLink().eContainer() instanceof Simulacao)) {
			return false;
		}
		Simulacao container = (Simulacao) getLink().eContainer();
		return CaracteristicaBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistTransicao_4001(container, getLink(), source,
						getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setEAntigo(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setENovo(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected Transicao getLink() {
		return (Transicao) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Estado getOldSource() {
		return (Estado) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Estado getNewSource() {
		return (Estado) newEnd;
	}

	/**
	 * @generated
	 */
	protected Estado getOldTarget() {
		return (Estado) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Estado getNewTarget() {
		return (Estado) newEnd;
	}
}
