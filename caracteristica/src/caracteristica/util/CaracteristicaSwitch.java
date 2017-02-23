/**
 */
package caracteristica.util;

import caracteristica.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see caracteristica.CaracteristicaPackage
 * @generated
 */
public class CaracteristicaSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static CaracteristicaPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CaracteristicaSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = CaracteristicaPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case CaracteristicaPackage.LPS:
      {
        LPS lps = (LPS)theEObject;
        T result = caseLPS(lps);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CaracteristicaPackage.ELEMENTO:
      {
        Elemento elemento = (Elemento)theEObject;
        T result = caseElemento(elemento);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CaracteristicaPackage.ELEMENTO_CARACTERISTICO:
      {
        ElementoCaracteristico elementoCaracteristico = (ElementoCaracteristico)theEObject;
        T result = caseElementoCaracteristico(elementoCaracteristico);
        if (result == null) result = caseElemento(elementoCaracteristico);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CaracteristicaPackage.ATRIBUTO:
      {
        Atributo atributo = (Atributo)theEObject;
        T result = caseAtributo(atributo);
        if (result == null) result = caseElemento(atributo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CaracteristicaPackage.CARACTERISTICA:
      {
        Caracteristica caracteristica = (Caracteristica)theEObject;
        T result = caseCaracteristica(caracteristica);
        if (result == null) result = caseElemento(caracteristica);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CaracteristicaPackage.CARACTERISTICA_RAIZ:
      {
        CaracteristicaRaiz caracteristicaRaiz = (CaracteristicaRaiz)theEObject;
        T result = caseCaracteristicaRaiz(caracteristicaRaiz);
        if (result == null) result = caseCaracteristica(caracteristicaRaiz);
        if (result == null) result = caseElemento(caracteristicaRaiz);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CaracteristicaPackage.CARACTERISTICA_OPCIONAL:
      {
        CaracteristicaOpcional caracteristicaOpcional = (CaracteristicaOpcional)theEObject;
        T result = caseCaracteristicaOpcional(caracteristicaOpcional);
        if (result == null) result = caseCaracteristica(caracteristicaOpcional);
        if (result == null) result = caseElementoCaracteristico(caracteristicaOpcional);
        if (result == null) result = caseElemento(caracteristicaOpcional);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CaracteristicaPackage.CARACTERISTICA_AGRUPADA:
      {
        CaracteristicaAgrupada caracteristicaAgrupada = (CaracteristicaAgrupada)theEObject;
        T result = caseCaracteristicaAgrupada(caracteristicaAgrupada);
        if (result == null) result = caseCaracteristica(caracteristicaAgrupada);
        if (result == null) result = caseElementoCaracteristico(caracteristicaAgrupada);
        if (result == null) result = caseElemento(caracteristicaAgrupada);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CaracteristicaPackage.CARACTERISTICA_MANDATORIA:
      {
        CaracteristicaMandatoria caracteristicaMandatoria = (CaracteristicaMandatoria)theEObject;
        T result = caseCaracteristicaMandatoria(caracteristicaMandatoria);
        if (result == null) result = caseCaracteristica(caracteristicaMandatoria);
        if (result == null) result = caseElemento(caracteristicaMandatoria);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CaracteristicaPackage.VARIACAO_DOIS:
      {
        VariacaoDois variacaoDois = (VariacaoDois)theEObject;
        T result = caseVariacaoDois(variacaoDois);
        if (result == null) result = caseCaracteristica(variacaoDois);
        if (result == null) result = caseElementoCaracteristico(variacaoDois);
        if (result == null) result = caseElemento(variacaoDois);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CaracteristicaPackage.PONTO_DE_VARIACAO:
      {
        PontoDeVariacao pontoDeVariacao = (PontoDeVariacao)theEObject;
        T result = casePontoDeVariacao(pontoDeVariacao);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CaracteristicaPackage.VARIACAO:
      {
        Variacao variacao = (Variacao)theEObject;
        T result = caseVariacao(variacao);
        if (result == null) result = casePontoDeVariacao(variacao);
        if (result == null) result = caseElemento(variacao);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CaracteristicaPackage.VARIANTE:
      {
        Variante variante = (Variante)theEObject;
        T result = caseVariante(variante);
        if (result == null) result = casePontoDeVariacao(variante);
        if (result == null) result = caseElementoCaracteristico(variante);
        if (result == null) result = caseCaracteristica(variante);
        if (result == null) result = caseElemento(variante);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CaracteristicaPackage.CONTEXTO:
      {
        Contexto contexto = (Contexto)theEObject;
        T result = caseContexto(contexto);
        if (result == null) result = caseElemento(contexto);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CaracteristicaPackage.RAIZ_DE_CONTEXTO:
      {
        RaizDeContexto raizDeContexto = (RaizDeContexto)theEObject;
        T result = caseRaizDeContexto(raizDeContexto);
        if (result == null) result = caseContexto(raizDeContexto);
        if (result == null) result = caseElemento(raizDeContexto);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CaracteristicaPackage.ENTIDADE_DE_CONTEXTO:
      {
        EntidadeDeContexto entidadeDeContexto = (EntidadeDeContexto)theEObject;
        T result = caseEntidadeDeContexto(entidadeDeContexto);
        if (result == null) result = caseContexto(entidadeDeContexto);
        if (result == null) result = caseElemento(entidadeDeContexto);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CaracteristicaPackage.INFORMACAO_DE_CONTEXTO:
      {
        InformacaoDeContexto informacaoDeContexto = (InformacaoDeContexto)theEObject;
        T result = caseInformacaoDeContexto(informacaoDeContexto);
        if (result == null) result = caseContexto(informacaoDeContexto);
        if (result == null) result = caseElemento(informacaoDeContexto);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CaracteristicaPackage.REGRA:
      {
        Regra regra = (Regra)theEObject;
        T result = caseRegra(regra);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CaracteristicaPackage.REGRA_DE_COMPOSICAO:
      {
        RegraDeComposicao regraDeComposicao = (RegraDeComposicao)theEObject;
        T result = caseRegraDeComposicao(regraDeComposicao);
        if (result == null) result = caseRegra(regraDeComposicao);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CaracteristicaPackage.EXPRESSAO:
      {
        Expressao expressao = (Expressao)theEObject;
        T result = caseExpressao(expressao);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CaracteristicaPackage.ANTECEDENTE:
      {
        Antecedente antecedente = (Antecedente)theEObject;
        T result = caseAntecedente(antecedente);
        if (result == null) result = caseExpressao(antecedente);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CaracteristicaPackage.EXPRESSAO_LOGICA:
      {
        ExpressaoLogica expressaoLogica = (ExpressaoLogica)theEObject;
        T result = caseExpressaoLogica(expressaoLogica);
        if (result == null) result = caseAntecedente(expressaoLogica);
        if (result == null) result = caseExpressao(expressaoLogica);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CaracteristicaPackage.EXPRESSAO_RELACIONAL:
      {
        ExpressaoRelacional expressaoRelacional = (ExpressaoRelacional)theEObject;
        T result = caseExpressaoRelacional(expressaoRelacional);
        if (result == null) result = caseAntecedente(expressaoRelacional);
        if (result == null) result = caseExpressao(expressaoRelacional);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CaracteristicaPackage.LITERAL_COMPOSICAO:
      {
        LiteralComposicao literalComposicao = (LiteralComposicao)theEObject;
        T result = caseLiteralComposicao(literalComposicao);
        if (result == null) result = caseAntecedente(literalComposicao);
        if (result == null) result = caseExpressao(literalComposicao);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>LPS</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>LPS</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLPS(LPS object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Elemento</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Elemento</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElemento(Elemento object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Elemento Caracteristico</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Elemento Caracteristico</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElementoCaracteristico(ElementoCaracteristico object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Atributo</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Atributo</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtributo(Atributo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Caracteristica</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Caracteristica</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCaracteristica(Caracteristica object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Raiz</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Raiz</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCaracteristicaRaiz(CaracteristicaRaiz object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Opcional</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Opcional</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCaracteristicaOpcional(CaracteristicaOpcional object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Agrupada</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Agrupada</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCaracteristicaAgrupada(CaracteristicaAgrupada object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mandatoria</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mandatoria</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCaracteristicaMandatoria(CaracteristicaMandatoria object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variacao Dois</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variacao Dois</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariacaoDois(VariacaoDois object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ponto De Variacao</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ponto De Variacao</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePontoDeVariacao(PontoDeVariacao object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variacao</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variacao</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariacao(Variacao object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variante</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variante</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariante(Variante object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Contexto</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Contexto</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContexto(Contexto object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Raiz De Contexto</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Raiz De Contexto</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRaizDeContexto(RaizDeContexto object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entidade De Contexto</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entidade De Contexto</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntidadeDeContexto(EntidadeDeContexto object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Informacao De Contexto</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Informacao De Contexto</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInformacaoDeContexto(InformacaoDeContexto object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Regra</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Regra</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRegra(Regra object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Regra De Composicao</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Regra De Composicao</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRegraDeComposicao(RegraDeComposicao object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expressao</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expressao</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpressao(Expressao object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Antecedente</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Antecedente</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAntecedente(Antecedente object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expressao Logica</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expressao Logica</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpressaoLogica(ExpressaoLogica object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expressao Relacional</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expressao Relacional</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpressaoRelacional(ExpressaoRelacional object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Literal Composicao</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Literal Composicao</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLiteralComposicao(LiteralComposicao object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //CaracteristicaSwitch
