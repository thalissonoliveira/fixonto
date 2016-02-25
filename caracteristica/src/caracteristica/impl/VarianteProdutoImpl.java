/**
 */
package caracteristica.impl;

import caracteristica.CaracteristicaPackage;
import caracteristica.VariacaoProduto;
import caracteristica.VarianteProduto;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variante Produto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link caracteristica.impl.VarianteProdutoImpl#getVariacaoProdutoPai <em>Variacao Produto Pai</em>}</li>
 *   <li>{@link caracteristica.impl.VarianteProdutoImpl#getSelecionado <em>Selecionado</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VarianteProdutoImpl extends ElementoDeProdutoImpl implements VarianteProduto
{
  /**
   * The cached value of the '{@link #getVariacaoProdutoPai() <em>Variacao Produto Pai</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariacaoProdutoPai()
   * @generated
   * @ordered
   */
  protected VariacaoProduto variacaoProdutoPai;

  /**
   * The default value of the '{@link #getSelecionado() <em>Selecionado</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelecionado()
   * @generated
   * @ordered
   */
  protected static final Boolean SELECIONADO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSelecionado() <em>Selecionado</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelecionado()
   * @generated
   * @ordered
   */
  protected Boolean selecionado = SELECIONADO_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VarianteProdutoImpl()
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
    return CaracteristicaPackage.Literals.VARIANTE_PRODUTO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariacaoProduto getVariacaoProdutoPai()
  {
    if (variacaoProdutoPai != null && variacaoProdutoPai.eIsProxy())
    {
      InternalEObject oldVariacaoProdutoPai = (InternalEObject)variacaoProdutoPai;
      variacaoProdutoPai = (VariacaoProduto)eResolveProxy(oldVariacaoProdutoPai);
      if (variacaoProdutoPai != oldVariacaoProdutoPai)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CaracteristicaPackage.VARIANTE_PRODUTO__VARIACAO_PRODUTO_PAI, oldVariacaoProdutoPai, variacaoProdutoPai));
      }
    }
    return variacaoProdutoPai;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariacaoProduto basicGetVariacaoProdutoPai()
  {
    return variacaoProdutoPai;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariacaoProdutoPai(VariacaoProduto newVariacaoProdutoPai, NotificationChain msgs)
  {
    VariacaoProduto oldVariacaoProdutoPai = variacaoProdutoPai;
    variacaoProdutoPai = newVariacaoProdutoPai;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.VARIANTE_PRODUTO__VARIACAO_PRODUTO_PAI, oldVariacaoProdutoPai, newVariacaoProdutoPai);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariacaoProdutoPai(VariacaoProduto newVariacaoProdutoPai)
  {
    if (newVariacaoProdutoPai != variacaoProdutoPai)
    {
      NotificationChain msgs = null;
      if (variacaoProdutoPai != null)
        msgs = ((InternalEObject)variacaoProdutoPai).eInverseRemove(this, CaracteristicaPackage.VARIACAO_PRODUTO__VARIANTES_PRODUTO, VariacaoProduto.class, msgs);
      if (newVariacaoProdutoPai != null)
        msgs = ((InternalEObject)newVariacaoProdutoPai).eInverseAdd(this, CaracteristicaPackage.VARIACAO_PRODUTO__VARIANTES_PRODUTO, VariacaoProduto.class, msgs);
      msgs = basicSetVariacaoProdutoPai(newVariacaoProdutoPai, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.VARIANTE_PRODUTO__VARIACAO_PRODUTO_PAI, newVariacaoProdutoPai, newVariacaoProdutoPai));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Boolean getSelecionado()
  {
    return selecionado;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSelecionado(Boolean newSelecionado)
  {
    Boolean oldSelecionado = selecionado;
    selecionado = newSelecionado;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.VARIANTE_PRODUTO__SELECIONADO, oldSelecionado, selecionado));
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
      case CaracteristicaPackage.VARIANTE_PRODUTO__VARIACAO_PRODUTO_PAI:
        if (variacaoProdutoPai != null)
          msgs = ((InternalEObject)variacaoProdutoPai).eInverseRemove(this, CaracteristicaPackage.VARIACAO_PRODUTO__VARIANTES_PRODUTO, VariacaoProduto.class, msgs);
        return basicSetVariacaoProdutoPai((VariacaoProduto)otherEnd, msgs);
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
      case CaracteristicaPackage.VARIANTE_PRODUTO__VARIACAO_PRODUTO_PAI:
        return basicSetVariacaoProdutoPai(null, msgs);
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
      case CaracteristicaPackage.VARIANTE_PRODUTO__VARIACAO_PRODUTO_PAI:
        if (resolve) return getVariacaoProdutoPai();
        return basicGetVariacaoProdutoPai();
      case CaracteristicaPackage.VARIANTE_PRODUTO__SELECIONADO:
        return getSelecionado();
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
      case CaracteristicaPackage.VARIANTE_PRODUTO__VARIACAO_PRODUTO_PAI:
        setVariacaoProdutoPai((VariacaoProduto)newValue);
        return;
      case CaracteristicaPackage.VARIANTE_PRODUTO__SELECIONADO:
        setSelecionado((Boolean)newValue);
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
      case CaracteristicaPackage.VARIANTE_PRODUTO__VARIACAO_PRODUTO_PAI:
        setVariacaoProdutoPai((VariacaoProduto)null);
        return;
      case CaracteristicaPackage.VARIANTE_PRODUTO__SELECIONADO:
        setSelecionado(SELECIONADO_EDEFAULT);
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
      case CaracteristicaPackage.VARIANTE_PRODUTO__VARIACAO_PRODUTO_PAI:
        return variacaoProdutoPai != null;
      case CaracteristicaPackage.VARIANTE_PRODUTO__SELECIONADO:
        return SELECIONADO_EDEFAULT == null ? selecionado != null : !SELECIONADO_EDEFAULT.equals(selecionado);
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
    result.append(" (selecionado: ");
    result.append(selecionado);
    result.append(')');
    return result.toString();
  }

} //VarianteProdutoImpl
