/*
 * 
 */
package caracteristica.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.CommonParserHint;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import caracteristica.diagram.edit.parts.AcaoLogicoEditPart;
import caracteristica.diagram.edit.parts.AcaoLogicoLadoDireitoAcaoEditPart;
import caracteristica.diagram.edit.parts.AcaoLogicoLadoEsquerdoAcaoEditPart;
import caracteristica.diagram.edit.parts.AcaoLogicoOperadorAcaoLogicoEditPart;
import caracteristica.diagram.edit.parts.AtributoEditPart;
import caracteristica.diagram.edit.parts.AtributoNomeEditPart;
import caracteristica.diagram.edit.parts.AtributoProdutoEditPart;
import caracteristica.diagram.edit.parts.AtributoProdutoNomeValorEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaAgrupadaEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaAgrupadaNomeEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaAgrupadaProdutoEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaAgrupadaProdutoNomeEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaAtributoEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaCaracteristicaFilhaEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaMandatoriaEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaMandatoriaNomeEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaMandatoriaProdutoEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaMandatoriaProdutoNomeEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaOpcionalEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaOpcionalNomeEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaOpcionalProdutoEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaOpcionalProdutoNomeEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaProdutoAtributoProdutoEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaProdutoCaracteristicaProdutoFilhaEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaRaizEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaRaizNomeEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaVariacoesEditPart;
import caracteristica.diagram.edit.parts.CasoDeTesteEditPart;
import caracteristica.diagram.edit.parts.CasoDeTesteNomeEditPart;
import caracteristica.diagram.edit.parts.CasoDeUsoEditPart;
import caracteristica.diagram.edit.parts.CasoDeUsoNomeEditPart;
import caracteristica.diagram.edit.parts.DesignarEditPart;
import caracteristica.diagram.edit.parts.DesignarNomeEditPart;
import caracteristica.diagram.edit.parts.ElementoElementosExternosEditPart;
import caracteristica.diagram.edit.parts.EntidadeDeContextoEditPart;
import caracteristica.diagram.edit.parts.EntidadeDeContextoInformacoesDeContextoEditPart;
import caracteristica.diagram.edit.parts.EntidadeDeContextoNomeEditPart;
import caracteristica.diagram.edit.parts.EstadoEditPart;
import caracteristica.diagram.edit.parts.EstadoNomeEditPart;
import caracteristica.diagram.edit.parts.EventoLogicoEditPart;
import caracteristica.diagram.edit.parts.EventoLogicoLadoDireitoEventoEditPart;
import caracteristica.diagram.edit.parts.EventoLogicoLadoEsquerdoEventoEditPart;
import caracteristica.diagram.edit.parts.EventoLogicoOperadorLogicoEditPart;
import caracteristica.diagram.edit.parts.EventoRelacionalEditPart;
import caracteristica.diagram.edit.parts.EventoRelacionalNomeEditPart;
import caracteristica.diagram.edit.parts.ExpressaoLogicaEditPart;
import caracteristica.diagram.edit.parts.ExpressaoLogicaLadoDireitoComposicaoEditPart;
import caracteristica.diagram.edit.parts.ExpressaoLogicaLadoEsquerdoComposicaoEditPart;
import caracteristica.diagram.edit.parts.ExpressaoLogicaOperadorLogicoEditPart;
import caracteristica.diagram.edit.parts.ExpressaoRelacionalEditPart;
import caracteristica.diagram.edit.parts.ExpressaoRelacionalNomeEditPart;
import caracteristica.diagram.edit.parts.InformacaoDeContextoEditPart;
import caracteristica.diagram.edit.parts.InformacaoDeContextoNomeValorEditPart;
import caracteristica.diagram.edit.parts.LPSEditPart;
import caracteristica.diagram.edit.parts.LiteralAcaoEditPart;
import caracteristica.diagram.edit.parts.LiteralAcaoNomeEditPart;
import caracteristica.diagram.edit.parts.LiteralComposicaoEditPart;
import caracteristica.diagram.edit.parts.LiteralComposicaoNomeEditPart;
import caracteristica.diagram.edit.parts.ProdutoEditPart;
import caracteristica.diagram.edit.parts.ProdutoLinhaDoProdutoEditPart;
import caracteristica.diagram.edit.parts.ProdutoNomeEditPart;
import caracteristica.diagram.edit.parts.RaizDeContextoEditPart;
import caracteristica.diagram.edit.parts.RaizDeContextoEntidadesDeContextoEditPart;
import caracteristica.diagram.edit.parts.RaizDeContextoNomeEditPart;
import caracteristica.diagram.edit.parts.RegraDeComposicaoAntecedenteEditPart;
import caracteristica.diagram.edit.parts.RegraDeComposicaoConsequenteEditPart;
import caracteristica.diagram.edit.parts.RegraDeComposicaoEditPart;
import caracteristica.diagram.edit.parts.RegraDeComposicaoNomeEditPart;
import caracteristica.diagram.edit.parts.RegraDeContextoAcaoEditPart;
import caracteristica.diagram.edit.parts.RegraDeContextoEditPart;
import caracteristica.diagram.edit.parts.RegraDeContextoEventoEditPart;
import caracteristica.diagram.edit.parts.RegraDeContextoNomeEditPart;
import caracteristica.diagram.edit.parts.SimulacaoEditPart;
import caracteristica.diagram.edit.parts.SimulacaoNomeEditPart;
import caracteristica.diagram.edit.parts.TransicaoEditPart;
import caracteristica.diagram.edit.parts.TransicaoEtiquetaEditPart;
import caracteristica.diagram.edit.parts.VariacaoDoisEditPart;
import caracteristica.diagram.edit.parts.VariacaoDoisNomeCardinalidadeMaximaEditPart;
import caracteristica.diagram.edit.parts.VariacaoDoisProdutoEditPart;
import caracteristica.diagram.edit.parts.VariacaoDoisProdutoNomeCardinalidadeMaximaEditPart;
import caracteristica.diagram.edit.parts.VariacaoProdutoVariantesProdutoEditPart;
import caracteristica.diagram.edit.parts.VariacaoVariantesEditPart;
import caracteristica.diagram.part.CaracteristicaDiagramEditorPlugin;
import caracteristica.diagram.part.CaracteristicaVisualIDRegistry;
import caracteristica.diagram.providers.CaracteristicaElementTypes;
import caracteristica.diagram.providers.CaracteristicaParserProvider;

/**
 * @generated
 */
public class CaracteristicaNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		CaracteristicaDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		CaracteristicaDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof CaracteristicaNavigatorItem
				&& !isOwnView(((CaracteristicaNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof CaracteristicaNavigatorGroup) {
			CaracteristicaNavigatorGroup group = (CaracteristicaNavigatorGroup) element;
			return CaracteristicaDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof CaracteristicaNavigatorItem) {
			CaracteristicaNavigatorItem navigatorItem = (CaracteristicaNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (CaracteristicaVisualIDRegistry.getVisualID(view)) {
		case LPSEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?caracteristica?LPS", CaracteristicaElementTypes.LPS_1000); //$NON-NLS-1$
		case CaracteristicaOpcionalEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?caracteristica?CaracteristicaOpcional", //$NON-NLS-1$
					CaracteristicaElementTypes.CaracteristicaOpcional_2001);
		case VariacaoDoisEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?caracteristica?VariacaoDois", //$NON-NLS-1$
					CaracteristicaElementTypes.VariacaoDois_2002);
		case CaracteristicaRaizEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?caracteristica?CaracteristicaRaiz", //$NON-NLS-1$
					CaracteristicaElementTypes.CaracteristicaRaiz_2003);
		case CaracteristicaMandatoriaEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?caracteristica?CaracteristicaMandatoria", //$NON-NLS-1$
					CaracteristicaElementTypes.CaracteristicaMandatoria_2004);
		case ProdutoEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?caracteristica?Produto", CaracteristicaElementTypes.Produto_2005); //$NON-NLS-1$
		case EventoLogicoEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?caracteristica?EventoLogico", //$NON-NLS-1$
					CaracteristicaElementTypes.EventoLogico_2006);
		case EventoRelacionalEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?caracteristica?EventoRelacional", //$NON-NLS-1$
					CaracteristicaElementTypes.EventoRelacional_2007);
		case AcaoLogicoEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?caracteristica?AcaoLogico", //$NON-NLS-1$
					CaracteristicaElementTypes.AcaoLogico_2008);
		case LiteralAcaoEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?caracteristica?LiteralAcao", //$NON-NLS-1$
					CaracteristicaElementTypes.LiteralAcao_2009);
		case DesignarEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?caracteristica?Designar", CaracteristicaElementTypes.Designar_2010); //$NON-NLS-1$
		case ExpressaoLogicaEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?caracteristica?ExpressaoLogica", //$NON-NLS-1$
					CaracteristicaElementTypes.ExpressaoLogica_2011);
		case ExpressaoRelacionalEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?caracteristica?ExpressaoRelacional", //$NON-NLS-1$
					CaracteristicaElementTypes.ExpressaoRelacional_2012);
		case LiteralComposicaoEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?caracteristica?LiteralComposicao", //$NON-NLS-1$
					CaracteristicaElementTypes.LiteralComposicao_2013);
		case AtributoEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?caracteristica?Atributo", CaracteristicaElementTypes.Atributo_2017); //$NON-NLS-1$
		case RaizDeContextoEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?caracteristica?RaizDeContexto", //$NON-NLS-1$
					CaracteristicaElementTypes.RaizDeContexto_2018);
		case RegraDeComposicaoEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?caracteristica?RegraDeComposicao", //$NON-NLS-1$
					CaracteristicaElementTypes.RegraDeComposicao_2021);
		case RegraDeContextoEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?caracteristica?RegraDeContexto", //$NON-NLS-1$
					CaracteristicaElementTypes.RegraDeContexto_2022);
		case SimulacaoEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?caracteristica?Simulacao", //$NON-NLS-1$
					CaracteristicaElementTypes.Simulacao_2024);
		case CaracteristicaMandatoriaProdutoEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?caracteristica?CaracteristicaMandatoriaProduto", //$NON-NLS-1$
					CaracteristicaElementTypes.CaracteristicaMandatoriaProduto_2025);
		case CaracteristicaOpcionalProdutoEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?caracteristica?CaracteristicaOpcionalProduto", //$NON-NLS-1$
					CaracteristicaElementTypes.CaracteristicaOpcionalProduto_2026);
		case VariacaoDoisProdutoEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?caracteristica?VariacaoDoisProduto", //$NON-NLS-1$
					CaracteristicaElementTypes.VariacaoDoisProduto_2027);
		case EntidadeDeContextoEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?caracteristica?EntidadeDeContexto", //$NON-NLS-1$
					CaracteristicaElementTypes.EntidadeDeContexto_2028);
		case InformacaoDeContextoEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?caracteristica?InformacaoDeContexto", //$NON-NLS-1$
					CaracteristicaElementTypes.InformacaoDeContexto_2029);
		case AtributoProdutoEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?caracteristica?AtributoProduto", //$NON-NLS-1$
					CaracteristicaElementTypes.AtributoProduto_2030);
		case CaracteristicaAgrupadaEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?caracteristica?CaracteristicaAgrupada", //$NON-NLS-1$
					CaracteristicaElementTypes.CaracteristicaAgrupada_2033);
		case CaracteristicaAgrupadaProdutoEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?caracteristica?CaracteristicaAgrupadaProduto", //$NON-NLS-1$
					CaracteristicaElementTypes.CaracteristicaAgrupadaProduto_2035);
		case CasoDeUsoEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?caracteristica?CasoDeUso", //$NON-NLS-1$
					CaracteristicaElementTypes.CasoDeUso_2038);
		case CasoDeTesteEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?caracteristica?CasoDeTeste", //$NON-NLS-1$
					CaracteristicaElementTypes.CasoDeTeste_2039);
		case EstadoEditPart.VISUAL_ID:
			return getImage("Navigator?Node?caracteristica?Estado", CaracteristicaElementTypes.Estado_3001); //$NON-NLS-1$
		case TransicaoEditPart.VISUAL_ID:
			return getImage("Navigator?Link?caracteristica?Transicao", CaracteristicaElementTypes.Transicao_4001); //$NON-NLS-1$
		case CaracteristicaCaracteristicaFilhaEditPart.VISUAL_ID:
			return getImage("Navigator?Link?caracteristica?Caracteristica?caracteristicaFilha", //$NON-NLS-1$
					CaracteristicaElementTypes.CaracteristicaCaracteristicaFilha_4002);
		case CaracteristicaVariacoesEditPart.VISUAL_ID:
			return getImage("Navigator?Link?caracteristica?Caracteristica?variacoes", //$NON-NLS-1$
					CaracteristicaElementTypes.CaracteristicaVariacoes_4003);
		case CaracteristicaAtributoEditPart.VISUAL_ID:
			return getImage("Navigator?Link?caracteristica?Caracteristica?atributo", //$NON-NLS-1$
					CaracteristicaElementTypes.CaracteristicaAtributo_4004);
		case VariacaoVariantesEditPart.VISUAL_ID:
			return getImage("Navigator?Link?caracteristica?Variacao?variantes", //$NON-NLS-1$
					CaracteristicaElementTypes.VariacaoVariantes_4005);
		case RaizDeContextoEntidadesDeContextoEditPart.VISUAL_ID:
			return getImage("Navigator?Link?caracteristica?RaizDeContexto?entidadesDeContexto", //$NON-NLS-1$
					CaracteristicaElementTypes.RaizDeContextoEntidadesDeContexto_4006);
		case CaracteristicaProdutoCaracteristicaProdutoFilhaEditPart.VISUAL_ID:
			return getImage("Navigator?Link?caracteristica?CaracteristicaProduto?caracteristicaProdutoFilha", //$NON-NLS-1$
					CaracteristicaElementTypes.CaracteristicaProdutoCaracteristicaProdutoFilha_4008);
		case CaracteristicaProdutoAtributoProdutoEditPart.VISUAL_ID:
			return getImage("Navigator?Link?caracteristica?CaracteristicaProduto?atributoProduto", //$NON-NLS-1$
					CaracteristicaElementTypes.CaracteristicaProdutoAtributoProduto_4009);
		case VariacaoProdutoVariantesProdutoEditPart.VISUAL_ID:
			return getImage("Navigator?Link?caracteristica?VariacaoProduto?variantesProduto", //$NON-NLS-1$
					CaracteristicaElementTypes.VariacaoProdutoVariantesProduto_4010);
		case ProdutoLinhaDoProdutoEditPart.VISUAL_ID:
			return getImage("Navigator?Link?caracteristica?Produto?LinhaDoProduto", //$NON-NLS-1$
					CaracteristicaElementTypes.ProdutoLinhaDoProduto_4011);
		case RegraDeComposicaoAntecedenteEditPart.VISUAL_ID:
			return getImage("Navigator?Link?caracteristica?RegraDeComposicao?antecedente", //$NON-NLS-1$
					CaracteristicaElementTypes.RegraDeComposicaoAntecedente_4012);
		case RegraDeComposicaoConsequenteEditPart.VISUAL_ID:
			return getImage("Navigator?Link?caracteristica?RegraDeComposicao?consequente", //$NON-NLS-1$
					CaracteristicaElementTypes.RegraDeComposicaoConsequente_4013);
		case RegraDeContextoEventoEditPart.VISUAL_ID:
			return getImage("Navigator?Link?caracteristica?RegraDeContexto?evento", //$NON-NLS-1$
					CaracteristicaElementTypes.RegraDeContextoEvento_4014);
		case RegraDeContextoAcaoEditPart.VISUAL_ID:
			return getImage("Navigator?Link?caracteristica?RegraDeContexto?acao", //$NON-NLS-1$
					CaracteristicaElementTypes.RegraDeContextoAcao_4015);
		case EventoLogicoLadoDireitoEventoEditPart.VISUAL_ID:
			return getImage("Navigator?Link?caracteristica?EventoLogico?ladoDireitoEvento", //$NON-NLS-1$
					CaracteristicaElementTypes.EventoLogicoLadoDireitoEvento_4016);
		case EventoLogicoLadoEsquerdoEventoEditPart.VISUAL_ID:
			return getImage("Navigator?Link?caracteristica?EventoLogico?ladoEsquerdoEvento", //$NON-NLS-1$
					CaracteristicaElementTypes.EventoLogicoLadoEsquerdoEvento_4017);
		case AcaoLogicoLadoEsquerdoAcaoEditPart.VISUAL_ID:
			return getImage("Navigator?Link?caracteristica?AcaoLogico?ladoEsquerdoAcao", //$NON-NLS-1$
					CaracteristicaElementTypes.AcaoLogicoLadoEsquerdoAcao_4018);
		case AcaoLogicoLadoDireitoAcaoEditPart.VISUAL_ID:
			return getImage("Navigator?Link?caracteristica?AcaoLogico?ladoDireitoAcao", //$NON-NLS-1$
					CaracteristicaElementTypes.AcaoLogicoLadoDireitoAcao_4019);
		case ExpressaoLogicaLadoDireitoComposicaoEditPart.VISUAL_ID:
			return getImage("Navigator?Link?caracteristica?ExpressaoLogica?ladoDireitoComposicao", //$NON-NLS-1$
					CaracteristicaElementTypes.ExpressaoLogicaLadoDireitoComposicao_4020);
		case ExpressaoLogicaLadoEsquerdoComposicaoEditPart.VISUAL_ID:
			return getImage("Navigator?Link?caracteristica?ExpressaoLogica?ladoEsquerdoComposicao", //$NON-NLS-1$
					CaracteristicaElementTypes.ExpressaoLogicaLadoEsquerdoComposicao_4021);
		case EntidadeDeContextoInformacoesDeContextoEditPart.VISUAL_ID:
			return getImage("Navigator?Link?caracteristica?EntidadeDeContexto?informacoesDeContexto", //$NON-NLS-1$
					CaracteristicaElementTypes.EntidadeDeContextoInformacoesDeContexto_4023);
		case ElementoElementosExternosEditPart.VISUAL_ID:
			return getImage("Navigator?Link?caracteristica?Caracteristica?elementosExternos", //$NON-NLS-1$
					CaracteristicaElementTypes.CaracteristicaElementosExternos_4024);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = CaracteristicaDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && CaracteristicaElementTypes.isKnownElementType(elementType)) {
			image = CaracteristicaElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof CaracteristicaNavigatorGroup) {
			CaracteristicaNavigatorGroup group = (CaracteristicaNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof CaracteristicaNavigatorItem) {
			CaracteristicaNavigatorItem navigatorItem = (CaracteristicaNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (CaracteristicaVisualIDRegistry.getVisualID(view)) {
		case LPSEditPart.VISUAL_ID:
			return getLPS_1000Text(view);
		case CaracteristicaOpcionalEditPart.VISUAL_ID:
			return getCaracteristicaOpcional_2001Text(view);
		case VariacaoDoisEditPart.VISUAL_ID:
			return getVariacaoDois_2002Text(view);
		case CaracteristicaRaizEditPart.VISUAL_ID:
			return getCaracteristicaRaiz_2003Text(view);
		case CaracteristicaMandatoriaEditPart.VISUAL_ID:
			return getCaracteristicaMandatoria_2004Text(view);
		case ProdutoEditPart.VISUAL_ID:
			return getProduto_2005Text(view);
		case EventoLogicoEditPart.VISUAL_ID:
			return getEventoLogico_2006Text(view);
		case EventoRelacionalEditPart.VISUAL_ID:
			return getEventoRelacional_2007Text(view);
		case AcaoLogicoEditPart.VISUAL_ID:
			return getAcaoLogico_2008Text(view);
		case LiteralAcaoEditPart.VISUAL_ID:
			return getLiteralAcao_2009Text(view);
		case DesignarEditPart.VISUAL_ID:
			return getDesignar_2010Text(view);
		case ExpressaoLogicaEditPart.VISUAL_ID:
			return getExpressaoLogica_2011Text(view);
		case ExpressaoRelacionalEditPart.VISUAL_ID:
			return getExpressaoRelacional_2012Text(view);
		case LiteralComposicaoEditPart.VISUAL_ID:
			return getLiteralComposicao_2013Text(view);
		case AtributoEditPart.VISUAL_ID:
			return getAtributo_2017Text(view);
		case RaizDeContextoEditPart.VISUAL_ID:
			return getRaizDeContexto_2018Text(view);
		case RegraDeComposicaoEditPart.VISUAL_ID:
			return getRegraDeComposicao_2021Text(view);
		case RegraDeContextoEditPart.VISUAL_ID:
			return getRegraDeContexto_2022Text(view);
		case SimulacaoEditPart.VISUAL_ID:
			return getSimulacao_2024Text(view);
		case CaracteristicaMandatoriaProdutoEditPart.VISUAL_ID:
			return getCaracteristicaMandatoriaProduto_2025Text(view);
		case CaracteristicaOpcionalProdutoEditPart.VISUAL_ID:
			return getCaracteristicaOpcionalProduto_2026Text(view);
		case VariacaoDoisProdutoEditPart.VISUAL_ID:
			return getVariacaoDoisProduto_2027Text(view);
		case EntidadeDeContextoEditPart.VISUAL_ID:
			return getEntidadeDeContexto_2028Text(view);
		case InformacaoDeContextoEditPart.VISUAL_ID:
			return getInformacaoDeContexto_2029Text(view);
		case AtributoProdutoEditPart.VISUAL_ID:
			return getAtributoProduto_2030Text(view);
		case CaracteristicaAgrupadaEditPart.VISUAL_ID:
			return getCaracteristicaAgrupada_2033Text(view);
		case CaracteristicaAgrupadaProdutoEditPart.VISUAL_ID:
			return getCaracteristicaAgrupadaProduto_2035Text(view);
		case CasoDeUsoEditPart.VISUAL_ID:
			return getCasoDeUso_2038Text(view);
		case CasoDeTesteEditPart.VISUAL_ID:
			return getCasoDeTeste_2039Text(view);
		case EstadoEditPart.VISUAL_ID:
			return getEstado_3001Text(view);
		case TransicaoEditPart.VISUAL_ID:
			return getTransicao_4001Text(view);
		case CaracteristicaCaracteristicaFilhaEditPart.VISUAL_ID:
			return getCaracteristicaCaracteristicaFilha_4002Text(view);
		case CaracteristicaVariacoesEditPart.VISUAL_ID:
			return getCaracteristicaVariacoes_4003Text(view);
		case CaracteristicaAtributoEditPart.VISUAL_ID:
			return getCaracteristicaAtributo_4004Text(view);
		case VariacaoVariantesEditPart.VISUAL_ID:
			return getVariacaoVariantes_4005Text(view);
		case RaizDeContextoEntidadesDeContextoEditPart.VISUAL_ID:
			return getRaizDeContextoEntidadesDeContexto_4006Text(view);
		case CaracteristicaProdutoCaracteristicaProdutoFilhaEditPart.VISUAL_ID:
			return getCaracteristicaProdutoCaracteristicaProdutoFilha_4008Text(view);
		case CaracteristicaProdutoAtributoProdutoEditPart.VISUAL_ID:
			return getCaracteristicaProdutoAtributoProduto_4009Text(view);
		case VariacaoProdutoVariantesProdutoEditPart.VISUAL_ID:
			return getVariacaoProdutoVariantesProduto_4010Text(view);
		case ProdutoLinhaDoProdutoEditPart.VISUAL_ID:
			return getProdutoLinhaDoProduto_4011Text(view);
		case RegraDeComposicaoAntecedenteEditPart.VISUAL_ID:
			return getRegraDeComposicaoAntecedente_4012Text(view);
		case RegraDeComposicaoConsequenteEditPart.VISUAL_ID:
			return getRegraDeComposicaoConsequente_4013Text(view);
		case RegraDeContextoEventoEditPart.VISUAL_ID:
			return getRegraDeContextoEvento_4014Text(view);
		case RegraDeContextoAcaoEditPart.VISUAL_ID:
			return getRegraDeContextoAcao_4015Text(view);
		case EventoLogicoLadoDireitoEventoEditPart.VISUAL_ID:
			return getEventoLogicoLadoDireitoEvento_4016Text(view);
		case EventoLogicoLadoEsquerdoEventoEditPart.VISUAL_ID:
			return getEventoLogicoLadoEsquerdoEvento_4017Text(view);
		case AcaoLogicoLadoEsquerdoAcaoEditPart.VISUAL_ID:
			return getAcaoLogicoLadoEsquerdoAcao_4018Text(view);
		case AcaoLogicoLadoDireitoAcaoEditPart.VISUAL_ID:
			return getAcaoLogicoLadoDireitoAcao_4019Text(view);
		case ExpressaoLogicaLadoDireitoComposicaoEditPart.VISUAL_ID:
			return getExpressaoLogicaLadoDireitoComposicao_4020Text(view);
		case ExpressaoLogicaLadoEsquerdoComposicaoEditPart.VISUAL_ID:
			return getExpressaoLogicaLadoEsquerdoComposicao_4021Text(view);
		case EntidadeDeContextoInformacoesDeContextoEditPart.VISUAL_ID:
			return getEntidadeDeContextoInformacoesDeContexto_4023Text(view);
		case ElementoElementosExternosEditPart.VISUAL_ID:
			return getElementoElementosExternos_4027Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getLPS_1000Text(View view) {
		caracteristica.LPS domainModelElement = (caracteristica.LPS) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getNome();
		} else {
			CaracteristicaDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCaracteristicaOpcional_2001Text(View view) {
		IParser parser = CaracteristicaParserProvider.getParser(CaracteristicaElementTypes.CaracteristicaOpcional_2001,
				view.getElement() != null ? view.getElement() : view,
				CaracteristicaVisualIDRegistry.getType(CaracteristicaOpcionalNomeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CaracteristicaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getVariacaoDois_2002Text(View view) {
		IParser parser = CaracteristicaParserProvider.getParser(CaracteristicaElementTypes.VariacaoDois_2002,
				view.getElement() != null ? view.getElement() : view,
				CaracteristicaVisualIDRegistry.getType(VariacaoDoisNomeCardinalidadeMaximaEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CaracteristicaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCaracteristicaRaiz_2003Text(View view) {
		IParser parser = CaracteristicaParserProvider.getParser(CaracteristicaElementTypes.CaracteristicaRaiz_2003,
				view.getElement() != null ? view.getElement() : view,
				CaracteristicaVisualIDRegistry.getType(CaracteristicaRaizNomeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CaracteristicaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCaracteristicaMandatoria_2004Text(View view) {
		IParser parser = CaracteristicaParserProvider.getParser(
				CaracteristicaElementTypes.CaracteristicaMandatoria_2004,
				view.getElement() != null ? view.getElement() : view,
				CaracteristicaVisualIDRegistry.getType(CaracteristicaMandatoriaNomeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CaracteristicaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProduto_2005Text(View view) {
		IParser parser = CaracteristicaParserProvider.getParser(CaracteristicaElementTypes.Produto_2005,
				view.getElement() != null ? view.getElement() : view,
				CaracteristicaVisualIDRegistry.getType(ProdutoNomeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CaracteristicaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEventoLogico_2006Text(View view) {
		IParser parser = CaracteristicaParserProvider.getParser(CaracteristicaElementTypes.EventoLogico_2006,
				view.getElement() != null ? view.getElement() : view,
				CaracteristicaVisualIDRegistry.getType(EventoLogicoOperadorLogicoEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CaracteristicaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEventoRelacional_2007Text(View view) {
		IParser parser = CaracteristicaParserProvider.getParser(CaracteristicaElementTypes.EventoRelacional_2007,
				view.getElement() != null ? view.getElement() : view,
				CaracteristicaVisualIDRegistry.getType(EventoRelacionalNomeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CaracteristicaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAcaoLogico_2008Text(View view) {
		IParser parser = CaracteristicaParserProvider.getParser(CaracteristicaElementTypes.AcaoLogico_2008,
				view.getElement() != null ? view.getElement() : view,
				CaracteristicaVisualIDRegistry.getType(AcaoLogicoOperadorAcaoLogicoEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CaracteristicaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLiteralAcao_2009Text(View view) {
		IParser parser = CaracteristicaParserProvider.getParser(CaracteristicaElementTypes.LiteralAcao_2009,
				view.getElement() != null ? view.getElement() : view,
				CaracteristicaVisualIDRegistry.getType(LiteralAcaoNomeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CaracteristicaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDesignar_2010Text(View view) {
		IParser parser = CaracteristicaParserProvider.getParser(CaracteristicaElementTypes.Designar_2010,
				view.getElement() != null ? view.getElement() : view,
				CaracteristicaVisualIDRegistry.getType(DesignarNomeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CaracteristicaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExpressaoLogica_2011Text(View view) {
		IParser parser = CaracteristicaParserProvider.getParser(CaracteristicaElementTypes.ExpressaoLogica_2011,
				view.getElement() != null ? view.getElement() : view,
				CaracteristicaVisualIDRegistry.getType(ExpressaoLogicaOperadorLogicoEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CaracteristicaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExpressaoRelacional_2012Text(View view) {
		IParser parser = CaracteristicaParserProvider.getParser(CaracteristicaElementTypes.ExpressaoRelacional_2012,
				view.getElement() != null ? view.getElement() : view,
				CaracteristicaVisualIDRegistry.getType(ExpressaoRelacionalNomeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CaracteristicaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLiteralComposicao_2013Text(View view) {
		IParser parser = CaracteristicaParserProvider.getParser(CaracteristicaElementTypes.LiteralComposicao_2013,
				view.getElement() != null ? view.getElement() : view,
				CaracteristicaVisualIDRegistry.getType(LiteralComposicaoNomeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CaracteristicaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAtributo_2017Text(View view) {
		IParser parser = CaracteristicaParserProvider.getParser(CaracteristicaElementTypes.Atributo_2017,
				view.getElement() != null ? view.getElement() : view,
				CaracteristicaVisualIDRegistry.getType(AtributoNomeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CaracteristicaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRaizDeContexto_2018Text(View view) {
		IParser parser = CaracteristicaParserProvider.getParser(CaracteristicaElementTypes.RaizDeContexto_2018,
				view.getElement() != null ? view.getElement() : view,
				CaracteristicaVisualIDRegistry.getType(RaizDeContextoNomeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CaracteristicaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRegraDeComposicao_2021Text(View view) {
		IParser parser = CaracteristicaParserProvider.getParser(CaracteristicaElementTypes.RegraDeComposicao_2021,
				view.getElement() != null ? view.getElement() : view,
				CaracteristicaVisualIDRegistry.getType(RegraDeComposicaoNomeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CaracteristicaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRegraDeContexto_2022Text(View view) {
		IParser parser = CaracteristicaParserProvider.getParser(CaracteristicaElementTypes.RegraDeContexto_2022,
				view.getElement() != null ? view.getElement() : view,
				CaracteristicaVisualIDRegistry.getType(RegraDeContextoNomeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CaracteristicaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5022); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSimulacao_2024Text(View view) {
		IParser parser = CaracteristicaParserProvider.getParser(CaracteristicaElementTypes.Simulacao_2024,
				view.getElement() != null ? view.getElement() : view,
				CaracteristicaVisualIDRegistry.getType(SimulacaoNomeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CaracteristicaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5025); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCaracteristicaMandatoriaProduto_2025Text(View view) {
		IParser parser = CaracteristicaParserProvider.getParser(
				CaracteristicaElementTypes.CaracteristicaMandatoriaProduto_2025,
				view.getElement() != null ? view.getElement() : view,
				CaracteristicaVisualIDRegistry.getType(CaracteristicaMandatoriaProdutoNomeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CaracteristicaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5026); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCaracteristicaOpcionalProduto_2026Text(View view) {
		IParser parser = CaracteristicaParserProvider.getParser(
				CaracteristicaElementTypes.CaracteristicaOpcionalProduto_2026,
				view.getElement() != null ? view.getElement() : view,
				CaracteristicaVisualIDRegistry.getType(CaracteristicaOpcionalProdutoNomeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CaracteristicaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5027); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getVariacaoDoisProduto_2027Text(View view) {
		IParser parser = CaracteristicaParserProvider.getParser(CaracteristicaElementTypes.VariacaoDoisProduto_2027,
				view.getElement() != null ? view.getElement() : view,
				CaracteristicaVisualIDRegistry.getType(VariacaoDoisProdutoNomeCardinalidadeMaximaEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CaracteristicaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5028); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEntidadeDeContexto_2028Text(View view) {
		IParser parser = CaracteristicaParserProvider.getParser(CaracteristicaElementTypes.EntidadeDeContexto_2028,
				view.getElement() != null ? view.getElement() : view,
				CaracteristicaVisualIDRegistry.getType(EntidadeDeContextoNomeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CaracteristicaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5029); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInformacaoDeContexto_2029Text(View view) {
		IParser parser = CaracteristicaParserProvider.getParser(CaracteristicaElementTypes.InformacaoDeContexto_2029,
				view.getElement() != null ? view.getElement() : view,
				CaracteristicaVisualIDRegistry.getType(InformacaoDeContextoNomeValorEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CaracteristicaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5030); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAtributoProduto_2030Text(View view) {
		IParser parser = CaracteristicaParserProvider.getParser(CaracteristicaElementTypes.AtributoProduto_2030,
				view.getElement() != null ? view.getElement() : view,
				CaracteristicaVisualIDRegistry.getType(AtributoProdutoNomeValorEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CaracteristicaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5031); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCaracteristicaAgrupada_2033Text(View view) {
		IParser parser = CaracteristicaParserProvider.getParser(CaracteristicaElementTypes.CaracteristicaAgrupada_2033,
				view.getElement() != null ? view.getElement() : view,
				CaracteristicaVisualIDRegistry.getType(CaracteristicaAgrupadaNomeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CaracteristicaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5034); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCaracteristicaAgrupadaProduto_2035Text(View view) {
		IParser parser = CaracteristicaParserProvider.getParser(
				CaracteristicaElementTypes.CaracteristicaAgrupadaProduto_2035,
				view.getElement() != null ? view.getElement() : view,
				CaracteristicaVisualIDRegistry.getType(CaracteristicaAgrupadaProdutoNomeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CaracteristicaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5036); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCasoDeUso_2038Text(View view) {
		IParser parser = CaracteristicaParserProvider.getParser(CaracteristicaElementTypes.CasoDeUso_2038,
				view.getElement() != null ? view.getElement() : view,
				CaracteristicaVisualIDRegistry.getType(CasoDeUsoNomeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CaracteristicaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5039); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCasoDeTeste_2039Text(View view) {
		IParser parser = CaracteristicaParserProvider.getParser(CaracteristicaElementTypes.CasoDeTeste_2039,
				view.getElement() != null ? view.getElement() : view,
				CaracteristicaVisualIDRegistry.getType(CasoDeTesteNomeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CaracteristicaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5040); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEstado_3001Text(View view) {
		IParser parser = CaracteristicaParserProvider.getParser(CaracteristicaElementTypes.Estado_3001,
				view.getElement() != null ? view.getElement() : view,
				CaracteristicaVisualIDRegistry.getType(EstadoNomeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CaracteristicaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5024); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTransicao_4001Text(View view) {
		IParser parser = CaracteristicaParserProvider.getParser(CaracteristicaElementTypes.Transicao_4001,
				view.getElement() != null ? view.getElement() : view,
				CaracteristicaVisualIDRegistry.getType(TransicaoEtiquetaEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CaracteristicaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCaracteristicaCaracteristicaFilha_4002Text(View view) {
		IParser parser = CaracteristicaParserProvider.getParser(
				CaracteristicaElementTypes.CaracteristicaCaracteristicaFilha_4002,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CaracteristicaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCaracteristicaVariacoes_4003Text(View view) {
		IParser parser = CaracteristicaParserProvider.getParser(CaracteristicaElementTypes.CaracteristicaVariacoes_4003,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CaracteristicaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCaracteristicaAtributo_4004Text(View view) {
		IParser parser = CaracteristicaParserProvider.getParser(CaracteristicaElementTypes.CaracteristicaAtributo_4004,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CaracteristicaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getVariacaoVariantes_4005Text(View view) {
		IParser parser = CaracteristicaParserProvider.getParser(CaracteristicaElementTypes.VariacaoVariantes_4005,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CaracteristicaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRaizDeContextoEntidadesDeContexto_4006Text(View view) {
		IParser parser = CaracteristicaParserProvider.getParser(
				CaracteristicaElementTypes.RaizDeContextoEntidadesDeContexto_4006,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CaracteristicaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCaracteristicaProdutoCaracteristicaProdutoFilha_4008Text(View view) {
		IParser parser = CaracteristicaParserProvider.getParser(
				CaracteristicaElementTypes.CaracteristicaProdutoCaracteristicaProdutoFilha_4008,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CaracteristicaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCaracteristicaProdutoAtributoProduto_4009Text(View view) {
		IParser parser = CaracteristicaParserProvider.getParser(
				CaracteristicaElementTypes.CaracteristicaProdutoAtributoProduto_4009,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CaracteristicaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getVariacaoProdutoVariantesProduto_4010Text(View view) {
		IParser parser = CaracteristicaParserProvider.getParser(
				CaracteristicaElementTypes.VariacaoProdutoVariantesProduto_4010,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CaracteristicaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProdutoLinhaDoProduto_4011Text(View view) {
		IParser parser = CaracteristicaParserProvider.getParser(CaracteristicaElementTypes.ProdutoLinhaDoProduto_4011,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CaracteristicaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRegraDeComposicaoAntecedente_4012Text(View view) {
		IParser parser = CaracteristicaParserProvider.getParser(
				CaracteristicaElementTypes.RegraDeComposicaoAntecedente_4012,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CaracteristicaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRegraDeComposicaoConsequente_4013Text(View view) {
		IParser parser = CaracteristicaParserProvider.getParser(
				CaracteristicaElementTypes.RegraDeComposicaoConsequente_4013,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CaracteristicaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRegraDeContextoEvento_4014Text(View view) {
		IParser parser = CaracteristicaParserProvider.getParser(CaracteristicaElementTypes.RegraDeContextoEvento_4014,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CaracteristicaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRegraDeContextoAcao_4015Text(View view) {
		IParser parser = CaracteristicaParserProvider.getParser(CaracteristicaElementTypes.RegraDeContextoAcao_4015,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CaracteristicaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEventoLogicoLadoDireitoEvento_4016Text(View view) {
		IParser parser = CaracteristicaParserProvider.getParser(
				CaracteristicaElementTypes.EventoLogicoLadoDireitoEvento_4016,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CaracteristicaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEventoLogicoLadoEsquerdoEvento_4017Text(View view) {
		IParser parser = CaracteristicaParserProvider.getParser(
				CaracteristicaElementTypes.EventoLogicoLadoEsquerdoEvento_4017,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CaracteristicaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAcaoLogicoLadoEsquerdoAcao_4018Text(View view) {
		IParser parser = CaracteristicaParserProvider.getParser(
				CaracteristicaElementTypes.AcaoLogicoLadoEsquerdoAcao_4018,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CaracteristicaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAcaoLogicoLadoDireitoAcao_4019Text(View view) {
		IParser parser = CaracteristicaParserProvider.getParser(
				CaracteristicaElementTypes.AcaoLogicoLadoDireitoAcao_4019,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CaracteristicaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExpressaoLogicaLadoDireitoComposicao_4020Text(View view) {
		IParser parser = CaracteristicaParserProvider.getParser(
				CaracteristicaElementTypes.ExpressaoLogicaLadoDireitoComposicao_4020,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CaracteristicaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6020); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExpressaoLogicaLadoEsquerdoComposicao_4021Text(View view) {
		IParser parser = CaracteristicaParserProvider.getParser(
				CaracteristicaElementTypes.ExpressaoLogicaLadoEsquerdoComposicao_4021,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CaracteristicaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEntidadeDeContextoInformacoesDeContexto_4023Text(View view) {
		IParser parser = CaracteristicaParserProvider.getParser(
				CaracteristicaElementTypes.EntidadeDeContextoInformacoesDeContexto_4023,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CaracteristicaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6023); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCaracteristicaElementosExternos_4024Text(View view) {
		IParser parser = CaracteristicaParserProvider.getParser(
				CaracteristicaElementTypes.CaracteristicaElementosExternos_4024,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CaracteristicaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6024); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return LPSEditPart.MODEL_ID.equals(CaracteristicaVisualIDRegistry.getModelID(view));
	}

}
