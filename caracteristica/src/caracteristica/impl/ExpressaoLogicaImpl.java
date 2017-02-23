/**
 */
package caracteristica.impl;

import caracteristica.Antecedente;
import caracteristica.CaracteristicaPackage;
import caracteristica.ExpressaoLogica;
import caracteristica.OperadorLogico;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expressao Logica</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link caracteristica.impl.ExpressaoLogicaImpl#getLadoDireitoComposicao <em>Lado Direito Composicao</em>}</li>
 *   <li>{@link caracteristica.impl.ExpressaoLogicaImpl#getOperadorLogico <em>Operador Logico</em>}</li>
 *   <li>{@link caracteristica.impl.ExpressaoLogicaImpl#getLadoEsquerdoComposicao <em>Lado Esquerdo Composicao</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpressaoLogicaImpl extends AntecedenteImpl implements ExpressaoLogica
{
  /**
   * The cached value of the '{@link #getLadoDireitoComposicao() <em>Lado Direito Composicao</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLadoDireitoComposicao()
   * @generated
   * @ordered
   */
  protected Antecedente ladoDireitoComposicao;

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
   * The cached value of the '{@link #getLadoEsquerdoComposicao() <em>Lado Esquerdo Composicao</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLadoEsquerdoComposicao()
   * @generated
   * @ordered
   */
  protected Antecedente ladoEsquerdoComposicao;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExpressaoLogicaImpl()
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
    return CaracteristicaPackage.Literals.EXPRESSAO_LOGICA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Antecedente getLadoDireitoComposicao()
  {
    if (ladoDireitoComposicao != null && ladoDireitoComposicao.eIsProxy())
    {
      InternalEObject oldLadoDireitoComposicao = (InternalEObject)ladoDireitoComposicao;
      ladoDireitoComposicao = (Antecedente)eResolveProxy(oldLadoDireitoComposicao);
      if (ladoDireitoComposicao != oldLadoDireitoComposicao)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CaracteristicaPackage.EXPRESSAO_LOGICA__LADO_DIREITO_COMPOSICAO, oldLadoDireitoComposicao, ladoDireitoComposicao));
      }
    }
    return ladoDireitoComposicao;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Antecedente basicGetLadoDireitoComposicao()
  {
    return ladoDireitoComposicao;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLadoDireitoComposicao(Antecedente newLadoDireitoComposicao)
  {
    Antecedente oldLadoDireitoComposicao = ladoDireitoComposicao;
    ladoDireitoComposicao = newLadoDireitoComposicao;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.EXPRESSAO_LOGICA__LADO_DIREITO_COMPOSICAO, oldLadoDireitoComposicao, ladoDireitoComposicao));
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
      eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.EXPRESSAO_LOGICA__OPERADOR_LOGICO, oldOperadorLogico, operadorLogico));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Antecedente getLadoEsquerdoComposicao()
  {
    if (ladoEsquerdoComposicao != null && ladoEsquerdoComposicao.eIsProxy())
    {
      InternalEObject oldLadoEsquerdoComposicao = (InternalEObject)ladoEsquerdoComposicao;
      ladoEsquerdoComposicao = (Antecedente)eResolveProxy(oldLadoEsquerdoComposicao);
      if (ladoEsquerdoComposicao != oldLadoEsquerdoComposicao)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CaracteristicaPackage.EXPRESSAO_LOGICA__LADO_ESQUERDO_COMPOSICAO, oldLadoEsquerdoComposicao, ladoEsquerdoComposicao));
      }
    }
    return ladoEsquerdoComposicao;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Antecedente basicGetLadoEsquerdoComposicao()
  {
    return ladoEsquerdoComposicao;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLadoEsquerdoComposicao(Antecedente newLadoEsquerdoComposicao)
  {
    Antecedente oldLadoEsquerdoComposicao = ladoEsquerdoComposicao;
    ladoEsquerdoComposicao = newLadoEsquerdoComposicao;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.EXPRESSAO_LOGICA__LADO_ESQUERDO_COMPOSICAO, oldLadoEsquerdoComposicao, ladoEsquerdoComposicao));
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
      case CaracteristicaPackage.EXPRESSAO_LOGICA__LADO_DIREITO_COMPOSICAO:
        if (resolve) return getLadoDireitoComposicao();
        return basicGetLadoDireitoComposicao();
      case CaracteristicaPackage.EXPRESSAO_LOGICA__OPERADOR_LOGICO:
        return getOperadorLogico();
      case CaracteristicaPackage.EXPRESSAO_LOGICA__LADO_ESQUERDO_COMPOSICAO:
        if (resolve) return getLadoEsquerdoComposicao();
        return basicGetLadoEsquerdoComposicao();
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
      case CaracteristicaPackage.EXPRESSAO_LOGICA__LADO_DIREITO_COMPOSICAO:
        setLadoDireitoComposicao((Antecedente)newValue);
        return;
      case CaracteristicaPackage.EXPRESSAO_LOGICA__OPERADOR_LOGICO:
        setOperadorLogico((OperadorLogico)newValue);
        return;
      case CaracteristicaPackage.EXPRESSAO_LOGICA__LADO_ESQUERDO_COMPOSICAO:
        setLadoEsquerdoComposicao((Antecedente)newValue);
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
      case CaracteristicaPackage.EXPRESSAO_LOGICA__LADO_DIREITO_COMPOSICAO:
        setLadoDireitoComposicao((Antecedente)null);
        return;
      case CaracteristicaPackage.EXPRESSAO_LOGICA__OPERADOR_LOGICO:
        setOperadorLogico(OPERADOR_LOGICO_EDEFAULT);
        return;
      case CaracteristicaPackage.EXPRESSAO_LOGICA__LADO_ESQUERDO_COMPOSICAO:
        setLadoEsquerdoComposicao((Antecedente)null);
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
      case CaracteristicaPackage.EXPRESSAO_LOGICA__LADO_DIREITO_COMPOSICAO:
        return ladoDireitoComposicao != null;
      case CaracteristicaPackage.EXPRESSAO_LOGICA__OPERADOR_LOGICO:
        return operadorLogico != OPERADOR_LOGICO_EDEFAULT;
      case CaracteristicaPackage.EXPRESSAO_LOGICA__LADO_ESQUERDO_COMPOSICAO:
        return ladoEsquerdoComposicao != null;
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

} //ExpressaoLogicaImpl
