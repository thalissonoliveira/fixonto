/**
 */
package caracteristica;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see caracteristica.CaracteristicaFactory
 * @model kind="package"
 * @generated
 */
public interface CaracteristicaPackage extends EPackage
{
  /**
	 * The package name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNAME = "caracteristica";

  /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_URI = "caracteristica";

  /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_PREFIX = "caracteristica";

  /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  CaracteristicaPackage eINSTANCE = caracteristica.impl.CaracteristicaPackageImpl.init();

  /**
	 * The meta object id for the '{@link caracteristica.impl.LPSImpl <em>LPS</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.impl.LPSImpl
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getLPS()
	 * @generated
	 */
  int LPS = 0;

  /**
	 * The feature id for the '<em><b>Pontos De Variacao</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LPS__PONTOS_DE_VARIACAO = 0;

  /**
	 * The feature id for the '<em><b>Elementos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LPS__ELEMENTOS = 1;

  /**
	 * The feature id for the '<em><b>Regras</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LPS__REGRAS = 2;

  /**
	 * The feature id for the '<em><b>Produtos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LPS__PRODUTOS = 3;

  /**
	 * The feature id for the '<em><b>Expressoes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LPS__EXPRESSOES = 4;

  /**
	 * The feature id for the '<em><b>Elementos De Produto</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LPS__ELEMENTOS_DE_PRODUTO = 5;

  /**
	 * The feature id for the '<em><b>Sistema</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LPS__SISTEMA = 6;

  /**
	 * The feature id for the '<em><b>Atributos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LPS__ATRIBUTOS = 7;

  /**
	 * The feature id for the '<em><b>Valores Contextuais</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LPS__VALORES_CONTEXTUAIS = 8;

  /**
	 * The feature id for the '<em><b>Simulacoes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LPS__SIMULACOES = 9;

  /**
	 * The feature id for the '<em><b>Inconsistencia ERA</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LPS__INCONSISTENCIA_ERA = 10;

  /**
	 * The feature id for the '<em><b>Erro</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LPS__ERRO = 11;

  /**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LPS__NOME = 12;

  /**
	 * The number of structural features of the '<em>LPS</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LPS_FEATURE_COUNT = 13;

  /**
	 * The meta object id for the '{@link caracteristica.impl.ElementoImpl <em>Elemento</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.impl.ElementoImpl
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getElemento()
	 * @generated
	 */
  int ELEMENTO = 1;

  /**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ELEMENTO__NOME = 0;

  /**
	 * The number of structural features of the '<em>Elemento</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ELEMENTO_FEATURE_COUNT = 1;

  /**
	 * The meta object id for the '{@link caracteristica.impl.ElementoCaracteristicoImpl <em>Elemento Caracteristico</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.impl.ElementoCaracteristicoImpl
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getElementoCaracteristico()
	 * @generated
	 */
  int ELEMENTO_CARACTERISTICO = 2;

  /**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ELEMENTO_CARACTERISTICO__NOME = ELEMENTO__NOME;

  /**
	 * The number of structural features of the '<em>Elemento Caracteristico</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ELEMENTO_CARACTERISTICO_FEATURE_COUNT = ELEMENTO_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link caracteristica.impl.AtributoImpl <em>Atributo</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.impl.AtributoImpl
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getAtributo()
	 * @generated
	 */
  int ATRIBUTO = 3;

  /**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ATRIBUTO__NOME = ELEMENTO__NOME;

  /**
	 * The feature id for the '<em><b>Tipo Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ATRIBUTO__TIPO_VALOR = ELEMENTO_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Caracteristica Pai</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ATRIBUTO__CARACTERISTICA_PAI = ELEMENTO_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Atributo</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ATRIBUTO_FEATURE_COUNT = ELEMENTO_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link caracteristica.impl.CaracteristicaImpl <em>Caracteristica</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.impl.CaracteristicaImpl
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getCaracteristica()
	 * @generated
	 */
  int CARACTERISTICA = 4;

  /**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CARACTERISTICA__NOME = ELEMENTO__NOME;

  /**
	 * The feature id for the '<em><b>Caracteristica Pai</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CARACTERISTICA__CARACTERISTICA_PAI = ELEMENTO_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Caracteristica Filha</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CARACTERISTICA__CARACTERISTICA_FILHA = ELEMENTO_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Variacoes</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CARACTERISTICA__VARIACOES = ELEMENTO_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Atributo</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CARACTERISTICA__ATRIBUTO = ELEMENTO_FEATURE_COUNT + 3;

  /**
	 * The number of structural features of the '<em>Caracteristica</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CARACTERISTICA_FEATURE_COUNT = ELEMENTO_FEATURE_COUNT + 4;

  /**
	 * The meta object id for the '{@link caracteristica.impl.CaracteristicaRaizImpl <em>Raiz</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.impl.CaracteristicaRaizImpl
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getCaracteristicaRaiz()
	 * @generated
	 */
  int CARACTERISTICA_RAIZ = 5;

  /**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CARACTERISTICA_RAIZ__NOME = CARACTERISTICA__NOME;

  /**
	 * The feature id for the '<em><b>Caracteristica Pai</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CARACTERISTICA_RAIZ__CARACTERISTICA_PAI = CARACTERISTICA__CARACTERISTICA_PAI;

  /**
	 * The feature id for the '<em><b>Caracteristica Filha</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CARACTERISTICA_RAIZ__CARACTERISTICA_FILHA = CARACTERISTICA__CARACTERISTICA_FILHA;

  /**
	 * The feature id for the '<em><b>Variacoes</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CARACTERISTICA_RAIZ__VARIACOES = CARACTERISTICA__VARIACOES;

  /**
	 * The feature id for the '<em><b>Atributo</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CARACTERISTICA_RAIZ__ATRIBUTO = CARACTERISTICA__ATRIBUTO;

  /**
	 * The feature id for the '<em><b>Lps Do Sistema</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CARACTERISTICA_RAIZ__LPS_DO_SISTEMA = CARACTERISTICA_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Raiz</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CARACTERISTICA_RAIZ_FEATURE_COUNT = CARACTERISTICA_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link caracteristica.impl.CaracteristicaOpcionalImpl <em>Opcional</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.impl.CaracteristicaOpcionalImpl
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getCaracteristicaOpcional()
	 * @generated
	 */
  int CARACTERISTICA_OPCIONAL = 6;

  /**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CARACTERISTICA_OPCIONAL__NOME = CARACTERISTICA__NOME;

  /**
	 * The feature id for the '<em><b>Caracteristica Pai</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CARACTERISTICA_OPCIONAL__CARACTERISTICA_PAI = CARACTERISTICA__CARACTERISTICA_PAI;

  /**
	 * The feature id for the '<em><b>Caracteristica Filha</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CARACTERISTICA_OPCIONAL__CARACTERISTICA_FILHA = CARACTERISTICA__CARACTERISTICA_FILHA;

  /**
	 * The feature id for the '<em><b>Variacoes</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CARACTERISTICA_OPCIONAL__VARIACOES = CARACTERISTICA__VARIACOES;

  /**
	 * The feature id for the '<em><b>Atributo</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CARACTERISTICA_OPCIONAL__ATRIBUTO = CARACTERISTICA__ATRIBUTO;

  /**
	 * The number of structural features of the '<em>Opcional</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CARACTERISTICA_OPCIONAL_FEATURE_COUNT = CARACTERISTICA_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link caracteristica.impl.CaracteristicaAgrupadaImpl <em>Agrupada</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.impl.CaracteristicaAgrupadaImpl
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getCaracteristicaAgrupada()
	 * @generated
	 */
  int CARACTERISTICA_AGRUPADA = 7;

  /**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CARACTERISTICA_AGRUPADA__NOME = CARACTERISTICA__NOME;

  /**
	 * The feature id for the '<em><b>Caracteristica Pai</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CARACTERISTICA_AGRUPADA__CARACTERISTICA_PAI = CARACTERISTICA__CARACTERISTICA_PAI;

  /**
	 * The feature id for the '<em><b>Caracteristica Filha</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CARACTERISTICA_AGRUPADA__CARACTERISTICA_FILHA = CARACTERISTICA__CARACTERISTICA_FILHA;

  /**
	 * The feature id for the '<em><b>Variacoes</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CARACTERISTICA_AGRUPADA__VARIACOES = CARACTERISTICA__VARIACOES;

  /**
	 * The feature id for the '<em><b>Atributo</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CARACTERISTICA_AGRUPADA__ATRIBUTO = CARACTERISTICA__ATRIBUTO;

  /**
	 * The number of structural features of the '<em>Agrupada</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CARACTERISTICA_AGRUPADA_FEATURE_COUNT = CARACTERISTICA_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link caracteristica.impl.CaracteristicaMandatoriaImpl <em>Mandatoria</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.impl.CaracteristicaMandatoriaImpl
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getCaracteristicaMandatoria()
	 * @generated
	 */
  int CARACTERISTICA_MANDATORIA = 8;

  /**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CARACTERISTICA_MANDATORIA__NOME = CARACTERISTICA__NOME;

  /**
	 * The feature id for the '<em><b>Caracteristica Pai</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CARACTERISTICA_MANDATORIA__CARACTERISTICA_PAI = CARACTERISTICA__CARACTERISTICA_PAI;

  /**
	 * The feature id for the '<em><b>Caracteristica Filha</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CARACTERISTICA_MANDATORIA__CARACTERISTICA_FILHA = CARACTERISTICA__CARACTERISTICA_FILHA;

  /**
	 * The feature id for the '<em><b>Variacoes</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CARACTERISTICA_MANDATORIA__VARIACOES = CARACTERISTICA__VARIACOES;

  /**
	 * The feature id for the '<em><b>Atributo</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CARACTERISTICA_MANDATORIA__ATRIBUTO = CARACTERISTICA__ATRIBUTO;

  /**
	 * The number of structural features of the '<em>Mandatoria</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CARACTERISTICA_MANDATORIA_FEATURE_COUNT = CARACTERISTICA_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link caracteristica.impl.VariacaoDoisImpl <em>Variacao Dois</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.impl.VariacaoDoisImpl
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getVariacaoDois()
	 * @generated
	 */
  int VARIACAO_DOIS = 9;

  /**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIACAO_DOIS__NOME = CARACTERISTICA__NOME;

  /**
	 * The feature id for the '<em><b>Caracteristica Pai</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIACAO_DOIS__CARACTERISTICA_PAI = CARACTERISTICA__CARACTERISTICA_PAI;

  /**
	 * The feature id for the '<em><b>Caracteristica Filha</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIACAO_DOIS__CARACTERISTICA_FILHA = CARACTERISTICA__CARACTERISTICA_FILHA;

  /**
	 * The feature id for the '<em><b>Variacoes</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIACAO_DOIS__VARIACOES = CARACTERISTICA__VARIACOES;

  /**
	 * The feature id for the '<em><b>Atributo</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIACAO_DOIS__ATRIBUTO = CARACTERISTICA__ATRIBUTO;

  /**
	 * The feature id for the '<em><b>Cardinalidade Maxima</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIACAO_DOIS__CARDINALIDADE_MAXIMA = CARACTERISTICA_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Cardinalidade Minima Or</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIACAO_DOIS__CARDINALIDADE_MINIMA_OR = CARACTERISTICA_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Cardinalidade Maxima Or</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIACAO_DOIS__CARDINALIDADE_MAXIMA_OR = CARACTERISTICA_FEATURE_COUNT + 2;

  /**
	 * The number of structural features of the '<em>Variacao Dois</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIACAO_DOIS_FEATURE_COUNT = CARACTERISTICA_FEATURE_COUNT + 3;

  /**
	 * The meta object id for the '{@link caracteristica.impl.PontoDeVariacaoImpl <em>Ponto De Variacao</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.impl.PontoDeVariacaoImpl
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getPontoDeVariacao()
	 * @generated
	 */
  int PONTO_DE_VARIACAO = 10;

  /**
	 * The number of structural features of the '<em>Ponto De Variacao</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PONTO_DE_VARIACAO_FEATURE_COUNT = 0;

  /**
	 * The meta object id for the '{@link caracteristica.impl.VariacaoImpl <em>Variacao</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.impl.VariacaoImpl
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getVariacao()
	 * @generated
	 */
  int VARIACAO = 11;

  /**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIACAO__NOME = PONTO_DE_VARIACAO_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Cardinalidade Minima</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIACAO__CARDINALIDADE_MINIMA = PONTO_DE_VARIACAO_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Cardinalidade Maxima</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIACAO__CARDINALIDADE_MAXIMA = PONTO_DE_VARIACAO_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Variantes</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIACAO__VARIANTES = PONTO_DE_VARIACAO_FEATURE_COUNT + 3;

  /**
	 * The feature id for the '<em><b>Caracteristica Pai</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIACAO__CARACTERISTICA_PAI = PONTO_DE_VARIACAO_FEATURE_COUNT + 4;

  /**
	 * The number of structural features of the '<em>Variacao</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIACAO_FEATURE_COUNT = PONTO_DE_VARIACAO_FEATURE_COUNT + 5;

  /**
	 * The meta object id for the '{@link caracteristica.impl.VarianteImpl <em>Variante</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.impl.VarianteImpl
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getVariante()
	 * @generated
	 */
  int VARIANTE = 12;

  /**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIANTE__NOME = PONTO_DE_VARIACAO_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Caracteristica Pai</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIANTE__CARACTERISTICA_PAI = PONTO_DE_VARIACAO_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Caracteristica Filha</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIANTE__CARACTERISTICA_FILHA = PONTO_DE_VARIACAO_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Variacoes</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIANTE__VARIACOES = PONTO_DE_VARIACAO_FEATURE_COUNT + 3;

  /**
	 * The feature id for the '<em><b>Atributo</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIANTE__ATRIBUTO = PONTO_DE_VARIACAO_FEATURE_COUNT + 4;

  /**
	 * The feature id for the '<em><b>Variacao Pai</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIANTE__VARIACAO_PAI = PONTO_DE_VARIACAO_FEATURE_COUNT + 5;

  /**
	 * The number of structural features of the '<em>Variante</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIANTE_FEATURE_COUNT = PONTO_DE_VARIACAO_FEATURE_COUNT + 6;

  /**
	 * The meta object id for the '{@link caracteristica.impl.RaizDeContextoImpl <em>Raiz De Contexto</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.impl.RaizDeContextoImpl
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getRaizDeContexto()
	 * @generated
	 */
  int RAIZ_DE_CONTEXTO = 13;

  /**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RAIZ_DE_CONTEXTO__NOME = ELEMENTO__NOME;

  /**
	 * The feature id for the '<em><b>Entidades De Contexto</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RAIZ_DE_CONTEXTO__ENTIDADES_DE_CONTEXTO = ELEMENTO_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Raiz De Contexto</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RAIZ_DE_CONTEXTO_FEATURE_COUNT = ELEMENTO_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link caracteristica.impl.EntidadeDeContextoImpl <em>Entidade De Contexto</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.impl.EntidadeDeContextoImpl
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getEntidadeDeContexto()
	 * @generated
	 */
  int ENTIDADE_DE_CONTEXTO = 14;

  /**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ENTIDADE_DE_CONTEXTO__NOME = ELEMENTO__NOME;

  /**
	 * The feature id for the '<em><b>Raiz</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ENTIDADE_DE_CONTEXTO__RAIZ = ELEMENTO_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Informacoes De Contexto</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ENTIDADE_DE_CONTEXTO__INFORMACOES_DE_CONTEXTO = ELEMENTO_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Entidade De Contexto</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ENTIDADE_DE_CONTEXTO_FEATURE_COUNT = ELEMENTO_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link caracteristica.impl.InformacaoDeContextoImpl <em>Informacao De Contexto</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.impl.InformacaoDeContextoImpl
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getInformacaoDeContexto()
	 * @generated
	 */
  int INFORMACAO_DE_CONTEXTO = 15;

  /**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INFORMACAO_DE_CONTEXTO__NOME = ELEMENTO__NOME;

  /**
	 * The feature id for the '<em><b>Origem</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INFORMACAO_DE_CONTEXTO__ORIGEM = ELEMENTO_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Validade</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INFORMACAO_DE_CONTEXTO__VALIDADE = ELEMENTO_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Qualidade</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INFORMACAO_DE_CONTEXTO__QUALIDADE = ELEMENTO_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Tipo Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INFORMACAO_DE_CONTEXTO__TIPO_VALOR = ELEMENTO_FEATURE_COUNT + 3;

  /**
	 * The feature id for the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INFORMACAO_DE_CONTEXTO__VALOR = ELEMENTO_FEATURE_COUNT + 4;

  /**
	 * The feature id for the '<em><b>Elemento Pai</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INFORMACAO_DE_CONTEXTO__ELEMENTO_PAI = ELEMENTO_FEATURE_COUNT + 5;

  /**
	 * The number of structural features of the '<em>Informacao De Contexto</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INFORMACAO_DE_CONTEXTO_FEATURE_COUNT = ELEMENTO_FEATURE_COUNT + 6;

  /**
	 * The meta object id for the '{@link caracteristica.impl.ElementoDeProdutoImpl <em>Elemento De Produto</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.impl.ElementoDeProdutoImpl
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getElementoDeProduto()
	 * @generated
	 */
  int ELEMENTO_DE_PRODUTO = 16;

  /**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ELEMENTO_DE_PRODUTO__NOME = 0;

  /**
	 * The feature id for the '<em><b>Elemento Original</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ELEMENTO_DE_PRODUTO__ELEMENTO_ORIGINAL = 1;

  /**
	 * The number of structural features of the '<em>Elemento De Produto</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ELEMENTO_DE_PRODUTO_FEATURE_COUNT = 2;

  /**
	 * The meta object id for the '{@link caracteristica.impl.CaracteristicaProdutoImpl <em>Produto</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.impl.CaracteristicaProdutoImpl
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getCaracteristicaProduto()
	 * @generated
	 */
  int CARACTERISTICA_PRODUTO = 17;

  /**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CARACTERISTICA_PRODUTO__NOME = ELEMENTO_DE_PRODUTO__NOME;

  /**
	 * The feature id for the '<em><b>Elemento Original</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CARACTERISTICA_PRODUTO__ELEMENTO_ORIGINAL = ELEMENTO_DE_PRODUTO__ELEMENTO_ORIGINAL;

  /**
	 * The feature id for the '<em><b>Caracteristica Produto Pai</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CARACTERISTICA_PRODUTO__CARACTERISTICA_PRODUTO_PAI = ELEMENTO_DE_PRODUTO_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Caracteristica Produto Filha</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CARACTERISTICA_PRODUTO__CARACTERISTICA_PRODUTO_FILHA = ELEMENTO_DE_PRODUTO_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Atributo Produto</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CARACTERISTICA_PRODUTO__ATRIBUTO_PRODUTO = ELEMENTO_DE_PRODUTO_FEATURE_COUNT + 2;

  /**
	 * The number of structural features of the '<em>Produto</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CARACTERISTICA_PRODUTO_FEATURE_COUNT = ELEMENTO_DE_PRODUTO_FEATURE_COUNT + 3;

  /**
	 * The meta object id for the '{@link caracteristica.impl.AtributoProdutoImpl <em>Atributo Produto</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.impl.AtributoProdutoImpl
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getAtributoProduto()
	 * @generated
	 */
  int ATRIBUTO_PRODUTO = 18;

  /**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ATRIBUTO_PRODUTO__NOME = ELEMENTO_DE_PRODUTO__NOME;

  /**
	 * The feature id for the '<em><b>Elemento Original</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ATRIBUTO_PRODUTO__ELEMENTO_ORIGINAL = ELEMENTO_DE_PRODUTO__ELEMENTO_ORIGINAL;

  /**
	 * The feature id for the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ATRIBUTO_PRODUTO__VALOR = ELEMENTO_DE_PRODUTO_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Tipo Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ATRIBUTO_PRODUTO__TIPO_VALOR = ELEMENTO_DE_PRODUTO_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Caracteristica Produto Pai</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ATRIBUTO_PRODUTO__CARACTERISTICA_PRODUTO_PAI = ELEMENTO_DE_PRODUTO_FEATURE_COUNT + 2;

  /**
	 * The number of structural features of the '<em>Atributo Produto</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ATRIBUTO_PRODUTO_FEATURE_COUNT = ELEMENTO_DE_PRODUTO_FEATURE_COUNT + 3;

  /**
	 * The meta object id for the '{@link caracteristica.impl.CaracteristicaMandatoriaProdutoImpl <em>Mandatoria Produto</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.impl.CaracteristicaMandatoriaProdutoImpl
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getCaracteristicaMandatoriaProduto()
	 * @generated
	 */
  int CARACTERISTICA_MANDATORIA_PRODUTO = 19;

  /**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CARACTERISTICA_MANDATORIA_PRODUTO__NOME = CARACTERISTICA_PRODUTO__NOME;

  /**
	 * The feature id for the '<em><b>Elemento Original</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CARACTERISTICA_MANDATORIA_PRODUTO__ELEMENTO_ORIGINAL = CARACTERISTICA_PRODUTO__ELEMENTO_ORIGINAL;

  /**
	 * The feature id for the '<em><b>Caracteristica Produto Pai</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CARACTERISTICA_MANDATORIA_PRODUTO__CARACTERISTICA_PRODUTO_PAI = CARACTERISTICA_PRODUTO__CARACTERISTICA_PRODUTO_PAI;

  /**
	 * The feature id for the '<em><b>Caracteristica Produto Filha</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CARACTERISTICA_MANDATORIA_PRODUTO__CARACTERISTICA_PRODUTO_FILHA = CARACTERISTICA_PRODUTO__CARACTERISTICA_PRODUTO_FILHA;

  /**
	 * The feature id for the '<em><b>Atributo Produto</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CARACTERISTICA_MANDATORIA_PRODUTO__ATRIBUTO_PRODUTO = CARACTERISTICA_PRODUTO__ATRIBUTO_PRODUTO;

  /**
	 * The number of structural features of the '<em>Mandatoria Produto</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CARACTERISTICA_MANDATORIA_PRODUTO_FEATURE_COUNT = CARACTERISTICA_PRODUTO_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link caracteristica.impl.CaracteristicaOpcionalProdutoImpl <em>Opcional Produto</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.impl.CaracteristicaOpcionalProdutoImpl
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getCaracteristicaOpcionalProduto()
	 * @generated
	 */
  int CARACTERISTICA_OPCIONAL_PRODUTO = 20;

  /**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CARACTERISTICA_OPCIONAL_PRODUTO__NOME = CARACTERISTICA_PRODUTO__NOME;

  /**
	 * The feature id for the '<em><b>Elemento Original</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CARACTERISTICA_OPCIONAL_PRODUTO__ELEMENTO_ORIGINAL = CARACTERISTICA_PRODUTO__ELEMENTO_ORIGINAL;

  /**
	 * The feature id for the '<em><b>Caracteristica Produto Pai</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CARACTERISTICA_OPCIONAL_PRODUTO__CARACTERISTICA_PRODUTO_PAI = CARACTERISTICA_PRODUTO__CARACTERISTICA_PRODUTO_PAI;

  /**
	 * The feature id for the '<em><b>Caracteristica Produto Filha</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CARACTERISTICA_OPCIONAL_PRODUTO__CARACTERISTICA_PRODUTO_FILHA = CARACTERISTICA_PRODUTO__CARACTERISTICA_PRODUTO_FILHA;

  /**
	 * The feature id for the '<em><b>Atributo Produto</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CARACTERISTICA_OPCIONAL_PRODUTO__ATRIBUTO_PRODUTO = CARACTERISTICA_PRODUTO__ATRIBUTO_PRODUTO;

  /**
	 * The number of structural features of the '<em>Opcional Produto</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CARACTERISTICA_OPCIONAL_PRODUTO_FEATURE_COUNT = CARACTERISTICA_PRODUTO_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link caracteristica.impl.VariacaoDoisProdutoImpl <em>Variacao Dois Produto</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.impl.VariacaoDoisProdutoImpl
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getVariacaoDoisProduto()
	 * @generated
	 */
  int VARIACAO_DOIS_PRODUTO = 21;

  /**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIACAO_DOIS_PRODUTO__NOME = CARACTERISTICA_PRODUTO__NOME;

  /**
	 * The feature id for the '<em><b>Elemento Original</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIACAO_DOIS_PRODUTO__ELEMENTO_ORIGINAL = CARACTERISTICA_PRODUTO__ELEMENTO_ORIGINAL;

  /**
	 * The feature id for the '<em><b>Caracteristica Produto Pai</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIACAO_DOIS_PRODUTO__CARACTERISTICA_PRODUTO_PAI = CARACTERISTICA_PRODUTO__CARACTERISTICA_PRODUTO_PAI;

  /**
	 * The feature id for the '<em><b>Caracteristica Produto Filha</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIACAO_DOIS_PRODUTO__CARACTERISTICA_PRODUTO_FILHA = CARACTERISTICA_PRODUTO__CARACTERISTICA_PRODUTO_FILHA;

  /**
	 * The feature id for the '<em><b>Atributo Produto</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIACAO_DOIS_PRODUTO__ATRIBUTO_PRODUTO = CARACTERISTICA_PRODUTO__ATRIBUTO_PRODUTO;

  /**
	 * The feature id for the '<em><b>Cardinalidade Maxima</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIACAO_DOIS_PRODUTO__CARDINALIDADE_MAXIMA = CARACTERISTICA_PRODUTO_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Cardinalidade Minima Or</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIACAO_DOIS_PRODUTO__CARDINALIDADE_MINIMA_OR = CARACTERISTICA_PRODUTO_FEATURE_COUNT + 1;

		/**
	 * The feature id for the '<em><b>Cardinalidade Maxima Or</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIACAO_DOIS_PRODUTO__CARDINALIDADE_MAXIMA_OR = CARACTERISTICA_PRODUTO_FEATURE_COUNT + 2;

		/**
	 * The number of structural features of the '<em>Variacao Dois Produto</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIACAO_DOIS_PRODUTO_FEATURE_COUNT = CARACTERISTICA_PRODUTO_FEATURE_COUNT + 3;

  /**
	 * The meta object id for the '{@link caracteristica.impl.CaracteristicaAgrupadaProdutoImpl <em>Agrupada Produto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see caracteristica.impl.CaracteristicaAgrupadaProdutoImpl
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getCaracteristicaAgrupadaProduto()
	 * @generated
	 */
	int CARACTERISTICA_AGRUPADA_PRODUTO = 22;

		/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARACTERISTICA_AGRUPADA_PRODUTO__NOME = CARACTERISTICA_PRODUTO__NOME;

		/**
	 * The feature id for the '<em><b>Elemento Original</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARACTERISTICA_AGRUPADA_PRODUTO__ELEMENTO_ORIGINAL = CARACTERISTICA_PRODUTO__ELEMENTO_ORIGINAL;

		/**
	 * The feature id for the '<em><b>Caracteristica Produto Pai</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARACTERISTICA_AGRUPADA_PRODUTO__CARACTERISTICA_PRODUTO_PAI = CARACTERISTICA_PRODUTO__CARACTERISTICA_PRODUTO_PAI;

		/**
	 * The feature id for the '<em><b>Caracteristica Produto Filha</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARACTERISTICA_AGRUPADA_PRODUTO__CARACTERISTICA_PRODUTO_FILHA = CARACTERISTICA_PRODUTO__CARACTERISTICA_PRODUTO_FILHA;

		/**
	 * The feature id for the '<em><b>Atributo Produto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARACTERISTICA_AGRUPADA_PRODUTO__ATRIBUTO_PRODUTO = CARACTERISTICA_PRODUTO__ATRIBUTO_PRODUTO;

		/**
	 * The number of structural features of the '<em>Agrupada Produto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARACTERISTICA_AGRUPADA_PRODUTO_FEATURE_COUNT = CARACTERISTICA_PRODUTO_FEATURE_COUNT + 0;

		/**
	 * The meta object id for the '{@link caracteristica.impl.VariacaoProdutoImpl <em>Variacao Produto</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.impl.VariacaoProdutoImpl
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getVariacaoProduto()
	 * @generated
	 */
  int VARIACAO_PRODUTO = 23;

  /**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIACAO_PRODUTO__NOME = ELEMENTO_DE_PRODUTO__NOME;

  /**
	 * The feature id for the '<em><b>Elemento Original</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIACAO_PRODUTO__ELEMENTO_ORIGINAL = ELEMENTO_DE_PRODUTO__ELEMENTO_ORIGINAL;

  /**
	 * The feature id for the '<em><b>Cardinalidade Minima</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIACAO_PRODUTO__CARDINALIDADE_MINIMA = ELEMENTO_DE_PRODUTO_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Cardinalidade Maxima</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIACAO_PRODUTO__CARDINALIDADE_MAXIMA = ELEMENTO_DE_PRODUTO_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Variantes Produto</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIACAO_PRODUTO__VARIANTES_PRODUTO = ELEMENTO_DE_PRODUTO_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Caracteristica Produto Pai</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIACAO_PRODUTO__CARACTERISTICA_PRODUTO_PAI = ELEMENTO_DE_PRODUTO_FEATURE_COUNT + 3;

  /**
	 * The number of structural features of the '<em>Variacao Produto</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIACAO_PRODUTO_FEATURE_COUNT = ELEMENTO_DE_PRODUTO_FEATURE_COUNT + 4;

  /**
	 * The meta object id for the '{@link caracteristica.impl.VarianteProdutoImpl <em>Variante Produto</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.impl.VarianteProdutoImpl
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getVarianteProduto()
	 * @generated
	 */
  int VARIANTE_PRODUTO = 24;

  /**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIANTE_PRODUTO__NOME = ELEMENTO_DE_PRODUTO__NOME;

  /**
	 * The feature id for the '<em><b>Elemento Original</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIANTE_PRODUTO__ELEMENTO_ORIGINAL = ELEMENTO_DE_PRODUTO__ELEMENTO_ORIGINAL;

  /**
	 * The feature id for the '<em><b>Variacao Produto Pai</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIANTE_PRODUTO__VARIACAO_PRODUTO_PAI = ELEMENTO_DE_PRODUTO_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Selecionado</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIANTE_PRODUTO__SELECIONADO = ELEMENTO_DE_PRODUTO_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Variante Produto</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIANTE_PRODUTO_FEATURE_COUNT = ELEMENTO_DE_PRODUTO_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link caracteristica.impl.ProdutoImpl <em>Produto</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.impl.ProdutoImpl
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getProduto()
	 * @generated
	 */
  int PRODUTO = 25;

  /**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PRODUTO__NOME = CARACTERISTICA_PRODUTO__NOME;

  /**
	 * The feature id for the '<em><b>Elemento Original</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PRODUTO__ELEMENTO_ORIGINAL = CARACTERISTICA_PRODUTO__ELEMENTO_ORIGINAL;

  /**
	 * The feature id for the '<em><b>Caracteristica Produto Pai</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PRODUTO__CARACTERISTICA_PRODUTO_PAI = CARACTERISTICA_PRODUTO__CARACTERISTICA_PRODUTO_PAI;

  /**
	 * The feature id for the '<em><b>Caracteristica Produto Filha</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PRODUTO__CARACTERISTICA_PRODUTO_FILHA = CARACTERISTICA_PRODUTO__CARACTERISTICA_PRODUTO_FILHA;

  /**
	 * The feature id for the '<em><b>Atributo Produto</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PRODUTO__ATRIBUTO_PRODUTO = CARACTERISTICA_PRODUTO__ATRIBUTO_PRODUTO;

  /**
	 * The feature id for the '<em><b>Linha Do Produto</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PRODUTO__LINHA_DO_PRODUTO = CARACTERISTICA_PRODUTO_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Produto</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PRODUTO_FEATURE_COUNT = CARACTERISTICA_PRODUTO_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link caracteristica.impl.RegraImpl <em>Regra</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.impl.RegraImpl
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getRegra()
	 * @generated
	 */
  int REGRA = 26;

  /**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int REGRA__NOME = 0;

  /**
	 * The feature id for the '<em><b>Conteudo</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int REGRA__CONTEUDO = 1;

  /**
	 * The number of structural features of the '<em>Regra</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int REGRA_FEATURE_COUNT = 2;

  /**
	 * The meta object id for the '{@link caracteristica.impl.RegraDeComposicaoImpl <em>Regra De Composicao</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.impl.RegraDeComposicaoImpl
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getRegraDeComposicao()
	 * @generated
	 */
  int REGRA_DE_COMPOSICAO = 27;

  /**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int REGRA_DE_COMPOSICAO__NOME = REGRA__NOME;

  /**
	 * The feature id for the '<em><b>Conteudo</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int REGRA_DE_COMPOSICAO__CONTEUDO = REGRA__CONTEUDO;

  /**
	 * The feature id for the '<em><b>Antecedente</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int REGRA_DE_COMPOSICAO__ANTECEDENTE = REGRA_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Consequente</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int REGRA_DE_COMPOSICAO__CONSEQUENTE = REGRA_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Regra De Composicao</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int REGRA_DE_COMPOSICAO_FEATURE_COUNT = REGRA_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link caracteristica.impl.RegraDeContextoImpl <em>Regra De Contexto</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.impl.RegraDeContextoImpl
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getRegraDeContexto()
	 * @generated
	 */
  int REGRA_DE_CONTEXTO = 28;

  /**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int REGRA_DE_CONTEXTO__NOME = REGRA__NOME;

  /**
	 * The feature id for the '<em><b>Conteudo</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int REGRA_DE_CONTEXTO__CONTEUDO = REGRA__CONTEUDO;

  /**
	 * The feature id for the '<em><b>Evento</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int REGRA_DE_CONTEXTO__EVENTO = REGRA_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Acao</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int REGRA_DE_CONTEXTO__ACAO = REGRA_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Regra De Contexto</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int REGRA_DE_CONTEXTO_FEATURE_COUNT = REGRA_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link caracteristica.impl.ExpressaoImpl <em>Expressao</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.impl.ExpressaoImpl
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getExpressao()
	 * @generated
	 */
  int EXPRESSAO = 36;

  /**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPRESSAO__NOME = 0;

  /**
	 * The number of structural features of the '<em>Expressao</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPRESSAO_FEATURE_COUNT = 1;

  /**
	 * The meta object id for the '{@link caracteristica.impl.EventoImpl <em>Evento</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.impl.EventoImpl
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getEvento()
	 * @generated
	 */
  int EVENTO = 29;

  /**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EVENTO__NOME = EXPRESSAO__NOME;

  /**
	 * The number of structural features of the '<em>Evento</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EVENTO_FEATURE_COUNT = EXPRESSAO_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link caracteristica.impl.EventoLogicoImpl <em>Evento Logico</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.impl.EventoLogicoImpl
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getEventoLogico()
	 * @generated
	 */
  int EVENTO_LOGICO = 30;

  /**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EVENTO_LOGICO__NOME = EVENTO__NOME;

  /**
	 * The feature id for the '<em><b>Lado Direito Evento</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EVENTO_LOGICO__LADO_DIREITO_EVENTO = EVENTO_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Operador Logico</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EVENTO_LOGICO__OPERADOR_LOGICO = EVENTO_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Lado Esquerdo Evento</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EVENTO_LOGICO__LADO_ESQUERDO_EVENTO = EVENTO_FEATURE_COUNT + 2;

  /**
	 * The number of structural features of the '<em>Evento Logico</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EVENTO_LOGICO_FEATURE_COUNT = EVENTO_FEATURE_COUNT + 3;

  /**
	 * The meta object id for the '{@link caracteristica.impl.EventoRelacionalImpl <em>Evento Relacional</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.impl.EventoRelacionalImpl
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getEventoRelacional()
	 * @generated
	 */
  int EVENTO_RELACIONAL = 31;

  /**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EVENTO_RELACIONAL__NOME = EVENTO__NOME;

  /**
	 * The feature id for the '<em><b>Variavel De Contexto</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EVENTO_RELACIONAL__VARIAVEL_DE_CONTEXTO = EVENTO_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Operador Relacional</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EVENTO_RELACIONAL__OPERADOR_RELACIONAL = EVENTO_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EVENTO_RELACIONAL__VALOR = EVENTO_FEATURE_COUNT + 2;

  /**
	 * The number of structural features of the '<em>Evento Relacional</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EVENTO_RELACIONAL_FEATURE_COUNT = EVENTO_FEATURE_COUNT + 3;

  /**
	 * The meta object id for the '{@link caracteristica.impl.AcaoImpl <em>Acao</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.impl.AcaoImpl
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getAcao()
	 * @generated
	 */
  int ACAO = 32;

  /**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ACAO__NOME = EXPRESSAO__NOME;

  /**
	 * The number of structural features of the '<em>Acao</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ACAO_FEATURE_COUNT = EXPRESSAO_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link caracteristica.impl.AcaoLogicoImpl <em>Acao Logico</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.impl.AcaoLogicoImpl
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getAcaoLogico()
	 * @generated
	 */
  int ACAO_LOGICO = 33;

  /**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ACAO_LOGICO__NOME = ACAO__NOME;

  /**
	 * The feature id for the '<em><b>Lado Esquerdo Acao</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ACAO_LOGICO__LADO_ESQUERDO_ACAO = ACAO_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Operador Acao Logico</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ACAO_LOGICO__OPERADOR_ACAO_LOGICO = ACAO_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Lado Direito Acao</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ACAO_LOGICO__LADO_DIREITO_ACAO = ACAO_FEATURE_COUNT + 2;

  /**
	 * The number of structural features of the '<em>Acao Logico</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ACAO_LOGICO_FEATURE_COUNT = ACAO_FEATURE_COUNT + 3;

  /**
	 * The meta object id for the '{@link caracteristica.impl.LiteralAcaoImpl <em>Literal Acao</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.impl.LiteralAcaoImpl
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getLiteralAcao()
	 * @generated
	 */
  int LITERAL_ACAO = 34;

  /**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LITERAL_ACAO__NOME = ACAO__NOME;

  /**
	 * The feature id for the '<em><b>Presenca</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LITERAL_ACAO__PRESENCA = ACAO_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Elemento</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LITERAL_ACAO__ELEMENTO = ACAO_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Literal Acao</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LITERAL_ACAO_FEATURE_COUNT = ACAO_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link caracteristica.impl.DesignarImpl <em>Designar</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.impl.DesignarImpl
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getDesignar()
	 * @generated
	 */
  int DESIGNAR = 35;

  /**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DESIGNAR__NOME = ACAO__NOME;

  /**
	 * The feature id for the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DESIGNAR__VALOR = ACAO_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Atributo</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DESIGNAR__ATRIBUTO = ACAO_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Tipo Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DESIGNAR__TIPO_VALOR = ACAO_FEATURE_COUNT + 2;

  /**
	 * The number of structural features of the '<em>Designar</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DESIGNAR_FEATURE_COUNT = ACAO_FEATURE_COUNT + 3;

  /**
	 * The meta object id for the '{@link caracteristica.impl.AntecedenteImpl <em>Antecedente</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.impl.AntecedenteImpl
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getAntecedente()
	 * @generated
	 */
  int ANTECEDENTE = 37;

  /**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ANTECEDENTE__NOME = EXPRESSAO__NOME;

  /**
	 * The number of structural features of the '<em>Antecedente</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ANTECEDENTE_FEATURE_COUNT = EXPRESSAO_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link caracteristica.impl.ExpressaoLogicaImpl <em>Expressao Logica</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.impl.ExpressaoLogicaImpl
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getExpressaoLogica()
	 * @generated
	 */
  int EXPRESSAO_LOGICA = 38;

  /**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPRESSAO_LOGICA__NOME = ANTECEDENTE__NOME;

  /**
	 * The feature id for the '<em><b>Lado Direito Composicao</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPRESSAO_LOGICA__LADO_DIREITO_COMPOSICAO = ANTECEDENTE_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Operador Logico</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPRESSAO_LOGICA__OPERADOR_LOGICO = ANTECEDENTE_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Lado Esquerdo Composicao</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPRESSAO_LOGICA__LADO_ESQUERDO_COMPOSICAO = ANTECEDENTE_FEATURE_COUNT + 2;

  /**
	 * The number of structural features of the '<em>Expressao Logica</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPRESSAO_LOGICA_FEATURE_COUNT = ANTECEDENTE_FEATURE_COUNT + 3;

  /**
	 * The meta object id for the '{@link caracteristica.impl.ExpressaoRelacionalImpl <em>Expressao Relacional</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.impl.ExpressaoRelacionalImpl
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getExpressaoRelacional()
	 * @generated
	 */
  int EXPRESSAO_RELACIONAL = 39;

  /**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPRESSAO_RELACIONAL__NOME = ANTECEDENTE__NOME;

  /**
	 * The feature id for the '<em><b>Variavelda Expressao</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPRESSAO_RELACIONAL__VARIAVELDA_EXPRESSAO = ANTECEDENTE_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Operador Relacional</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPRESSAO_RELACIONAL__OPERADOR_RELACIONAL = ANTECEDENTE_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPRESSAO_RELACIONAL__VALOR = ANTECEDENTE_FEATURE_COUNT + 2;

  /**
	 * The number of structural features of the '<em>Expressao Relacional</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPRESSAO_RELACIONAL_FEATURE_COUNT = ANTECEDENTE_FEATURE_COUNT + 3;

  /**
	 * The meta object id for the '{@link caracteristica.impl.LiteralComposicaoImpl <em>Literal Composicao</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.impl.LiteralComposicaoImpl
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getLiteralComposicao()
	 * @generated
	 */
  int LITERAL_COMPOSICAO = 40;

  /**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LITERAL_COMPOSICAO__NOME = ANTECEDENTE__NOME;

  /**
	 * The feature id for the '<em><b>Presenca</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LITERAL_COMPOSICAO__PRESENCA = ANTECEDENTE_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Elemento</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LITERAL_COMPOSICAO__ELEMENTO = ANTECEDENTE_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Literal Composicao</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LITERAL_COMPOSICAO_FEATURE_COUNT = ANTECEDENTE_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link caracteristica.impl.SimulacaoImpl <em>Simulacao</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.impl.SimulacaoImpl
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getSimulacao()
	 * @generated
	 */
  int SIMULACAO = 41;

  /**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SIMULACAO__NOME = 0;

  /**
	 * The feature id for the '<em><b>Transicoes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SIMULACAO__TRANSICOES = 1;

  /**
	 * The feature id for the '<em><b>Estados</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SIMULACAO__ESTADOS = 2;

  /**
	 * The number of structural features of the '<em>Simulacao</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SIMULACAO_FEATURE_COUNT = 3;

  /**
	 * The meta object id for the '{@link caracteristica.impl.TransicaoImpl <em>Transicao</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.impl.TransicaoImpl
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getTransicao()
	 * @generated
	 */
  int TRANSICAO = 42;

  /**
	 * The feature id for the '<em><b>EAntigo</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TRANSICAO__EANTIGO = 0;

  /**
	 * The feature id for the '<em><b>ENovo</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TRANSICAO__ENOVO = 1;

  /**
	 * The feature id for the '<em><b>Regras Quebradas</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TRANSICAO__REGRAS_QUEBRADAS = 2;

  /**
	 * The feature id for the '<em><b>Acoes</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TRANSICAO__ACOES = 3;

  /**
	 * The feature id for the '<em><b>Safe</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TRANSICAO__SAFE = 4;

  /**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TRANSICAO__ETIQUETA = 5;

  /**
	 * The number of structural features of the '<em>Transicao</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TRANSICAO_FEATURE_COUNT = 6;

  /**
	 * The meta object id for the '{@link caracteristica.impl.EstadoImpl <em>Estado</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.impl.EstadoImpl
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getEstado()
	 * @generated
	 */
  int ESTADO = 43;

  /**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ESTADO__NOME = 0;

  /**
	 * The feature id for the '<em><b>Produto</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ESTADO__PRODUTO = 1;

  /**
	 * The feature id for the '<em><b>Safe</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ESTADO__SAFE = 2;

  /**
	 * The number of structural features of the '<em>Estado</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ESTADO_FEATURE_COUNT = 3;

  /**
	 * The meta object id for the '{@link caracteristica.impl.InconsistenciaRegraAdaptacaoImpl <em>Inconsistencia Regra Adaptacao</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.impl.InconsistenciaRegraAdaptacaoImpl
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getInconsistenciaRegraAdaptacao()
	 * @generated
	 */
  int INCONSISTENCIA_REGRA_ADAPTACAO = 44;

  /**
	 * The feature id for the '<em><b>Regras Inconsistentes</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INCONSISTENCIA_REGRA_ADAPTACAO__REGRAS_INCONSISTENTES = 0;

  /**
	 * The feature id for the '<em><b>Literais Inconsistentes</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INCONSISTENCIA_REGRA_ADAPTACAO__LITERAIS_INCONSISTENTES = 1;

  /**
	 * The feature id for the '<em><b>Atribuicoes Inconsistentes</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INCONSISTENCIA_REGRA_ADAPTACAO__ATRIBUICOES_INCONSISTENTES = 2;

  /**
	 * The number of structural features of the '<em>Inconsistencia Regra Adaptacao</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INCONSISTENCIA_REGRA_ADAPTACAO_FEATURE_COUNT = 3;

  /**
	 * The meta object id for the '{@link caracteristica.Origem <em>Origem</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.Origem
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getOrigem()
	 * @generated
	 */
  int ORIGEM = 45;

  /**
	 * The meta object id for the '{@link caracteristica.Validade <em>Validade</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.Validade
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getValidade()
	 * @generated
	 */
  int VALIDADE = 46;

  /**
	 * The meta object id for the '{@link caracteristica.Qualidade <em>Qualidade</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.Qualidade
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getQualidade()
	 * @generated
	 */
  int QUALIDADE = 47;

  /**
	 * The meta object id for the '{@link caracteristica.TipoValor <em>Tipo Valor</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.TipoValor
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getTipoValor()
	 * @generated
	 */
  int TIPO_VALOR = 48;

  /**
	 * The meta object id for the '{@link caracteristica.OperadorLogico <em>Operador Logico</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.OperadorLogico
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getOperadorLogico()
	 * @generated
	 */
  int OPERADOR_LOGICO = 49;

  /**
	 * The meta object id for the '{@link caracteristica.OperadorAcaoLogico <em>Operador Acao Logico</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.OperadorAcaoLogico
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getOperadorAcaoLogico()
	 * @generated
	 */
  int OPERADOR_ACAO_LOGICO = 50;

  /**
	 * The meta object id for the '{@link caracteristica.CardinalidadeMaxima <em>Cardinalidade Maxima</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.CardinalidadeMaxima
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getCardinalidadeMaxima()
	 * @generated
	 */
  int CARDINALIDADE_MAXIMA = 51;

  /**
	 * The meta object id for the '{@link caracteristica.OperadorRelacional <em>Operador Relacional</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.OperadorRelacional
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getOperadorRelacional()
	 * @generated
	 */
  int OPERADOR_RELACIONAL = 52;

  /**
	 * The meta object id for the '{@link caracteristica.Presenca <em>Presenca</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.Presenca
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getPresenca()
	 * @generated
	 */
  int PRESENCA = 53;


  /**
	 * Returns the meta object for class '{@link caracteristica.LPS <em>LPS</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LPS</em>'.
	 * @see caracteristica.LPS
	 * @generated
	 */
  EClass getLPS();

  /**
	 * Returns the meta object for the containment reference list '{@link caracteristica.LPS#getPontosDeVariacao <em>Pontos De Variacao</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pontos De Variacao</em>'.
	 * @see caracteristica.LPS#getPontosDeVariacao()
	 * @see #getLPS()
	 * @generated
	 */
  EReference getLPS_PontosDeVariacao();

  /**
	 * Returns the meta object for the containment reference list '{@link caracteristica.LPS#getElementos <em>Elementos</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elementos</em>'.
	 * @see caracteristica.LPS#getElementos()
	 * @see #getLPS()
	 * @generated
	 */
  EReference getLPS_Elementos();

  /**
	 * Returns the meta object for the containment reference list '{@link caracteristica.LPS#getRegras <em>Regras</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Regras</em>'.
	 * @see caracteristica.LPS#getRegras()
	 * @see #getLPS()
	 * @generated
	 */
  EReference getLPS_Regras();

  /**
	 * Returns the meta object for the containment reference list '{@link caracteristica.LPS#getProdutos <em>Produtos</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Produtos</em>'.
	 * @see caracteristica.LPS#getProdutos()
	 * @see #getLPS()
	 * @generated
	 */
  EReference getLPS_Produtos();

  /**
	 * Returns the meta object for the containment reference list '{@link caracteristica.LPS#getExpressoes <em>Expressoes</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressoes</em>'.
	 * @see caracteristica.LPS#getExpressoes()
	 * @see #getLPS()
	 * @generated
	 */
  EReference getLPS_Expressoes();

  /**
	 * Returns the meta object for the containment reference list '{@link caracteristica.LPS#getElementosDeProduto <em>Elementos De Produto</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elementos De Produto</em>'.
	 * @see caracteristica.LPS#getElementosDeProduto()
	 * @see #getLPS()
	 * @generated
	 */
  EReference getLPS_ElementosDeProduto();

  /**
	 * Returns the meta object for the reference '{@link caracteristica.LPS#getSistema <em>Sistema</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sistema</em>'.
	 * @see caracteristica.LPS#getSistema()
	 * @see #getLPS()
	 * @generated
	 */
  EReference getLPS_Sistema();

  /**
	 * Returns the meta object for the containment reference list '{@link caracteristica.LPS#getAtributos <em>Atributos</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Atributos</em>'.
	 * @see caracteristica.LPS#getAtributos()
	 * @see #getLPS()
	 * @generated
	 */
  EReference getLPS_Atributos();

  /**
	 * Returns the meta object for the attribute list '{@link caracteristica.LPS#getValoresContextuais <em>Valores Contextuais</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Valores Contextuais</em>'.
	 * @see caracteristica.LPS#getValoresContextuais()
	 * @see #getLPS()
	 * @generated
	 */
  EAttribute getLPS_ValoresContextuais();

  /**
	 * Returns the meta object for the containment reference list '{@link caracteristica.LPS#getSimulacoes <em>Simulacoes</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Simulacoes</em>'.
	 * @see caracteristica.LPS#getSimulacoes()
	 * @see #getLPS()
	 * @generated
	 */
  EReference getLPS_Simulacoes();

  /**
	 * Returns the meta object for the containment reference list '{@link caracteristica.LPS#getInconsistenciaERA <em>Inconsistencia ERA</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inconsistencia ERA</em>'.
	 * @see caracteristica.LPS#getInconsistenciaERA()
	 * @see #getLPS()
	 * @generated
	 */
  EReference getLPS_InconsistenciaERA();

  /**
	 * Returns the meta object for the attribute list '{@link caracteristica.LPS#getErro <em>Erro</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Erro</em>'.
	 * @see caracteristica.LPS#getErro()
	 * @see #getLPS()
	 * @generated
	 */
  EAttribute getLPS_Erro();

  /**
	 * Returns the meta object for the attribute '{@link caracteristica.LPS#getNome <em>Nome</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome</em>'.
	 * @see caracteristica.LPS#getNome()
	 * @see #getLPS()
	 * @generated
	 */
  EAttribute getLPS_Nome();

  /**
	 * Returns the meta object for class '{@link caracteristica.Elemento <em>Elemento</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elemento</em>'.
	 * @see caracteristica.Elemento
	 * @generated
	 */
  EClass getElemento();

  /**
	 * Returns the meta object for the attribute '{@link caracteristica.Elemento#getNome <em>Nome</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome</em>'.
	 * @see caracteristica.Elemento#getNome()
	 * @see #getElemento()
	 * @generated
	 */
  EAttribute getElemento_Nome();

  /**
	 * Returns the meta object for class '{@link caracteristica.ElementoCaracteristico <em>Elemento Caracteristico</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elemento Caracteristico</em>'.
	 * @see caracteristica.ElementoCaracteristico
	 * @generated
	 */
  EClass getElementoCaracteristico();

  /**
	 * Returns the meta object for class '{@link caracteristica.Atributo <em>Atributo</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atributo</em>'.
	 * @see caracteristica.Atributo
	 * @generated
	 */
  EClass getAtributo();

  /**
	 * Returns the meta object for the attribute '{@link caracteristica.Atributo#getTipoValor <em>Tipo Valor</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Valor</em>'.
	 * @see caracteristica.Atributo#getTipoValor()
	 * @see #getAtributo()
	 * @generated
	 */
  EAttribute getAtributo_TipoValor();

  /**
	 * Returns the meta object for the reference '{@link caracteristica.Atributo#getCaracteristicaPai <em>Caracteristica Pai</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Caracteristica Pai</em>'.
	 * @see caracteristica.Atributo#getCaracteristicaPai()
	 * @see #getAtributo()
	 * @generated
	 */
  EReference getAtributo_CaracteristicaPai();

  /**
	 * Returns the meta object for class '{@link caracteristica.Caracteristica <em>Caracteristica</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Caracteristica</em>'.
	 * @see caracteristica.Caracteristica
	 * @generated
	 */
  EClass getCaracteristica();

  /**
	 * Returns the meta object for the reference '{@link caracteristica.Caracteristica#getCaracteristicaPai <em>Caracteristica Pai</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Caracteristica Pai</em>'.
	 * @see caracteristica.Caracteristica#getCaracteristicaPai()
	 * @see #getCaracteristica()
	 * @generated
	 */
  EReference getCaracteristica_CaracteristicaPai();

  /**
	 * Returns the meta object for the reference list '{@link caracteristica.Caracteristica#getCaracteristicaFilha <em>Caracteristica Filha</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Caracteristica Filha</em>'.
	 * @see caracteristica.Caracteristica#getCaracteristicaFilha()
	 * @see #getCaracteristica()
	 * @generated
	 */
  EReference getCaracteristica_CaracteristicaFilha();

  /**
	 * Returns the meta object for the reference list '{@link caracteristica.Caracteristica#getVariacoes <em>Variacoes</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Variacoes</em>'.
	 * @see caracteristica.Caracteristica#getVariacoes()
	 * @see #getCaracteristica()
	 * @generated
	 */
  EReference getCaracteristica_Variacoes();

  /**
	 * Returns the meta object for the reference list '{@link caracteristica.Caracteristica#getAtributo <em>Atributo</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Atributo</em>'.
	 * @see caracteristica.Caracteristica#getAtributo()
	 * @see #getCaracteristica()
	 * @generated
	 */
  EReference getCaracteristica_Atributo();

  /**
	 * Returns the meta object for class '{@link caracteristica.CaracteristicaRaiz <em>Raiz</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Raiz</em>'.
	 * @see caracteristica.CaracteristicaRaiz
	 * @generated
	 */
  EClass getCaracteristicaRaiz();

  /**
	 * Returns the meta object for the reference '{@link caracteristica.CaracteristicaRaiz#getLpsDoSistema <em>Lps Do Sistema</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lps Do Sistema</em>'.
	 * @see caracteristica.CaracteristicaRaiz#getLpsDoSistema()
	 * @see #getCaracteristicaRaiz()
	 * @generated
	 */
  EReference getCaracteristicaRaiz_LpsDoSistema();

  /**
	 * Returns the meta object for class '{@link caracteristica.CaracteristicaOpcional <em>Opcional</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opcional</em>'.
	 * @see caracteristica.CaracteristicaOpcional
	 * @generated
	 */
  EClass getCaracteristicaOpcional();

  /**
	 * Returns the meta object for class '{@link caracteristica.CaracteristicaAgrupada <em>Agrupada</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agrupada</em>'.
	 * @see caracteristica.CaracteristicaAgrupada
	 * @generated
	 */
  EClass getCaracteristicaAgrupada();

  /**
	 * Returns the meta object for class '{@link caracteristica.CaracteristicaMandatoria <em>Mandatoria</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mandatoria</em>'.
	 * @see caracteristica.CaracteristicaMandatoria
	 * @generated
	 */
  EClass getCaracteristicaMandatoria();

  /**
	 * Returns the meta object for class '{@link caracteristica.VariacaoDois <em>Variacao Dois</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variacao Dois</em>'.
	 * @see caracteristica.VariacaoDois
	 * @generated
	 */
  EClass getVariacaoDois();

  /**
	 * Returns the meta object for the attribute '{@link caracteristica.VariacaoDois#getCardinalidadeMaxima <em>Cardinalidade Maxima</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinalidade Maxima</em>'.
	 * @see caracteristica.VariacaoDois#getCardinalidadeMaxima()
	 * @see #getVariacaoDois()
	 * @generated
	 */
  EAttribute getVariacaoDois_CardinalidadeMaxima();

  /**
	 * Returns the meta object for the attribute '{@link caracteristica.VariacaoDois#getCardinalidadeMinimaOr <em>Cardinalidade Minima Or</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinalidade Minima Or</em>'.
	 * @see caracteristica.VariacaoDois#getCardinalidadeMinimaOr()
	 * @see #getVariacaoDois()
	 * @generated
	 */
  EAttribute getVariacaoDois_CardinalidadeMinimaOr();

  /**
	 * Returns the meta object for the attribute '{@link caracteristica.VariacaoDois#getCardinalidadeMaximaOr <em>Cardinalidade Maxima Or</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinalidade Maxima Or</em>'.
	 * @see caracteristica.VariacaoDois#getCardinalidadeMaximaOr()
	 * @see #getVariacaoDois()
	 * @generated
	 */
  EAttribute getVariacaoDois_CardinalidadeMaximaOr();

  /**
	 * Returns the meta object for class '{@link caracteristica.PontoDeVariacao <em>Ponto De Variacao</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ponto De Variacao</em>'.
	 * @see caracteristica.PontoDeVariacao
	 * @generated
	 */
  EClass getPontoDeVariacao();

  /**
	 * Returns the meta object for class '{@link caracteristica.Variacao <em>Variacao</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variacao</em>'.
	 * @see caracteristica.Variacao
	 * @generated
	 */
  EClass getVariacao();

  /**
	 * Returns the meta object for the attribute '{@link caracteristica.Variacao#getCardinalidadeMinima <em>Cardinalidade Minima</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinalidade Minima</em>'.
	 * @see caracteristica.Variacao#getCardinalidadeMinima()
	 * @see #getVariacao()
	 * @generated
	 */
  EAttribute getVariacao_CardinalidadeMinima();

  /**
	 * Returns the meta object for the attribute '{@link caracteristica.Variacao#getCardinalidadeMaxima <em>Cardinalidade Maxima</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinalidade Maxima</em>'.
	 * @see caracteristica.Variacao#getCardinalidadeMaxima()
	 * @see #getVariacao()
	 * @generated
	 */
  EAttribute getVariacao_CardinalidadeMaxima();

  /**
	 * Returns the meta object for the reference list '{@link caracteristica.Variacao#getVariantes <em>Variantes</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Variantes</em>'.
	 * @see caracteristica.Variacao#getVariantes()
	 * @see #getVariacao()
	 * @generated
	 */
  EReference getVariacao_Variantes();

  /**
	 * Returns the meta object for the reference '{@link caracteristica.Variacao#getCaracteristicaPai <em>Caracteristica Pai</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Caracteristica Pai</em>'.
	 * @see caracteristica.Variacao#getCaracteristicaPai()
	 * @see #getVariacao()
	 * @generated
	 */
  EReference getVariacao_CaracteristicaPai();

  /**
	 * Returns the meta object for class '{@link caracteristica.Variante <em>Variante</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variante</em>'.
	 * @see caracteristica.Variante
	 * @generated
	 */
  EClass getVariante();

  /**
	 * Returns the meta object for the reference '{@link caracteristica.Variante#getVariacaoPai <em>Variacao Pai</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variacao Pai</em>'.
	 * @see caracteristica.Variante#getVariacaoPai()
	 * @see #getVariante()
	 * @generated
	 */
  EReference getVariante_VariacaoPai();

  /**
	 * Returns the meta object for class '{@link caracteristica.RaizDeContexto <em>Raiz De Contexto</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Raiz De Contexto</em>'.
	 * @see caracteristica.RaizDeContexto
	 * @generated
	 */
  EClass getRaizDeContexto();

  /**
	 * Returns the meta object for the reference list '{@link caracteristica.RaizDeContexto#getEntidadesDeContexto <em>Entidades De Contexto</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entidades De Contexto</em>'.
	 * @see caracteristica.RaizDeContexto#getEntidadesDeContexto()
	 * @see #getRaizDeContexto()
	 * @generated
	 */
  EReference getRaizDeContexto_EntidadesDeContexto();

  /**
	 * Returns the meta object for class '{@link caracteristica.EntidadeDeContexto <em>Entidade De Contexto</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entidade De Contexto</em>'.
	 * @see caracteristica.EntidadeDeContexto
	 * @generated
	 */
  EClass getEntidadeDeContexto();

  /**
	 * Returns the meta object for the reference '{@link caracteristica.EntidadeDeContexto#getRaiz <em>Raiz</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Raiz</em>'.
	 * @see caracteristica.EntidadeDeContexto#getRaiz()
	 * @see #getEntidadeDeContexto()
	 * @generated
	 */
  EReference getEntidadeDeContexto_Raiz();

  /**
	 * Returns the meta object for the reference list '{@link caracteristica.EntidadeDeContexto#getInformacoesDeContexto <em>Informacoes De Contexto</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Informacoes De Contexto</em>'.
	 * @see caracteristica.EntidadeDeContexto#getInformacoesDeContexto()
	 * @see #getEntidadeDeContexto()
	 * @generated
	 */
  EReference getEntidadeDeContexto_InformacoesDeContexto();

  /**
	 * Returns the meta object for class '{@link caracteristica.InformacaoDeContexto <em>Informacao De Contexto</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Informacao De Contexto</em>'.
	 * @see caracteristica.InformacaoDeContexto
	 * @generated
	 */
  EClass getInformacaoDeContexto();

  /**
	 * Returns the meta object for the attribute '{@link caracteristica.InformacaoDeContexto#getOrigem <em>Origem</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origem</em>'.
	 * @see caracteristica.InformacaoDeContexto#getOrigem()
	 * @see #getInformacaoDeContexto()
	 * @generated
	 */
  EAttribute getInformacaoDeContexto_Origem();

  /**
	 * Returns the meta object for the attribute '{@link caracteristica.InformacaoDeContexto#getValidade <em>Validade</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validade</em>'.
	 * @see caracteristica.InformacaoDeContexto#getValidade()
	 * @see #getInformacaoDeContexto()
	 * @generated
	 */
  EAttribute getInformacaoDeContexto_Validade();

  /**
	 * Returns the meta object for the attribute '{@link caracteristica.InformacaoDeContexto#getQualidade <em>Qualidade</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualidade</em>'.
	 * @see caracteristica.InformacaoDeContexto#getQualidade()
	 * @see #getInformacaoDeContexto()
	 * @generated
	 */
  EAttribute getInformacaoDeContexto_Qualidade();

  /**
	 * Returns the meta object for the attribute '{@link caracteristica.InformacaoDeContexto#getTipoValor <em>Tipo Valor</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Valor</em>'.
	 * @see caracteristica.InformacaoDeContexto#getTipoValor()
	 * @see #getInformacaoDeContexto()
	 * @generated
	 */
  EAttribute getInformacaoDeContexto_TipoValor();

  /**
	 * Returns the meta object for the attribute '{@link caracteristica.InformacaoDeContexto#getValor <em>Valor</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor</em>'.
	 * @see caracteristica.InformacaoDeContexto#getValor()
	 * @see #getInformacaoDeContexto()
	 * @generated
	 */
  EAttribute getInformacaoDeContexto_Valor();

  /**
	 * Returns the meta object for the reference '{@link caracteristica.InformacaoDeContexto#getElementoPai <em>Elemento Pai</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Elemento Pai</em>'.
	 * @see caracteristica.InformacaoDeContexto#getElementoPai()
	 * @see #getInformacaoDeContexto()
	 * @generated
	 */
  EReference getInformacaoDeContexto_ElementoPai();

  /**
	 * Returns the meta object for class '{@link caracteristica.ElementoDeProduto <em>Elemento De Produto</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elemento De Produto</em>'.
	 * @see caracteristica.ElementoDeProduto
	 * @generated
	 */
  EClass getElementoDeProduto();

  /**
	 * Returns the meta object for the attribute '{@link caracteristica.ElementoDeProduto#getNome <em>Nome</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome</em>'.
	 * @see caracteristica.ElementoDeProduto#getNome()
	 * @see #getElementoDeProduto()
	 * @generated
	 */
  EAttribute getElementoDeProduto_Nome();

  /**
	 * Returns the meta object for the reference '{@link caracteristica.ElementoDeProduto#getElementoOriginal <em>Elemento Original</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Elemento Original</em>'.
	 * @see caracteristica.ElementoDeProduto#getElementoOriginal()
	 * @see #getElementoDeProduto()
	 * @generated
	 */
  EReference getElementoDeProduto_ElementoOriginal();

  /**
	 * Returns the meta object for class '{@link caracteristica.CaracteristicaProduto <em>Produto</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Produto</em>'.
	 * @see caracteristica.CaracteristicaProduto
	 * @generated
	 */
  EClass getCaracteristicaProduto();

  /**
	 * Returns the meta object for the reference '{@link caracteristica.CaracteristicaProduto#getCaracteristicaProdutoPai <em>Caracteristica Produto Pai</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Caracteristica Produto Pai</em>'.
	 * @see caracteristica.CaracteristicaProduto#getCaracteristicaProdutoPai()
	 * @see #getCaracteristicaProduto()
	 * @generated
	 */
  EReference getCaracteristicaProduto_CaracteristicaProdutoPai();

  /**
	 * Returns the meta object for the reference list '{@link caracteristica.CaracteristicaProduto#getCaracteristicaProdutoFilha <em>Caracteristica Produto Filha</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Caracteristica Produto Filha</em>'.
	 * @see caracteristica.CaracteristicaProduto#getCaracteristicaProdutoFilha()
	 * @see #getCaracteristicaProduto()
	 * @generated
	 */
  EReference getCaracteristicaProduto_CaracteristicaProdutoFilha();

  /**
	 * Returns the meta object for the reference list '{@link caracteristica.CaracteristicaProduto#getAtributoProduto <em>Atributo Produto</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Atributo Produto</em>'.
	 * @see caracteristica.CaracteristicaProduto#getAtributoProduto()
	 * @see #getCaracteristicaProduto()
	 * @generated
	 */
  EReference getCaracteristicaProduto_AtributoProduto();

  /**
	 * Returns the meta object for class '{@link caracteristica.AtributoProduto <em>Atributo Produto</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atributo Produto</em>'.
	 * @see caracteristica.AtributoProduto
	 * @generated
	 */
  EClass getAtributoProduto();

  /**
	 * Returns the meta object for the attribute '{@link caracteristica.AtributoProduto#getValor <em>Valor</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor</em>'.
	 * @see caracteristica.AtributoProduto#getValor()
	 * @see #getAtributoProduto()
	 * @generated
	 */
  EAttribute getAtributoProduto_Valor();

  /**
	 * Returns the meta object for the attribute '{@link caracteristica.AtributoProduto#getTipoValor <em>Tipo Valor</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Valor</em>'.
	 * @see caracteristica.AtributoProduto#getTipoValor()
	 * @see #getAtributoProduto()
	 * @generated
	 */
  EAttribute getAtributoProduto_TipoValor();

  /**
	 * Returns the meta object for the reference '{@link caracteristica.AtributoProduto#getCaracteristicaProdutoPai <em>Caracteristica Produto Pai</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Caracteristica Produto Pai</em>'.
	 * @see caracteristica.AtributoProduto#getCaracteristicaProdutoPai()
	 * @see #getAtributoProduto()
	 * @generated
	 */
  EReference getAtributoProduto_CaracteristicaProdutoPai();

  /**
	 * Returns the meta object for class '{@link caracteristica.CaracteristicaMandatoriaProduto <em>Mandatoria Produto</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mandatoria Produto</em>'.
	 * @see caracteristica.CaracteristicaMandatoriaProduto
	 * @generated
	 */
  EClass getCaracteristicaMandatoriaProduto();

  /**
	 * Returns the meta object for class '{@link caracteristica.CaracteristicaOpcionalProduto <em>Opcional Produto</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opcional Produto</em>'.
	 * @see caracteristica.CaracteristicaOpcionalProduto
	 * @generated
	 */
  EClass getCaracteristicaOpcionalProduto();

  /**
	 * Returns the meta object for class '{@link caracteristica.VariacaoDoisProduto <em>Variacao Dois Produto</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variacao Dois Produto</em>'.
	 * @see caracteristica.VariacaoDoisProduto
	 * @generated
	 */
  EClass getVariacaoDoisProduto();

  /**
	 * Returns the meta object for the attribute '{@link caracteristica.VariacaoDoisProduto#getCardinalidadeMaxima <em>Cardinalidade Maxima</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinalidade Maxima</em>'.
	 * @see caracteristica.VariacaoDoisProduto#getCardinalidadeMaxima()
	 * @see #getVariacaoDoisProduto()
	 * @generated
	 */
  EAttribute getVariacaoDoisProduto_CardinalidadeMaxima();

  /**
	 * Returns the meta object for the attribute '{@link caracteristica.VariacaoDoisProduto#getCardinalidadeMinimaOr <em>Cardinalidade Minima Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinalidade Minima Or</em>'.
	 * @see caracteristica.VariacaoDoisProduto#getCardinalidadeMinimaOr()
	 * @see #getVariacaoDoisProduto()
	 * @generated
	 */
	EAttribute getVariacaoDoisProduto_CardinalidadeMinimaOr();

		/**
	 * Returns the meta object for the attribute '{@link caracteristica.VariacaoDoisProduto#getCardinalidadeMaximaOr <em>Cardinalidade Maxima Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinalidade Maxima Or</em>'.
	 * @see caracteristica.VariacaoDoisProduto#getCardinalidadeMaximaOr()
	 * @see #getVariacaoDoisProduto()
	 * @generated
	 */
	EAttribute getVariacaoDoisProduto_CardinalidadeMaximaOr();

		/**
	 * Returns the meta object for class '{@link caracteristica.CaracteristicaAgrupadaProduto <em>Agrupada Produto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agrupada Produto</em>'.
	 * @see caracteristica.CaracteristicaAgrupadaProduto
	 * @generated
	 */
	EClass getCaracteristicaAgrupadaProduto();

		/**
	 * Returns the meta object for class '{@link caracteristica.VariacaoProduto <em>Variacao Produto</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variacao Produto</em>'.
	 * @see caracteristica.VariacaoProduto
	 * @generated
	 */
  EClass getVariacaoProduto();

  /**
	 * Returns the meta object for the attribute '{@link caracteristica.VariacaoProduto#getCardinalidadeMinima <em>Cardinalidade Minima</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinalidade Minima</em>'.
	 * @see caracteristica.VariacaoProduto#getCardinalidadeMinima()
	 * @see #getVariacaoProduto()
	 * @generated
	 */
  EAttribute getVariacaoProduto_CardinalidadeMinima();

  /**
	 * Returns the meta object for the attribute '{@link caracteristica.VariacaoProduto#getCardinalidadeMaxima <em>Cardinalidade Maxima</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinalidade Maxima</em>'.
	 * @see caracteristica.VariacaoProduto#getCardinalidadeMaxima()
	 * @see #getVariacaoProduto()
	 * @generated
	 */
  EAttribute getVariacaoProduto_CardinalidadeMaxima();

  /**
	 * Returns the meta object for the reference list '{@link caracteristica.VariacaoProduto#getVariantesProduto <em>Variantes Produto</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Variantes Produto</em>'.
	 * @see caracteristica.VariacaoProduto#getVariantesProduto()
	 * @see #getVariacaoProduto()
	 * @generated
	 */
  EReference getVariacaoProduto_VariantesProduto();

  /**
	 * Returns the meta object for the reference '{@link caracteristica.VariacaoProduto#getCaracteristicaProdutoPai <em>Caracteristica Produto Pai</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Caracteristica Produto Pai</em>'.
	 * @see caracteristica.VariacaoProduto#getCaracteristicaProdutoPai()
	 * @see #getVariacaoProduto()
	 * @generated
	 */
  EReference getVariacaoProduto_CaracteristicaProdutoPai();

  /**
	 * Returns the meta object for class '{@link caracteristica.VarianteProduto <em>Variante Produto</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variante Produto</em>'.
	 * @see caracteristica.VarianteProduto
	 * @generated
	 */
  EClass getVarianteProduto();

  /**
	 * Returns the meta object for the reference '{@link caracteristica.VarianteProduto#getVariacaoProdutoPai <em>Variacao Produto Pai</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variacao Produto Pai</em>'.
	 * @see caracteristica.VarianteProduto#getVariacaoProdutoPai()
	 * @see #getVarianteProduto()
	 * @generated
	 */
  EReference getVarianteProduto_VariacaoProdutoPai();

  /**
	 * Returns the meta object for the attribute '{@link caracteristica.VarianteProduto#getSelecionado <em>Selecionado</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selecionado</em>'.
	 * @see caracteristica.VarianteProduto#getSelecionado()
	 * @see #getVarianteProduto()
	 * @generated
	 */
  EAttribute getVarianteProduto_Selecionado();

  /**
	 * Returns the meta object for class '{@link caracteristica.Produto <em>Produto</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Produto</em>'.
	 * @see caracteristica.Produto
	 * @generated
	 */
  EClass getProduto();

  /**
	 * Returns the meta object for the reference '{@link caracteristica.Produto#getLinhaDoProduto <em>Linha Do Produto</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Linha Do Produto</em>'.
	 * @see caracteristica.Produto#getLinhaDoProduto()
	 * @see #getProduto()
	 * @generated
	 */
  EReference getProduto_LinhaDoProduto();

  /**
	 * Returns the meta object for class '{@link caracteristica.Regra <em>Regra</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regra</em>'.
	 * @see caracteristica.Regra
	 * @generated
	 */
  EClass getRegra();

  /**
	 * Returns the meta object for the attribute '{@link caracteristica.Regra#getNome <em>Nome</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome</em>'.
	 * @see caracteristica.Regra#getNome()
	 * @see #getRegra()
	 * @generated
	 */
  EAttribute getRegra_Nome();

  /**
	 * Returns the meta object for the attribute '{@link caracteristica.Regra#getConteudo <em>Conteudo</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conteudo</em>'.
	 * @see caracteristica.Regra#getConteudo()
	 * @see #getRegra()
	 * @generated
	 */
  EAttribute getRegra_Conteudo();

  /**
	 * Returns the meta object for class '{@link caracteristica.RegraDeComposicao <em>Regra De Composicao</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regra De Composicao</em>'.
	 * @see caracteristica.RegraDeComposicao
	 * @generated
	 */
  EClass getRegraDeComposicao();

  /**
	 * Returns the meta object for the reference '{@link caracteristica.RegraDeComposicao#getAntecedente <em>Antecedente</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Antecedente</em>'.
	 * @see caracteristica.RegraDeComposicao#getAntecedente()
	 * @see #getRegraDeComposicao()
	 * @generated
	 */
  EReference getRegraDeComposicao_Antecedente();

  /**
	 * Returns the meta object for the reference '{@link caracteristica.RegraDeComposicao#getConsequente <em>Consequente</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Consequente</em>'.
	 * @see caracteristica.RegraDeComposicao#getConsequente()
	 * @see #getRegraDeComposicao()
	 * @generated
	 */
  EReference getRegraDeComposicao_Consequente();

  /**
	 * Returns the meta object for class '{@link caracteristica.RegraDeContexto <em>Regra De Contexto</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regra De Contexto</em>'.
	 * @see caracteristica.RegraDeContexto
	 * @generated
	 */
  EClass getRegraDeContexto();

  /**
	 * Returns the meta object for the reference '{@link caracteristica.RegraDeContexto#getEvento <em>Evento</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Evento</em>'.
	 * @see caracteristica.RegraDeContexto#getEvento()
	 * @see #getRegraDeContexto()
	 * @generated
	 */
  EReference getRegraDeContexto_Evento();

  /**
	 * Returns the meta object for the reference '{@link caracteristica.RegraDeContexto#getAcao <em>Acao</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Acao</em>'.
	 * @see caracteristica.RegraDeContexto#getAcao()
	 * @see #getRegraDeContexto()
	 * @generated
	 */
  EReference getRegraDeContexto_Acao();

  /**
	 * Returns the meta object for class '{@link caracteristica.Evento <em>Evento</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evento</em>'.
	 * @see caracteristica.Evento
	 * @generated
	 */
  EClass getEvento();

  /**
	 * Returns the meta object for class '{@link caracteristica.EventoLogico <em>Evento Logico</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evento Logico</em>'.
	 * @see caracteristica.EventoLogico
	 * @generated
	 */
  EClass getEventoLogico();

  /**
	 * Returns the meta object for the reference '{@link caracteristica.EventoLogico#getLadoDireitoEvento <em>Lado Direito Evento</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lado Direito Evento</em>'.
	 * @see caracteristica.EventoLogico#getLadoDireitoEvento()
	 * @see #getEventoLogico()
	 * @generated
	 */
  EReference getEventoLogico_LadoDireitoEvento();

  /**
	 * Returns the meta object for the attribute '{@link caracteristica.EventoLogico#getOperadorLogico <em>Operador Logico</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operador Logico</em>'.
	 * @see caracteristica.EventoLogico#getOperadorLogico()
	 * @see #getEventoLogico()
	 * @generated
	 */
  EAttribute getEventoLogico_OperadorLogico();

  /**
	 * Returns the meta object for the reference '{@link caracteristica.EventoLogico#getLadoEsquerdoEvento <em>Lado Esquerdo Evento</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lado Esquerdo Evento</em>'.
	 * @see caracteristica.EventoLogico#getLadoEsquerdoEvento()
	 * @see #getEventoLogico()
	 * @generated
	 */
  EReference getEventoLogico_LadoEsquerdoEvento();

  /**
	 * Returns the meta object for class '{@link caracteristica.EventoRelacional <em>Evento Relacional</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evento Relacional</em>'.
	 * @see caracteristica.EventoRelacional
	 * @generated
	 */
  EClass getEventoRelacional();

  /**
	 * Returns the meta object for the reference '{@link caracteristica.EventoRelacional#getVariavelDeContexto <em>Variavel De Contexto</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variavel De Contexto</em>'.
	 * @see caracteristica.EventoRelacional#getVariavelDeContexto()
	 * @see #getEventoRelacional()
	 * @generated
	 */
  EReference getEventoRelacional_VariavelDeContexto();

  /**
	 * Returns the meta object for the attribute '{@link caracteristica.EventoRelacional#getOperadorRelacional <em>Operador Relacional</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operador Relacional</em>'.
	 * @see caracteristica.EventoRelacional#getOperadorRelacional()
	 * @see #getEventoRelacional()
	 * @generated
	 */
  EAttribute getEventoRelacional_OperadorRelacional();

  /**
	 * Returns the meta object for the attribute '{@link caracteristica.EventoRelacional#getValor <em>Valor</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor</em>'.
	 * @see caracteristica.EventoRelacional#getValor()
	 * @see #getEventoRelacional()
	 * @generated
	 */
  EAttribute getEventoRelacional_Valor();

  /**
	 * Returns the meta object for class '{@link caracteristica.Acao <em>Acao</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Acao</em>'.
	 * @see caracteristica.Acao
	 * @generated
	 */
  EClass getAcao();

  /**
	 * Returns the meta object for class '{@link caracteristica.AcaoLogico <em>Acao Logico</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Acao Logico</em>'.
	 * @see caracteristica.AcaoLogico
	 * @generated
	 */
  EClass getAcaoLogico();

  /**
	 * Returns the meta object for the reference '{@link caracteristica.AcaoLogico#getLadoEsquerdoAcao <em>Lado Esquerdo Acao</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lado Esquerdo Acao</em>'.
	 * @see caracteristica.AcaoLogico#getLadoEsquerdoAcao()
	 * @see #getAcaoLogico()
	 * @generated
	 */
  EReference getAcaoLogico_LadoEsquerdoAcao();

  /**
	 * Returns the meta object for the attribute '{@link caracteristica.AcaoLogico#getOperadorAcaoLogico <em>Operador Acao Logico</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operador Acao Logico</em>'.
	 * @see caracteristica.AcaoLogico#getOperadorAcaoLogico()
	 * @see #getAcaoLogico()
	 * @generated
	 */
  EAttribute getAcaoLogico_OperadorAcaoLogico();

  /**
	 * Returns the meta object for the reference '{@link caracteristica.AcaoLogico#getLadoDireitoAcao <em>Lado Direito Acao</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lado Direito Acao</em>'.
	 * @see caracteristica.AcaoLogico#getLadoDireitoAcao()
	 * @see #getAcaoLogico()
	 * @generated
	 */
  EReference getAcaoLogico_LadoDireitoAcao();

  /**
	 * Returns the meta object for class '{@link caracteristica.LiteralAcao <em>Literal Acao</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Acao</em>'.
	 * @see caracteristica.LiteralAcao
	 * @generated
	 */
  EClass getLiteralAcao();

  /**
	 * Returns the meta object for the attribute '{@link caracteristica.LiteralAcao#getPresenca <em>Presenca</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Presenca</em>'.
	 * @see caracteristica.LiteralAcao#getPresenca()
	 * @see #getLiteralAcao()
	 * @generated
	 */
  EAttribute getLiteralAcao_Presenca();

  /**
	 * Returns the meta object for the reference '{@link caracteristica.LiteralAcao#getElemento <em>Elemento</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Elemento</em>'.
	 * @see caracteristica.LiteralAcao#getElemento()
	 * @see #getLiteralAcao()
	 * @generated
	 */
  EReference getLiteralAcao_Elemento();

  /**
	 * Returns the meta object for class '{@link caracteristica.Designar <em>Designar</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Designar</em>'.
	 * @see caracteristica.Designar
	 * @generated
	 */
  EClass getDesignar();

  /**
	 * Returns the meta object for the attribute '{@link caracteristica.Designar#getValor <em>Valor</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor</em>'.
	 * @see caracteristica.Designar#getValor()
	 * @see #getDesignar()
	 * @generated
	 */
  EAttribute getDesignar_Valor();

  /**
	 * Returns the meta object for the reference '{@link caracteristica.Designar#getAtributo <em>Atributo</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Atributo</em>'.
	 * @see caracteristica.Designar#getAtributo()
	 * @see #getDesignar()
	 * @generated
	 */
  EReference getDesignar_Atributo();

  /**
	 * Returns the meta object for the attribute '{@link caracteristica.Designar#getTipoValor <em>Tipo Valor</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Valor</em>'.
	 * @see caracteristica.Designar#getTipoValor()
	 * @see #getDesignar()
	 * @generated
	 */
  EAttribute getDesignar_TipoValor();

  /**
	 * Returns the meta object for class '{@link caracteristica.Expressao <em>Expressao</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expressao</em>'.
	 * @see caracteristica.Expressao
	 * @generated
	 */
  EClass getExpressao();

  /**
	 * Returns the meta object for the attribute '{@link caracteristica.Expressao#getNome <em>Nome</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome</em>'.
	 * @see caracteristica.Expressao#getNome()
	 * @see #getExpressao()
	 * @generated
	 */
  EAttribute getExpressao_Nome();

  /**
	 * Returns the meta object for class '{@link caracteristica.Antecedente <em>Antecedente</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Antecedente</em>'.
	 * @see caracteristica.Antecedente
	 * @generated
	 */
  EClass getAntecedente();

  /**
	 * Returns the meta object for class '{@link caracteristica.ExpressaoLogica <em>Expressao Logica</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expressao Logica</em>'.
	 * @see caracteristica.ExpressaoLogica
	 * @generated
	 */
  EClass getExpressaoLogica();

  /**
	 * Returns the meta object for the reference '{@link caracteristica.ExpressaoLogica#getLadoDireitoComposicao <em>Lado Direito Composicao</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lado Direito Composicao</em>'.
	 * @see caracteristica.ExpressaoLogica#getLadoDireitoComposicao()
	 * @see #getExpressaoLogica()
	 * @generated
	 */
  EReference getExpressaoLogica_LadoDireitoComposicao();

  /**
	 * Returns the meta object for the attribute '{@link caracteristica.ExpressaoLogica#getOperadorLogico <em>Operador Logico</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operador Logico</em>'.
	 * @see caracteristica.ExpressaoLogica#getOperadorLogico()
	 * @see #getExpressaoLogica()
	 * @generated
	 */
  EAttribute getExpressaoLogica_OperadorLogico();

  /**
	 * Returns the meta object for the reference '{@link caracteristica.ExpressaoLogica#getLadoEsquerdoComposicao <em>Lado Esquerdo Composicao</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lado Esquerdo Composicao</em>'.
	 * @see caracteristica.ExpressaoLogica#getLadoEsquerdoComposicao()
	 * @see #getExpressaoLogica()
	 * @generated
	 */
  EReference getExpressaoLogica_LadoEsquerdoComposicao();

  /**
	 * Returns the meta object for class '{@link caracteristica.ExpressaoRelacional <em>Expressao Relacional</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expressao Relacional</em>'.
	 * @see caracteristica.ExpressaoRelacional
	 * @generated
	 */
  EClass getExpressaoRelacional();

  /**
	 * Returns the meta object for the reference '{@link caracteristica.ExpressaoRelacional#getVariaveldaExpressao <em>Variavelda Expressao</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variavelda Expressao</em>'.
	 * @see caracteristica.ExpressaoRelacional#getVariaveldaExpressao()
	 * @see #getExpressaoRelacional()
	 * @generated
	 */
  EReference getExpressaoRelacional_VariaveldaExpressao();

  /**
	 * Returns the meta object for the attribute '{@link caracteristica.ExpressaoRelacional#getOperadorRelacional <em>Operador Relacional</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operador Relacional</em>'.
	 * @see caracteristica.ExpressaoRelacional#getOperadorRelacional()
	 * @see #getExpressaoRelacional()
	 * @generated
	 */
  EAttribute getExpressaoRelacional_OperadorRelacional();

  /**
	 * Returns the meta object for the attribute '{@link caracteristica.ExpressaoRelacional#getValor <em>Valor</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor</em>'.
	 * @see caracteristica.ExpressaoRelacional#getValor()
	 * @see #getExpressaoRelacional()
	 * @generated
	 */
  EAttribute getExpressaoRelacional_Valor();

  /**
	 * Returns the meta object for class '{@link caracteristica.LiteralComposicao <em>Literal Composicao</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Composicao</em>'.
	 * @see caracteristica.LiteralComposicao
	 * @generated
	 */
  EClass getLiteralComposicao();

  /**
	 * Returns the meta object for the attribute '{@link caracteristica.LiteralComposicao#getPresenca <em>Presenca</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Presenca</em>'.
	 * @see caracteristica.LiteralComposicao#getPresenca()
	 * @see #getLiteralComposicao()
	 * @generated
	 */
  EAttribute getLiteralComposicao_Presenca();

  /**
	 * Returns the meta object for the reference '{@link caracteristica.LiteralComposicao#getElemento <em>Elemento</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Elemento</em>'.
	 * @see caracteristica.LiteralComposicao#getElemento()
	 * @see #getLiteralComposicao()
	 * @generated
	 */
  EReference getLiteralComposicao_Elemento();

  /**
	 * Returns the meta object for class '{@link caracteristica.Simulacao <em>Simulacao</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simulacao</em>'.
	 * @see caracteristica.Simulacao
	 * @generated
	 */
  EClass getSimulacao();

  /**
	 * Returns the meta object for the attribute '{@link caracteristica.Simulacao#getNome <em>Nome</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome</em>'.
	 * @see caracteristica.Simulacao#getNome()
	 * @see #getSimulacao()
	 * @generated
	 */
  EAttribute getSimulacao_Nome();

  /**
	 * Returns the meta object for the containment reference list '{@link caracteristica.Simulacao#getTransicoes <em>Transicoes</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transicoes</em>'.
	 * @see caracteristica.Simulacao#getTransicoes()
	 * @see #getSimulacao()
	 * @generated
	 */
  EReference getSimulacao_Transicoes();

  /**
	 * Returns the meta object for the containment reference list '{@link caracteristica.Simulacao#getEstados <em>Estados</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Estados</em>'.
	 * @see caracteristica.Simulacao#getEstados()
	 * @see #getSimulacao()
	 * @generated
	 */
  EReference getSimulacao_Estados();

  /**
	 * Returns the meta object for class '{@link caracteristica.Transicao <em>Transicao</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transicao</em>'.
	 * @see caracteristica.Transicao
	 * @generated
	 */
  EClass getTransicao();

  /**
	 * Returns the meta object for the reference '{@link caracteristica.Transicao#getEAntigo <em>EAntigo</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EAntigo</em>'.
	 * @see caracteristica.Transicao#getEAntigo()
	 * @see #getTransicao()
	 * @generated
	 */
  EReference getTransicao_EAntigo();

  /**
	 * Returns the meta object for the reference '{@link caracteristica.Transicao#getENovo <em>ENovo</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>ENovo</em>'.
	 * @see caracteristica.Transicao#getENovo()
	 * @see #getTransicao()
	 * @generated
	 */
  EReference getTransicao_ENovo();

  /**
	 * Returns the meta object for the reference list '{@link caracteristica.Transicao#getRegrasQuebradas <em>Regras Quebradas</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Regras Quebradas</em>'.
	 * @see caracteristica.Transicao#getRegrasQuebradas()
	 * @see #getTransicao()
	 * @generated
	 */
  EReference getTransicao_RegrasQuebradas();

  /**
	 * Returns the meta object for the reference list '{@link caracteristica.Transicao#getAcoes <em>Acoes</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Acoes</em>'.
	 * @see caracteristica.Transicao#getAcoes()
	 * @see #getTransicao()
	 * @generated
	 */
  EReference getTransicao_Acoes();

  /**
	 * Returns the meta object for the attribute '{@link caracteristica.Transicao#isSafe <em>Safe</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Safe</em>'.
	 * @see caracteristica.Transicao#isSafe()
	 * @see #getTransicao()
	 * @generated
	 */
  EAttribute getTransicao_Safe();

  /**
	 * Returns the meta object for the attribute '{@link caracteristica.Transicao#getEtiqueta <em>Etiqueta</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta</em>'.
	 * @see caracteristica.Transicao#getEtiqueta()
	 * @see #getTransicao()
	 * @generated
	 */
  EAttribute getTransicao_Etiqueta();

  /**
	 * Returns the meta object for class '{@link caracteristica.Estado <em>Estado</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Estado</em>'.
	 * @see caracteristica.Estado
	 * @generated
	 */
  EClass getEstado();

  /**
	 * Returns the meta object for the attribute '{@link caracteristica.Estado#getNome <em>Nome</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome</em>'.
	 * @see caracteristica.Estado#getNome()
	 * @see #getEstado()
	 * @generated
	 */
  EAttribute getEstado_Nome();

  /**
	 * Returns the meta object for the reference '{@link caracteristica.Estado#getProduto <em>Produto</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Produto</em>'.
	 * @see caracteristica.Estado#getProduto()
	 * @see #getEstado()
	 * @generated
	 */
  EReference getEstado_Produto();

  /**
	 * Returns the meta object for the attribute '{@link caracteristica.Estado#isSafe <em>Safe</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Safe</em>'.
	 * @see caracteristica.Estado#isSafe()
	 * @see #getEstado()
	 * @generated
	 */
  EAttribute getEstado_Safe();

  /**
	 * Returns the meta object for class '{@link caracteristica.InconsistenciaRegraAdaptacao <em>Inconsistencia Regra Adaptacao</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inconsistencia Regra Adaptacao</em>'.
	 * @see caracteristica.InconsistenciaRegraAdaptacao
	 * @generated
	 */
  EClass getInconsistenciaRegraAdaptacao();

  /**
	 * Returns the meta object for the reference list '{@link caracteristica.InconsistenciaRegraAdaptacao#getRegrasInconsistentes <em>Regras Inconsistentes</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Regras Inconsistentes</em>'.
	 * @see caracteristica.InconsistenciaRegraAdaptacao#getRegrasInconsistentes()
	 * @see #getInconsistenciaRegraAdaptacao()
	 * @generated
	 */
  EReference getInconsistenciaRegraAdaptacao_RegrasInconsistentes();

  /**
	 * Returns the meta object for the reference list '{@link caracteristica.InconsistenciaRegraAdaptacao#getLiteraisInconsistentes <em>Literais Inconsistentes</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Literais Inconsistentes</em>'.
	 * @see caracteristica.InconsistenciaRegraAdaptacao#getLiteraisInconsistentes()
	 * @see #getInconsistenciaRegraAdaptacao()
	 * @generated
	 */
  EReference getInconsistenciaRegraAdaptacao_LiteraisInconsistentes();

  /**
	 * Returns the meta object for the reference list '{@link caracteristica.InconsistenciaRegraAdaptacao#getAtribuicoesInconsistentes <em>Atribuicoes Inconsistentes</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Atribuicoes Inconsistentes</em>'.
	 * @see caracteristica.InconsistenciaRegraAdaptacao#getAtribuicoesInconsistentes()
	 * @see #getInconsistenciaRegraAdaptacao()
	 * @generated
	 */
  EReference getInconsistenciaRegraAdaptacao_AtribuicoesInconsistentes();

  /**
	 * Returns the meta object for enum '{@link caracteristica.Origem <em>Origem</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Origem</em>'.
	 * @see caracteristica.Origem
	 * @generated
	 */
  EEnum getOrigem();

  /**
	 * Returns the meta object for enum '{@link caracteristica.Validade <em>Validade</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Validade</em>'.
	 * @see caracteristica.Validade
	 * @generated
	 */
  EEnum getValidade();

  /**
	 * Returns the meta object for enum '{@link caracteristica.Qualidade <em>Qualidade</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Qualidade</em>'.
	 * @see caracteristica.Qualidade
	 * @generated
	 */
  EEnum getQualidade();

  /**
	 * Returns the meta object for enum '{@link caracteristica.TipoValor <em>Tipo Valor</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Valor</em>'.
	 * @see caracteristica.TipoValor
	 * @generated
	 */
  EEnum getTipoValor();

  /**
	 * Returns the meta object for enum '{@link caracteristica.OperadorLogico <em>Operador Logico</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operador Logico</em>'.
	 * @see caracteristica.OperadorLogico
	 * @generated
	 */
  EEnum getOperadorLogico();

  /**
	 * Returns the meta object for enum '{@link caracteristica.OperadorAcaoLogico <em>Operador Acao Logico</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operador Acao Logico</em>'.
	 * @see caracteristica.OperadorAcaoLogico
	 * @generated
	 */
  EEnum getOperadorAcaoLogico();

  /**
	 * Returns the meta object for enum '{@link caracteristica.CardinalidadeMaxima <em>Cardinalidade Maxima</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cardinalidade Maxima</em>'.
	 * @see caracteristica.CardinalidadeMaxima
	 * @generated
	 */
  EEnum getCardinalidadeMaxima();

  /**
	 * Returns the meta object for enum '{@link caracteristica.OperadorRelacional <em>Operador Relacional</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operador Relacional</em>'.
	 * @see caracteristica.OperadorRelacional
	 * @generated
	 */
  EEnum getOperadorRelacional();

  /**
	 * Returns the meta object for enum '{@link caracteristica.Presenca <em>Presenca</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Presenca</em>'.
	 * @see caracteristica.Presenca
	 * @generated
	 */
  EEnum getPresenca();

  /**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
  CaracteristicaFactory getCaracteristicaFactory();

  /**
	 * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
	 * @generated
	 */
  interface Literals
  {
    /**
		 * The meta object literal for the '{@link caracteristica.impl.LPSImpl <em>LPS</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see caracteristica.impl.LPSImpl
		 * @see caracteristica.impl.CaracteristicaPackageImpl#getLPS()
		 * @generated
		 */
    EClass LPS = eINSTANCE.getLPS();

    /**
		 * The meta object literal for the '<em><b>Pontos De Variacao</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference LPS__PONTOS_DE_VARIACAO = eINSTANCE.getLPS_PontosDeVariacao();

    /**
		 * The meta object literal for the '<em><b>Elementos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference LPS__ELEMENTOS = eINSTANCE.getLPS_Elementos();

    /**
		 * The meta object literal for the '<em><b>Regras</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference LPS__REGRAS = eINSTANCE.getLPS_Regras();

    /**
		 * The meta object literal for the '<em><b>Produtos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference LPS__PRODUTOS = eINSTANCE.getLPS_Produtos();

    /**
		 * The meta object literal for the '<em><b>Expressoes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference LPS__EXPRESSOES = eINSTANCE.getLPS_Expressoes();

    /**
		 * The meta object literal for the '<em><b>Elementos De Produto</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference LPS__ELEMENTOS_DE_PRODUTO = eINSTANCE.getLPS_ElementosDeProduto();

    /**
		 * The meta object literal for the '<em><b>Sistema</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference LPS__SISTEMA = eINSTANCE.getLPS_Sistema();

    /**
		 * The meta object literal for the '<em><b>Atributos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference LPS__ATRIBUTOS = eINSTANCE.getLPS_Atributos();

    /**
		 * The meta object literal for the '<em><b>Valores Contextuais</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute LPS__VALORES_CONTEXTUAIS = eINSTANCE.getLPS_ValoresContextuais();

    /**
		 * The meta object literal for the '<em><b>Simulacoes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference LPS__SIMULACOES = eINSTANCE.getLPS_Simulacoes();

    /**
		 * The meta object literal for the '<em><b>Inconsistencia ERA</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference LPS__INCONSISTENCIA_ERA = eINSTANCE.getLPS_InconsistenciaERA();

    /**
		 * The meta object literal for the '<em><b>Erro</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute LPS__ERRO = eINSTANCE.getLPS_Erro();

    /**
		 * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute LPS__NOME = eINSTANCE.getLPS_Nome();

    /**
		 * The meta object literal for the '{@link caracteristica.impl.ElementoImpl <em>Elemento</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see caracteristica.impl.ElementoImpl
		 * @see caracteristica.impl.CaracteristicaPackageImpl#getElemento()
		 * @generated
		 */
    EClass ELEMENTO = eINSTANCE.getElemento();

    /**
		 * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ELEMENTO__NOME = eINSTANCE.getElemento_Nome();

    /**
		 * The meta object literal for the '{@link caracteristica.impl.ElementoCaracteristicoImpl <em>Elemento Caracteristico</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see caracteristica.impl.ElementoCaracteristicoImpl
		 * @see caracteristica.impl.CaracteristicaPackageImpl#getElementoCaracteristico()
		 * @generated
		 */
    EClass ELEMENTO_CARACTERISTICO = eINSTANCE.getElementoCaracteristico();

    /**
		 * The meta object literal for the '{@link caracteristica.impl.AtributoImpl <em>Atributo</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see caracteristica.impl.AtributoImpl
		 * @see caracteristica.impl.CaracteristicaPackageImpl#getAtributo()
		 * @generated
		 */
    EClass ATRIBUTO = eINSTANCE.getAtributo();

    /**
		 * The meta object literal for the '<em><b>Tipo Valor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ATRIBUTO__TIPO_VALOR = eINSTANCE.getAtributo_TipoValor();

    /**
		 * The meta object literal for the '<em><b>Caracteristica Pai</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ATRIBUTO__CARACTERISTICA_PAI = eINSTANCE.getAtributo_CaracteristicaPai();

    /**
		 * The meta object literal for the '{@link caracteristica.impl.CaracteristicaImpl <em>Caracteristica</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see caracteristica.impl.CaracteristicaImpl
		 * @see caracteristica.impl.CaracteristicaPackageImpl#getCaracteristica()
		 * @generated
		 */
    EClass CARACTERISTICA = eINSTANCE.getCaracteristica();

    /**
		 * The meta object literal for the '<em><b>Caracteristica Pai</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference CARACTERISTICA__CARACTERISTICA_PAI = eINSTANCE.getCaracteristica_CaracteristicaPai();

    /**
		 * The meta object literal for the '<em><b>Caracteristica Filha</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference CARACTERISTICA__CARACTERISTICA_FILHA = eINSTANCE.getCaracteristica_CaracteristicaFilha();

    /**
		 * The meta object literal for the '<em><b>Variacoes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference CARACTERISTICA__VARIACOES = eINSTANCE.getCaracteristica_Variacoes();

    /**
		 * The meta object literal for the '<em><b>Atributo</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference CARACTERISTICA__ATRIBUTO = eINSTANCE.getCaracteristica_Atributo();

    /**
		 * The meta object literal for the '{@link caracteristica.impl.CaracteristicaRaizImpl <em>Raiz</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see caracteristica.impl.CaracteristicaRaizImpl
		 * @see caracteristica.impl.CaracteristicaPackageImpl#getCaracteristicaRaiz()
		 * @generated
		 */
    EClass CARACTERISTICA_RAIZ = eINSTANCE.getCaracteristicaRaiz();

    /**
		 * The meta object literal for the '<em><b>Lps Do Sistema</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference CARACTERISTICA_RAIZ__LPS_DO_SISTEMA = eINSTANCE.getCaracteristicaRaiz_LpsDoSistema();

    /**
		 * The meta object literal for the '{@link caracteristica.impl.CaracteristicaOpcionalImpl <em>Opcional</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see caracteristica.impl.CaracteristicaOpcionalImpl
		 * @see caracteristica.impl.CaracteristicaPackageImpl#getCaracteristicaOpcional()
		 * @generated
		 */
    EClass CARACTERISTICA_OPCIONAL = eINSTANCE.getCaracteristicaOpcional();

    /**
		 * The meta object literal for the '{@link caracteristica.impl.CaracteristicaAgrupadaImpl <em>Agrupada</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see caracteristica.impl.CaracteristicaAgrupadaImpl
		 * @see caracteristica.impl.CaracteristicaPackageImpl#getCaracteristicaAgrupada()
		 * @generated
		 */
    EClass CARACTERISTICA_AGRUPADA = eINSTANCE.getCaracteristicaAgrupada();

    /**
		 * The meta object literal for the '{@link caracteristica.impl.CaracteristicaMandatoriaImpl <em>Mandatoria</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see caracteristica.impl.CaracteristicaMandatoriaImpl
		 * @see caracteristica.impl.CaracteristicaPackageImpl#getCaracteristicaMandatoria()
		 * @generated
		 */
    EClass CARACTERISTICA_MANDATORIA = eINSTANCE.getCaracteristicaMandatoria();

    /**
		 * The meta object literal for the '{@link caracteristica.impl.VariacaoDoisImpl <em>Variacao Dois</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see caracteristica.impl.VariacaoDoisImpl
		 * @see caracteristica.impl.CaracteristicaPackageImpl#getVariacaoDois()
		 * @generated
		 */
    EClass VARIACAO_DOIS = eINSTANCE.getVariacaoDois();

    /**
		 * The meta object literal for the '<em><b>Cardinalidade Maxima</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute VARIACAO_DOIS__CARDINALIDADE_MAXIMA = eINSTANCE.getVariacaoDois_CardinalidadeMaxima();

    /**
		 * The meta object literal for the '<em><b>Cardinalidade Minima Or</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute VARIACAO_DOIS__CARDINALIDADE_MINIMA_OR = eINSTANCE.getVariacaoDois_CardinalidadeMinimaOr();

    /**
		 * The meta object literal for the '<em><b>Cardinalidade Maxima Or</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute VARIACAO_DOIS__CARDINALIDADE_MAXIMA_OR = eINSTANCE.getVariacaoDois_CardinalidadeMaximaOr();

    /**
		 * The meta object literal for the '{@link caracteristica.impl.PontoDeVariacaoImpl <em>Ponto De Variacao</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see caracteristica.impl.PontoDeVariacaoImpl
		 * @see caracteristica.impl.CaracteristicaPackageImpl#getPontoDeVariacao()
		 * @generated
		 */
    EClass PONTO_DE_VARIACAO = eINSTANCE.getPontoDeVariacao();

    /**
		 * The meta object literal for the '{@link caracteristica.impl.VariacaoImpl <em>Variacao</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see caracteristica.impl.VariacaoImpl
		 * @see caracteristica.impl.CaracteristicaPackageImpl#getVariacao()
		 * @generated
		 */
    EClass VARIACAO = eINSTANCE.getVariacao();

    /**
		 * The meta object literal for the '<em><b>Cardinalidade Minima</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute VARIACAO__CARDINALIDADE_MINIMA = eINSTANCE.getVariacao_CardinalidadeMinima();

    /**
		 * The meta object literal for the '<em><b>Cardinalidade Maxima</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute VARIACAO__CARDINALIDADE_MAXIMA = eINSTANCE.getVariacao_CardinalidadeMaxima();

    /**
		 * The meta object literal for the '<em><b>Variantes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference VARIACAO__VARIANTES = eINSTANCE.getVariacao_Variantes();

    /**
		 * The meta object literal for the '<em><b>Caracteristica Pai</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference VARIACAO__CARACTERISTICA_PAI = eINSTANCE.getVariacao_CaracteristicaPai();

    /**
		 * The meta object literal for the '{@link caracteristica.impl.VarianteImpl <em>Variante</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see caracteristica.impl.VarianteImpl
		 * @see caracteristica.impl.CaracteristicaPackageImpl#getVariante()
		 * @generated
		 */
    EClass VARIANTE = eINSTANCE.getVariante();

    /**
		 * The meta object literal for the '<em><b>Variacao Pai</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference VARIANTE__VARIACAO_PAI = eINSTANCE.getVariante_VariacaoPai();

    /**
		 * The meta object literal for the '{@link caracteristica.impl.RaizDeContextoImpl <em>Raiz De Contexto</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see caracteristica.impl.RaizDeContextoImpl
		 * @see caracteristica.impl.CaracteristicaPackageImpl#getRaizDeContexto()
		 * @generated
		 */
    EClass RAIZ_DE_CONTEXTO = eINSTANCE.getRaizDeContexto();

    /**
		 * The meta object literal for the '<em><b>Entidades De Contexto</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference RAIZ_DE_CONTEXTO__ENTIDADES_DE_CONTEXTO = eINSTANCE.getRaizDeContexto_EntidadesDeContexto();

    /**
		 * The meta object literal for the '{@link caracteristica.impl.EntidadeDeContextoImpl <em>Entidade De Contexto</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see caracteristica.impl.EntidadeDeContextoImpl
		 * @see caracteristica.impl.CaracteristicaPackageImpl#getEntidadeDeContexto()
		 * @generated
		 */
    EClass ENTIDADE_DE_CONTEXTO = eINSTANCE.getEntidadeDeContexto();

    /**
		 * The meta object literal for the '<em><b>Raiz</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ENTIDADE_DE_CONTEXTO__RAIZ = eINSTANCE.getEntidadeDeContexto_Raiz();

    /**
		 * The meta object literal for the '<em><b>Informacoes De Contexto</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ENTIDADE_DE_CONTEXTO__INFORMACOES_DE_CONTEXTO = eINSTANCE.getEntidadeDeContexto_InformacoesDeContexto();

    /**
		 * The meta object literal for the '{@link caracteristica.impl.InformacaoDeContextoImpl <em>Informacao De Contexto</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see caracteristica.impl.InformacaoDeContextoImpl
		 * @see caracteristica.impl.CaracteristicaPackageImpl#getInformacaoDeContexto()
		 * @generated
		 */
    EClass INFORMACAO_DE_CONTEXTO = eINSTANCE.getInformacaoDeContexto();

    /**
		 * The meta object literal for the '<em><b>Origem</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute INFORMACAO_DE_CONTEXTO__ORIGEM = eINSTANCE.getInformacaoDeContexto_Origem();

    /**
		 * The meta object literal for the '<em><b>Validade</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute INFORMACAO_DE_CONTEXTO__VALIDADE = eINSTANCE.getInformacaoDeContexto_Validade();

    /**
		 * The meta object literal for the '<em><b>Qualidade</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute INFORMACAO_DE_CONTEXTO__QUALIDADE = eINSTANCE.getInformacaoDeContexto_Qualidade();

    /**
		 * The meta object literal for the '<em><b>Tipo Valor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute INFORMACAO_DE_CONTEXTO__TIPO_VALOR = eINSTANCE.getInformacaoDeContexto_TipoValor();

    /**
		 * The meta object literal for the '<em><b>Valor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute INFORMACAO_DE_CONTEXTO__VALOR = eINSTANCE.getInformacaoDeContexto_Valor();

    /**
		 * The meta object literal for the '<em><b>Elemento Pai</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference INFORMACAO_DE_CONTEXTO__ELEMENTO_PAI = eINSTANCE.getInformacaoDeContexto_ElementoPai();

    /**
		 * The meta object literal for the '{@link caracteristica.impl.ElementoDeProdutoImpl <em>Elemento De Produto</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see caracteristica.impl.ElementoDeProdutoImpl
		 * @see caracteristica.impl.CaracteristicaPackageImpl#getElementoDeProduto()
		 * @generated
		 */
    EClass ELEMENTO_DE_PRODUTO = eINSTANCE.getElementoDeProduto();

    /**
		 * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ELEMENTO_DE_PRODUTO__NOME = eINSTANCE.getElementoDeProduto_Nome();

    /**
		 * The meta object literal for the '<em><b>Elemento Original</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ELEMENTO_DE_PRODUTO__ELEMENTO_ORIGINAL = eINSTANCE.getElementoDeProduto_ElementoOriginal();

    /**
		 * The meta object literal for the '{@link caracteristica.impl.CaracteristicaProdutoImpl <em>Produto</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see caracteristica.impl.CaracteristicaProdutoImpl
		 * @see caracteristica.impl.CaracteristicaPackageImpl#getCaracteristicaProduto()
		 * @generated
		 */
    EClass CARACTERISTICA_PRODUTO = eINSTANCE.getCaracteristicaProduto();

    /**
		 * The meta object literal for the '<em><b>Caracteristica Produto Pai</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference CARACTERISTICA_PRODUTO__CARACTERISTICA_PRODUTO_PAI = eINSTANCE.getCaracteristicaProduto_CaracteristicaProdutoPai();

    /**
		 * The meta object literal for the '<em><b>Caracteristica Produto Filha</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference CARACTERISTICA_PRODUTO__CARACTERISTICA_PRODUTO_FILHA = eINSTANCE.getCaracteristicaProduto_CaracteristicaProdutoFilha();

    /**
		 * The meta object literal for the '<em><b>Atributo Produto</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference CARACTERISTICA_PRODUTO__ATRIBUTO_PRODUTO = eINSTANCE.getCaracteristicaProduto_AtributoProduto();

    /**
		 * The meta object literal for the '{@link caracteristica.impl.AtributoProdutoImpl <em>Atributo Produto</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see caracteristica.impl.AtributoProdutoImpl
		 * @see caracteristica.impl.CaracteristicaPackageImpl#getAtributoProduto()
		 * @generated
		 */
    EClass ATRIBUTO_PRODUTO = eINSTANCE.getAtributoProduto();

    /**
		 * The meta object literal for the '<em><b>Valor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ATRIBUTO_PRODUTO__VALOR = eINSTANCE.getAtributoProduto_Valor();

    /**
		 * The meta object literal for the '<em><b>Tipo Valor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ATRIBUTO_PRODUTO__TIPO_VALOR = eINSTANCE.getAtributoProduto_TipoValor();

    /**
		 * The meta object literal for the '<em><b>Caracteristica Produto Pai</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ATRIBUTO_PRODUTO__CARACTERISTICA_PRODUTO_PAI = eINSTANCE.getAtributoProduto_CaracteristicaProdutoPai();

    /**
		 * The meta object literal for the '{@link caracteristica.impl.CaracteristicaMandatoriaProdutoImpl <em>Mandatoria Produto</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see caracteristica.impl.CaracteristicaMandatoriaProdutoImpl
		 * @see caracteristica.impl.CaracteristicaPackageImpl#getCaracteristicaMandatoriaProduto()
		 * @generated
		 */
    EClass CARACTERISTICA_MANDATORIA_PRODUTO = eINSTANCE.getCaracteristicaMandatoriaProduto();

    /**
		 * The meta object literal for the '{@link caracteristica.impl.CaracteristicaOpcionalProdutoImpl <em>Opcional Produto</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see caracteristica.impl.CaracteristicaOpcionalProdutoImpl
		 * @see caracteristica.impl.CaracteristicaPackageImpl#getCaracteristicaOpcionalProduto()
		 * @generated
		 */
    EClass CARACTERISTICA_OPCIONAL_PRODUTO = eINSTANCE.getCaracteristicaOpcionalProduto();

    /**
		 * The meta object literal for the '{@link caracteristica.impl.VariacaoDoisProdutoImpl <em>Variacao Dois Produto</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see caracteristica.impl.VariacaoDoisProdutoImpl
		 * @see caracteristica.impl.CaracteristicaPackageImpl#getVariacaoDoisProduto()
		 * @generated
		 */
    EClass VARIACAO_DOIS_PRODUTO = eINSTANCE.getVariacaoDoisProduto();

    /**
		 * The meta object literal for the '<em><b>Cardinalidade Maxima</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute VARIACAO_DOIS_PRODUTO__CARDINALIDADE_MAXIMA = eINSTANCE.getVariacaoDoisProduto_CardinalidadeMaxima();

    /**
		 * The meta object literal for the '<em><b>Cardinalidade Minima Or</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIACAO_DOIS_PRODUTO__CARDINALIDADE_MINIMA_OR = eINSTANCE.getVariacaoDoisProduto_CardinalidadeMinimaOr();

				/**
		 * The meta object literal for the '<em><b>Cardinalidade Maxima Or</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIACAO_DOIS_PRODUTO__CARDINALIDADE_MAXIMA_OR = eINSTANCE.getVariacaoDoisProduto_CardinalidadeMaximaOr();

				/**
		 * The meta object literal for the '{@link caracteristica.impl.CaracteristicaAgrupadaProdutoImpl <em>Agrupada Produto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see caracteristica.impl.CaracteristicaAgrupadaProdutoImpl
		 * @see caracteristica.impl.CaracteristicaPackageImpl#getCaracteristicaAgrupadaProduto()
		 * @generated
		 */
		EClass CARACTERISTICA_AGRUPADA_PRODUTO = eINSTANCE.getCaracteristicaAgrupadaProduto();

				/**
		 * The meta object literal for the '{@link caracteristica.impl.VariacaoProdutoImpl <em>Variacao Produto</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see caracteristica.impl.VariacaoProdutoImpl
		 * @see caracteristica.impl.CaracteristicaPackageImpl#getVariacaoProduto()
		 * @generated
		 */
    EClass VARIACAO_PRODUTO = eINSTANCE.getVariacaoProduto();

    /**
		 * The meta object literal for the '<em><b>Cardinalidade Minima</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute VARIACAO_PRODUTO__CARDINALIDADE_MINIMA = eINSTANCE.getVariacaoProduto_CardinalidadeMinima();

    /**
		 * The meta object literal for the '<em><b>Cardinalidade Maxima</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute VARIACAO_PRODUTO__CARDINALIDADE_MAXIMA = eINSTANCE.getVariacaoProduto_CardinalidadeMaxima();

    /**
		 * The meta object literal for the '<em><b>Variantes Produto</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference VARIACAO_PRODUTO__VARIANTES_PRODUTO = eINSTANCE.getVariacaoProduto_VariantesProduto();

    /**
		 * The meta object literal for the '<em><b>Caracteristica Produto Pai</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference VARIACAO_PRODUTO__CARACTERISTICA_PRODUTO_PAI = eINSTANCE.getVariacaoProduto_CaracteristicaProdutoPai();

    /**
		 * The meta object literal for the '{@link caracteristica.impl.VarianteProdutoImpl <em>Variante Produto</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see caracteristica.impl.VarianteProdutoImpl
		 * @see caracteristica.impl.CaracteristicaPackageImpl#getVarianteProduto()
		 * @generated
		 */
    EClass VARIANTE_PRODUTO = eINSTANCE.getVarianteProduto();

    /**
		 * The meta object literal for the '<em><b>Variacao Produto Pai</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference VARIANTE_PRODUTO__VARIACAO_PRODUTO_PAI = eINSTANCE.getVarianteProduto_VariacaoProdutoPai();

    /**
		 * The meta object literal for the '<em><b>Selecionado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute VARIANTE_PRODUTO__SELECIONADO = eINSTANCE.getVarianteProduto_Selecionado();

    /**
		 * The meta object literal for the '{@link caracteristica.impl.ProdutoImpl <em>Produto</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see caracteristica.impl.ProdutoImpl
		 * @see caracteristica.impl.CaracteristicaPackageImpl#getProduto()
		 * @generated
		 */
    EClass PRODUTO = eINSTANCE.getProduto();

    /**
		 * The meta object literal for the '<em><b>Linha Do Produto</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference PRODUTO__LINHA_DO_PRODUTO = eINSTANCE.getProduto_LinhaDoProduto();

    /**
		 * The meta object literal for the '{@link caracteristica.impl.RegraImpl <em>Regra</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see caracteristica.impl.RegraImpl
		 * @see caracteristica.impl.CaracteristicaPackageImpl#getRegra()
		 * @generated
		 */
    EClass REGRA = eINSTANCE.getRegra();

    /**
		 * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute REGRA__NOME = eINSTANCE.getRegra_Nome();

    /**
		 * The meta object literal for the '<em><b>Conteudo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute REGRA__CONTEUDO = eINSTANCE.getRegra_Conteudo();

    /**
		 * The meta object literal for the '{@link caracteristica.impl.RegraDeComposicaoImpl <em>Regra De Composicao</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see caracteristica.impl.RegraDeComposicaoImpl
		 * @see caracteristica.impl.CaracteristicaPackageImpl#getRegraDeComposicao()
		 * @generated
		 */
    EClass REGRA_DE_COMPOSICAO = eINSTANCE.getRegraDeComposicao();

    /**
		 * The meta object literal for the '<em><b>Antecedente</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference REGRA_DE_COMPOSICAO__ANTECEDENTE = eINSTANCE.getRegraDeComposicao_Antecedente();

    /**
		 * The meta object literal for the '<em><b>Consequente</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference REGRA_DE_COMPOSICAO__CONSEQUENTE = eINSTANCE.getRegraDeComposicao_Consequente();

    /**
		 * The meta object literal for the '{@link caracteristica.impl.RegraDeContextoImpl <em>Regra De Contexto</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see caracteristica.impl.RegraDeContextoImpl
		 * @see caracteristica.impl.CaracteristicaPackageImpl#getRegraDeContexto()
		 * @generated
		 */
    EClass REGRA_DE_CONTEXTO = eINSTANCE.getRegraDeContexto();

    /**
		 * The meta object literal for the '<em><b>Evento</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference REGRA_DE_CONTEXTO__EVENTO = eINSTANCE.getRegraDeContexto_Evento();

    /**
		 * The meta object literal for the '<em><b>Acao</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference REGRA_DE_CONTEXTO__ACAO = eINSTANCE.getRegraDeContexto_Acao();

    /**
		 * The meta object literal for the '{@link caracteristica.impl.EventoImpl <em>Evento</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see caracteristica.impl.EventoImpl
		 * @see caracteristica.impl.CaracteristicaPackageImpl#getEvento()
		 * @generated
		 */
    EClass EVENTO = eINSTANCE.getEvento();

    /**
		 * The meta object literal for the '{@link caracteristica.impl.EventoLogicoImpl <em>Evento Logico</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see caracteristica.impl.EventoLogicoImpl
		 * @see caracteristica.impl.CaracteristicaPackageImpl#getEventoLogico()
		 * @generated
		 */
    EClass EVENTO_LOGICO = eINSTANCE.getEventoLogico();

    /**
		 * The meta object literal for the '<em><b>Lado Direito Evento</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference EVENTO_LOGICO__LADO_DIREITO_EVENTO = eINSTANCE.getEventoLogico_LadoDireitoEvento();

    /**
		 * The meta object literal for the '<em><b>Operador Logico</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute EVENTO_LOGICO__OPERADOR_LOGICO = eINSTANCE.getEventoLogico_OperadorLogico();

    /**
		 * The meta object literal for the '<em><b>Lado Esquerdo Evento</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference EVENTO_LOGICO__LADO_ESQUERDO_EVENTO = eINSTANCE.getEventoLogico_LadoEsquerdoEvento();

    /**
		 * The meta object literal for the '{@link caracteristica.impl.EventoRelacionalImpl <em>Evento Relacional</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see caracteristica.impl.EventoRelacionalImpl
		 * @see caracteristica.impl.CaracteristicaPackageImpl#getEventoRelacional()
		 * @generated
		 */
    EClass EVENTO_RELACIONAL = eINSTANCE.getEventoRelacional();

    /**
		 * The meta object literal for the '<em><b>Variavel De Contexto</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference EVENTO_RELACIONAL__VARIAVEL_DE_CONTEXTO = eINSTANCE.getEventoRelacional_VariavelDeContexto();

    /**
		 * The meta object literal for the '<em><b>Operador Relacional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute EVENTO_RELACIONAL__OPERADOR_RELACIONAL = eINSTANCE.getEventoRelacional_OperadorRelacional();

    /**
		 * The meta object literal for the '<em><b>Valor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute EVENTO_RELACIONAL__VALOR = eINSTANCE.getEventoRelacional_Valor();

    /**
		 * The meta object literal for the '{@link caracteristica.impl.AcaoImpl <em>Acao</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see caracteristica.impl.AcaoImpl
		 * @see caracteristica.impl.CaracteristicaPackageImpl#getAcao()
		 * @generated
		 */
    EClass ACAO = eINSTANCE.getAcao();

    /**
		 * The meta object literal for the '{@link caracteristica.impl.AcaoLogicoImpl <em>Acao Logico</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see caracteristica.impl.AcaoLogicoImpl
		 * @see caracteristica.impl.CaracteristicaPackageImpl#getAcaoLogico()
		 * @generated
		 */
    EClass ACAO_LOGICO = eINSTANCE.getAcaoLogico();

    /**
		 * The meta object literal for the '<em><b>Lado Esquerdo Acao</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ACAO_LOGICO__LADO_ESQUERDO_ACAO = eINSTANCE.getAcaoLogico_LadoEsquerdoAcao();

    /**
		 * The meta object literal for the '<em><b>Operador Acao Logico</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ACAO_LOGICO__OPERADOR_ACAO_LOGICO = eINSTANCE.getAcaoLogico_OperadorAcaoLogico();

    /**
		 * The meta object literal for the '<em><b>Lado Direito Acao</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ACAO_LOGICO__LADO_DIREITO_ACAO = eINSTANCE.getAcaoLogico_LadoDireitoAcao();

    /**
		 * The meta object literal for the '{@link caracteristica.impl.LiteralAcaoImpl <em>Literal Acao</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see caracteristica.impl.LiteralAcaoImpl
		 * @see caracteristica.impl.CaracteristicaPackageImpl#getLiteralAcao()
		 * @generated
		 */
    EClass LITERAL_ACAO = eINSTANCE.getLiteralAcao();

    /**
		 * The meta object literal for the '<em><b>Presenca</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute LITERAL_ACAO__PRESENCA = eINSTANCE.getLiteralAcao_Presenca();

    /**
		 * The meta object literal for the '<em><b>Elemento</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference LITERAL_ACAO__ELEMENTO = eINSTANCE.getLiteralAcao_Elemento();

    /**
		 * The meta object literal for the '{@link caracteristica.impl.DesignarImpl <em>Designar</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see caracteristica.impl.DesignarImpl
		 * @see caracteristica.impl.CaracteristicaPackageImpl#getDesignar()
		 * @generated
		 */
    EClass DESIGNAR = eINSTANCE.getDesignar();

    /**
		 * The meta object literal for the '<em><b>Valor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute DESIGNAR__VALOR = eINSTANCE.getDesignar_Valor();

    /**
		 * The meta object literal for the '<em><b>Atributo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference DESIGNAR__ATRIBUTO = eINSTANCE.getDesignar_Atributo();

    /**
		 * The meta object literal for the '<em><b>Tipo Valor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute DESIGNAR__TIPO_VALOR = eINSTANCE.getDesignar_TipoValor();

    /**
		 * The meta object literal for the '{@link caracteristica.impl.ExpressaoImpl <em>Expressao</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see caracteristica.impl.ExpressaoImpl
		 * @see caracteristica.impl.CaracteristicaPackageImpl#getExpressao()
		 * @generated
		 */
    EClass EXPRESSAO = eINSTANCE.getExpressao();

    /**
		 * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute EXPRESSAO__NOME = eINSTANCE.getExpressao_Nome();

    /**
		 * The meta object literal for the '{@link caracteristica.impl.AntecedenteImpl <em>Antecedente</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see caracteristica.impl.AntecedenteImpl
		 * @see caracteristica.impl.CaracteristicaPackageImpl#getAntecedente()
		 * @generated
		 */
    EClass ANTECEDENTE = eINSTANCE.getAntecedente();

    /**
		 * The meta object literal for the '{@link caracteristica.impl.ExpressaoLogicaImpl <em>Expressao Logica</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see caracteristica.impl.ExpressaoLogicaImpl
		 * @see caracteristica.impl.CaracteristicaPackageImpl#getExpressaoLogica()
		 * @generated
		 */
    EClass EXPRESSAO_LOGICA = eINSTANCE.getExpressaoLogica();

    /**
		 * The meta object literal for the '<em><b>Lado Direito Composicao</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference EXPRESSAO_LOGICA__LADO_DIREITO_COMPOSICAO = eINSTANCE.getExpressaoLogica_LadoDireitoComposicao();

    /**
		 * The meta object literal for the '<em><b>Operador Logico</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute EXPRESSAO_LOGICA__OPERADOR_LOGICO = eINSTANCE.getExpressaoLogica_OperadorLogico();

    /**
		 * The meta object literal for the '<em><b>Lado Esquerdo Composicao</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference EXPRESSAO_LOGICA__LADO_ESQUERDO_COMPOSICAO = eINSTANCE.getExpressaoLogica_LadoEsquerdoComposicao();

    /**
		 * The meta object literal for the '{@link caracteristica.impl.ExpressaoRelacionalImpl <em>Expressao Relacional</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see caracteristica.impl.ExpressaoRelacionalImpl
		 * @see caracteristica.impl.CaracteristicaPackageImpl#getExpressaoRelacional()
		 * @generated
		 */
    EClass EXPRESSAO_RELACIONAL = eINSTANCE.getExpressaoRelacional();

    /**
		 * The meta object literal for the '<em><b>Variavelda Expressao</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference EXPRESSAO_RELACIONAL__VARIAVELDA_EXPRESSAO = eINSTANCE.getExpressaoRelacional_VariaveldaExpressao();

    /**
		 * The meta object literal for the '<em><b>Operador Relacional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute EXPRESSAO_RELACIONAL__OPERADOR_RELACIONAL = eINSTANCE.getExpressaoRelacional_OperadorRelacional();

    /**
		 * The meta object literal for the '<em><b>Valor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute EXPRESSAO_RELACIONAL__VALOR = eINSTANCE.getExpressaoRelacional_Valor();

    /**
		 * The meta object literal for the '{@link caracteristica.impl.LiteralComposicaoImpl <em>Literal Composicao</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see caracteristica.impl.LiteralComposicaoImpl
		 * @see caracteristica.impl.CaracteristicaPackageImpl#getLiteralComposicao()
		 * @generated
		 */
    EClass LITERAL_COMPOSICAO = eINSTANCE.getLiteralComposicao();

    /**
		 * The meta object literal for the '<em><b>Presenca</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute LITERAL_COMPOSICAO__PRESENCA = eINSTANCE.getLiteralComposicao_Presenca();

    /**
		 * The meta object literal for the '<em><b>Elemento</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference LITERAL_COMPOSICAO__ELEMENTO = eINSTANCE.getLiteralComposicao_Elemento();

    /**
		 * The meta object literal for the '{@link caracteristica.impl.SimulacaoImpl <em>Simulacao</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see caracteristica.impl.SimulacaoImpl
		 * @see caracteristica.impl.CaracteristicaPackageImpl#getSimulacao()
		 * @generated
		 */
    EClass SIMULACAO = eINSTANCE.getSimulacao();

    /**
		 * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute SIMULACAO__NOME = eINSTANCE.getSimulacao_Nome();

    /**
		 * The meta object literal for the '<em><b>Transicoes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference SIMULACAO__TRANSICOES = eINSTANCE.getSimulacao_Transicoes();

    /**
		 * The meta object literal for the '<em><b>Estados</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference SIMULACAO__ESTADOS = eINSTANCE.getSimulacao_Estados();

    /**
		 * The meta object literal for the '{@link caracteristica.impl.TransicaoImpl <em>Transicao</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see caracteristica.impl.TransicaoImpl
		 * @see caracteristica.impl.CaracteristicaPackageImpl#getTransicao()
		 * @generated
		 */
    EClass TRANSICAO = eINSTANCE.getTransicao();

    /**
		 * The meta object literal for the '<em><b>EAntigo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference TRANSICAO__EANTIGO = eINSTANCE.getTransicao_EAntigo();

    /**
		 * The meta object literal for the '<em><b>ENovo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference TRANSICAO__ENOVO = eINSTANCE.getTransicao_ENovo();

    /**
		 * The meta object literal for the '<em><b>Regras Quebradas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference TRANSICAO__REGRAS_QUEBRADAS = eINSTANCE.getTransicao_RegrasQuebradas();

    /**
		 * The meta object literal for the '<em><b>Acoes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference TRANSICAO__ACOES = eINSTANCE.getTransicao_Acoes();

    /**
		 * The meta object literal for the '<em><b>Safe</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute TRANSICAO__SAFE = eINSTANCE.getTransicao_Safe();

    /**
		 * The meta object literal for the '<em><b>Etiqueta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute TRANSICAO__ETIQUETA = eINSTANCE.getTransicao_Etiqueta();

    /**
		 * The meta object literal for the '{@link caracteristica.impl.EstadoImpl <em>Estado</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see caracteristica.impl.EstadoImpl
		 * @see caracteristica.impl.CaracteristicaPackageImpl#getEstado()
		 * @generated
		 */
    EClass ESTADO = eINSTANCE.getEstado();

    /**
		 * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ESTADO__NOME = eINSTANCE.getEstado_Nome();

    /**
		 * The meta object literal for the '<em><b>Produto</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ESTADO__PRODUTO = eINSTANCE.getEstado_Produto();

    /**
		 * The meta object literal for the '<em><b>Safe</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ESTADO__SAFE = eINSTANCE.getEstado_Safe();

    /**
		 * The meta object literal for the '{@link caracteristica.impl.InconsistenciaRegraAdaptacaoImpl <em>Inconsistencia Regra Adaptacao</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see caracteristica.impl.InconsistenciaRegraAdaptacaoImpl
		 * @see caracteristica.impl.CaracteristicaPackageImpl#getInconsistenciaRegraAdaptacao()
		 * @generated
		 */
    EClass INCONSISTENCIA_REGRA_ADAPTACAO = eINSTANCE.getInconsistenciaRegraAdaptacao();

    /**
		 * The meta object literal for the '<em><b>Regras Inconsistentes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference INCONSISTENCIA_REGRA_ADAPTACAO__REGRAS_INCONSISTENTES = eINSTANCE.getInconsistenciaRegraAdaptacao_RegrasInconsistentes();

    /**
		 * The meta object literal for the '<em><b>Literais Inconsistentes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference INCONSISTENCIA_REGRA_ADAPTACAO__LITERAIS_INCONSISTENTES = eINSTANCE.getInconsistenciaRegraAdaptacao_LiteraisInconsistentes();

    /**
		 * The meta object literal for the '<em><b>Atribuicoes Inconsistentes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference INCONSISTENCIA_REGRA_ADAPTACAO__ATRIBUICOES_INCONSISTENTES = eINSTANCE.getInconsistenciaRegraAdaptacao_AtribuicoesInconsistentes();

    /**
		 * The meta object literal for the '{@link caracteristica.Origem <em>Origem</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see caracteristica.Origem
		 * @see caracteristica.impl.CaracteristicaPackageImpl#getOrigem()
		 * @generated
		 */
    EEnum ORIGEM = eINSTANCE.getOrigem();

    /**
		 * The meta object literal for the '{@link caracteristica.Validade <em>Validade</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see caracteristica.Validade
		 * @see caracteristica.impl.CaracteristicaPackageImpl#getValidade()
		 * @generated
		 */
    EEnum VALIDADE = eINSTANCE.getValidade();

    /**
		 * The meta object literal for the '{@link caracteristica.Qualidade <em>Qualidade</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see caracteristica.Qualidade
		 * @see caracteristica.impl.CaracteristicaPackageImpl#getQualidade()
		 * @generated
		 */
    EEnum QUALIDADE = eINSTANCE.getQualidade();

    /**
		 * The meta object literal for the '{@link caracteristica.TipoValor <em>Tipo Valor</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see caracteristica.TipoValor
		 * @see caracteristica.impl.CaracteristicaPackageImpl#getTipoValor()
		 * @generated
		 */
    EEnum TIPO_VALOR = eINSTANCE.getTipoValor();

    /**
		 * The meta object literal for the '{@link caracteristica.OperadorLogico <em>Operador Logico</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see caracteristica.OperadorLogico
		 * @see caracteristica.impl.CaracteristicaPackageImpl#getOperadorLogico()
		 * @generated
		 */
    EEnum OPERADOR_LOGICO = eINSTANCE.getOperadorLogico();

    /**
		 * The meta object literal for the '{@link caracteristica.OperadorAcaoLogico <em>Operador Acao Logico</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see caracteristica.OperadorAcaoLogico
		 * @see caracteristica.impl.CaracteristicaPackageImpl#getOperadorAcaoLogico()
		 * @generated
		 */
    EEnum OPERADOR_ACAO_LOGICO = eINSTANCE.getOperadorAcaoLogico();

    /**
		 * The meta object literal for the '{@link caracteristica.CardinalidadeMaxima <em>Cardinalidade Maxima</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see caracteristica.CardinalidadeMaxima
		 * @see caracteristica.impl.CaracteristicaPackageImpl#getCardinalidadeMaxima()
		 * @generated
		 */
    EEnum CARDINALIDADE_MAXIMA = eINSTANCE.getCardinalidadeMaxima();

    /**
		 * The meta object literal for the '{@link caracteristica.OperadorRelacional <em>Operador Relacional</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see caracteristica.OperadorRelacional
		 * @see caracteristica.impl.CaracteristicaPackageImpl#getOperadorRelacional()
		 * @generated
		 */
    EEnum OPERADOR_RELACIONAL = eINSTANCE.getOperadorRelacional();

    /**
		 * The meta object literal for the '{@link caracteristica.Presenca <em>Presenca</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see caracteristica.Presenca
		 * @see caracteristica.impl.CaracteristicaPackageImpl#getPresenca()
		 * @generated
		 */
    EEnum PRESENCA = eINSTANCE.getPresenca();

  }

} //CaracteristicaPackage
