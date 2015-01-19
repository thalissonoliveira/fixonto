/**
 */
package caracteristica.impl;

import caracteristica.CaracteristicaPackage;
import caracteristica.EventoRelacional;
import caracteristica.InformacaoDeContexto;
import caracteristica.InformacaoDeContexto;
import caracteristica.OperadorRelacional;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evento Relacional</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link caracteristica.impl.EventoRelacionalImpl#getVariavelDeContexto <em>Variavel De Contexto</em>}</li>
 *   <li>{@link caracteristica.impl.EventoRelacionalImpl#getOperadorRelacional <em>Operador Relacional</em>}</li>
 *   <li>{@link caracteristica.impl.EventoRelacionalImpl#getValor <em>Valor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventoRelacionalImpl extends EventoImpl implements EventoRelacional
{
  /**
	 * The cached value of the '{@link #getVariavelDeContexto() <em>Variavel De Contexto</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getVariavelDeContexto()
	 * @generated
	 * @ordered
	 */
  protected InformacaoDeContexto variavelDeContexto;

  /**
	 * The default value of the '{@link #getOperadorRelacional() <em>Operador Relacional</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getOperadorRelacional()
	 * @generated
	 * @ordered
	 */
  protected static final OperadorRelacional OPERADOR_RELACIONAL_EDEFAULT = OperadorRelacional.MAIOR;

  /**
	 * The cached value of the '{@link #getOperadorRelacional() <em>Operador Relacional</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getOperadorRelacional()
	 * @generated
	 * @ordered
	 */
  protected OperadorRelacional operadorRelacional = OPERADOR_RELACIONAL_EDEFAULT;

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
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected EventoRelacionalImpl()
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
		return CaracteristicaPackage.Literals.EVENTO_RELACIONAL;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public InformacaoDeContexto getVariavelDeContexto()
  {
		if (variavelDeContexto != null && variavelDeContexto.eIsProxy()) {
			InternalEObject oldVariavelDeContexto = (InternalEObject)variavelDeContexto;
			variavelDeContexto = (InformacaoDeContexto)eResolveProxy(oldVariavelDeContexto);
			if (variavelDeContexto != oldVariavelDeContexto) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CaracteristicaPackage.EVENTO_RELACIONAL__VARIAVEL_DE_CONTEXTO, oldVariavelDeContexto, variavelDeContexto));
			}
		}
		return variavelDeContexto;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public InformacaoDeContexto basicGetVariavelDeContexto()
  {
		return variavelDeContexto;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setVariavelDeContexto(InformacaoDeContexto newVariavelDeContexto)
  {
		InformacaoDeContexto oldVariavelDeContexto = variavelDeContexto;
		variavelDeContexto = newVariavelDeContexto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.EVENTO_RELACIONAL__VARIAVEL_DE_CONTEXTO, oldVariavelDeContexto, variavelDeContexto));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public OperadorRelacional getOperadorRelacional()
  {
		return operadorRelacional;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setOperadorRelacional(OperadorRelacional newOperadorRelacional)
  {
		OperadorRelacional oldOperadorRelacional = operadorRelacional;
		operadorRelacional = newOperadorRelacional == null ? OPERADOR_RELACIONAL_EDEFAULT : newOperadorRelacional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.EVENTO_RELACIONAL__OPERADOR_RELACIONAL, oldOperadorRelacional, operadorRelacional));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.EVENTO_RELACIONAL__VALOR, oldValor, valor));
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
			case CaracteristicaPackage.EVENTO_RELACIONAL__VARIAVEL_DE_CONTEXTO:
				if (resolve) return getVariavelDeContexto();
				return basicGetVariavelDeContexto();
			case CaracteristicaPackage.EVENTO_RELACIONAL__OPERADOR_RELACIONAL:
				return getOperadorRelacional();
			case CaracteristicaPackage.EVENTO_RELACIONAL__VALOR:
				return getValor();
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
			case CaracteristicaPackage.EVENTO_RELACIONAL__VARIAVEL_DE_CONTEXTO:
				setVariavelDeContexto((InformacaoDeContexto)newValue);
				return;
			case CaracteristicaPackage.EVENTO_RELACIONAL__OPERADOR_RELACIONAL:
				setOperadorRelacional((OperadorRelacional)newValue);
				return;
			case CaracteristicaPackage.EVENTO_RELACIONAL__VALOR:
				setValor((String)newValue);
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
			case CaracteristicaPackage.EVENTO_RELACIONAL__VARIAVEL_DE_CONTEXTO:
				setVariavelDeContexto((InformacaoDeContexto)null);
				return;
			case CaracteristicaPackage.EVENTO_RELACIONAL__OPERADOR_RELACIONAL:
				setOperadorRelacional(OPERADOR_RELACIONAL_EDEFAULT);
				return;
			case CaracteristicaPackage.EVENTO_RELACIONAL__VALOR:
				setValor(VALOR_EDEFAULT);
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
			case CaracteristicaPackage.EVENTO_RELACIONAL__VARIAVEL_DE_CONTEXTO:
				return variavelDeContexto != null;
			case CaracteristicaPackage.EVENTO_RELACIONAL__OPERADOR_RELACIONAL:
				return operadorRelacional != OPERADOR_RELACIONAL_EDEFAULT;
			case CaracteristicaPackage.EVENTO_RELACIONAL__VALOR:
				return VALOR_EDEFAULT == null ? valor != null : !VALOR_EDEFAULT.equals(valor);
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
		result.append(" (operadorRelacional: ");
		result.append(operadorRelacional);
		result.append(", valor: ");
		result.append(valor);
		result.append(')');
		return result.toString();
	}

} //EventoRelacionalImpl
