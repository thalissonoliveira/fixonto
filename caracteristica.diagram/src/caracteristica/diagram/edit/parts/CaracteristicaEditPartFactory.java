/*
 * 
 */
package caracteristica.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import caracteristica.diagram.part.CaracteristicaVisualIDRegistry;

/**
 * @generated
 */
public class CaracteristicaEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (CaracteristicaVisualIDRegistry.getVisualID(view)) {

			case LPSEditPart.VISUAL_ID:
				return new LPSEditPart(view);

			case CaracteristicaOpcionalEditPart.VISUAL_ID:
				return new CaracteristicaOpcionalEditPart(view);

			case CaracteristicaOpcionalNomeEditPart.VISUAL_ID:
				return new CaracteristicaOpcionalNomeEditPart(view);

			case CaracteristicaAgrupadaEditPart.VISUAL_ID:
				return new CaracteristicaAgrupadaEditPart(view);

			case CaracteristicaAgrupadaNomeEditPart.VISUAL_ID:
				return new CaracteristicaAgrupadaNomeEditPart(view);

			case VariacaoDoisEditPart.VISUAL_ID:
				return new VariacaoDoisEditPart(view);

			case VariacaoDoisNomeCardinalidadeMaximaEditPart.VISUAL_ID:
				return new VariacaoDoisNomeCardinalidadeMaximaEditPart(view);

			case CaracteristicaRaizEditPart.VISUAL_ID:
				return new CaracteristicaRaizEditPart(view);

			case CaracteristicaRaizNomeEditPart.VISUAL_ID:
				return new CaracteristicaRaizNomeEditPart(view);

			case CaracteristicaMandatoriaEditPart.VISUAL_ID:
				return new CaracteristicaMandatoriaEditPart(view);

			case CaracteristicaMandatoriaNomeEditPart.VISUAL_ID:
				return new CaracteristicaMandatoriaNomeEditPart(view);

			case ProdutoEditPart.VISUAL_ID:
				return new ProdutoEditPart(view);

			case ProdutoNomeEditPart.VISUAL_ID:
				return new ProdutoNomeEditPart(view);

			case EventoLogicoEditPart.VISUAL_ID:
				return new EventoLogicoEditPart(view);

			case EventoLogicoOperadorLogicoEditPart.VISUAL_ID:
				return new EventoLogicoOperadorLogicoEditPart(view);

			case EventoRelacionalEditPart.VISUAL_ID:
				return new EventoRelacionalEditPart(view);

			case EventoRelacionalNomeEditPart.VISUAL_ID:
				return new EventoRelacionalNomeEditPart(view);

			case AcaoLogicoEditPart.VISUAL_ID:
				return new AcaoLogicoEditPart(view);

			case AcaoLogicoOperadorAcaoLogicoEditPart.VISUAL_ID:
				return new AcaoLogicoOperadorAcaoLogicoEditPart(view);

			case LiteralAcaoEditPart.VISUAL_ID:
				return new LiteralAcaoEditPart(view);

			case LiteralAcaoNomeEditPart.VISUAL_ID:
				return new LiteralAcaoNomeEditPart(view);

			case DesignarEditPart.VISUAL_ID:
				return new DesignarEditPart(view);

			case DesignarNomeEditPart.VISUAL_ID:
				return new DesignarNomeEditPart(view);

			case ExpressaoLogicaEditPart.VISUAL_ID:
				return new ExpressaoLogicaEditPart(view);

			case ExpressaoLogicaOperadorLogicoEditPart.VISUAL_ID:
				return new ExpressaoLogicaOperadorLogicoEditPart(view);

			case ExpressaoRelacionalEditPart.VISUAL_ID:
				return new ExpressaoRelacionalEditPart(view);

			case ExpressaoRelacionalNomeEditPart.VISUAL_ID:
				return new ExpressaoRelacionalNomeEditPart(view);

			case LiteralComposicaoEditPart.VISUAL_ID:
				return new LiteralComposicaoEditPart(view);

			case LiteralComposicaoNomeEditPart.VISUAL_ID:
				return new LiteralComposicaoNomeEditPart(view);

			case CaracteristicaMandatoriaProdutoEditPart.VISUAL_ID:
				return new CaracteristicaMandatoriaProdutoEditPart(view);

			case CaracteristicaMandatoriaProdutoNomeEditPart.VISUAL_ID:
				return new CaracteristicaMandatoriaProdutoNomeEditPart(view);

			case CaracteristicaOpcionalProdutoEditPart.VISUAL_ID:
				return new CaracteristicaOpcionalProdutoEditPart(view);

			case CaracteristicaOpcionalProdutoNomeEditPart.VISUAL_ID:
				return new CaracteristicaOpcionalProdutoNomeEditPart(view);

			case VariacaoDoisProdutoEditPart.VISUAL_ID:
				return new VariacaoDoisProdutoEditPart(view);

			case VariacaoDoisProdutoNomeCardinalidadeMaximaEditPart.VISUAL_ID:
				return new VariacaoDoisProdutoNomeCardinalidadeMaximaEditPart(
						view);

			case CaracteristicaAgrupadaProdutoEditPart.VISUAL_ID:
				return new CaracteristicaAgrupadaProdutoEditPart(view);

			case CaracteristicaAgrupadaProdutoNomeEditPart.VISUAL_ID:
				return new CaracteristicaAgrupadaProdutoNomeEditPart(view);

			case AtributoEditPart.VISUAL_ID:
				return new AtributoEditPart(view);

			case AtributoNomeEditPart.VISUAL_ID:
				return new AtributoNomeEditPart(view);

			case RaizDeContextoEditPart.VISUAL_ID:
				return new RaizDeContextoEditPart(view);

			case RaizDeContextoNomeEditPart.VISUAL_ID:
				return new RaizDeContextoNomeEditPart(view);

			case EntidadeDeContextoEditPart.VISUAL_ID:
				return new EntidadeDeContextoEditPart(view);

			case EntidadeDeContextoNomeEditPart.VISUAL_ID:
				return new EntidadeDeContextoNomeEditPart(view);

			case InformacaoDeContextoEditPart.VISUAL_ID:
				return new InformacaoDeContextoEditPart(view);

			case InformacaoDeContextoNomeValorEditPart.VISUAL_ID:
				return new InformacaoDeContextoNomeValorEditPart(view);

			case CasoDeUsoEditPart.VISUAL_ID:
				return new CasoDeUsoEditPart(view);

			case CasoDeUsoNomeEditPart.VISUAL_ID:
				return new CasoDeUsoNomeEditPart(view);

			case CasoDeTesteEditPart.VISUAL_ID:
				return new CasoDeTesteEditPart(view);

			case CasoDeTesteNomeEditPart.VISUAL_ID:
				return new CasoDeTesteNomeEditPart(view);

			case RegraDeComposicaoEditPart.VISUAL_ID:
				return new RegraDeComposicaoEditPart(view);

			case RegraDeComposicaoNomeEditPart.VISUAL_ID:
				return new RegraDeComposicaoNomeEditPart(view);

			case RegraDeContextoEditPart.VISUAL_ID:
				return new RegraDeContextoEditPart(view);

			case RegraDeContextoNomeEditPart.VISUAL_ID:
				return new RegraDeContextoNomeEditPart(view);

			case AtributoProdutoEditPart.VISUAL_ID:
				return new AtributoProdutoEditPart(view);

			case AtributoProdutoNomeValorEditPart.VISUAL_ID:
				return new AtributoProdutoNomeValorEditPart(view);

			case SimulacaoEditPart.VISUAL_ID:
				return new SimulacaoEditPart(view);

			case SimulacaoNomeEditPart.VISUAL_ID:
				return new SimulacaoNomeEditPart(view);

			case EstadoEditPart.VISUAL_ID:
				return new EstadoEditPart(view);

			case EstadoNomeEditPart.VISUAL_ID:
				return new EstadoNomeEditPart(view);

			case SimulacaoSimulacaoEstadosCompartmentEditPart.VISUAL_ID:
				return new SimulacaoSimulacaoEstadosCompartmentEditPart(view);

			case TransicaoEditPart.VISUAL_ID:
				return new TransicaoEditPart(view);

			case TransicaoEtiquetaEditPart.VISUAL_ID:
				return new TransicaoEtiquetaEditPart(view);

			case CaracteristicaElementosExternosEditPart.VISUAL_ID:
				return new CaracteristicaElementosExternosEditPart(view);

			case WrappingLabelEditPart.VISUAL_ID:
				return new WrappingLabelEditPart(view);

			case CaracteristicaCaracteristicaFilhaEditPart.VISUAL_ID:
				return new CaracteristicaCaracteristicaFilhaEditPart(view);

			case WrappingLabel2EditPart.VISUAL_ID:
				return new WrappingLabel2EditPart(view);

			case CaracteristicaVariacoesEditPart.VISUAL_ID:
				return new CaracteristicaVariacoesEditPart(view);

			case WrappingLabel3EditPart.VISUAL_ID:
				return new WrappingLabel3EditPart(view);

			case CaracteristicaAtributoEditPart.VISUAL_ID:
				return new CaracteristicaAtributoEditPart(view);

			case WrappingLabel4EditPart.VISUAL_ID:
				return new WrappingLabel4EditPart(view);

			case VariacaoVariantesEditPart.VISUAL_ID:
				return new VariacaoVariantesEditPart(view);

			case WrappingLabel5EditPart.VISUAL_ID:
				return new WrappingLabel5EditPart(view);

			case RaizDeContextoEntidadesDeContextoEditPart.VISUAL_ID:
				return new RaizDeContextoEntidadesDeContextoEditPart(view);

			case WrappingLabel6EditPart.VISUAL_ID:
				return new WrappingLabel6EditPart(view);

			case EntidadeDeContextoInformacoesDeContextoEditPart.VISUAL_ID:
				return new EntidadeDeContextoInformacoesDeContextoEditPart(view);

			case WrappingLabel7EditPart.VISUAL_ID:
				return new WrappingLabel7EditPart(view);

			case CaracteristicaProdutoCaracteristicaProdutoFilhaEditPart.VISUAL_ID:
				return new CaracteristicaProdutoCaracteristicaProdutoFilhaEditPart(
						view);

			case WrappingLabel8EditPart.VISUAL_ID:
				return new WrappingLabel8EditPart(view);

			case CaracteristicaProdutoAtributoProdutoEditPart.VISUAL_ID:
				return new CaracteristicaProdutoAtributoProdutoEditPart(view);

			case WrappingLabel9EditPart.VISUAL_ID:
				return new WrappingLabel9EditPart(view);

			case VariacaoProdutoVariantesProdutoEditPart.VISUAL_ID:
				return new VariacaoProdutoVariantesProdutoEditPart(view);

			case WrappingLabel10EditPart.VISUAL_ID:
				return new WrappingLabel10EditPart(view);

			case ProdutoLinhaDoProdutoEditPart.VISUAL_ID:
				return new ProdutoLinhaDoProdutoEditPart(view);

			case WrappingLabel11EditPart.VISUAL_ID:
				return new WrappingLabel11EditPart(view);

			case RegraDeComposicaoAntecedenteEditPart.VISUAL_ID:
				return new RegraDeComposicaoAntecedenteEditPart(view);

			case RegraDeComposicaoAntecedenteExternalLabelEditPart.VISUAL_ID:
				return new RegraDeComposicaoAntecedenteExternalLabelEditPart(
						view);

			case RegraDeComposicaoConsequenteEditPart.VISUAL_ID:
				return new RegraDeComposicaoConsequenteEditPart(view);

			case RegraDeComposicaoConsequenteExternalLabelEditPart.VISUAL_ID:
				return new RegraDeComposicaoConsequenteExternalLabelEditPart(
						view);

			case RegraDeContextoEventoEditPart.VISUAL_ID:
				return new RegraDeContextoEventoEditPart(view);

			case RegraDeContextoEventoExternalLabelEditPart.VISUAL_ID:
				return new RegraDeContextoEventoExternalLabelEditPart(view);

			case RegraDeContextoAcaoEditPart.VISUAL_ID:
				return new RegraDeContextoAcaoEditPart(view);

			case RegraDeContextoAcaoExternalLabelEditPart.VISUAL_ID:
				return new RegraDeContextoAcaoExternalLabelEditPart(view);

			case EventoLogicoLadoDireitoEventoEditPart.VISUAL_ID:
				return new EventoLogicoLadoDireitoEventoEditPart(view);

			case WrappingLabel12EditPart.VISUAL_ID:
				return new WrappingLabel12EditPart(view);

			case EventoLogicoLadoEsquerdoEventoEditPart.VISUAL_ID:
				return new EventoLogicoLadoEsquerdoEventoEditPart(view);

			case WrappingLabel13EditPart.VISUAL_ID:
				return new WrappingLabel13EditPart(view);

			case AcaoLogicoLadoEsquerdoAcaoEditPart.VISUAL_ID:
				return new AcaoLogicoLadoEsquerdoAcaoEditPart(view);

			case WrappingLabel14EditPart.VISUAL_ID:
				return new WrappingLabel14EditPart(view);

			case AcaoLogicoLadoDireitoAcaoEditPart.VISUAL_ID:
				return new AcaoLogicoLadoDireitoAcaoEditPart(view);

			case WrappingLabel15EditPart.VISUAL_ID:
				return new WrappingLabel15EditPart(view);

			case ExpressaoLogicaLadoDireitoComposicaoEditPart.VISUAL_ID:
				return new ExpressaoLogicaLadoDireitoComposicaoEditPart(view);

			case WrappingLabel16EditPart.VISUAL_ID:
				return new WrappingLabel16EditPart(view);

			case ExpressaoLogicaLadoEsquerdoComposicaoEditPart.VISUAL_ID:
				return new ExpressaoLogicaLadoEsquerdoComposicaoEditPart(view);

			case WrappingLabel17EditPart.VISUAL_ID:
				return new WrappingLabel17EditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
