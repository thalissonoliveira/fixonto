/*
 * 
 */
package caracteristica.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import caracteristica.diagram.edit.commands.AcaoLogicoCreateCommand;
import caracteristica.diagram.edit.commands.AtributoCreateCommand;
import caracteristica.diagram.edit.commands.AtributoProdutoCreateCommand;
import caracteristica.diagram.edit.commands.CaracteristicaAgrupadaCreateCommand;
import caracteristica.diagram.edit.commands.CaracteristicaAgrupadaProdutoCreateCommand;
import caracteristica.diagram.edit.commands.CaracteristicaMandatoriaCreateCommand;
import caracteristica.diagram.edit.commands.CaracteristicaMandatoriaProdutoCreateCommand;
import caracteristica.diagram.edit.commands.CaracteristicaOpcionalCreateCommand;
import caracteristica.diagram.edit.commands.CaracteristicaOpcionalProdutoCreateCommand;
import caracteristica.diagram.edit.commands.CaracteristicaRaizCreateCommand;
import caracteristica.diagram.edit.commands.CasoDeTesteCreateCommand;
import caracteristica.diagram.edit.commands.CasoDeUsoCreateCommand;
import caracteristica.diagram.edit.commands.DesignarCreateCommand;
import caracteristica.diagram.edit.commands.EntidadeDeContextoCreateCommand;
import caracteristica.diagram.edit.commands.EventoLogicoCreateCommand;
import caracteristica.diagram.edit.commands.EventoRelacionalCreateCommand;
import caracteristica.diagram.edit.commands.ExpressaoLogicaCreateCommand;
import caracteristica.diagram.edit.commands.ExpressaoRelacionalCreateCommand;
import caracteristica.diagram.edit.commands.InformacaoDeContextoCreateCommand;
import caracteristica.diagram.edit.commands.LiteralAcaoCreateCommand;
import caracteristica.diagram.edit.commands.LiteralComposicaoCreateCommand;
import caracteristica.diagram.edit.commands.ProdutoCreateCommand;
import caracteristica.diagram.edit.commands.RaizDeContextoCreateCommand;
import caracteristica.diagram.edit.commands.RegraDeComposicaoCreateCommand;
import caracteristica.diagram.edit.commands.RegraDeContextoCreateCommand;
import caracteristica.diagram.edit.commands.SimulacaoCreateCommand;
import caracteristica.diagram.edit.commands.VariacaoDoisCreateCommand;
import caracteristica.diagram.edit.commands.VariacaoDoisProdutoCreateCommand;
import caracteristica.diagram.providers.CaracteristicaElementTypes;

/**
 * @generated
 */
public class LPSItemSemanticEditPolicy extends CaracteristicaBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public LPSItemSemanticEditPolicy() {
		super(CaracteristicaElementTypes.LPS_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CaracteristicaElementTypes.CaracteristicaOpcional_2001 == req.getElementType()) {
			return getGEFWrapper(new CaracteristicaOpcionalCreateCommand(req));
		}
		if (CaracteristicaElementTypes.CaracteristicaAgrupada_2033 == req.getElementType()) {
			return getGEFWrapper(new CaracteristicaAgrupadaCreateCommand(req));
		}
		if (CaracteristicaElementTypes.VariacaoDois_2002 == req.getElementType()) {
			return getGEFWrapper(new VariacaoDoisCreateCommand(req));
		}
		if (CaracteristicaElementTypes.CaracteristicaRaiz_2003 == req.getElementType()) {
			return getGEFWrapper(new CaracteristicaRaizCreateCommand(req));
		}
		if (CaracteristicaElementTypes.CaracteristicaMandatoria_2004 == req.getElementType()) {
			return getGEFWrapper(new CaracteristicaMandatoriaCreateCommand(req));
		}
		if (CaracteristicaElementTypes.Produto_2005 == req.getElementType()) {
			return getGEFWrapper(new ProdutoCreateCommand(req));
		}
		if (CaracteristicaElementTypes.EventoLogico_2006 == req.getElementType()) {
			return getGEFWrapper(new EventoLogicoCreateCommand(req));
		}
		if (CaracteristicaElementTypes.EventoRelacional_2007 == req.getElementType()) {
			return getGEFWrapper(new EventoRelacionalCreateCommand(req));
		}
		if (CaracteristicaElementTypes.AcaoLogico_2008 == req.getElementType()) {
			return getGEFWrapper(new AcaoLogicoCreateCommand(req));
		}
		if (CaracteristicaElementTypes.LiteralAcao_2009 == req.getElementType()) {
			return getGEFWrapper(new LiteralAcaoCreateCommand(req));
		}
		if (CaracteristicaElementTypes.Designar_2010 == req.getElementType()) {
			return getGEFWrapper(new DesignarCreateCommand(req));
		}
		if (CaracteristicaElementTypes.ExpressaoLogica_2011 == req.getElementType()) {
			return getGEFWrapper(new ExpressaoLogicaCreateCommand(req));
		}
		if (CaracteristicaElementTypes.ExpressaoRelacional_2012 == req.getElementType()) {
			return getGEFWrapper(new ExpressaoRelacionalCreateCommand(req));
		}
		if (CaracteristicaElementTypes.LiteralComposicao_2013 == req.getElementType()) {
			return getGEFWrapper(new LiteralComposicaoCreateCommand(req));
		}
		if (CaracteristicaElementTypes.CaracteristicaMandatoriaProduto_2025 == req.getElementType()) {
			return getGEFWrapper(new CaracteristicaMandatoriaProdutoCreateCommand(req));
		}
		if (CaracteristicaElementTypes.CaracteristicaOpcionalProduto_2026 == req.getElementType()) {
			return getGEFWrapper(new CaracteristicaOpcionalProdutoCreateCommand(req));
		}
		if (CaracteristicaElementTypes.VariacaoDoisProduto_2027 == req.getElementType()) {
			return getGEFWrapper(new VariacaoDoisProdutoCreateCommand(req));
		}
		if (CaracteristicaElementTypes.CaracteristicaAgrupadaProduto_2035 == req.getElementType()) {
			return getGEFWrapper(new CaracteristicaAgrupadaProdutoCreateCommand(req));
		}
		if (CaracteristicaElementTypes.Atributo_2017 == req.getElementType()) {
			return getGEFWrapper(new AtributoCreateCommand(req));
		}
		if (CaracteristicaElementTypes.RaizDeContexto_2018 == req.getElementType()) {
			return getGEFWrapper(new RaizDeContextoCreateCommand(req));
		}
		if (CaracteristicaElementTypes.EntidadeDeContexto_2028 == req.getElementType()) {
			return getGEFWrapper(new EntidadeDeContextoCreateCommand(req));
		}
		if (CaracteristicaElementTypes.InformacaoDeContexto_2029 == req.getElementType()) {
			return getGEFWrapper(new InformacaoDeContextoCreateCommand(req));
		}
		if (CaracteristicaElementTypes.CasoDeUso_2038 == req.getElementType()) {
			return getGEFWrapper(new CasoDeUsoCreateCommand(req));
		}
		if (CaracteristicaElementTypes.CasoDeTeste_2039 == req.getElementType()) {
			return getGEFWrapper(new CasoDeTesteCreateCommand(req));
		}
		if (CaracteristicaElementTypes.RegraDeComposicao_2021 == req.getElementType()) {
			return getGEFWrapper(new RegraDeComposicaoCreateCommand(req));
		}
		if (CaracteristicaElementTypes.RegraDeContexto_2022 == req.getElementType()) {
			return getGEFWrapper(new RegraDeContextoCreateCommand(req));
		}
		if (CaracteristicaElementTypes.AtributoProduto_2030 == req.getElementType()) {
			return getGEFWrapper(new AtributoProdutoCreateCommand(req));
		}
		if (CaracteristicaElementTypes.Simulacao_2024 == req.getElementType()) {
			return getGEFWrapper(new SimulacaoCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
