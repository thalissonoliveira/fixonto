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
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import caracteristica.CaracteristicaProduto;
import caracteristica.diagram.edit.policies.CaracteristicaBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class CaracteristicaProdutoCaracteristicaProdutoFilhaReorientCommand
		extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject referenceOwner;

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
	public CaracteristicaProdutoCaracteristicaProdutoFilhaReorientCommand(
			ReorientReferenceRelationshipRequest request) {
		super(request.getLabel(), null, request);
		reorientDirection = request.getDirection();
		referenceOwner = request.getReferenceOwner();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == referenceOwner instanceof CaracteristicaProduto) {
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
		if (!(oldEnd instanceof CaracteristicaProduto && newEnd instanceof CaracteristicaProduto)) {
			return false;
		}
		return CaracteristicaBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistCaracteristicaProdutoCaracteristicaProdutoFilha_4008(
						getNewSource(), getOldTarget());
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof CaracteristicaProduto && newEnd instanceof CaracteristicaProduto)) {
			return false;
		}
		return CaracteristicaBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistCaracteristicaProdutoCaracteristicaProdutoFilha_4008(
						getOldSource(), getNewTarget());
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
		getOldSource().getCaracteristicaProdutoFilha().remove(getOldTarget());
		getNewSource().getCaracteristicaProdutoFilha().add(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().getCaracteristicaProdutoFilha().remove(getOldTarget());
		getOldSource().getCaracteristicaProdutoFilha().add(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected CaracteristicaProduto getOldSource() {
		return (CaracteristicaProduto) referenceOwner;
	}

	/**
	 * @generated
	 */
	protected CaracteristicaProduto getNewSource() {
		return (CaracteristicaProduto) newEnd;
	}

	/**
	 * @generated
	 */
	protected CaracteristicaProduto getOldTarget() {
		return (CaracteristicaProduto) oldEnd;
	}

	/**
	 * @generated
	 */
	protected CaracteristicaProduto getNewTarget() {
		return (CaracteristicaProduto) newEnd;
	}
}
