/**
 */
package caracteristica.impl;

import caracteristica.AtributoProduto;
import caracteristica.CaracteristicaPackage;
import caracteristica.CaracteristicaProduto;
import caracteristica.TipoValor;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atributo Produto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link caracteristica.impl.AtributoProdutoImpl#getValor <em>Valor</em>}</li>
 *   <li>{@link caracteristica.impl.AtributoProdutoImpl#getTipoValor <em>Tipo Valor</em>}</li>
 *   <li>{@link caracteristica.impl.AtributoProdutoImpl#getCaracteristicaProdutoPai <em>Caracteristica Produto Pai</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AtributoProdutoImpl extends ElementoDeProdutoImpl implements AtributoProduto
{
  /**
	 * The default value of the '{@link #getValor() <em>Valor</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getValor()
	 * @generated
	 * @ordered
	 */
  protected static final String VALOR_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getValor() <em>Valor</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getValor()
	 * @generated
	 * @ordered
	 */
  protected String valor = VALOR_EDEFAULT;

  /**
	 * The default value of the '{@link #getTipoValor() <em>Tipo Valor</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTipoValor()
	 * @generated
	 * @ordered
	 */
  protected static final TipoValor TIPO_VALOR_EDEFAULT = TipoValor.TINTEGER;

  /**
	 * The cached value of the '{@link #getTipoValor() <em>Tipo Valor</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTipoValor()
	 * @generated
	 * @ordered
	 */
  protected TipoValor tipoValor = TIPO_VALOR_EDEFAULT;

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
  protected AtributoProdutoImpl()
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
		return CaracteristicaPackage.Literals.ATRIBUTO_PRODUTO;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getValor()
  {
		return valor;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setValor(String newValor)
  {
		String oldValor = valor;
		valor = newValor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.ATRIBUTO_PRODUTO__VALOR, oldValor, valor));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TipoValor getTipoValor()
  {
		return tipoValor;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setTipoValor(TipoValor newTipoValor)
  {
		TipoValor oldTipoValor = tipoValor;
		tipoValor = newTipoValor == null ? TIPO_VALOR_EDEFAULT : newTipoValor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.ATRIBUTO_PRODUTO__TIPO_VALOR, oldTipoValor, tipoValor));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CaracteristicaPackage.ATRIBUTO_PRODUTO__CARACTERISTICA_PRODUTO_PAI, oldCaracteristicaProdutoPai, caracteristicaProdutoPai));
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
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.ATRIBUTO_PRODUTO__CARACTERISTICA_PRODUTO_PAI, oldCaracteristicaProdutoPai, newCaracteristicaProdutoPai);
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
		if (newCaracteristicaProdutoPai != caracteristicaProdutoPai) {
			NotificationChain msgs = null;
			if (caracteristicaProdutoPai != null)
				msgs = ((InternalEObject)caracteristicaProdutoPai).eInverseRemove(this, CaracteristicaPackage.CARACTERISTICA_PRODUTO__ATRIBUTO_PRODUTO, CaracteristicaProduto.class, msgs);
			if (newCaracteristicaProdutoPai != null)
				msgs = ((InternalEObject)newCaracteristicaProdutoPai).eInverseAdd(this, CaracteristicaPackage.CARACTERISTICA_PRODUTO__ATRIBUTO_PRODUTO, CaracteristicaProduto.class, msgs);
			msgs = basicSetCaracteristicaProdutoPai(newCaracteristicaProdutoPai, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.ATRIBUTO_PRODUTO__CARACTERISTICA_PRODUTO_PAI, newCaracteristicaProdutoPai, newCaracteristicaProdutoPai));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case CaracteristicaPackage.ATRIBUTO_PRODUTO__CARACTERISTICA_PRODUTO_PAI:
				if (caracteristicaProdutoPai != null)
					msgs = ((InternalEObject)caracteristicaProdutoPai).eInverseRemove(this, CaracteristicaPackage.CARACTERISTICA_PRODUTO__ATRIBUTO_PRODUTO, CaracteristicaProduto.class, msgs);
				return basicSetCaracteristicaProdutoPai((CaracteristicaProduto)otherEnd, msgs);
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
			case CaracteristicaPackage.ATRIBUTO_PRODUTO__CARACTERISTICA_PRODUTO_PAI:
				return basicSetCaracteristicaProdutoPai(null, msgs);
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
			case CaracteristicaPackage.ATRIBUTO_PRODUTO__VALOR:
				return getValor();
			case CaracteristicaPackage.ATRIBUTO_PRODUTO__TIPO_VALOR:
				return getTipoValor();
			case CaracteristicaPackage.ATRIBUTO_PRODUTO__CARACTERISTICA_PRODUTO_PAI:
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
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case CaracteristicaPackage.ATRIBUTO_PRODUTO__VALOR:
				setValor((String)newValue);
				return;
			case CaracteristicaPackage.ATRIBUTO_PRODUTO__TIPO_VALOR:
				setTipoValor((TipoValor)newValue);
				return;
			case CaracteristicaPackage.ATRIBUTO_PRODUTO__CARACTERISTICA_PRODUTO_PAI:
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
			case CaracteristicaPackage.ATRIBUTO_PRODUTO__VALOR:
				setValor(VALOR_EDEFAULT);
				return;
			case CaracteristicaPackage.ATRIBUTO_PRODUTO__TIPO_VALOR:
				setTipoValor(TIPO_VALOR_EDEFAULT);
				return;
			case CaracteristicaPackage.ATRIBUTO_PRODUTO__CARACTERISTICA_PRODUTO_PAI:
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
			case CaracteristicaPackage.ATRIBUTO_PRODUTO__VALOR:
				return VALOR_EDEFAULT == null ? valor != null : !VALOR_EDEFAULT.equals(valor);
			case CaracteristicaPackage.ATRIBUTO_PRODUTO__TIPO_VALOR:
				return tipoValor != TIPO_VALOR_EDEFAULT;
			case CaracteristicaPackage.ATRIBUTO_PRODUTO__CARACTERISTICA_PRODUTO_PAI:
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
		result.append(" (valor: ");
		result.append(valor);
		result.append(", tipoValor: ");
		result.append(tipoValor);
		result.append(')');
		return result.toString();
	}

} //AtributoProdutoImpl
