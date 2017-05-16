/**
 */
package caracteristica.impl;

import caracteristica.CaracteristicaPackage;
import caracteristica.Elemento;
import caracteristica.ElementoDeProduto;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elementode Produto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link caracteristica.impl.ElementoDeProdutoImpl#getNome <em>Nome</em>}</li>
 *   <li>{@link caracteristica.impl.ElementoDeProdutoImpl#getElementoOriginal <em>Elemento Original</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementoDeProdutoImpl extends EObjectImpl implements ElementoDeProduto
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
	 * The cached value of the '{@link #getElementoOriginal() <em>Elemento Original</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getElementoOriginal()
	 * @generated
	 * @ordered
	 */
  protected Elemento elementoOriginal;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ElementoDeProdutoImpl()
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
		return CaracteristicaPackage.Literals.ELEMENTO_DE_PRODUTO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.ELEMENTO_DE_PRODUTO__NOME, oldNome, nome));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Elemento getElementoOriginal()
  {
		if (elementoOriginal != null && elementoOriginal.eIsProxy()) {
			InternalEObject oldElementoOriginal = (InternalEObject)elementoOriginal;
			elementoOriginal = (Elemento)eResolveProxy(oldElementoOriginal);
			if (elementoOriginal != oldElementoOriginal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CaracteristicaPackage.ELEMENTO_DE_PRODUTO__ELEMENTO_ORIGINAL, oldElementoOriginal, elementoOriginal));
			}
		}
		return elementoOriginal;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Elemento basicGetElementoOriginal()
  {
		return elementoOriginal;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setElementoOriginal(Elemento newElementoOriginal)
  {
		Elemento oldElementoOriginal = elementoOriginal;
		elementoOriginal = newElementoOriginal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.ELEMENTO_DE_PRODUTO__ELEMENTO_ORIGINAL, oldElementoOriginal, elementoOriginal));
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
			case CaracteristicaPackage.ELEMENTO_DE_PRODUTO__NOME:
				return getNome();
			case CaracteristicaPackage.ELEMENTO_DE_PRODUTO__ELEMENTO_ORIGINAL:
				if (resolve) return getElementoOriginal();
				return basicGetElementoOriginal();
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
			case CaracteristicaPackage.ELEMENTO_DE_PRODUTO__NOME:
				setNome((String)newValue);
				return;
			case CaracteristicaPackage.ELEMENTO_DE_PRODUTO__ELEMENTO_ORIGINAL:
				setElementoOriginal((Elemento)newValue);
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
			case CaracteristicaPackage.ELEMENTO_DE_PRODUTO__NOME:
				setNome(NOME_EDEFAULT);
				return;
			case CaracteristicaPackage.ELEMENTO_DE_PRODUTO__ELEMENTO_ORIGINAL:
				setElementoOriginal((Elemento)null);
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
			case CaracteristicaPackage.ELEMENTO_DE_PRODUTO__NOME:
				return NOME_EDEFAULT == null ? nome != null : !NOME_EDEFAULT.equals(nome);
			case CaracteristicaPackage.ELEMENTO_DE_PRODUTO__ELEMENTO_ORIGINAL:
				return elementoOriginal != null;
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
		result.append(')');
		return result.toString();
	}

} //ElementodeProdutoImpl
