/**
 */
package caracteristica.impl;

import caracteristica.CaracteristicaPackage;
import caracteristica.Evento;
import caracteristica.EventoLogico;
import caracteristica.OperadorLogico;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evento Logico</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link caracteristica.impl.EventoLogicoImpl#getLadoDireitoEvento <em>Lado Direito Evento</em>}</li>
 *   <li>{@link caracteristica.impl.EventoLogicoImpl#getOperadorLogico <em>Operador Logico</em>}</li>
 *   <li>{@link caracteristica.impl.EventoLogicoImpl#getLadoEsquerdoEvento <em>Lado Esquerdo Evento</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventoLogicoImpl extends EventoImpl implements EventoLogico
{
  /**
   * The cached value of the '{@link #getLadoDireitoEvento() <em>Lado Direito Evento</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLadoDireitoEvento()
   * @generated
   * @ordered
   */
  protected Evento ladoDireitoEvento;

  /**
   * The default value of the '{@link #getOperadorLogico() <em>Operador Logico</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperadorLogico()
   * @generated
   * @ordered
   */
  protected static final OperadorLogico OPERADOR_LOGICO_EDEFAULT = OperadorLogico.AND;

  /**
   * The cached value of the '{@link #getOperadorLogico() <em>Operador Logico</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperadorLogico()
   * @generated
   * @ordered
   */
  protected OperadorLogico operadorLogico = OPERADOR_LOGICO_EDEFAULT;

  /**
   * The cached value of the '{@link #getLadoEsquerdoEvento() <em>Lado Esquerdo Evento</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLadoEsquerdoEvento()
   * @generated
   * @ordered
   */
  protected Evento ladoEsquerdoEvento;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EventoLogicoImpl()
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
    return CaracteristicaPackage.Literals.EVENTO_LOGICO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Evento getLadoDireitoEvento()
  {
    if (ladoDireitoEvento != null && ladoDireitoEvento.eIsProxy())
    {
      InternalEObject oldLadoDireitoEvento = (InternalEObject)ladoDireitoEvento;
      ladoDireitoEvento = (Evento)eResolveProxy(oldLadoDireitoEvento);
      if (ladoDireitoEvento != oldLadoDireitoEvento)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CaracteristicaPackage.EVENTO_LOGICO__LADO_DIREITO_EVENTO, oldLadoDireitoEvento, ladoDireitoEvento));
      }
    }
    return ladoDireitoEvento;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Evento basicGetLadoDireitoEvento()
  {
    return ladoDireitoEvento;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLadoDireitoEvento(Evento newLadoDireitoEvento)
  {
    Evento oldLadoDireitoEvento = ladoDireitoEvento;
    ladoDireitoEvento = newLadoDireitoEvento;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.EVENTO_LOGICO__LADO_DIREITO_EVENTO, oldLadoDireitoEvento, ladoDireitoEvento));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperadorLogico getOperadorLogico()
  {
    return operadorLogico;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperadorLogico(OperadorLogico newOperadorLogico)
  {
    OperadorLogico oldOperadorLogico = operadorLogico;
    operadorLogico = newOperadorLogico == null ? OPERADOR_LOGICO_EDEFAULT : newOperadorLogico;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.EVENTO_LOGICO__OPERADOR_LOGICO, oldOperadorLogico, operadorLogico));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Evento getLadoEsquerdoEvento()
  {
    if (ladoEsquerdoEvento != null && ladoEsquerdoEvento.eIsProxy())
    {
      InternalEObject oldLadoEsquerdoEvento = (InternalEObject)ladoEsquerdoEvento;
      ladoEsquerdoEvento = (Evento)eResolveProxy(oldLadoEsquerdoEvento);
      if (ladoEsquerdoEvento != oldLadoEsquerdoEvento)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CaracteristicaPackage.EVENTO_LOGICO__LADO_ESQUERDO_EVENTO, oldLadoEsquerdoEvento, ladoEsquerdoEvento));
      }
    }
    return ladoEsquerdoEvento;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Evento basicGetLadoEsquerdoEvento()
  {
    return ladoEsquerdoEvento;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLadoEsquerdoEvento(Evento newLadoEsquerdoEvento)
  {
    Evento oldLadoEsquerdoEvento = ladoEsquerdoEvento;
    ladoEsquerdoEvento = newLadoEsquerdoEvento;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.EVENTO_LOGICO__LADO_ESQUERDO_EVENTO, oldLadoEsquerdoEvento, ladoEsquerdoEvento));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case CaracteristicaPackage.EVENTO_LOGICO__LADO_DIREITO_EVENTO:
        if (resolve) return getLadoDireitoEvento();
        return basicGetLadoDireitoEvento();
      case CaracteristicaPackage.EVENTO_LOGICO__OPERADOR_LOGICO:
        return getOperadorLogico();
      case CaracteristicaPackage.EVENTO_LOGICO__LADO_ESQUERDO_EVENTO:
        if (resolve) return getLadoEsquerdoEvento();
        return basicGetLadoEsquerdoEvento();
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
    switch (featureID)
    {
      case CaracteristicaPackage.EVENTO_LOGICO__LADO_DIREITO_EVENTO:
        setLadoDireitoEvento((Evento)newValue);
        return;
      case CaracteristicaPackage.EVENTO_LOGICO__OPERADOR_LOGICO:
        setOperadorLogico((OperadorLogico)newValue);
        return;
      case CaracteristicaPackage.EVENTO_LOGICO__LADO_ESQUERDO_EVENTO:
        setLadoEsquerdoEvento((Evento)newValue);
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
    switch (featureID)
    {
      case CaracteristicaPackage.EVENTO_LOGICO__LADO_DIREITO_EVENTO:
        setLadoDireitoEvento((Evento)null);
        return;
      case CaracteristicaPackage.EVENTO_LOGICO__OPERADOR_LOGICO:
        setOperadorLogico(OPERADOR_LOGICO_EDEFAULT);
        return;
      case CaracteristicaPackage.EVENTO_LOGICO__LADO_ESQUERDO_EVENTO:
        setLadoEsquerdoEvento((Evento)null);
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
    switch (featureID)
    {
      case CaracteristicaPackage.EVENTO_LOGICO__LADO_DIREITO_EVENTO:
        return ladoDireitoEvento != null;
      case CaracteristicaPackage.EVENTO_LOGICO__OPERADOR_LOGICO:
        return operadorLogico != OPERADOR_LOGICO_EDEFAULT;
      case CaracteristicaPackage.EVENTO_LOGICO__LADO_ESQUERDO_EVENTO:
        return ladoEsquerdoEvento != null;
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
    result.append(" (operadorLogico: ");
    result.append(operadorLogico);
    result.append(')');
    return result.toString();
  }

} //EventoLogicoImpl
