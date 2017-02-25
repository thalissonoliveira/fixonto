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

import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;
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
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createAtributo1CreationTool());
		paletteContainer.add(createCaracteristicaAgrupada2CreationTool());
		paletteContainer.add(createCaracteristicaMandatoria3CreationTool());
		paletteContainer.add(createCaracteristicaOpcional4CreationTool());
		paletteContainer.add(createCaracteristicaRaiz5CreationTool());
		paletteContainer.add(createContexto6CreationTool());
		paletteContainer.add(createEntidadeDeContexto7CreationTool());
		paletteContainer.add(createExpressaoLogica8CreationTool());
		paletteContainer.add(createExpressaoRelacional9CreationTool());
		paletteContainer.add(createInformacaoDeContexto10CreationTool());
		paletteContainer.add(createLiteralComposicao11CreationTool());
		paletteContainer.add(createRaizDeContexto12CreationTool());
		paletteContainer.add(createRegraDeComposicao13CreationTool());
		paletteContainer.add(createVariacaoDois14CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Connections" palette tool group
	 * @generated
	 */
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createAntecedente1CreationTool());
		paletteContainer.add(createAtributo2CreationTool());
		paletteContainer.add(createCaracteristicaFilha3CreationTool());
		paletteContainer.add(createCaracteristicasExcluir4CreationTool());
		paletteContainer.add(createCaracteristicasIncluir5CreationTool());
		paletteContainer.add(createConsequente6CreationTool());
		paletteContainer.add(createEntidadesDeContexto7CreationTool());
		paletteContainer.add(createInformacoesDeContexto8CreationTool());
		paletteContainer.add(createLadoDireitoComposicao9CreationTool());
		paletteContainer.add(createLadoEsquerdoComposicao10CreationTool());
		paletteContainer.add(createVariacoes11CreationTool());
		paletteContainer.add(createVariantes12CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAtributo1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Atributo1CreationTool_title,
				Messages.Atributo1CreationTool_desc,
				Collections.singletonList(CaracteristicaElementTypes.Atributo_2017));
		entry.setId("createAtributo1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes.getImageDescriptor(CaracteristicaElementTypes.Atributo_2017));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCaracteristicaAgrupada2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.CaracteristicaAgrupada2CreationTool_title,
				Messages.CaracteristicaAgrupada2CreationTool_desc,
				Collections.singletonList(CaracteristicaElementTypes.CaracteristicaAgrupada_2033));
		entry.setId("createCaracteristicaAgrupada2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				CaracteristicaElementTypes.getImageDescriptor(CaracteristicaElementTypes.CaracteristicaAgrupada_2033));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCaracteristicaMandatoria3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.CaracteristicaMandatoria3CreationTool_title,
				Messages.CaracteristicaMandatoria3CreationTool_desc,
				Collections.singletonList(CaracteristicaElementTypes.CaracteristicaMandatoria_2004));
		entry.setId("createCaracteristicaMandatoria3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.CaracteristicaMandatoria_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCaracteristicaOpcional4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.CaracteristicaOpcional4CreationTool_title,
				Messages.CaracteristicaOpcional4CreationTool_desc,
				Collections.singletonList(CaracteristicaElementTypes.CaracteristicaOpcional_2001));
		entry.setId("createCaracteristicaOpcional4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				CaracteristicaElementTypes.getImageDescriptor(CaracteristicaElementTypes.CaracteristicaOpcional_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCaracteristicaRaiz5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.CaracteristicaRaiz5CreationTool_title,
				Messages.CaracteristicaRaiz5CreationTool_desc,
				Collections.singletonList(CaracteristicaElementTypes.CaracteristicaRaiz_2003));
		entry.setId("createCaracteristicaRaiz5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				CaracteristicaElementTypes.getImageDescriptor(CaracteristicaElementTypes.CaracteristicaRaiz_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createContexto6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Contexto6CreationTool_title,
				Messages.Contexto6CreationTool_desc,
				Collections.singletonList(CaracteristicaElementTypes.Contexto_2037));
		entry.setId("createContexto6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes.getImageDescriptor(CaracteristicaElementTypes.Contexto_2037));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEntidadeDeContexto7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.EntidadeDeContexto7CreationTool_title,
				Messages.EntidadeDeContexto7CreationTool_desc,
				Collections.singletonList(CaracteristicaElementTypes.EntidadeDeContexto_2035));
		entry.setId("createEntidadeDeContexto7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				CaracteristicaElementTypes.getImageDescriptor(CaracteristicaElementTypes.EntidadeDeContexto_2035));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createExpressaoLogica8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ExpressaoLogica8CreationTool_title,
				Messages.ExpressaoLogica8CreationTool_desc,
				Collections.singletonList(CaracteristicaElementTypes.ExpressaoLogica_2038));
		entry.setId("createExpressaoLogica8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				CaracteristicaElementTypes.getImageDescriptor(CaracteristicaElementTypes.ExpressaoLogica_2038));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createExpressaoRelacional9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ExpressaoRelacional9CreationTool_title,
				Messages.ExpressaoRelacional9CreationTool_desc,
				Collections.singletonList(CaracteristicaElementTypes.ExpressaoRelacional_2039));
		entry.setId("createExpressaoRelacional9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				CaracteristicaElementTypes.getImageDescriptor(CaracteristicaElementTypes.ExpressaoRelacional_2039));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInformacaoDeContexto10CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.InformacaoDeContexto10CreationTool_title,
				Messages.InformacaoDeContexto10CreationTool_desc,
				Collections.singletonList(CaracteristicaElementTypes.InformacaoDeContexto_2036));
		entry.setId("createInformacaoDeContexto10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				CaracteristicaElementTypes.getImageDescriptor(CaracteristicaElementTypes.InformacaoDeContexto_2036));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLiteralComposicao11CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.LiteralComposicao11CreationTool_title,
				Messages.LiteralComposicao11CreationTool_desc,
				Collections.singletonList(CaracteristicaElementTypes.LiteralComposicao_2040));
		entry.setId("createLiteralComposicao11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				CaracteristicaElementTypes.getImageDescriptor(CaracteristicaElementTypes.LiteralComposicao_2040));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRaizDeContexto12CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.RaizDeContexto12CreationTool_title,
				Messages.RaizDeContexto12CreationTool_desc,
				Collections.singletonList(CaracteristicaElementTypes.RaizDeContexto_2034));
		entry.setId("createRaizDeContexto12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				CaracteristicaElementTypes.getImageDescriptor(CaracteristicaElementTypes.RaizDeContexto_2034));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRegraDeComposicao13CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.RegraDeComposicao13CreationTool_title,
				Messages.RegraDeComposicao13CreationTool_desc,
				Collections.singletonList(CaracteristicaElementTypes.RegraDeComposicao_2041));
		entry.setId("createRegraDeComposicao13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				CaracteristicaElementTypes.getImageDescriptor(CaracteristicaElementTypes.RegraDeComposicao_2041));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createVariacaoDois14CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.VariacaoDois14CreationTool_title,
				Messages.VariacaoDois14CreationTool_desc,
				Collections.singletonList(CaracteristicaElementTypes.VariacaoDois_2002));
		entry.setId("createVariacaoDois14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes.getImageDescriptor(CaracteristicaElementTypes.VariacaoDois_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAntecedente1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Antecedente1CreationTool_title,
				Messages.Antecedente1CreationTool_desc,
				Collections.singletonList(CaracteristicaElementTypes.RegraDeComposicaoAntecedente_4029));
		entry.setId("createAntecedente1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.RegraDeComposicaoAntecedente_4029));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAtributo2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Atributo2CreationTool_title,
				Messages.Atributo2CreationTool_desc,
				Collections.singletonList(CaracteristicaElementTypes.CaracteristicaAtributo_4004));
		entry.setId("createAtributo2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				CaracteristicaElementTypes.getImageDescriptor(CaracteristicaElementTypes.CaracteristicaAtributo_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCaracteristicaFilha3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.CaracteristicaFilha3CreationTool_title,
				Messages.CaracteristicaFilha3CreationTool_desc,
				Collections.singletonList(CaracteristicaElementTypes.CaracteristicaCaracteristicaFilha_4002));
		entry.setId("createCaracteristicaFilha3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.CaracteristicaCaracteristicaFilha_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCaracteristicasExcluir4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.CaracteristicasExcluir4CreationTool_title,
				Messages.CaracteristicasExcluir4CreationTool_desc,
				Collections.singletonList(CaracteristicaElementTypes.ContextoCaracteristicasExcluir_4026));
		entry.setId("createCaracteristicasExcluir4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.ContextoCaracteristicasExcluir_4026));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCaracteristicasIncluir5CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.CaracteristicasIncluir5CreationTool_title,
				Messages.CaracteristicasIncluir5CreationTool_desc,
				Collections.singletonList(CaracteristicaElementTypes.ContextoCaracteristicasIncluir_4025));
		entry.setId("createCaracteristicasIncluir5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.ContextoCaracteristicasIncluir_4025));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConsequente6CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Consequente6CreationTool_title,
				Messages.Consequente6CreationTool_desc,
				Collections.singletonList(CaracteristicaElementTypes.RegraDeComposicaoConsequente_4030));
		entry.setId("createConsequente6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.RegraDeComposicaoConsequente_4030));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEntidadesDeContexto7CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.EntidadesDeContexto7CreationTool_title,
				Messages.EntidadesDeContexto7CreationTool_desc,
				Collections.singletonList(CaracteristicaElementTypes.RaizDeContextoEntidadesDeContexto_4027));
		entry.setId("createEntidadesDeContexto7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.RaizDeContextoEntidadesDeContexto_4027));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInformacoesDeContexto8CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.InformacoesDeContexto8CreationTool_title,
				Messages.InformacoesDeContexto8CreationTool_desc,
				Collections.singletonList(CaracteristicaElementTypes.EntidadeDeContextoInformacoesDeContexto_4028));
		entry.setId("createInformacoesDeContexto8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.EntidadeDeContextoInformacoesDeContexto_4028));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLadoDireitoComposicao9CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.LadoDireitoComposicao9CreationTool_title,
				Messages.LadoDireitoComposicao9CreationTool_desc,
				Collections.singletonList(CaracteristicaElementTypes.ExpressaoLogicaLadoDireitoComposicao_4031));
		entry.setId("createLadoDireitoComposicao9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.ExpressaoLogicaLadoDireitoComposicao_4031));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLadoEsquerdoComposicao10CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.LadoEsquerdoComposicao10CreationTool_title,
				Messages.LadoEsquerdoComposicao10CreationTool_desc,
				Collections.singletonList(CaracteristicaElementTypes.ExpressaoLogicaLadoEsquerdoComposicao_4032));
		entry.setId("createLadoEsquerdoComposicao10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.ExpressaoLogicaLadoEsquerdoComposicao_4032));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createVariacoes11CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Variacoes11CreationTool_title,
				Messages.Variacoes11CreationTool_desc,
				Collections.singletonList(CaracteristicaElementTypes.CaracteristicaVariacoes_4003));
		entry.setId("createVariacoes11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				CaracteristicaElementTypes.getImageDescriptor(CaracteristicaElementTypes.CaracteristicaVariacoes_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createVariantes12CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Variantes12CreationTool_title,
				Messages.Variantes12CreationTool_desc,
				Collections.singletonList(CaracteristicaElementTypes.VariacaoVariantes_4005));
		entry.setId("createVariantes12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				CaracteristicaElementTypes.getImageDescriptor(CaracteristicaElementTypes.VariacaoVariantes_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	//	/**
	//	 * @generated
	//	 */
	//	private ToolEntry createAtributo1CreationTool() {
	//		LinkToolEntry entry = new LinkToolEntry(
	//				Messages.Atributo1CreationTool_title,
	//				Messages.Atributo1CreationTool_desc,
	//				Collections
	//						.singletonList(CaracteristicaElementTypes.CaracteristicaAtributo_4004));
	//		entry.setId("createAtributo1CreationTool"); //$NON-NLS-1$
	//		entry.setSmallIcon(CaracteristicaElementTypes
	//				.getImageDescriptor(CaracteristicaElementTypes.CaracteristicaAtributo_4004));
	//		entry.setLargeIcon(entry.getSmallIcon());
	//		return entry;
	//	}
}
