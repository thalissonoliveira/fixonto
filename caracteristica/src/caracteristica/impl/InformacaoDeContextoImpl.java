/**
 */
package caracteristica.impl;

import caracteristica.CaracteristicaPackage;
import caracteristica.EntidadeDeContexto;
import caracteristica.InformacaoDeContexto;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Informacao De Contexto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link caracteristica.impl.InformacaoDeContextoImpl#getElementoPai <em>Elemento Pai</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InformacaoDeContextoImpl extends ContextoImpl implements InformacaoDeContexto
{
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
  public EntidadeDeContexto getElementoPai()
  {
    if (elementoPai != null && elementoPai.eIsProxy())
    {
      InternalEObject oldElementoPai = (InternalEObject)elementoPai;
      elementoPai = (EntidadeDeContexto)eResolveProxy(oldElementoPai);
      if (elementoPai != oldElementoPai)
      {
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
    if (eNotificationRequired())
    {
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
    if (newElementoPai != elementoPai)
    {
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
    switch (featureID)
    {
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
    switch (featureID)
    {
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
    switch (featureID)
    {
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
    switch (featureID)
    {
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
    switch (featureID)
    {
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
    switch (featureID)
    {
      case CaracteristicaPackage.INFORMACAO_DE_CONTEXTO__ELEMENTO_PAI:
        return elementoPai != null;
    }
    return super.eIsSet(featureID);
  }

} //InformacaoDeContextoImpl
