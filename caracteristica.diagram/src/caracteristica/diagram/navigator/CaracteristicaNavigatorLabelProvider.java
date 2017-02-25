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

import caracteristica.diagram.edit.parts.AtributoEditPart;
import caracteristica.diagram.edit.parts.AtributoNomeEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaAgrupadaEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaAgrupadaNomeEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaAtributoEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaCaracteristicaFilhaEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaMandatoriaEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaMandatoriaNomeEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaOpcionalEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaOpcionalNomeEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaRaizEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaRaizNomeEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaVariacoesEditPart;
import caracteristica.diagram.edit.parts.ContextoCaracteristicasExcluirEditPart;
import caracteristica.diagram.edit.parts.ContextoCaracteristicasIncluirEditPart;
import caracteristica.diagram.edit.parts.ContextoEditPart;
import caracteristica.diagram.edit.parts.ContextoNomeEditPart;
import caracteristica.diagram.edit.parts.EntidadeDeContextoEditPart;
import caracteristica.diagram.edit.parts.EntidadeDeContextoInformacoesDeContextoEditPart;
import caracteristica.diagram.edit.parts.EntidadeDeContextoNomeEditPart;
import caracteristica.diagram.edit.parts.ExpressaoLogicaEditPart;
import caracteristica.diagram.edit.parts.ExpressaoLogicaLadoDireitoComposicaoEditPart;
import caracteristica.diagram.edit.parts.ExpressaoLogicaLadoEsquerdoComposicaoEditPart;
import caracteristica.diagram.edit.parts.ExpressaoLogicaOperadorLogicoEditPart;
import caracteristica.diagram.edit.parts.ExpressaoRelacionalEditPart;
import caracteristica.diagram.edit.parts.ExpressaoRelacionalNomeEditPart;
import caracteristica.diagram.edit.parts.InformacaoDeContextoEditPart;
import caracteristica.diagram.edit.parts.InformacaoDeContextoNomeEditPart;
import caracteristica.diagram.edit.parts.LPSEditPart;
import caracteristica.diagram.edit.parts.LiteralComposicaoEditPart;
import caracteristica.diagram.edit.parts.LiteralComposicaoNomeEditPart;
import caracteristica.diagram.edit.parts.RaizDeContextoEditPart;
import caracteristica.diagram.edit.parts.RaizDeContextoEntidadesDeContextoEditPart;
import caracteristica.diagram.edit.parts.RaizDeContextoNomeEditPart;
import caracteristica.diagram.edit.parts.RegraDeComposicaoAntecedenteEditPart;
import caracteristica.diagram.edit.parts.RegraDeComposicaoConsequenteEditPart;
import caracteristica.diagram.edit.parts.RegraDeComposicaoEditPart;
import caracteristica.diagram.edit.parts.RegraDeComposicaoNomeEditPart;
import caracteristica.diagram.edit.parts.VariacaoDoisCardinalidadeMaximaEditPart;
import caracteristica.diagram.edit.parts.VariacaoDoisEditPart;
import caracteristica.diagram.edit.parts.VariacaoDoisNomeCardinalidadeMaximaEditPart;
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
		case AtributoEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?caracteristica?Atributo", CaracteristicaElementTypes.Atributo_2017); //$NON-NLS-1$
		case CaracteristicaAgrupadaEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?caracteristica?CaracteristicaAgrupada", //$NON-NLS-1$
					CaracteristicaElementTypes.CaracteristicaAgrupada_2033);
		case RaizDeContextoEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?caracteristica?RaizDeContexto", //$NON-NLS-1$
					CaracteristicaElementTypes.RaizDeContexto_2034);
		case EntidadeDeContextoEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?caracteristica?EntidadeDeContexto", //$NON-NLS-1$
					CaracteristicaElementTypes.EntidadeDeContexto_2035);
		case InformacaoDeContextoEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?caracteristica?InformacaoDeContexto", //$NON-NLS-1$
					CaracteristicaElementTypes.InformacaoDeContexto_2036);
		case ContextoEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?caracteristica?Contexto", CaracteristicaElementTypes.Contexto_2037); //$NON-NLS-1$
		case ExpressaoLogicaEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?caracteristica?ExpressaoLogica", //$NON-NLS-1$
					CaracteristicaElementTypes.ExpressaoLogica_2038);
		case ExpressaoRelacionalEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?caracteristica?ExpressaoRelacional", //$NON-NLS-1$
					CaracteristicaElementTypes.ExpressaoRelacional_2039);
		case LiteralComposicaoEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?caracteristica?LiteralComposicao", //$NON-NLS-1$
					CaracteristicaElementTypes.LiteralComposicao_2040);
		case RegraDeComposicaoEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?caracteristica?RegraDeComposicao", //$NON-NLS-1$
					CaracteristicaElementTypes.RegraDeComposicao_2041);
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
		case ContextoCaracteristicasIncluirEditPart.VISUAL_ID:
			return getImage("Navigator?Link?caracteristica?Contexto?caracteristicasIncluir", //$NON-NLS-1$
					CaracteristicaElementTypes.ContextoCaracteristicasIncluir_4025);
		case ContextoCaracteristicasExcluirEditPart.VISUAL_ID:
			return getImage("Navigator?Link?caracteristica?Contexto?caracteristicasExcluir", //$NON-NLS-1$
					CaracteristicaElementTypes.ContextoCaracteristicasExcluir_4026);
		case RaizDeContextoEntidadesDeContextoEditPart.VISUAL_ID:
			return getImage("Navigator?Link?caracteristica?RaizDeContexto?entidadesDeContexto", //$NON-NLS-1$
					CaracteristicaElementTypes.RaizDeContextoEntidadesDeContexto_4027);
		case EntidadeDeContextoInformacoesDeContextoEditPart.VISUAL_ID:
			return getImage("Navigator?Link?caracteristica?EntidadeDeContexto?informacoesDeContexto", //$NON-NLS-1$
					CaracteristicaElementTypes.EntidadeDeContextoInformacoesDeContexto_4028);
		case RegraDeComposicaoAntecedenteEditPart.VISUAL_ID:
			return getImage("Navigator?Link?caracteristica?RegraDeComposicao?antecedente", //$NON-NLS-1$
					CaracteristicaElementTypes.RegraDeComposicaoAntecedente_4029);
		case RegraDeComposicaoConsequenteEditPart.VISUAL_ID:
			return getImage("Navigator?Link?caracteristica?RegraDeComposicao?consequente", //$NON-NLS-1$
					CaracteristicaElementTypes.RegraDeComposicaoConsequente_4030);
		case ExpressaoLogicaLadoDireitoComposicaoEditPart.VISUAL_ID:
			return getImage("Navigator?Link?caracteristica?ExpressaoLogica?ladoDireitoComposicao", //$NON-NLS-1$
					CaracteristicaElementTypes.ExpressaoLogicaLadoDireitoComposicao_4031);
		case ExpressaoLogicaLadoEsquerdoComposicaoEditPart.VISUAL_ID:
			return getImage("Navigator?Link?caracteristica?ExpressaoLogica?ladoEsquerdoComposicao", //$NON-NLS-1$
					CaracteristicaElementTypes.ExpressaoLogicaLadoEsquerdoComposicao_4032);
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
		case AtributoEditPart.VISUAL_ID:
			return getAtributo_2017Text(view);
		case CaracteristicaAgrupadaEditPart.VISUAL_ID:
			return getCaracteristicaAgrupada_2033Text(view);
		case RaizDeContextoEditPart.VISUAL_ID:
			return getRaizDeContexto_2034Text(view);
		case EntidadeDeContextoEditPart.VISUAL_ID:
			return getEntidadeDeContexto_2035Text(view);
		case InformacaoDeContextoEditPart.VISUAL_ID:
			return getInformacaoDeContexto_2036Text(view);
		case ContextoEditPart.VISUAL_ID:
			return getContexto_2037Text(view);
		case ExpressaoLogicaEditPart.VISUAL_ID:
			return getExpressaoLogica_2038Text(view);
		case ExpressaoRelacionalEditPart.VISUAL_ID:
			return getExpressaoRelacional_2039Text(view);
		case LiteralComposicaoEditPart.VISUAL_ID:
			return getLiteralComposicao_2040Text(view);
		case RegraDeComposicaoEditPart.VISUAL_ID:
			return getRegraDeComposicao_2041Text(view);
		case CaracteristicaCaracteristicaFilhaEditPart.VISUAL_ID:
			return getCaracteristicaCaracteristicaFilha_4002Text(view);
		case CaracteristicaVariacoesEditPart.VISUAL_ID:
			return getCaracteristicaVariacoes_4003Text(view);
		case CaracteristicaAtributoEditPart.VISUAL_ID:
			return getCaracteristicaAtributo_4004Text(view);
		case VariacaoVariantesEditPart.VISUAL_ID:
			return getVariacaoVariantes_4005Text(view);
		case ContextoCaracteristicasIncluirEditPart.VISUAL_ID:
			return getContextoCaracteristicasIncluir_4025Text(view);
		case ContextoCaracteristicasExcluirEditPart.VISUAL_ID:
			return getContextoCaracteristicasExcluir_4026Text(view);
		case RaizDeContextoEntidadesDeContextoEditPart.VISUAL_ID:
			return getRaizDeContextoEntidadesDeContexto_4027Text(view);
		case EntidadeDeContextoInformacoesDeContextoEditPart.VISUAL_ID:
			return getEntidadeDeContextoInformacoesDeContexto_4028Text(view);
		case RegraDeComposicaoAntecedenteEditPart.VISUAL_ID:
			return getRegraDeComposicaoAntecedente_4029Text(view);
		case RegraDeComposicaoConsequenteEditPart.VISUAL_ID:
			return getRegraDeComposicaoConsequente_4030Text(view);
		case ExpressaoLogicaLadoDireitoComposicaoEditPart.VISUAL_ID:
			return getExpressaoLogicaLadoDireitoComposicao_4031Text(view);
		case ExpressaoLogicaLadoEsquerdoComposicaoEditPart.VISUAL_ID:
			return getExpressaoLogicaLadoEsquerdoComposicao_4032Text(view);
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
				CaracteristicaVisualIDRegistry.getType(VariacaoDoisCardinalidadeMaximaEditPart.VISUAL_ID));
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
	private String getRaizDeContexto_2034Text(View view) {
		IParser parser = CaracteristicaParserProvider.getParser(CaracteristicaElementTypes.RaizDeContexto_2034,
				view.getElement() != null ? view.getElement() : view,
				CaracteristicaVisualIDRegistry.getType(RaizDeContextoNomeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CaracteristicaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5035); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEntidadeDeContexto_2035Text(View view) {
		IParser parser = CaracteristicaParserProvider.getParser(CaracteristicaElementTypes.EntidadeDeContexto_2035,
				view.getElement() != null ? view.getElement() : view,
				CaracteristicaVisualIDRegistry.getType(EntidadeDeContextoNomeEditPart.VISUAL_ID));
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
	private String getInformacaoDeContexto_2036Text(View view) {
		IParser parser = CaracteristicaParserProvider.getParser(CaracteristicaElementTypes.InformacaoDeContexto_2036,
				view.getElement() != null ? view.getElement() : view,
				CaracteristicaVisualIDRegistry.getType(InformacaoDeContextoNomeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CaracteristicaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5037); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getContexto_2037Text(View view) {
		IParser parser = CaracteristicaParserProvider.getParser(CaracteristicaElementTypes.Contexto_2037,
				view.getElement() != null ? view.getElement() : view,
				CaracteristicaVisualIDRegistry.getType(ContextoNomeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CaracteristicaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5038); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExpressaoLogica_2038Text(View view) {
		IParser parser = CaracteristicaParserProvider.getParser(CaracteristicaElementTypes.ExpressaoLogica_2038,
				view.getElement() != null ? view.getElement() : view,
				CaracteristicaVisualIDRegistry.getType(ExpressaoLogicaOperadorLogicoEditPart.VISUAL_ID));
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
	private String getExpressaoRelacional_2039Text(View view) {
		IParser parser = CaracteristicaParserProvider.getParser(CaracteristicaElementTypes.ExpressaoRelacional_2039,
				view.getElement() != null ? view.getElement() : view,
				CaracteristicaVisualIDRegistry.getType(ExpressaoRelacionalNomeEditPart.VISUAL_ID));
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
	private String getLiteralComposicao_2040Text(View view) {
		IParser parser = CaracteristicaParserProvider.getParser(CaracteristicaElementTypes.LiteralComposicao_2040,
				view.getElement() != null ? view.getElement() : view,
				CaracteristicaVisualIDRegistry.getType(LiteralComposicaoNomeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CaracteristicaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5041); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRegraDeComposicao_2041Text(View view) {
		IParser parser = CaracteristicaParserProvider.getParser(CaracteristicaElementTypes.RegraDeComposicao_2041,
				view.getElement() != null ? view.getElement() : view,
				CaracteristicaVisualIDRegistry.getType(RegraDeComposicaoNomeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CaracteristicaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5042); //$NON-NLS-1$
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
	private String getContextoCaracteristicasIncluir_4025Text(View view) {
		IParser parser = CaracteristicaParserProvider.getParser(
				CaracteristicaElementTypes.ContextoCaracteristicasIncluir_4025,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CaracteristicaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6025); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getContextoCaracteristicasExcluir_4026Text(View view) {
		IParser parser = CaracteristicaParserProvider.getParser(
				CaracteristicaElementTypes.ContextoCaracteristicasExcluir_4026,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CaracteristicaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6026); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRaizDeContextoEntidadesDeContexto_4027Text(View view) {
		IParser parser = CaracteristicaParserProvider.getParser(
				CaracteristicaElementTypes.RaizDeContextoEntidadesDeContexto_4027,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CaracteristicaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6027); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEntidadeDeContextoInformacoesDeContexto_4028Text(View view) {
		IParser parser = CaracteristicaParserProvider.getParser(
				CaracteristicaElementTypes.EntidadeDeContextoInformacoesDeContexto_4028,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CaracteristicaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6028); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRegraDeComposicaoAntecedente_4029Text(View view) {
		IParser parser = CaracteristicaParserProvider.getParser(
				CaracteristicaElementTypes.RegraDeComposicaoAntecedente_4029,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CaracteristicaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6029); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRegraDeComposicaoConsequente_4030Text(View view) {
		IParser parser = CaracteristicaParserProvider.getParser(
				CaracteristicaElementTypes.RegraDeComposicaoConsequente_4030,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CaracteristicaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6030); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExpressaoLogicaLadoDireitoComposicao_4031Text(View view) {
		IParser parser = CaracteristicaParserProvider.getParser(
				CaracteristicaElementTypes.ExpressaoLogicaLadoDireitoComposicao_4031,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CaracteristicaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6031); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExpressaoLogicaLadoEsquerdoComposicao_4032Text(View view) {
		IParser parser = CaracteristicaParserProvider.getParser(
				CaracteristicaElementTypes.ExpressaoLogicaLadoEsquerdoComposicao_4032,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CaracteristicaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6032); //$NON-NLS-1$
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
