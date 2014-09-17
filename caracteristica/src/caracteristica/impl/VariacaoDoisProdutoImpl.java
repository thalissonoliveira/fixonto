/**
 */
package caracteristica.impl;

import caracteristica.AtributoProduto;
import caracteristica.CaracteristicaPackage;
import caracteristica.CaracteristicaProduto;
import caracteristica.CardinalidadeMaxima;
import caracteristica.VariacaoDoisProduto;

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
 * An implementation of the model object '<em><b>Variacao Dois Produto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link caracteristica.impl.VariacaoDoisProdutoImpl#getCaracteristicaProdutoPai <em>Caracteristica Produto Pai</em>}</li>
 *   <li>{@link caracteristica.impl.VariacaoDoisProdutoImpl#getCaracteristicaProdutoFilha <em>Caracteristica Produto Filha</em>}</li>
 *   <li>{@link caracteristica.impl.VariacaoDoisProdutoImpl#getAtributoProduto <em>Atributo Produto</em>}</li>
 *   <li>{@link caracteristica.impl.VariacaoDoisProdutoImpl#getCardinalidadeMaxima <em>Cardinalidade Maxima</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariacaoDoisProdutoImpl extends ElementoDeProdutoImpl implements VariacaoDoisProduto
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
   * The default value of the '{@link #getCardinalidadeMaxima() <em>Cardinalidade Maxima</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCardinalidadeMaxima()
   * @generated
   * @ordered
   */
  protected static final CardinalidadeMaxima CARDINALIDADE_MAXIMA_EDEFAULT = CardinalidadeMaxima.OR;

  /**
   * The cached value of the '{@link #getCardinalidadeMaxima() <em>Cardinalidade Maxima</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCardinalidadeMaxima()
   * @generated
   * @ordered
   */
  protected CardinalidadeMaxima cardinalidadeMaxima = CARDINALIDADE_MAXIMA_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariacaoDoisProdutoImpl()
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
    return CaracteristicaPackage.Literals.VARIACAO_DOIS_PRODUTO;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CaracteristicaPackage.VARIACAO_DOIS_PRODUTO__CARACTERISTICA_PRODUTO_PAI, oldCaracteristicaProdutoPai, caracteristicaProdutoPai));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.VARIACAO_DOIS_PRODUTO__CARACTERISTICA_PRODUTO_PAI, oldCaracteristicaProdutoPai, newCaracteristicaProdutoPai);
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
      eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.VARIACAO_DOIS_PRODUTO__CARACTERISTICA_PRODUTO_PAI, newCaracteristicaProdutoPai, newCaracteristicaProdutoPai));
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
      caracteristicaProdutoFilha = new EObjectWithInverseResolvingEList<CaracteristicaProduto>(CaracteristicaProduto.class, this, CaracteristicaPackage.VARIACAO_DOIS_PRODUTO__CARACTERISTICA_PRODUTO_FILHA, CaracteristicaPackage.CARACTERISTICA_PRODUTO__CARACTERISTICA_PRODUTO_PAI);
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
      atributoProduto = new EObjectWithInverseResolvingEList<AtributoProduto>(AtributoProduto.class, this, CaracteristicaPackage.VARIACAO_DOIS_PRODUTO__ATRIBUTO_PRODUTO, CaracteristicaPackage.ATRIBUTO_PRODUTO__CARACTERISTICA_PRODUTO_PAI);
    }
    return atributoProduto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CardinalidadeMaxima getCardinalidadeMaxima()
  {
    return cardinalidadeMaxima;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCardinalidadeMaxima(CardinalidadeMaxima newCardinalidadeMaxima)
  {
    CardinalidadeMaxima oldCardinalidadeMaxima = cardinalidadeMaxima;
    cardinalidadeMaxima = newCardinalidadeMaxima == null ? CARDINALIDADE_MAXIMA_EDEFAULT : newCardinalidadeMaxima;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.VARIACAO_DOIS_PRODUTO__CARDINALIDADE_MAXIMA, oldCardinalidadeMaxima, cardinalidadeMaxima));
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
      case CaracteristicaPackage.VARIACAO_DOIS_PRODUTO__CARACTERISTICA_PRODUTO_PAI:
        if (caracteristicaProdutoPai != null)
          msgs = ((InternalEObject)caracteristicaProdutoPai).eInverseRemove(this, CaracteristicaPackage.CARACTERISTICA_PRODUTO__CARACTERISTICA_PRODUTO_FILHA, CaracteristicaProduto.class, msgs);
        return basicSetCaracteristicaProdutoPai((CaracteristicaProduto)otherEnd, msgs);
      case CaracteristicaPackage.VARIACAO_DOIS_PRODUTO__CARACTERISTICA_PRODUTO_FILHA:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getCaracteristicaProdutoFilha()).basicAdd(otherEnd, msgs);
      case CaracteristicaPackage.VARIACAO_DOIS_PRODUTO__ATRIBUTO_PRODUTO:
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
      case CaracteristicaPackage.VARIACAO_DOIS_PRODUTO__CARACTERISTICA_PRODUTO_PAI:
        return basicSetCaracteristicaProdutoPai(null, msgs);
      case CaracteristicaPackage.VARIACAO_DOIS_PRODUTO__CARACTERISTICA_PRODUTO_FILHA:
        return ((InternalEList<?>)getCaracteristicaProdutoFilha()).basicRemove(otherEnd, msgs);
      case CaracteristicaPackage.VARIACAO_DOIS_PRODUTO__ATRIBUTO_PRODUTO:
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
      case CaracteristicaPackage.VARIACAO_DOIS_PRODUTO__CARACTERISTICA_PRODUTO_PAI:
        if (resolve) return getCaracteristicaProdutoPai();
        return basicGetCaracteristicaProdutoPai();
      case CaracteristicaPackage.VARIACAO_DOIS_PRODUTO__CARACTERISTICA_PRODUTO_FILHA:
        return getCaracteristicaProdutoFilha();
      case CaracteristicaPackage.VARIACAO_DOIS_PRODUTO__ATRIBUTO_PRODUTO:
        return getAtributoProduto();
      case CaracteristicaPackage.VARIACAO_DOIS_PRODUTO__CARDINALIDADE_MAXIMA:
        return getCardinalidadeMaxima();
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
      case CaracteristicaPackage.VARIACAO_DOIS_PRODUTO__CARACTERISTICA_PRODUTO_PAI:
        setCaracteristicaProdutoPai((CaracteristicaProduto)newValue);
        return;
      case CaracteristicaPackage.VARIACAO_DOIS_PRODUTO__CARACTERISTICA_PRODUTO_FILHA:
        getCaracteristicaProdutoFilha().clear();
        getCaracteristicaProdutoFilha().addAll((Collection<? extends CaracteristicaProduto>)newValue);
        return;
      case CaracteristicaPackage.VARIACAO_DOIS_PRODUTO__ATRIBUTO_PRODUTO:
        getAtributoProduto().clear();
        getAtributoProduto().addAll((Collection<? extends AtributoProduto>)newValue);
        return;
      case CaracteristicaPackage.VARIACAO_DOIS_PRODUTO__CARDINALIDADE_MAXIMA:
        setCardinalidadeMaxima((CardinalidadeMaxima)newValue);
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
      case CaracteristicaPackage.VARIACAO_DOIS_PRODUTO__CARACTERISTICA_PRODUTO_PAI:
        setCaracteristicaProdutoPai((CaracteristicaProduto)null);
        return;
      case CaracteristicaPackage.VARIACAO_DOIS_PRODUTO__CARACTERISTICA_PRODUTO_FILHA:
        getCaracteristicaProdutoFilha().clear();
        return;
      case CaracteristicaPackage.VARIACAO_DOIS_PRODUTO__ATRIBUTO_PRODUTO:
        getAtributoProduto().clear();
        return;
      case CaracteristicaPackage.VARIACAO_DOIS_PRODUTO__CARDINALIDADE_MAXIMA:
        setCardinalidadeMaxima(CARDINALIDADE_MAXIMA_EDEFAULT);
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
      case CaracteristicaPackage.VARIACAO_DOIS_PRODUTO__CARACTERISTICA_PRODUTO_PAI:
        return caracteristicaProdutoPai != null;
      case CaracteristicaPackage.VARIACAO_DOIS_PRODUTO__CARACTERISTICA_PRODUTO_FILHA:
        return caracteristicaProdutoFilha != null && !caracteristicaProdutoFilha.isEmpty();
      case CaracteristicaPackage.VARIACAO_DOIS_PRODUTO__ATRIBUTO_PRODUTO:
        return atributoProduto != null && !atributoProduto.isEmpty();
      case CaracteristicaPackage.VARIACAO_DOIS_PRODUTO__CARDINALIDADE_MAXIMA:
        return cardinalidadeMaxima != CARDINALIDADE_MAXIMA_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == CaracteristicaProduto.class)
    {
      switch (derivedFeatureID)
      {
        case CaracteristicaPackage.VARIACAO_DOIS_PRODUTO__CARACTERISTICA_PRODUTO_PAI: return CaracteristicaPackage.CARACTERISTICA_PRODUTO__CARACTERISTICA_PRODUTO_PAI;
        case CaracteristicaPackage.VARIACAO_DOIS_PRODUTO__CARACTERISTICA_PRODUTO_FILHA: return CaracteristicaPackage.CARACTERISTICA_PRODUTO__CARACTERISTICA_PRODUTO_FILHA;
        case CaracteristicaPackage.VARIACAO_DOIS_PRODUTO__ATRIBUTO_PRODUTO: return CaracteristicaPackage.CARACTERISTICA_PRODUTO__ATRIBUTO_PRODUTO;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == CaracteristicaProduto.class)
    {
      switch (baseFeatureID)
      {
        case CaracteristicaPackage.CARACTERISTICA_PRODUTO__CARACTERISTICA_PRODUTO_PAI: return CaracteristicaPackage.VARIACAO_DOIS_PRODUTO__CARACTERISTICA_PRODUTO_PAI;
        case CaracteristicaPackage.CARACTERISTICA_PRODUTO__CARACTERISTICA_PRODUTO_FILHA: return CaracteristicaPackage.VARIACAO_DOIS_PRODUTO__CARACTERISTICA_PRODUTO_FILHA;
        case CaracteristicaPackage.CARACTERISTICA_PRODUTO__ATRIBUTO_PRODUTO: return CaracteristicaPackage.VARIACAO_DOIS_PRODUTO__ATRIBUTO_PRODUTO;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    result.append(" (cardinalidadeMaxima: ");
    result.append(cardinalidadeMaxima);
    result.append(')');
    return result.toString();
  }

} //VariacaoDoisProdutoImpl
