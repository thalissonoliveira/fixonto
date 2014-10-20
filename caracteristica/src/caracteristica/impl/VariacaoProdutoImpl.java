/**
 */
package caracteristica.impl;

import caracteristica.CaracteristicaPackage;
import caracteristica.CaracteristicaProduto;
import caracteristica.VariacaoProduto;
import caracteristica.VarianteProduto;

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
 * An implementation of the model object '<em><b>Variacao Produto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link caracteristica.impl.VariacaoProdutoImpl#getCardinalidadeMinima <em>Cardinalidade Minima</em>}</li>
 *   <li>{@link caracteristica.impl.VariacaoProdutoImpl#getCardinalidadeMaxima <em>Cardinalidade Maxima</em>}</li>
 *   <li>{@link caracteristica.impl.VariacaoProdutoImpl#getVariantesProduto <em>Variantes Produto</em>}</li>
 *   <li>{@link caracteristica.impl.VariacaoProdutoImpl#getCaracteristicaProdutoPai <em>Caracteristica Produto Pai</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariacaoProdutoImpl extends ElementoDeProdutoImpl implements VariacaoProduto
{
  /**
	 * The default value of the '{@link #getCardinalidadeMinima() <em>Cardinalidade Minima</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getCardinalidadeMinima()
	 * @generated
	 * @ordered
	 */
  protected static final Integer CARDINALIDADE_MINIMA_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getCardinalidadeMinima() <em>Cardinalidade Minima</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getCardinalidadeMinima()
	 * @generated
	 * @ordered
	 */
  protected Integer cardinalidadeMinima = CARDINALIDADE_MINIMA_EDEFAULT;

  /**
	 * The default value of the '{@link #getCardinalidadeMaxima() <em>Cardinalidade Maxima</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getCardinalidadeMaxima()
	 * @generated
	 * @ordered
	 */
  protected static final Integer CARDINALIDADE_MAXIMA_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getCardinalidadeMaxima() <em>Cardinalidade Maxima</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getCardinalidadeMaxima()
	 * @generated
	 * @ordered
	 */
  protected Integer cardinalidadeMaxima = CARDINALIDADE_MAXIMA_EDEFAULT;

  /**
	 * The cached value of the '{@link #getVariantesProduto() <em>Variantes Produto</em>}' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getVariantesProduto()
	 * @generated
	 * @ordered
	 */
  protected EList<VarianteProduto> variantesProduto;

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
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected VariacaoProdutoImpl()
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
		return CaracteristicaPackage.Literals.VARIACAO_PRODUTO;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Integer getCardinalidadeMinima()
  {
		return cardinalidadeMinima;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setCardinalidadeMinima(Integer newCardinalidadeMinima)
  {
		Integer oldCardinalidadeMinima = cardinalidadeMinima;
		cardinalidadeMinima = newCardinalidadeMinima;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.VARIACAO_PRODUTO__CARDINALIDADE_MINIMA, oldCardinalidadeMinima, cardinalidadeMinima));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Integer getCardinalidadeMaxima()
  {
		return cardinalidadeMaxima;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setCardinalidadeMaxima(Integer newCardinalidadeMaxima)
  {
		Integer oldCardinalidadeMaxima = cardinalidadeMaxima;
		cardinalidadeMaxima = newCardinalidadeMaxima;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.VARIACAO_PRODUTO__CARDINALIDADE_MAXIMA, oldCardinalidadeMaxima, cardinalidadeMaxima));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<VarianteProduto> getVariantesProduto()
  {
		if (variantesProduto == null) {
			variantesProduto = new EObjectWithInverseResolvingEList<VarianteProduto>(VarianteProduto.class, this, CaracteristicaPackage.VARIACAO_PRODUTO__VARIANTES_PRODUTO, CaracteristicaPackage.VARIANTE_PRODUTO__VARIACAO_PRODUTO_PAI);
		}
		return variantesProduto;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public CaracteristicaProduto getCaracteristicaProdutoPai()
  {
		if (caracteristicaProdutoPai != null && caracteristicaProdutoPai.eIsProxy()) {
			InternalEObject oldCaracteristicaProdutoPai = (InternalEObject)caracteristicaProdutoPai;
			caracteristicaProdutoPai = (CaracteristicaProduto)eResolveProxy(oldCaracteristicaProdutoPai);
			if (caracteristicaProdutoPai != oldCaracteristicaProdutoPai) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CaracteristicaPackage.VARIACAO_PRODUTO__CARACTERISTICA_PRODUTO_PAI, oldCaracteristicaProdutoPai, caracteristicaProdutoPai));
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
  public void setCaracteristicaProdutoPai(CaracteristicaProduto newCaracteristicaProdutoPai)
  {
		CaracteristicaProduto oldCaracteristicaProdutoPai = caracteristicaProdutoPai;
		caracteristicaProdutoPai = newCaracteristicaProdutoPai;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.VARIACAO_PRODUTO__CARACTERISTICA_PRODUTO_PAI, oldCaracteristicaProdutoPai, caracteristicaProdutoPai));
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
		switch (featureID) {
			case CaracteristicaPackage.VARIACAO_PRODUTO__VARIANTES_PRODUTO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVariantesProduto()).basicAdd(otherEnd, msgs);
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
		switch (featureID) {
			case CaracteristicaPackage.VARIACAO_PRODUTO__VARIANTES_PRODUTO:
				return ((InternalEList<?>)getVariantesProduto()).basicRemove(otherEnd, msgs);
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
		switch (featureID) {
			case CaracteristicaPackage.VARIACAO_PRODUTO__CARDINALIDADE_MINIMA:
				return getCardinalidadeMinima();
			case CaracteristicaPackage.VARIACAO_PRODUTO__CARDINALIDADE_MAXIMA:
				return getCardinalidadeMaxima();
			case CaracteristicaPackage.VARIACAO_PRODUTO__VARIANTES_PRODUTO:
				return getVariantesProduto();
			case CaracteristicaPackage.VARIACAO_PRODUTO__CARACTERISTICA_PRODUTO_PAI:
				if (resolve) return getCaracteristicaProdutoPai();
				return basicGetCaracteristicaProdutoPai();
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
		switch (featureID) {
			case CaracteristicaPackage.VARIACAO_PRODUTO__CARDINALIDADE_MINIMA:
				setCardinalidadeMinima((Integer)newValue);
				return;
			case CaracteristicaPackage.VARIACAO_PRODUTO__CARDINALIDADE_MAXIMA:
				setCardinalidadeMaxima((Integer)newValue);
				return;
			case CaracteristicaPackage.VARIACAO_PRODUTO__VARIANTES_PRODUTO:
				getVariantesProduto().clear();
				getVariantesProduto().addAll((Collection<? extends VarianteProduto>)newValue);
				return;
			case CaracteristicaPackage.VARIACAO_PRODUTO__CARACTERISTICA_PRODUTO_PAI:
				setCaracteristicaProdutoPai((CaracteristicaProduto)newValue);
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
			case CaracteristicaPackage.VARIACAO_PRODUTO__CARDINALIDADE_MINIMA:
				setCardinalidadeMinima(CARDINALIDADE_MINIMA_EDEFAULT);
				return;
			case CaracteristicaPackage.VARIACAO_PRODUTO__CARDINALIDADE_MAXIMA:
				setCardinalidadeMaxima(CARDINALIDADE_MAXIMA_EDEFAULT);
				return;
			case CaracteristicaPackage.VARIACAO_PRODUTO__VARIANTES_PRODUTO:
				getVariantesProduto().clear();
				return;
			case CaracteristicaPackage.VARIACAO_PRODUTO__CARACTERISTICA_PRODUTO_PAI:
				setCaracteristicaProdutoPai((CaracteristicaProduto)null);
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
			case CaracteristicaPackage.VARIACAO_PRODUTO__CARDINALIDADE_MINIMA:
				return CARDINALIDADE_MINIMA_EDEFAULT == null ? cardinalidadeMinima != null : !CARDINALIDADE_MINIMA_EDEFAULT.equals(cardinalidadeMinima);
			case CaracteristicaPackage.VARIACAO_PRODUTO__CARDINALIDADE_MAXIMA:
				return CARDINALIDADE_MAXIMA_EDEFAULT == null ? cardinalidadeMaxima != null : !CARDINALIDADE_MAXIMA_EDEFAULT.equals(cardinalidadeMaxima);
			case CaracteristicaPackage.VARIACAO_PRODUTO__VARIANTES_PRODUTO:
				return variantesProduto != null && !variantesProduto.isEmpty();
			case CaracteristicaPackage.VARIACAO_PRODUTO__CARACTERISTICA_PRODUTO_PAI:
				return caracteristicaProdutoPai != null;
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
		result.append(" (cardinalidadeMinima: ");
		result.append(cardinalidadeMinima);
		result.append(", cardinalidadeMaxima: ");
		result.append(cardinalidadeMaxima);
		result.append(')');
		return result.toString();
	}

} //VariacaoProdutoImpl
