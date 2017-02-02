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
import caracteristica.diagram.edit.parts.AtributoEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaAgrupadaEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaAtributoEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaCaracteristicaFilhaEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaMandatoriaEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaOpcionalEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaRaizEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaVariacoesEditPart;
import caracteristica.diagram.edit.parts.ContextoCaracteristicasExcluirEditPart;
import caracteristica.diagram.edit.parts.ContextoCaracteristicasIncluirEditPart;
import caracteristica.diagram.edit.parts.ContextoEditPart;
import caracteristica.diagram.edit.parts.EntidadeDeContextoEditPart;
import caracteristica.diagram.edit.parts.EntidadeDeContextoInformacoesDeContextoEditPart;
import caracteristica.diagram.edit.parts.InformacaoDeContextoEditPart;
import caracteristica.diagram.edit.parts.LPSEditPart;
import caracteristica.diagram.edit.parts.RaizDeContextoEditPart;
import caracteristica.diagram.edit.parts.RaizDeContextoEntidadesDeContextoEditPart;
import caracteristica.diagram.edit.parts.VariacaoDoisEditPart;
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
			CaracteristicaDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

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
	public static final IElementType CaracteristicaOpcional_2001 = getElementType("caracteristica.diagram.CaracteristicaOpcional_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CaracteristicaAgrupada_2033 = getElementType("caracteristica.diagram.CaracteristicaAgrupada_2033"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType VariacaoDois_2002 = getElementType("caracteristica.diagram.VariacaoDois_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CaracteristicaRaiz_2003 = getElementType("caracteristica.diagram.CaracteristicaRaiz_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CaracteristicaMandatoria_2004 = getElementType("caracteristica.diagram.CaracteristicaMandatoria_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RaizDeContexto_2034 = getElementType("caracteristica.diagram.RaizDeContexto_2034"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EntidadeDeContexto_2035 = getElementType("caracteristica.diagram.EntidadeDeContexto_2035"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InformacaoDeContexto_2036 = getElementType("caracteristica.diagram.InformacaoDeContexto_2036"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Atributo_2017 = getElementType("caracteristica.diagram.Atributo_2017"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Contexto_2037 = getElementType("caracteristica.diagram.Contexto_2037"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CaracteristicaCaracteristicaFilha_4002 = getElementType("caracteristica.diagram.CaracteristicaCaracteristicaFilha_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CaracteristicaVariacoes_4003 = getElementType("caracteristica.diagram.CaracteristicaVariacoes_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CaracteristicaAtributo_4004 = getElementType("caracteristica.diagram.CaracteristicaAtributo_4004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType VariacaoVariantes_4005 = getElementType("caracteristica.diagram.VariacaoVariantes_4005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ContextoCaracteristicasIncluir_4025 = getElementType("caracteristica.diagram.ContextoCaracteristicasIncluir_4025"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ContextoCaracteristicasExcluir_4026 = getElementType("caracteristica.diagram.ContextoCaracteristicasExcluir_4026"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RaizDeContextoEntidadesDeContexto_4027 = getElementType("caracteristica.diagram.RaizDeContextoEntidadesDeContexto_4027"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EntidadeDeContextoInformacoesDeContexto_4028 = getElementType("caracteristica.diagram.EntidadeDeContextoInformacoesDeContexto_4028"); //$NON-NLS-1$

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

			elements.put(CaracteristicaOpcional_2001,
					CaracteristicaPackage.eINSTANCE.getCaracteristicaOpcional());

			elements.put(CaracteristicaAgrupada_2033,
					CaracteristicaPackage.eINSTANCE.getCaracteristicaAgrupada());

			elements.put(VariacaoDois_2002,
					CaracteristicaPackage.eINSTANCE.getVariacaoDois());

			elements.put(CaracteristicaRaiz_2003,
					CaracteristicaPackage.eINSTANCE.getCaracteristicaRaiz());

			elements.put(CaracteristicaMandatoria_2004,
					CaracteristicaPackage.eINSTANCE
							.getCaracteristicaMandatoria());

			elements.put(RaizDeContexto_2034,
					CaracteristicaPackage.eINSTANCE.getRaizDeContexto());

			elements.put(EntidadeDeContexto_2035,
					CaracteristicaPackage.eINSTANCE.getEntidadeDeContexto());

			elements.put(InformacaoDeContexto_2036,
					CaracteristicaPackage.eINSTANCE.getInformacaoDeContexto());

			elements.put(Atributo_2017,
					CaracteristicaPackage.eINSTANCE.getAtributo());

			elements.put(Contexto_2037,
					CaracteristicaPackage.eINSTANCE.getContexto());

			elements.put(CaracteristicaCaracteristicaFilha_4002,
					CaracteristicaPackage.eINSTANCE
							.getCaracteristica_CaracteristicaFilha());

			elements.put(CaracteristicaVariacoes_4003,
					CaracteristicaPackage.eINSTANCE
							.getCaracteristica_Variacoes());

			elements.put(CaracteristicaAtributo_4004,
					CaracteristicaPackage.eINSTANCE
							.getCaracteristica_Atributo());

			elements.put(VariacaoVariantes_4005,
					CaracteristicaPackage.eINSTANCE.getVariacao_Variantes());

			elements.put(ContextoCaracteristicasIncluir_4025,
					CaracteristicaPackage.eINSTANCE
							.getContexto_CaracteristicasIncluir());

			elements.put(ContextoCaracteristicasExcluir_4026,
					CaracteristicaPackage.eINSTANCE
							.getContexto_CaracteristicasExcluir());

			elements.put(RaizDeContextoEntidadesDeContexto_4027,
					CaracteristicaPackage.eINSTANCE
							.getRaizDeContexto_EntidadesDeContexto());

			elements.put(EntidadeDeContextoInformacoesDeContexto_4028,
					CaracteristicaPackage.eINSTANCE
							.getEntidadeDeContexto_InformacoesDeContexto());
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
			KNOWN_ELEMENT_TYPES.add(RaizDeContexto_2034);
			KNOWN_ELEMENT_TYPES.add(EntidadeDeContexto_2035);
			KNOWN_ELEMENT_TYPES.add(InformacaoDeContexto_2036);
			KNOWN_ELEMENT_TYPES.add(Atributo_2017);
			KNOWN_ELEMENT_TYPES.add(Contexto_2037);
			KNOWN_ELEMENT_TYPES.add(CaracteristicaCaracteristicaFilha_4002);
			KNOWN_ELEMENT_TYPES.add(CaracteristicaVariacoes_4003);
			KNOWN_ELEMENT_TYPES.add(CaracteristicaAtributo_4004);
			KNOWN_ELEMENT_TYPES.add(VariacaoVariantes_4005);
			KNOWN_ELEMENT_TYPES.add(ContextoCaracteristicasIncluir_4025);
			KNOWN_ELEMENT_TYPES.add(ContextoCaracteristicasExcluir_4026);
			KNOWN_ELEMENT_TYPES.add(RaizDeContextoEntidadesDeContexto_4027);
			KNOWN_ELEMENT_TYPES
					.add(EntidadeDeContextoInformacoesDeContexto_4028);
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
		case RaizDeContextoEditPart.VISUAL_ID:
			return RaizDeContexto_2034;
		case EntidadeDeContextoEditPart.VISUAL_ID:
			return EntidadeDeContexto_2035;
		case InformacaoDeContextoEditPart.VISUAL_ID:
			return InformacaoDeContexto_2036;
		case AtributoEditPart.VISUAL_ID:
			return Atributo_2017;
		case ContextoEditPart.VISUAL_ID:
			return Contexto_2037;
		case CaracteristicaCaracteristicaFilhaEditPart.VISUAL_ID:
			return CaracteristicaCaracteristicaFilha_4002;
		case CaracteristicaVariacoesEditPart.VISUAL_ID:
			return CaracteristicaVariacoes_4003;
		case CaracteristicaAtributoEditPart.VISUAL_ID:
			return CaracteristicaAtributo_4004;
		case VariacaoVariantesEditPart.VISUAL_ID:
			return VariacaoVariantes_4005;
		case ContextoCaracteristicasIncluirEditPart.VISUAL_ID:
			return ContextoCaracteristicasIncluir_4025;
		case ContextoCaracteristicasExcluirEditPart.VISUAL_ID:
			return ContextoCaracteristicasExcluir_4026;
		case RaizDeContextoEntidadesDeContextoEditPart.VISUAL_ID:
			return RaizDeContextoEntidadesDeContexto_4027;
		case EntidadeDeContextoInformacoesDeContextoEditPart.VISUAL_ID:
			return EntidadeDeContextoInformacoesDeContexto_4028;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return caracteristica.diagram.providers.CaracteristicaElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return caracteristica.diagram.providers.CaracteristicaElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return caracteristica.diagram.providers.CaracteristicaElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
