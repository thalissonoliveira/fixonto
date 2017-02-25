/*
 * 
 */
package caracteristica.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import caracteristica.diagram.providers.CaracteristicaElementTypes;

/**
 * @generated
 */
public class EntidadeDeContextoInformacoesDeContextoItemSemanticEditPolicy
		extends CaracteristicaBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public EntidadeDeContextoInformacoesDeContextoItemSemanticEditPolicy() {
		super(CaracteristicaElementTypes.EntidadeDeContextoInformacoesDeContexto_4028);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
