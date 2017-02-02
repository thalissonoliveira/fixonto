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
		paletteContainer.add(createAtributo1CreationTool());
		paletteContainer.add(createCaracteristicaAgrupada2CreationTool());
		paletteContainer.add(createCaracteristicaMandatoria3CreationTool());
		paletteContainer.add(createCaracteristicaOpcional4CreationTool());
		paletteContainer.add(createCaracteristicaRaiz5CreationTool());
		paletteContainer.add(createContexto6CreationTool());
		paletteContainer.add(createEntidadeDeContexto7CreationTool());
		paletteContainer.add(createInformacaoDeContexto8CreationTool());
		paletteContainer.add(createRaizDeContexto9CreationTool());
		paletteContainer.add(createVariacaoDois10CreationTool());
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
		paletteContainer.add(createAtributo1CreationTool());
		paletteContainer.add(createCaracteristicaFilha2CreationTool());
		paletteContainer.add(createCaracteristicasExcluir3CreationTool());
		paletteContainer.add(createCaracteristicasIncluir4CreationTool());
		paletteContainer.add(createEntidadesDeContexto5CreationTool());
		paletteContainer.add(createInformacoesDeContexto6CreationTool());
		paletteContainer.add(createVariacoes7CreationTool());
		paletteContainer.add(createVariantes8CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAtributo1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Atributo1CreationTool_title,
				Messages.Atributo1CreationTool_desc,
				Collections
						.singletonList(CaracteristicaElementTypes.Atributo_2017));
		entry.setId("createAtributo1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.Atributo_2017));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCaracteristicaAgrupada2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CaracteristicaAgrupada2CreationTool_title,
				Messages.CaracteristicaAgrupada2CreationTool_desc,
				Collections
						.singletonList(CaracteristicaElementTypes.CaracteristicaAgrupada_2033));
		entry.setId("createCaracteristicaAgrupada2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.CaracteristicaAgrupada_2033));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCaracteristicaMandatoria3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CaracteristicaMandatoria3CreationTool_title,
				Messages.CaracteristicaMandatoria3CreationTool_desc,
				Collections
						.singletonList(CaracteristicaElementTypes.CaracteristicaMandatoria_2004));
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
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CaracteristicaOpcional4CreationTool_title,
				Messages.CaracteristicaOpcional4CreationTool_desc,
				Collections
						.singletonList(CaracteristicaElementTypes.CaracteristicaOpcional_2001));
		entry.setId("createCaracteristicaOpcional4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.CaracteristicaOpcional_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCaracteristicaRaiz5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CaracteristicaRaiz5CreationTool_title,
				Messages.CaracteristicaRaiz5CreationTool_desc,
				Collections
						.singletonList(CaracteristicaElementTypes.CaracteristicaRaiz_2003));
		entry.setId("createCaracteristicaRaiz5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.CaracteristicaRaiz_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createContexto6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Contexto6CreationTool_title,
				Messages.Contexto6CreationTool_desc,
				Collections
						.singletonList(CaracteristicaElementTypes.Contexto_2037));
		entry.setId("createContexto6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.Contexto_2037));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEntidadeDeContexto7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.EntidadeDeContexto7CreationTool_title,
				Messages.EntidadeDeContexto7CreationTool_desc,
				Collections
						.singletonList(CaracteristicaElementTypes.EntidadeDeContexto_2035));
		entry.setId("createEntidadeDeContexto7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.EntidadeDeContexto_2035));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInformacaoDeContexto8CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.InformacaoDeContexto8CreationTool_title,
				Messages.InformacaoDeContexto8CreationTool_desc,
				Collections
						.singletonList(CaracteristicaElementTypes.InformacaoDeContexto_2036));
		entry.setId("createInformacaoDeContexto8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.InformacaoDeContexto_2036));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRaizDeContexto9CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.RaizDeContexto9CreationTool_title,
				Messages.RaizDeContexto9CreationTool_desc,
				Collections
						.singletonList(CaracteristicaElementTypes.RaizDeContexto_2034));
		entry.setId("createRaizDeContexto9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.RaizDeContexto_2034));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createVariacaoDois10CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.VariacaoDois10CreationTool_title,
				Messages.VariacaoDois10CreationTool_desc,
				Collections
						.singletonList(CaracteristicaElementTypes.VariacaoDois_2002));
		entry.setId("createVariacaoDois10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.VariacaoDois_2002));
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

	/**
	 * @generated
	 */
	private ToolEntry createCaracteristicaFilha2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.CaracteristicaFilha2CreationTool_title,
				Messages.CaracteristicaFilha2CreationTool_desc,
				Collections
						.singletonList(CaracteristicaElementTypes.CaracteristicaCaracteristicaFilha_4002));
		entry.setId("createCaracteristicaFilha2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.CaracteristicaCaracteristicaFilha_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCaracteristicasExcluir3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.CaracteristicasExcluir3CreationTool_title,
				Messages.CaracteristicasExcluir3CreationTool_desc,
				Collections
						.singletonList(CaracteristicaElementTypes.ContextoCaracteristicasExcluir_4026));
		entry.setId("createCaracteristicasExcluir3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.ContextoCaracteristicasExcluir_4026));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCaracteristicasIncluir4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.CaracteristicasIncluir4CreationTool_title,
				Messages.CaracteristicasIncluir4CreationTool_desc,
				Collections
						.singletonList(CaracteristicaElementTypes.ContextoCaracteristicasIncluir_4025));
		entry.setId("createCaracteristicasIncluir4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.ContextoCaracteristicasIncluir_4025));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEntidadesDeContexto5CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.EntidadesDeContexto5CreationTool_title,
				Messages.EntidadesDeContexto5CreationTool_desc,
				Collections
						.singletonList(CaracteristicaElementTypes.RaizDeContextoEntidadesDeContexto_4027));
		entry.setId("createEntidadesDeContexto5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.RaizDeContextoEntidadesDeContexto_4027));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInformacoesDeContexto6CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.InformacoesDeContexto6CreationTool_title,
				Messages.InformacoesDeContexto6CreationTool_desc,
				Collections
						.singletonList(CaracteristicaElementTypes.EntidadeDeContextoInformacoesDeContexto_4028));
		entry.setId("createInformacoesDeContexto6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.EntidadeDeContextoInformacoesDeContexto_4028));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createVariacoes7CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Variacoes7CreationTool_title,
				Messages.Variacoes7CreationTool_desc,
				Collections
						.singletonList(CaracteristicaElementTypes.CaracteristicaVariacoes_4003));
		entry.setId("createVariacoes7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.CaracteristicaVariacoes_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createVariantes8CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Variantes8CreationTool_title,
				Messages.Variantes8CreationTool_desc,
				Collections
						.singletonList(CaracteristicaElementTypes.VariacaoVariantes_4005));
		entry.setId("createVariantes8CreationTool"); //$NON-NLS-1$
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
