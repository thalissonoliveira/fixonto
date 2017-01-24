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
		paletteContainer.add(createCasoDeTeste6CreationTool());
		paletteContainer.add(createCasoDeUso7CreationTool());
		paletteContainer.add(createVariacaoDois8CreationTool());
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
		paletteContainer.add(createElementosExternos3CreationTool());
		paletteContainer.add(createVariacoes4CreationTool());
		paletteContainer.add(createVariantes5CreationTool());
		return paletteContainer;
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
	private ToolEntry createCasoDeTeste6CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.CasoDeTeste6CreationTool_title,
				Messages.CasoDeTeste6CreationTool_desc, null, null) {
		};
		entry.setId("createCasoDeTeste6CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCasoDeUso7CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.CasoDeUso7CreationTool_title,
				Messages.CasoDeUso7CreationTool_desc, null, null) {
		};
		entry.setId("createCasoDeUso7CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createVariacaoDois8CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.VariacaoDois8CreationTool_title,
				Messages.VariacaoDois8CreationTool_desc,
				Collections
						.singletonList(CaracteristicaElementTypes.VariacaoDois_2002));
		entry.setId("createVariacaoDois8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.VariacaoDois_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAtributo1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Atributo1CreationTool_title,
				Messages.Atributo1CreationTool_desc,
				Collections
						.singletonList(CaracteristicaElementTypes.CaracteristicaAtributo_4004));
		entry.setId("createAtributo1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.CaracteristicaAtributo_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

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
	private ToolEntry createElementosExternos3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ElementosExternos3CreationTool_title,
				Messages.ElementosExternos3CreationTool_desc,
				Collections
						.singletonList(CaracteristicaElementTypes.CaracteristicaElementosExternos_4024));
		entry.setId("createElementosExternos3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.CaracteristicaElementosExternos_4024));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createVariacoes4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Variacoes4CreationTool_title,
				Messages.Variacoes4CreationTool_desc,
				Collections
						.singletonList(CaracteristicaElementTypes.CaracteristicaVariacoes_4003));
		entry.setId("createVariacoes4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.CaracteristicaVariacoes_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createVariantes5CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Variantes5CreationTool_title,
				Messages.Variantes5CreationTool_desc,
				Collections
						.singletonList(CaracteristicaElementTypes.VariacaoVariantes_4005));
		entry.setId("createVariantes5CreationTool"); //$NON-NLS-1$
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
