/**
 */
package caracteristica;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LPS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link caracteristica.LPS#getPontosDeVariacao <em>Pontos De Variacao</em>}</li>
 *   <li>{@link caracteristica.LPS#getElementos <em>Elementos</em>}</li>
 *   <li>{@link caracteristica.LPS#getExternos <em>Externos</em>}</li>
 *   <li>{@link caracteristica.LPS#getRegras <em>Regras</em>}</li>
 *   <li>{@link caracteristica.LPS#getProdutos <em>Produtos</em>}</li>
 *   <li>{@link caracteristica.LPS#getExpressoes <em>Expressoes</em>}</li>
 *   <li>{@link caracteristica.LPS#getElementosDeProduto <em>Elementos De Produto</em>}</li>
 *   <li>{@link caracteristica.LPS#getSistema <em>Sistema</em>}</li>
 *   <li>{@link caracteristica.LPS#getAtributos <em>Atributos</em>}</li>
 *   <li>{@link caracteristica.LPS#getValoresContextuais <em>Valores Contextuais</em>}</li>
 *   <li>{@link caracteristica.LPS#getSimulacoes <em>Simulacoes</em>}</li>
 *   <li>{@link caracteristica.LPS#getInconsistenciaERA <em>Inconsistencia ERA</em>}</li>
 *   <li>{@link caracteristica.LPS#getErro <em>Erro</em>}</li>
 *   <li>{@link caracteristica.LPS#getNome <em>Nome</em>}</li>
 * </ul>
 *
 * @see caracteristica.CaracteristicaPackage#getLPS()
 * @model annotation="gmf.diagram foo='bar'"
 * @generated
 */
public interface LPS extends EObject
{
  /**
	 * Returns the value of the '<em><b>Pontos De Variacao</b></em>' containment reference list.
	 * The list contents are of type {@link caracteristica.PontoDeVariacao}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pontos De Variacao</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Pontos De Variacao</em>' containment reference list.
	 * @see caracteristica.CaracteristicaPackage#getLPS_PontosDeVariacao()
	 * @model containment="true"
	 * @generated
	 */
  EList<PontoDeVariacao> getPontosDeVariacao();

  /**
	 * Returns the value of the '<em><b>Elementos</b></em>' containment reference list.
	 * The list contents are of type {@link caracteristica.Elemento}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elementos</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Elementos</em>' containment reference list.
	 * @see caracteristica.CaracteristicaPackage#getLPS_Elementos()
	 * @model containment="true"
	 * @generated
	 */
  EList<Elemento> getElementos();

  /**
	 * Returns the value of the '<em><b>Externos</b></em>' containment reference list.
	 * The list contents are of type {@link caracteristica.ElementoExterno}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Externos</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Externos</em>' containment reference list.
	 * @see caracteristica.CaracteristicaPackage#getLPS_Externos()
	 * @model containment="true"
	 * @generated
	 */
  EList<ElementoExterno> getExternos();

  /**
	 * Returns the value of the '<em><b>Regras</b></em>' containment reference list.
	 * The list contents are of type {@link caracteristica.Regra}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Regras</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Regras</em>' containment reference list.
	 * @see caracteristica.CaracteristicaPackage#getLPS_Regras()
	 * @model containment="true"
	 * @generated
	 */
  EList<Regra> getRegras();

  /**
	 * Returns the value of the '<em><b>Produtos</b></em>' containment reference list.
	 * The list contents are of type {@link caracteristica.Produto}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Produtos</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Produtos</em>' containment reference list.
	 * @see caracteristica.CaracteristicaPackage#getLPS_Produtos()
	 * @model containment="true"
	 * @generated
	 */
  EList<Produto> getProdutos();

  /**
	 * Returns the value of the '<em><b>Expressoes</b></em>' containment reference list.
	 * The list contents are of type {@link caracteristica.Expressao}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expressoes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressoes</em>' containment reference list.
	 * @see caracteristica.CaracteristicaPackage#getLPS_Expressoes()
	 * @model containment="true"
	 * @generated
	 */
  EList<Expressao> getExpressoes();

  /**
	 * Returns the value of the '<em><b>Elementos De Produto</b></em>' containment reference list.
	 * The list contents are of type {@link caracteristica.ElementoDeProduto}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elementos De Produto</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Elementos De Produto</em>' containment reference list.
	 * @see caracteristica.CaracteristicaPackage#getLPS_ElementosDeProduto()
	 * @model containment="true"
	 * @generated
	 */
  EList<ElementoDeProduto> getElementosDeProduto();

  /**
	 * Returns the value of the '<em><b>Sistema</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link caracteristica.CaracteristicaRaiz#getLpsDoSistema <em>Lps Do Sistema</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sistema</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Sistema</em>' reference.
	 * @see #setSistema(CaracteristicaRaiz)
	 * @see caracteristica.CaracteristicaPackage#getLPS_Sistema()
	 * @see caracteristica.CaracteristicaRaiz#getLpsDoSistema
	 * @model opposite="LpsDoSistema"
	 * @generated
	 */
  CaracteristicaRaiz getSistema();

  /**
	 * Sets the value of the '{@link caracteristica.LPS#getSistema <em>Sistema</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sistema</em>' reference.
	 * @see #getSistema()
	 * @generated
	 */
  void setSistema(CaracteristicaRaiz value);

  /**
	 * Returns the value of the '<em><b>Atributos</b></em>' containment reference list.
	 * The list contents are of type {@link caracteristica.Atributo}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Atributos</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Atributos</em>' containment reference list.
	 * @see caracteristica.CaracteristicaPackage#getLPS_Atributos()
	 * @model containment="true"
	 * @generated
	 */
  EList<Atributo> getAtributos();

  /**
	 * Returns the value of the '<em><b>Valores Contextuais</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Valores Contextuais</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Valores Contextuais</em>' attribute list.
	 * @see caracteristica.CaracteristicaPackage#getLPS_ValoresContextuais()
	 * @model
	 * @generated
	 */
  EList<String> getValoresContextuais();

  /**
	 * Returns the value of the '<em><b>Simulacoes</b></em>' containment reference list.
	 * The list contents are of type {@link caracteristica.Simulacao}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Simulacoes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Simulacoes</em>' containment reference list.
	 * @see caracteristica.CaracteristicaPackage#getLPS_Simulacoes()
	 * @model containment="true"
	 * @generated
	 */
  EList<Simulacao> getSimulacoes();

  /**
	 * Returns the value of the '<em><b>Inconsistencia ERA</b></em>' containment reference list.
	 * The list contents are of type {@link caracteristica.InconsistenciaRegraAdaptacao}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inconsistencia ERA</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Inconsistencia ERA</em>' containment reference list.
	 * @see caracteristica.CaracteristicaPackage#getLPS_InconsistenciaERA()
	 * @model containment="true"
	 * @generated
	 */
  EList<InconsistenciaRegraAdaptacao> getInconsistenciaERA();

  /**
	 * Returns the value of the '<em><b>Erro</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Boolean}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Erro</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Erro</em>' attribute list.
	 * @see caracteristica.CaracteristicaPackage#getLPS_Erro()
	 * @model
	 * @generated
	 */
  EList<Boolean> getErro();

  /**
	 * Returns the value of the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nome</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Nome</em>' attribute.
	 * @see #setNome(String)
	 * @see caracteristica.CaracteristicaPackage#getLPS_Nome()
	 * @model
	 * @generated
	 */
  String getNome();

  /**
	 * Sets the value of the '{@link caracteristica.LPS#getNome <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nome</em>' attribute.
	 * @see #getNome()
	 * @generated
	 */
  void setNome(String value);

} // LPS
