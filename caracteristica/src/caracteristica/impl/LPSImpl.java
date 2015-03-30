/**
 */
package caracteristica.impl;

import caracteristica.Atributo;
import caracteristica.CaracteristicaPackage;
import caracteristica.CaracteristicaRaiz;
import caracteristica.Elemento;
import caracteristica.ElementoDeProduto;
import caracteristica.ElementoDeProduto;
import caracteristica.ElementoExterno;
import caracteristica.Expressao;
import caracteristica.InconsistenciaRegraAdaptacao;
import caracteristica.LPS;
import caracteristica.PontoDeVariacao;
import caracteristica.PontoDeVariacao;
import caracteristica.Produto;
import caracteristica.Regra;
import caracteristica.Simulacao;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LPS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link caracteristica.impl.LPSImpl#getPontosDeVariacao <em>Pontos De Variacao</em>}</li>
 *   <li>{@link caracteristica.impl.LPSImpl#getElementos <em>Elementos</em>}</li>
 *   <li>{@link caracteristica.impl.LPSImpl#getExternos <em>Externos</em>}</li>
 *   <li>{@link caracteristica.impl.LPSImpl#getRegras <em>Regras</em>}</li>
 *   <li>{@link caracteristica.impl.LPSImpl#getProdutos <em>Produtos</em>}</li>
 *   <li>{@link caracteristica.impl.LPSImpl#getExpressoes <em>Expressoes</em>}</li>
 *   <li>{@link caracteristica.impl.LPSImpl#getElementosDeProduto <em>Elementos De Produto</em>}</li>
 *   <li>{@link caracteristica.impl.LPSImpl#getSistema <em>Sistema</em>}</li>
 *   <li>{@link caracteristica.impl.LPSImpl#getAtributos <em>Atributos</em>}</li>
 *   <li>{@link caracteristica.impl.LPSImpl#getValoresContextuais <em>Valores Contextuais</em>}</li>
 *   <li>{@link caracteristica.impl.LPSImpl#getSimulacoes <em>Simulacoes</em>}</li>
 *   <li>{@link caracteristica.impl.LPSImpl#getInconsistenciaERA <em>Inconsistencia ERA</em>}</li>
 *   <li>{@link caracteristica.impl.LPSImpl#getErro <em>Erro</em>}</li>
 *   <li>{@link caracteristica.impl.LPSImpl#getNome <em>Nome</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LPSImpl extends EObjectImpl implements LPS
{
  /**
	 * The cached value of the '{@link #getPontosDeVariacao() <em>Pontos De Variacao</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getPontosDeVariacao()
	 * @generated
	 * @ordered
	 */
  protected EList<PontoDeVariacao> pontosDeVariacao;

  /**
	 * The cached value of the '{@link #getElementos() <em>Elementos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getElementos()
	 * @generated
	 * @ordered
	 */
  protected EList<Elemento> elementos;

  /**
	 * The cached value of the '{@link #getExternos() <em>Externos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getExternos()
	 * @generated
	 * @ordered
	 */
  protected EList<ElementoExterno> externos;

  /**
	 * The cached value of the '{@link #getRegras() <em>Regras</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRegras()
	 * @generated
	 * @ordered
	 */
  protected EList<Regra> regras;

  /**
	 * The cached value of the '{@link #getProdutos() <em>Produtos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getProdutos()
	 * @generated
	 * @ordered
	 */
  protected EList<Produto> produtos;

  /**
	 * The cached value of the '{@link #getExpressoes() <em>Expressoes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getExpressoes()
	 * @generated
	 * @ordered
	 */
  protected EList<Expressao> expressoes;

  /**
	 * The cached value of the '{@link #getElementosDeProduto() <em>Elementos De Produto</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getElementosDeProduto()
	 * @generated
	 * @ordered
	 */
  protected EList<ElementoDeProduto> elementosDeProduto;

  /**
	 * The cached value of the '{@link #getSistema() <em>Sistema</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSistema()
	 * @generated
	 * @ordered
	 */
  protected CaracteristicaRaiz sistema;

  /**
	 * The cached value of the '{@link #getAtributos() <em>Atributos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAtributos()
	 * @generated
	 * @ordered
	 */
  protected EList<Atributo> atributos;

  /**
	 * The cached value of the '{@link #getValoresContextuais() <em>Valores Contextuais</em>}' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getValoresContextuais()
	 * @generated
	 * @ordered
	 */
  protected EList<String> valoresContextuais;

  /**
	 * The cached value of the '{@link #getSimulacoes() <em>Simulacoes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSimulacoes()
	 * @generated
	 * @ordered
	 */
  protected EList<Simulacao> simulacoes;

  /**
	 * The cached value of the '{@link #getInconsistenciaERA() <em>Inconsistencia ERA</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getInconsistenciaERA()
	 * @generated
	 * @ordered
	 */
  protected EList<InconsistenciaRegraAdaptacao> inconsistenciaERA;

  /**
	 * The cached value of the '{@link #getErro() <em>Erro</em>}' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getErro()
	 * @generated
	 * @ordered
	 */
  protected EList<Boolean> erro;

  /**
	 * The default value of the '{@link #getNome() <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getNome()
	 * @generated
	 * @ordered
	 */
  protected static final String NOME_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getNome() <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getNome()
	 * @generated
	 * @ordered
	 */
  protected String nome = NOME_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected LPSImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return CaracteristicaPackage.Literals.LPS;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<PontoDeVariacao> getPontosDeVariacao()
  {
		if (pontosDeVariacao == null) {
			pontosDeVariacao = new EObjectContainmentEList<PontoDeVariacao>(PontoDeVariacao.class, this, CaracteristicaPackage.LPS__PONTOS_DE_VARIACAO);
		}
		return pontosDeVariacao;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Elemento> getElementos()
  {
		if (elementos == null) {
			elementos = new EObjectContainmentEList<Elemento>(Elemento.class, this, CaracteristicaPackage.LPS__ELEMENTOS);
		}
		return elementos;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<ElementoExterno> getExternos()
  {
		if (externos == null) {
			externos = new EObjectContainmentEList<ElementoExterno>(ElementoExterno.class, this, CaracteristicaPackage.LPS__EXTERNOS);
		}
		return externos;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Regra> getRegras()
  {
		if (regras == null) {
			regras = new EObjectContainmentEList<Regra>(Regra.class, this, CaracteristicaPackage.LPS__REGRAS);
		}
		return regras;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Produto> getProdutos()
  {
		if (produtos == null) {
			produtos = new EObjectContainmentEList<Produto>(Produto.class, this, CaracteristicaPackage.LPS__PRODUTOS);
		}
		return produtos;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Expressao> getExpressoes()
  {
		if (expressoes == null) {
			expressoes = new EObjectContainmentEList<Expressao>(Expressao.class, this, CaracteristicaPackage.LPS__EXPRESSOES);
		}
		return expressoes;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<ElementoDeProduto> getElementosDeProduto()
  {
		if (elementosDeProduto == null) {
			elementosDeProduto = new EObjectContainmentEList<ElementoDeProduto>(ElementoDeProduto.class, this, CaracteristicaPackage.LPS__ELEMENTOS_DE_PRODUTO);
		}
		return elementosDeProduto;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public CaracteristicaRaiz getSistema()
  {
		if (sistema != null && sistema.eIsProxy()) {
			InternalEObject oldSistema = (InternalEObject)sistema;
			sistema = (CaracteristicaRaiz)eResolveProxy(oldSistema);
			if (sistema != oldSistema) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CaracteristicaPackage.LPS__SISTEMA, oldSistema, sistema));
			}
		}
		return sistema;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public CaracteristicaRaiz basicGetSistema()
  {
		return sistema;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetSistema(CaracteristicaRaiz newSistema, NotificationChain msgs)
  {
		CaracteristicaRaiz oldSistema = sistema;
		sistema = newSistema;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.LPS__SISTEMA, oldSistema, newSistema);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setSistema(CaracteristicaRaiz newSistema)
  {
		if (newSistema != sistema) {
			NotificationChain msgs = null;
			if (sistema != null)
				msgs = ((InternalEObject)sistema).eInverseRemove(this, CaracteristicaPackage.CARACTERISTICA_RAIZ__LPS_DO_SISTEMA, CaracteristicaRaiz.class, msgs);
			if (newSistema != null)
				msgs = ((InternalEObject)newSistema).eInverseAdd(this, CaracteristicaPackage.CARACTERISTICA_RAIZ__LPS_DO_SISTEMA, CaracteristicaRaiz.class, msgs);
			msgs = basicSetSistema(newSistema, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.LPS__SISTEMA, newSistema, newSistema));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Atributo> getAtributos()
  {
		if (atributos == null) {
			atributos = new EObjectContainmentEList<Atributo>(Atributo.class, this, CaracteristicaPackage.LPS__ATRIBUTOS);
		}
		return atributos;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<String> getValoresContextuais()
  {
		if (valoresContextuais == null) {
			valoresContextuais = new EDataTypeUniqueEList<String>(String.class, this, CaracteristicaPackage.LPS__VALORES_CONTEXTUAIS);
		}
		return valoresContextuais;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Simulacao> getSimulacoes()
  {
		if (simulacoes == null) {
			simulacoes = new EObjectContainmentEList<Simulacao>(Simulacao.class, this, CaracteristicaPackage.LPS__SIMULACOES);
		}
		return simulacoes;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<InconsistenciaRegraAdaptacao> getInconsistenciaERA()
  {
		if (inconsistenciaERA == null) {
			inconsistenciaERA = new EObjectContainmentEList<InconsistenciaRegraAdaptacao>(InconsistenciaRegraAdaptacao.class, this, CaracteristicaPackage.LPS__INCONSISTENCIA_ERA);
		}
		return inconsistenciaERA;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Boolean> getErro()
  {
		if (erro == null) {
			erro = new EDataTypeUniqueEList<Boolean>(Boolean.class, this, CaracteristicaPackage.LPS__ERRO);
		}
		return erro;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getNome()
  {
		return nome;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setNome(String newNome)
  {
		String oldNome = nome;
		nome = newNome;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.LPS__NOME, oldNome, nome));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case CaracteristicaPackage.LPS__SISTEMA:
				if (sistema != null)
					msgs = ((InternalEObject)sistema).eInverseRemove(this, CaracteristicaPackage.CARACTERISTICA_RAIZ__LPS_DO_SISTEMA, CaracteristicaRaiz.class, msgs);
				return basicSetSistema((CaracteristicaRaiz)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case CaracteristicaPackage.LPS__PONTOS_DE_VARIACAO:
				return ((InternalEList<?>)getPontosDeVariacao()).basicRemove(otherEnd, msgs);
			case CaracteristicaPackage.LPS__ELEMENTOS:
				return ((InternalEList<?>)getElementos()).basicRemove(otherEnd, msgs);
			case CaracteristicaPackage.LPS__EXTERNOS:
				return ((InternalEList<?>)getExternos()).basicRemove(otherEnd, msgs);
			case CaracteristicaPackage.LPS__REGRAS:
				return ((InternalEList<?>)getRegras()).basicRemove(otherEnd, msgs);
			case CaracteristicaPackage.LPS__PRODUTOS:
				return ((InternalEList<?>)getProdutos()).basicRemove(otherEnd, msgs);
			case CaracteristicaPackage.LPS__EXPRESSOES:
				return ((InternalEList<?>)getExpressoes()).basicRemove(otherEnd, msgs);
			case CaracteristicaPackage.LPS__ELEMENTOS_DE_PRODUTO:
				return ((InternalEList<?>)getElementosDeProduto()).basicRemove(otherEnd, msgs);
			case CaracteristicaPackage.LPS__SISTEMA:
				return basicSetSistema(null, msgs);
			case CaracteristicaPackage.LPS__ATRIBUTOS:
				return ((InternalEList<?>)getAtributos()).basicRemove(otherEnd, msgs);
			case CaracteristicaPackage.LPS__SIMULACOES:
				return ((InternalEList<?>)getSimulacoes()).basicRemove(otherEnd, msgs);
			case CaracteristicaPackage.LPS__INCONSISTENCIA_ERA:
				return ((InternalEList<?>)getInconsistenciaERA()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case CaracteristicaPackage.LPS__PONTOS_DE_VARIACAO:
				return getPontosDeVariacao();
			case CaracteristicaPackage.LPS__ELEMENTOS:
				return getElementos();
			case CaracteristicaPackage.LPS__EXTERNOS:
				return getExternos();
			case CaracteristicaPackage.LPS__REGRAS:
				return getRegras();
			case CaracteristicaPackage.LPS__PRODUTOS:
				return getProdutos();
			case CaracteristicaPackage.LPS__EXPRESSOES:
				return getExpressoes();
			case CaracteristicaPackage.LPS__ELEMENTOS_DE_PRODUTO:
				return getElementosDeProduto();
			case CaracteristicaPackage.LPS__SISTEMA:
				if (resolve) return getSistema();
				return basicGetSistema();
			case CaracteristicaPackage.LPS__ATRIBUTOS:
				return getAtributos();
			case CaracteristicaPackage.LPS__VALORES_CONTEXTUAIS:
				return getValoresContextuais();
			case CaracteristicaPackage.LPS__SIMULACOES:
				return getSimulacoes();
			case CaracteristicaPackage.LPS__INCONSISTENCIA_ERA:
				return getInconsistenciaERA();
			case CaracteristicaPackage.LPS__ERRO:
				return getErro();
			case CaracteristicaPackage.LPS__NOME:
				return getNome();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case CaracteristicaPackage.LPS__PONTOS_DE_VARIACAO:
				getPontosDeVariacao().clear();
				getPontosDeVariacao().addAll((Collection<? extends PontoDeVariacao>)newValue);
				return;
			case CaracteristicaPackage.LPS__ELEMENTOS:
				getElementos().clear();
				getElementos().addAll((Collection<? extends Elemento>)newValue);
				return;
			case CaracteristicaPackage.LPS__EXTERNOS:
				getExternos().clear();
				getExternos().addAll((Collection<? extends ElementoExterno>)newValue);
				return;
			case CaracteristicaPackage.LPS__REGRAS:
				getRegras().clear();
				getRegras().addAll((Collection<? extends Regra>)newValue);
				return;
			case CaracteristicaPackage.LPS__PRODUTOS:
				getProdutos().clear();
				getProdutos().addAll((Collection<? extends Produto>)newValue);
				return;
			case CaracteristicaPackage.LPS__EXPRESSOES:
				getExpressoes().clear();
				getExpressoes().addAll((Collection<? extends Expressao>)newValue);
				return;
			case CaracteristicaPackage.LPS__ELEMENTOS_DE_PRODUTO:
				getElementosDeProduto().clear();
				getElementosDeProduto().addAll((Collection<? extends ElementoDeProduto>)newValue);
				return;
			case CaracteristicaPackage.LPS__SISTEMA:
				setSistema((CaracteristicaRaiz)newValue);
				return;
			case CaracteristicaPackage.LPS__ATRIBUTOS:
				getAtributos().clear();
				getAtributos().addAll((Collection<? extends Atributo>)newValue);
				return;
			case CaracteristicaPackage.LPS__VALORES_CONTEXTUAIS:
				getValoresContextuais().clear();
				getValoresContextuais().addAll((Collection<? extends String>)newValue);
				return;
			case CaracteristicaPackage.LPS__SIMULACOES:
				getSimulacoes().clear();
				getSimulacoes().addAll((Collection<? extends Simulacao>)newValue);
				return;
			case CaracteristicaPackage.LPS__INCONSISTENCIA_ERA:
				getInconsistenciaERA().clear();
				getInconsistenciaERA().addAll((Collection<? extends InconsistenciaRegraAdaptacao>)newValue);
				return;
			case CaracteristicaPackage.LPS__ERRO:
				getErro().clear();
				getErro().addAll((Collection<? extends Boolean>)newValue);
				return;
			case CaracteristicaPackage.LPS__NOME:
				setNome((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eUnset(int featureID)
  {
		switch (featureID) {
			case CaracteristicaPackage.LPS__PONTOS_DE_VARIACAO:
				getPontosDeVariacao().clear();
				return;
			case CaracteristicaPackage.LPS__ELEMENTOS:
				getElementos().clear();
				return;
			case CaracteristicaPackage.LPS__EXTERNOS:
				getExternos().clear();
				return;
			case CaracteristicaPackage.LPS__REGRAS:
				getRegras().clear();
				return;
			case CaracteristicaPackage.LPS__PRODUTOS:
				getProdutos().clear();
				return;
			case CaracteristicaPackage.LPS__EXPRESSOES:
				getExpressoes().clear();
				return;
			case CaracteristicaPackage.LPS__ELEMENTOS_DE_PRODUTO:
				getElementosDeProduto().clear();
				return;
			case CaracteristicaPackage.LPS__SISTEMA:
				setSistema((CaracteristicaRaiz)null);
				return;
			case CaracteristicaPackage.LPS__ATRIBUTOS:
				getAtributos().clear();
				return;
			case CaracteristicaPackage.LPS__VALORES_CONTEXTUAIS:
				getValoresContextuais().clear();
				return;
			case CaracteristicaPackage.LPS__SIMULACOES:
				getSimulacoes().clear();
				return;
			case CaracteristicaPackage.LPS__INCONSISTENCIA_ERA:
				getInconsistenciaERA().clear();
				return;
			case CaracteristicaPackage.LPS__ERRO:
				getErro().clear();
				return;
			case CaracteristicaPackage.LPS__NOME:
				setNome(NOME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case CaracteristicaPackage.LPS__PONTOS_DE_VARIACAO:
				return pontosDeVariacao != null && !pontosDeVariacao.isEmpty();
			case CaracteristicaPackage.LPS__ELEMENTOS:
				return elementos != null && !elementos.isEmpty();
			case CaracteristicaPackage.LPS__EXTERNOS:
				return externos != null && !externos.isEmpty();
			case CaracteristicaPackage.LPS__REGRAS:
				return regras != null && !regras.isEmpty();
			case CaracteristicaPackage.LPS__PRODUTOS:
				return produtos != null && !produtos.isEmpty();
			case CaracteristicaPackage.LPS__EXPRESSOES:
				return expressoes != null && !expressoes.isEmpty();
			case CaracteristicaPackage.LPS__ELEMENTOS_DE_PRODUTO:
				return elementosDeProduto != null && !elementosDeProduto.isEmpty();
			case CaracteristicaPackage.LPS__SISTEMA:
				return sistema != null;
			case CaracteristicaPackage.LPS__ATRIBUTOS:
				return atributos != null && !atributos.isEmpty();
			case CaracteristicaPackage.LPS__VALORES_CONTEXTUAIS:
				return valoresContextuais != null && !valoresContextuais.isEmpty();
			case CaracteristicaPackage.LPS__SIMULACOES:
				return simulacoes != null && !simulacoes.isEmpty();
			case CaracteristicaPackage.LPS__INCONSISTENCIA_ERA:
				return inconsistenciaERA != null && !inconsistenciaERA.isEmpty();
			case CaracteristicaPackage.LPS__ERRO:
				return erro != null && !erro.isEmpty();
			case CaracteristicaPackage.LPS__NOME:
				return NOME_EDEFAULT == null ? nome != null : !NOME_EDEFAULT.equals(nome);
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString()
  {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (valoresContextuais: ");
		result.append(valoresContextuais);
		result.append(", erro: ");
		result.append(erro);
		result.append(", nome: ");
		result.append(nome);
		result.append(')');
		return result.toString();
	}

} //LPSImpl
