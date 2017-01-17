/*
 * 
 */
package caracteristica.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import caracteristica.diagram.providers.CaracteristicaElementTypes;

/**
 * @generated
 */
public class CaracteristicaPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	 * Creates "Objects" palette tool group
	 * @generated
	 */
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createAcaoLogico1CreationTool());
		paletteContainer.add(createAtributo2CreationTool());
		paletteContainer.add(createCaracteristicaAgrupada3CreationTool());
		paletteContainer
				.add(createCaracteristicaAgrupadaProduto4CreationTool());
		paletteContainer.add(createCaracteristicaMandatoria5CreationTool());
		paletteContainer.add(createCaracteristicaOpcional6CreationTool());
		paletteContainer.add(createCaracteristicaRaiz7CreationTool());
		paletteContainer.add(createCasoDeTeste8CreationTool());
		paletteContainer.add(createCasoDeUso9CreationTool());
		paletteContainer.add(createDesignar10CreationTool());
		paletteContainer.add(createEntidadeDeContexto11CreationTool());
		paletteContainer.add(createEstado12CreationTool());
		paletteContainer.add(createEventoLogico13CreationTool());
		paletteContainer.add(createEventoRelacional14CreationTool());
		paletteContainer.add(createExpressaoLogica15CreationTool());
		paletteContainer.add(createExpressaoRelacional16CreationTool());
		paletteContainer.add(createInformacaoDeContexto17CreationTool());
		paletteContainer.add(createLiteralAcao18CreationTool());
		paletteContainer.add(createLiteralComposicao19CreationTool());
		paletteContainer.add(createProduto20CreationTool());
		paletteContainer.add(createRaizDeContexto21CreationTool());
		paletteContainer.add(createRegraDeComposicao22CreationTool());
		paletteContainer.add(createRegraDeContexto23CreationTool());
		paletteContainer.add(createSimulacao24CreationTool());
		paletteContainer.add(createVariacaoDois25CreationTool());
		paletteContainer.add(createVariacaoDoisProduto26CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Connections" palette tool group
	 * @generated
	 */
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createAcao1CreationTool());
		paletteContainer.add(createAntecedente2CreationTool());
		paletteContainer.add(createAtributo3CreationTool());
		paletteContainer.add(createCaracteristicaFilha4CreationTool());
		paletteContainer.add(createConsequente5CreationTool());
		paletteContainer.add(createElementosExternos6CreationTool());
		paletteContainer.add(createEntidadesDeContexto7CreationTool());
		paletteContainer.add(createEvento8CreationTool());
		paletteContainer.add(createInformacoesDeContexto9CreationTool());
		paletteContainer.add(createLadoDireitoAcao10CreationTool());
		paletteContainer.add(createLadoDireitoComposicao11CreationTool());
		paletteContainer.add(createLadoDireitoEvento12CreationTool());
		paletteContainer.add(createLadoEsquerdoAcao13CreationTool());
		paletteContainer.add(createLadoEsquerdoComposicao14CreationTool());
		paletteContainer.add(createLadoEsquerdoEvento15CreationTool());
		paletteContainer.add(createLinhaDoProduto16CreationTool());
		paletteContainer.add(createTransicao17CreationTool());
		paletteContainer.add(createVariacoes18CreationTool());
		paletteContainer.add(createVariantes19CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAcaoLogico1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.AcaoLogico1CreationTool_title,
				Messages.AcaoLogico1CreationTool_desc,
				Collections
						.singletonList(CaracteristicaElementTypes.AcaoLogico_2008));
		entry.setId("createAcaoLogico1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.AcaoLogico_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAtributo2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Atributo2CreationTool_title,
				Messages.Atributo2CreationTool_desc,
				Collections
						.singletonList(CaracteristicaElementTypes.Atributo_2017));
		entry.setId("createAtributo2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.Atributo_2017));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCaracteristicaAgrupada3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CaracteristicaAgrupada3CreationTool_title,
				Messages.CaracteristicaAgrupada3CreationTool_desc,
				Collections
						.singletonList(CaracteristicaElementTypes.CaracteristicaAgrupada_2033));
		entry.setId("createCaracteristicaAgrupada3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.CaracteristicaAgrupada_2033));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCaracteristicaAgrupadaProduto4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CaracteristicaAgrupadaProduto4CreationTool_title,
				Messages.CaracteristicaAgrupadaProduto4CreationTool_desc,
				Collections
						.singletonList(CaracteristicaElementTypes.CaracteristicaAgrupadaProduto_2035));
		entry.setId("createCaracteristicaAgrupadaProduto4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.CaracteristicaAgrupadaProduto_2035));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCaracteristicaMandatoria5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CaracteristicaMandatoria5CreationTool_title,
				Messages.CaracteristicaMandatoria5CreationTool_desc,
				Collections
						.singletonList(CaracteristicaElementTypes.CaracteristicaMandatoria_2004));
		entry.setId("createCaracteristicaMandatoria5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.CaracteristicaMandatoria_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCaracteristicaOpcional6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CaracteristicaOpcional6CreationTool_title,
				Messages.CaracteristicaOpcional6CreationTool_desc,
				Collections
						.singletonList(CaracteristicaElementTypes.CaracteristicaOpcional_2001));
		entry.setId("createCaracteristicaOpcional6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.CaracteristicaOpcional_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCaracteristicaRaiz7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CaracteristicaRaiz7CreationTool_title,
				Messages.CaracteristicaRaiz7CreationTool_desc,
				Collections
						.singletonList(CaracteristicaElementTypes.CaracteristicaRaiz_2003));
		entry.setId("createCaracteristicaRaiz7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.CaracteristicaRaiz_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCasoDeTeste8CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CasoDeTeste8CreationTool_title,
				Messages.CasoDeTeste8CreationTool_desc,
				Collections
						.singletonList(CaracteristicaElementTypes.CasoDeTeste_2039));
		entry.setId("createCasoDeTeste8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.CasoDeTeste_2039));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCasoDeUso9CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CasoDeUso9CreationTool_title,
				Messages.CasoDeUso9CreationTool_desc,
				Collections
						.singletonList(CaracteristicaElementTypes.CasoDeUso_2038));
		entry.setId("createCasoDeUso9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.CasoDeUso_2038));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDesignar10CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Designar10CreationTool_title,
				Messages.Designar10CreationTool_desc,
				Collections
						.singletonList(CaracteristicaElementTypes.Designar_2010));
		entry.setId("createDesignar10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.Designar_2010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEntidadeDeContexto11CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.EntidadeDeContexto11CreationTool_title,
				Messages.EntidadeDeContexto11CreationTool_desc,
				Collections
						.singletonList(CaracteristicaElementTypes.EntidadeDeContexto_2028));
		entry.setId("createEntidadeDeContexto11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.EntidadeDeContexto_2028));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEstado12CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Estado12CreationTool_title,
				Messages.Estado12CreationTool_desc,
				Collections
						.singletonList(CaracteristicaElementTypes.Estado_3001));
		entry.setId("createEstado12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.Estado_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEventoLogico13CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.EventoLogico13CreationTool_title,
				Messages.EventoLogico13CreationTool_desc,
				Collections
						.singletonList(CaracteristicaElementTypes.EventoLogico_2006));
		entry.setId("createEventoLogico13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.EventoLogico_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEventoRelacional14CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.EventoRelacional14CreationTool_title,
				Messages.EventoRelacional14CreationTool_desc,
				Collections
						.singletonList(CaracteristicaElementTypes.EventoRelacional_2007));
		entry.setId("createEventoRelacional14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.EventoRelacional_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createExpressaoLogica15CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ExpressaoLogica15CreationTool_title,
				Messages.ExpressaoLogica15CreationTool_desc,
				Collections
						.singletonList(CaracteristicaElementTypes.ExpressaoLogica_2011));
		entry.setId("createExpressaoLogica15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.ExpressaoLogica_2011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createExpressaoRelacional16CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ExpressaoRelacional16CreationTool_title,
				Messages.ExpressaoRelacional16CreationTool_desc,
				Collections
						.singletonList(CaracteristicaElementTypes.ExpressaoRelacional_2012));
		entry.setId("createExpressaoRelacional16CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.ExpressaoRelacional_2012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInformacaoDeContexto17CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.InformacaoDeContexto17CreationTool_title,
				Messages.InformacaoDeContexto17CreationTool_desc,
				Collections
						.singletonList(CaracteristicaElementTypes.InformacaoDeContexto_2029));
		entry.setId("createInformacaoDeContexto17CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.InformacaoDeContexto_2029));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLiteralAcao18CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.LiteralAcao18CreationTool_title,
				Messages.LiteralAcao18CreationTool_desc,
				Collections
						.singletonList(CaracteristicaElementTypes.LiteralAcao_2009));
		entry.setId("createLiteralAcao18CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.LiteralAcao_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLiteralComposicao19CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.LiteralComposicao19CreationTool_title,
				Messages.LiteralComposicao19CreationTool_desc,
				Collections
						.singletonList(CaracteristicaElementTypes.LiteralComposicao_2013));
		entry.setId("createLiteralComposicao19CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.LiteralComposicao_2013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProduto20CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Produto20CreationTool_title,
				Messages.Produto20CreationTool_desc,
				Collections
						.singletonList(CaracteristicaElementTypes.Produto_2005));
		entry.setId("createProduto20CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.Produto_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRaizDeContexto21CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.RaizDeContexto21CreationTool_title,
				Messages.RaizDeContexto21CreationTool_desc,
				Collections
						.singletonList(CaracteristicaElementTypes.RaizDeContexto_2018));
		entry.setId("createRaizDeContexto21CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.RaizDeContexto_2018));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRegraDeComposicao22CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.RegraDeComposicao22CreationTool_title,
				Messages.RegraDeComposicao22CreationTool_desc,
				Collections
						.singletonList(CaracteristicaElementTypes.RegraDeComposicao_2021));
		entry.setId("createRegraDeComposicao22CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.RegraDeComposicao_2021));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRegraDeContexto23CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.RegraDeContexto23CreationTool_title,
				Messages.RegraDeContexto23CreationTool_desc,
				Collections
						.singletonList(CaracteristicaElementTypes.RegraDeContexto_2022));
		entry.setId("createRegraDeContexto23CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.RegraDeContexto_2022));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSimulacao24CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Simulacao24CreationTool_title,
				Messages.Simulacao24CreationTool_desc,
				Collections
						.singletonList(CaracteristicaElementTypes.Simulacao_2024));
		entry.setId("createSimulacao24CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.Simulacao_2024));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createVariacaoDois25CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.VariacaoDois25CreationTool_title,
				Messages.VariacaoDois25CreationTool_desc,
				Collections
						.singletonList(CaracteristicaElementTypes.VariacaoDois_2002));
		entry.setId("createVariacaoDois25CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.VariacaoDois_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createVariacaoDoisProduto26CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.VariacaoDoisProduto26CreationTool_title,
				Messages.VariacaoDoisProduto26CreationTool_desc,
				Collections
						.singletonList(CaracteristicaElementTypes.VariacaoDoisProduto_2027));
		entry.setId("createVariacaoDoisProduto26CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.VariacaoDoisProduto_2027));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAcao1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Acao1CreationTool_title,
				Messages.Acao1CreationTool_desc,
				Collections
						.singletonList(CaracteristicaElementTypes.RegraDeContextoAcao_4015));
		entry.setId("createAcao1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.RegraDeContextoAcao_4015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAntecedente2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Antecedente2CreationTool_title,
				Messages.Antecedente2CreationTool_desc,
				Collections
						.singletonList(CaracteristicaElementTypes.RegraDeComposicaoAntecedente_4012));
		entry.setId("createAntecedente2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.RegraDeComposicaoAntecedente_4012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAtributo3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Atributo3CreationTool_title,
				Messages.Atributo3CreationTool_desc,
				Collections
						.singletonList(CaracteristicaElementTypes.CaracteristicaAtributo_4004));
		entry.setId("createAtributo3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.CaracteristicaAtributo_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCaracteristicaFilha4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.CaracteristicaFilha4CreationTool_title,
				Messages.CaracteristicaFilha4CreationTool_desc,
				Collections
						.singletonList(CaracteristicaElementTypes.CaracteristicaCaracteristicaFilha_4002));
		entry.setId("createCaracteristicaFilha4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.CaracteristicaCaracteristicaFilha_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConsequente5CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Consequente5CreationTool_title,
				Messages.Consequente5CreationTool_desc,
				Collections
						.singletonList(CaracteristicaElementTypes.RegraDeComposicaoConsequente_4013));
		entry.setId("createConsequente5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.RegraDeComposicaoConsequente_4013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createElementosExternos6CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ElementosExternos6CreationTool_title,
				Messages.ElementosExternos6CreationTool_desc,
				Collections
						.singletonList(CaracteristicaElementTypes.ElementoElementosExternos_4027));
		entry.setId("createElementosExternos6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.ElementoElementosExternos_4027));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEntidadesDeContexto7CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.EntidadesDeContexto7CreationTool_title,
				Messages.EntidadesDeContexto7CreationTool_desc,
				Collections
						.singletonList(CaracteristicaElementTypes.RaizDeContextoEntidadesDeContexto_4006));
		entry.setId("createEntidadesDeContexto7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.RaizDeContextoEntidadesDeContexto_4006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEvento8CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Evento8CreationTool_title,
				Messages.Evento8CreationTool_desc,
				Collections
						.singletonList(CaracteristicaElementTypes.RegraDeContextoEvento_4014));
		entry.setId("createEvento8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.RegraDeContextoEvento_4014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInformacoesDeContexto9CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.InformacoesDeContexto9CreationTool_title,
				Messages.InformacoesDeContexto9CreationTool_desc,
				Collections
						.singletonList(CaracteristicaElementTypes.EntidadeDeContextoInformacoesDeContexto_4023));
		entry.setId("createInformacoesDeContexto9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.EntidadeDeContextoInformacoesDeContexto_4023));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLadoDireitoAcao10CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.LadoDireitoAcao10CreationTool_title,
				Messages.LadoDireitoAcao10CreationTool_desc,
				Collections
						.singletonList(CaracteristicaElementTypes.AcaoLogicoLadoDireitoAcao_4019));
		entry.setId("createLadoDireitoAcao10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.AcaoLogicoLadoDireitoAcao_4019));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLadoDireitoComposicao11CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.LadoDireitoComposicao11CreationTool_title,
				Messages.LadoDireitoComposicao11CreationTool_desc,
				Collections
						.singletonList(CaracteristicaElementTypes.ExpressaoLogicaLadoDireitoComposicao_4020));
		entry.setId("createLadoDireitoComposicao11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.ExpressaoLogicaLadoDireitoComposicao_4020));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLadoDireitoEvento12CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.LadoDireitoEvento12CreationTool_title,
				Messages.LadoDireitoEvento12CreationTool_desc,
				Collections
						.singletonList(CaracteristicaElementTypes.EventoLogicoLadoDireitoEvento_4016));
		entry.setId("createLadoDireitoEvento12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.EventoLogicoLadoDireitoEvento_4016));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLadoEsquerdoAcao13CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.LadoEsquerdoAcao13CreationTool_title,
				Messages.LadoEsquerdoAcao13CreationTool_desc,
				Collections
						.singletonList(CaracteristicaElementTypes.AcaoLogicoLadoEsquerdoAcao_4018));
		entry.setId("createLadoEsquerdoAcao13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.AcaoLogicoLadoEsquerdoAcao_4018));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLadoEsquerdoComposicao14CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.LadoEsquerdoComposicao14CreationTool_title,
				Messages.LadoEsquerdoComposicao14CreationTool_desc,
				Collections
						.singletonList(CaracteristicaElementTypes.ExpressaoLogicaLadoEsquerdoComposicao_4021));
		entry.setId("createLadoEsquerdoComposicao14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.ExpressaoLogicaLadoEsquerdoComposicao_4021));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLadoEsquerdoEvento15CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.LadoEsquerdoEvento15CreationTool_title,
				Messages.LadoEsquerdoEvento15CreationTool_desc,
				Collections
						.singletonList(CaracteristicaElementTypes.EventoLogicoLadoEsquerdoEvento_4017));
		entry.setId("createLadoEsquerdoEvento15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.EventoLogicoLadoEsquerdoEvento_4017));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLinhaDoProduto16CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.LinhaDoProduto16CreationTool_title,
				Messages.LinhaDoProduto16CreationTool_desc,
				Collections
						.singletonList(CaracteristicaElementTypes.ProdutoLinhaDoProduto_4011));
		entry.setId("createLinhaDoProduto16CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.ProdutoLinhaDoProduto_4011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTransicao17CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Transicao17CreationTool_title,
				Messages.Transicao17CreationTool_desc,
				Collections
						.singletonList(CaracteristicaElementTypes.Transicao_4001));
		entry.setId("createTransicao17CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.Transicao_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createVariacoes18CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Variacoes18CreationTool_title,
				Messages.Variacoes18CreationTool_desc,
				Collections
						.singletonList(CaracteristicaElementTypes.CaracteristicaVariacoes_4003));
		entry.setId("createVariacoes18CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.CaracteristicaVariacoes_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createVariantes19CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Variantes19CreationTool_title,
				Messages.Variantes19CreationTool_desc,
				Collections
						.singletonList(CaracteristicaElementTypes.VariacaoVariantes_4005));
		entry.setId("createVariantes19CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.VariacaoVariantes_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
