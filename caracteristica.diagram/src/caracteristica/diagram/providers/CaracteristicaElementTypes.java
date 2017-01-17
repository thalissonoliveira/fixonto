/*
 * 
 */
package caracteristica.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import caracteristica.CaracteristicaPackage;
import caracteristica.diagram.edit.parts.AcaoLogicoEditPart;
import caracteristica.diagram.edit.parts.AcaoLogicoLadoDireitoAcaoEditPart;
import caracteristica.diagram.edit.parts.AcaoLogicoLadoEsquerdoAcaoEditPart;
import caracteristica.diagram.edit.parts.AtributoEditPart;
import caracteristica.diagram.edit.parts.AtributoProdutoEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaAgrupadaEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaAgrupadaProdutoEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaAtributoEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaCaracteristicaFilhaEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaMandatoriaEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaMandatoriaProdutoEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaOpcionalEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaOpcionalProdutoEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaProdutoAtributoProdutoEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaProdutoCaracteristicaProdutoFilhaEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaRaizEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaVariacoesEditPart;
import caracteristica.diagram.edit.parts.CasoDeTesteEditPart;
import caracteristica.diagram.edit.parts.CasoDeUsoEditPart;
import caracteristica.diagram.edit.parts.DesignarEditPart;
import caracteristica.diagram.edit.parts.ElementoElementosExternosEditPart;
import caracteristica.diagram.edit.parts.EntidadeDeContextoEditPart;
import caracteristica.diagram.edit.parts.EntidadeDeContextoInformacoesDeContextoEditPart;
import caracteristica.diagram.edit.parts.EstadoEditPart;
import caracteristica.diagram.edit.parts.EventoLogicoEditPart;
import caracteristica.diagram.edit.parts.EventoLogicoLadoDireitoEventoEditPart;
import caracteristica.diagram.edit.parts.EventoLogicoLadoEsquerdoEventoEditPart;
import caracteristica.diagram.edit.parts.EventoRelacionalEditPart;
import caracteristica.diagram.edit.parts.ExpressaoLogicaEditPart;
import caracteristica.diagram.edit.parts.ExpressaoLogicaLadoDireitoComposicaoEditPart;
import caracteristica.diagram.edit.parts.ExpressaoLogicaLadoEsquerdoComposicaoEditPart;
import caracteristica.diagram.edit.parts.ExpressaoRelacionalEditPart;
import caracteristica.diagram.edit.parts.InformacaoDeContextoEditPart;
import caracteristica.diagram.edit.parts.LPSEditPart;
import caracteristica.diagram.edit.parts.LiteralAcaoEditPart;
import caracteristica.diagram.edit.parts.LiteralComposicaoEditPart;
import caracteristica.diagram.edit.parts.ProdutoEditPart;
import caracteristica.diagram.edit.parts.ProdutoLinhaDoProdutoEditPart;
import caracteristica.diagram.edit.parts.RaizDeContextoEditPart;
import caracteristica.diagram.edit.parts.RaizDeContextoEntidadesDeContextoEditPart;
import caracteristica.diagram.edit.parts.RegraDeComposicaoAntecedenteEditPart;
import caracteristica.diagram.edit.parts.RegraDeComposicaoConsequenteEditPart;
import caracteristica.diagram.edit.parts.RegraDeComposicaoEditPart;
import caracteristica.diagram.edit.parts.RegraDeContextoAcaoEditPart;
import caracteristica.diagram.edit.parts.RegraDeContextoEditPart;
import caracteristica.diagram.edit.parts.RegraDeContextoEventoEditPart;
import caracteristica.diagram.edit.parts.SimulacaoEditPart;
import caracteristica.diagram.edit.parts.TransicaoEditPart;
import caracteristica.diagram.edit.parts.VariacaoDoisEditPart;
import caracteristica.diagram.edit.parts.VariacaoDoisProdutoEditPart;
import caracteristica.diagram.edit.parts.VariacaoProdutoVariantesProdutoEditPart;
import caracteristica.diagram.edit.parts.VariacaoVariantesEditPart;
import caracteristica.diagram.part.CaracteristicaDiagramEditorPlugin;

/**
 * @generated
 */
public class CaracteristicaElementTypes {

	/**
	 * @generated
	 */
	private CaracteristicaElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			CaracteristicaDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType LPS_1000 = getElementType("caracteristica.diagram.LPS_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CaracteristicaOpcional_2001 = getElementType(
			"caracteristica.diagram.CaracteristicaOpcional_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CaracteristicaAgrupada_2033 = getElementType(
			"caracteristica.diagram.CaracteristicaAgrupada_2033"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType VariacaoDois_2002 = getElementType("caracteristica.diagram.VariacaoDois_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CaracteristicaRaiz_2003 = getElementType(
			"caracteristica.diagram.CaracteristicaRaiz_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CaracteristicaMandatoria_2004 = getElementType(
			"caracteristica.diagram.CaracteristicaMandatoria_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Produto_2005 = getElementType("caracteristica.diagram.Produto_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EventoLogico_2006 = getElementType("caracteristica.diagram.EventoLogico_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EventoRelacional_2007 = getElementType(
			"caracteristica.diagram.EventoRelacional_2007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AcaoLogico_2008 = getElementType("caracteristica.diagram.AcaoLogico_2008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LiteralAcao_2009 = getElementType("caracteristica.diagram.LiteralAcao_2009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Designar_2010 = getElementType("caracteristica.diagram.Designar_2010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ExpressaoLogica_2011 = getElementType(
			"caracteristica.diagram.ExpressaoLogica_2011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ExpressaoRelacional_2012 = getElementType(
			"caracteristica.diagram.ExpressaoRelacional_2012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LiteralComposicao_2013 = getElementType(
			"caracteristica.diagram.LiteralComposicao_2013"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CaracteristicaMandatoriaProduto_2025 = getElementType(
			"caracteristica.diagram.CaracteristicaMandatoriaProduto_2025"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CaracteristicaOpcionalProduto_2026 = getElementType(
			"caracteristica.diagram.CaracteristicaOpcionalProduto_2026"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType VariacaoDoisProduto_2027 = getElementType(
			"caracteristica.diagram.VariacaoDoisProduto_2027"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CaracteristicaAgrupadaProduto_2035 = getElementType(
			"caracteristica.diagram.CaracteristicaAgrupadaProduto_2035"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Atributo_2017 = getElementType("caracteristica.diagram.Atributo_2017"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RaizDeContexto_2018 = getElementType("caracteristica.diagram.RaizDeContexto_2018"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EntidadeDeContexto_2028 = getElementType(
			"caracteristica.diagram.EntidadeDeContexto_2028"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InformacaoDeContexto_2029 = getElementType(
			"caracteristica.diagram.InformacaoDeContexto_2029"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CasoDeUso_2038 = getElementType("caracteristica.diagram.CasoDeUso_2038"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CasoDeTeste_2039 = getElementType("caracteristica.diagram.CasoDeTeste_2039"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RegraDeComposicao_2021 = getElementType(
			"caracteristica.diagram.RegraDeComposicao_2021"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RegraDeContexto_2022 = getElementType(
			"caracteristica.diagram.RegraDeContexto_2022"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AtributoProduto_2030 = getElementType(
			"caracteristica.diagram.AtributoProduto_2030"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Simulacao_2024 = getElementType("caracteristica.diagram.Simulacao_2024"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Estado_3001 = getElementType("caracteristica.diagram.Estado_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Transicao_4001 = getElementType("caracteristica.diagram.Transicao_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CaracteristicaElementosExternos_4024 = getElementType(
			"caracteristica.diagram.CaracteristicaElementosExternos_4024"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CaracteristicaCaracteristicaFilha_4002 = getElementType(
			"caracteristica.diagram.CaracteristicaCaracteristicaFilha_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CaracteristicaVariacoes_4003 = getElementType(
			"caracteristica.diagram.CaracteristicaVariacoes_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CaracteristicaAtributo_4004 = getElementType(
			"caracteristica.diagram.CaracteristicaAtributo_4004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType VariacaoVariantes_4005 = getElementType(
			"caracteristica.diagram.VariacaoVariantes_4005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RaizDeContextoEntidadesDeContexto_4006 = getElementType(
			"caracteristica.diagram.RaizDeContextoEntidadesDeContexto_4006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EntidadeDeContextoInformacoesDeContexto_4023 = getElementType(
			"caracteristica.diagram.EntidadeDeContextoInformacoesDeContexto_4023"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CaracteristicaProdutoCaracteristicaProdutoFilha_4008 = getElementType(
			"caracteristica.diagram.CaracteristicaProdutoCaracteristicaProdutoFilha_4008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CaracteristicaProdutoAtributoProduto_4009 = getElementType(
			"caracteristica.diagram.CaracteristicaProdutoAtributoProduto_4009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType VariacaoProdutoVariantesProduto_4010 = getElementType(
			"caracteristica.diagram.VariacaoProdutoVariantesProduto_4010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ProdutoLinhaDoProduto_4011 = getElementType(
			"caracteristica.diagram.ProdutoLinhaDoProduto_4011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RegraDeComposicaoAntecedente_4012 = getElementType(
			"caracteristica.diagram.RegraDeComposicaoAntecedente_4012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RegraDeComposicaoConsequente_4013 = getElementType(
			"caracteristica.diagram.RegraDeComposicaoConsequente_4013"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RegraDeContextoEvento_4014 = getElementType(
			"caracteristica.diagram.RegraDeContextoEvento_4014"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RegraDeContextoAcao_4015 = getElementType(
			"caracteristica.diagram.RegraDeContextoAcao_4015"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EventoLogicoLadoDireitoEvento_4016 = getElementType(
			"caracteristica.diagram.EventoLogicoLadoDireitoEvento_4016"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EventoLogicoLadoEsquerdoEvento_4017 = getElementType(
			"caracteristica.diagram.EventoLogicoLadoEsquerdoEvento_4017"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AcaoLogicoLadoEsquerdoAcao_4018 = getElementType(
			"caracteristica.diagram.AcaoLogicoLadoEsquerdoAcao_4018"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AcaoLogicoLadoDireitoAcao_4019 = getElementType(
			"caracteristica.diagram.AcaoLogicoLadoDireitoAcao_4019"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ExpressaoLogicaLadoDireitoComposicao_4020 = getElementType(
			"caracteristica.diagram.ExpressaoLogicaLadoDireitoComposicao_4020"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ExpressaoLogicaLadoEsquerdoComposicao_4021 = getElementType(
			"caracteristica.diagram.ExpressaoLogicaLadoEsquerdoComposicao_4021"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(LPS_1000, CaracteristicaPackage.eINSTANCE.getLPS());

			elements.put(CaracteristicaOpcional_2001, CaracteristicaPackage.eINSTANCE.getCaracteristicaOpcional());

			elements.put(CaracteristicaAgrupada_2033, CaracteristicaPackage.eINSTANCE.getCaracteristicaAgrupada());

			elements.put(VariacaoDois_2002, CaracteristicaPackage.eINSTANCE.getVariacaoDois());

			elements.put(CaracteristicaRaiz_2003, CaracteristicaPackage.eINSTANCE.getCaracteristicaRaiz());

			elements.put(CaracteristicaMandatoria_2004, CaracteristicaPackage.eINSTANCE.getCaracteristicaMandatoria());

			elements.put(Produto_2005, CaracteristicaPackage.eINSTANCE.getProduto());

			elements.put(EventoLogico_2006, CaracteristicaPackage.eINSTANCE.getEventoLogico());

			elements.put(EventoRelacional_2007, CaracteristicaPackage.eINSTANCE.getEventoRelacional());

			elements.put(AcaoLogico_2008, CaracteristicaPackage.eINSTANCE.getAcaoLogico());

			elements.put(LiteralAcao_2009, CaracteristicaPackage.eINSTANCE.getLiteralAcao());

			elements.put(Designar_2010, CaracteristicaPackage.eINSTANCE.getDesignar());

			elements.put(ExpressaoLogica_2011, CaracteristicaPackage.eINSTANCE.getExpressaoLogica());

			elements.put(ExpressaoRelacional_2012, CaracteristicaPackage.eINSTANCE.getExpressaoRelacional());

			elements.put(LiteralComposicao_2013, CaracteristicaPackage.eINSTANCE.getLiteralComposicao());

			elements.put(CaracteristicaMandatoriaProduto_2025,
					CaracteristicaPackage.eINSTANCE.getCaracteristicaMandatoriaProduto());

			elements.put(CaracteristicaOpcionalProduto_2026,
					CaracteristicaPackage.eINSTANCE.getCaracteristicaOpcionalProduto());

			elements.put(VariacaoDoisProduto_2027, CaracteristicaPackage.eINSTANCE.getVariacaoDoisProduto());

			elements.put(CaracteristicaAgrupadaProduto_2035,
					CaracteristicaPackage.eINSTANCE.getCaracteristicaAgrupadaProduto());

			elements.put(Atributo_2017, CaracteristicaPackage.eINSTANCE.getAtributo());

			elements.put(RaizDeContexto_2018, CaracteristicaPackage.eINSTANCE.getRaizDeContexto());

			elements.put(EntidadeDeContexto_2028, CaracteristicaPackage.eINSTANCE.getEntidadeDeContexto());

			elements.put(InformacaoDeContexto_2029, CaracteristicaPackage.eINSTANCE.getInformacaoDeContexto());

			elements.put(CasoDeUso_2038, CaracteristicaPackage.eINSTANCE.getCasoDeUso());

			elements.put(CasoDeTeste_2039, CaracteristicaPackage.eINSTANCE.getCasoDeTeste());

			elements.put(RegraDeComposicao_2021, CaracteristicaPackage.eINSTANCE.getRegraDeComposicao());

			elements.put(RegraDeContexto_2022, CaracteristicaPackage.eINSTANCE.getRegraDeContexto());

			elements.put(AtributoProduto_2030, CaracteristicaPackage.eINSTANCE.getAtributoProduto());

			elements.put(Simulacao_2024, CaracteristicaPackage.eINSTANCE.getSimulacao());

			elements.put(Estado_3001, CaracteristicaPackage.eINSTANCE.getEstado());

			elements.put(Transicao_4001, CaracteristicaPackage.eINSTANCE.getTransicao());

			elements.put(ElementoElementosExternos_4027,
					CaracteristicaPackage.eINSTANCE.getCaracteristica_ElementosExternos());

			elements.put(CaracteristicaCaracteristicaFilha_4002,
					CaracteristicaPackage.eINSTANCE.getCaracteristica_CaracteristicaFilha());

			elements.put(CaracteristicaVariacoes_4003, CaracteristicaPackage.eINSTANCE.getCaracteristica_Variacoes());

			elements.put(CaracteristicaAtributo_4004, CaracteristicaPackage.eINSTANCE.getCaracteristica_Atributo());

			elements.put(VariacaoVariantes_4005, CaracteristicaPackage.eINSTANCE.getVariacao_Variantes());

			elements.put(RaizDeContextoEntidadesDeContexto_4006,
					CaracteristicaPackage.eINSTANCE.getRaizDeContexto_EntidadesDeContexto());

			elements.put(EntidadeDeContextoInformacoesDeContexto_4023,
					CaracteristicaPackage.eINSTANCE.getEntidadeDeContexto_InformacoesDeContexto());

			elements.put(CaracteristicaProdutoCaracteristicaProdutoFilha_4008,
					CaracteristicaPackage.eINSTANCE.getCaracteristicaProduto_CaracteristicaProdutoFilha());

			elements.put(CaracteristicaProdutoAtributoProduto_4009,
					CaracteristicaPackage.eINSTANCE.getCaracteristicaProduto_AtributoProduto());

			elements.put(VariacaoProdutoVariantesProduto_4010,
					CaracteristicaPackage.eINSTANCE.getVariacaoProduto_VariantesProduto());

			elements.put(ProdutoLinhaDoProduto_4011, CaracteristicaPackage.eINSTANCE.getProduto_LinhaDoProduto());

			elements.put(RegraDeComposicaoAntecedente_4012,
					CaracteristicaPackage.eINSTANCE.getRegraDeComposicao_Antecedente());

			elements.put(RegraDeComposicaoConsequente_4013,
					CaracteristicaPackage.eINSTANCE.getRegraDeComposicao_Consequente());

			elements.put(RegraDeContextoEvento_4014, CaracteristicaPackage.eINSTANCE.getRegraDeContexto_Evento());

			elements.put(RegraDeContextoAcao_4015, CaracteristicaPackage.eINSTANCE.getRegraDeContexto_Acao());

			elements.put(EventoLogicoLadoDireitoEvento_4016,
					CaracteristicaPackage.eINSTANCE.getEventoLogico_LadoDireitoEvento());

			elements.put(EventoLogicoLadoEsquerdoEvento_4017,
					CaracteristicaPackage.eINSTANCE.getEventoLogico_LadoEsquerdoEvento());

			elements.put(AcaoLogicoLadoEsquerdoAcao_4018,
					CaracteristicaPackage.eINSTANCE.getAcaoLogico_LadoEsquerdoAcao());

			elements.put(AcaoLogicoLadoDireitoAcao_4019,
					CaracteristicaPackage.eINSTANCE.getAcaoLogico_LadoDireitoAcao());

			elements.put(ExpressaoLogicaLadoDireitoComposicao_4020,
					CaracteristicaPackage.eINSTANCE.getExpressaoLogica_LadoDireitoComposicao());

			elements.put(ExpressaoLogicaLadoEsquerdoComposicao_4021,
					CaracteristicaPackage.eINSTANCE.getExpressaoLogica_LadoEsquerdoComposicao());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(LPS_1000);
			KNOWN_ELEMENT_TYPES.add(CaracteristicaOpcional_2001);
			KNOWN_ELEMENT_TYPES.add(CaracteristicaAgrupada_2033);
			KNOWN_ELEMENT_TYPES.add(VariacaoDois_2002);
			KNOWN_ELEMENT_TYPES.add(CaracteristicaRaiz_2003);
			KNOWN_ELEMENT_TYPES.add(CaracteristicaMandatoria_2004);
			KNOWN_ELEMENT_TYPES.add(Produto_2005);
			KNOWN_ELEMENT_TYPES.add(EventoLogico_2006);
			KNOWN_ELEMENT_TYPES.add(EventoRelacional_2007);
			KNOWN_ELEMENT_TYPES.add(AcaoLogico_2008);
			KNOWN_ELEMENT_TYPES.add(LiteralAcao_2009);
			KNOWN_ELEMENT_TYPES.add(Designar_2010);
			KNOWN_ELEMENT_TYPES.add(ExpressaoLogica_2011);
			KNOWN_ELEMENT_TYPES.add(ExpressaoRelacional_2012);
			KNOWN_ELEMENT_TYPES.add(LiteralComposicao_2013);
			KNOWN_ELEMENT_TYPES.add(CaracteristicaMandatoriaProduto_2025);
			KNOWN_ELEMENT_TYPES.add(CaracteristicaOpcionalProduto_2026);
			KNOWN_ELEMENT_TYPES.add(VariacaoDoisProduto_2027);
			KNOWN_ELEMENT_TYPES.add(CaracteristicaAgrupadaProduto_2035);
			KNOWN_ELEMENT_TYPES.add(Atributo_2017);
			KNOWN_ELEMENT_TYPES.add(RaizDeContexto_2018);
			KNOWN_ELEMENT_TYPES.add(EntidadeDeContexto_2028);
			KNOWN_ELEMENT_TYPES.add(InformacaoDeContexto_2029);
			KNOWN_ELEMENT_TYPES.add(CasoDeUso_2038);
			KNOWN_ELEMENT_TYPES.add(CasoDeTeste_2039);
			KNOWN_ELEMENT_TYPES.add(RegraDeComposicao_2021);
			KNOWN_ELEMENT_TYPES.add(RegraDeContexto_2022);
			KNOWN_ELEMENT_TYPES.add(AtributoProduto_2030);
			KNOWN_ELEMENT_TYPES.add(Simulacao_2024);
			KNOWN_ELEMENT_TYPES.add(Estado_3001);
			KNOWN_ELEMENT_TYPES.add(Transicao_4001);
			KNOWN_ELEMENT_TYPES.add(ElementoElementosExternos_4027);
			KNOWN_ELEMENT_TYPES.add(CaracteristicaCaracteristicaFilha_4002);
			KNOWN_ELEMENT_TYPES.add(CaracteristicaVariacoes_4003);
			KNOWN_ELEMENT_TYPES.add(CaracteristicaAtributo_4004);
			KNOWN_ELEMENT_TYPES.add(VariacaoVariantes_4005);
			KNOWN_ELEMENT_TYPES.add(RaizDeContextoEntidadesDeContexto_4006);
			KNOWN_ELEMENT_TYPES.add(EntidadeDeContextoInformacoesDeContexto_4023);
			KNOWN_ELEMENT_TYPES.add(CaracteristicaProdutoCaracteristicaProdutoFilha_4008);
			KNOWN_ELEMENT_TYPES.add(CaracteristicaProdutoAtributoProduto_4009);
			KNOWN_ELEMENT_TYPES.add(VariacaoProdutoVariantesProduto_4010);
			KNOWN_ELEMENT_TYPES.add(ProdutoLinhaDoProduto_4011);
			KNOWN_ELEMENT_TYPES.add(RegraDeComposicaoAntecedente_4012);
			KNOWN_ELEMENT_TYPES.add(RegraDeComposicaoConsequente_4013);
			KNOWN_ELEMENT_TYPES.add(RegraDeContextoEvento_4014);
			KNOWN_ELEMENT_TYPES.add(RegraDeContextoAcao_4015);
			KNOWN_ELEMENT_TYPES.add(EventoLogicoLadoDireitoEvento_4016);
			KNOWN_ELEMENT_TYPES.add(EventoLogicoLadoEsquerdoEvento_4017);
			KNOWN_ELEMENT_TYPES.add(AcaoLogicoLadoEsquerdoAcao_4018);
			KNOWN_ELEMENT_TYPES.add(AcaoLogicoLadoDireitoAcao_4019);
			KNOWN_ELEMENT_TYPES.add(ExpressaoLogicaLadoDireitoComposicao_4020);
			KNOWN_ELEMENT_TYPES.add(ExpressaoLogicaLadoEsquerdoComposicao_4021);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case LPSEditPart.VISUAL_ID:
			return LPS_1000;
		case CaracteristicaOpcionalEditPart.VISUAL_ID:
			return CaracteristicaOpcional_2001;
		case CaracteristicaAgrupadaEditPart.VISUAL_ID:
			return CaracteristicaAgrupada_2033;
		case VariacaoDoisEditPart.VISUAL_ID:
			return VariacaoDois_2002;
		case CaracteristicaRaizEditPart.VISUAL_ID:
			return CaracteristicaRaiz_2003;
		case CaracteristicaMandatoriaEditPart.VISUAL_ID:
			return CaracteristicaMandatoria_2004;
		case ProdutoEditPart.VISUAL_ID:
			return Produto_2005;
		case EventoLogicoEditPart.VISUAL_ID:
			return EventoLogico_2006;
		case EventoRelacionalEditPart.VISUAL_ID:
			return EventoRelacional_2007;
		case AcaoLogicoEditPart.VISUAL_ID:
			return AcaoLogico_2008;
		case LiteralAcaoEditPart.VISUAL_ID:
			return LiteralAcao_2009;
		case DesignarEditPart.VISUAL_ID:
			return Designar_2010;
		case ExpressaoLogicaEditPart.VISUAL_ID:
			return ExpressaoLogica_2011;
		case ExpressaoRelacionalEditPart.VISUAL_ID:
			return ExpressaoRelacional_2012;
		case LiteralComposicaoEditPart.VISUAL_ID:
			return LiteralComposicao_2013;
		case CaracteristicaMandatoriaProdutoEditPart.VISUAL_ID:
			return CaracteristicaMandatoriaProduto_2025;
		case CaracteristicaOpcionalProdutoEditPart.VISUAL_ID:
			return CaracteristicaOpcionalProduto_2026;
		case VariacaoDoisProdutoEditPart.VISUAL_ID:
			return VariacaoDoisProduto_2027;
		case CaracteristicaAgrupadaProdutoEditPart.VISUAL_ID:
			return CaracteristicaAgrupadaProduto_2035;
		case AtributoEditPart.VISUAL_ID:
			return Atributo_2017;
		case RaizDeContextoEditPart.VISUAL_ID:
			return RaizDeContexto_2018;
		case EntidadeDeContextoEditPart.VISUAL_ID:
			return EntidadeDeContexto_2028;
		case InformacaoDeContextoEditPart.VISUAL_ID:
			return InformacaoDeContexto_2029;
		case CasoDeUsoEditPart.VISUAL_ID:
			return CasoDeUso_2038;
		case CasoDeTesteEditPart.VISUAL_ID:
			return CasoDeTeste_2039;
		case RegraDeComposicaoEditPart.VISUAL_ID:
			return RegraDeComposicao_2021;
		case RegraDeContextoEditPart.VISUAL_ID:
			return RegraDeContexto_2022;
		case AtributoProdutoEditPart.VISUAL_ID:
			return AtributoProduto_2030;
		case SimulacaoEditPart.VISUAL_ID:
			return Simulacao_2024;
		case EstadoEditPart.VISUAL_ID:
			return Estado_3001;
		case TransicaoEditPart.VISUAL_ID:
			return Transicao_4001;
		case ElementoElementosExternosEditPart.VISUAL_ID:
			return ElementoElementosExternos_4027;
		case CaracteristicaCaracteristicaFilhaEditPart.VISUAL_ID:
			return CaracteristicaCaracteristicaFilha_4002;
		case CaracteristicaVariacoesEditPart.VISUAL_ID:
			return CaracteristicaVariacoes_4003;
		case CaracteristicaAtributoEditPart.VISUAL_ID:
			return CaracteristicaAtributo_4004;
		case VariacaoVariantesEditPart.VISUAL_ID:
			return VariacaoVariantes_4005;
		case RaizDeContextoEntidadesDeContextoEditPart.VISUAL_ID:
			return RaizDeContextoEntidadesDeContexto_4006;
		case EntidadeDeContextoInformacoesDeContextoEditPart.VISUAL_ID:
			return EntidadeDeContextoInformacoesDeContexto_4023;
		case CaracteristicaProdutoCaracteristicaProdutoFilhaEditPart.VISUAL_ID:
			return CaracteristicaProdutoCaracteristicaProdutoFilha_4008;
		case CaracteristicaProdutoAtributoProdutoEditPart.VISUAL_ID:
			return CaracteristicaProdutoAtributoProduto_4009;
		case VariacaoProdutoVariantesProdutoEditPart.VISUAL_ID:
			return VariacaoProdutoVariantesProduto_4010;
		case ProdutoLinhaDoProdutoEditPart.VISUAL_ID:
			return ProdutoLinhaDoProduto_4011;
		case RegraDeComposicaoAntecedenteEditPart.VISUAL_ID:
			return RegraDeComposicaoAntecedente_4012;
		case RegraDeComposicaoConsequenteEditPart.VISUAL_ID:
			return RegraDeComposicaoConsequente_4013;
		case RegraDeContextoEventoEditPart.VISUAL_ID:
			return RegraDeContextoEvento_4014;
		case RegraDeContextoAcaoEditPart.VISUAL_ID:
			return RegraDeContextoAcao_4015;
		case EventoLogicoLadoDireitoEventoEditPart.VISUAL_ID:
			return EventoLogicoLadoDireitoEvento_4016;
		case EventoLogicoLadoEsquerdoEventoEditPart.VISUAL_ID:
			return EventoLogicoLadoEsquerdoEvento_4017;
		case AcaoLogicoLadoEsquerdoAcaoEditPart.VISUAL_ID:
			return AcaoLogicoLadoEsquerdoAcao_4018;
		case AcaoLogicoLadoDireitoAcaoEditPart.VISUAL_ID:
			return AcaoLogicoLadoDireitoAcao_4019;
		case ExpressaoLogicaLadoDireitoComposicaoEditPart.VISUAL_ID:
			return ExpressaoLogicaLadoDireitoComposicao_4020;
		case ExpressaoLogicaLadoEsquerdoComposicaoEditPart.VISUAL_ID:
			return ExpressaoLogicaLadoEsquerdoComposicao_4021;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return caracteristica.diagram.providers.CaracteristicaElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return caracteristica.diagram.providers.CaracteristicaElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return caracteristica.diagram.providers.CaracteristicaElementTypes.getElement(elementTypeAdapter);
		}
	};

}
