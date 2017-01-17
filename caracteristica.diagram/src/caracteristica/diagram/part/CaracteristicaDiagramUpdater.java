/*
 * 
 */
package caracteristica.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import caracteristica.Acao;
import caracteristica.AcaoLogico;
import caracteristica.Antecedente;
import caracteristica.Atributo;
import caracteristica.AtributoProduto;
import caracteristica.Caracteristica;
import caracteristica.CaracteristicaAgrupada;
import caracteristica.CaracteristicaAgrupadaProduto;
import caracteristica.CaracteristicaMandatoria;
import caracteristica.CaracteristicaMandatoriaProduto;
import caracteristica.CaracteristicaOpcional;
import caracteristica.CaracteristicaOpcionalProduto;
import caracteristica.CaracteristicaPackage;
import caracteristica.CaracteristicaProduto;
import caracteristica.CaracteristicaRaiz;
import caracteristica.CasoDeTeste;
import caracteristica.CasoDeUso;
import caracteristica.Designar;
import caracteristica.Elemento;
import caracteristica.ElementoDeProduto;
import caracteristica.ElementoExterno;
import caracteristica.EntidadeDeContexto;
import caracteristica.Estado;
import caracteristica.Evento;
import caracteristica.EventoLogico;
import caracteristica.EventoRelacional;
import caracteristica.Expressao;
import caracteristica.ExpressaoLogica;
import caracteristica.ExpressaoRelacional;
import caracteristica.InformacaoDeContexto;
import caracteristica.LiteralAcao;
import caracteristica.LiteralComposicao;
import caracteristica.Produto;
import caracteristica.RaizDeContexto;
import caracteristica.Regra;
import caracteristica.RegraDeComposicao;
import caracteristica.RegraDeContexto;
import caracteristica.Simulacao;
import caracteristica.Transicao;
import caracteristica.Variacao;
import caracteristica.VariacaoDois;
import caracteristica.VariacaoDoisProduto;
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
import caracteristica.diagram.edit.parts.SimulacaoSimulacaoEstadosCompartmentEditPart;
import caracteristica.diagram.edit.parts.TransicaoEditPart;
import caracteristica.diagram.edit.parts.VariacaoDoisEditPart;
import caracteristica.diagram.edit.parts.VariacaoDoisProdutoEditPart;
import caracteristica.diagram.providers.CaracteristicaElementTypes;

/**
 * @generated
 */
public class CaracteristicaDiagramUpdater {

	/**
	 * @generated
	 */
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null
				|| view.getElement().eIsProxy();
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaNodeDescriptor> getSemanticChildren(
			View view) {
		switch (CaracteristicaVisualIDRegistry.getVisualID(view)) {
		case LPSEditPart.VISUAL_ID:
			return getLPS_1000SemanticChildren(view);
		case SimulacaoSimulacaoEstadosCompartmentEditPart.VISUAL_ID:
			return getSimulacaoSimulacaoEstadosCompartment_7001SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaNodeDescriptor> getLPS_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		caracteristica.LPS modelElement = (caracteristica.LPS) view
				.getElement();
		LinkedList<CaracteristicaNodeDescriptor> result = new LinkedList<CaracteristicaNodeDescriptor>();
		for (Iterator<?> it = modelElement.getElementos().iterator(); it
				.hasNext();) {
			Elemento childElement = (Elemento) it.next();
			int visualID = CaracteristicaVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CaracteristicaOpcionalEditPart.VISUAL_ID) {
				result.add(new CaracteristicaNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == CaracteristicaAgrupadaEditPart.VISUAL_ID) {
				result.add(new CaracteristicaNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == VariacaoDoisEditPart.VISUAL_ID) {
				result.add(new CaracteristicaNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == CaracteristicaRaizEditPart.VISUAL_ID) {
				result.add(new CaracteristicaNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == CaracteristicaMandatoriaEditPart.VISUAL_ID) {
				result.add(new CaracteristicaNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == AtributoEditPart.VISUAL_ID) {
				result.add(new CaracteristicaNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == RaizDeContextoEditPart.VISUAL_ID) {
				result.add(new CaracteristicaNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == EntidadeDeContextoEditPart.VISUAL_ID) {
				result.add(new CaracteristicaNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == InformacaoDeContextoEditPart.VISUAL_ID) {
				result.add(new CaracteristicaNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getProdutos().iterator(); it
				.hasNext();) {
			Produto childElement = (Produto) it.next();
			int visualID = CaracteristicaVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ProdutoEditPart.VISUAL_ID) {
				result.add(new CaracteristicaNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getExpressoes().iterator(); it
				.hasNext();) {
			Expressao childElement = (Expressao) it.next();
			int visualID = CaracteristicaVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EventoLogicoEditPart.VISUAL_ID) {
				result.add(new CaracteristicaNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == EventoRelacionalEditPart.VISUAL_ID) {
				result.add(new CaracteristicaNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == AcaoLogicoEditPart.VISUAL_ID) {
				result.add(new CaracteristicaNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == LiteralAcaoEditPart.VISUAL_ID) {
				result.add(new CaracteristicaNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == DesignarEditPart.VISUAL_ID) {
				result.add(new CaracteristicaNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == ExpressaoLogicaEditPart.VISUAL_ID) {
				result.add(new CaracteristicaNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == ExpressaoRelacionalEditPart.VISUAL_ID) {
				result.add(new CaracteristicaNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == LiteralComposicaoEditPart.VISUAL_ID) {
				result.add(new CaracteristicaNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getElementosDeProduto().iterator(); it
				.hasNext();) {
			ElementoDeProduto childElement = (ElementoDeProduto) it.next();
			int visualID = CaracteristicaVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CaracteristicaMandatoriaProdutoEditPart.VISUAL_ID) {
				result.add(new CaracteristicaNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == CaracteristicaOpcionalProdutoEditPart.VISUAL_ID) {
				result.add(new CaracteristicaNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == VariacaoDoisProdutoEditPart.VISUAL_ID) {
				result.add(new CaracteristicaNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == CaracteristicaAgrupadaProdutoEditPart.VISUAL_ID) {
				result.add(new CaracteristicaNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == AtributoProdutoEditPart.VISUAL_ID) {
				result.add(new CaracteristicaNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getExternos().iterator(); it
				.hasNext();) {
			ElementoExterno childElement = (ElementoExterno) it.next();
			int visualID = CaracteristicaVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CasoDeUsoEditPart.VISUAL_ID) {
				result.add(new CaracteristicaNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == CasoDeTesteEditPart.VISUAL_ID) {
				result.add(new CaracteristicaNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getRegras().iterator(); it.hasNext();) {
			Regra childElement = (Regra) it.next();
			int visualID = CaracteristicaVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == RegraDeComposicaoEditPart.VISUAL_ID) {
				result.add(new CaracteristicaNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == RegraDeContextoEditPart.VISUAL_ID) {
				result.add(new CaracteristicaNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getSimulacoes().iterator(); it
				.hasNext();) {
			Simulacao childElement = (Simulacao) it.next();
			int visualID = CaracteristicaVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SimulacaoEditPart.VISUAL_ID) {
				result.add(new CaracteristicaNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaNodeDescriptor> getSimulacaoSimulacaoEstadosCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Simulacao modelElement = (Simulacao) containerView.getElement();
		LinkedList<CaracteristicaNodeDescriptor> result = new LinkedList<CaracteristicaNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEstados().iterator(); it
				.hasNext();) {
			Estado childElement = (Estado) it.next();
			int visualID = CaracteristicaVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EstadoEditPart.VISUAL_ID) {
				result.add(new CaracteristicaNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getContainedLinks(View view) {
		switch (CaracteristicaVisualIDRegistry.getVisualID(view)) {
		case LPSEditPart.VISUAL_ID:
			return getLPS_1000ContainedLinks(view);
		case CaracteristicaOpcionalEditPart.VISUAL_ID:
			return getCaracteristicaOpcional_2001ContainedLinks(view);
		case CaracteristicaAgrupadaEditPart.VISUAL_ID:
			return getCaracteristicaAgrupada_2033ContainedLinks(view);
		case VariacaoDoisEditPart.VISUAL_ID:
			return getVariacaoDois_2002ContainedLinks(view);
		case CaracteristicaRaizEditPart.VISUAL_ID:
			return getCaracteristicaRaiz_2003ContainedLinks(view);
		case CaracteristicaMandatoriaEditPart.VISUAL_ID:
			return getCaracteristicaMandatoria_2004ContainedLinks(view);
		case ProdutoEditPart.VISUAL_ID:
			return getProduto_2005ContainedLinks(view);
		case EventoLogicoEditPart.VISUAL_ID:
			return getEventoLogico_2006ContainedLinks(view);
		case EventoRelacionalEditPart.VISUAL_ID:
			return getEventoRelacional_2007ContainedLinks(view);
		case AcaoLogicoEditPart.VISUAL_ID:
			return getAcaoLogico_2008ContainedLinks(view);
		case LiteralAcaoEditPart.VISUAL_ID:
			return getLiteralAcao_2009ContainedLinks(view);
		case DesignarEditPart.VISUAL_ID:
			return getDesignar_2010ContainedLinks(view);
		case ExpressaoLogicaEditPart.VISUAL_ID:
			return getExpressaoLogica_2011ContainedLinks(view);
		case ExpressaoRelacionalEditPart.VISUAL_ID:
			return getExpressaoRelacional_2012ContainedLinks(view);
		case LiteralComposicaoEditPart.VISUAL_ID:
			return getLiteralComposicao_2013ContainedLinks(view);
		case CaracteristicaMandatoriaProdutoEditPart.VISUAL_ID:
			return getCaracteristicaMandatoriaProduto_2025ContainedLinks(view);
		case CaracteristicaOpcionalProdutoEditPart.VISUAL_ID:
			return getCaracteristicaOpcionalProduto_2026ContainedLinks(view);
		case VariacaoDoisProdutoEditPart.VISUAL_ID:
			return getVariacaoDoisProduto_2027ContainedLinks(view);
		case CaracteristicaAgrupadaProdutoEditPart.VISUAL_ID:
			return getCaracteristicaAgrupadaProduto_2035ContainedLinks(view);
		case AtributoEditPart.VISUAL_ID:
			return getAtributo_2017ContainedLinks(view);
		case RaizDeContextoEditPart.VISUAL_ID:
			return getRaizDeContexto_2018ContainedLinks(view);
		case EntidadeDeContextoEditPart.VISUAL_ID:
			return getEntidadeDeContexto_2028ContainedLinks(view);
		case InformacaoDeContextoEditPart.VISUAL_ID:
			return getInformacaoDeContexto_2029ContainedLinks(view);
		case CasoDeUsoEditPart.VISUAL_ID:
			return getCasoDeUso_2038ContainedLinks(view);
		case CasoDeTesteEditPart.VISUAL_ID:
			return getCasoDeTeste_2039ContainedLinks(view);
		case RegraDeComposicaoEditPart.VISUAL_ID:
			return getRegraDeComposicao_2021ContainedLinks(view);
		case RegraDeContextoEditPart.VISUAL_ID:
			return getRegraDeContexto_2022ContainedLinks(view);
		case AtributoProdutoEditPart.VISUAL_ID:
			return getAtributoProduto_2030ContainedLinks(view);
		case SimulacaoEditPart.VISUAL_ID:
			return getSimulacao_2024ContainedLinks(view);
		case EstadoEditPart.VISUAL_ID:
			return getEstado_3001ContainedLinks(view);
		case TransicaoEditPart.VISUAL_ID:
			return getTransicao_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getIncomingLinks(View view) {
		switch (CaracteristicaVisualIDRegistry.getVisualID(view)) {
		case CaracteristicaOpcionalEditPart.VISUAL_ID:
			return getCaracteristicaOpcional_2001IncomingLinks(view);
		case CaracteristicaAgrupadaEditPart.VISUAL_ID:
			return getCaracteristicaAgrupada_2033IncomingLinks(view);
		case VariacaoDoisEditPart.VISUAL_ID:
			return getVariacaoDois_2002IncomingLinks(view);
		case CaracteristicaRaizEditPart.VISUAL_ID:
			return getCaracteristicaRaiz_2003IncomingLinks(view);
		case CaracteristicaMandatoriaEditPart.VISUAL_ID:
			return getCaracteristicaMandatoria_2004IncomingLinks(view);
		case ProdutoEditPart.VISUAL_ID:
			return getProduto_2005IncomingLinks(view);
		case EventoLogicoEditPart.VISUAL_ID:
			return getEventoLogico_2006IncomingLinks(view);
		case EventoRelacionalEditPart.VISUAL_ID:
			return getEventoRelacional_2007IncomingLinks(view);
		case AcaoLogicoEditPart.VISUAL_ID:
			return getAcaoLogico_2008IncomingLinks(view);
		case LiteralAcaoEditPart.VISUAL_ID:
			return getLiteralAcao_2009IncomingLinks(view);
		case DesignarEditPart.VISUAL_ID:
			return getDesignar_2010IncomingLinks(view);
		case ExpressaoLogicaEditPart.VISUAL_ID:
			return getExpressaoLogica_2011IncomingLinks(view);
		case ExpressaoRelacionalEditPart.VISUAL_ID:
			return getExpressaoRelacional_2012IncomingLinks(view);
		case LiteralComposicaoEditPart.VISUAL_ID:
			return getLiteralComposicao_2013IncomingLinks(view);
		case CaracteristicaMandatoriaProdutoEditPart.VISUAL_ID:
			return getCaracteristicaMandatoriaProduto_2025IncomingLinks(view);
		case CaracteristicaOpcionalProdutoEditPart.VISUAL_ID:
			return getCaracteristicaOpcionalProduto_2026IncomingLinks(view);
		case VariacaoDoisProdutoEditPart.VISUAL_ID:
			return getVariacaoDoisProduto_2027IncomingLinks(view);
		case CaracteristicaAgrupadaProdutoEditPart.VISUAL_ID:
			return getCaracteristicaAgrupadaProduto_2035IncomingLinks(view);
		case AtributoEditPart.VISUAL_ID:
			return getAtributo_2017IncomingLinks(view);
		case RaizDeContextoEditPart.VISUAL_ID:
			return getRaizDeContexto_2018IncomingLinks(view);
		case EntidadeDeContextoEditPart.VISUAL_ID:
			return getEntidadeDeContexto_2028IncomingLinks(view);
		case InformacaoDeContextoEditPart.VISUAL_ID:
			return getInformacaoDeContexto_2029IncomingLinks(view);
		case CasoDeUsoEditPart.VISUAL_ID:
			return getCasoDeUso_2038IncomingLinks(view);
		case CasoDeTesteEditPart.VISUAL_ID:
			return getCasoDeTeste_2039IncomingLinks(view);
		case RegraDeComposicaoEditPart.VISUAL_ID:
			return getRegraDeComposicao_2021IncomingLinks(view);
		case RegraDeContextoEditPart.VISUAL_ID:
			return getRegraDeContexto_2022IncomingLinks(view);
		case AtributoProdutoEditPart.VISUAL_ID:
			return getAtributoProduto_2030IncomingLinks(view);
		case SimulacaoEditPart.VISUAL_ID:
			return getSimulacao_2024IncomingLinks(view);
		case EstadoEditPart.VISUAL_ID:
			return getEstado_3001IncomingLinks(view);
		case TransicaoEditPart.VISUAL_ID:
			return getTransicao_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getOutgoingLinks(View view) {
		switch (CaracteristicaVisualIDRegistry.getVisualID(view)) {
		case CaracteristicaOpcionalEditPart.VISUAL_ID:
			return getCaracteristicaOpcional_2001OutgoingLinks(view);
		case CaracteristicaAgrupadaEditPart.VISUAL_ID:
			return getCaracteristicaAgrupada_2033OutgoingLinks(view);
		case VariacaoDoisEditPart.VISUAL_ID:
			return getVariacaoDois_2002OutgoingLinks(view);
		case CaracteristicaRaizEditPart.VISUAL_ID:
			return getCaracteristicaRaiz_2003OutgoingLinks(view);
		case CaracteristicaMandatoriaEditPart.VISUAL_ID:
			return getCaracteristicaMandatoria_2004OutgoingLinks(view);
		case ProdutoEditPart.VISUAL_ID:
			return getProduto_2005OutgoingLinks(view);
		case EventoLogicoEditPart.VISUAL_ID:
			return getEventoLogico_2006OutgoingLinks(view);
		case EventoRelacionalEditPart.VISUAL_ID:
			return getEventoRelacional_2007OutgoingLinks(view);
		case AcaoLogicoEditPart.VISUAL_ID:
			return getAcaoLogico_2008OutgoingLinks(view);
		case LiteralAcaoEditPart.VISUAL_ID:
			return getLiteralAcao_2009OutgoingLinks(view);
		case DesignarEditPart.VISUAL_ID:
			return getDesignar_2010OutgoingLinks(view);
		case ExpressaoLogicaEditPart.VISUAL_ID:
			return getExpressaoLogica_2011OutgoingLinks(view);
		case ExpressaoRelacionalEditPart.VISUAL_ID:
			return getExpressaoRelacional_2012OutgoingLinks(view);
		case LiteralComposicaoEditPart.VISUAL_ID:
			return getLiteralComposicao_2013OutgoingLinks(view);
		case CaracteristicaMandatoriaProdutoEditPart.VISUAL_ID:
			return getCaracteristicaMandatoriaProduto_2025OutgoingLinks(view);
		case CaracteristicaOpcionalProdutoEditPart.VISUAL_ID:
			return getCaracteristicaOpcionalProduto_2026OutgoingLinks(view);
		case VariacaoDoisProdutoEditPart.VISUAL_ID:
			return getVariacaoDoisProduto_2027OutgoingLinks(view);
		case CaracteristicaAgrupadaProdutoEditPart.VISUAL_ID:
			return getCaracteristicaAgrupadaProduto_2035OutgoingLinks(view);
		case AtributoEditPart.VISUAL_ID:
			return getAtributo_2017OutgoingLinks(view);
		case RaizDeContextoEditPart.VISUAL_ID:
			return getRaizDeContexto_2018OutgoingLinks(view);
		case EntidadeDeContextoEditPart.VISUAL_ID:
			return getEntidadeDeContexto_2028OutgoingLinks(view);
		case InformacaoDeContextoEditPart.VISUAL_ID:
			return getInformacaoDeContexto_2029OutgoingLinks(view);
		case CasoDeUsoEditPart.VISUAL_ID:
			return getCasoDeUso_2038OutgoingLinks(view);
		case CasoDeTesteEditPart.VISUAL_ID:
			return getCasoDeTeste_2039OutgoingLinks(view);
		case RegraDeComposicaoEditPart.VISUAL_ID:
			return getRegraDeComposicao_2021OutgoingLinks(view);
		case RegraDeContextoEditPart.VISUAL_ID:
			return getRegraDeContexto_2022OutgoingLinks(view);
		case AtributoProdutoEditPart.VISUAL_ID:
			return getAtributoProduto_2030OutgoingLinks(view);
		case SimulacaoEditPart.VISUAL_ID:
			return getSimulacao_2024OutgoingLinks(view);
		case EstadoEditPart.VISUAL_ID:
			return getEstado_3001OutgoingLinks(view);
		case TransicaoEditPart.VISUAL_ID:
			return getTransicao_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getLPS_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getCaracteristicaOpcional_2001ContainedLinks(
			View view) {
		CaracteristicaOpcional modelElement = (CaracteristicaOpcional) view
				.getElement();
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Elemento_ElementosExternos_4027(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Caracteristica_CaracteristicaFilha_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Caracteristica_Variacoes_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Caracteristica_Atributo_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getCaracteristicaAgrupada_2033ContainedLinks(
			View view) {
		CaracteristicaAgrupada modelElement = (CaracteristicaAgrupada) view
				.getElement();
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Elemento_ElementosExternos_4027(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Caracteristica_CaracteristicaFilha_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Caracteristica_Variacoes_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Caracteristica_Atributo_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getVariacaoDois_2002ContainedLinks(
			View view) {
		VariacaoDois modelElement = (VariacaoDois) view.getElement();
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Elemento_ElementosExternos_4027(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Caracteristica_CaracteristicaFilha_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Caracteristica_Variacoes_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Caracteristica_Atributo_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getCaracteristicaRaiz_2003ContainedLinks(
			View view) {
		CaracteristicaRaiz modelElement = (CaracteristicaRaiz) view
				.getElement();
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Elemento_ElementosExternos_4027(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Caracteristica_CaracteristicaFilha_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Caracteristica_Variacoes_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Caracteristica_Atributo_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getCaracteristicaMandatoria_2004ContainedLinks(
			View view) {
		CaracteristicaMandatoria modelElement = (CaracteristicaMandatoria) view
				.getElement();
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Elemento_ElementosExternos_4027(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Caracteristica_CaracteristicaFilha_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Caracteristica_Variacoes_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Caracteristica_Atributo_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getProduto_2005ContainedLinks(
			View view) {
		Produto modelElement = (Produto) view.getElement();
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_CaracteristicaProduto_CaracteristicaProdutoFilha_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_CaracteristicaProduto_AtributoProduto_4009(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Produto_LinhaDoProduto_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getEventoLogico_2006ContainedLinks(
			View view) {
		EventoLogico modelElement = (EventoLogico) view.getElement();
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_EventoLogico_LadoDireitoEvento_4016(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_EventoLogico_LadoEsquerdoEvento_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getEventoRelacional_2007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getAcaoLogico_2008ContainedLinks(
			View view) {
		AcaoLogico modelElement = (AcaoLogico) view.getElement();
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AcaoLogico_LadoEsquerdoAcao_4018(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_AcaoLogico_LadoDireitoAcao_4019(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getLiteralAcao_2009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getDesignar_2010ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getExpressaoLogica_2011ContainedLinks(
			View view) {
		ExpressaoLogica modelElement = (ExpressaoLogica) view.getElement();
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ExpressaoLogica_LadoDireitoComposicao_4020(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ExpressaoLogica_LadoEsquerdoComposicao_4021(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getExpressaoRelacional_2012ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getLiteralComposicao_2013ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getCaracteristicaMandatoriaProduto_2025ContainedLinks(
			View view) {
		CaracteristicaMandatoriaProduto modelElement = (CaracteristicaMandatoriaProduto) view
				.getElement();
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_CaracteristicaProduto_CaracteristicaProdutoFilha_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_CaracteristicaProduto_AtributoProduto_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getCaracteristicaOpcionalProduto_2026ContainedLinks(
			View view) {
		CaracteristicaOpcionalProduto modelElement = (CaracteristicaOpcionalProduto) view
				.getElement();
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_CaracteristicaProduto_CaracteristicaProdutoFilha_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_CaracteristicaProduto_AtributoProduto_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getVariacaoDoisProduto_2027ContainedLinks(
			View view) {
		VariacaoDoisProduto modelElement = (VariacaoDoisProduto) view
				.getElement();
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_CaracteristicaProduto_CaracteristicaProdutoFilha_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_CaracteristicaProduto_AtributoProduto_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getCaracteristicaAgrupadaProduto_2035ContainedLinks(
			View view) {
		CaracteristicaAgrupadaProduto modelElement = (CaracteristicaAgrupadaProduto) view
				.getElement();
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_CaracteristicaProduto_CaracteristicaProdutoFilha_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_CaracteristicaProduto_AtributoProduto_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getAtributo_2017ContainedLinks(
			View view) {
		Atributo modelElement = (Atributo) view.getElement();
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Elemento_ElementosExternos_4027(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getRaizDeContexto_2018ContainedLinks(
			View view) {
		RaizDeContexto modelElement = (RaizDeContexto) view.getElement();
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Elemento_ElementosExternos_4027(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_RaizDeContexto_EntidadesDeContexto_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getEntidadeDeContexto_2028ContainedLinks(
			View view) {
		EntidadeDeContexto modelElement = (EntidadeDeContexto) view
				.getElement();
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Elemento_ElementosExternos_4027(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_EntidadeDeContexto_InformacoesDeContexto_4023(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getInformacaoDeContexto_2029ContainedLinks(
			View view) {
		InformacaoDeContexto modelElement = (InformacaoDeContexto) view
				.getElement();
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Elemento_ElementosExternos_4027(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getCasoDeUso_2038ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getCasoDeTeste_2039ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getRegraDeComposicao_2021ContainedLinks(
			View view) {
		RegraDeComposicao modelElement = (RegraDeComposicao) view.getElement();
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_RegraDeComposicao_Antecedente_4012(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_RegraDeComposicao_Consequente_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getRegraDeContexto_2022ContainedLinks(
			View view) {
		RegraDeContexto modelElement = (RegraDeContexto) view.getElement();
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_RegraDeContexto_Evento_4014(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_RegraDeContexto_Acao_4015(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getAtributoProduto_2030ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getSimulacao_2024ContainedLinks(
			View view) {
		Simulacao modelElement = (Simulacao) view.getElement();
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Transicao_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getEstado_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getTransicao_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getCaracteristicaOpcional_2001IncomingLinks(
			View view) {
		CaracteristicaOpcional modelElement = (CaracteristicaOpcional) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Caracteristica_CaracteristicaFilha_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getCaracteristicaAgrupada_2033IncomingLinks(
			View view) {
		CaracteristicaAgrupada modelElement = (CaracteristicaAgrupada) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Caracteristica_CaracteristicaFilha_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getVariacaoDois_2002IncomingLinks(
			View view) {
		VariacaoDois modelElement = (VariacaoDois) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Caracteristica_CaracteristicaFilha_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getCaracteristicaRaiz_2003IncomingLinks(
			View view) {
		CaracteristicaRaiz modelElement = (CaracteristicaRaiz) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Caracteristica_CaracteristicaFilha_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Produto_LinhaDoProduto_4011(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getCaracteristicaMandatoria_2004IncomingLinks(
			View view) {
		CaracteristicaMandatoria modelElement = (CaracteristicaMandatoria) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Caracteristica_CaracteristicaFilha_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getProduto_2005IncomingLinks(
			View view) {
		Produto modelElement = (Produto) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_CaracteristicaProduto_CaracteristicaProdutoFilha_4008(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getEventoLogico_2006IncomingLinks(
			View view) {
		EventoLogico modelElement = (EventoLogico) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_RegraDeContexto_Evento_4014(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_EventoLogico_LadoDireitoEvento_4016(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_EventoLogico_LadoEsquerdoEvento_4017(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getEventoRelacional_2007IncomingLinks(
			View view) {
		EventoRelacional modelElement = (EventoRelacional) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_RegraDeContexto_Evento_4014(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_EventoLogico_LadoDireitoEvento_4016(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_EventoLogico_LadoEsquerdoEvento_4017(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getAcaoLogico_2008IncomingLinks(
			View view) {
		AcaoLogico modelElement = (AcaoLogico) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_RegraDeContexto_Acao_4015(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_AcaoLogico_LadoEsquerdoAcao_4018(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_AcaoLogico_LadoDireitoAcao_4019(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getLiteralAcao_2009IncomingLinks(
			View view) {
		LiteralAcao modelElement = (LiteralAcao) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_RegraDeContexto_Acao_4015(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_AcaoLogico_LadoEsquerdoAcao_4018(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_AcaoLogico_LadoDireitoAcao_4019(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getDesignar_2010IncomingLinks(
			View view) {
		Designar modelElement = (Designar) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_RegraDeContexto_Acao_4015(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_AcaoLogico_LadoEsquerdoAcao_4018(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_AcaoLogico_LadoDireitoAcao_4019(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getExpressaoLogica_2011IncomingLinks(
			View view) {
		ExpressaoLogica modelElement = (ExpressaoLogica) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_RegraDeComposicao_Antecedente_4012(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_RegraDeComposicao_Consequente_4013(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ExpressaoLogica_LadoDireitoComposicao_4020(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ExpressaoLogica_LadoEsquerdoComposicao_4021(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getExpressaoRelacional_2012IncomingLinks(
			View view) {
		ExpressaoRelacional modelElement = (ExpressaoRelacional) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_RegraDeComposicao_Antecedente_4012(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_RegraDeComposicao_Consequente_4013(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ExpressaoLogica_LadoDireitoComposicao_4020(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ExpressaoLogica_LadoEsquerdoComposicao_4021(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getLiteralComposicao_2013IncomingLinks(
			View view) {
		LiteralComposicao modelElement = (LiteralComposicao) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_RegraDeComposicao_Antecedente_4012(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_RegraDeComposicao_Consequente_4013(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ExpressaoLogica_LadoDireitoComposicao_4020(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ExpressaoLogica_LadoEsquerdoComposicao_4021(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getCaracteristicaMandatoriaProduto_2025IncomingLinks(
			View view) {
		CaracteristicaMandatoriaProduto modelElement = (CaracteristicaMandatoriaProduto) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_CaracteristicaProduto_CaracteristicaProdutoFilha_4008(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getCaracteristicaOpcionalProduto_2026IncomingLinks(
			View view) {
		CaracteristicaOpcionalProduto modelElement = (CaracteristicaOpcionalProduto) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_CaracteristicaProduto_CaracteristicaProdutoFilha_4008(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getVariacaoDoisProduto_2027IncomingLinks(
			View view) {
		VariacaoDoisProduto modelElement = (VariacaoDoisProduto) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_CaracteristicaProduto_CaracteristicaProdutoFilha_4008(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getCaracteristicaAgrupadaProduto_2035IncomingLinks(
			View view) {
		CaracteristicaAgrupadaProduto modelElement = (CaracteristicaAgrupadaProduto) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_CaracteristicaProduto_CaracteristicaProdutoFilha_4008(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getAtributo_2017IncomingLinks(
			View view) {
		Atributo modelElement = (Atributo) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Caracteristica_Atributo_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getRaizDeContexto_2018IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getEntidadeDeContexto_2028IncomingLinks(
			View view) {
		EntidadeDeContexto modelElement = (EntidadeDeContexto) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_RaizDeContexto_EntidadesDeContexto_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getInformacaoDeContexto_2029IncomingLinks(
			View view) {
		InformacaoDeContexto modelElement = (InformacaoDeContexto) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_EntidadeDeContexto_InformacoesDeContexto_4023(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getCasoDeUso_2038IncomingLinks(
			View view) {
		CasoDeUso modelElement = (CasoDeUso) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Elemento_ElementosExternos_4027(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getCasoDeTeste_2039IncomingLinks(
			View view) {
		CasoDeTeste modelElement = (CasoDeTeste) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Elemento_ElementosExternos_4027(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getRegraDeComposicao_2021IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getRegraDeContexto_2022IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getAtributoProduto_2030IncomingLinks(
			View view) {
		AtributoProduto modelElement = (AtributoProduto) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_CaracteristicaProduto_AtributoProduto_4009(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getSimulacao_2024IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getEstado_3001IncomingLinks(
			View view) {
		Estado modelElement = (Estado) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transicao_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getTransicao_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getCaracteristicaOpcional_2001OutgoingLinks(
			View view) {
		CaracteristicaOpcional modelElement = (CaracteristicaOpcional) view
				.getElement();
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Elemento_ElementosExternos_4027(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Caracteristica_CaracteristicaFilha_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Caracteristica_Variacoes_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Caracteristica_Atributo_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getCaracteristicaAgrupada_2033OutgoingLinks(
			View view) {
		CaracteristicaAgrupada modelElement = (CaracteristicaAgrupada) view
				.getElement();
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Elemento_ElementosExternos_4027(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Caracteristica_CaracteristicaFilha_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Caracteristica_Variacoes_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Caracteristica_Atributo_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getVariacaoDois_2002OutgoingLinks(
			View view) {
		VariacaoDois modelElement = (VariacaoDois) view.getElement();
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Elemento_ElementosExternos_4027(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Caracteristica_CaracteristicaFilha_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Caracteristica_Variacoes_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Caracteristica_Atributo_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getCaracteristicaRaiz_2003OutgoingLinks(
			View view) {
		CaracteristicaRaiz modelElement = (CaracteristicaRaiz) view
				.getElement();
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Elemento_ElementosExternos_4027(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Caracteristica_CaracteristicaFilha_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Caracteristica_Variacoes_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Caracteristica_Atributo_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getCaracteristicaMandatoria_2004OutgoingLinks(
			View view) {
		CaracteristicaMandatoria modelElement = (CaracteristicaMandatoria) view
				.getElement();
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Elemento_ElementosExternos_4027(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Caracteristica_CaracteristicaFilha_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Caracteristica_Variacoes_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Caracteristica_Atributo_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getProduto_2005OutgoingLinks(
			View view) {
		Produto modelElement = (Produto) view.getElement();
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_CaracteristicaProduto_CaracteristicaProdutoFilha_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_CaracteristicaProduto_AtributoProduto_4009(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Produto_LinhaDoProduto_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getEventoLogico_2006OutgoingLinks(
			View view) {
		EventoLogico modelElement = (EventoLogico) view.getElement();
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_EventoLogico_LadoDireitoEvento_4016(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_EventoLogico_LadoEsquerdoEvento_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getEventoRelacional_2007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getAcaoLogico_2008OutgoingLinks(
			View view) {
		AcaoLogico modelElement = (AcaoLogico) view.getElement();
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AcaoLogico_LadoEsquerdoAcao_4018(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_AcaoLogico_LadoDireitoAcao_4019(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getLiteralAcao_2009OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getDesignar_2010OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getExpressaoLogica_2011OutgoingLinks(
			View view) {
		ExpressaoLogica modelElement = (ExpressaoLogica) view.getElement();
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ExpressaoLogica_LadoDireitoComposicao_4020(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ExpressaoLogica_LadoEsquerdoComposicao_4021(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getExpressaoRelacional_2012OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getLiteralComposicao_2013OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getCaracteristicaMandatoriaProduto_2025OutgoingLinks(
			View view) {
		CaracteristicaMandatoriaProduto modelElement = (CaracteristicaMandatoriaProduto) view
				.getElement();
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_CaracteristicaProduto_CaracteristicaProdutoFilha_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_CaracteristicaProduto_AtributoProduto_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getCaracteristicaOpcionalProduto_2026OutgoingLinks(
			View view) {
		CaracteristicaOpcionalProduto modelElement = (CaracteristicaOpcionalProduto) view
				.getElement();
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_CaracteristicaProduto_CaracteristicaProdutoFilha_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_CaracteristicaProduto_AtributoProduto_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getVariacaoDoisProduto_2027OutgoingLinks(
			View view) {
		VariacaoDoisProduto modelElement = (VariacaoDoisProduto) view
				.getElement();
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_CaracteristicaProduto_CaracteristicaProdutoFilha_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_CaracteristicaProduto_AtributoProduto_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getCaracteristicaAgrupadaProduto_2035OutgoingLinks(
			View view) {
		CaracteristicaAgrupadaProduto modelElement = (CaracteristicaAgrupadaProduto) view
				.getElement();
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_CaracteristicaProduto_CaracteristicaProdutoFilha_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_CaracteristicaProduto_AtributoProduto_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getAtributo_2017OutgoingLinks(
			View view) {
		Atributo modelElement = (Atributo) view.getElement();
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Elemento_ElementosExternos_4027(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getRaizDeContexto_2018OutgoingLinks(
			View view) {
		RaizDeContexto modelElement = (RaizDeContexto) view.getElement();
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Elemento_ElementosExternos_4027(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_RaizDeContexto_EntidadesDeContexto_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getEntidadeDeContexto_2028OutgoingLinks(
			View view) {
		EntidadeDeContexto modelElement = (EntidadeDeContexto) view
				.getElement();
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Elemento_ElementosExternos_4027(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_EntidadeDeContexto_InformacoesDeContexto_4023(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getInformacaoDeContexto_2029OutgoingLinks(
			View view) {
		InformacaoDeContexto modelElement = (InformacaoDeContexto) view
				.getElement();
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Elemento_ElementosExternos_4027(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getCasoDeUso_2038OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getCasoDeTeste_2039OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getRegraDeComposicao_2021OutgoingLinks(
			View view) {
		RegraDeComposicao modelElement = (RegraDeComposicao) view.getElement();
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_RegraDeComposicao_Antecedente_4012(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_RegraDeComposicao_Consequente_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getRegraDeContexto_2022OutgoingLinks(
			View view) {
		RegraDeContexto modelElement = (RegraDeContexto) view.getElement();
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_RegraDeContexto_Evento_4014(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_RegraDeContexto_Acao_4015(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getAtributoProduto_2030OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getSimulacao_2024OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getEstado_3001OutgoingLinks(
			View view) {
		Estado modelElement = (Estado) view.getElement();
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transicao_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CaracteristicaLinkDescriptor> getTransicao_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<CaracteristicaLinkDescriptor> getContainedTypeModelFacetLinks_Transicao_4001(
			Simulacao container) {
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		for (Iterator<?> links = container.getTransicoes().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Transicao) {
				continue;
			}
			Transicao link = (Transicao) linkObject;
			if (TransicaoEditPart.VISUAL_ID != CaracteristicaVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Estado dst = link.getENovo();
			Estado src = link.getEAntigo();
			result.add(new CaracteristicaLinkDescriptor(src, dst, link,
					CaracteristicaElementTypes.Transicao_4001,
					TransicaoEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CaracteristicaLinkDescriptor> getIncomingTypeModelFacetLinks_Transicao_4001(
			Estado target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != CaracteristicaPackage.eINSTANCE
					.getTransicao_ENovo()
					|| false == setting.getEObject() instanceof Transicao) {
				continue;
			}
			Transicao link = (Transicao) setting.getEObject();
			if (TransicaoEditPart.VISUAL_ID != CaracteristicaVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Estado src = link.getEAntigo();
			result.add(new CaracteristicaLinkDescriptor(src, target, link,
					CaracteristicaElementTypes.Transicao_4001,
					TransicaoEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CaracteristicaLinkDescriptor> getIncomingFeatureModelFacetLinks_Elemento_ElementosExternos_4027(
			ElementoExterno target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == CaracteristicaPackage.eINSTANCE
					.getElemento_ElementosExternos()) {
				result.add(new CaracteristicaLinkDescriptor(
						setting.getEObject(),
						target,
						CaracteristicaElementTypes.ElementoElementosExternos_4027,
						ElementoElementosExternosEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CaracteristicaLinkDescriptor> getIncomingFeatureModelFacetLinks_Caracteristica_CaracteristicaFilha_4002(
			Caracteristica target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == CaracteristicaPackage.eINSTANCE
					.getCaracteristica_CaracteristicaFilha()) {
				result.add(new CaracteristicaLinkDescriptor(
						setting.getEObject(),
						target,
						CaracteristicaElementTypes.CaracteristicaCaracteristicaFilha_4002,
						CaracteristicaCaracteristicaFilhaEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CaracteristicaLinkDescriptor> getIncomingFeatureModelFacetLinks_Caracteristica_Atributo_4004(
			Atributo target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == CaracteristicaPackage.eINSTANCE
					.getCaracteristica_Atributo()) {
				result.add(new CaracteristicaLinkDescriptor(setting
						.getEObject(), target,
						CaracteristicaElementTypes.CaracteristicaAtributo_4004,
						CaracteristicaAtributoEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CaracteristicaLinkDescriptor> getIncomingFeatureModelFacetLinks_RaizDeContexto_EntidadesDeContexto_4006(
			EntidadeDeContexto target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == CaracteristicaPackage.eINSTANCE
					.getRaizDeContexto_EntidadesDeContexto()) {
				result.add(new CaracteristicaLinkDescriptor(
						setting.getEObject(),
						target,
						CaracteristicaElementTypes.RaizDeContextoEntidadesDeContexto_4006,
						RaizDeContextoEntidadesDeContextoEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CaracteristicaLinkDescriptor> getIncomingFeatureModelFacetLinks_EntidadeDeContexto_InformacoesDeContexto_4023(
			InformacaoDeContexto target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == CaracteristicaPackage.eINSTANCE
					.getEntidadeDeContexto_InformacoesDeContexto()) {
				result.add(new CaracteristicaLinkDescriptor(
						setting.getEObject(),
						target,
						CaracteristicaElementTypes.EntidadeDeContextoInformacoesDeContexto_4023,
						EntidadeDeContextoInformacoesDeContextoEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CaracteristicaLinkDescriptor> getIncomingFeatureModelFacetLinks_CaracteristicaProduto_CaracteristicaProdutoFilha_4008(
			CaracteristicaProduto target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == CaracteristicaPackage.eINSTANCE
					.getCaracteristicaProduto_CaracteristicaProdutoFilha()) {
				result.add(new CaracteristicaLinkDescriptor(
						setting.getEObject(),
						target,
						CaracteristicaElementTypes.CaracteristicaProdutoCaracteristicaProdutoFilha_4008,
						CaracteristicaProdutoCaracteristicaProdutoFilhaEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CaracteristicaLinkDescriptor> getIncomingFeatureModelFacetLinks_CaracteristicaProduto_AtributoProduto_4009(
			AtributoProduto target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == CaracteristicaPackage.eINSTANCE
					.getCaracteristicaProduto_AtributoProduto()) {
				result.add(new CaracteristicaLinkDescriptor(
						setting.getEObject(),
						target,
						CaracteristicaElementTypes.CaracteristicaProdutoAtributoProduto_4009,
						CaracteristicaProdutoAtributoProdutoEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CaracteristicaLinkDescriptor> getIncomingFeatureModelFacetLinks_Produto_LinhaDoProduto_4011(
			CaracteristicaRaiz target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == CaracteristicaPackage.eINSTANCE
					.getProduto_LinhaDoProduto()) {
				result.add(new CaracteristicaLinkDescriptor(setting
						.getEObject(), target,
						CaracteristicaElementTypes.ProdutoLinhaDoProduto_4011,
						ProdutoLinhaDoProdutoEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CaracteristicaLinkDescriptor> getIncomingFeatureModelFacetLinks_RegraDeComposicao_Antecedente_4012(
			Antecedente target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == CaracteristicaPackage.eINSTANCE
					.getRegraDeComposicao_Antecedente()) {
				result.add(new CaracteristicaLinkDescriptor(
						setting.getEObject(),
						target,
						CaracteristicaElementTypes.RegraDeComposicaoAntecedente_4012,
						RegraDeComposicaoAntecedenteEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CaracteristicaLinkDescriptor> getIncomingFeatureModelFacetLinks_RegraDeComposicao_Consequente_4013(
			Antecedente target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == CaracteristicaPackage.eINSTANCE
					.getRegraDeComposicao_Consequente()) {
				result.add(new CaracteristicaLinkDescriptor(
						setting.getEObject(),
						target,
						CaracteristicaElementTypes.RegraDeComposicaoConsequente_4013,
						RegraDeComposicaoConsequenteEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CaracteristicaLinkDescriptor> getIncomingFeatureModelFacetLinks_RegraDeContexto_Evento_4014(
			Evento target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == CaracteristicaPackage.eINSTANCE
					.getRegraDeContexto_Evento()) {
				result.add(new CaracteristicaLinkDescriptor(setting
						.getEObject(), target,
						CaracteristicaElementTypes.RegraDeContextoEvento_4014,
						RegraDeContextoEventoEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CaracteristicaLinkDescriptor> getIncomingFeatureModelFacetLinks_RegraDeContexto_Acao_4015(
			Acao target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == CaracteristicaPackage.eINSTANCE
					.getRegraDeContexto_Acao()) {
				result.add(new CaracteristicaLinkDescriptor(setting
						.getEObject(), target,
						CaracteristicaElementTypes.RegraDeContextoAcao_4015,
						RegraDeContextoAcaoEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CaracteristicaLinkDescriptor> getIncomingFeatureModelFacetLinks_EventoLogico_LadoDireitoEvento_4016(
			Evento target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == CaracteristicaPackage.eINSTANCE
					.getEventoLogico_LadoDireitoEvento()) {
				result.add(new CaracteristicaLinkDescriptor(
						setting.getEObject(),
						target,
						CaracteristicaElementTypes.EventoLogicoLadoDireitoEvento_4016,
						EventoLogicoLadoDireitoEventoEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CaracteristicaLinkDescriptor> getIncomingFeatureModelFacetLinks_EventoLogico_LadoEsquerdoEvento_4017(
			Evento target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == CaracteristicaPackage.eINSTANCE
					.getEventoLogico_LadoEsquerdoEvento()) {
				result.add(new CaracteristicaLinkDescriptor(
						setting.getEObject(),
						target,
						CaracteristicaElementTypes.EventoLogicoLadoEsquerdoEvento_4017,
						EventoLogicoLadoEsquerdoEventoEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CaracteristicaLinkDescriptor> getIncomingFeatureModelFacetLinks_AcaoLogico_LadoEsquerdoAcao_4018(
			Acao target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == CaracteristicaPackage.eINSTANCE
					.getAcaoLogico_LadoEsquerdoAcao()) {
				result.add(new CaracteristicaLinkDescriptor(
						setting.getEObject(),
						target,
						CaracteristicaElementTypes.AcaoLogicoLadoEsquerdoAcao_4018,
						AcaoLogicoLadoEsquerdoAcaoEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CaracteristicaLinkDescriptor> getIncomingFeatureModelFacetLinks_AcaoLogico_LadoDireitoAcao_4019(
			Acao target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == CaracteristicaPackage.eINSTANCE
					.getAcaoLogico_LadoDireitoAcao()) {
				result.add(new CaracteristicaLinkDescriptor(
						setting.getEObject(),
						target,
						CaracteristicaElementTypes.AcaoLogicoLadoDireitoAcao_4019,
						AcaoLogicoLadoDireitoAcaoEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CaracteristicaLinkDescriptor> getIncomingFeatureModelFacetLinks_ExpressaoLogica_LadoDireitoComposicao_4020(
			Antecedente target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == CaracteristicaPackage.eINSTANCE
					.getExpressaoLogica_LadoDireitoComposicao()) {
				result.add(new CaracteristicaLinkDescriptor(
						setting.getEObject(),
						target,
						CaracteristicaElementTypes.ExpressaoLogicaLadoDireitoComposicao_4020,
						ExpressaoLogicaLadoDireitoComposicaoEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CaracteristicaLinkDescriptor> getIncomingFeatureModelFacetLinks_ExpressaoLogica_LadoEsquerdoComposicao_4021(
			Antecedente target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == CaracteristicaPackage.eINSTANCE
					.getExpressaoLogica_LadoEsquerdoComposicao()) {
				result.add(new CaracteristicaLinkDescriptor(
						setting.getEObject(),
						target,
						CaracteristicaElementTypes.ExpressaoLogicaLadoEsquerdoComposicao_4021,
						ExpressaoLogicaLadoEsquerdoComposicaoEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CaracteristicaLinkDescriptor> getOutgoingTypeModelFacetLinks_Transicao_4001(
			Estado source) {
		Simulacao container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Simulacao) {
				container = (Simulacao) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		for (Iterator<?> links = container.getTransicoes().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Transicao) {
				continue;
			}
			Transicao link = (Transicao) linkObject;
			if (TransicaoEditPart.VISUAL_ID != CaracteristicaVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Estado dst = link.getENovo();
			Estado src = link.getEAntigo();
			if (src != source) {
				continue;
			}
			result.add(new CaracteristicaLinkDescriptor(src, dst, link,
					CaracteristicaElementTypes.Transicao_4001,
					TransicaoEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CaracteristicaLinkDescriptor> getOutgoingFeatureModelFacetLinks_Elemento_ElementosExternos_4027(
			Elemento source) {
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		for (Iterator<?> destinations = source.getElementosExternos()
				.iterator(); destinations.hasNext();) {
			ElementoExterno destination = (ElementoExterno) destinations.next();
			result.add(new CaracteristicaLinkDescriptor(source, destination,
					CaracteristicaElementTypes.ElementoElementosExternos_4027,
					ElementoElementosExternosEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CaracteristicaLinkDescriptor> getOutgoingFeatureModelFacetLinks_Caracteristica_CaracteristicaFilha_4002(
			Caracteristica source) {
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		for (Iterator<?> destinations = source.getCaracteristicaFilha()
				.iterator(); destinations.hasNext();) {
			Caracteristica destination = (Caracteristica) destinations.next();
			result.add(new CaracteristicaLinkDescriptor(
					source,
					destination,
					CaracteristicaElementTypes.CaracteristicaCaracteristicaFilha_4002,
					CaracteristicaCaracteristicaFilhaEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CaracteristicaLinkDescriptor> getOutgoingFeatureModelFacetLinks_Caracteristica_Variacoes_4003(
			Caracteristica source) {
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		for (Iterator<?> destinations = source.getVariacoes().iterator(); destinations
				.hasNext();) {
			Variacao destination = (Variacao) destinations.next();
			result.add(new CaracteristicaLinkDescriptor(source, destination,
					CaracteristicaElementTypes.CaracteristicaVariacoes_4003,
					CaracteristicaVariacoesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CaracteristicaLinkDescriptor> getOutgoingFeatureModelFacetLinks_Caracteristica_Atributo_4004(
			Caracteristica source) {
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		for (Iterator<?> destinations = source.getAtributo().iterator(); destinations
				.hasNext();) {
			Atributo destination = (Atributo) destinations.next();
			result.add(new CaracteristicaLinkDescriptor(source, destination,
					CaracteristicaElementTypes.CaracteristicaAtributo_4004,
					CaracteristicaAtributoEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CaracteristicaLinkDescriptor> getOutgoingFeatureModelFacetLinks_RaizDeContexto_EntidadesDeContexto_4006(
			RaizDeContexto source) {
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		for (Iterator<?> destinations = source.getEntidadesDeContexto()
				.iterator(); destinations.hasNext();) {
			EntidadeDeContexto destination = (EntidadeDeContexto) destinations
					.next();
			result.add(new CaracteristicaLinkDescriptor(
					source,
					destination,
					CaracteristicaElementTypes.RaizDeContextoEntidadesDeContexto_4006,
					RaizDeContextoEntidadesDeContextoEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CaracteristicaLinkDescriptor> getOutgoingFeatureModelFacetLinks_EntidadeDeContexto_InformacoesDeContexto_4023(
			EntidadeDeContexto source) {
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		for (Iterator<?> destinations = source.getInformacoesDeContexto()
				.iterator(); destinations.hasNext();) {
			InformacaoDeContexto destination = (InformacaoDeContexto) destinations
					.next();
			result.add(new CaracteristicaLinkDescriptor(
					source,
					destination,
					CaracteristicaElementTypes.EntidadeDeContextoInformacoesDeContexto_4023,
					EntidadeDeContextoInformacoesDeContextoEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CaracteristicaLinkDescriptor> getOutgoingFeatureModelFacetLinks_CaracteristicaProduto_CaracteristicaProdutoFilha_4008(
			CaracteristicaProduto source) {
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		for (Iterator<?> destinations = source.getCaracteristicaProdutoFilha()
				.iterator(); destinations.hasNext();) {
			CaracteristicaProduto destination = (CaracteristicaProduto) destinations
					.next();
			result.add(new CaracteristicaLinkDescriptor(
					source,
					destination,
					CaracteristicaElementTypes.CaracteristicaProdutoCaracteristicaProdutoFilha_4008,
					CaracteristicaProdutoCaracteristicaProdutoFilhaEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CaracteristicaLinkDescriptor> getOutgoingFeatureModelFacetLinks_CaracteristicaProduto_AtributoProduto_4009(
			CaracteristicaProduto source) {
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		for (Iterator<?> destinations = source.getAtributoProduto().iterator(); destinations
				.hasNext();) {
			AtributoProduto destination = (AtributoProduto) destinations.next();
			result.add(new CaracteristicaLinkDescriptor(
					source,
					destination,
					CaracteristicaElementTypes.CaracteristicaProdutoAtributoProduto_4009,
					CaracteristicaProdutoAtributoProdutoEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CaracteristicaLinkDescriptor> getOutgoingFeatureModelFacetLinks_Produto_LinhaDoProduto_4011(
			Produto source) {
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		CaracteristicaRaiz destination = source.getLinhaDoProduto();
		if (destination == null) {
			return result;
		}
		result.add(new CaracteristicaLinkDescriptor(source, destination,
				CaracteristicaElementTypes.ProdutoLinhaDoProduto_4011,
				ProdutoLinhaDoProdutoEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CaracteristicaLinkDescriptor> getOutgoingFeatureModelFacetLinks_RegraDeComposicao_Antecedente_4012(
			RegraDeComposicao source) {
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		Antecedente destination = source.getAntecedente();
		if (destination == null) {
			return result;
		}
		result.add(new CaracteristicaLinkDescriptor(source, destination,
				CaracteristicaElementTypes.RegraDeComposicaoAntecedente_4012,
				RegraDeComposicaoAntecedenteEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CaracteristicaLinkDescriptor> getOutgoingFeatureModelFacetLinks_RegraDeComposicao_Consequente_4013(
			RegraDeComposicao source) {
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		Antecedente destination = source.getConsequente();
		if (destination == null) {
			return result;
		}
		result.add(new CaracteristicaLinkDescriptor(source, destination,
				CaracteristicaElementTypes.RegraDeComposicaoConsequente_4013,
				RegraDeComposicaoConsequenteEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CaracteristicaLinkDescriptor> getOutgoingFeatureModelFacetLinks_RegraDeContexto_Evento_4014(
			RegraDeContexto source) {
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		Evento destination = source.getEvento();
		if (destination == null) {
			return result;
		}
		result.add(new CaracteristicaLinkDescriptor(source, destination,
				CaracteristicaElementTypes.RegraDeContextoEvento_4014,
				RegraDeContextoEventoEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CaracteristicaLinkDescriptor> getOutgoingFeatureModelFacetLinks_RegraDeContexto_Acao_4015(
			RegraDeContexto source) {
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		Acao destination = source.getAcao();
		if (destination == null) {
			return result;
		}
		result.add(new CaracteristicaLinkDescriptor(source, destination,
				CaracteristicaElementTypes.RegraDeContextoAcao_4015,
				RegraDeContextoAcaoEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CaracteristicaLinkDescriptor> getOutgoingFeatureModelFacetLinks_EventoLogico_LadoDireitoEvento_4016(
			EventoLogico source) {
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		Evento destination = source.getLadoDireitoEvento();
		if (destination == null) {
			return result;
		}
		result.add(new CaracteristicaLinkDescriptor(source, destination,
				CaracteristicaElementTypes.EventoLogicoLadoDireitoEvento_4016,
				EventoLogicoLadoDireitoEventoEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CaracteristicaLinkDescriptor> getOutgoingFeatureModelFacetLinks_EventoLogico_LadoEsquerdoEvento_4017(
			EventoLogico source) {
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		Evento destination = source.getLadoEsquerdoEvento();
		if (destination == null) {
			return result;
		}
		result.add(new CaracteristicaLinkDescriptor(source, destination,
				CaracteristicaElementTypes.EventoLogicoLadoEsquerdoEvento_4017,
				EventoLogicoLadoEsquerdoEventoEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CaracteristicaLinkDescriptor> getOutgoingFeatureModelFacetLinks_AcaoLogico_LadoEsquerdoAcao_4018(
			AcaoLogico source) {
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		Acao destination = source.getLadoEsquerdoAcao();
		if (destination == null) {
			return result;
		}
		result.add(new CaracteristicaLinkDescriptor(source, destination,
				CaracteristicaElementTypes.AcaoLogicoLadoEsquerdoAcao_4018,
				AcaoLogicoLadoEsquerdoAcaoEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CaracteristicaLinkDescriptor> getOutgoingFeatureModelFacetLinks_AcaoLogico_LadoDireitoAcao_4019(
			AcaoLogico source) {
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		Acao destination = source.getLadoDireitoAcao();
		if (destination == null) {
			return result;
		}
		result.add(new CaracteristicaLinkDescriptor(source, destination,
				CaracteristicaElementTypes.AcaoLogicoLadoDireitoAcao_4019,
				AcaoLogicoLadoDireitoAcaoEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CaracteristicaLinkDescriptor> getOutgoingFeatureModelFacetLinks_ExpressaoLogica_LadoDireitoComposicao_4020(
			ExpressaoLogica source) {
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		Antecedente destination = source.getLadoDireitoComposicao();
		if (destination == null) {
			return result;
		}
		result.add(new CaracteristicaLinkDescriptor(
				source,
				destination,
				CaracteristicaElementTypes.ExpressaoLogicaLadoDireitoComposicao_4020,
				ExpressaoLogicaLadoDireitoComposicaoEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CaracteristicaLinkDescriptor> getOutgoingFeatureModelFacetLinks_ExpressaoLogica_LadoEsquerdoComposicao_4021(
			ExpressaoLogica source) {
		LinkedList<CaracteristicaLinkDescriptor> result = new LinkedList<CaracteristicaLinkDescriptor>();
		Antecedente destination = source.getLadoEsquerdoComposicao();
		if (destination == null) {
			return result;
		}
		result.add(new CaracteristicaLinkDescriptor(
				source,
				destination,
				CaracteristicaElementTypes.ExpressaoLogicaLadoEsquerdoComposicao_4021,
				ExpressaoLogicaLadoEsquerdoComposicaoEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<CaracteristicaNodeDescriptor> getSemanticChildren(View view) {
			return CaracteristicaDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<CaracteristicaLinkDescriptor> getContainedLinks(View view) {
			return CaracteristicaDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<CaracteristicaLinkDescriptor> getIncomingLinks(View view) {
			return CaracteristicaDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<CaracteristicaLinkDescriptor> getOutgoingLinks(View view) {
			return CaracteristicaDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
