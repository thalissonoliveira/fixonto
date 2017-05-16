/**
 */
package caracteristica.impl;

import caracteristica.CaracteristicaPackage;
import caracteristica.CaracteristicaProduto;
import caracteristica.Estado;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Estado</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link caracteristica.impl.EstadoImpl#getNome <em>Nome</em>}</li>
 *   <li>{@link caracteristica.impl.EstadoImpl#getProduto <em>Produto</em>}</li>
 *   <li>{@link caracteristica.impl.EstadoImpl#isSafe <em>Safe</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EstadoImpl extends EObjectImpl implements Estado
{
  /**
	 * The default value of the '{@link #getNome() <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getNome()
	 * @generated
	 * @ordered
	 */
  protected static final String NOME_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getNome() <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getNome()
	 * @generated
	 * @ordered
	 */
  protected String nome = NOME_EDEFAULT;

  /**
	 * The cached value of the '{@link #getProduto() <em>Produto</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getProduto()
	 * @generated
	 * @ordered
	 */
  protected CaracteristicaProduto produto;

  /**
	 * The default value of the '{@link #isSafe() <em>Safe</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isSafe()
	 * @generated
	 * @ordered
	 */
  protected static final boolean SAFE_EDEFAULT = false;

  /**
	 * The cached value of the '{@link #isSafe() <em>Safe</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isSafe()
	 * @generated
	 * @ordered
	 */
  protected boolean safe = SAFE_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected EstadoImpl()
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
		return CaracteristicaPackage.Literals.ESTADO;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getNome()
  {
		return nome;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setNome(String newNome)
  {
		String oldNome = nome;
		nome = newNome;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.ESTADO__NOME, oldNome, nome));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public CaracteristicaProduto getProduto()
  {
		if (produto != null && produto.eIsProxy()) {
			InternalEObject oldProduto = (InternalEObject)produto;
			produto = (CaracteristicaProduto)eResolveProxy(oldProduto);
			if (produto != oldProduto) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CaracteristicaPackage.ESTADO__PRODUTO, oldProduto, produto));
			}
		}
		return produto;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public CaracteristicaProduto basicGetProduto()
  {
		return produto;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setProduto(CaracteristicaProduto newProduto)
  {
		CaracteristicaProduto oldProduto = produto;
		produto = newProduto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.ESTADO__PRODUTO, oldProduto, produto));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isSafe()
  {
		return safe;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setSafe(boolean newSafe)
  {
		boolean oldSafe = safe;
		safe = newSafe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.ESTADO__SAFE, oldSafe, safe));
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
			case CaracteristicaPackage.ESTADO__NOME:
				return getNome();
			case CaracteristicaPackage.ESTADO__PRODUTO:
				if (resolve) return getProduto();
				return basicGetProduto();
			case CaracteristicaPackage.ESTADO__SAFE:
				return isSafe();
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
			case CaracteristicaPackage.ESTADO__NOME:
				setNome((String)newValue);
				return;
			case CaracteristicaPackage.ESTADO__PRODUTO:
				setProduto((CaracteristicaProduto)newValue);
				return;
			case CaracteristicaPackage.ESTADO__SAFE:
				setSafe((Boolean)newValue);
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
			case CaracteristicaPackage.ESTADO__NOME:
				setNome(NOME_EDEFAULT);
				return;
			case CaracteristicaPackage.ESTADO__PRODUTO:
				setProduto((CaracteristicaProduto)null);
				return;
			case CaracteristicaPackage.ESTADO__SAFE:
				setSafe(SAFE_EDEFAULT);
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
			case CaracteristicaPackage.ESTADO__NOME:
				return NOME_EDEFAULT == null ? nome != null : !NOME_EDEFAULT.equals(nome);
			case CaracteristicaPackage.ESTADO__PRODUTO:
				return produto != null;
			case CaracteristicaPackage.ESTADO__SAFE:
				return safe != SAFE_EDEFAULT;
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
		result.append(" (nome: ");
		result.append(nome);
		result.append(", safe: ");
		result.append(safe);
		result.append(')');
		return result.toString();
	}

} //EstadoImpl
