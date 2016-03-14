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

import caracteristica.CaracteristicaRaiz;
import caracteristica.Produto;
import caracteristica.diagram.edit.policies.CaracteristicaBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class ProdutoLinhaDoProdutoReorientCommand extends EditElementCommand {

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
	public ProdutoLinhaDoProdutoReorientCommand(
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
		if (false == referenceOwner instanceof Produto) {
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
		if (!(oldEnd instanceof CaracteristicaRaiz && newEnd instanceof Produto)) {
			return false;
		}
		return CaracteristicaBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistProdutoLinhaDoProduto_4011(getNewSource(),
						getOldTarget());
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof CaracteristicaRaiz && newEnd instanceof CaracteristicaRaiz)) {
			return false;
		}
		return CaracteristicaBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistProdutoLinhaDoProduto_4011(getOldSource(),
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
		getOldSource().setLinhaDoProduto(null);
		getNewSource().setLinhaDoProduto(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().setLinhaDoProduto(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected Produto getOldSource() {
		return (Produto) referenceOwner;
	}

	/**
	 * @generated
	 */
	protected Produto getNewSource() {
		return (Produto) newEnd;
	}

	/**
	 * @generated
	 */
	protected CaracteristicaRaiz getOldTarget() {
		return (CaracteristicaRaiz) oldEnd;
	}

	/**
	 * @generated
	 */
	protected CaracteristicaRaiz getNewTarget() {
		return (CaracteristicaRaiz) newEnd;
	}
}
