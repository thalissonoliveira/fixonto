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
 *   <li>{@link caracteristica.impl.VariacaoDoisProdutoImpl#getCardinalidadeMaxima <em>Cardinalidade Maxima</em>}</li>
 *   <li>{@link caracteristica.impl.VariacaoDoisProdutoImpl#getCardinalidadeMinimaOr <em>Cardinalidade Minima Or</em>}</li>
 *   <li>{@link caracteristica.impl.VariacaoDoisProdutoImpl#getCardinalidadeMaximaOr <em>Cardinalidade Maxima Or</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariacaoDoisProdutoImpl extends CaracteristicaProdutoImpl implements VariacaoDoisProduto
{
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
	 * The default value of the '{@link #getCardinalidadeMinimaOr() <em>Cardinalidade Minima Or</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinalidadeMinimaOr()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CARDINALIDADE_MINIMA_OR_EDEFAULT = null;

		/**
	 * The cached value of the '{@link #getCardinalidadeMinimaOr() <em>Cardinalidade Minima Or</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinalidadeMinimaOr()
	 * @generated
	 * @ordered
	 */
	protected Integer cardinalidadeMinimaOr = CARDINALIDADE_MINIMA_OR_EDEFAULT;

		/**
	 * The default value of the '{@link #getCardinalidadeMaximaOr() <em>Cardinalidade Maxima Or</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinalidadeMaximaOr()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CARDINALIDADE_MAXIMA_OR_EDEFAULT = null;

		/**
	 * The cached value of the '{@link #getCardinalidadeMaximaOr() <em>Cardinalidade Maxima Or</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinalidadeMaximaOr()
	 * @generated
	 * @ordered
	 */
	protected Integer cardinalidadeMaximaOr = CARDINALIDADE_MAXIMA_OR_EDEFAULT;

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
	public Integer getCardinalidadeMinimaOr() {
		return cardinalidadeMinimaOr;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinalidadeMinimaOr(Integer newCardinalidadeMinimaOr) {
		Integer oldCardinalidadeMinimaOr = cardinalidadeMinimaOr;
		cardinalidadeMinimaOr = newCardinalidadeMinimaOr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.VARIACAO_DOIS_PRODUTO__CARDINALIDADE_MINIMA_OR, oldCardinalidadeMinimaOr, cardinalidadeMinimaOr));
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCardinalidadeMaximaOr() {
		return cardinalidadeMaximaOr;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinalidadeMaximaOr(Integer newCardinalidadeMaximaOr) {
		Integer oldCardinalidadeMaximaOr = cardinalidadeMaximaOr;
		cardinalidadeMaximaOr = newCardinalidadeMaximaOr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.VARIACAO_DOIS_PRODUTO__CARDINALIDADE_MAXIMA_OR, oldCardinalidadeMaximaOr, cardinalidadeMaximaOr));
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
			case CaracteristicaPackage.VARIACAO_DOIS_PRODUTO__CARDINALIDADE_MAXIMA:
				return getCardinalidadeMaxima();
			case CaracteristicaPackage.VARIACAO_DOIS_PRODUTO__CARDINALIDADE_MINIMA_OR:
				return getCardinalidadeMinimaOr();
			case CaracteristicaPackage.VARIACAO_DOIS_PRODUTO__CARDINALIDADE_MAXIMA_OR:
				return getCardinalidadeMaximaOr();
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
			case CaracteristicaPackage.VARIACAO_DOIS_PRODUTO__CARDINALIDADE_MAXIMA:
				setCardinalidadeMaxima((CardinalidadeMaxima)newValue);
				return;
			case CaracteristicaPackage.VARIACAO_DOIS_PRODUTO__CARDINALIDADE_MINIMA_OR:
				setCardinalidadeMinimaOr((Integer)newValue);
				return;
			case CaracteristicaPackage.VARIACAO_DOIS_PRODUTO__CARDINALIDADE_MAXIMA_OR:
				setCardinalidadeMaximaOr((Integer)newValue);
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
			case CaracteristicaPackage.VARIACAO_DOIS_PRODUTO__CARDINALIDADE_MAXIMA:
				setCardinalidadeMaxima(CARDINALIDADE_MAXIMA_EDEFAULT);
				return;
			case CaracteristicaPackage.VARIACAO_DOIS_PRODUTO__CARDINALIDADE_MINIMA_OR:
				setCardinalidadeMinimaOr(CARDINALIDADE_MINIMA_OR_EDEFAULT);
				return;
			case CaracteristicaPackage.VARIACAO_DOIS_PRODUTO__CARDINALIDADE_MAXIMA_OR:
				setCardinalidadeMaximaOr(CARDINALIDADE_MAXIMA_OR_EDEFAULT);
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
			case CaracteristicaPackage.VARIACAO_DOIS_PRODUTO__CARDINALIDADE_MAXIMA:
				return cardinalidadeMaxima != CARDINALIDADE_MAXIMA_EDEFAULT;
			case CaracteristicaPackage.VARIACAO_DOIS_PRODUTO__CARDINALIDADE_MINIMA_OR:
				return CARDINALIDADE_MINIMA_OR_EDEFAULT == null ? cardinalidadeMinimaOr != null : !CARDINALIDADE_MINIMA_OR_EDEFAULT.equals(cardinalidadeMinimaOr);
			case CaracteristicaPackage.VARIACAO_DOIS_PRODUTO__CARDINALIDADE_MAXIMA_OR:
				return CARDINALIDADE_MAXIMA_OR_EDEFAULT == null ? cardinalidadeMaximaOr != null : !CARDINALIDADE_MAXIMA_OR_EDEFAULT.equals(cardinalidadeMaximaOr);
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
		result.append(" (cardinalidadeMaxima: ");
		result.append(cardinalidadeMaxima);
		result.append(", cardinalidadeMinimaOr: ");
		result.append(cardinalidadeMinimaOr);
		result.append(", cardinalidadeMaximaOr: ");
		result.append(cardinalidadeMaximaOr);
		result.append(')');
		return result.toString();
	}

} //VariacaoDoisProdutoImpl
