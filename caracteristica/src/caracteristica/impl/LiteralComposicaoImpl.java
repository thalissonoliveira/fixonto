/**
 */
package caracteristica.impl;

import caracteristica.CaracteristicaPackage;
import caracteristica.ElementoCaracteristico;
import caracteristica.LiteralComposicao;
import caracteristica.Presenca;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Literal Composicao</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link caracteristica.impl.LiteralComposicaoImpl#getPresenca <em>Presenca</em>}</li>
 *   <li>{@link caracteristica.impl.LiteralComposicaoImpl#getElemento <em>Elemento</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LiteralComposicaoImpl extends AntecedenteImpl implements LiteralComposicao
{
  /**
	 * The default value of the '{@link #getPresenca() <em>Presenca</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getPresenca()
	 * @generated
	 * @ordered
	 */
  protected static final Presenca PRESENCA_EDEFAULT = Presenca.PRESENTE;

  /**
	 * The cached value of the '{@link #getPresenca() <em>Presenca</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getPresenca()
	 * @generated
	 * @ordered
	 */
  protected Presenca presenca = PRESENCA_EDEFAULT;

  /**
	 * The cached value of the '{@link #getElemento() <em>Elemento</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getElemento()
	 * @generated
	 * @ordered
	 */
  protected ElementoCaracteristico elemento;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected LiteralComposicaoImpl()
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
		return CaracteristicaPackage.Literals.LITERAL_COMPOSICAO;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Presenca getPresenca()
  {
		return presenca;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setPresenca(Presenca newPresenca)
  {
		Presenca oldPresenca = presenca;
		presenca = newPresenca == null ? PRESENCA_EDEFAULT : newPresenca;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.LITERAL_COMPOSICAO__PRESENCA, oldPresenca, presenca));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ElementoCaracteristico getElemento()
  {
		if (elemento != null && elemento.eIsProxy()) {
			InternalEObject oldElemento = (InternalEObject)elemento;
			elemento = (ElementoCaracteristico)eResolveProxy(oldElemento);
			if (elemento != oldElemento) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CaracteristicaPackage.LITERAL_COMPOSICAO__ELEMENTO, oldElemento, elemento));
			}
		}
		return elemento;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ElementoCaracteristico basicGetElemento()
  {
		return elemento;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setElemento(ElementoCaracteristico newElemento)
  {
		ElementoCaracteristico oldElemento = elemento;
		elemento = newElemento;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.LITERAL_COMPOSICAO__ELEMENTO, oldElemento, elemento));
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
			case CaracteristicaPackage.LITERAL_COMPOSICAO__PRESENCA:
				return getPresenca();
			case CaracteristicaPackage.LITERAL_COMPOSICAO__ELEMENTO:
				if (resolve) return getElemento();
				return basicGetElemento();
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
			case CaracteristicaPackage.LITERAL_COMPOSICAO__PRESENCA:
				setPresenca((Presenca)newValue);
				return;
			case CaracteristicaPackage.LITERAL_COMPOSICAO__ELEMENTO:
				setElemento((ElementoCaracteristico)newValue);
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
			case CaracteristicaPackage.LITERAL_COMPOSICAO__PRESENCA:
				setPresenca(PRESENCA_EDEFAULT);
				return;
			case CaracteristicaPackage.LITERAL_COMPOSICAO__ELEMENTO:
				setElemento((ElementoCaracteristico)null);
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
			case CaracteristicaPackage.LITERAL_COMPOSICAO__PRESENCA:
				return presenca != PRESENCA_EDEFAULT;
			case CaracteristicaPackage.LITERAL_COMPOSICAO__ELEMENTO:
				return elemento != null;
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
		result.append(" (presenca: ");
		result.append(presenca);
		result.append(')');
		return result.toString();
	}

} //LiteralComposicaoImpl
