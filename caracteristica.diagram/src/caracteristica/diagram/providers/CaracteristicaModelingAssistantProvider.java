/*
 * 
 */
package caracteristica.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

import caracteristica.diagram.edit.parts.AcaoLogicoEditPart;
import caracteristica.diagram.edit.parts.AtributoEditPart;
import caracteristica.diagram.edit.parts.AtributoProdutoEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaAgrupadaEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaAgrupadaProdutoEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaMandatoriaEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaMandatoriaProdutoEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaOpcionalEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaOpcionalProdutoEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaRaizEditPart;
import caracteristica.diagram.edit.parts.CasoDeTesteEditPart;
import caracteristica.diagram.edit.parts.CasoDeUsoEditPart;
import caracteristica.diagram.edit.parts.DesignarEditPart;
import caracteristica.diagram.edit.parts.EntidadeDeContextoEditPart;
import caracteristica.diagram.edit.parts.EstadoEditPart;
import caracteristica.diagram.edit.parts.EventoLogicoEditPart;
import caracteristica.diagram.edit.parts.EventoRelacionalEditPart;
import caracteristica.diagram.edit.parts.ExpressaoLogicaEditPart;
import caracteristica.diagram.edit.parts.ExpressaoRelacionalEditPart;
import caracteristica.diagram.edit.parts.InformacaoDeContextoEditPart;
import caracteristica.diagram.edit.parts.LPSEditPart;
import caracteristica.diagram.edit.parts.LiteralAcaoEditPart;
import caracteristica.diagram.edit.parts.LiteralComposicaoEditPart;
import caracteristica.diagram.edit.parts.ProdutoEditPart;
import caracteristica.diagram.edit.parts.RaizDeContextoEditPart;
import caracteristica.diagram.edit.parts.RegraDeComposicaoEditPart;
import caracteristica.diagram.edit.parts.RegraDeContextoEditPart;
import caracteristica.diagram.edit.parts.SimulacaoSimulacaoEstadosCompartmentEditPart;
import caracteristica.diagram.edit.parts.VariacaoDoisEditPart;
import caracteristica.diagram.edit.parts.VariacaoDoisProdutoEditPart;
import caracteristica.diagram.part.CaracteristicaDiagramEditorPlugin;
import caracteristica.diagram.part.Messages;

/**
 * @generated
 */
public class CaracteristicaModelingAssistantProvider extends
		ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof LPSEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(28);
			types.add(CaracteristicaElementTypes.CaracteristicaOpcional_2001);
			types.add(CaracteristicaElementTypes.CaracteristicaAgrupada_2033);
			types.add(CaracteristicaElementTypes.VariacaoDois_2002);
			types.add(CaracteristicaElementTypes.CaracteristicaRaiz_2003);
			types.add(CaracteristicaElementTypes.CaracteristicaMandatoria_2004);
			types.add(CaracteristicaElementTypes.Produto_2005);
			types.add(CaracteristicaElementTypes.EventoLogico_2006);
			types.add(CaracteristicaElementTypes.EventoRelacional_2007);
			types.add(CaracteristicaElementTypes.AcaoLogico_2008);
			types.add(CaracteristicaElementTypes.LiteralAcao_2009);
			types.add(CaracteristicaElementTypes.Designar_2010);
			types.add(CaracteristicaElementTypes.ExpressaoLogica_2011);
			types.add(CaracteristicaElementTypes.ExpressaoRelacional_2012);
			types.add(CaracteristicaElementTypes.LiteralComposicao_2013);
			types.add(CaracteristicaElementTypes.CaracteristicaMandatoriaProduto_2025);
			types.add(CaracteristicaElementTypes.CaracteristicaOpcionalProduto_2026);
			types.add(CaracteristicaElementTypes.VariacaoDoisProduto_2027);
			types.add(CaracteristicaElementTypes.CaracteristicaAgrupadaProduto_2035);
			types.add(CaracteristicaElementTypes.Atributo_2017);
			types.add(CaracteristicaElementTypes.RaizDeContexto_2018);
			types.add(CaracteristicaElementTypes.EntidadeDeContexto_2028);
			types.add(CaracteristicaElementTypes.InformacaoDeContexto_2029);
			types.add(CaracteristicaElementTypes.CasoDeUso_2038);
			types.add(CaracteristicaElementTypes.CasoDeTeste_2039);
			types.add(CaracteristicaElementTypes.RegraDeComposicao_2021);
			types.add(CaracteristicaElementTypes.RegraDeContexto_2022);
			types.add(CaracteristicaElementTypes.AtributoProduto_2030);
			types.add(CaracteristicaElementTypes.Simulacao_2024);
			return types;
		}
		if (editPart instanceof SimulacaoSimulacaoEstadosCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(CaracteristicaElementTypes.Estado_3001);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof CaracteristicaOpcionalEditPart) {
			return ((CaracteristicaOpcionalEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof CaracteristicaAgrupadaEditPart) {
			return ((CaracteristicaAgrupadaEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof VariacaoDoisEditPart) {
			return ((VariacaoDoisEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof CaracteristicaRaizEditPart) {
			return ((CaracteristicaRaizEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof CaracteristicaMandatoriaEditPart) {
			return ((CaracteristicaMandatoriaEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ProdutoEditPart) {
			return ((ProdutoEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof EventoLogicoEditPart) {
			return ((EventoLogicoEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof AcaoLogicoEditPart) {
			return ((AcaoLogicoEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ExpressaoLogicaEditPart) {
			return ((ExpressaoLogicaEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof CaracteristicaMandatoriaProdutoEditPart) {
			return ((CaracteristicaMandatoriaProdutoEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof CaracteristicaOpcionalProdutoEditPart) {
			return ((CaracteristicaOpcionalProdutoEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof VariacaoDoisProdutoEditPart) {
			return ((VariacaoDoisProdutoEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof CaracteristicaAgrupadaProdutoEditPart) {
			return ((CaracteristicaAgrupadaProdutoEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof AtributoEditPart) {
			return ((AtributoEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof RaizDeContextoEditPart) {
			return ((RaizDeContextoEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof EntidadeDeContextoEditPart) {
			return ((EntidadeDeContextoEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof InformacaoDeContextoEditPart) {
			return ((InformacaoDeContextoEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof RegraDeComposicaoEditPart) {
			return ((RegraDeComposicaoEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof RegraDeContextoEditPart) {
			return ((RegraDeContextoEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof EstadoEditPart) {
			return ((EstadoEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof CaracteristicaOpcionalEditPart) {
			return ((CaracteristicaOpcionalEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof CaracteristicaAgrupadaEditPart) {
			return ((CaracteristicaAgrupadaEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof VariacaoDoisEditPart) {
			return ((VariacaoDoisEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof CaracteristicaRaizEditPart) {
			return ((CaracteristicaRaizEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof CaracteristicaMandatoriaEditPart) {
			return ((CaracteristicaMandatoriaEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ProdutoEditPart) {
			return ((ProdutoEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof EventoLogicoEditPart) {
			return ((EventoLogicoEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof EventoRelacionalEditPart) {
			return ((EventoRelacionalEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof AcaoLogicoEditPart) {
			return ((AcaoLogicoEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof LiteralAcaoEditPart) {
			return ((LiteralAcaoEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof DesignarEditPart) {
			return ((DesignarEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ExpressaoLogicaEditPart) {
			return ((ExpressaoLogicaEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ExpressaoRelacionalEditPart) {
			return ((ExpressaoRelacionalEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof LiteralComposicaoEditPart) {
			return ((LiteralComposicaoEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof CaracteristicaMandatoriaProdutoEditPart) {
			return ((CaracteristicaMandatoriaProdutoEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof CaracteristicaOpcionalProdutoEditPart) {
			return ((CaracteristicaOpcionalProdutoEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof VariacaoDoisProdutoEditPart) {
			return ((VariacaoDoisProdutoEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof CaracteristicaAgrupadaProdutoEditPart) {
			return ((CaracteristicaAgrupadaProdutoEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof AtributoEditPart) {
			return ((AtributoEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof EntidadeDeContextoEditPart) {
			return ((EntidadeDeContextoEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof InformacaoDeContextoEditPart) {
			return ((InformacaoDeContextoEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof CasoDeUsoEditPart) {
			return ((CasoDeUsoEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof CasoDeTesteEditPart) {
			return ((CasoDeTesteEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof AtributoProdutoEditPart) {
			return ((AtributoProdutoEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof EstadoEditPart) {
			return ((EstadoEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof CaracteristicaOpcionalEditPart) {
			return ((CaracteristicaOpcionalEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof CaracteristicaAgrupadaEditPart) {
			return ((CaracteristicaAgrupadaEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof VariacaoDoisEditPart) {
			return ((VariacaoDoisEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof CaracteristicaRaizEditPart) {
			return ((CaracteristicaRaizEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof CaracteristicaMandatoriaEditPart) {
			return ((CaracteristicaMandatoriaEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ProdutoEditPart) {
			return ((ProdutoEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof EventoLogicoEditPart) {
			return ((EventoLogicoEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof AcaoLogicoEditPart) {
			return ((AcaoLogicoEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ExpressaoLogicaEditPart) {
			return ((ExpressaoLogicaEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof CaracteristicaMandatoriaProdutoEditPart) {
			return ((CaracteristicaMandatoriaProdutoEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof CaracteristicaOpcionalProdutoEditPart) {
			return ((CaracteristicaOpcionalProdutoEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof VariacaoDoisProdutoEditPart) {
			return ((VariacaoDoisProdutoEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof CaracteristicaAgrupadaProdutoEditPart) {
			return ((CaracteristicaAgrupadaProdutoEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof AtributoEditPart) {
			return ((AtributoEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof RaizDeContextoEditPart) {
			return ((RaizDeContextoEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof EntidadeDeContextoEditPart) {
			return ((EntidadeDeContextoEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof InformacaoDeContextoEditPart) {
			return ((InformacaoDeContextoEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof RegraDeComposicaoEditPart) {
			return ((RegraDeComposicaoEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof RegraDeContextoEditPart) {
			return ((RegraDeContextoEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof EstadoEditPart) {
			return ((EstadoEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof CaracteristicaOpcionalEditPart) {
			return ((CaracteristicaOpcionalEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof CaracteristicaAgrupadaEditPart) {
			return ((CaracteristicaAgrupadaEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof VariacaoDoisEditPart) {
			return ((VariacaoDoisEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof CaracteristicaRaizEditPart) {
			return ((CaracteristicaRaizEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof CaracteristicaMandatoriaEditPart) {
			return ((CaracteristicaMandatoriaEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ProdutoEditPart) {
			return ((ProdutoEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof EventoLogicoEditPart) {
			return ((EventoLogicoEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof EventoRelacionalEditPart) {
			return ((EventoRelacionalEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof AcaoLogicoEditPart) {
			return ((AcaoLogicoEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof LiteralAcaoEditPart) {
			return ((LiteralAcaoEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof DesignarEditPart) {
			return ((DesignarEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ExpressaoLogicaEditPart) {
			return ((ExpressaoLogicaEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ExpressaoRelacionalEditPart) {
			return ((ExpressaoRelacionalEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof LiteralComposicaoEditPart) {
			return ((LiteralComposicaoEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof CaracteristicaMandatoriaProdutoEditPart) {
			return ((CaracteristicaMandatoriaProdutoEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof CaracteristicaOpcionalProdutoEditPart) {
			return ((CaracteristicaOpcionalProdutoEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof VariacaoDoisProdutoEditPart) {
			return ((VariacaoDoisProdutoEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof CaracteristicaAgrupadaProdutoEditPart) {
			return ((CaracteristicaAgrupadaProdutoEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof AtributoEditPart) {
			return ((AtributoEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof EntidadeDeContextoEditPart) {
			return ((EntidadeDeContextoEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof InformacaoDeContextoEditPart) {
			return ((InformacaoDeContextoEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof CasoDeUsoEditPart) {
			return ((CasoDeUsoEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof CasoDeTesteEditPart) {
			return ((CasoDeTesteEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof AtributoProdutoEditPart) {
			return ((AtributoProdutoEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof EstadoEditPart) {
			return ((EstadoEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof CaracteristicaOpcionalEditPart) {
			return ((CaracteristicaOpcionalEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof CaracteristicaAgrupadaEditPart) {
			return ((CaracteristicaAgrupadaEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof VariacaoDoisEditPart) {
			return ((VariacaoDoisEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof CaracteristicaRaizEditPart) {
			return ((CaracteristicaRaizEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof CaracteristicaMandatoriaEditPart) {
			return ((CaracteristicaMandatoriaEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ProdutoEditPart) {
			return ((ProdutoEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof EventoLogicoEditPart) {
			return ((EventoLogicoEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof AcaoLogicoEditPart) {
			return ((AcaoLogicoEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ExpressaoLogicaEditPart) {
			return ((ExpressaoLogicaEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof CaracteristicaMandatoriaProdutoEditPart) {
			return ((CaracteristicaMandatoriaProdutoEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof CaracteristicaOpcionalProdutoEditPart) {
			return ((CaracteristicaOpcionalProdutoEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof VariacaoDoisProdutoEditPart) {
			return ((VariacaoDoisProdutoEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof CaracteristicaAgrupadaProdutoEditPart) {
			return ((CaracteristicaAgrupadaProdutoEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof AtributoEditPart) {
			return ((AtributoEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof RaizDeContextoEditPart) {
			return ((RaizDeContextoEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof EntidadeDeContextoEditPart) {
			return ((EntidadeDeContextoEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof InformacaoDeContextoEditPart) {
			return ((InformacaoDeContextoEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof RegraDeComposicaoEditPart) {
			return ((RegraDeComposicaoEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof RegraDeContextoEditPart) {
			return ((RegraDeContextoEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof EstadoEditPart) {
			return ((EstadoEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target,
			IElementType relationshipType) {
		return selectExistingElement(target,
				getTypesForSource(target, relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source,
			IElementType relationshipType) {
		return selectExistingElement(source,
				getTypesForTarget(source, relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		HashSet<EObject> elements = new HashSet<EObject>();
		for (Iterator<EObject> it = diagram.getElement().eAllContents(); it
				.hasNext();) {
			EObject element = it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements
				.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(
				element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
				CaracteristicaDiagramEditorPlugin.getInstance()
						.getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage(Messages.CaracteristicaModelingAssistantProviderMessage);
		dialog.setTitle(Messages.CaracteristicaModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
