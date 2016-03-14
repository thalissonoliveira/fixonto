/*
 * 
 */
package caracteristica.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.requests.ReconnectRequest;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.SemanticEditPolicy;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.GetEditContextRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.MoveRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.helpers.GeneratedEditHelperBase;

import caracteristica.Acao;
import caracteristica.AcaoLogico;
import caracteristica.Antecedente;
import caracteristica.Atributo;
import caracteristica.AtributoProduto;
import caracteristica.Caracteristica;
import caracteristica.CaracteristicaProduto;
import caracteristica.CaracteristicaRaiz;
import caracteristica.ElementoExterno;
import caracteristica.EntidadeDeContexto;
import caracteristica.Estado;
import caracteristica.Evento;
import caracteristica.EventoLogico;
import caracteristica.ExpressaoLogica;
import caracteristica.InformacaoDeContexto;
import caracteristica.Produto;
import caracteristica.RaizDeContexto;
import caracteristica.RegraDeComposicao;
import caracteristica.RegraDeContexto;
import caracteristica.Simulacao;
import caracteristica.Transicao;
import caracteristica.Variacao;
import caracteristica.VariacaoProduto;
import caracteristica.Variante;
import caracteristica.VarianteProduto;
import caracteristica.diagram.part.CaracteristicaDiagramEditorPlugin;
import caracteristica.diagram.part.CaracteristicaVisualIDRegistry;
import caracteristica.diagram.providers.CaracteristicaElementTypes;

/**
 * @generated
 */
public class CaracteristicaBaseItemSemanticEditPolicy extends
		SemanticEditPolicy {

	/**
	 * Extended request data key to hold editpart visual id.
	 * @generated
	 */
	public static final String VISUAL_ID_KEY = "visual_id"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private final IElementType myElementType;

	/**
	 * @generated
	 */
	protected CaracteristicaBaseItemSemanticEditPolicy(IElementType elementType) {
		myElementType = elementType;
	}

	/**
	 * Extended request data key to hold editpart visual id.
	 * Add visual id of edited editpart to extended data of the request
	 * so command switch can decide what kind of diagram element is being edited.
	 * It is done in those cases when it's not possible to deduce diagram
	 * element kind from domain element.
	 * 
	 * @generated
	 */
	public Command getCommand(Request request) {
		if (request instanceof ReconnectRequest) {
			Object view = ((ReconnectRequest) request).getConnectionEditPart()
					.getModel();
			if (view instanceof View) {
				Integer id = new Integer(
						CaracteristicaVisualIDRegistry.getVisualID((View) view));
				request.getExtendedData().put(VISUAL_ID_KEY, id);
			}
		}
		return super.getCommand(request);
	}

	/**
	 * Returns visual id from request parameters.
	 * @generated
	 */
	protected int getVisualID(IEditCommandRequest request) {
		Object id = request.getParameter(VISUAL_ID_KEY);
		return id instanceof Integer ? ((Integer) id).intValue() : -1;
	}

	/**
	 * @generated
	 */
	protected Command getSemanticCommand(IEditCommandRequest request) {
		IEditCommandRequest completedRequest = completeRequest(request);
		Command semanticCommand = getSemanticCommandSwitch(completedRequest);
		semanticCommand = getEditHelperCommand(completedRequest,
				semanticCommand);
		if (completedRequest instanceof DestroyRequest) {
			DestroyRequest destroyRequest = (DestroyRequest) completedRequest;
			return shouldProceed(destroyRequest) ? addDeleteViewCommand(
					semanticCommand, destroyRequest) : null;
		}
		return semanticCommand;
	}

	/**
	 * @generated
	 */
	protected Command addDeleteViewCommand(Command mainCommand,
			DestroyRequest completedRequest) {
		Command deleteViewCommand = getGEFWrapper(new DeleteCommand(
				getEditingDomain(), (View) getHost().getModel()));
		return mainCommand == null ? deleteViewCommand : mainCommand
				.chain(deleteViewCommand);
	}

	/**
	 * @generated
	 */
	private Command getEditHelperCommand(IEditCommandRequest request,
			Command editPolicyCommand) {
		if (editPolicyCommand != null) {
			ICommand command = editPolicyCommand instanceof ICommandProxy ? ((ICommandProxy) editPolicyCommand)
					.getICommand() : new CommandProxy(editPolicyCommand);
			request.setParameter(GeneratedEditHelperBase.EDIT_POLICY_COMMAND,
					command);
		}
		IElementType requestContextElementType = getContextElementType(request);
		request.setParameter(GeneratedEditHelperBase.CONTEXT_ELEMENT_TYPE,
				requestContextElementType);
		ICommand command = requestContextElementType.getEditCommand(request);
		request.setParameter(GeneratedEditHelperBase.EDIT_POLICY_COMMAND, null);
		request.setParameter(GeneratedEditHelperBase.CONTEXT_ELEMENT_TYPE, null);
		if (command != null) {
			if (!(command instanceof CompositeTransactionalCommand)) {
				command = new CompositeTransactionalCommand(getEditingDomain(),
						command.getLabel()).compose(command);
			}
			return new ICommandProxy(command);
		}
		return editPolicyCommand;
	}

	/**
	 * @generated
	 */
	private IElementType getContextElementType(IEditCommandRequest request) {
		IElementType requestContextElementType = CaracteristicaElementTypes
				.getElementType(getVisualID(request));
		return requestContextElementType != null ? requestContextElementType
				: myElementType;
	}

	/**
	 * @generated
	 */
	protected Command getSemanticCommandSwitch(IEditCommandRequest req) {
		if (req instanceof CreateRelationshipRequest) {
			return getCreateRelationshipCommand((CreateRelationshipRequest) req);
		} else if (req instanceof CreateElementRequest) {
			return getCreateCommand((CreateElementRequest) req);
		} else if (req instanceof ConfigureRequest) {
			return getConfigureCommand((ConfigureRequest) req);
		} else if (req instanceof DestroyElementRequest) {
			return getDestroyElementCommand((DestroyElementRequest) req);
		} else if (req instanceof DestroyReferenceRequest) {
			return getDestroyReferenceCommand((DestroyReferenceRequest) req);
		} else if (req instanceof DuplicateElementsRequest) {
			return getDuplicateCommand((DuplicateElementsRequest) req);
		} else if (req instanceof GetEditContextRequest) {
			return getEditContextCommand((GetEditContextRequest) req);
		} else if (req instanceof MoveRequest) {
			return getMoveCommand((MoveRequest) req);
		} else if (req instanceof ReorientReferenceRelationshipRequest) {
			return getReorientReferenceRelationshipCommand((ReorientReferenceRelationshipRequest) req);
		} else if (req instanceof ReorientRelationshipRequest) {
			return getReorientRelationshipCommand((ReorientRelationshipRequest) req);
		} else if (req instanceof SetRequest) {
			return getSetCommand((SetRequest) req);
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getConfigureCommand(ConfigureRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getSetCommand(SetRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getEditContextCommand(GetEditContextRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getMoveCommand(MoveRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * @generated
	 */
	protected final Command getGEFWrapper(ICommand cmd) {
		return new ICommandProxy(cmd);
	}

	/**
	 * Returns editing domain from the host edit part.
	 * @generated
	 */
	protected TransactionalEditingDomain getEditingDomain() {
		return ((IGraphicalEditPart) getHost()).getEditingDomain();
	}

	/**
	 * Clean all shortcuts to the host element from the same diagram
	 * @generated
	 */
	protected void addDestroyShortcutsCommand(ICompositeCommand cmd, View view) {
		assert view.getEAnnotation("Shortcut") == null; //$NON-NLS-1$
		for (Iterator it = view.getDiagram().getChildren().iterator(); it
				.hasNext();) {
			View nextView = (View) it.next();
			if (nextView.getEAnnotation("Shortcut") == null || !nextView.isSetElement() || nextView.getElement() != view.getElement()) { //$NON-NLS-1$
				continue;
			}
			cmd.add(new DeleteCommand(getEditingDomain(), nextView));
		}
	}

	/**
	 * @generated
	 */
	public static LinkConstraints getLinkConstraints() {
		LinkConstraints cached = CaracteristicaDiagramEditorPlugin
				.getInstance().getLinkConstraints();
		if (cached == null) {
			CaracteristicaDiagramEditorPlugin.getInstance().setLinkConstraints(
					cached = new LinkConstraints());
		}
		return cached;
	}

	/**
	 * @generated
	 */
	public static class LinkConstraints {

		/**
		 * @generated
		 */
		LinkConstraints() {
			// use static method #getLinkConstraints() to access instance
		}

		/**
		 * @generated
		 */
		public boolean canCreateTransicao_4001(Simulacao container,
				Estado source, Estado target) {
			return canExistTransicao_4001(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateCaracteristicaElementosExternos_4024(
				Caracteristica source, ElementoExterno target) {
			if (source != null) {
				if (source.getElementosExternos().contains(target)) {
					return false;
				}
			}

			return canExistCaracteristicaElementosExternos_4024(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateCaracteristicaCaracteristicaFilha_4002(
				Caracteristica source, Caracteristica target) {
			if (source != null) {
				if (source.getCaracteristicaFilha().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getCaracteristicaPai() != null)) {
				return false;
			}

			return canExistCaracteristicaCaracteristicaFilha_4002(source,
					target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateCaracteristicaVariacoes_4003(
				Caracteristica source, Variacao target) {
			if (source != null) {
				if (source.getVariacoes().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getCaracteristicaPai() != null)) {
				return false;
			}

			return canExistCaracteristicaVariacoes_4003(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateCaracteristicaAtributo_4004(
				Caracteristica source, Atributo target) {
			if (source != null) {
				if (source.getAtributo().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getCaracteristicaPai() != null)) {
				return false;
			}

			return canExistCaracteristicaAtributo_4004(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateVariacaoVariantes_4005(Variacao source,
				Variante target) {
			if (source != null) {
				if (source.getVariantes().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getVariacaoPai() != null)) {
				return false;
			}

			return canExistVariacaoVariantes_4005(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateRaizDeContextoEntidadesDeContexto_4006(
				RaizDeContexto source, EntidadeDeContexto target) {
			if (source != null) {
				if (source.getEntidadesDeContexto().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getRaiz() != null)) {
				return false;
			}

			return canExistRaizDeContextoEntidadesDeContexto_4006(source,
					target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateEntidadeDeContextoInformacoesDeContexto_4023(
				EntidadeDeContexto source, InformacaoDeContexto target) {
			if (source != null) {
				if (source.getInformacoesDeContexto().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getElementoPai() != null)) {
				return false;
			}

			return canExistEntidadeDeContextoInformacoesDeContexto_4023(source,
					target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateCaracteristicaProdutoCaracteristicaProdutoFilha_4008(
				CaracteristicaProduto source, CaracteristicaProduto target) {
			if (source != null) {
				if (source.getCaracteristicaProdutoFilha().contains(target)) {
					return false;
				}
			}
			if (target != null
					&& (target.getCaracteristicaProdutoPai() != null)) {
				return false;
			}

			return canExistCaracteristicaProdutoCaracteristicaProdutoFilha_4008(
					source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateCaracteristicaProdutoAtributoProduto_4009(
				CaracteristicaProduto source, AtributoProduto target) {
			if (source != null) {
				if (source.getAtributoProduto().contains(target)) {
					return false;
				}
			}
			if (target != null
					&& (target.getCaracteristicaProdutoPai() != null)) {
				return false;
			}

			return canExistCaracteristicaProdutoAtributoProduto_4009(source,
					target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateVariacaoProdutoVariantesProduto_4010(
				VariacaoProduto source, VarianteProduto target) {
			if (source != null) {
				if (source.getVariantesProduto().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getVariacaoProdutoPai() != null)) {
				return false;
			}

			return canExistVariacaoProdutoVariantesProduto_4010(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateProdutoLinhaDoProduto_4011(Produto source,
				CaracteristicaRaiz target) {
			if (source != null) {
				if (source.getLinhaDoProduto() != null) {
					return false;
				}
			}

			return canExistProdutoLinhaDoProduto_4011(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateRegraDeComposicaoAntecedente_4012(
				RegraDeComposicao source, Antecedente target) {
			if (source != null) {
				if (source.getAntecedente() != null) {
					return false;
				}
			}

			return canExistRegraDeComposicaoAntecedente_4012(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateRegraDeComposicaoConsequente_4013(
				RegraDeComposicao source, Antecedente target) {
			if (source != null) {
				if (source.getConsequente() != null) {
					return false;
				}
			}

			return canExistRegraDeComposicaoConsequente_4013(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateRegraDeContextoEvento_4014(
				RegraDeContexto source, Evento target) {
			if (source != null) {
				if (source.getEvento() != null) {
					return false;
				}
			}

			return canExistRegraDeContextoEvento_4014(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateRegraDeContextoAcao_4015(
				RegraDeContexto source, Acao target) {
			if (source != null) {
				if (source.getAcao() != null) {
					return false;
				}
			}

			return canExistRegraDeContextoAcao_4015(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateEventoLogicoLadoDireitoEvento_4016(
				EventoLogico source, Evento target) {
			if (source != null) {
				if (source.getLadoDireitoEvento() != null) {
					return false;
				}
			}

			return canExistEventoLogicoLadoDireitoEvento_4016(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateEventoLogicoLadoEsquerdoEvento_4017(
				EventoLogico source, Evento target) {
			if (source != null) {
				if (source.getLadoEsquerdoEvento() != null) {
					return false;
				}
			}

			return canExistEventoLogicoLadoEsquerdoEvento_4017(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateAcaoLogicoLadoEsquerdoAcao_4018(
				AcaoLogico source, Acao target) {
			if (source != null) {
				if (source.getLadoEsquerdoAcao() != null) {
					return false;
				}
			}

			return canExistAcaoLogicoLadoEsquerdoAcao_4018(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateAcaoLogicoLadoDireitoAcao_4019(
				AcaoLogico source, Acao target) {
			if (source != null) {
				if (source.getLadoDireitoAcao() != null) {
					return false;
				}
			}

			return canExistAcaoLogicoLadoDireitoAcao_4019(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateExpressaoLogicaLadoDireitoComposicao_4020(
				ExpressaoLogica source, Antecedente target) {
			if (source != null) {
				if (source.getLadoDireitoComposicao() != null) {
					return false;
				}
			}

			return canExistExpressaoLogicaLadoDireitoComposicao_4020(source,
					target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateExpressaoLogicaLadoEsquerdoComposicao_4021(
				ExpressaoLogica source, Antecedente target) {
			if (source != null) {
				if (source.getLadoEsquerdoComposicao() != null) {
					return false;
				}
			}

			return canExistExpressaoLogicaLadoEsquerdoComposicao_4021(source,
					target);
		}

		/**
		 * @generated
		 */
		public boolean canExistTransicao_4001(Simulacao container,
				Transicao linkInstance, Estado source, Estado target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistCaracteristicaElementosExternos_4024(
				Caracteristica source, ElementoExterno target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistCaracteristicaCaracteristicaFilha_4002(
				Caracteristica source, Caracteristica target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistCaracteristicaVariacoes_4003(
				Caracteristica source, Variacao target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistCaracteristicaAtributo_4004(
				Caracteristica source, Atributo target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistVariacaoVariantes_4005(Variacao source,
				Variante target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistRaizDeContextoEntidadesDeContexto_4006(
				RaizDeContexto source, EntidadeDeContexto target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistEntidadeDeContextoInformacoesDeContexto_4023(
				EntidadeDeContexto source, InformacaoDeContexto target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistCaracteristicaProdutoCaracteristicaProdutoFilha_4008(
				CaracteristicaProduto source, CaracteristicaProduto target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistCaracteristicaProdutoAtributoProduto_4009(
				CaracteristicaProduto source, AtributoProduto target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistVariacaoProdutoVariantesProduto_4010(
				VariacaoProduto source, VarianteProduto target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistProdutoLinhaDoProduto_4011(Produto source,
				CaracteristicaRaiz target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistRegraDeComposicaoAntecedente_4012(
				RegraDeComposicao source, Antecedente target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistRegraDeComposicaoConsequente_4013(
				RegraDeComposicao source, Antecedente target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistRegraDeContextoEvento_4014(
				RegraDeContexto source, Evento target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistRegraDeContextoAcao_4015(RegraDeContexto source,
				Acao target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistEventoLogicoLadoDireitoEvento_4016(
				EventoLogico source, Evento target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistEventoLogicoLadoEsquerdoEvento_4017(
				EventoLogico source, Evento target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistAcaoLogicoLadoEsquerdoAcao_4018(
				AcaoLogico source, Acao target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistAcaoLogicoLadoDireitoAcao_4019(
				AcaoLogico source, Acao target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistExpressaoLogicaLadoDireitoComposicao_4020(
				ExpressaoLogica source, Antecedente target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistExpressaoLogicaLadoEsquerdoComposicao_4021(
				ExpressaoLogica source, Antecedente target) {
			return true;
		}
	}

}
