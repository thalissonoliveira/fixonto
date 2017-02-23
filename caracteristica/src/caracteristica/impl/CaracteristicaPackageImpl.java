/**
 */
package caracteristica.impl;

import caracteristica.Antecedente;
import caracteristica.Atributo;
import caracteristica.Caracteristica;
import caracteristica.CaracteristicaAgrupada;
import caracteristica.CaracteristicaFactory;
import caracteristica.CaracteristicaMandatoria;
import caracteristica.CaracteristicaOpcional;
import caracteristica.CaracteristicaPackage;
import caracteristica.CaracteristicaRaiz;
import caracteristica.CardinalidadeMaxima;
import caracteristica.Contexto;
import caracteristica.Elemento;
import caracteristica.ElementoCaracteristico;
import caracteristica.EntidadeDeContexto;
import caracteristica.Expressao;
import caracteristica.ExpressaoLogica;
import caracteristica.ExpressaoRelacional;
import caracteristica.InformacaoDeContexto;
import caracteristica.LiteralComposicao;
import caracteristica.OperadorAcaoLogico;
import caracteristica.OperadorLogico;
import caracteristica.OperadorRelacional;
import caracteristica.Origem;
import caracteristica.PontoDeVariacao;
import caracteristica.Presenca;
import caracteristica.Qualidade;
import caracteristica.RaizDeContexto;
import caracteristica.Regra;
import caracteristica.RegraDeComposicao;
import caracteristica.TipoValor;
import caracteristica.Validade;
import caracteristica.Variacao;
import caracteristica.VariacaoDois;
import caracteristica.Variante;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CaracteristicaPackageImpl extends EPackageImpl implements CaracteristicaPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lpsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementoCaracteristicoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass atributoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass caracteristicaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass caracteristicaRaizEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass caracteristicaOpcionalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass caracteristicaAgrupadaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass caracteristicaMandatoriaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variacaoDoisEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pontoDeVariacaoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variacaoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass varianteEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass contextoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass raizDeContextoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entidadeDeContextoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass informacaoDeContextoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass regraEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass regraDeComposicaoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressaoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass antecedenteEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressaoLogicaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressaoRelacionalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass literalComposicaoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum origemEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum validadeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum qualidadeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum tipoValorEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum operadorLogicoEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum operadorAcaoLogicoEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum cardinalidadeMaximaEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum operadorRelacionalEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum presencaEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see caracteristica.CaracteristicaPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private CaracteristicaPackageImpl()
  {
    super(eNS_URI, CaracteristicaFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link CaracteristicaPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static CaracteristicaPackage init()
  {
    if (isInited) return (CaracteristicaPackage)EPackage.Registry.INSTANCE.getEPackage(CaracteristicaPackage.eNS_URI);

    // Obtain or create and register package
    CaracteristicaPackageImpl theCaracteristicaPackage = (CaracteristicaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CaracteristicaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CaracteristicaPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theCaracteristicaPackage.createPackageContents();

    // Initialize created meta-data
    theCaracteristicaPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theCaracteristicaPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(CaracteristicaPackage.eNS_URI, theCaracteristicaPackage);
    return theCaracteristicaPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLPS()
  {
    return lpsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLPS_Elementos()
  {
    return (EReference)lpsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLPS_Regras()
  {
    return (EReference)lpsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLPS_Expressoes()
  {
    return (EReference)lpsEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLPS_Nome()
  {
    return (EAttribute)lpsEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElemento()
  {
    return elementoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getElemento_Nome()
  {
    return (EAttribute)elementoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElementoCaracteristico()
  {
    return elementoCaracteristicoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAtributo()
  {
    return atributoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAtributo_TipoValor()
  {
    return (EAttribute)atributoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAtributo_CaracteristicaPai()
  {
    return (EReference)atributoEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCaracteristica()
  {
    return caracteristicaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCaracteristica_CaracteristicaPai()
  {
    return (EReference)caracteristicaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCaracteristica_CaracteristicaFilha()
  {
    return (EReference)caracteristicaEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCaracteristica_Variacoes()
  {
    return (EReference)caracteristicaEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCaracteristica_Atributo()
  {
    return (EReference)caracteristicaEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCaracteristicaRaiz()
  {
    return caracteristicaRaizEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCaracteristicaRaiz_LpsDoSistema()
  {
    return (EReference)caracteristicaRaizEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCaracteristicaOpcional()
  {
    return caracteristicaOpcionalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCaracteristicaAgrupada()
  {
    return caracteristicaAgrupadaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCaracteristicaMandatoria()
  {
    return caracteristicaMandatoriaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariacaoDois()
  {
    return variacaoDoisEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariacaoDois_CardinalidadeMaxima()
  {
    return (EAttribute)variacaoDoisEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariacaoDois_CardinalidadeMinimaOr()
  {
    return (EAttribute)variacaoDoisEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariacaoDois_CardinalidadeMaximaOr()
  {
    return (EAttribute)variacaoDoisEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPontoDeVariacao()
  {
    return pontoDeVariacaoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariacao()
  {
    return variacaoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariacao_CardinalidadeMinima()
  {
    return (EAttribute)variacaoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariacao_CardinalidadeMaxima()
  {
    return (EAttribute)variacaoEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariacao_Variantes()
  {
    return (EReference)variacaoEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariacao_CaracteristicaPai()
  {
    return (EReference)variacaoEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariante()
  {
    return varianteEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariante_VariacaoPai()
  {
    return (EReference)varianteEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContexto()
  {
    return contextoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContexto_CaracteristicasIncluir()
  {
    return (EReference)contextoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContexto_CaracteristicasExcluir()
  {
    return (EReference)contextoEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRaizDeContexto()
  {
    return raizDeContextoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRaizDeContexto_EntidadesDeContexto()
  {
    return (EReference)raizDeContextoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEntidadeDeContexto()
  {
    return entidadeDeContextoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntidadeDeContexto_Raiz()
  {
    return (EReference)entidadeDeContextoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntidadeDeContexto_InformacoesDeContexto()
  {
    return (EReference)entidadeDeContextoEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInformacaoDeContexto()
  {
    return informacaoDeContextoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInformacaoDeContexto_ElementoPai()
  {
    return (EReference)informacaoDeContextoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRegra()
  {
    return regraEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRegra_Nome()
  {
    return (EAttribute)regraEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRegra_Conteudo()
  {
    return (EAttribute)regraEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRegraDeComposicao()
  {
    return regraDeComposicaoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRegraDeComposicao_Antecedente()
  {
    return (EReference)regraDeComposicaoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRegraDeComposicao_Consequente()
  {
    return (EReference)regraDeComposicaoEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpressao()
  {
    return expressaoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpressao_Nome()
  {
    return (EAttribute)expressaoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAntecedente()
  {
    return antecedenteEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpressaoLogica()
  {
    return expressaoLogicaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpressaoLogica_LadoDireitoComposicao()
  {
    return (EReference)expressaoLogicaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpressaoLogica_OperadorLogico()
  {
    return (EAttribute)expressaoLogicaEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpressaoLogica_LadoEsquerdoComposicao()
  {
    return (EReference)expressaoLogicaEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpressaoRelacional()
  {
    return expressaoRelacionalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpressaoRelacional_VariaveldaExpressao()
  {
    return (EReference)expressaoRelacionalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpressaoRelacional_OperadorRelacional()
  {
    return (EAttribute)expressaoRelacionalEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpressaoRelacional_Valor()
  {
    return (EAttribute)expressaoRelacionalEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLiteralComposicao()
  {
    return literalComposicaoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLiteralComposicao_Presenca()
  {
    return (EAttribute)literalComposicaoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLiteralComposicao_Elemento()
  {
    return (EReference)literalComposicaoEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getOrigem()
  {
    return origemEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getValidade()
  {
    return validadeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getQualidade()
  {
    return qualidadeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getTipoValor()
  {
    return tipoValorEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getOperadorLogico()
  {
    return operadorLogicoEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getOperadorAcaoLogico()
  {
    return operadorAcaoLogicoEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getCardinalidadeMaxima()
  {
    return cardinalidadeMaximaEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getOperadorRelacional()
  {
    return operadorRelacionalEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getPresenca()
  {
    return presencaEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CaracteristicaFactory getCaracteristicaFactory()
  {
    return (CaracteristicaFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    lpsEClass = createEClass(LPS);
    createEReference(lpsEClass, LPS__ELEMENTOS);
    createEReference(lpsEClass, LPS__REGRAS);
    createEReference(lpsEClass, LPS__EXPRESSOES);
    createEAttribute(lpsEClass, LPS__NOME);

    elementoEClass = createEClass(ELEMENTO);
    createEAttribute(elementoEClass, ELEMENTO__NOME);

    elementoCaracteristicoEClass = createEClass(ELEMENTO_CARACTERISTICO);

    atributoEClass = createEClass(ATRIBUTO);
    createEAttribute(atributoEClass, ATRIBUTO__TIPO_VALOR);
    createEReference(atributoEClass, ATRIBUTO__CARACTERISTICA_PAI);

    caracteristicaEClass = createEClass(CARACTERISTICA);
    createEReference(caracteristicaEClass, CARACTERISTICA__CARACTERISTICA_PAI);
    createEReference(caracteristicaEClass, CARACTERISTICA__CARACTERISTICA_FILHA);
    createEReference(caracteristicaEClass, CARACTERISTICA__VARIACOES);
    createEReference(caracteristicaEClass, CARACTERISTICA__ATRIBUTO);

    caracteristicaRaizEClass = createEClass(CARACTERISTICA_RAIZ);
    createEReference(caracteristicaRaizEClass, CARACTERISTICA_RAIZ__LPS_DO_SISTEMA);

    caracteristicaOpcionalEClass = createEClass(CARACTERISTICA_OPCIONAL);

    caracteristicaAgrupadaEClass = createEClass(CARACTERISTICA_AGRUPADA);

    caracteristicaMandatoriaEClass = createEClass(CARACTERISTICA_MANDATORIA);

    variacaoDoisEClass = createEClass(VARIACAO_DOIS);
    createEAttribute(variacaoDoisEClass, VARIACAO_DOIS__CARDINALIDADE_MAXIMA);
    createEAttribute(variacaoDoisEClass, VARIACAO_DOIS__CARDINALIDADE_MINIMA_OR);
    createEAttribute(variacaoDoisEClass, VARIACAO_DOIS__CARDINALIDADE_MAXIMA_OR);

    pontoDeVariacaoEClass = createEClass(PONTO_DE_VARIACAO);

    variacaoEClass = createEClass(VARIACAO);
    createEAttribute(variacaoEClass, VARIACAO__CARDINALIDADE_MINIMA);
    createEAttribute(variacaoEClass, VARIACAO__CARDINALIDADE_MAXIMA);
    createEReference(variacaoEClass, VARIACAO__VARIANTES);
    createEReference(variacaoEClass, VARIACAO__CARACTERISTICA_PAI);

    varianteEClass = createEClass(VARIANTE);
    createEReference(varianteEClass, VARIANTE__VARIACAO_PAI);

    contextoEClass = createEClass(CONTEXTO);
    createEReference(contextoEClass, CONTEXTO__CARACTERISTICAS_INCLUIR);
    createEReference(contextoEClass, CONTEXTO__CARACTERISTICAS_EXCLUIR);

    raizDeContextoEClass = createEClass(RAIZ_DE_CONTEXTO);
    createEReference(raizDeContextoEClass, RAIZ_DE_CONTEXTO__ENTIDADES_DE_CONTEXTO);

    entidadeDeContextoEClass = createEClass(ENTIDADE_DE_CONTEXTO);
    createEReference(entidadeDeContextoEClass, ENTIDADE_DE_CONTEXTO__RAIZ);
    createEReference(entidadeDeContextoEClass, ENTIDADE_DE_CONTEXTO__INFORMACOES_DE_CONTEXTO);

    informacaoDeContextoEClass = createEClass(INFORMACAO_DE_CONTEXTO);
    createEReference(informacaoDeContextoEClass, INFORMACAO_DE_CONTEXTO__ELEMENTO_PAI);

    regraEClass = createEClass(REGRA);
    createEAttribute(regraEClass, REGRA__NOME);
    createEAttribute(regraEClass, REGRA__CONTEUDO);

    regraDeComposicaoEClass = createEClass(REGRA_DE_COMPOSICAO);
    createEReference(regraDeComposicaoEClass, REGRA_DE_COMPOSICAO__ANTECEDENTE);
    createEReference(regraDeComposicaoEClass, REGRA_DE_COMPOSICAO__CONSEQUENTE);

    expressaoEClass = createEClass(EXPRESSAO);
    createEAttribute(expressaoEClass, EXPRESSAO__NOME);

    antecedenteEClass = createEClass(ANTECEDENTE);

    expressaoLogicaEClass = createEClass(EXPRESSAO_LOGICA);
    createEReference(expressaoLogicaEClass, EXPRESSAO_LOGICA__LADO_DIREITO_COMPOSICAO);
    createEAttribute(expressaoLogicaEClass, EXPRESSAO_LOGICA__OPERADOR_LOGICO);
    createEReference(expressaoLogicaEClass, EXPRESSAO_LOGICA__LADO_ESQUERDO_COMPOSICAO);

    expressaoRelacionalEClass = createEClass(EXPRESSAO_RELACIONAL);
    createEReference(expressaoRelacionalEClass, EXPRESSAO_RELACIONAL__VARIAVELDA_EXPRESSAO);
    createEAttribute(expressaoRelacionalEClass, EXPRESSAO_RELACIONAL__OPERADOR_RELACIONAL);
    createEAttribute(expressaoRelacionalEClass, EXPRESSAO_RELACIONAL__VALOR);

    literalComposicaoEClass = createEClass(LITERAL_COMPOSICAO);
    createEAttribute(literalComposicaoEClass, LITERAL_COMPOSICAO__PRESENCA);
    createEReference(literalComposicaoEClass, LITERAL_COMPOSICAO__ELEMENTO);

    // Create enums
    origemEEnum = createEEnum(ORIGEM);
    validadeEEnum = createEEnum(VALIDADE);
    qualidadeEEnum = createEEnum(QUALIDADE);
    tipoValorEEnum = createEEnum(TIPO_VALOR);
    operadorLogicoEEnum = createEEnum(OPERADOR_LOGICO);
    operadorAcaoLogicoEEnum = createEEnum(OPERADOR_ACAO_LOGICO);
    cardinalidadeMaximaEEnum = createEEnum(CARDINALIDADE_MAXIMA);
    operadorRelacionalEEnum = createEEnum(OPERADOR_RELACIONAL);
    presencaEEnum = createEEnum(PRESENCA);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    elementoCaracteristicoEClass.getESuperTypes().add(this.getElemento());
    atributoEClass.getESuperTypes().add(this.getElemento());
    caracteristicaEClass.getESuperTypes().add(this.getElemento());
    caracteristicaRaizEClass.getESuperTypes().add(this.getCaracteristica());
    caracteristicaOpcionalEClass.getESuperTypes().add(this.getCaracteristica());
    caracteristicaOpcionalEClass.getESuperTypes().add(this.getElementoCaracteristico());
    caracteristicaAgrupadaEClass.getESuperTypes().add(this.getCaracteristica());
    caracteristicaAgrupadaEClass.getESuperTypes().add(this.getElementoCaracteristico());
    caracteristicaMandatoriaEClass.getESuperTypes().add(this.getCaracteristica());
    variacaoDoisEClass.getESuperTypes().add(this.getCaracteristica());
    variacaoDoisEClass.getESuperTypes().add(this.getElementoCaracteristico());
    variacaoEClass.getESuperTypes().add(this.getPontoDeVariacao());
    variacaoEClass.getESuperTypes().add(this.getElemento());
    varianteEClass.getESuperTypes().add(this.getPontoDeVariacao());
    varianteEClass.getESuperTypes().add(this.getElementoCaracteristico());
    varianteEClass.getESuperTypes().add(this.getCaracteristica());
    contextoEClass.getESuperTypes().add(this.getElemento());
    raizDeContextoEClass.getESuperTypes().add(this.getContexto());
    entidadeDeContextoEClass.getESuperTypes().add(this.getContexto());
    informacaoDeContextoEClass.getESuperTypes().add(this.getContexto());
    regraDeComposicaoEClass.getESuperTypes().add(this.getRegra());
    antecedenteEClass.getESuperTypes().add(this.getExpressao());
    expressaoLogicaEClass.getESuperTypes().add(this.getAntecedente());
    expressaoRelacionalEClass.getESuperTypes().add(this.getAntecedente());
    literalComposicaoEClass.getESuperTypes().add(this.getAntecedente());

    // Initialize classes and features; add operations and parameters
    initEClass(lpsEClass, caracteristica.LPS.class, "LPS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLPS_Elementos(), this.getElemento(), null, "elementos", null, 0, -1, caracteristica.LPS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLPS_Regras(), this.getRegra(), null, "regras", null, 0, -1, caracteristica.LPS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLPS_Expressoes(), this.getExpressao(), null, "expressoes", null, 0, -1, caracteristica.LPS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLPS_Nome(), ecorePackage.getEString(), "nome", null, 0, 1, caracteristica.LPS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elementoEClass, Elemento.class, "Elemento", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getElemento_Nome(), ecorePackage.getEString(), "nome", null, 0, 1, Elemento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elementoCaracteristicoEClass, ElementoCaracteristico.class, "ElementoCaracteristico", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(atributoEClass, Atributo.class, "Atributo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAtributo_TipoValor(), this.getTipoValor(), "tipoValor", null, 0, 1, Atributo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAtributo_CaracteristicaPai(), this.getCaracteristica(), this.getCaracteristica_Atributo(), "caracteristicaPai", null, 0, 1, Atributo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(caracteristicaEClass, Caracteristica.class, "Caracteristica", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCaracteristica_CaracteristicaPai(), this.getCaracteristica(), this.getCaracteristica_CaracteristicaFilha(), "caracteristicaPai", null, 0, 1, Caracteristica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCaracteristica_CaracteristicaFilha(), this.getCaracteristica(), this.getCaracteristica_CaracteristicaPai(), "caracteristicaFilha", null, 0, -1, Caracteristica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCaracteristica_Variacoes(), this.getVariacao(), this.getVariacao_CaracteristicaPai(), "variacoes", null, 0, -1, Caracteristica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCaracteristica_Atributo(), this.getAtributo(), this.getAtributo_CaracteristicaPai(), "atributo", null, 0, -1, Caracteristica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(caracteristicaRaizEClass, CaracteristicaRaiz.class, "CaracteristicaRaiz", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCaracteristicaRaiz_LpsDoSistema(), this.getLPS(), null, "LpsDoSistema", null, 1, 1, CaracteristicaRaiz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(caracteristicaOpcionalEClass, CaracteristicaOpcional.class, "CaracteristicaOpcional", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(caracteristicaAgrupadaEClass, CaracteristicaAgrupada.class, "CaracteristicaAgrupada", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(caracteristicaMandatoriaEClass, CaracteristicaMandatoria.class, "CaracteristicaMandatoria", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(variacaoDoisEClass, VariacaoDois.class, "VariacaoDois", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariacaoDois_CardinalidadeMaxima(), this.getCardinalidadeMaxima(), "cardinalidadeMaxima", null, 0, 1, VariacaoDois.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVariacaoDois_CardinalidadeMinimaOr(), ecorePackage.getEIntegerObject(), "cardinalidadeMinimaOr", null, 0, 1, VariacaoDois.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVariacaoDois_CardinalidadeMaximaOr(), ecorePackage.getEIntegerObject(), "cardinalidadeMaximaOr", null, 0, 1, VariacaoDois.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pontoDeVariacaoEClass, PontoDeVariacao.class, "PontoDeVariacao", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(variacaoEClass, Variacao.class, "Variacao", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariacao_CardinalidadeMinima(), ecorePackage.getEIntegerObject(), "cardinalidadeMinima", null, 0, 1, Variacao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVariacao_CardinalidadeMaxima(), ecorePackage.getEIntegerObject(), "cardinalidadeMaxima", null, 0, 1, Variacao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariacao_Variantes(), this.getVariante(), this.getVariante_VariacaoPai(), "variantes", null, 0, -1, Variacao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariacao_CaracteristicaPai(), this.getCaracteristica(), this.getCaracteristica_Variacoes(), "caracteristicaPai", null, 0, 1, Variacao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(varianteEClass, Variante.class, "Variante", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVariante_VariacaoPai(), this.getVariacao(), this.getVariacao_Variantes(), "variacaoPai", null, 0, 1, Variante.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(contextoEClass, Contexto.class, "Contexto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getContexto_CaracteristicasIncluir(), this.getCaracteristica(), null, "caracteristicasIncluir", null, 0, -1, Contexto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContexto_CaracteristicasExcluir(), this.getCaracteristica(), null, "caracteristicasExcluir", null, 0, -1, Contexto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(raizDeContextoEClass, RaizDeContexto.class, "RaizDeContexto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRaizDeContexto_EntidadesDeContexto(), this.getEntidadeDeContexto(), this.getEntidadeDeContexto_Raiz(), "entidadesDeContexto", null, 0, -1, RaizDeContexto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(entidadeDeContextoEClass, EntidadeDeContexto.class, "EntidadeDeContexto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEntidadeDeContexto_Raiz(), this.getRaizDeContexto(), this.getRaizDeContexto_EntidadesDeContexto(), "raiz", null, 0, 1, EntidadeDeContexto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEntidadeDeContexto_InformacoesDeContexto(), this.getInformacaoDeContexto(), this.getInformacaoDeContexto_ElementoPai(), "informacoesDeContexto", null, 0, -1, EntidadeDeContexto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(informacaoDeContextoEClass, InformacaoDeContexto.class, "InformacaoDeContexto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInformacaoDeContexto_ElementoPai(), this.getEntidadeDeContexto(), this.getEntidadeDeContexto_InformacoesDeContexto(), "elementoPai", null, 1, 1, InformacaoDeContexto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(regraEClass, Regra.class, "Regra", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRegra_Nome(), ecorePackage.getEString(), "nome", null, 0, 1, Regra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRegra_Conteudo(), ecorePackage.getEString(), "conteudo", null, 0, 1, Regra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(regraDeComposicaoEClass, RegraDeComposicao.class, "RegraDeComposicao", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRegraDeComposicao_Antecedente(), this.getAntecedente(), null, "antecedente", null, 0, 1, RegraDeComposicao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRegraDeComposicao_Consequente(), this.getAntecedente(), null, "consequente", null, 0, 1, RegraDeComposicao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressaoEClass, Expressao.class, "Expressao", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExpressao_Nome(), ecorePackage.getEString(), "nome", null, 0, 1, Expressao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(antecedenteEClass, Antecedente.class, "Antecedente", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(expressaoLogicaEClass, ExpressaoLogica.class, "ExpressaoLogica", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpressaoLogica_LadoDireitoComposicao(), this.getAntecedente(), null, "ladoDireitoComposicao", null, 0, 1, ExpressaoLogica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExpressaoLogica_OperadorLogico(), this.getOperadorLogico(), "operadorLogico", null, 0, 1, ExpressaoLogica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpressaoLogica_LadoEsquerdoComposicao(), this.getAntecedente(), null, "ladoEsquerdoComposicao", null, 0, 1, ExpressaoLogica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressaoRelacionalEClass, ExpressaoRelacional.class, "ExpressaoRelacional", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpressaoRelacional_VariaveldaExpressao(), this.getAtributo(), null, "variaveldaExpressao", null, 0, 1, ExpressaoRelacional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExpressaoRelacional_OperadorRelacional(), this.getOperadorRelacional(), "operadorRelacional", null, 0, 1, ExpressaoRelacional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExpressaoRelacional_Valor(), ecorePackage.getEString(), "valor", null, 0, 1, ExpressaoRelacional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(literalComposicaoEClass, LiteralComposicao.class, "LiteralComposicao", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLiteralComposicao_Presenca(), this.getPresenca(), "presenca", null, 0, 1, LiteralComposicao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLiteralComposicao_Elemento(), this.getElementoCaracteristico(), null, "elemento", null, 0, 1, LiteralComposicao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(origemEEnum, Origem.class, "Origem");
    addEEnumLiteral(origemEEnum, Origem.SENTIDA);
    addEEnumLiteral(origemEEnum, Origem.USUARIO);
    addEEnumLiteral(origemEEnum, Origem.PERFIL);
    addEEnumLiteral(origemEEnum, Origem.DERIVADA);

    initEEnum(validadeEEnum, Validade.class, "Validade");
    addEEnumLiteral(validadeEEnum, Validade.VOLATIL);
    addEEnumLiteral(validadeEEnum, Validade.FREQUENTE);
    addEEnumLiteral(validadeEEnum, Validade.RARAMENTE);
    addEEnumLiteral(validadeEEnum, Validade.PERMANENTE);

    initEEnum(qualidadeEEnum, Qualidade.class, "Qualidade");
    addEEnumLiteral(qualidadeEEnum, Qualidade.BAIXO);
    addEEnumLiteral(qualidadeEEnum, Qualidade.ALTO);

    initEEnum(tipoValorEEnum, TipoValor.class, "TipoValor");
    addEEnumLiteral(tipoValorEEnum, TipoValor.TINTEGER);
    addEEnumLiteral(tipoValorEEnum, TipoValor.TSTRING);
    addEEnumLiteral(tipoValorEEnum, TipoValor.TFLOAT);
    addEEnumLiteral(tipoValorEEnum, TipoValor.TBOOLEAN);

    initEEnum(operadorLogicoEEnum, OperadorLogico.class, "OperadorLogico");
    addEEnumLiteral(operadorLogicoEEnum, OperadorLogico.AND);
    addEEnumLiteral(operadorLogicoEEnum, OperadorLogico.OR);

    initEEnum(operadorAcaoLogicoEEnum, OperadorAcaoLogico.class, "OperadorAcaoLogico");
    addEEnumLiteral(operadorAcaoLogicoEEnum, OperadorAcaoLogico.AND);

    initEEnum(cardinalidadeMaximaEEnum, CardinalidadeMaxima.class, "CardinalidadeMaxima");
    addEEnumLiteral(cardinalidadeMaximaEEnum, CardinalidadeMaxima.OR);
    addEEnumLiteral(cardinalidadeMaximaEEnum, CardinalidadeMaxima.XOR);

    initEEnum(operadorRelacionalEEnum, OperadorRelacional.class, "OperadorRelacional");
    addEEnumLiteral(operadorRelacionalEEnum, OperadorRelacional.MAIOR);
    addEEnumLiteral(operadorRelacionalEEnum, OperadorRelacional.MENOR);
    addEEnumLiteral(operadorRelacionalEEnum, OperadorRelacional.IGUAL);
    addEEnumLiteral(operadorRelacionalEEnum, OperadorRelacional.MAIORIGUAL);
    addEEnumLiteral(operadorRelacionalEEnum, OperadorRelacional.MENORIGUAL);
    addEEnumLiteral(operadorRelacionalEEnum, OperadorRelacional.DIFERENTE);

    initEEnum(presencaEEnum, Presenca.class, "Presenca");
    addEEnumLiteral(presencaEEnum, Presenca.PRESENTE);
    addEEnumLiteral(presencaEEnum, Presenca.AUSENTE);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // gmf.diagram
    createGmfAnnotations();
    // gmf.node
    createGmf_1Annotations();
    // gmf.link
    createGmf_2Annotations();
  }

  /**
   * Initializes the annotations for <b>gmf.diagram</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmfAnnotations()
  {
    String source = "gmf.diagram";		
    addAnnotation
      (lpsEClass, 
       source, 
       new String[] 
       {
       "foo", "bar"
       });																										
  }

  /**
   * Initializes the annotations for <b>gmf.node</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_1Annotations()
  {
    String source = "gmf.node";			
    addAnnotation
      (atributoEClass, 
       source, 
       new String[] 
       {
       "label", "nome",
       "figure", "utils.TriangleFigure",
       "label.pattern", "Attribute {0}"
       });					
    addAnnotation
      (caracteristicaRaizEClass, 
       source, 
       new String[] 
       {
       "label", "nome"
       });		
    addAnnotation
      (caracteristicaOpcionalEClass, 
       source, 
       new String[] 
       {
       "label", "nome",
       "figure", "ellipse",
       "border.style", "dash",
       "border.width", "2"
       });		
    addAnnotation
      (caracteristicaAgrupadaEClass, 
       source, 
       new String[] 
       {
       "label", "nome",
       "figure", "utils.TriangleFigure",
       "border.style", "dash",
       "border.width", "2"
       });		
    addAnnotation
      (caracteristicaMandatoriaEClass, 
       source, 
       new String[] 
       {
       "label", "nome",
       "figure", "rectangle",
       "border.style", "solid",
       "border.width", "2"
       });		
    addAnnotation
      (variacaoDoisEClass, 
       source, 
       new String[] 
       {
       "label", "cardinalidadeMaxima",
       "label.pattern", "{0} : {1}",
       "figure", "utils.DiamondFigure"
       });			
    addAnnotation
      (contextoEClass, 
       source, 
       new String[] 
       {
       "label", "nome"
       });				
    addAnnotation
      (raizDeContextoEClass, 
       source, 
       new String[] 
       {
       "label", "nome"
       });			
    addAnnotation
      (entidadeDeContextoEClass, 
       source, 
       new String[] 
       {
       "label", "nome",
       "label.pattern", "Entidade de Contexto {0}"
       });			
    addAnnotation
      (informacaoDeContextoEClass, 
       source, 
       new String[] 
       {
       "label", "nome",
       "label.pattern", "Informa\u00e7\u00e3o de Contexto: {0}"
       });		
    addAnnotation
      (regraDeComposicaoEClass, 
       source, 
       new String[] 
       {
       "label", "nome",
       "label.pattern", "Composition Rule {0}"
       });				
    addAnnotation
      (expressaoLogicaEClass, 
       source, 
       new String[] 
       {
       "label", "operadorLogico"
       });				
    addAnnotation
      (expressaoRelacionalEClass, 
       source, 
       new String[] 
       {
       "label", "nome"
       });		
    addAnnotation
      (literalComposicaoEClass, 
       source, 
       new String[] 
       {
       "label", "nome"
       });
  }

  /**
   * Initializes the annotations for <b>gmf.link</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_2Annotations()
  {
    String source = "gmf.link";				
    addAnnotation
      (getCaracteristica_CaracteristicaFilha(), 
       source, 
       new String[] 
       {
       "color", "0,0,0",
       "style", "solid",
       "width", "3"
       });		
    addAnnotation
      (getCaracteristica_Variacoes(), 
       source, 
       new String[] 
       {
       "color", "0,0,0",
       "style", "solid",
       "width", "3"
       });		
    addAnnotation
      (getCaracteristica_Atributo(), 
       source, 
       new String[] 
       {
       "target.decoration", "closedarrow",
       "color", "0,0,0",
       "style", "solid",
       "width", "3"
       });							
    addAnnotation
      (getVariacao_Variantes(), 
       source, 
       new String[] 
       {
       "target.decoration", "closedarrow",
       "color", "0,0,0",
       "style", "solid",
       "width", "3"
       });			
    addAnnotation
      (getContexto_CaracteristicasIncluir(), 
       source, 
       new String[] 
       {
       "target.decoration", "closedarrow",
       "color", "0,0,0",
       "style", "dot",
       "width", "3"
       });		
    addAnnotation
      (getContexto_CaracteristicasExcluir(), 
       source, 
       new String[] 
       {
       "target.decoration", "closedarrow",
       "source.decoration", "closedarrow",
       "color", "0,0,0",
       "style", "dot",
       "width", "3"
       });			
    addAnnotation
      (getRaizDeContexto_EntidadesDeContexto(), 
       source, 
       new String[] 
       {
       "color", "0,0,0",
       "style", "solid",
       "width", "3"
       });			
    addAnnotation
      (getEntidadeDeContexto_InformacoesDeContexto(), 
       source, 
       new String[] 
       {
       "color", "0,0,0",
       "style", "solid",
       "width", "3"
       });				
    addAnnotation
      (getRegraDeComposicao_Antecedente(), 
       source, 
       new String[] 
       {
       "target.decoration", "closedarrow",
       "color", "0,0,0",
       "style", "solid",
       "label", "antecedent"
       });		
    addAnnotation
      (getRegraDeComposicao_Consequente(), 
       source, 
       new String[] 
       {
       "target.decoration", "closedarrow",
       "color", "0,0,0",
       "style", "solid",
       "label", "consequent"
       });			
    addAnnotation
      (getExpressaoLogica_LadoDireitoComposicao(), 
       source, 
       new String[] 
       {
       "target.decoration", "closedarrow",
       "color", "0,0,0",
       "style", "solid",
       "width", "3"
       });		
    addAnnotation
      (getExpressaoLogica_LadoEsquerdoComposicao(), 
       source, 
       new String[] 
       {
       "target.decoration", "closedarrow",
       "color", "0,0,0",
       "style", "solid",
       "width", "3"
       });		
  }

} //CaracteristicaPackageImpl
