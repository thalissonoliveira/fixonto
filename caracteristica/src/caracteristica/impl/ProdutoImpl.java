/**
 */
package caracteristica.impl;

import caracteristica.CaracteristicaPackage;
import caracteristica.CaracteristicaRaiz;
import caracteristica.Produto;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Produto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link caracteristica.impl.ProdutoImpl#getLinhaDoProduto <em>Linha Do Produto</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProdutoImpl extends CaracteristicaProdutoImpl implements Produto
{
  /**
   * The cached value of the '{@link #getLinhaDoProduto() <em>Linha Do Produto</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLinhaDoProduto()
   * @generated
   * @ordered
   */
  protected CaracteristicaRaiz linhaDoProduto;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProdutoImpl()
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
    return CaracteristicaPackage.Literals.PRODUTO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CaracteristicaRaiz getLinhaDoProduto()
  {
    if (linhaDoProduto != null && linhaDoProduto.eIsProxy())
    {
      InternalEObject oldLinhaDoProduto = (InternalEObject)linhaDoProduto;
      linhaDoProduto = (CaracteristicaRaiz)eResolveProxy(oldLinhaDoProduto);
      if (linhaDoProduto != oldLinhaDoProduto)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CaracteristicaPackage.PRODUTO__LINHA_DO_PRODUTO, oldLinhaDoProduto, linhaDoProduto));
      }
    }
    return linhaDoProduto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CaracteristicaRaiz basicGetLinhaDoProduto()
  {
    return linhaDoProduto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLinhaDoProduto(CaracteristicaRaiz newLinhaDoProduto)
  {
    CaracteristicaRaiz oldLinhaDoProduto = linhaDoProduto;
    linhaDoProduto = newLinhaDoProduto;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.PRODUTO__LINHA_DO_PRODUTO, oldLinhaDoProduto, linhaDoProduto));
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
      case CaracteristicaPackage.PRODUTO__LINHA_DO_PRODUTO:
        if (resolve) return getLinhaDoProduto();
        return basicGetLinhaDoProduto();
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
      case CaracteristicaPackage.PRODUTO__LINHA_DO_PRODUTO:
        setLinhaDoProduto((CaracteristicaRaiz)newValue);
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
      case CaracteristicaPackage.PRODUTO__LINHA_DO_PRODUTO:
        setLinhaDoProduto((CaracteristicaRaiz)null);
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
      case CaracteristicaPackage.PRODUTO__LINHA_DO_PRODUTO:
        return linhaDoProduto != null;
    }
    return super.eIsSet(featureID);
  }

} //ProdutoImpl
