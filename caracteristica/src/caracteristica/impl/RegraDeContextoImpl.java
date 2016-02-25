/**
 */
package caracteristica.impl;

import caracteristica.Acao;
import caracteristica.CaracteristicaPackage;
import caracteristica.Evento;
import caracteristica.RegraDeContexto;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Regra De Contexto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link caracteristica.impl.RegraDeContextoImpl#getEvento <em>Evento</em>}</li>
 *   <li>{@link caracteristica.impl.RegraDeContextoImpl#getAcao <em>Acao</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegraDeContextoImpl extends RegraImpl implements RegraDeContexto
{
  /**
   * The cached value of the '{@link #getEvento() <em>Evento</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvento()
   * @generated
   * @ordered
   */
  protected Evento evento;

  /**
   * The cached value of the '{@link #getAcao() <em>Acao</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAcao()
   * @generated
   * @ordered
   */
  protected Acao acao;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RegraDeContextoImpl()
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
    return CaracteristicaPackage.Literals.REGRA_DE_CONTEXTO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Evento getEvento()
  {
    if (evento != null && evento.eIsProxy())
    {
      InternalEObject oldEvento = (InternalEObject)evento;
      evento = (Evento)eResolveProxy(oldEvento);
      if (evento != oldEvento)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CaracteristicaPackage.REGRA_DE_CONTEXTO__EVENTO, oldEvento, evento));
      }
    }
    return evento;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Evento basicGetEvento()
  {
    return evento;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEvento(Evento newEvento)
  {
    Evento oldEvento = evento;
    evento = newEvento;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.REGRA_DE_CONTEXTO__EVENTO, oldEvento, evento));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Acao getAcao()
  {
    if (acao != null && acao.eIsProxy())
    {
      InternalEObject oldAcao = (InternalEObject)acao;
      acao = (Acao)eResolveProxy(oldAcao);
      if (acao != oldAcao)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CaracteristicaPackage.REGRA_DE_CONTEXTO__ACAO, oldAcao, acao));
      }
    }
    return acao;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Acao basicGetAcao()
  {
    return acao;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAcao(Acao newAcao)
  {
    Acao oldAcao = acao;
    acao = newAcao;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.REGRA_DE_CONTEXTO__ACAO, oldAcao, acao));
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
      case CaracteristicaPackage.REGRA_DE_CONTEXTO__EVENTO:
        if (resolve) return getEvento();
        return basicGetEvento();
      case CaracteristicaPackage.REGRA_DE_CONTEXTO__ACAO:
        if (resolve) return getAcao();
        return basicGetAcao();
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
      case CaracteristicaPackage.REGRA_DE_CONTEXTO__EVENTO:
        setEvento((Evento)newValue);
        return;
      case CaracteristicaPackage.REGRA_DE_CONTEXTO__ACAO:
        setAcao((Acao)newValue);
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
      case CaracteristicaPackage.REGRA_DE_CONTEXTO__EVENTO:
        setEvento((Evento)null);
        return;
      case CaracteristicaPackage.REGRA_DE_CONTEXTO__ACAO:
        setAcao((Acao)null);
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
      case CaracteristicaPackage.REGRA_DE_CONTEXTO__EVENTO:
        return evento != null;
      case CaracteristicaPackage.REGRA_DE_CONTEXTO__ACAO:
        return acao != null;
    }
    return super.eIsSet(featureID);
  }

} //RegraDeContextoImpl
