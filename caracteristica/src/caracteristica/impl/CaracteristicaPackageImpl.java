/**
 */
package caracteristica.impl;

import caracteristica.Acao;
import caracteristica.AcaoLogico;
import caracteristica.Antecedente;
import caracteristica.Atributo;
import caracteristica.AtributoProduto;
import caracteristica.Caracteristica;
import caracteristica.CaracteristicaAgrupada;
import caracteristica.CaracteristicaAgrupadaProduto;
import caracteristica.CaracteristicaFactory;
import caracteristica.CaracteristicaMandatoria;
import caracteristica.CaracteristicaMandatoriaProduto;
import caracteristica.CaracteristicaOpcional;
import caracteristica.CaracteristicaOpcionalProduto;
import caracteristica.CaracteristicaPackage;
import caracteristica.CaracteristicaProduto;
import caracteristica.CaracteristicaRaiz;
import caracteristica.CardinalidadeMaxima;
import caracteristica.CasoDeTeste;
import caracteristica.CasoDeUso;
import caracteristica.Designar;
import caracteristica.Elemento;
import caracteristica.ElementoCaracteristico;
import caracteristica.ElementoDeProduto;
import caracteristica.ElementoDeProduto;
import caracteristica.ElementoExterno;
import caracteristica.EntidadeDeContexto;
import caracteristica.EntidadeDeContexto;
import caracteristica.Estado;
import caracteristica.Evento;
import caracteristica.EventoLogico;
import caracteristica.EventoRelacional;
import caracteristica.Expressao;
import caracteristica.ExpressaoLogica;
import caracteristica.ExpressaoRelacional;
import caracteristica.InconsistenciaRegraAdaptacao;
import caracteristica.InformacaoDeContexto;
import caracteristica.InformacaoDeContexto;
import caracteristica.LiteralAcao;
import caracteristica.LiteralComposicao;
import caracteristica.OperadorAcaoLogico;
import caracteristica.OperadorLogico;
import caracteristica.OperadorRelacional;
import caracteristica.Origem;
import caracteristica.PontoDeVariacao;
import caracteristica.PontoDeVariacao;
import caracteristica.Presenca;
import caracteristica.Produto;
import caracteristica.Qualidade;
import caracteristica.RaizDeContexto;
import caracteristica.Regra;
import caracteristica.RegraDeComposicao;
import caracteristica.RegraDeContexto;
import caracteristica.Simulacao;
import caracteristica.TipoValor;
import caracteristica.Transicao;
import caracteristica.Validade;
import caracteristica.Variacao;
import caracteristica.VariacaoDois;
import caracteristica.VariacaoDoisProduto;
import caracteristica.VariacaoProduto;
import caracteristica.Variante;
import caracteristica.VarianteProduto;

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
  private EClass elementoExternoEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass casoDeUsoEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass casoDeTesteEClass = null;

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
  private EClass elementoDeProdutoEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass caracteristicaProdutoEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass atributoProdutoEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass caracteristicaMandatoriaProdutoEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass caracteristicaOpcionalProdutoEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass variacaoDoisProdutoEClass = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caracteristicaAgrupadaProdutoEClass = null;

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass variacaoProdutoEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass varianteProdutoEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass produtoEClass = null;

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
  private EClass regraDeContextoEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass eventoEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass eventoLogicoEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass eventoRelacionalEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass acaoEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass acaoLogicoEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass literalAcaoEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass designarEClass = null;

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
  private EClass simulacaoEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass transicaoEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass estadoEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass inconsistenciaRegraAdaptacaoEClass = null;

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
  public EReference getLPS_PontosDeVariacao()
  {
		return (EReference)lpsEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getLPS_Elementos()
  {
		return (EReference)lpsEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getLPS_Externos()
  {
		return (EReference)lpsEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getLPS_Regras()
  {
		return (EReference)lpsEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getLPS_Produtos()
  {
		return (EReference)lpsEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getLPS_Expressoes()
  {
		return (EReference)lpsEClass.getEStructuralFeatures().get(5);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getLPS_ElementosDeProduto()
  {
		return (EReference)lpsEClass.getEStructuralFeatures().get(6);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getLPS_Sistema()
  {
		return (EReference)lpsEClass.getEStructuralFeatures().get(7);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getLPS_Atributos()
  {
		return (EReference)lpsEClass.getEStructuralFeatures().get(8);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getLPS_ValoresContextuais()
  {
		return (EAttribute)lpsEClass.getEStructuralFeatures().get(9);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getLPS_Simulacoes()
  {
		return (EReference)lpsEClass.getEStructuralFeatures().get(10);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getLPS_InconsistenciaERA()
  {
		return (EReference)lpsEClass.getEStructuralFeatures().get(11);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getLPS_Erro()
  {
		return (EAttribute)lpsEClass.getEStructuralFeatures().get(12);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getLPS_Nome()
  {
		return (EAttribute)lpsEClass.getEStructuralFeatures().get(13);
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
  public EClass getElementoExterno()
  {
		return elementoExternoEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getElementoExterno_Nome()
  {
		return (EAttribute)elementoExternoEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getCasoDeUso()
  {
		return casoDeUsoEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getCasoDeTeste()
  {
		return casoDeTesteEClass;
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
  public EReference getCaracteristica_ElementosExternos()
  {
		return (EReference)caracteristicaEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getCaracteristica_CaracteristicaPai()
  {
		return (EReference)caracteristicaEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getCaracteristica_CaracteristicaFilha()
  {
		return (EReference)caracteristicaEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getCaracteristica_Variacoes()
  {
		return (EReference)caracteristicaEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getCaracteristica_Atributo()
  {
		return (EReference)caracteristicaEClass.getEStructuralFeatures().get(4);
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
  public EAttribute getInformacaoDeContexto_Origem()
  {
		return (EAttribute)informacaoDeContextoEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getInformacaoDeContexto_Validade()
  {
		return (EAttribute)informacaoDeContextoEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getInformacaoDeContexto_Qualidade()
  {
		return (EAttribute)informacaoDeContextoEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getInformacaoDeContexto_TipoValor()
  {
		return (EAttribute)informacaoDeContextoEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getInformacaoDeContexto_Valor()
  {
		return (EAttribute)informacaoDeContextoEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getInformacaoDeContexto_ElementoPai()
  {
		return (EReference)informacaoDeContextoEClass.getEStructuralFeatures().get(5);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getElementoDeProduto()
  {
		return elementoDeProdutoEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getElementoDeProduto_Nome()
  {
		return (EAttribute)elementoDeProdutoEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getElementoDeProduto_ElementoOriginal()
  {
		return (EReference)elementoDeProdutoEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getCaracteristicaProduto()
  {
		return caracteristicaProdutoEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getCaracteristicaProduto_CaracteristicaProdutoPai()
  {
		return (EReference)caracteristicaProdutoEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getCaracteristicaProduto_CaracteristicaProdutoFilha()
  {
		return (EReference)caracteristicaProdutoEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getCaracteristicaProduto_AtributoProduto()
  {
		return (EReference)caracteristicaProdutoEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getAtributoProduto()
  {
		return atributoProdutoEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getAtributoProduto_Valor()
  {
		return (EAttribute)atributoProdutoEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getAtributoProduto_TipoValor()
  {
		return (EAttribute)atributoProdutoEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getAtributoProduto_CaracteristicaProdutoPai()
  {
		return (EReference)atributoProdutoEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getCaracteristicaMandatoriaProduto()
  {
		return caracteristicaMandatoriaProdutoEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getCaracteristicaOpcionalProduto()
  {
		return caracteristicaOpcionalProdutoEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getVariacaoDoisProduto()
  {
		return variacaoDoisProdutoEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getVariacaoDoisProduto_CardinalidadeMaxima()
  {
		return (EAttribute)variacaoDoisProdutoEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariacaoDoisProduto_CardinalidadeMinimaOr() {
		return (EAttribute)variacaoDoisProdutoEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariacaoDoisProduto_CardinalidadeMaximaOr() {
		return (EAttribute)variacaoDoisProdutoEClass.getEStructuralFeatures().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCaracteristicaAgrupadaProduto() {
		return caracteristicaAgrupadaProdutoEClass;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getVariacaoProduto()
  {
		return variacaoProdutoEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getVariacaoProduto_CardinalidadeMinima()
  {
		return (EAttribute)variacaoProdutoEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getVariacaoProduto_CardinalidadeMaxima()
  {
		return (EAttribute)variacaoProdutoEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getVariacaoProduto_VariantesProduto()
  {
		return (EReference)variacaoProdutoEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getVariacaoProduto_CaracteristicaProdutoPai()
  {
		return (EReference)variacaoProdutoEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getVarianteProduto()
  {
		return varianteProdutoEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getVarianteProduto_VariacaoProdutoPai()
  {
		return (EReference)varianteProdutoEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getVarianteProduto_Selecionado()
  {
		return (EAttribute)varianteProdutoEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getProduto()
  {
		return produtoEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getProduto_LinhaDoProduto()
  {
		return (EReference)produtoEClass.getEStructuralFeatures().get(0);
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
  public EClass getRegraDeContexto()
  {
		return regraDeContextoEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getRegraDeContexto_Evento()
  {
		return (EReference)regraDeContextoEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getRegraDeContexto_Acao()
  {
		return (EReference)regraDeContextoEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getEvento()
  {
		return eventoEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getEventoLogico()
  {
		return eventoLogicoEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getEventoLogico_LadoDireitoEvento()
  {
		return (EReference)eventoLogicoEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getEventoLogico_OperadorLogico()
  {
		return (EAttribute)eventoLogicoEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getEventoLogico_LadoEsquerdoEvento()
  {
		return (EReference)eventoLogicoEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getEventoRelacional()
  {
		return eventoRelacionalEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getEventoRelacional_VariavelDeContexto()
  {
		return (EReference)eventoRelacionalEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getEventoRelacional_OperadorRelacional()
  {
		return (EAttribute)eventoRelacionalEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getEventoRelacional_Valor()
  {
		return (EAttribute)eventoRelacionalEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getAcao()
  {
		return acaoEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getAcaoLogico()
  {
		return acaoLogicoEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getAcaoLogico_LadoEsquerdoAcao()
  {
		return (EReference)acaoLogicoEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getAcaoLogico_OperadorAcaoLogico()
  {
		return (EAttribute)acaoLogicoEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getAcaoLogico_LadoDireitoAcao()
  {
		return (EReference)acaoLogicoEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getLiteralAcao()
  {
		return literalAcaoEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getLiteralAcao_Presenca()
  {
		return (EAttribute)literalAcaoEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getLiteralAcao_Elemento()
  {
		return (EReference)literalAcaoEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getDesignar()
  {
		return designarEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getDesignar_Valor()
  {
		return (EAttribute)designarEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getDesignar_Atributo()
  {
		return (EReference)designarEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getDesignar_TipoValor()
  {
		return (EAttribute)designarEClass.getEStructuralFeatures().get(2);
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
  public EClass getSimulacao()
  {
		return simulacaoEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getSimulacao_Nome()
  {
		return (EAttribute)simulacaoEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getSimulacao_Transicoes()
  {
		return (EReference)simulacaoEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getSimulacao_Estados()
  {
		return (EReference)simulacaoEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getTransicao()
  {
		return transicaoEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTransicao_EAntigo()
  {
		return (EReference)transicaoEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTransicao_ENovo()
  {
		return (EReference)transicaoEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTransicao_RegrasQuebradas()
  {
		return (EReference)transicaoEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTransicao_Acoes()
  {
		return (EReference)transicaoEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getTransicao_Safe()
  {
		return (EAttribute)transicaoEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getTransicao_Etiqueta()
  {
		return (EAttribute)transicaoEClass.getEStructuralFeatures().get(5);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getEstado()
  {
		return estadoEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getEstado_Nome()
  {
		return (EAttribute)estadoEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getEstado_Produto()
  {
		return (EReference)estadoEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getEstado_Safe()
  {
		return (EAttribute)estadoEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getInconsistenciaRegraAdaptacao()
  {
		return inconsistenciaRegraAdaptacaoEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getInconsistenciaRegraAdaptacao_RegrasInconsistentes()
  {
		return (EReference)inconsistenciaRegraAdaptacaoEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getInconsistenciaRegraAdaptacao_LiteraisInconsistentes()
  {
		return (EReference)inconsistenciaRegraAdaptacaoEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getInconsistenciaRegraAdaptacao_AtribuicoesInconsistentes()
  {
		return (EReference)inconsistenciaRegraAdaptacaoEClass.getEStructuralFeatures().get(2);
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
		createEReference(lpsEClass, LPS__PONTOS_DE_VARIACAO);
		createEReference(lpsEClass, LPS__ELEMENTOS);
		createEReference(lpsEClass, LPS__EXTERNOS);
		createEReference(lpsEClass, LPS__REGRAS);
		createEReference(lpsEClass, LPS__PRODUTOS);
		createEReference(lpsEClass, LPS__EXPRESSOES);
		createEReference(lpsEClass, LPS__ELEMENTOS_DE_PRODUTO);
		createEReference(lpsEClass, LPS__SISTEMA);
		createEReference(lpsEClass, LPS__ATRIBUTOS);
		createEAttribute(lpsEClass, LPS__VALORES_CONTEXTUAIS);
		createEReference(lpsEClass, LPS__SIMULACOES);
		createEReference(lpsEClass, LPS__INCONSISTENCIA_ERA);
		createEAttribute(lpsEClass, LPS__ERRO);
		createEAttribute(lpsEClass, LPS__NOME);

		elementoEClass = createEClass(ELEMENTO);
		createEAttribute(elementoEClass, ELEMENTO__NOME);

		elementoExternoEClass = createEClass(ELEMENTO_EXTERNO);
		createEAttribute(elementoExternoEClass, ELEMENTO_EXTERNO__NOME);

		casoDeUsoEClass = createEClass(CASO_DE_USO);

		casoDeTesteEClass = createEClass(CASO_DE_TESTE);

		elementoCaracteristicoEClass = createEClass(ELEMENTO_CARACTERISTICO);

		atributoEClass = createEClass(ATRIBUTO);
		createEAttribute(atributoEClass, ATRIBUTO__TIPO_VALOR);
		createEReference(atributoEClass, ATRIBUTO__CARACTERISTICA_PAI);

		caracteristicaEClass = createEClass(CARACTERISTICA);
		createEReference(caracteristicaEClass, CARACTERISTICA__ELEMENTOS_EXTERNOS);
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

		raizDeContextoEClass = createEClass(RAIZ_DE_CONTEXTO);
		createEReference(raizDeContextoEClass, RAIZ_DE_CONTEXTO__ENTIDADES_DE_CONTEXTO);

		entidadeDeContextoEClass = createEClass(ENTIDADE_DE_CONTEXTO);
		createEReference(entidadeDeContextoEClass, ENTIDADE_DE_CONTEXTO__RAIZ);
		createEReference(entidadeDeContextoEClass, ENTIDADE_DE_CONTEXTO__INFORMACOES_DE_CONTEXTO);

		informacaoDeContextoEClass = createEClass(INFORMACAO_DE_CONTEXTO);
		createEAttribute(informacaoDeContextoEClass, INFORMACAO_DE_CONTEXTO__ORIGEM);
		createEAttribute(informacaoDeContextoEClass, INFORMACAO_DE_CONTEXTO__VALIDADE);
		createEAttribute(informacaoDeContextoEClass, INFORMACAO_DE_CONTEXTO__QUALIDADE);
		createEAttribute(informacaoDeContextoEClass, INFORMACAO_DE_CONTEXTO__TIPO_VALOR);
		createEAttribute(informacaoDeContextoEClass, INFORMACAO_DE_CONTEXTO__VALOR);
		createEReference(informacaoDeContextoEClass, INFORMACAO_DE_CONTEXTO__ELEMENTO_PAI);

		elementoDeProdutoEClass = createEClass(ELEMENTO_DE_PRODUTO);
		createEAttribute(elementoDeProdutoEClass, ELEMENTO_DE_PRODUTO__NOME);
		createEReference(elementoDeProdutoEClass, ELEMENTO_DE_PRODUTO__ELEMENTO_ORIGINAL);

		caracteristicaProdutoEClass = createEClass(CARACTERISTICA_PRODUTO);
		createEReference(caracteristicaProdutoEClass, CARACTERISTICA_PRODUTO__CARACTERISTICA_PRODUTO_PAI);
		createEReference(caracteristicaProdutoEClass, CARACTERISTICA_PRODUTO__CARACTERISTICA_PRODUTO_FILHA);
		createEReference(caracteristicaProdutoEClass, CARACTERISTICA_PRODUTO__ATRIBUTO_PRODUTO);

		atributoProdutoEClass = createEClass(ATRIBUTO_PRODUTO);
		createEAttribute(atributoProdutoEClass, ATRIBUTO_PRODUTO__VALOR);
		createEAttribute(atributoProdutoEClass, ATRIBUTO_PRODUTO__TIPO_VALOR);
		createEReference(atributoProdutoEClass, ATRIBUTO_PRODUTO__CARACTERISTICA_PRODUTO_PAI);

		caracteristicaMandatoriaProdutoEClass = createEClass(CARACTERISTICA_MANDATORIA_PRODUTO);

		caracteristicaOpcionalProdutoEClass = createEClass(CARACTERISTICA_OPCIONAL_PRODUTO);

		variacaoDoisProdutoEClass = createEClass(VARIACAO_DOIS_PRODUTO);
		createEAttribute(variacaoDoisProdutoEClass, VARIACAO_DOIS_PRODUTO__CARDINALIDADE_MAXIMA);
		createEAttribute(variacaoDoisProdutoEClass, VARIACAO_DOIS_PRODUTO__CARDINALIDADE_MINIMA_OR);
		createEAttribute(variacaoDoisProdutoEClass, VARIACAO_DOIS_PRODUTO__CARDINALIDADE_MAXIMA_OR);

		caracteristicaAgrupadaProdutoEClass = createEClass(CARACTERISTICA_AGRUPADA_PRODUTO);

		variacaoProdutoEClass = createEClass(VARIACAO_PRODUTO);
		createEAttribute(variacaoProdutoEClass, VARIACAO_PRODUTO__CARDINALIDADE_MINIMA);
		createEAttribute(variacaoProdutoEClass, VARIACAO_PRODUTO__CARDINALIDADE_MAXIMA);
		createEReference(variacaoProdutoEClass, VARIACAO_PRODUTO__VARIANTES_PRODUTO);
		createEReference(variacaoProdutoEClass, VARIACAO_PRODUTO__CARACTERISTICA_PRODUTO_PAI);

		varianteProdutoEClass = createEClass(VARIANTE_PRODUTO);
		createEReference(varianteProdutoEClass, VARIANTE_PRODUTO__VARIACAO_PRODUTO_PAI);
		createEAttribute(varianteProdutoEClass, VARIANTE_PRODUTO__SELECIONADO);

		produtoEClass = createEClass(PRODUTO);
		createEReference(produtoEClass, PRODUTO__LINHA_DO_PRODUTO);

		regraEClass = createEClass(REGRA);
		createEAttribute(regraEClass, REGRA__NOME);
		createEAttribute(regraEClass, REGRA__CONTEUDO);

		regraDeComposicaoEClass = createEClass(REGRA_DE_COMPOSICAO);
		createEReference(regraDeComposicaoEClass, REGRA_DE_COMPOSICAO__ANTECEDENTE);
		createEReference(regraDeComposicaoEClass, REGRA_DE_COMPOSICAO__CONSEQUENTE);

		regraDeContextoEClass = createEClass(REGRA_DE_CONTEXTO);
		createEReference(regraDeContextoEClass, REGRA_DE_CONTEXTO__EVENTO);
		createEReference(regraDeContextoEClass, REGRA_DE_CONTEXTO__ACAO);

		eventoEClass = createEClass(EVENTO);

		eventoLogicoEClass = createEClass(EVENTO_LOGICO);
		createEReference(eventoLogicoEClass, EVENTO_LOGICO__LADO_DIREITO_EVENTO);
		createEAttribute(eventoLogicoEClass, EVENTO_LOGICO__OPERADOR_LOGICO);
		createEReference(eventoLogicoEClass, EVENTO_LOGICO__LADO_ESQUERDO_EVENTO);

		eventoRelacionalEClass = createEClass(EVENTO_RELACIONAL);
		createEReference(eventoRelacionalEClass, EVENTO_RELACIONAL__VARIAVEL_DE_CONTEXTO);
		createEAttribute(eventoRelacionalEClass, EVENTO_RELACIONAL__OPERADOR_RELACIONAL);
		createEAttribute(eventoRelacionalEClass, EVENTO_RELACIONAL__VALOR);

		acaoEClass = createEClass(ACAO);

		acaoLogicoEClass = createEClass(ACAO_LOGICO);
		createEReference(acaoLogicoEClass, ACAO_LOGICO__LADO_ESQUERDO_ACAO);
		createEAttribute(acaoLogicoEClass, ACAO_LOGICO__OPERADOR_ACAO_LOGICO);
		createEReference(acaoLogicoEClass, ACAO_LOGICO__LADO_DIREITO_ACAO);

		literalAcaoEClass = createEClass(LITERAL_ACAO);
		createEAttribute(literalAcaoEClass, LITERAL_ACAO__PRESENCA);
		createEReference(literalAcaoEClass, LITERAL_ACAO__ELEMENTO);

		designarEClass = createEClass(DESIGNAR);
		createEAttribute(designarEClass, DESIGNAR__VALOR);
		createEReference(designarEClass, DESIGNAR__ATRIBUTO);
		createEAttribute(designarEClass, DESIGNAR__TIPO_VALOR);

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

		simulacaoEClass = createEClass(SIMULACAO);
		createEAttribute(simulacaoEClass, SIMULACAO__NOME);
		createEReference(simulacaoEClass, SIMULACAO__TRANSICOES);
		createEReference(simulacaoEClass, SIMULACAO__ESTADOS);

		transicaoEClass = createEClass(TRANSICAO);
		createEReference(transicaoEClass, TRANSICAO__EANTIGO);
		createEReference(transicaoEClass, TRANSICAO__ENOVO);
		createEReference(transicaoEClass, TRANSICAO__REGRAS_QUEBRADAS);
		createEReference(transicaoEClass, TRANSICAO__ACOES);
		createEAttribute(transicaoEClass, TRANSICAO__SAFE);
		createEAttribute(transicaoEClass, TRANSICAO__ETIQUETA);

		estadoEClass = createEClass(ESTADO);
		createEAttribute(estadoEClass, ESTADO__NOME);
		createEReference(estadoEClass, ESTADO__PRODUTO);
		createEAttribute(estadoEClass, ESTADO__SAFE);

		inconsistenciaRegraAdaptacaoEClass = createEClass(INCONSISTENCIA_REGRA_ADAPTACAO);
		createEReference(inconsistenciaRegraAdaptacaoEClass, INCONSISTENCIA_REGRA_ADAPTACAO__REGRAS_INCONSISTENTES);
		createEReference(inconsistenciaRegraAdaptacaoEClass, INCONSISTENCIA_REGRA_ADAPTACAO__LITERAIS_INCONSISTENTES);
		createEReference(inconsistenciaRegraAdaptacaoEClass, INCONSISTENCIA_REGRA_ADAPTACAO__ATRIBUICOES_INCONSISTENTES);

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
		casoDeUsoEClass.getESuperTypes().add(this.getElementoExterno());
		casoDeTesteEClass.getESuperTypes().add(this.getElementoExterno());
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
		raizDeContextoEClass.getESuperTypes().add(this.getElemento());
		entidadeDeContextoEClass.getESuperTypes().add(this.getElemento());
		informacaoDeContextoEClass.getESuperTypes().add(this.getElemento());
		caracteristicaProdutoEClass.getESuperTypes().add(this.getElementoDeProduto());
		atributoProdutoEClass.getESuperTypes().add(this.getElementoDeProduto());
		caracteristicaMandatoriaProdutoEClass.getESuperTypes().add(this.getCaracteristicaProduto());
		caracteristicaOpcionalProdutoEClass.getESuperTypes().add(this.getCaracteristicaProduto());
		variacaoDoisProdutoEClass.getESuperTypes().add(this.getCaracteristicaProduto());
		caracteristicaAgrupadaProdutoEClass.getESuperTypes().add(this.getCaracteristicaProduto());
		variacaoProdutoEClass.getESuperTypes().add(this.getElementoDeProduto());
		varianteProdutoEClass.getESuperTypes().add(this.getElementoDeProduto());
		produtoEClass.getESuperTypes().add(this.getCaracteristicaProduto());
		regraDeComposicaoEClass.getESuperTypes().add(this.getRegra());
		regraDeContextoEClass.getESuperTypes().add(this.getRegra());
		eventoEClass.getESuperTypes().add(this.getExpressao());
		eventoLogicoEClass.getESuperTypes().add(this.getEvento());
		eventoRelacionalEClass.getESuperTypes().add(this.getEvento());
		acaoEClass.getESuperTypes().add(this.getExpressao());
		acaoLogicoEClass.getESuperTypes().add(this.getAcao());
		literalAcaoEClass.getESuperTypes().add(this.getAcao());
		designarEClass.getESuperTypes().add(this.getAcao());
		antecedenteEClass.getESuperTypes().add(this.getExpressao());
		expressaoLogicaEClass.getESuperTypes().add(this.getAntecedente());
		expressaoRelacionalEClass.getESuperTypes().add(this.getAntecedente());
		literalComposicaoEClass.getESuperTypes().add(this.getAntecedente());

		// Initialize classes and features; add operations and parameters
		initEClass(lpsEClass, caracteristica.LPS.class, "LPS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLPS_PontosDeVariacao(), this.getPontoDeVariacao(), null, "pontosDeVariacao", null, 0, -1, caracteristica.LPS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPS_Elementos(), this.getElemento(), null, "elementos", null, 0, -1, caracteristica.LPS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPS_Externos(), this.getElementoExterno(), null, "externos", null, 0, -1, caracteristica.LPS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPS_Regras(), this.getRegra(), null, "regras", null, 0, -1, caracteristica.LPS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPS_Produtos(), this.getProduto(), null, "produtos", null, 0, -1, caracteristica.LPS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPS_Expressoes(), this.getExpressao(), null, "expressoes", null, 0, -1, caracteristica.LPS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPS_ElementosDeProduto(), this.getElementoDeProduto(), null, "elementosDeProduto", null, 0, -1, caracteristica.LPS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPS_Sistema(), this.getCaracteristicaRaiz(), this.getCaracteristicaRaiz_LpsDoSistema(), "sistema", null, 0, 1, caracteristica.LPS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPS_Atributos(), this.getAtributo(), null, "atributos", null, 0, -1, caracteristica.LPS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLPS_ValoresContextuais(), ecorePackage.getEString(), "valoresContextuais", null, 0, -1, caracteristica.LPS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPS_Simulacoes(), this.getSimulacao(), null, "simulacoes", null, 0, -1, caracteristica.LPS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPS_InconsistenciaERA(), this.getInconsistenciaRegraAdaptacao(), null, "inconsistenciaERA", null, 0, -1, caracteristica.LPS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLPS_Erro(), ecorePackage.getEBooleanObject(), "erro", null, 0, -1, caracteristica.LPS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLPS_Nome(), ecorePackage.getEString(), "nome", null, 0, 1, caracteristica.LPS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementoEClass, Elemento.class, "Elemento", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElemento_Nome(), ecorePackage.getEString(), "nome", null, 0, 1, Elemento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementoExternoEClass, ElementoExterno.class, "ElementoExterno", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElementoExterno_Nome(), ecorePackage.getEString(), "nome", null, 0, 1, ElementoExterno.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(casoDeUsoEClass, CasoDeUso.class, "CasoDeUso", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(casoDeTesteEClass, CasoDeTeste.class, "CasoDeTeste", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(elementoCaracteristicoEClass, ElementoCaracteristico.class, "ElementoCaracteristico", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(atributoEClass, Atributo.class, "Atributo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAtributo_TipoValor(), this.getTipoValor(), "tipoValor", null, 0, 1, Atributo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAtributo_CaracteristicaPai(), this.getCaracteristica(), this.getCaracteristica_Atributo(), "caracteristicaPai", null, 0, 1, Atributo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(caracteristicaEClass, Caracteristica.class, "Caracteristica", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCaracteristica_ElementosExternos(), this.getElementoExterno(), null, "elementosExternos", null, 0, -1, Caracteristica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCaracteristica_CaracteristicaPai(), this.getCaracteristica(), this.getCaracteristica_CaracteristicaFilha(), "caracteristicaPai", null, 0, 1, Caracteristica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCaracteristica_CaracteristicaFilha(), this.getCaracteristica(), this.getCaracteristica_CaracteristicaPai(), "caracteristicaFilha", null, 0, -1, Caracteristica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCaracteristica_Variacoes(), this.getVariacao(), this.getVariacao_CaracteristicaPai(), "variacoes", null, 0, -1, Caracteristica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCaracteristica_Atributo(), this.getAtributo(), this.getAtributo_CaracteristicaPai(), "atributo", null, 0, -1, Caracteristica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(caracteristicaRaizEClass, CaracteristicaRaiz.class, "CaracteristicaRaiz", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCaracteristicaRaiz_LpsDoSistema(), this.getLPS(), this.getLPS_Sistema(), "LpsDoSistema", null, 1, 1, CaracteristicaRaiz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(raizDeContextoEClass, RaizDeContexto.class, "RaizDeContexto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRaizDeContexto_EntidadesDeContexto(), this.getEntidadeDeContexto(), this.getEntidadeDeContexto_Raiz(), "entidadesDeContexto", null, 0, -1, RaizDeContexto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entidadeDeContextoEClass, EntidadeDeContexto.class, "EntidadeDeContexto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntidadeDeContexto_Raiz(), this.getRaizDeContexto(), this.getRaizDeContexto_EntidadesDeContexto(), "raiz", null, 0, 1, EntidadeDeContexto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntidadeDeContexto_InformacoesDeContexto(), this.getInformacaoDeContexto(), this.getInformacaoDeContexto_ElementoPai(), "informacoesDeContexto", null, 0, -1, EntidadeDeContexto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(informacaoDeContextoEClass, InformacaoDeContexto.class, "InformacaoDeContexto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInformacaoDeContexto_Origem(), this.getOrigem(), "origem", null, 0, 1, InformacaoDeContexto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInformacaoDeContexto_Validade(), this.getValidade(), "validade", null, 0, 1, InformacaoDeContexto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInformacaoDeContexto_Qualidade(), this.getQualidade(), "qualidade", null, 0, 1, InformacaoDeContexto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInformacaoDeContexto_TipoValor(), this.getTipoValor(), "tipoValor", null, 0, 1, InformacaoDeContexto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInformacaoDeContexto_Valor(), ecorePackage.getEString(), "valor", null, 0, 1, InformacaoDeContexto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInformacaoDeContexto_ElementoPai(), this.getEntidadeDeContexto(), this.getEntidadeDeContexto_InformacoesDeContexto(), "elementoPai", null, 1, 1, InformacaoDeContexto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementoDeProdutoEClass, ElementoDeProduto.class, "ElementoDeProduto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElementoDeProduto_Nome(), ecorePackage.getEString(), "nome", null, 0, 1, ElementoDeProduto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementoDeProduto_ElementoOriginal(), this.getElemento(), null, "elementoOriginal", null, 0, 1, ElementoDeProduto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(caracteristicaProdutoEClass, CaracteristicaProduto.class, "CaracteristicaProduto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCaracteristicaProduto_CaracteristicaProdutoPai(), this.getCaracteristicaProduto(), this.getCaracteristicaProduto_CaracteristicaProdutoFilha(), "caracteristicaProdutoPai", null, 0, 1, CaracteristicaProduto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCaracteristicaProduto_CaracteristicaProdutoFilha(), this.getCaracteristicaProduto(), this.getCaracteristicaProduto_CaracteristicaProdutoPai(), "caracteristicaProdutoFilha", null, 0, -1, CaracteristicaProduto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCaracteristicaProduto_AtributoProduto(), this.getAtributoProduto(), this.getAtributoProduto_CaracteristicaProdutoPai(), "atributoProduto", null, 0, -1, CaracteristicaProduto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atributoProdutoEClass, AtributoProduto.class, "AtributoProduto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAtributoProduto_Valor(), ecorePackage.getEString(), "valor", null, 0, 1, AtributoProduto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtributoProduto_TipoValor(), this.getTipoValor(), "tipoValor", null, 0, 1, AtributoProduto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAtributoProduto_CaracteristicaProdutoPai(), this.getCaracteristicaProduto(), this.getCaracteristicaProduto_AtributoProduto(), "caracteristicaProdutoPai", null, 0, 1, AtributoProduto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(caracteristicaMandatoriaProdutoEClass, CaracteristicaMandatoriaProduto.class, "CaracteristicaMandatoriaProduto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(caracteristicaOpcionalProdutoEClass, CaracteristicaOpcionalProduto.class, "CaracteristicaOpcionalProduto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(variacaoDoisProdutoEClass, VariacaoDoisProduto.class, "VariacaoDoisProduto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariacaoDoisProduto_CardinalidadeMaxima(), this.getCardinalidadeMaxima(), "cardinalidadeMaxima", null, 0, 1, VariacaoDoisProduto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariacaoDoisProduto_CardinalidadeMinimaOr(), ecorePackage.getEIntegerObject(), "cardinalidadeMinimaOr", null, 0, 1, VariacaoDoisProduto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariacaoDoisProduto_CardinalidadeMaximaOr(), ecorePackage.getEIntegerObject(), "cardinalidadeMaximaOr", null, 0, 1, VariacaoDoisProduto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(caracteristicaAgrupadaProdutoEClass, CaracteristicaAgrupadaProduto.class, "CaracteristicaAgrupadaProduto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(variacaoProdutoEClass, VariacaoProduto.class, "VariacaoProduto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariacaoProduto_CardinalidadeMinima(), ecorePackage.getEIntegerObject(), "cardinalidadeMinima", null, 0, 1, VariacaoProduto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariacaoProduto_CardinalidadeMaxima(), ecorePackage.getEIntegerObject(), "cardinalidadeMaxima", null, 0, 1, VariacaoProduto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariacaoProduto_VariantesProduto(), this.getVarianteProduto(), this.getVarianteProduto_VariacaoProdutoPai(), "variantesProduto", null, 0, -1, VariacaoProduto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariacaoProduto_CaracteristicaProdutoPai(), this.getCaracteristicaProduto(), null, "caracteristicaProdutoPai", null, 0, 1, VariacaoProduto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(varianteProdutoEClass, VarianteProduto.class, "VarianteProduto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVarianteProduto_VariacaoProdutoPai(), this.getVariacaoProduto(), this.getVariacaoProduto_VariantesProduto(), "variacaoProdutoPai", null, 1, 1, VarianteProduto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVarianteProduto_Selecionado(), ecorePackage.getEBooleanObject(), "selecionado", null, 0, 1, VarianteProduto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(produtoEClass, Produto.class, "Produto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProduto_LinhaDoProduto(), this.getCaracteristicaRaiz(), null, "LinhaDoProduto", null, 0, 1, Produto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regraEClass, Regra.class, "Regra", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegra_Nome(), ecorePackage.getEString(), "nome", null, 0, 1, Regra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegra_Conteudo(), ecorePackage.getEString(), "conteudo", null, 0, 1, Regra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regraDeComposicaoEClass, RegraDeComposicao.class, "RegraDeComposicao", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegraDeComposicao_Antecedente(), this.getAntecedente(), null, "antecedente", null, 0, 1, RegraDeComposicao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegraDeComposicao_Consequente(), this.getAntecedente(), null, "consequente", null, 0, 1, RegraDeComposicao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regraDeContextoEClass, RegraDeContexto.class, "RegraDeContexto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegraDeContexto_Evento(), this.getEvento(), null, "evento", null, 0, 1, RegraDeContexto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegraDeContexto_Acao(), this.getAcao(), null, "acao", null, 0, 1, RegraDeContexto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventoEClass, Evento.class, "Evento", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eventoLogicoEClass, EventoLogico.class, "EventoLogico", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventoLogico_LadoDireitoEvento(), this.getEvento(), null, "ladoDireitoEvento", null, 0, 1, EventoLogico.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventoLogico_OperadorLogico(), this.getOperadorLogico(), "operadorLogico", null, 1, 1, EventoLogico.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventoLogico_LadoEsquerdoEvento(), this.getEvento(), null, "ladoEsquerdoEvento", null, 0, 1, EventoLogico.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventoRelacionalEClass, EventoRelacional.class, "EventoRelacional", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventoRelacional_VariavelDeContexto(), this.getInformacaoDeContexto(), null, "variavelDeContexto", null, 0, 1, EventoRelacional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventoRelacional_OperadorRelacional(), this.getOperadorRelacional(), "operadorRelacional", null, 0, 1, EventoRelacional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventoRelacional_Valor(), ecorePackage.getEString(), "valor", null, 0, 1, EventoRelacional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(acaoEClass, Acao.class, "Acao", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(acaoLogicoEClass, AcaoLogico.class, "AcaoLogico", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAcaoLogico_LadoEsquerdoAcao(), this.getAcao(), null, "ladoEsquerdoAcao", null, 1, 1, AcaoLogico.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcaoLogico_OperadorAcaoLogico(), this.getOperadorAcaoLogico(), "operadorAcaoLogico", null, 0, 1, AcaoLogico.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAcaoLogico_LadoDireitoAcao(), this.getAcao(), null, "ladoDireitoAcao", null, 1, 1, AcaoLogico.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(literalAcaoEClass, LiteralAcao.class, "LiteralAcao", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralAcao_Presenca(), this.getPresenca(), "presenca", null, 0, 1, LiteralAcao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLiteralAcao_Elemento(), this.getElementoCaracteristico(), null, "elemento", null, 0, 1, LiteralAcao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(designarEClass, Designar.class, "Designar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDesignar_Valor(), ecorePackage.getEString(), "valor", null, 0, 1, Designar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDesignar_Atributo(), this.getAtributo(), null, "atributo", null, 0, 1, Designar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDesignar_TipoValor(), this.getTipoValor(), "tipoValor", null, 0, 1, Designar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(simulacaoEClass, Simulacao.class, "Simulacao", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimulacao_Nome(), ecorePackage.getEString(), "nome", null, 0, 1, Simulacao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimulacao_Transicoes(), this.getTransicao(), null, "transicoes", null, 0, -1, Simulacao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimulacao_Estados(), this.getEstado(), null, "estados", null, 0, -1, Simulacao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transicaoEClass, Transicao.class, "Transicao", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransicao_EAntigo(), this.getEstado(), null, "eAntigo", null, 0, 1, Transicao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransicao_ENovo(), this.getEstado(), null, "eNovo", null, 0, 1, Transicao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransicao_RegrasQuebradas(), this.getRegraDeComposicao(), null, "regrasQuebradas", null, 0, -1, Transicao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransicao_Acoes(), this.getAcao(), null, "acoes", null, 0, -1, Transicao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransicao_Safe(), ecorePackage.getEBoolean(), "safe", null, 0, 1, Transicao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransicao_Etiqueta(), ecorePackage.getEString(), "etiqueta", null, 0, 1, Transicao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(estadoEClass, Estado.class, "Estado", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEstado_Nome(), ecorePackage.getEString(), "nome", null, 0, 1, Estado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEstado_Produto(), this.getCaracteristicaProduto(), null, "produto", null, 0, 1, Estado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEstado_Safe(), ecorePackage.getEBoolean(), "safe", null, 0, 1, Estado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inconsistenciaRegraAdaptacaoEClass, InconsistenciaRegraAdaptacao.class, "InconsistenciaRegraAdaptacao", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInconsistenciaRegraAdaptacao_RegrasInconsistentes(), this.getRegraDeContexto(), null, "regrasInconsistentes", null, 0, -1, InconsistenciaRegraAdaptacao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInconsistenciaRegraAdaptacao_LiteraisInconsistentes(), this.getLiteralAcao(), null, "literaisInconsistentes", null, 0, -1, InconsistenciaRegraAdaptacao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInconsistenciaRegraAdaptacao_AtribuicoesInconsistentes(), this.getDesignar(), null, "atribuicoesInconsistentes", null, 0, -1, InconsistenciaRegraAdaptacao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		// gmf.compartment
		createGmf_3Annotations();
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
		   new String[] {
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
		  (casoDeUsoEClass, 
		   source, 
		   new String[] {
			 "label", "nome",
			 "figure", "utils.TriangleFigure",
			 "label.pattern", "Externo {0}"
		   });	
		addAnnotation
		  (casoDeTesteEClass, 
		   source, 
		   new String[] {
			 "label", "nome",
			 "figure", "utils.TriangleFigure",
			 "label.pattern", "Externo {0}"
		   });	
		addAnnotation
		  (atributoEClass, 
		   source, 
		   new String[] {
			 "label", "nome",
			 "figure", "utils.TriangleFigure",
			 "label.pattern", "Attribute {0}"
		   });	
		addAnnotation
		  (caracteristicaRaizEClass, 
		   source, 
		   new String[] {
			 "label", "nome"
		   });	
		addAnnotation
		  (caracteristicaOpcionalEClass, 
		   source, 
		   new String[] {
			 "label", "nome",
			 "figure", "ellipse",
			 "border.style", "dash",
			 "border.width", "2"
		   });	
		addAnnotation
		  (caracteristicaAgrupadaEClass, 
		   source, 
		   new String[] {
			 "label", "nome",
			 "figure", "utils.TriangleFigure",
			 "border.style", "dash",
			 "border.width", "2"
		   });	
		addAnnotation
		  (caracteristicaMandatoriaEClass, 
		   source, 
		   new String[] {
			 "label", "nome",
			 "figure", "rectangle",
			 "border.style", "solid",
			 "border.width", "2"
		   });	
		addAnnotation
		  (variacaoDoisEClass, 
		   source, 
		   new String[] {
			 "label", "nome,cardinalidadeMaxima",
			 "label.pattern", "Variation {0} : {1} ",
			 "figure", "utils.DiamondFigure"
		   });	
		addAnnotation
		  (raizDeContextoEClass, 
		   source, 
		   new String[] {
			 "label", "nome"
		   });	
		addAnnotation
		  (entidadeDeContextoEClass, 
		   source, 
		   new String[] {
			 "label", "nome",
			 "label.pattern", "Entidade de Contexto {0}"
		   });	
		addAnnotation
		  (informacaoDeContextoEClass, 
		   source, 
		   new String[] {
			 "label", "nome,valor",
			 "label.pattern", "Informa\ufffd\ufffdo de Contexto: {0} Valor {1}"
		   });	
		addAnnotation
		  (atributoProdutoEClass, 
		   source, 
		   new String[] {
			 "label", "nome,valor",
			 "figure", "utils.TriangleFigure",
			 "label.pattern", "Attribute {0}:{1}"
		   });	
		addAnnotation
		  (caracteristicaMandatoriaProdutoEClass, 
		   source, 
		   new String[] {
			 "label", "nome",
			 "figure", "ellipse"
		   });	
		addAnnotation
		  (caracteristicaOpcionalProdutoEClass, 
		   source, 
		   new String[] {
			 "label", "nome",
			 "figure", "ellipse"
		   });	
		addAnnotation
		  (variacaoDoisProdutoEClass, 
		   source, 
		   new String[] {
			 "label", "nome,cardinalidadeMaxima",
			 "label.pattern", "Variation {0} : {1} ",
			 "figure", "utils.DiamondFigure"
		   });	
		addAnnotation
		  (caracteristicaAgrupadaProdutoEClass, 
		   source, 
		   new String[] {
			 "label", "nome",
			 "figure", "TriangleFigure"
		   });	
		addAnnotation
		  (produtoEClass, 
		   source, 
		   new String[] {
			 "label", "nome",
			 "label.pattern", "Product: {0}",
			 "figure", "ellipse"
		   });	
		addAnnotation
		  (regraDeComposicaoEClass, 
		   source, 
		   new String[] {
			 "label", "nome",
			 "label.pattern", "Composition Rule {0}"
		   });	
		addAnnotation
		  (regraDeContextoEClass, 
		   source, 
		   new String[] {
			 "label", "nome",
			 "label.pattern", "Regra de Contexto {0}"
		   });	
		addAnnotation
		  (eventoLogicoEClass, 
		   source, 
		   new String[] {
			 "label", "operadorLogico"
		   });	
		addAnnotation
		  (eventoRelacionalEClass, 
		   source, 
		   new String[] {
			 "label", "nome"
		   });	
		addAnnotation
		  (acaoLogicoEClass, 
		   source, 
		   new String[] {
			 "label", "operadorAcaoLogico"
		   });	
		addAnnotation
		  (literalAcaoEClass, 
		   source, 
		   new String[] {
			 "label", "nome"
		   });	
		addAnnotation
		  (designarEClass, 
		   source, 
		   new String[] {
			 "label", "nome"
		   });	
		addAnnotation
		  (expressaoLogicaEClass, 
		   source, 
		   new String[] {
			 "label", "operadorLogico"
		   });	
		addAnnotation
		  (expressaoRelacionalEClass, 
		   source, 
		   new String[] {
			 "label", "nome"
		   });	
		addAnnotation
		  (literalComposicaoEClass, 
		   source, 
		   new String[] {
			 "label", "nome"
		   });	
		addAnnotation
		  (simulacaoEClass, 
		   source, 
		   new String[] {
			 "label", "nome",
			 "label.pattern", "Simulation {0}"
		   });	
		addAnnotation
		  (estadoEClass, 
		   source, 
		   new String[] {
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
		  (getCaracteristica_ElementosExternos(), 
		   source, 
		   new String[] {
			 "target.decoration", "closedarrow",
			 "color", "0,0,0",
			 "style", "solid",
			 "width", "3"
		   });	
		addAnnotation
		  (getCaracteristica_CaracteristicaFilha(), 
		   source, 
		   new String[] {
			 "target.decoration", "closedarrow",
			 "color", "0,0,0",
			 "style", "solid",
			 "width", "3"
		   });	
		addAnnotation
		  (getCaracteristica_Variacoes(), 
		   source, 
		   new String[] {
			 "target.decoration", "closedarrow",
			 "color", "0,0,0",
			 "style", "solid",
			 "width", "3"
		   });	
		addAnnotation
		  (getCaracteristica_Atributo(), 
		   source, 
		   new String[] {
			 "target.decoration", "closedarrow",
			 "color", "0,0,0",
			 "style", "solid",
			 "width", "3"
		   });	
		addAnnotation
		  (getVariacao_Variantes(), 
		   source, 
		   new String[] {
			 "target.decoration", "closedarrow",
			 "color", "0,0,0",
			 "style", "solid",
			 "width", "3"
		   });	
		addAnnotation
		  (getRaizDeContexto_EntidadesDeContexto(), 
		   source, 
		   new String[] {
			 "target.decoration", "closedarrow",
			 "color", "0,0,0",
			 "style", "solid",
			 "width", "3"
		   });	
		addAnnotation
		  (getEntidadeDeContexto_InformacoesDeContexto(), 
		   source, 
		   new String[] {
			 "target.decoration", "closedarrow",
			 "color", "0,0,0",
			 "style", "solid",
			 "width", "3"
		   });	
		addAnnotation
		  (getCaracteristicaProduto_CaracteristicaProdutoFilha(), 
		   source, 
		   new String[] {
			 "target.decoration", "closedarrow",
			 "color", "0,0,0",
			 "style", "solid",
			 "width", "3"
		   });	
		addAnnotation
		  (getCaracteristicaProduto_AtributoProduto(), 
		   source, 
		   new String[] {
			 "target.decoration", "closedarrow",
			 "color", "0,0,0",
			 "style", "solid",
			 "width", "3"
		   });	
		addAnnotation
		  (getVariacaoProduto_VariantesProduto(), 
		   source, 
		   new String[] {
			 "target.decoration", "closedarrow",
			 "color", "0,0,0",
			 "style", "solid",
			 "width", "3"
		   });	
		addAnnotation
		  (getProduto_LinhaDoProduto(), 
		   source, 
		   new String[] {
			 "target.decoration", "closedarrow",
			 "color", "0,0,0",
			 "style", "solid"
		   });	
		addAnnotation
		  (getRegraDeComposicao_Antecedente(), 
		   source, 
		   new String[] {
			 "target.decoration", "closedarrow",
			 "color", "0,0,0",
			 "style", "solid",
			 "label", "antecedent"
		   });	
		addAnnotation
		  (getRegraDeComposicao_Consequente(), 
		   source, 
		   new String[] {
			 "target.decoration", "closedarrow",
			 "color", "0,0,0",
			 "style", "solid",
			 "label", "consequent"
		   });	
		addAnnotation
		  (getRegraDeContexto_Evento(), 
		   source, 
		   new String[] {
			 "target.decoration", "closedarrow",
			 "color", "0,0,0",
			 "style", "solid",
			 "label", "evento",
			 "width", "3"
		   });	
		addAnnotation
		  (getRegraDeContexto_Acao(), 
		   source, 
		   new String[] {
			 "target.decoration", "closedarrow",
			 "color", "0,0,0",
			 "style", "solid",
			 "label", "a\ufffd\ufffdo",
			 "width", "3"
		   });	
		addAnnotation
		  (getEventoLogico_LadoDireitoEvento(), 
		   source, 
		   new String[] {
			 "target.decoration", "closedarrow",
			 "color", "0,0,0",
			 "style", "solid",
			 "width", "3"
		   });	
		addAnnotation
		  (getEventoLogico_LadoEsquerdoEvento(), 
		   source, 
		   new String[] {
			 "target.decoration", "closedarrow",
			 "color", "0,0,0",
			 "style", "solid",
			 "width", "3"
		   });	
		addAnnotation
		  (getAcaoLogico_LadoEsquerdoAcao(), 
		   source, 
		   new String[] {
			 "target.decoration", "closedarrow",
			 "color", "0,0,0",
			 "style", "solid",
			 "width", "3"
		   });	
		addAnnotation
		  (getAcaoLogico_LadoDireitoAcao(), 
		   source, 
		   new String[] {
			 "target.decoration", "closedarrow",
			 "color", "0,0,0",
			 "style", "solid",
			 "width", "3"
		   });	
		addAnnotation
		  (getExpressaoLogica_LadoDireitoComposicao(), 
		   source, 
		   new String[] {
			 "target.decoration", "closedarrow",
			 "color", "0,0,0",
			 "style", "solid",
			 "width", "3"
		   });	
		addAnnotation
		  (getExpressaoLogica_LadoEsquerdoComposicao(), 
		   source, 
		   new String[] {
			 "target.decoration", "closedarrow",
			 "color", "0,0,0",
			 "style", "solid",
			 "width", "3"
		   });	
		addAnnotation
		  (transicaoEClass, 
		   source, 
		   new String[] {
			 "source", "eAntigo",
			 "target", "eNovo",
			 "target.decoration", "closedarrow",
			 "width", "2",
			 "label", "etiqueta"
		   });
	}

  /**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void createGmf_3Annotations()
  {
		String source = "gmf.compartment";	
		addAnnotation
		  (getSimulacao_Estados(), 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });
	}

} //CaracteristicaPackageImpl
