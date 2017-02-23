/*
 * 
 */
package caracteristica.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import org.eclipse.gmf.tooling.runtime.parsers.EnumParser;
import caracteristica.CaracteristicaPackage;
import caracteristica.diagram.edit.parts.AtributoNomeEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaAgrupadaNomeEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaMandatoriaNomeEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaOpcionalNomeEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaRaizNomeEditPart;
import caracteristica.diagram.edit.parts.ContextoNomeEditPart;
import caracteristica.diagram.edit.parts.EntidadeDeContextoNomeEditPart;
import caracteristica.diagram.edit.parts.ExpressaoLogicaOperadorLogicoEditPart;
import caracteristica.diagram.edit.parts.ExpressaoRelacionalNomeEditPart;
import caracteristica.diagram.edit.parts.InformacaoDeContextoNomeEditPart;
import caracteristica.diagram.edit.parts.LiteralComposicaoNomeEditPart;
import caracteristica.diagram.edit.parts.RaizDeContextoNomeEditPart;
import caracteristica.diagram.edit.parts.RegraDeComposicaoNomeEditPart;
import caracteristica.diagram.edit.parts.VariacaoDoisCardinalidadeMaximaEditPart;
import caracteristica.diagram.edit.parts.VariacaoDoisNomeCardinalidadeMaximaEditPart;
import caracteristica.diagram.parsers.MessageFormatParser;
import caracteristica.diagram.part.CaracteristicaVisualIDRegistry;

/**
 * @generated
 */
public class CaracteristicaParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser caracteristicaOpcionalNome_5001Parser;

	/**
	 * @generated
	 */
	private IParser getCaracteristicaOpcionalNome_5001Parser() {
		if (caracteristicaOpcionalNome_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { CaracteristicaPackage.eINSTANCE
					.getElemento_Nome() };
			MessageFormatParser parser = new MessageFormatParser(features);
			caracteristicaOpcionalNome_5001Parser = parser;
		}
		return caracteristicaOpcionalNome_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser caracteristicaAgrupadaNome_5034Parser;

	/**
	 * @generated
	 */
	private IParser getCaracteristicaAgrupadaNome_5034Parser() {
		if (caracteristicaAgrupadaNome_5034Parser == null) {
			EAttribute[] features = new EAttribute[] { CaracteristicaPackage.eINSTANCE
					.getElemento_Nome() };
			MessageFormatParser parser = new MessageFormatParser(features);
			caracteristicaAgrupadaNome_5034Parser = parser;
		}
		return caracteristicaAgrupadaNome_5034Parser;
	}

	/**
	 * @generated
	 */
	private IParser variacaoDoisCardinalidadeMaxima_5002Parser;

	/**
	 * @generated
	 */
	private IParser getVariacaoDoisCardinalidadeMaxima_5002Parser() {
		if (variacaoDoisCardinalidadeMaxima_5002Parser == null) {
			EAttribute editableFeature = CaracteristicaPackage.eINSTANCE
					.getVariacaoDois_CardinalidadeMaxima();
			EnumParser parser = new EnumParser(editableFeature);
			variacaoDoisCardinalidadeMaxima_5002Parser = parser;
		}
		return variacaoDoisCardinalidadeMaxima_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser caracteristicaRaizNome_5003Parser;

	/**
	 * @generated
	 */
	private IParser getCaracteristicaRaizNome_5003Parser() {
		if (caracteristicaRaizNome_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { CaracteristicaPackage.eINSTANCE
					.getElemento_Nome() };
			MessageFormatParser parser = new MessageFormatParser(features);
			caracteristicaRaizNome_5003Parser = parser;
		}
		return caracteristicaRaizNome_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser caracteristicaMandatoriaNome_5004Parser;

	/**
	 * @generated
	 */
	private IParser getCaracteristicaMandatoriaNome_5004Parser() {
		if (caracteristicaMandatoriaNome_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { CaracteristicaPackage.eINSTANCE
					.getElemento_Nome() };
			MessageFormatParser parser = new MessageFormatParser(features);
			caracteristicaMandatoriaNome_5004Parser = parser;
		}
		return caracteristicaMandatoriaNome_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser raizDeContextoNome_5035Parser;

	/**
	 * @generated
	 */
	private IParser getRaizDeContextoNome_5035Parser() {
		if (raizDeContextoNome_5035Parser == null) {
			EAttribute[] features = new EAttribute[] { CaracteristicaPackage.eINSTANCE
					.getElemento_Nome() };
			MessageFormatParser parser = new MessageFormatParser(features);
			raizDeContextoNome_5035Parser = parser;
		}
		return raizDeContextoNome_5035Parser;
	}

	/**
	 * @generated
	 */
	private IParser entidadeDeContextoNome_5036Parser;

	/**
	 * @generated
	 */
	private IParser getEntidadeDeContextoNome_5036Parser() {
		if (entidadeDeContextoNome_5036Parser == null) {
			EAttribute[] features = new EAttribute[] { CaracteristicaPackage.eINSTANCE
					.getElemento_Nome() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Entidade de Contexto {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Entidade de Contexto {0}"); //$NON-NLS-1$
			parser.setEditPattern("Entidade de Contexto {0}"); //$NON-NLS-1$
			entidadeDeContextoNome_5036Parser = parser;
		}
		return entidadeDeContextoNome_5036Parser;
	}

	/**
	 * @generated
	 */
	private IParser informacaoDeContextoNome_5037Parser;

	/**
	 * @generated
	 */
	private IParser getInformacaoDeContextoNome_5037Parser() {
		if (informacaoDeContextoNome_5037Parser == null) {
			EAttribute[] features = new EAttribute[] { CaracteristicaPackage.eINSTANCE
					.getElemento_Nome() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Informação de Contexto: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Informação de Contexto: {0}"); //$NON-NLS-1$
			parser.setEditPattern("Informação de Contexto: {0}"); //$NON-NLS-1$
			informacaoDeContextoNome_5037Parser = parser;
		}
		return informacaoDeContextoNome_5037Parser;
	}

	/**
	 * @generated
	 */
	private IParser expressaoLogicaOperadorLogico_5039Parser;

	/**
	 * @generated
	 */
	private IParser getExpressaoLogicaOperadorLogico_5039Parser() {
		if (expressaoLogicaOperadorLogico_5039Parser == null) {
			EAttribute editableFeature = CaracteristicaPackage.eINSTANCE
					.getExpressaoLogica_OperadorLogico();
			EnumParser parser = new EnumParser(editableFeature);
			expressaoLogicaOperadorLogico_5039Parser = parser;
		}
		return expressaoLogicaOperadorLogico_5039Parser;
	}

	/**
	 * @generated
	 */
	private IParser expressaoRelacionalNome_5040Parser;

	/**
	 * @generated
	 */
	private IParser getExpressaoRelacionalNome_5040Parser() {
		if (expressaoRelacionalNome_5040Parser == null) {
			EAttribute[] features = new EAttribute[] { CaracteristicaPackage.eINSTANCE
					.getExpressao_Nome() };
			MessageFormatParser parser = new MessageFormatParser(features);
			expressaoRelacionalNome_5040Parser = parser;
		}
		return expressaoRelacionalNome_5040Parser;
	}

	/**
	 * @generated
	 */
	private IParser literalComposicaoNome_5041Parser;

	/**
	 * @generated
	 */
	private IParser getLiteralComposicaoNome_5041Parser() {
		if (literalComposicaoNome_5041Parser == null) {
			EAttribute[] features = new EAttribute[] { CaracteristicaPackage.eINSTANCE
					.getExpressao_Nome() };
			MessageFormatParser parser = new MessageFormatParser(features);
			literalComposicaoNome_5041Parser = parser;
		}
		return literalComposicaoNome_5041Parser;
	}

	/**
	 * @generated
	 */
	private IParser atributoNome_5017Parser;

	/**
	 * @generated
	 */
	private IParser getAtributoNome_5017Parser() {
		if (atributoNome_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { CaracteristicaPackage.eINSTANCE
					.getElemento_Nome() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Attribute {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Attribute {0}"); //$NON-NLS-1$
			parser.setEditPattern("Attribute {0}"); //$NON-NLS-1$
			atributoNome_5017Parser = parser;
		}
		return atributoNome_5017Parser;
	}

	/**
	 * @generated
	 */
	private IParser contextoNome_5038Parser;

	/**
	 * @generated
	 */
	private IParser getContextoNome_5038Parser() {
		if (contextoNome_5038Parser == null) {
			EAttribute[] features = new EAttribute[] { CaracteristicaPackage.eINSTANCE
					.getElemento_Nome() };
			MessageFormatParser parser = new MessageFormatParser(features);
			contextoNome_5038Parser = parser;
		}
		return contextoNome_5038Parser;
	}

	/**
	 * @generated
	 */
	private IParser regraDeComposicaoNome_5042Parser;

	/**
	 * @generated
	 */
	private IParser getRegraDeComposicaoNome_5042Parser() {
		if (regraDeComposicaoNome_5042Parser == null) {
			EAttribute[] features = new EAttribute[] { CaracteristicaPackage.eINSTANCE
					.getRegra_Nome() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Composition Rule {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Composition Rule {0}"); //$NON-NLS-1$
			parser.setEditPattern("Composition Rule {0}"); //$NON-NLS-1$
			regraDeComposicaoNome_5042Parser = parser;
		}
		return regraDeComposicaoNome_5042Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case CaracteristicaOpcionalNomeEditPart.VISUAL_ID:
			return getCaracteristicaOpcionalNome_5001Parser();
		case CaracteristicaAgrupadaNomeEditPart.VISUAL_ID:
			return getCaracteristicaAgrupadaNome_5034Parser();

		case VariacaoDoisCardinalidadeMaximaEditPart.VISUAL_ID:
			return getVariacaoDoisCardinalidadeMaxima_5002Parser();
		case CaracteristicaRaizNomeEditPart.VISUAL_ID:
			return getCaracteristicaRaizNome_5003Parser();
		case CaracteristicaMandatoriaNomeEditPart.VISUAL_ID:
			return getCaracteristicaMandatoriaNome_5004Parser();
		case RaizDeContextoNomeEditPart.VISUAL_ID:
			return getRaizDeContextoNome_5035Parser();
		case EntidadeDeContextoNomeEditPart.VISUAL_ID:
			return getEntidadeDeContextoNome_5036Parser();
		case InformacaoDeContextoNomeEditPart.VISUAL_ID:
			return getInformacaoDeContextoNome_5037Parser();

		case ExpressaoLogicaOperadorLogicoEditPart.VISUAL_ID:
			return getExpressaoLogicaOperadorLogico_5039Parser();
		case ExpressaoRelacionalNomeEditPart.VISUAL_ID:
			return getExpressaoRelacionalNome_5040Parser();
		case LiteralComposicaoNomeEditPart.VISUAL_ID:
			return getLiteralComposicaoNome_5041Parser();
		case AtributoNomeEditPart.VISUAL_ID:
			return getAtributoNome_5017Parser();
		case ContextoNomeEditPart.VISUAL_ID:
			return getContextoNome_5038Parser();
		case RegraDeComposicaoNomeEditPart.VISUAL_ID:
			return getRegraDeComposicaoNome_5042Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(CaracteristicaVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(CaracteristicaVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (CaracteristicaElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
