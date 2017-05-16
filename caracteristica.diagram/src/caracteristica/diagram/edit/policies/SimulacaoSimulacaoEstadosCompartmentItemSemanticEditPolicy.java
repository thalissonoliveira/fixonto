/*
 * 
 */
package caracteristica.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import caracteristica.diagram.edit.commands.EstadoCreateCommand;
import caracteristica.diagram.providers.CaracteristicaElementTypes;

/**
 * @generated
 */
public class SimulacaoSimulacaoEstadosCompartmentItemSemanticEditPolicy
		extends CaracteristicaBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SimulacaoSimulacaoEstadosCompartmentItemSemanticEditPolicy() {
		super(CaracteristicaElementTypes.Simulacao_2024);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CaracteristicaElementTypes.Estado_3001 == req.getElementType()) {
			return getGEFWrapper(new EstadoCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
