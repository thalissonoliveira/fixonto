/**
 */
package caracteristica.impl;

import caracteristica.CaracteristicaPackage;
import caracteristica.EntidadeDeContexto;
import caracteristica.InformacaoDeContexto;
import caracteristica.Origem;
import caracteristica.Qualidade;
import caracteristica.TipoValor;
import caracteristica.Validade;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Informacaode Contexto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link caracteristica.impl.InformacaoDeContextoImpl#getOrigem <em>Origem</em>}</li>
 *   <li>{@link caracteristica.impl.InformacaoDeContextoImpl#getValidade <em>Validade</em>}</li>
 *   <li>{@link caracteristica.impl.InformacaoDeContextoImpl#getQualidade <em>Qualidade</em>}</li>
 *   <li>{@link caracteristica.impl.InformacaoDeContextoImpl#getTipoValor <em>Tipo Valor</em>}</li>
 *   <li>{@link caracteristica.impl.InformacaoDeContextoImpl#getValor <em>Valor</em>}</li>
 *   <li>{@link caracteristica.impl.InformacaoDeContextoImpl#getElementoPai <em>Elemento Pai</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InformacaoDeContextoImpl extends ElementoImpl implements InformacaoDeContexto
{
  /**
	 * The default value of the '{@link #getOrigem() <em>Origem</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getOrigem()
	 * @generated
	 * @ordered
	 */
  protected static final Origem ORIGEM_EDEFAULT = Origem.SENTIDA;

  /**
	 * The cached value of the '{@link #getOrigem() <em>Origem</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getOrigem()
	 * @generated
	 * @ordered
	 */
  protected Origem origem = ORIGEM_EDEFAULT;

  /**
	 * The default value of the '{@link #getValidade() <em>Validade</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getValidade()
	 * @generated
	 * @ordered
	 */
  protected static final Validade VALIDADE_EDEFAULT = Validade.VOLATIL;

  /**
	 * The cached value of the '{@link #getValidade() <em>Validade</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getValidade()
	 * @generated
	 * @ordered
	 */
  protected Validade validade = VALIDADE_EDEFAULT;

  /**
	 * The default value of the '{@link #getQualidade() <em>Qualidade</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getQualidade()
	 * @generated
	 * @ordered
	 */
  protected static final Qualidade QUALIDADE_EDEFAULT = Qualidade.BAIXO;

  /**
	 * The cached value of the '{@link #getQualidade() <em>Qualidade</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getQualidade()
	 * @generated
	 * @ordered
	 */
  protected Qualidade qualidade = QUALIDADE_EDEFAULT;

  /**
	 * The default value of the '{@link #getTipoValor() <em>Tipo Valor</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTipoValor()
	 * @generated
	 * @ordered
	 */
  protected static final TipoValor TIPO_VALOR_EDEFAULT = TipoValor.TINTEGER;

  /**
	 * The cached value of the '{@link #getTipoValor() <em>Tipo Valor</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTipoValor()
	 * @generated
	 * @ordered
	 */
  protected TipoValor tipoValor = TIPO_VALOR_EDEFAULT;

  /**
	 * The default value of the '{@link #getValor() <em>Valor</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getValor()
	 * @generated
	 * @ordered
	 */
  protected static final String VALOR_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getValor() <em>Valor</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getValor()
	 * @generated
	 * @ordered
	 */
  protected String valor = VALOR_EDEFAULT;

  /**
	 * The cached value of the '{@link #getElementoPai() <em>Elemento Pai</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getElementoPai()
	 * @generated
	 * @ordered
	 */
  protected EntidadeDeContexto elementoPai;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected InformacaoDeContextoImpl()
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
		return CaracteristicaPackage.Literals.INFORMACAO_DE_CONTEXTO;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Origem getOrigem()
  {
		return origem;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setOrigem(Origem newOrigem)
  {
		Origem oldOrigem = origem;
		origem = newOrigem == null ? ORIGEM_EDEFAULT : newOrigem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.INFORMACAO_DE_CONTEXTO__ORIGEM, oldOrigem, origem));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Validade getValidade()
  {
		return validade;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setValidade(Validade newValidade)
  {
		Validade oldValidade = validade;
		validade = newValidade == null ? VALIDADE_EDEFAULT : newValidade;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.INFORMACAO_DE_CONTEXTO__VALIDADE, oldValidade, validade));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Qualidade getQualidade()
  {
		return qualidade;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setQualidade(Qualidade newQualidade)
  {
		Qualidade oldQualidade = qualidade;
		qualidade = newQualidade == null ? QUALIDADE_EDEFAULT : newQualidade;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.INFORMACAO_DE_CONTEXTO__QUALIDADE, oldQualidade, qualidade));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TipoValor getTipoValor()
  {
		return tipoValor;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setTipoValor(TipoValor newTipoValor)
  {
		TipoValor oldTipoValor = tipoValor;
		tipoValor = newTipoValor == null ? TIPO_VALOR_EDEFAULT : newTipoValor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.INFORMACAO_DE_CONTEXTO__TIPO_VALOR, oldTipoValor, tipoValor));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getValor()
  {
		return valor;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setValor(String newValor)
  {
		String oldValor = valor;
		valor = newValor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.INFORMACAO_DE_CONTEXTO__VALOR, oldValor, valor));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EntidadeDeContexto getElementoPai()
  {
		if (elementoPai != null && elementoPai.eIsProxy()) {
			InternalEObject oldElementoPai = (InternalEObject)elementoPai;
			elementoPai = (EntidadeDeContexto)eResolveProxy(oldElementoPai);
			if (elementoPai != oldElementoPai) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CaracteristicaPackage.INFORMACAO_DE_CONTEXTO__ELEMENTO_PAI, oldElementoPai, elementoPai));
			}
		}
		return elementoPai;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EntidadeDeContexto basicGetElementoPai()
  {
		return elementoPai;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetElementoPai(EntidadeDeContexto newElementoPai, NotificationChain msgs)
  {
		EntidadeDeContexto oldElementoPai = elementoPai;
		elementoPai = newElementoPai;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.INFORMACAO_DE_CONTEXTO__ELEMENTO_PAI, oldElementoPai, newElementoPai);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setElementoPai(EntidadeDeContexto newElementoPai)
  {
		if (newElementoPai != elementoPai) {
			NotificationChain msgs = null;
			if (elementoPai != null)
				msgs = ((InternalEObject)elementoPai).eInverseRemove(this, CaracteristicaPackage.ENTIDADE_DE_CONTEXTO__INFORMACOES_DE_CONTEXTO, EntidadeDeContexto.class, msgs);
			if (newElementoPai != null)
				msgs = ((InternalEObject)newElementoPai).eInverseAdd(this, CaracteristicaPackage.ENTIDADE_DE_CONTEXTO__INFORMACOES_DE_CONTEXTO, EntidadeDeContexto.class, msgs);
			msgs = basicSetElementoPai(newElementoPai, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.INFORMACAO_DE_CONTEXTO__ELEMENTO_PAI, newElementoPai, newElementoPai));
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
			case CaracteristicaPackage.INFORMACAO_DE_CONTEXTO__ELEMENTO_PAI:
				if (elementoPai != null)
					msgs = ((InternalEObject)elementoPai).eInverseRemove(this, CaracteristicaPackage.ENTIDADE_DE_CONTEXTO__INFORMACOES_DE_CONTEXTO, EntidadeDeContexto.class, msgs);
				return basicSetElementoPai((EntidadeDeContexto)otherEnd, msgs);
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
			case CaracteristicaPackage.INFORMACAO_DE_CONTEXTO__ELEMENTO_PAI:
				return basicSetElementoPai(null, msgs);
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
			case CaracteristicaPackage.INFORMACAO_DE_CONTEXTO__ORIGEM:
				return getOrigem();
			case CaracteristicaPackage.INFORMACAO_DE_CONTEXTO__VALIDADE:
				return getValidade();
			case CaracteristicaPackage.INFORMACAO_DE_CONTEXTO__QUALIDADE:
				return getQualidade();
			case CaracteristicaPackage.INFORMACAO_DE_CONTEXTO__TIPO_VALOR:
				return getTipoValor();
			case CaracteristicaPackage.INFORMACAO_DE_CONTEXTO__VALOR:
				return getValor();
			case CaracteristicaPackage.INFORMACAO_DE_CONTEXTO__ELEMENTO_PAI:
				if (resolve) return getElementoPai();
				return basicGetElementoPai();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case CaracteristicaPackage.INFORMACAO_DE_CONTEXTO__ORIGEM:
				setOrigem((Origem)newValue);
				return;
			case CaracteristicaPackage.INFORMACAO_DE_CONTEXTO__VALIDADE:
				setValidade((Validade)newValue);
				return;
			case CaracteristicaPackage.INFORMACAO_DE_CONTEXTO__QUALIDADE:
				setQualidade((Qualidade)newValue);
				return;
			case CaracteristicaPackage.INFORMACAO_DE_CONTEXTO__TIPO_VALOR:
				setTipoValor((TipoValor)newValue);
				return;
			case CaracteristicaPackage.INFORMACAO_DE_CONTEXTO__VALOR:
				setValor((String)newValue);
				return;
			case CaracteristicaPackage.INFORMACAO_DE_CONTEXTO__ELEMENTO_PAI:
				setElementoPai((EntidadeDeContexto)newValue);
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
			case CaracteristicaPackage.INFORMACAO_DE_CONTEXTO__ORIGEM:
				setOrigem(ORIGEM_EDEFAULT);
				return;
			case CaracteristicaPackage.INFORMACAO_DE_CONTEXTO__VALIDADE:
				setValidade(VALIDADE_EDEFAULT);
				return;
			case CaracteristicaPackage.INFORMACAO_DE_CONTEXTO__QUALIDADE:
				setQualidade(QUALIDADE_EDEFAULT);
				return;
			case CaracteristicaPackage.INFORMACAO_DE_CONTEXTO__TIPO_VALOR:
				setTipoValor(TIPO_VALOR_EDEFAULT);
				return;
			case CaracteristicaPackage.INFORMACAO_DE_CONTEXTO__VALOR:
				setValor(VALOR_EDEFAULT);
				return;
			case CaracteristicaPackage.INFORMACAO_DE_CONTEXTO__ELEMENTO_PAI:
				setElementoPai((EntidadeDeContexto)null);
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
			case CaracteristicaPackage.INFORMACAO_DE_CONTEXTO__ORIGEM:
				return origem != ORIGEM_EDEFAULT;
			case CaracteristicaPackage.INFORMACAO_DE_CONTEXTO__VALIDADE:
				return validade != VALIDADE_EDEFAULT;
			case CaracteristicaPackage.INFORMACAO_DE_CONTEXTO__QUALIDADE:
				return qualidade != QUALIDADE_EDEFAULT;
			case CaracteristicaPackage.INFORMACAO_DE_CONTEXTO__TIPO_VALOR:
				return tipoValor != TIPO_VALOR_EDEFAULT;
			case CaracteristicaPackage.INFORMACAO_DE_CONTEXTO__VALOR:
				return VALOR_EDEFAULT == null ? valor != null : !VALOR_EDEFAULT.equals(valor);
			case CaracteristicaPackage.INFORMACAO_DE_CONTEXTO__ELEMENTO_PAI:
				return elementoPai != null;
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
		result.append(" (origem: ");
		result.append(origem);
		result.append(", validade: ");
		result.append(validade);
		result.append(", qualidade: ");
		result.append(qualidade);
		result.append(", tipoValor: ");
		result.append(tipoValor);
		result.append(", valor: ");
		result.append(valor);
		result.append(')');
		return result.toString();
	}

} //InformacaodeContextoImpl
