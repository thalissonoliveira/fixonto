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

			case VariacaoDoisCardinalidadeMaximaEditPart.VISUAL_ID:
				return new VariacaoDoisCardinalidadeMaximaEditPart(view);

			case CaracteristicaRaizEditPart.VISUAL_ID:
				return new CaracteristicaRaizEditPart(view);

			case CaracteristicaRaizNomeEditPart.VISUAL_ID:
				return new CaracteristicaRaizNomeEditPart(view);

			case CaracteristicaMandatoriaEditPart.VISUAL_ID:
				return new CaracteristicaMandatoriaEditPart(view);

			case CaracteristicaMandatoriaNomeEditPart.VISUAL_ID:
				return new CaracteristicaMandatoriaNomeEditPart(view);

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

			case InformacaoDeContextoNomeEditPart.VISUAL_ID:
				return new InformacaoDeContextoNomeEditPart(view);

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

			case AtributoEditPart.VISUAL_ID:
				return new AtributoEditPart(view);

			case AtributoNomeEditPart.VISUAL_ID:
				return new AtributoNomeEditPart(view);

			case ContextoEditPart.VISUAL_ID:
				return new ContextoEditPart(view);

			case ContextoNomeEditPart.VISUAL_ID:
				return new ContextoNomeEditPart(view);

			case RegraDeComposicaoEditPart.VISUAL_ID:
				return new RegraDeComposicaoEditPart(view);

			case RegraDeComposicaoNomeEditPart.VISUAL_ID:
				return new RegraDeComposicaoNomeEditPart(view);

			case CaracteristicaCaracteristicaFilhaEditPart.VISUAL_ID:
				return new CaracteristicaCaracteristicaFilhaEditPart(view);

			case WrappingLabelEditPart.VISUAL_ID:
				return new WrappingLabelEditPart(view);

			case CaracteristicaVariacoesEditPart.VISUAL_ID:
				return new CaracteristicaVariacoesEditPart(view);

			case WrappingLabel2EditPart.VISUAL_ID:
				return new WrappingLabel2EditPart(view);

			case CaracteristicaAtributoEditPart.VISUAL_ID:
				return new CaracteristicaAtributoEditPart(view);

			case WrappingLabel3EditPart.VISUAL_ID:
				return new WrappingLabel3EditPart(view);

			case VariacaoVariantesEditPart.VISUAL_ID:
				return new VariacaoVariantesEditPart(view);

			case WrappingLabel4EditPart.VISUAL_ID:
				return new WrappingLabel4EditPart(view);

			case ContextoCaracteristicasIncluirEditPart.VISUAL_ID:
				return new ContextoCaracteristicasIncluirEditPart(view);

			case WrappingLabel5EditPart.VISUAL_ID:
				return new WrappingLabel5EditPart(view);

			case ContextoCaracteristicasExcluirEditPart.VISUAL_ID:
				return new ContextoCaracteristicasExcluirEditPart(view);

			case WrappingLabel6EditPart.VISUAL_ID:
				return new WrappingLabel6EditPart(view);

			case RaizDeContextoEntidadesDeContextoEditPart.VISUAL_ID:
				return new RaizDeContextoEntidadesDeContextoEditPart(view);

			case WrappingLabel7EditPart.VISUAL_ID:
				return new WrappingLabel7EditPart(view);

			case EntidadeDeContextoInformacoesDeContextoEditPart.VISUAL_ID:
				return new EntidadeDeContextoInformacoesDeContextoEditPart(view);

			case WrappingLabel8EditPart.VISUAL_ID:
				return new WrappingLabel8EditPart(view);

			case RegraDeComposicaoAntecedenteEditPart.VISUAL_ID:
				return new RegraDeComposicaoAntecedenteEditPart(view);

			case RegraDeComposicaoAntecedenteExternalLabelEditPart.VISUAL_ID:
				return new RegraDeComposicaoAntecedenteExternalLabelEditPart(view);

			case RegraDeComposicaoConsequenteEditPart.VISUAL_ID:
				return new RegraDeComposicaoConsequenteEditPart(view);

			case RegraDeComposicaoConsequenteExternalLabelEditPart.VISUAL_ID:
				return new RegraDeComposicaoConsequenteExternalLabelEditPart(view);

			case ExpressaoLogicaLadoDireitoComposicaoEditPart.VISUAL_ID:
				return new ExpressaoLogicaLadoDireitoComposicaoEditPart(view);

			case WrappingLabel9EditPart.VISUAL_ID:
				return new WrappingLabel9EditPart(view);

			case ExpressaoLogicaLadoEsquerdoComposicaoEditPart.VISUAL_ID:
				return new ExpressaoLogicaLadoEsquerdoComposicaoEditPart(view);

			case WrappingLabel10EditPart.VISUAL_ID:
				return new WrappingLabel10EditPart(view);

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
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
