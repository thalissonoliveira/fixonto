/**
 */
package caracteristica.util;

import caracteristica.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see caracteristica.CaracteristicaPackage
 * @generated
 */
public class CaracteristicaAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static CaracteristicaPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CaracteristicaAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = CaracteristicaPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CaracteristicaSwitch<Adapter> modelSwitch =
    new CaracteristicaSwitch<Adapter>()
    {
      @Override
      public Adapter caseLPS(LPS object)
      {
        return createLPSAdapter();
      }
      @Override
      public Adapter caseElemento(Elemento object)
      {
        return createElementoAdapter();
      }
      @Override
      public Adapter caseElementoExterno(ElementoExterno object)
      {
        return createElementoExternoAdapter();
      }
      @Override
      public Adapter caseCasoDeUso(CasoDeUso object)
      {
        return createCasoDeUsoAdapter();
      }
      @Override
      public Adapter caseCasoDeTeste(CasoDeTeste object)
      {
        return createCasoDeTesteAdapter();
      }
      @Override
      public Adapter caseElementoCaracteristico(ElementoCaracteristico object)
      {
        return createElementoCaracteristicoAdapter();
      }
      @Override
      public Adapter caseAtributo(Atributo object)
      {
        return createAtributoAdapter();
      }
      @Override
      public Adapter caseCaracteristica(Caracteristica object)
      {
        return createCaracteristicaAdapter();
      }
      @Override
      public Adapter caseCaracteristicaRaiz(CaracteristicaRaiz object)
      {
        return createCaracteristicaRaizAdapter();
      }
      @Override
      public Adapter caseCaracteristicaOpcional(CaracteristicaOpcional object)
      {
        return createCaracteristicaOpcionalAdapter();
      }
      @Override
      public Adapter caseCaracteristicaAgrupada(CaracteristicaAgrupada object)
      {
        return createCaracteristicaAgrupadaAdapter();
      }
      @Override
      public Adapter caseCaracteristicaMandatoria(CaracteristicaMandatoria object)
      {
        return createCaracteristicaMandatoriaAdapter();
      }
      @Override
      public Adapter caseVariacaoDois(VariacaoDois object)
      {
        return createVariacaoDoisAdapter();
      }
      @Override
      public Adapter casePontoDeVariacao(PontoDeVariacao object)
      {
        return createPontoDeVariacaoAdapter();
      }
      @Override
      public Adapter caseVariacao(Variacao object)
      {
        return createVariacaoAdapter();
      }
      @Override
      public Adapter caseVariante(Variante object)
      {
        return createVarianteAdapter();
      }
      @Override
      public Adapter caseRaizDeContexto(RaizDeContexto object)
      {
        return createRaizDeContextoAdapter();
      }
      @Override
      public Adapter caseEntidadeDeContexto(EntidadeDeContexto object)
      {
        return createEntidadeDeContextoAdapter();
      }
      @Override
      public Adapter caseInformacaoDeContexto(InformacaoDeContexto object)
      {
        return createInformacaoDeContextoAdapter();
      }
      @Override
      public Adapter caseElementoDeProduto(ElementoDeProduto object)
      {
        return createElementoDeProdutoAdapter();
      }
      @Override
      public Adapter caseCaracteristicaProduto(CaracteristicaProduto object)
      {
        return createCaracteristicaProdutoAdapter();
      }
      @Override
      public Adapter caseAtributoProduto(AtributoProduto object)
      {
        return createAtributoProdutoAdapter();
      }
      @Override
      public Adapter caseCaracteristicaMandatoriaProduto(CaracteristicaMandatoriaProduto object)
      {
        return createCaracteristicaMandatoriaProdutoAdapter();
      }
      @Override
      public Adapter caseCaracteristicaOpcionalProduto(CaracteristicaOpcionalProduto object)
      {
        return createCaracteristicaOpcionalProdutoAdapter();
      }
      @Override
      public Adapter caseVariacaoDoisProduto(VariacaoDoisProduto object)
      {
        return createVariacaoDoisProdutoAdapter();
      }
      @Override
      public Adapter caseCaracteristicaAgrupadaProduto(CaracteristicaAgrupadaProduto object)
      {
        return createCaracteristicaAgrupadaProdutoAdapter();
      }
      @Override
      public Adapter caseVariacaoProduto(VariacaoProduto object)
      {
        return createVariacaoProdutoAdapter();
      }
      @Override
      public Adapter caseVarianteProduto(VarianteProduto object)
      {
        return createVarianteProdutoAdapter();
      }
      @Override
      public Adapter caseProduto(Produto object)
      {
        return createProdutoAdapter();
      }
      @Override
      public Adapter caseRegra(Regra object)
      {
        return createRegraAdapter();
      }
      @Override
      public Adapter caseRegraDeComposicao(RegraDeComposicao object)
      {
        return createRegraDeComposicaoAdapter();
      }
      @Override
      public Adapter caseRegraDeContexto(RegraDeContexto object)
      {
        return createRegraDeContextoAdapter();
      }
      @Override
      public Adapter caseEvento(Evento object)
      {
        return createEventoAdapter();
      }
      @Override
      public Adapter caseEventoLogico(EventoLogico object)
      {
        return createEventoLogicoAdapter();
      }
      @Override
      public Adapter caseEventoRelacional(EventoRelacional object)
      {
        return createEventoRelacionalAdapter();
      }
      @Override
      public Adapter caseAcao(Acao object)
      {
        return createAcaoAdapter();
      }
      @Override
      public Adapter caseAcaoLogico(AcaoLogico object)
      {
        return createAcaoLogicoAdapter();
      }
      @Override
      public Adapter caseLiteralAcao(LiteralAcao object)
      {
        return createLiteralAcaoAdapter();
      }
      @Override
      public Adapter caseDesignar(Designar object)
      {
        return createDesignarAdapter();
      }
      @Override
      public Adapter caseExpressao(Expressao object)
      {
        return createExpressaoAdapter();
      }
      @Override
      public Adapter caseAntecedente(Antecedente object)
      {
        return createAntecedenteAdapter();
      }
      @Override
      public Adapter caseExpressaoLogica(ExpressaoLogica object)
      {
        return createExpressaoLogicaAdapter();
      }
      @Override
      public Adapter caseExpressaoRelacional(ExpressaoRelacional object)
      {
        return createExpressaoRelacionalAdapter();
      }
      @Override
      public Adapter caseLiteralComposicao(LiteralComposicao object)
      {
        return createLiteralComposicaoAdapter();
      }
      @Override
      public Adapter caseSimulacao(Simulacao object)
      {
        return createSimulacaoAdapter();
      }
      @Override
      public Adapter caseTransicao(Transicao object)
      {
        return createTransicaoAdapter();
      }
      @Override
      public Adapter caseEstado(Estado object)
      {
        return createEstadoAdapter();
      }
      @Override
      public Adapter caseInconsistenciaRegraAdaptacao(InconsistenciaRegraAdaptacao object)
      {
        return createInconsistenciaRegraAdaptacaoAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link caracteristica.LPS <em>LPS</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see caracteristica.LPS
   * @generated
   */
  public Adapter createLPSAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link caracteristica.Elemento <em>Elemento</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see caracteristica.Elemento
   * @generated
   */
  public Adapter createElementoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link caracteristica.ElementoExterno <em>Elemento Externo</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see caracteristica.ElementoExterno
   * @generated
   */
  public Adapter createElementoExternoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link caracteristica.CasoDeUso <em>Caso De Uso</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see caracteristica.CasoDeUso
   * @generated
   */
  public Adapter createCasoDeUsoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link caracteristica.CasoDeTeste <em>Caso De Teste</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see caracteristica.CasoDeTeste
   * @generated
   */
  public Adapter createCasoDeTesteAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link caracteristica.ElementoCaracteristico <em>Elemento Caracteristico</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see caracteristica.ElementoCaracteristico
   * @generated
   */
  public Adapter createElementoCaracteristicoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link caracteristica.Atributo <em>Atributo</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see caracteristica.Atributo
   * @generated
   */
  public Adapter createAtributoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link caracteristica.Caracteristica <em>Caracteristica</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see caracteristica.Caracteristica
   * @generated
   */
  public Adapter createCaracteristicaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link caracteristica.CaracteristicaRaiz <em>Raiz</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see caracteristica.CaracteristicaRaiz
   * @generated
   */
  public Adapter createCaracteristicaRaizAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link caracteristica.CaracteristicaOpcional <em>Opcional</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see caracteristica.CaracteristicaOpcional
   * @generated
   */
  public Adapter createCaracteristicaOpcionalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link caracteristica.CaracteristicaAgrupada <em>Agrupada</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see caracteristica.CaracteristicaAgrupada
   * @generated
   */
  public Adapter createCaracteristicaAgrupadaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link caracteristica.CaracteristicaMandatoria <em>Mandatoria</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see caracteristica.CaracteristicaMandatoria
   * @generated
   */
  public Adapter createCaracteristicaMandatoriaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link caracteristica.VariacaoDois <em>Variacao Dois</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see caracteristica.VariacaoDois
   * @generated
   */
  public Adapter createVariacaoDoisAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link caracteristica.PontoDeVariacao <em>Ponto De Variacao</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see caracteristica.PontoDeVariacao
   * @generated
   */
  public Adapter createPontoDeVariacaoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link caracteristica.Variacao <em>Variacao</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see caracteristica.Variacao
   * @generated
   */
  public Adapter createVariacaoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link caracteristica.Variante <em>Variante</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see caracteristica.Variante
   * @generated
   */
  public Adapter createVarianteAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link caracteristica.RaizDeContexto <em>Raiz De Contexto</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see caracteristica.RaizDeContexto
   * @generated
   */
  public Adapter createRaizDeContextoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link caracteristica.EntidadeDeContexto <em>Entidade De Contexto</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see caracteristica.EntidadeDeContexto
   * @generated
   */
  public Adapter createEntidadeDeContextoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link caracteristica.InformacaoDeContexto <em>Informacao De Contexto</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see caracteristica.InformacaoDeContexto
   * @generated
   */
  public Adapter createInformacaoDeContextoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link caracteristica.ElementoDeProduto <em>Elemento De Produto</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see caracteristica.ElementoDeProduto
   * @generated
   */
  public Adapter createElementoDeProdutoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link caracteristica.CaracteristicaProduto <em>Produto</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see caracteristica.CaracteristicaProduto
   * @generated
   */
  public Adapter createCaracteristicaProdutoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link caracteristica.AtributoProduto <em>Atributo Produto</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see caracteristica.AtributoProduto
   * @generated
   */
  public Adapter createAtributoProdutoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link caracteristica.CaracteristicaMandatoriaProduto <em>Mandatoria Produto</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see caracteristica.CaracteristicaMandatoriaProduto
   * @generated
   */
  public Adapter createCaracteristicaMandatoriaProdutoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link caracteristica.CaracteristicaOpcionalProduto <em>Opcional Produto</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see caracteristica.CaracteristicaOpcionalProduto
   * @generated
   */
  public Adapter createCaracteristicaOpcionalProdutoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link caracteristica.VariacaoDoisProduto <em>Variacao Dois Produto</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see caracteristica.VariacaoDoisProduto
   * @generated
   */
  public Adapter createVariacaoDoisProdutoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link caracteristica.CaracteristicaAgrupadaProduto <em>Agrupada Produto</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see caracteristica.CaracteristicaAgrupadaProduto
   * @generated
   */
	public Adapter createCaracteristicaAgrupadaProdutoAdapter() {
    return null;
  }

		/**
   * Creates a new adapter for an object of class '{@link caracteristica.VariacaoProduto <em>Variacao Produto</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see caracteristica.VariacaoProduto
   * @generated
   */
  public Adapter createVariacaoProdutoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link caracteristica.VarianteProduto <em>Variante Produto</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see caracteristica.VarianteProduto
   * @generated
   */
  public Adapter createVarianteProdutoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link caracteristica.Produto <em>Produto</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see caracteristica.Produto
   * @generated
   */
  public Adapter createProdutoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link caracteristica.Regra <em>Regra</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see caracteristica.Regra
   * @generated
   */
  public Adapter createRegraAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link caracteristica.RegraDeComposicao <em>Regra De Composicao</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see caracteristica.RegraDeComposicao
   * @generated
   */
  public Adapter createRegraDeComposicaoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link caracteristica.RegraDeContexto <em>Regra De Contexto</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see caracteristica.RegraDeContexto
   * @generated
   */
  public Adapter createRegraDeContextoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link caracteristica.Evento <em>Evento</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see caracteristica.Evento
   * @generated
   */
  public Adapter createEventoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link caracteristica.EventoLogico <em>Evento Logico</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see caracteristica.EventoLogico
   * @generated
   */
  public Adapter createEventoLogicoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link caracteristica.EventoRelacional <em>Evento Relacional</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see caracteristica.EventoRelacional
   * @generated
   */
  public Adapter createEventoRelacionalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link caracteristica.Acao <em>Acao</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see caracteristica.Acao
   * @generated
   */
  public Adapter createAcaoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link caracteristica.AcaoLogico <em>Acao Logico</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see caracteristica.AcaoLogico
   * @generated
   */
  public Adapter createAcaoLogicoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link caracteristica.LiteralAcao <em>Literal Acao</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see caracteristica.LiteralAcao
   * @generated
   */
  public Adapter createLiteralAcaoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link caracteristica.Designar <em>Designar</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see caracteristica.Designar
   * @generated
   */
  public Adapter createDesignarAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link caracteristica.Expressao <em>Expressao</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see caracteristica.Expressao
   * @generated
   */
  public Adapter createExpressaoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link caracteristica.Antecedente <em>Antecedente</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see caracteristica.Antecedente
   * @generated
   */
  public Adapter createAntecedenteAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link caracteristica.ExpressaoLogica <em>Expressao Logica</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see caracteristica.ExpressaoLogica
   * @generated
   */
  public Adapter createExpressaoLogicaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link caracteristica.ExpressaoRelacional <em>Expressao Relacional</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see caracteristica.ExpressaoRelacional
   * @generated
   */
  public Adapter createExpressaoRelacionalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link caracteristica.LiteralComposicao <em>Literal Composicao</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see caracteristica.LiteralComposicao
   * @generated
   */
  public Adapter createLiteralComposicaoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link caracteristica.Simulacao <em>Simulacao</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see caracteristica.Simulacao
   * @generated
   */
  public Adapter createSimulacaoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link caracteristica.Transicao <em>Transicao</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see caracteristica.Transicao
   * @generated
   */
  public Adapter createTransicaoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link caracteristica.Estado <em>Estado</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see caracteristica.Estado
   * @generated
   */
  public Adapter createEstadoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link caracteristica.InconsistenciaRegraAdaptacao <em>Inconsistencia Regra Adaptacao</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see caracteristica.InconsistenciaRegraAdaptacao
   * @generated
   */
  public Adapter createInconsistenciaRegraAdaptacaoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //CaracteristicaAdapterFactory
