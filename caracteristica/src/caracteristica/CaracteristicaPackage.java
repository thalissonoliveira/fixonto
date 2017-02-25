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
	 * The feature id for the '<em><b>Elementos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LPS__ELEMENTOS = 0;

  /**
	 * The feature id for the '<em><b>Regras</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LPS__REGRAS = 1;

  /**
	 * The feature id for the '<em><b>Expressoes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LPS__EXPRESSOES = 2;

  /**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LPS__NOME = 3;

  /**
	 * The number of structural features of the '<em>LPS</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LPS_FEATURE_COUNT = 4;

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
	 * The meta object id for the '{@link caracteristica.impl.ContextoImpl <em>Contexto</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.impl.ContextoImpl
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getContexto()
	 * @generated
	 */
  int CONTEXTO = 13;

  /**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONTEXTO__NOME = ELEMENTO__NOME;

  /**
	 * The feature id for the '<em><b>Caracteristicas Incluir</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONTEXTO__CARACTERISTICAS_INCLUIR = ELEMENTO_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Caracteristicas Excluir</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONTEXTO__CARACTERISTICAS_EXCLUIR = ELEMENTO_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Contexto</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONTEXTO_FEATURE_COUNT = ELEMENTO_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link caracteristica.impl.RaizDeContextoImpl <em>Raiz De Contexto</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.impl.RaizDeContextoImpl
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getRaizDeContexto()
	 * @generated
	 */
  int RAIZ_DE_CONTEXTO = 14;

  /**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RAIZ_DE_CONTEXTO__NOME = CONTEXTO__NOME;

  /**
	 * The feature id for the '<em><b>Caracteristicas Incluir</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RAIZ_DE_CONTEXTO__CARACTERISTICAS_INCLUIR = CONTEXTO__CARACTERISTICAS_INCLUIR;

  /**
	 * The feature id for the '<em><b>Caracteristicas Excluir</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RAIZ_DE_CONTEXTO__CARACTERISTICAS_EXCLUIR = CONTEXTO__CARACTERISTICAS_EXCLUIR;

  /**
	 * The feature id for the '<em><b>Entidades De Contexto</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RAIZ_DE_CONTEXTO__ENTIDADES_DE_CONTEXTO = CONTEXTO_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Raiz De Contexto</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RAIZ_DE_CONTEXTO_FEATURE_COUNT = CONTEXTO_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link caracteristica.impl.EntidadeDeContextoImpl <em>Entidade De Contexto</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.impl.EntidadeDeContextoImpl
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getEntidadeDeContexto()
	 * @generated
	 */
  int ENTIDADE_DE_CONTEXTO = 15;

  /**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ENTIDADE_DE_CONTEXTO__NOME = CONTEXTO__NOME;

  /**
	 * The feature id for the '<em><b>Caracteristicas Incluir</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ENTIDADE_DE_CONTEXTO__CARACTERISTICAS_INCLUIR = CONTEXTO__CARACTERISTICAS_INCLUIR;

  /**
	 * The feature id for the '<em><b>Caracteristicas Excluir</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ENTIDADE_DE_CONTEXTO__CARACTERISTICAS_EXCLUIR = CONTEXTO__CARACTERISTICAS_EXCLUIR;

  /**
	 * The feature id for the '<em><b>Raiz</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ENTIDADE_DE_CONTEXTO__RAIZ = CONTEXTO_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Informacoes De Contexto</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ENTIDADE_DE_CONTEXTO__INFORMACOES_DE_CONTEXTO = CONTEXTO_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Entidade De Contexto</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ENTIDADE_DE_CONTEXTO_FEATURE_COUNT = CONTEXTO_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link caracteristica.impl.InformacaoDeContextoImpl <em>Informacao De Contexto</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.impl.InformacaoDeContextoImpl
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getInformacaoDeContexto()
	 * @generated
	 */
  int INFORMACAO_DE_CONTEXTO = 16;

  /**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INFORMACAO_DE_CONTEXTO__NOME = CONTEXTO__NOME;

  /**
	 * The feature id for the '<em><b>Caracteristicas Incluir</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INFORMACAO_DE_CONTEXTO__CARACTERISTICAS_INCLUIR = CONTEXTO__CARACTERISTICAS_INCLUIR;

  /**
	 * The feature id for the '<em><b>Caracteristicas Excluir</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INFORMACAO_DE_CONTEXTO__CARACTERISTICAS_EXCLUIR = CONTEXTO__CARACTERISTICAS_EXCLUIR;

  /**
	 * The feature id for the '<em><b>Elemento Pai</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INFORMACAO_DE_CONTEXTO__ELEMENTO_PAI = CONTEXTO_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Informacao De Contexto</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INFORMACAO_DE_CONTEXTO_FEATURE_COUNT = CONTEXTO_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link caracteristica.impl.RegraImpl <em>Regra</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.impl.RegraImpl
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getRegra()
	 * @generated
	 */
  int REGRA = 17;

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
  int REGRA_DE_COMPOSICAO = 18;

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
	 * The meta object id for the '{@link caracteristica.impl.ExpressaoImpl <em>Expressao</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.impl.ExpressaoImpl
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getExpressao()
	 * @generated
	 */
  int EXPRESSAO = 19;

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
	 * The meta object id for the '{@link caracteristica.impl.AntecedenteImpl <em>Antecedente</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.impl.AntecedenteImpl
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getAntecedente()
	 * @generated
	 */
  int ANTECEDENTE = 20;

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
  int EXPRESSAO_LOGICA = 21;

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
  int EXPRESSAO_RELACIONAL = 22;

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
  int LITERAL_COMPOSICAO = 23;

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
	 * The meta object id for the '{@link caracteristica.Origem <em>Origem</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.Origem
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getOrigem()
	 * @generated
	 */
  int ORIGEM = 24;

  /**
	 * The meta object id for the '{@link caracteristica.Validade <em>Validade</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.Validade
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getValidade()
	 * @generated
	 */
  int VALIDADE = 25;

  /**
	 * The meta object id for the '{@link caracteristica.Qualidade <em>Qualidade</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.Qualidade
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getQualidade()
	 * @generated
	 */
  int QUALIDADE = 26;

  /**
	 * The meta object id for the '{@link caracteristica.TipoValor <em>Tipo Valor</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.TipoValor
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getTipoValor()
	 * @generated
	 */
  int TIPO_VALOR = 27;

  /**
	 * The meta object id for the '{@link caracteristica.OperadorLogico <em>Operador Logico</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.OperadorLogico
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getOperadorLogico()
	 * @generated
	 */
  int OPERADOR_LOGICO = 28;

  /**
	 * The meta object id for the '{@link caracteristica.OperadorAcaoLogico <em>Operador Acao Logico</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.OperadorAcaoLogico
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getOperadorAcaoLogico()
	 * @generated
	 */
  int OPERADOR_ACAO_LOGICO = 29;

  /**
	 * The meta object id for the '{@link caracteristica.CardinalidadeMaxima <em>Cardinalidade Maxima</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.CardinalidadeMaxima
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getCardinalidadeMaxima()
	 * @generated
	 */
  int CARDINALIDADE_MAXIMA = 30;

  /**
	 * The meta object id for the '{@link caracteristica.OperadorRelacional <em>Operador Relacional</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.OperadorRelacional
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getOperadorRelacional()
	 * @generated
	 */
  int OPERADOR_RELACIONAL = 31;

  /**
	 * The meta object id for the '{@link caracteristica.Presenca <em>Presenca</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see caracteristica.Presenca
	 * @see caracteristica.impl.CaracteristicaPackageImpl#getPresenca()
	 * @generated
	 */
  int PRESENCA = 32;


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
	 * Returns the meta object for class '{@link caracteristica.Contexto <em>Contexto</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contexto</em>'.
	 * @see caracteristica.Contexto
	 * @generated
	 */
  EClass getContexto();

  /**
	 * Returns the meta object for the reference list '{@link caracteristica.Contexto#getCaracteristicasIncluir <em>Caracteristicas Incluir</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Caracteristicas Incluir</em>'.
	 * @see caracteristica.Contexto#getCaracteristicasIncluir()
	 * @see #getContexto()
	 * @generated
	 */
  EReference getContexto_CaracteristicasIncluir();

  /**
	 * Returns the meta object for the reference list '{@link caracteristica.Contexto#getCaracteristicasExcluir <em>Caracteristicas Excluir</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Caracteristicas Excluir</em>'.
	 * @see caracteristica.Contexto#getCaracteristicasExcluir()
	 * @see #getContexto()
	 * @generated
	 */
  EReference getContexto_CaracteristicasExcluir();

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
		 * The meta object literal for the '<em><b>Expressoes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference LPS__EXPRESSOES = eINSTANCE.getLPS_Expressoes();

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
		 * The meta object literal for the '{@link caracteristica.impl.ContextoImpl <em>Contexto</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see caracteristica.impl.ContextoImpl
		 * @see caracteristica.impl.CaracteristicaPackageImpl#getContexto()
		 * @generated
		 */
    EClass CONTEXTO = eINSTANCE.getContexto();

    /**
		 * The meta object literal for the '<em><b>Caracteristicas Incluir</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference CONTEXTO__CARACTERISTICAS_INCLUIR = eINSTANCE.getContexto_CaracteristicasIncluir();

    /**
		 * The meta object literal for the '<em><b>Caracteristicas Excluir</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference CONTEXTO__CARACTERISTICAS_EXCLUIR = eINSTANCE.getContexto_CaracteristicasExcluir();

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
		 * The meta object literal for the '<em><b>Elemento Pai</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference INFORMACAO_DE_CONTEXTO__ELEMENTO_PAI = eINSTANCE.getInformacaoDeContexto_ElementoPai();

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
