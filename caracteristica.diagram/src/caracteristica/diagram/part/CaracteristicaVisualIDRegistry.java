/*
 * 
 */
package caracteristica.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import caracteristica.CaracteristicaPackage;
import caracteristica.diagram.edit.parts.*;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class CaracteristicaVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "caracteristica.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (LPSEditPart.MODEL_ID.equals(view.getType())) {
				return LPSEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return caracteristica.diagram.part.CaracteristicaVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				CaracteristicaDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (CaracteristicaPackage.eINSTANCE.getLPS().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((caracteristica.LPS) domainElement)) {
			return LPSEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = caracteristica.diagram.part.CaracteristicaVisualIDRegistry.getModelID(containerView);
		if (!LPSEditPart.MODEL_ID.equals(containerModelID) && !"caracteristica".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (LPSEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = caracteristica.diagram.part.CaracteristicaVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = LPSEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case LPSEditPart.VISUAL_ID:
			if (CaracteristicaPackage.eINSTANCE.getCaracteristicaOpcional().isSuperTypeOf(domainElement.eClass())) {
				return CaracteristicaOpcionalEditPart.VISUAL_ID;
			}
			if (CaracteristicaPackage.eINSTANCE.getCaracteristicaAgrupada().isSuperTypeOf(domainElement.eClass())) {
				return CaracteristicaAgrupadaEditPart.VISUAL_ID;
			}
			if (CaracteristicaPackage.eINSTANCE.getVariacaoDois().isSuperTypeOf(domainElement.eClass())) {
				return VariacaoDoisEditPart.VISUAL_ID;
			}
			if (CaracteristicaPackage.eINSTANCE.getCaracteristicaRaiz().isSuperTypeOf(domainElement.eClass())) {
				return CaracteristicaRaizEditPart.VISUAL_ID;
			}
			if (CaracteristicaPackage.eINSTANCE.getCaracteristicaMandatoria().isSuperTypeOf(domainElement.eClass())) {
				return CaracteristicaMandatoriaEditPart.VISUAL_ID;
			}
			if (CaracteristicaPackage.eINSTANCE.getProduto().isSuperTypeOf(domainElement.eClass())) {
				return ProdutoEditPart.VISUAL_ID;
			}
			if (CaracteristicaPackage.eINSTANCE.getEventoLogico().isSuperTypeOf(domainElement.eClass())) {
				return EventoLogicoEditPart.VISUAL_ID;
			}
			if (CaracteristicaPackage.eINSTANCE.getEventoRelacional().isSuperTypeOf(domainElement.eClass())) {
				return EventoRelacionalEditPart.VISUAL_ID;
			}
			if (CaracteristicaPackage.eINSTANCE.getAcaoLogico().isSuperTypeOf(domainElement.eClass())) {
				return AcaoLogicoEditPart.VISUAL_ID;
			}
			if (CaracteristicaPackage.eINSTANCE.getLiteralAcao().isSuperTypeOf(domainElement.eClass())) {
				return LiteralAcaoEditPart.VISUAL_ID;
			}
			if (CaracteristicaPackage.eINSTANCE.getDesignar().isSuperTypeOf(domainElement.eClass())) {
				return DesignarEditPart.VISUAL_ID;
			}
			if (CaracteristicaPackage.eINSTANCE.getExpressaoLogica().isSuperTypeOf(domainElement.eClass())) {
				return ExpressaoLogicaEditPart.VISUAL_ID;
			}
			if (CaracteristicaPackage.eINSTANCE.getExpressaoRelacional().isSuperTypeOf(domainElement.eClass())) {
				return ExpressaoRelacionalEditPart.VISUAL_ID;
			}
			if (CaracteristicaPackage.eINSTANCE.getLiteralComposicao().isSuperTypeOf(domainElement.eClass())) {
				return LiteralComposicaoEditPart.VISUAL_ID;
			}
			if (CaracteristicaPackage.eINSTANCE.getCaracteristicaMandatoriaProduto()
					.isSuperTypeOf(domainElement.eClass())) {
				return CaracteristicaMandatoriaProdutoEditPart.VISUAL_ID;
			}
			if (CaracteristicaPackage.eINSTANCE.getCaracteristicaOpcionalProduto()
					.isSuperTypeOf(domainElement.eClass())) {
				return CaracteristicaOpcionalProdutoEditPart.VISUAL_ID;
			}
			if (CaracteristicaPackage.eINSTANCE.getVariacaoDoisProduto().isSuperTypeOf(domainElement.eClass())) {
				return VariacaoDoisProdutoEditPart.VISUAL_ID;
			}
			if (CaracteristicaPackage.eINSTANCE.getCaracteristicaAgrupadaProduto()
					.isSuperTypeOf(domainElement.eClass())) {
				return CaracteristicaAgrupadaProdutoEditPart.VISUAL_ID;
			}
			if (CaracteristicaPackage.eINSTANCE.getAtributo().isSuperTypeOf(domainElement.eClass())) {
				return AtributoEditPart.VISUAL_ID;
			}
			if (CaracteristicaPackage.eINSTANCE.getRaizDeContexto().isSuperTypeOf(domainElement.eClass())) {
				return RaizDeContextoEditPart.VISUAL_ID;
			}
			if (CaracteristicaPackage.eINSTANCE.getEntidadeDeContexto().isSuperTypeOf(domainElement.eClass())) {
				return EntidadeDeContextoEditPart.VISUAL_ID;
			}
			if (CaracteristicaPackage.eINSTANCE.getInformacaoDeContexto().isSuperTypeOf(domainElement.eClass())) {
				return InformacaoDeContextoEditPart.VISUAL_ID;
			}
			if (CaracteristicaPackage.eINSTANCE.getCasoDeUso().isSuperTypeOf(domainElement.eClass())) {
				return CasoDeUsoEditPart.VISUAL_ID;
			}
			if (CaracteristicaPackage.eINSTANCE.getCasoDeTeste().isSuperTypeOf(domainElement.eClass())) {
				return CasoDeTesteEditPart.VISUAL_ID;
			}
			if (CaracteristicaPackage.eINSTANCE.getRegraDeComposicao().isSuperTypeOf(domainElement.eClass())) {
				return RegraDeComposicaoEditPart.VISUAL_ID;
			}
			if (CaracteristicaPackage.eINSTANCE.getRegraDeContexto().isSuperTypeOf(domainElement.eClass())) {
				return RegraDeContextoEditPart.VISUAL_ID;
			}
			if (CaracteristicaPackage.eINSTANCE.getAtributoProduto().isSuperTypeOf(domainElement.eClass())) {
				return AtributoProdutoEditPart.VISUAL_ID;
			}
			if (CaracteristicaPackage.eINSTANCE.getSimulacao().isSuperTypeOf(domainElement.eClass())) {
				return SimulacaoEditPart.VISUAL_ID;
			}
			break;
		case SimulacaoSimulacaoEstadosCompartmentEditPart.VISUAL_ID:
			if (CaracteristicaPackage.eINSTANCE.getEstado().isSuperTypeOf(domainElement.eClass())) {
				return EstadoEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = caracteristica.diagram.part.CaracteristicaVisualIDRegistry.getModelID(containerView);
		if (!LPSEditPart.MODEL_ID.equals(containerModelID) && !"caracteristica".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (LPSEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = caracteristica.diagram.part.CaracteristicaVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = LPSEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case LPSEditPart.VISUAL_ID:
			if (CaracteristicaOpcionalEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CaracteristicaAgrupadaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (VariacaoDoisEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CaracteristicaRaizEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CaracteristicaMandatoriaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProdutoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventoLogicoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventoRelacionalEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AcaoLogicoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LiteralAcaoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DesignarEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExpressaoLogicaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExpressaoRelacionalEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LiteralComposicaoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CaracteristicaMandatoriaProdutoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CaracteristicaOpcionalProdutoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (VariacaoDoisProdutoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CaracteristicaAgrupadaProdutoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtributoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RaizDeContextoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EntidadeDeContextoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InformacaoDeContextoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CasoDeUsoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CasoDeTesteEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RegraDeComposicaoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RegraDeContextoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtributoProdutoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SimulacaoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CaracteristicaOpcionalEditPart.VISUAL_ID:
			if (CaracteristicaOpcionalNomeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CaracteristicaAgrupadaEditPart.VISUAL_ID:
			if (CaracteristicaAgrupadaNomeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case VariacaoDoisEditPart.VISUAL_ID:
			if (VariacaoDoisNomeCardinalidadeMaximaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CaracteristicaRaizEditPart.VISUAL_ID:
			if (CaracteristicaRaizNomeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CaracteristicaMandatoriaEditPart.VISUAL_ID:
			if (CaracteristicaMandatoriaNomeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProdutoEditPart.VISUAL_ID:
			if (ProdutoNomeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EventoLogicoEditPart.VISUAL_ID:
			if (EventoLogicoOperadorLogicoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EventoRelacionalEditPart.VISUAL_ID:
			if (EventoRelacionalNomeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AcaoLogicoEditPart.VISUAL_ID:
			if (AcaoLogicoOperadorAcaoLogicoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LiteralAcaoEditPart.VISUAL_ID:
			if (LiteralAcaoNomeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DesignarEditPart.VISUAL_ID:
			if (DesignarNomeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExpressaoLogicaEditPart.VISUAL_ID:
			if (ExpressaoLogicaOperadorLogicoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExpressaoRelacionalEditPart.VISUAL_ID:
			if (ExpressaoRelacionalNomeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LiteralComposicaoEditPart.VISUAL_ID:
			if (LiteralComposicaoNomeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CaracteristicaMandatoriaProdutoEditPart.VISUAL_ID:
			if (CaracteristicaMandatoriaProdutoNomeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CaracteristicaOpcionalProdutoEditPart.VISUAL_ID:
			if (CaracteristicaOpcionalProdutoNomeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case VariacaoDoisProdutoEditPart.VISUAL_ID:
			if (VariacaoDoisProdutoNomeCardinalidadeMaximaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CaracteristicaAgrupadaProdutoEditPart.VISUAL_ID:
			if (CaracteristicaAgrupadaProdutoNomeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AtributoEditPart.VISUAL_ID:
			if (AtributoNomeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RaizDeContextoEditPart.VISUAL_ID:
			if (RaizDeContextoNomeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EntidadeDeContextoEditPart.VISUAL_ID:
			if (EntidadeDeContextoNomeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InformacaoDeContextoEditPart.VISUAL_ID:
			if (InformacaoDeContextoNomeValorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CasoDeUsoEditPart.VISUAL_ID:
			if (CasoDeUsoNomeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CasoDeTesteEditPart.VISUAL_ID:
			if (CasoDeTesteNomeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RegraDeComposicaoEditPart.VISUAL_ID:
			if (RegraDeComposicaoNomeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RegraDeContextoEditPart.VISUAL_ID:
			if (RegraDeContextoNomeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AtributoProdutoEditPart.VISUAL_ID:
			if (AtributoProdutoNomeValorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SimulacaoEditPart.VISUAL_ID:
			if (SimulacaoNomeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SimulacaoSimulacaoEstadosCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EstadoEditPart.VISUAL_ID:
			if (EstadoNomeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SimulacaoSimulacaoEstadosCompartmentEditPart.VISUAL_ID:
			if (EstadoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TransicaoEditPart.VISUAL_ID:
			if (TransicaoEtiquetaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ElementoElementosExternosEditPart.VISUAL_ID:
			if (WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CaracteristicaCaracteristicaFilhaEditPart.VISUAL_ID:
			if (WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CaracteristicaVariacoesEditPart.VISUAL_ID:
			if (WrappingLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CaracteristicaAtributoEditPart.VISUAL_ID:
			if (WrappingLabel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case VariacaoVariantesEditPart.VISUAL_ID:
			if (WrappingLabel5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RaizDeContextoEntidadesDeContextoEditPart.VISUAL_ID:
			if (WrappingLabel6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EntidadeDeContextoInformacoesDeContextoEditPart.VISUAL_ID:
			if (WrappingLabel7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CaracteristicaProdutoCaracteristicaProdutoFilhaEditPart.VISUAL_ID:
			if (WrappingLabel8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CaracteristicaProdutoAtributoProdutoEditPart.VISUAL_ID:
			if (WrappingLabel9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case VariacaoProdutoVariantesProdutoEditPart.VISUAL_ID:
			if (WrappingLabel10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProdutoLinhaDoProdutoEditPart.VISUAL_ID:
			if (WrappingLabel11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RegraDeComposicaoAntecedenteEditPart.VISUAL_ID:
			if (RegraDeComposicaoAntecedenteExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RegraDeComposicaoConsequenteEditPart.VISUAL_ID:
			if (RegraDeComposicaoConsequenteExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RegraDeContextoEventoEditPart.VISUAL_ID:
			if (RegraDeContextoEventoExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RegraDeContextoAcaoEditPart.VISUAL_ID:
			if (RegraDeContextoAcaoExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EventoLogicoLadoDireitoEventoEditPart.VISUAL_ID:
			if (WrappingLabel12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EventoLogicoLadoEsquerdoEventoEditPart.VISUAL_ID:
			if (WrappingLabel13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AcaoLogicoLadoEsquerdoAcaoEditPart.VISUAL_ID:
			if (WrappingLabel14EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AcaoLogicoLadoDireitoAcaoEditPart.VISUAL_ID:
			if (WrappingLabel15EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExpressaoLogicaLadoDireitoComposicaoEditPart.VISUAL_ID:
			if (WrappingLabel16EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExpressaoLogicaLadoEsquerdoComposicaoEditPart.VISUAL_ID:
			if (WrappingLabel17EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (CaracteristicaPackage.eINSTANCE.getTransicao().isSuperTypeOf(domainElement.eClass())) {
			return TransicaoEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(caracteristica.LPS element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case SimulacaoSimulacaoEstadosCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case LPSEditPart.VISUAL_ID:
			return false;
		case CaracteristicaOpcionalEditPart.VISUAL_ID:
		case VariacaoDoisEditPart.VISUAL_ID:
		case CaracteristicaRaizEditPart.VISUAL_ID:
		case CaracteristicaMandatoriaEditPart.VISUAL_ID:
		case ProdutoEditPart.VISUAL_ID:
		case EventoLogicoEditPart.VISUAL_ID:
		case EventoRelacionalEditPart.VISUAL_ID:
		case AcaoLogicoEditPart.VISUAL_ID:
		case LiteralAcaoEditPart.VISUAL_ID:
		case DesignarEditPart.VISUAL_ID:
		case ExpressaoLogicaEditPart.VISUAL_ID:
		case ExpressaoRelacionalEditPart.VISUAL_ID:
		case LiteralComposicaoEditPart.VISUAL_ID:
		case AtributoEditPart.VISUAL_ID:
		case RaizDeContextoEditPart.VISUAL_ID:
		case RegraDeComposicaoEditPart.VISUAL_ID:
		case RegraDeContextoEditPart.VISUAL_ID:
		case CaracteristicaMandatoriaProdutoEditPart.VISUAL_ID:
		case CaracteristicaOpcionalProdutoEditPart.VISUAL_ID:
		case VariacaoDoisProdutoEditPart.VISUAL_ID:
		case EntidadeDeContextoEditPart.VISUAL_ID:
		case InformacaoDeContextoEditPart.VISUAL_ID:
		case AtributoProdutoEditPart.VISUAL_ID:
		case CaracteristicaAgrupadaEditPart.VISUAL_ID:
		case CaracteristicaAgrupadaProdutoEditPart.VISUAL_ID:
		case CasoDeUsoEditPart.VISUAL_ID:
		case CasoDeTesteEditPart.VISUAL_ID:
		case EstadoEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return caracteristica.diagram.part.CaracteristicaVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return caracteristica.diagram.part.CaracteristicaVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return caracteristica.diagram.part.CaracteristicaVisualIDRegistry.getNodeVisualID(containerView,
					domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return caracteristica.diagram.part.CaracteristicaVisualIDRegistry.checkNodeVisualID(containerView,
					domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return caracteristica.diagram.part.CaracteristicaVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return caracteristica.diagram.part.CaracteristicaVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
