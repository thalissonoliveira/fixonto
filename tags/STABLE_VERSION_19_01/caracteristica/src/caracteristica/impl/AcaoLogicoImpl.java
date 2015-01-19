/**
 */
package caracteristica.impl;

import caracteristica.Acao;
import caracteristica.AcaoLogico;
import caracteristica.CaracteristicaPackage;
import caracteristica.OperadorAcaoLogico;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Acao Logico</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link caracteristica.impl.AcaoLogicoImpl#getLadoEsquerdoAcao <em>Lado Esquerdo Acao</em>}</li>
 *   <li>{@link caracteristica.impl.AcaoLogicoImpl#getOperadorAcaoLogico <em>Operador Acao Logico</em>}</li>
 *   <li>{@link caracteristica.impl.AcaoLogicoImpl#getLadoDireitoAcao <em>Lado Direito Acao</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AcaoLogicoImpl extends AcaoImpl implements AcaoLogico
{
  /**
	 * The cached value of the '{@link #getLadoEsquerdoAcao() <em>Lado Esquerdo Acao</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLadoEsquerdoAcao()
	 * @generated
	 * @ordered
	 */
  protected Acao ladoEsquerdoAcao;

  /**
	 * The default value of the '{@link #getOperadorAcaoLogico() <em>Operador Acao Logico</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getOperadorAcaoLogico()
	 * @generated
	 * @ordered
	 */
  protected static final OperadorAcaoLogico OPERADOR_ACAO_LOGICO_EDEFAULT = OperadorAcaoLogico.AND;

  /**
	 * The cached value of the '{@link #getOperadorAcaoLogico() <em>Operador Acao Logico</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getOperadorAcaoLogico()
	 * @generated
	 * @ordered
	 */
  protected OperadorAcaoLogico operadorAcaoLogico = OPERADOR_ACAO_LOGICO_EDEFAULT;

  /**
	 * The cached value of the '{@link #getLadoDireitoAcao() <em>Lado Direito Acao</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLadoDireitoAcao()
	 * @generated
	 * @ordered
	 */
  protected Acao ladoDireitoAcao;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected AcaoLogicoImpl()
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
		return CaracteristicaPackage.Literals.ACAO_LOGICO;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Acao getLadoEsquerdoAcao()
  {
		if (ladoEsquerdoAcao != null && ladoEsquerdoAcao.eIsProxy()) {
			InternalEObject oldLadoEsquerdoAcao = (InternalEObject)ladoEsquerdoAcao;
			ladoEsquerdoAcao = (Acao)eResolveProxy(oldLadoEsquerdoAcao);
			if (ladoEsquerdoAcao != oldLadoEsquerdoAcao) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CaracteristicaPackage.ACAO_LOGICO__LADO_ESQUERDO_ACAO, oldLadoEsquerdoAcao, ladoEsquerdoAcao));
			}
		}
		return ladoEsquerdoAcao;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Acao basicGetLadoEsquerdoAcao()
  {
		return ladoEsquerdoAcao;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setLadoEsquerdoAcao(Acao newLadoEsquerdoAcao)
  {
		Acao oldLadoEsquerdoAcao = ladoEsquerdoAcao;
		ladoEsquerdoAcao = newLadoEsquerdoAcao;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.ACAO_LOGICO__LADO_ESQUERDO_ACAO, oldLadoEsquerdoAcao, ladoEsquerdoAcao));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public OperadorAcaoLogico getOperadorAcaoLogico()
  {
		return operadorAcaoLogico;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setOperadorAcaoLogico(OperadorAcaoLogico newOperadorAcaoLogico)
  {
		OperadorAcaoLogico oldOperadorAcaoLogico = operadorAcaoLogico;
		operadorAcaoLogico = newOperadorAcaoLogico == null ? OPERADOR_ACAO_LOGICO_EDEFAULT : newOperadorAcaoLogico;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.ACAO_LOGICO__OPERADOR_ACAO_LOGICO, oldOperadorAcaoLogico, operadorAcaoLogico));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Acao getLadoDireitoAcao()
  {
		if (ladoDireitoAcao != null && ladoDireitoAcao.eIsProxy()) {
			InternalEObject oldLadoDireitoAcao = (InternalEObject)ladoDireitoAcao;
			ladoDireitoAcao = (Acao)eResolveProxy(oldLadoDireitoAcao);
			if (ladoDireitoAcao != oldLadoDireitoAcao) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CaracteristicaPackage.ACAO_LOGICO__LADO_DIREITO_ACAO, oldLadoDireitoAcao, ladoDireitoAcao));
			}
		}
		return ladoDireitoAcao;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Acao basicGetLadoDireitoAcao()
  {
		return ladoDireitoAcao;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setLadoDireitoAcao(Acao newLadoDireitoAcao)
  {
		Acao oldLadoDireitoAcao = ladoDireitoAcao;
		ladoDireitoAcao = newLadoDireitoAcao;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.ACAO_LOGICO__LADO_DIREITO_ACAO, oldLadoDireitoAcao, ladoDireitoAcao));
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
			case CaracteristicaPackage.ACAO_LOGICO__LADO_ESQUERDO_ACAO:
				if (resolve) return getLadoEsquerdoAcao();
				return basicGetLadoEsquerdoAcao();
			case CaracteristicaPackage.ACAO_LOGICO__OPERADOR_ACAO_LOGICO:
				return getOperadorAcaoLogico();
			case CaracteristicaPackage.ACAO_LOGICO__LADO_DIREITO_ACAO:
				if (resolve) return getLadoDireitoAcao();
				return basicGetLadoDireitoAcao();
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
			case CaracteristicaPackage.ACAO_LOGICO__LADO_ESQUERDO_ACAO:
				setLadoEsquerdoAcao((Acao)newValue);
				return;
			case CaracteristicaPackage.ACAO_LOGICO__OPERADOR_ACAO_LOGICO:
				setOperadorAcaoLogico((OperadorAcaoLogico)newValue);
				return;
			case CaracteristicaPackage.ACAO_LOGICO__LADO_DIREITO_ACAO:
				setLadoDireitoAcao((Acao)newValue);
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
			case CaracteristicaPackage.ACAO_LOGICO__LADO_ESQUERDO_ACAO:
				setLadoEsquerdoAcao((Acao)null);
				return;
			case CaracteristicaPackage.ACAO_LOGICO__OPERADOR_ACAO_LOGICO:
				setOperadorAcaoLogico(OPERADOR_ACAO_LOGICO_EDEFAULT);
				return;
			case CaracteristicaPackage.ACAO_LOGICO__LADO_DIREITO_ACAO:
				setLadoDireitoAcao((Acao)null);
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
			case CaracteristicaPackage.ACAO_LOGICO__LADO_ESQUERDO_ACAO:
				return ladoEsquerdoAcao != null;
			case CaracteristicaPackage.ACAO_LOGICO__OPERADOR_ACAO_LOGICO:
				return operadorAcaoLogico != OPERADOR_ACAO_LOGICO_EDEFAULT;
			case CaracteristicaPackage.ACAO_LOGICO__LADO_DIREITO_ACAO:
				return ladoDireitoAcao != null;
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
		result.append(" (operadorAcaoLogico: ");
		result.append(operadorAcaoLogico);
		result.append(')');
		return result.toString();
	}

} //AcaoLogicoImpl
