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
import caracteristica.diagram.edit.parts.AcaoLogicoOperadorAcaoLogicoEditPart;
import caracteristica.diagram.edit.parts.AtributoNomeEditPart;
import caracteristica.diagram.edit.parts.AtributoProdutoNomeValorEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaAgrupadaNomeEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaAgrupadaProdutoNomeEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaMandatoriaNomeEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaMandatoriaProdutoNomeEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaOpcionalNomeEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaOpcionalProdutoNomeEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaRaizNomeEditPart;
import caracteristica.diagram.edit.parts.CasoDeTesteNomeEditPart;
import caracteristica.diagram.edit.parts.CasoDeUsoNomeEditPart;
import caracteristica.diagram.edit.parts.DesignarNomeEditPart;
import caracteristica.diagram.edit.parts.EntidadeDeContextoNomeEditPart;
import caracteristica.diagram.edit.parts.EstadoNomeEditPart;
import caracteristica.diagram.edit.parts.EventoLogicoOperadorLogicoEditPart;
import caracteristica.diagram.edit.parts.EventoRelacionalNomeEditPart;
import caracteristica.diagram.edit.parts.ExpressaoLogicaOperadorLogicoEditPart;
import caracteristica.diagram.edit.parts.ExpressaoRelacionalNomeEditPart;
import caracteristica.diagram.edit.parts.InformacaoDeContextoNomeValorEditPart;
import caracteristica.diagram.edit.parts.LiteralAcaoNomeEditPart;
import caracteristica.diagram.edit.parts.LiteralComposicaoNomeEditPart;
import caracteristica.diagram.edit.parts.ProdutoNomeEditPart;
import caracteristica.diagram.edit.parts.RaizDeContextoNomeEditPart;
import caracteristica.diagram.edit.parts.RegraDeComposicaoNomeEditPart;
import caracteristica.diagram.edit.parts.RegraDeContextoNomeEditPart;
import caracteristica.diagram.edit.parts.SimulacaoNomeEditPart;
import caracteristica.diagram.edit.parts.TransicaoEtiquetaEditPart;
import caracteristica.diagram.edit.parts.VariacaoDoisNomeCardinalidadeMaximaEditPart;
import caracteristica.diagram.edit.parts.VariacaoDoisProdutoNomeCardinalidadeMaximaEditPart;
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
	private IParser variacaoDoisNomeCardinalidadeMaxima_5002Parser;

	/**
	 * @generated
	 */
	private IParser getVariacaoDoisNomeCardinalidadeMaxima_5002Parser() {
		if (variacaoDoisNomeCardinalidadeMaxima_5002Parser == null) {
			EAttribute[] features = new EAttribute[] {
					CaracteristicaPackage.eINSTANCE.getElemento_Nome(),
					CaracteristicaPackage.eINSTANCE
							.getVariacaoDois_CardinalidadeMaxima() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Variation {0} : {1} "); //$NON-NLS-1$
			parser.setEditorPattern("Variation {0} : {1} "); //$NON-NLS-1$
			parser.setEditPattern("Variation {0} : {1} "); //$NON-NLS-1$
			variacaoDoisNomeCardinalidadeMaxima_5002Parser = parser;
		}
		return variacaoDoisNomeCardinalidadeMaxima_5002Parser;
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
	private IParser produtoNome_5005Parser;

	/**
	 * @generated
	 */
	private IParser getProdutoNome_5005Parser() {
		if (produtoNome_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { CaracteristicaPackage.eINSTANCE
					.getElementoDeProduto_Nome() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Product: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Product: {0}"); //$NON-NLS-1$
			parser.setEditPattern("Product: {0}"); //$NON-NLS-1$
			produtoNome_5005Parser = parser;
		}
		return produtoNome_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser eventoLogicoOperadorLogico_5006Parser;

	/**
	 * @generated
	 */
	private IParser getEventoLogicoOperadorLogico_5006Parser() {
		if (eventoLogicoOperadorLogico_5006Parser == null) {
			EAttribute editableFeature = CaracteristicaPackage.eINSTANCE
					.getEventoLogico_OperadorLogico();
			EnumParser parser = new EnumParser(editableFeature);
			eventoLogicoOperadorLogico_5006Parser = parser;
		}
		return eventoLogicoOperadorLogico_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser eventoRelacionalNome_5007Parser;

	/**
	 * @generated
	 */
	private IParser getEventoRelacionalNome_5007Parser() {
		if (eventoRelacionalNome_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { CaracteristicaPackage.eINSTANCE
					.getExpressao_Nome() };
			MessageFormatParser parser = new MessageFormatParser(features);
			eventoRelacionalNome_5007Parser = parser;
		}
		return eventoRelacionalNome_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser acaoLogicoOperadorAcaoLogico_5008Parser;

	/**
	 * @generated
	 */
	private IParser getAcaoLogicoOperadorAcaoLogico_5008Parser() {
		if (acaoLogicoOperadorAcaoLogico_5008Parser == null) {
			EAttribute editableFeature = CaracteristicaPackage.eINSTANCE
					.getAcaoLogico_OperadorAcaoLogico();
			EnumParser parser = new EnumParser(editableFeature);
			acaoLogicoOperadorAcaoLogico_5008Parser = parser;
		}
		return acaoLogicoOperadorAcaoLogico_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser literalAcaoNome_5009Parser;

	/**
	 * @generated
	 */
	private IParser getLiteralAcaoNome_5009Parser() {
		if (literalAcaoNome_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { CaracteristicaPackage.eINSTANCE
					.getExpressao_Nome() };
			MessageFormatParser parser = new MessageFormatParser(features);
			literalAcaoNome_5009Parser = parser;
		}
		return literalAcaoNome_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser designarNome_5010Parser;

	/**
	 * @generated
	 */
	private IParser getDesignarNome_5010Parser() {
		if (designarNome_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { CaracteristicaPackage.eINSTANCE
					.getExpressao_Nome() };
			MessageFormatParser parser = new MessageFormatParser(features);
			designarNome_5010Parser = parser;
		}
		return designarNome_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser expressaoLogicaOperadorLogico_5011Parser;

	/**
	 * @generated
	 */
	private IParser getExpressaoLogicaOperadorLogico_5011Parser() {
		if (expressaoLogicaOperadorLogico_5011Parser == null) {
			EAttribute editableFeature = CaracteristicaPackage.eINSTANCE
					.getExpressaoLogica_OperadorLogico();
			EnumParser parser = new EnumParser(editableFeature);
			expressaoLogicaOperadorLogico_5011Parser = parser;
		}
		return expressaoLogicaOperadorLogico_5011Parser;
	}

	/**
	 * @generated
	 */
	private IParser expressaoRelacionalNome_5012Parser;

	/**
	 * @generated
	 */
	private IParser getExpressaoRelacionalNome_5012Parser() {
		if (expressaoRelacionalNome_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { CaracteristicaPackage.eINSTANCE
					.getExpressao_Nome() };
			MessageFormatParser parser = new MessageFormatParser(features);
			expressaoRelacionalNome_5012Parser = parser;
		}
		return expressaoRelacionalNome_5012Parser;
	}

	/**
	 * @generated
	 */
	private IParser literalComposicaoNome_5013Parser;

	/**
	 * @generated
	 */
	private IParser getLiteralComposicaoNome_5013Parser() {
		if (literalComposicaoNome_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { CaracteristicaPackage.eINSTANCE
					.getExpressao_Nome() };
			MessageFormatParser parser = new MessageFormatParser(features);
			literalComposicaoNome_5013Parser = parser;
		}
		return literalComposicaoNome_5013Parser;
	}

	/**
	 * @generated
	 */
	private IParser caracteristicaMandatoriaProdutoNome_5026Parser;

	/**
	 * @generated
	 */
	private IParser getCaracteristicaMandatoriaProdutoNome_5026Parser() {
		if (caracteristicaMandatoriaProdutoNome_5026Parser == null) {
			EAttribute[] features = new EAttribute[] { CaracteristicaPackage.eINSTANCE
					.getElementoDeProduto_Nome() };
			MessageFormatParser parser = new MessageFormatParser(features);
			caracteristicaMandatoriaProdutoNome_5026Parser = parser;
		}
		return caracteristicaMandatoriaProdutoNome_5026Parser;
	}

	/**
	 * @generated
	 */
	private IParser caracteristicaOpcionalProdutoNome_5027Parser;

	/**
	 * @generated
	 */
	private IParser getCaracteristicaOpcionalProdutoNome_5027Parser() {
		if (caracteristicaOpcionalProdutoNome_5027Parser == null) {
			EAttribute[] features = new EAttribute[] { CaracteristicaPackage.eINSTANCE
					.getElementoDeProduto_Nome() };
			MessageFormatParser parser = new MessageFormatParser(features);
			caracteristicaOpcionalProdutoNome_5027Parser = parser;
		}
		return caracteristicaOpcionalProdutoNome_5027Parser;
	}

	/**
	 * @generated
	 */
	private IParser variacaoDoisProdutoNomeCardinalidadeMaxima_5028Parser;

	/**
	 * @generated
	 */
	private IParser getVariacaoDoisProdutoNomeCardinalidadeMaxima_5028Parser() {
		if (variacaoDoisProdutoNomeCardinalidadeMaxima_5028Parser == null) {
			EAttribute[] features = new EAttribute[] {
					CaracteristicaPackage.eINSTANCE.getElementoDeProduto_Nome(),
					CaracteristicaPackage.eINSTANCE
							.getVariacaoDoisProduto_CardinalidadeMaxima() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Variation {0} : {1} "); //$NON-NLS-1$
			parser.setEditorPattern("Variation {0} : {1} "); //$NON-NLS-1$
			parser.setEditPattern("Variation {0} : {1} "); //$NON-NLS-1$
			variacaoDoisProdutoNomeCardinalidadeMaxima_5028Parser = parser;
		}
		return variacaoDoisProdutoNomeCardinalidadeMaxima_5028Parser;
	}

	/**
	 * @generated
	 */
	private IParser caracteristicaAgrupadaProdutoNome_5036Parser;

	/**
	 * @generated
	 */
	private IParser getCaracteristicaAgrupadaProdutoNome_5036Parser() {
		if (caracteristicaAgrupadaProdutoNome_5036Parser == null) {
			EAttribute[] features = new EAttribute[] { CaracteristicaPackage.eINSTANCE
					.getElementoDeProduto_Nome() };
			MessageFormatParser parser = new MessageFormatParser(features);
			caracteristicaAgrupadaProdutoNome_5036Parser = parser;
		}
		return caracteristicaAgrupadaProdutoNome_5036Parser;
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
	private IParser raizDeContextoNome_5018Parser;

	/**
	 * @generated
	 */
	private IParser getRaizDeContextoNome_5018Parser() {
		if (raizDeContextoNome_5018Parser == null) {
			EAttribute[] features = new EAttribute[] { CaracteristicaPackage.eINSTANCE
					.getElemento_Nome() };
			MessageFormatParser parser = new MessageFormatParser(features);
			raizDeContextoNome_5018Parser = parser;
		}
		return raizDeContextoNome_5018Parser;
	}

	/**
	 * @generated
	 */
	private IParser entidadeDeContextoNome_5029Parser;

	/**
	 * @generated
	 */
	private IParser getEntidadeDeContextoNome_5029Parser() {
		if (entidadeDeContextoNome_5029Parser == null) {
			EAttribute[] features = new EAttribute[] { CaracteristicaPackage.eINSTANCE
					.getElemento_Nome() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Entidade de Contexto {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Entidade de Contexto {0}"); //$NON-NLS-1$
			parser.setEditPattern("Entidade de Contexto {0}"); //$NON-NLS-1$
			entidadeDeContextoNome_5029Parser = parser;
		}
		return entidadeDeContextoNome_5029Parser;
	}

	/**
	 * @generated
	 */
	private IParser informacaoDeContextoNomeValor_5030Parser;

	/**
	 * @generated
	 */
	private IParser getInformacaoDeContextoNomeValor_5030Parser() {
		if (informacaoDeContextoNomeValor_5030Parser == null) {
			EAttribute[] features = new EAttribute[] {
					CaracteristicaPackage.eINSTANCE.getElemento_Nome(),
					CaracteristicaPackage.eINSTANCE
							.getInformacaoDeContexto_Valor() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Informação de Contexto: {0} Valor {1}"); //$NON-NLS-1$
			parser.setEditorPattern("Informação de Contexto: {0} Valor {1}"); //$NON-NLS-1$
			parser.setEditPattern("Informação de Contexto: {0} Valor {1}"); //$NON-NLS-1$
			informacaoDeContextoNomeValor_5030Parser = parser;
		}
		return informacaoDeContextoNomeValor_5030Parser;
	}

	/**
	 * @generated
	 */
	private IParser casoDeUsoNome_5039Parser;

	/**
	 * @generated
	 */
	private IParser getCasoDeUsoNome_5039Parser() {
		if (casoDeUsoNome_5039Parser == null) {
			EAttribute[] features = new EAttribute[] { CaracteristicaPackage.eINSTANCE
					.getElementoExterno_Nome() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Externo {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Externo {0}"); //$NON-NLS-1$
			parser.setEditPattern("Externo {0}"); //$NON-NLS-1$
			casoDeUsoNome_5039Parser = parser;
		}
		return casoDeUsoNome_5039Parser;
	}

	/**
	 * @generated
	 */
	private IParser casoDeTesteNome_5040Parser;

	/**
	 * @generated
	 */
	private IParser getCasoDeTesteNome_5040Parser() {
		if (casoDeTesteNome_5040Parser == null) {
			EAttribute[] features = new EAttribute[] { CaracteristicaPackage.eINSTANCE
					.getElementoExterno_Nome() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Externo {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Externo {0}"); //$NON-NLS-1$
			parser.setEditPattern("Externo {0}"); //$NON-NLS-1$
			casoDeTesteNome_5040Parser = parser;
		}
		return casoDeTesteNome_5040Parser;
	}

	/**
	 * @generated
	 */
	private IParser regraDeComposicaoNome_5021Parser;

	/**
	 * @generated
	 */
	private IParser getRegraDeComposicaoNome_5021Parser() {
		if (regraDeComposicaoNome_5021Parser == null) {
			EAttribute[] features = new EAttribute[] { CaracteristicaPackage.eINSTANCE
					.getRegra_Nome() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Composition Rule {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Composition Rule {0}"); //$NON-NLS-1$
			parser.setEditPattern("Composition Rule {0}"); //$NON-NLS-1$
			regraDeComposicaoNome_5021Parser = parser;
		}
		return regraDeComposicaoNome_5021Parser;
	}

	/**
	 * @generated
	 */
	private IParser regraDeContextoNome_5022Parser;

	/**
	 * @generated
	 */
	private IParser getRegraDeContextoNome_5022Parser() {
		if (regraDeContextoNome_5022Parser == null) {
			EAttribute[] features = new EAttribute[] { CaracteristicaPackage.eINSTANCE
					.getRegra_Nome() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Regra de Contexto {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Regra de Contexto {0}"); //$NON-NLS-1$
			parser.setEditPattern("Regra de Contexto {0}"); //$NON-NLS-1$
			regraDeContextoNome_5022Parser = parser;
		}
		return regraDeContextoNome_5022Parser;
	}

	/**
	 * @generated
	 */
	private IParser atributoProdutoNomeValor_5031Parser;

	/**
	 * @generated
	 */
	private IParser getAtributoProdutoNomeValor_5031Parser() {
		if (atributoProdutoNomeValor_5031Parser == null) {
			EAttribute[] features = new EAttribute[] {
					CaracteristicaPackage.eINSTANCE.getElementoDeProduto_Nome(),
					CaracteristicaPackage.eINSTANCE.getAtributoProduto_Valor() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Attribute {0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("Attribute {0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("Attribute {0}:{1}"); //$NON-NLS-1$
			atributoProdutoNomeValor_5031Parser = parser;
		}
		return atributoProdutoNomeValor_5031Parser;
	}

	/**
	 * @generated
	 */
	private IParser simulacaoNome_5025Parser;

	/**
	 * @generated
	 */
	private IParser getSimulacaoNome_5025Parser() {
		if (simulacaoNome_5025Parser == null) {
			EAttribute[] features = new EAttribute[] { CaracteristicaPackage.eINSTANCE
					.getSimulacao_Nome() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Simulation {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Simulation {0}"); //$NON-NLS-1$
			parser.setEditPattern("Simulation {0}"); //$NON-NLS-1$
			simulacaoNome_5025Parser = parser;
		}
		return simulacaoNome_5025Parser;
	}

	/**
	 * @generated
	 */
	private IParser estadoNome_5024Parser;

	/**
	 * @generated
	 */
	private IParser getEstadoNome_5024Parser() {
		if (estadoNome_5024Parser == null) {
			EAttribute[] features = new EAttribute[] { CaracteristicaPackage.eINSTANCE
					.getEstado_Nome() };
			MessageFormatParser parser = new MessageFormatParser(features);
			estadoNome_5024Parser = parser;
		}
		return estadoNome_5024Parser;
	}

	/**
	 * @generated
	 */
	private IParser transicaoEtiqueta_6001Parser;

	/**
	 * @generated
	 */
	private IParser getTransicaoEtiqueta_6001Parser() {
		if (transicaoEtiqueta_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { CaracteristicaPackage.eINSTANCE
					.getTransicao_Etiqueta() };
			MessageFormatParser parser = new MessageFormatParser(features);
			transicaoEtiqueta_6001Parser = parser;
		}
		return transicaoEtiqueta_6001Parser;
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
		case VariacaoDoisNomeCardinalidadeMaximaEditPart.VISUAL_ID:
			return getVariacaoDoisNomeCardinalidadeMaxima_5002Parser();
		case CaracteristicaRaizNomeEditPart.VISUAL_ID:
			return getCaracteristicaRaizNome_5003Parser();
		case CaracteristicaMandatoriaNomeEditPart.VISUAL_ID:
			return getCaracteristicaMandatoriaNome_5004Parser();
		case ProdutoNomeEditPart.VISUAL_ID:
			return getProdutoNome_5005Parser();

		case EventoLogicoOperadorLogicoEditPart.VISUAL_ID:
			return getEventoLogicoOperadorLogico_5006Parser();
		case EventoRelacionalNomeEditPart.VISUAL_ID:
			return getEventoRelacionalNome_5007Parser();

		case AcaoLogicoOperadorAcaoLogicoEditPart.VISUAL_ID:
			return getAcaoLogicoOperadorAcaoLogico_5008Parser();
		case LiteralAcaoNomeEditPart.VISUAL_ID:
			return getLiteralAcaoNome_5009Parser();
		case DesignarNomeEditPart.VISUAL_ID:
			return getDesignarNome_5010Parser();

		case ExpressaoLogicaOperadorLogicoEditPart.VISUAL_ID:
			return getExpressaoLogicaOperadorLogico_5011Parser();
		case ExpressaoRelacionalNomeEditPart.VISUAL_ID:
			return getExpressaoRelacionalNome_5012Parser();
		case LiteralComposicaoNomeEditPart.VISUAL_ID:
			return getLiteralComposicaoNome_5013Parser();
		case CaracteristicaMandatoriaProdutoNomeEditPart.VISUAL_ID:
			return getCaracteristicaMandatoriaProdutoNome_5026Parser();
		case CaracteristicaOpcionalProdutoNomeEditPart.VISUAL_ID:
			return getCaracteristicaOpcionalProdutoNome_5027Parser();
		case VariacaoDoisProdutoNomeCardinalidadeMaximaEditPart.VISUAL_ID:
			return getVariacaoDoisProdutoNomeCardinalidadeMaxima_5028Parser();
		case CaracteristicaAgrupadaProdutoNomeEditPart.VISUAL_ID:
			return getCaracteristicaAgrupadaProdutoNome_5036Parser();
		case AtributoNomeEditPart.VISUAL_ID:
			return getAtributoNome_5017Parser();
		case RaizDeContextoNomeEditPart.VISUAL_ID:
			return getRaizDeContextoNome_5018Parser();
		case EntidadeDeContextoNomeEditPart.VISUAL_ID:
			return getEntidadeDeContextoNome_5029Parser();
		case InformacaoDeContextoNomeValorEditPart.VISUAL_ID:
			return getInformacaoDeContextoNomeValor_5030Parser();
		case CasoDeUsoNomeEditPart.VISUAL_ID:
			return getCasoDeUsoNome_5039Parser();
		case CasoDeTesteNomeEditPart.VISUAL_ID:
			return getCasoDeTesteNome_5040Parser();
		case RegraDeComposicaoNomeEditPart.VISUAL_ID:
			return getRegraDeComposicaoNome_5021Parser();
		case RegraDeContextoNomeEditPart.VISUAL_ID:
			return getRegraDeContextoNome_5022Parser();
		case AtributoProdutoNomeValorEditPart.VISUAL_ID:
			return getAtributoProdutoNomeValor_5031Parser();
		case SimulacaoNomeEditPart.VISUAL_ID:
			return getSimulacaoNome_5025Parser();
		case EstadoNomeEditPart.VISUAL_ID:
			return getEstadoNome_5024Parser();
		case TransicaoEtiquetaEditPart.VISUAL_ID:
			return getTransicaoEtiqueta_6001Parser();
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
