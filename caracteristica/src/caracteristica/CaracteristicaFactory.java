/**
 */
package caracteristica;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see caracteristica.CaracteristicaPackage
 * @generated
 */
public interface CaracteristicaFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CaracteristicaFactory eINSTANCE = caracteristica.impl.CaracteristicaFactoryImpl.init();

  /**
   * Returns a new object of class '<em>LPS</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>LPS</em>'.
   * @generated
   */
  LPS createLPS();

  /**
   * Returns a new object of class '<em>Elemento</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Elemento</em>'.
   * @generated
   */
  Elemento createElemento();

  /**
   * Returns a new object of class '<em>Elemento Caracteristico</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Elemento Caracteristico</em>'.
   * @generated
   */
  ElementoCaracteristico createElementoCaracteristico();

  /**
   * Returns a new object of class '<em>Atributo</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Atributo</em>'.
   * @generated
   */
  Atributo createAtributo();

  /**
   * Returns a new object of class '<em>Caracteristica</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Caracteristica</em>'.
   * @generated
   */
  Caracteristica createCaracteristica();

  /**
   * Returns a new object of class '<em>Raiz</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Raiz</em>'.
   * @generated
   */
  CaracteristicaRaiz createCaracteristicaRaiz();

  /**
   * Returns a new object of class '<em>Opcional</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Opcional</em>'.
   * @generated
   */
  CaracteristicaOpcional createCaracteristicaOpcional();

  /**
   * Returns a new object of class '<em>Agrupada</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Agrupada</em>'.
   * @generated
   */
  CaracteristicaAgrupada createCaracteristicaAgrupada();

  /**
   * Returns a new object of class '<em>Mandatoria</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mandatoria</em>'.
   * @generated
   */
  CaracteristicaMandatoria createCaracteristicaMandatoria();

  /**
   * Returns a new object of class '<em>Variacao Dois</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variacao Dois</em>'.
   * @generated
   */
  VariacaoDois createVariacaoDois();

  /**
   * Returns a new object of class '<em>Ponto De Variacao</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ponto De Variacao</em>'.
   * @generated
   */
  PontoDeVariacao createPontoDeVariacao();

  /**
   * Returns a new object of class '<em>Variacao</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variacao</em>'.
   * @generated
   */
  Variacao createVariacao();

  /**
   * Returns a new object of class '<em>Variante</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variante</em>'.
   * @generated
   */
  Variante createVariante();

  /**
   * Returns a new object of class '<em>Raiz De Contexto</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Raiz De Contexto</em>'.
   * @generated
   */
  RaizDeContexto createRaizDeContexto();

  /**
   * Returns a new object of class '<em>Entidade De Contexto</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entidade De Contexto</em>'.
   * @generated
   */
  EntidadeDeContexto createEntidadeDeContexto();

  /**
   * Returns a new object of class '<em>Informacao De Contexto</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Informacao De Contexto</em>'.
   * @generated
   */
  InformacaoDeContexto createInformacaoDeContexto();

  /**
   * Returns a new object of class '<em>Elemento De Produto</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Elemento De Produto</em>'.
   * @generated
   */
  ElementoDeProduto createElementoDeProduto();

  /**
   * Returns a new object of class '<em>Produto</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Produto</em>'.
   * @generated
   */
  CaracteristicaProduto createCaracteristicaProduto();

  /**
   * Returns a new object of class '<em>Atributo Produto</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Atributo Produto</em>'.
   * @generated
   */
  AtributoProduto createAtributoProduto();

  /**
   * Returns a new object of class '<em>Mandatoria Produto</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mandatoria Produto</em>'.
   * @generated
   */
  CaracteristicaMandatoriaProduto createCaracteristicaMandatoriaProduto();

  /**
   * Returns a new object of class '<em>Opcional Produto</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Opcional Produto</em>'.
   * @generated
   */
  CaracteristicaOpcionalProduto createCaracteristicaOpcionalProduto();

  /**
   * Returns a new object of class '<em>Variacao Dois Produto</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variacao Dois Produto</em>'.
   * @generated
   */
  VariacaoDoisProduto createVariacaoDoisProduto();

  /**
   * Returns a new object of class '<em>Agrupada Produto</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Agrupada Produto</em>'.
   * @generated
   */
	CaracteristicaAgrupadaProduto createCaracteristicaAgrupadaProduto();

		/**
   * Returns a new object of class '<em>Variacao Produto</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variacao Produto</em>'.
   * @generated
   */
  VariacaoProduto createVariacaoProduto();

  /**
   * Returns a new object of class '<em>Variante Produto</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variante Produto</em>'.
   * @generated
   */
  VarianteProduto createVarianteProduto();

  /**
   * Returns a new object of class '<em>Produto</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Produto</em>'.
   * @generated
   */
  Produto createProduto();

  /**
   * Returns a new object of class '<em>Regra</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Regra</em>'.
   * @generated
   */
  Regra createRegra();

  /**
   * Returns a new object of class '<em>Regra De Composicao</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Regra De Composicao</em>'.
   * @generated
   */
  RegraDeComposicao createRegraDeComposicao();

  /**
   * Returns a new object of class '<em>Regra De Contexto</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Regra De Contexto</em>'.
   * @generated
   */
  RegraDeContexto createRegraDeContexto();

  /**
   * Returns a new object of class '<em>Evento</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Evento</em>'.
   * @generated
   */
  Evento createEvento();

  /**
   * Returns a new object of class '<em>Evento Logico</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Evento Logico</em>'.
   * @generated
   */
  EventoLogico createEventoLogico();

  /**
   * Returns a new object of class '<em>Evento Relacional</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Evento Relacional</em>'.
   * @generated
   */
  EventoRelacional createEventoRelacional();

  /**
   * Returns a new object of class '<em>Acao</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Acao</em>'.
   * @generated
   */
  Acao createAcao();

  /**
   * Returns a new object of class '<em>Acao Logico</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Acao Logico</em>'.
   * @generated
   */
  AcaoLogico createAcaoLogico();

  /**
   * Returns a new object of class '<em>Literal Acao</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal Acao</em>'.
   * @generated
   */
  LiteralAcao createLiteralAcao();

  /**
   * Returns a new object of class '<em>Designar</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Designar</em>'.
   * @generated
   */
  Designar createDesignar();

  /**
   * Returns a new object of class '<em>Expressao</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expressao</em>'.
   * @generated
   */
  Expressao createExpressao();

  /**
   * Returns a new object of class '<em>Antecedente</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Antecedente</em>'.
   * @generated
   */
  Antecedente createAntecedente();

  /**
   * Returns a new object of class '<em>Expressao Logica</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expressao Logica</em>'.
   * @generated
   */
  ExpressaoLogica createExpressaoLogica();

  /**
   * Returns a new object of class '<em>Expressao Relacional</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expressao Relacional</em>'.
   * @generated
   */
  ExpressaoRelacional createExpressaoRelacional();

  /**
   * Returns a new object of class '<em>Literal Composicao</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal Composicao</em>'.
   * @generated
   */
  LiteralComposicao createLiteralComposicao();

  /**
   * Returns a new object of class '<em>Simulacao</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simulacao</em>'.
   * @generated
   */
  Simulacao createSimulacao();

  /**
   * Returns a new object of class '<em>Transicao</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transicao</em>'.
   * @generated
   */
  Transicao createTransicao();

  /**
   * Returns a new object of class '<em>Estado</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Estado</em>'.
   * @generated
   */
  Estado createEstado();

  /**
   * Returns a new object of class '<em>Inconsistencia Regra Adaptacao</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Inconsistencia Regra Adaptacao</em>'.
   * @generated
   */
  InconsistenciaRegraAdaptacao createInconsistenciaRegraAdaptacao();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  CaracteristicaPackage getCaracteristicaPackage();

} //CaracteristicaFactory
