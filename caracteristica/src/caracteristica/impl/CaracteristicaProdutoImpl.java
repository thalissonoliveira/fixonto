/**
 */
package caracteristica.impl;

import caracteristica.AtributoProduto;
import caracteristica.CaracteristicaPackage;
import caracteristica.CaracteristicaProduto;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Produto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link caracteristica.impl.CaracteristicaProdutoImpl#getCaracteristicaProdutoPai <em>Caracteristica Produto Pai</em>}</li>
 *   <li>{@link caracteristica.impl.CaracteristicaProdutoImpl#getCaracteristicaProdutoFilha <em>Caracteristica Produto Filha</em>}</li>
 *   <li>{@link caracteristica.impl.CaracteristicaProdutoImpl#getAtributoProduto <em>Atributo Produto</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CaracteristicaProdutoImpl extends ElementoDeProdutoImpl implements CaracteristicaProduto
{
  /**
   * The cached value of the '{@link #getCaracteristicaProdutoPai() <em>Caracteristica Produto Pai</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCaracteristicaProdutoPai()
   * @generated
   * @ordered
   */
  protected CaracteristicaProduto caracteristicaProdutoPai;

  /**
   * The cached value of the '{@link #getCaracteristicaProdutoFilha() <em>Caracteristica Produto Filha</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCaracteristicaProdutoFilha()
   * @generated
   * @ordered
   */
  protected EList<CaracteristicaProduto> caracteristicaProdutoFilha;

  /**
   * The cached value of the '{@link #getAtributoProduto() <em>Atributo Produto</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtributoProduto()
   * @generated
   * @ordered
   */
  protected EList<AtributoProduto> atributoProduto;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CaracteristicaProdutoImpl()
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
    return CaracteristicaPackage.Literals.CARACTERISTICA_PRODUTO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CaracteristicaProduto getCaracteristicaProdutoPai()
  {
    if (caracteristicaProdutoPai != null && caracteristicaProdutoPai.eIsProxy())
    {
      InternalEObject oldCaracteristicaProdutoPai = (InternalEObject)caracteristicaProdutoPai;
      caracteristicaProdutoPai = (CaracteristicaProduto)eResolveProxy(oldCaracteristicaProdutoPai);
      if (caracteristicaProdutoPai != oldCaracteristicaProdutoPai)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CaracteristicaPackage.CARACTERISTICA_PRODUTO__CARACTERISTICA_PRODUTO_PAI, oldCaracteristicaProdutoPai, caracteristicaProdutoPai));
      }
    }
    return caracteristicaProdutoPai;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CaracteristicaProduto basicGetCaracteristicaProdutoPai()
  {
    return caracteristicaProdutoPai;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCaracteristicaProdutoPai(CaracteristicaProduto newCaracteristicaProdutoPai, NotificationChain msgs)
  {
    CaracteristicaProduto oldCaracteristicaProdutoPai = caracteristicaProdutoPai;
    caracteristicaProdutoPai = newCaracteristicaProdutoPai;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.CARACTERISTICA_PRODUTO__CARACTERISTICA_PRODUTO_PAI, oldCaracteristicaProdutoPai, newCaracteristicaProdutoPai);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCaracteristicaProdutoPai(CaracteristicaProduto newCaracteristicaProdutoPai)
  {
    if (newCaracteristicaProdutoPai != caracteristicaProdutoPai)
    {
      NotificationChain msgs = null;
      if (caracteristicaProdutoPai != null)
        msgs = ((InternalEObject)caracteristicaProdutoPai).eInverseRemove(this, CaracteristicaPackage.CARACTERISTICA_PRODUTO__CARACTERISTICA_PRODUTO_FILHA, CaracteristicaProduto.class, msgs);
      if (newCaracteristicaProdutoPai != null)
        msgs = ((InternalEObject)newCaracteristicaProdutoPai).eInverseAdd(this, CaracteristicaPackage.CARACTERISTICA_PRODUTO__CARACTERISTICA_PRODUTO_FILHA, CaracteristicaProduto.class, msgs);
      msgs = basicSetCaracteristicaProdutoPai(newCaracteristicaProdutoPai, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.CARACTERISTICA_PRODUTO__CARACTERISTICA_PRODUTO_PAI, newCaracteristicaProdutoPai, newCaracteristicaProdutoPai));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CaracteristicaProduto> getCaracteristicaProdutoFilha()
  {
    if (caracteristicaProdutoFilha == null)
    {
      caracteristicaProdutoFilha = new EObjectWithInverseResolvingEList<CaracteristicaProduto>(CaracteristicaProduto.class, this, CaracteristicaPackage.CARACTERISTICA_PRODUTO__CARACTERISTICA_PRODUTO_FILHA, CaracteristicaPackage.CARACTERISTICA_PRODUTO__CARACTERISTICA_PRODUTO_PAI);
    }
    return caracteristicaProdutoFilha;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AtributoProduto> getAtributoProduto()
  {
    if (atributoProduto == null)
    {
      atributoProduto = new EObjectWithInverseResolvingEList<AtributoProduto>(AtributoProduto.class, this, CaracteristicaPackage.CARACTERISTICA_PRODUTO__ATRIBUTO_PRODUTO, CaracteristicaPackage.ATRIBUTO_PRODUTO__CARACTERISTICA_PRODUTO_PAI);
    }
    return atributoProduto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CaracteristicaPackage.CARACTERISTICA_PRODUTO__CARACTERISTICA_PRODUTO_PAI:
        if (caracteristicaProdutoPai != null)
          msgs = ((InternalEObject)caracteristicaProdutoPai).eInverseRemove(this, CaracteristicaPackage.CARACTERISTICA_PRODUTO__CARACTERISTICA_PRODUTO_FILHA, CaracteristicaProduto.class, msgs);
        return basicSetCaracteristicaProdutoPai((CaracteristicaProduto)otherEnd, msgs);
      case CaracteristicaPackage.CARACTERISTICA_PRODUTO__CARACTERISTICA_PRODUTO_FILHA:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getCaracteristicaProdutoFilha()).basicAdd(otherEnd, msgs);
      case CaracteristicaPackage.CARACTERISTICA_PRODUTO__ATRIBUTO_PRODUTO:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getAtributoProduto()).basicAdd(otherEnd, msgs);
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
      case CaracteristicaPackage.CARACTERISTICA_PRODUTO__CARACTERISTICA_PRODUTO_PAI:
        return basicSetCaracteristicaProdutoPai(null, msgs);
      case CaracteristicaPackage.CARACTERISTICA_PRODUTO__CARACTERISTICA_PRODUTO_FILHA:
        return ((InternalEList<?>)getCaracteristicaProdutoFilha()).basicRemove(otherEnd, msgs);
      case CaracteristicaPackage.CARACTERISTICA_PRODUTO__ATRIBUTO_PRODUTO:
        return ((InternalEList<?>)getAtributoProduto()).basicRemove(otherEnd, msgs);
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
      case CaracteristicaPackage.CARACTERISTICA_PRODUTO__CARACTERISTICA_PRODUTO_PAI:
        if (resolve) return getCaracteristicaProdutoPai();
        return basicGetCaracteristicaProdutoPai();
      case CaracteristicaPackage.CARACTERISTICA_PRODUTO__CARACTERISTICA_PRODUTO_FILHA:
        return getCaracteristicaProdutoFilha();
      case CaracteristicaPackage.CARACTERISTICA_PRODUTO__ATRIBUTO_PRODUTO:
        return getAtributoProduto();
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
    switch (featureID)
    {
      case CaracteristicaPackage.CARACTERISTICA_PRODUTO__CARACTERISTICA_PRODUTO_PAI:
        setCaracteristicaProdutoPai((CaracteristicaProduto)newValue);
        return;
      case CaracteristicaPackage.CARACTERISTICA_PRODUTO__CARACTERISTICA_PRODUTO_FILHA:
        getCaracteristicaProdutoFilha().clear();
        getCaracteristicaProdutoFilha().addAll((Collection<? extends CaracteristicaProduto>)newValue);
        return;
      case CaracteristicaPackage.CARACTERISTICA_PRODUTO__ATRIBUTO_PRODUTO:
        getAtributoProduto().clear();
        getAtributoProduto().addAll((Collection<? extends AtributoProduto>)newValue);
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
      case CaracteristicaPackage.CARACTERISTICA_PRODUTO__CARACTERISTICA_PRODUTO_PAI:
        setCaracteristicaProdutoPai((CaracteristicaProduto)null);
        return;
      case CaracteristicaPackage.CARACTERISTICA_PRODUTO__CARACTERISTICA_PRODUTO_FILHA:
        getCaracteristicaProdutoFilha().clear();
        return;
      case CaracteristicaPackage.CARACTERISTICA_PRODUTO__ATRIBUTO_PRODUTO:
        getAtributoProduto().clear();
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
      case CaracteristicaPackage.CARACTERISTICA_PRODUTO__CARACTERISTICA_PRODUTO_PAI:
        return caracteristicaProdutoPai != null;
      case CaracteristicaPackage.CARACTERISTICA_PRODUTO__CARACTERISTICA_PRODUTO_FILHA:
        return caracteristicaProdutoFilha != null && !caracteristicaProdutoFilha.isEmpty();
      case CaracteristicaPackage.CARACTERISTICA_PRODUTO__ATRIBUTO_PRODUTO:
        return atributoProduto != null && !atributoProduto.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //CaracteristicaProdutoImpl
