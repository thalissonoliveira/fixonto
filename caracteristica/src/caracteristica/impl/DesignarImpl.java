/**
 */
package caracteristica.impl;

import caracteristica.Atributo;
import caracteristica.CaracteristicaPackage;
import caracteristica.Designar;
import caracteristica.TipoValor;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Designar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link caracteristica.impl.DesignarImpl#getValor <em>Valor</em>}</li>
 *   <li>{@link caracteristica.impl.DesignarImpl#getAtributo <em>Atributo</em>}</li>
 *   <li>{@link caracteristica.impl.DesignarImpl#getTipoValor <em>Tipo Valor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DesignarImpl extends AcaoImpl implements Designar
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
	 * The cached value of the '{@link #getAtributo() <em>Atributo</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAtributo()
	 * @generated
	 * @ordered
	 */
  protected Atributo atributo;

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
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected DesignarImpl()
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
		return CaracteristicaPackage.Literals.DESIGNAR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.DESIGNAR__VALOR, oldValor, valor));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Atributo getAtributo()
  {
		if (atributo != null && atributo.eIsProxy()) {
			InternalEObject oldAtributo = (InternalEObject)atributo;
			atributo = (Atributo)eResolveProxy(oldAtributo);
			if (atributo != oldAtributo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CaracteristicaPackage.DESIGNAR__ATRIBUTO, oldAtributo, atributo));
			}
		}
		return atributo;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Atributo basicGetAtributo()
  {
		return atributo;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setAtributo(Atributo newAtributo)
  {
		Atributo oldAtributo = atributo;
		atributo = newAtributo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.DESIGNAR__ATRIBUTO, oldAtributo, atributo));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.DESIGNAR__TIPO_VALOR, oldTipoValor, tipoValor));
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
			case CaracteristicaPackage.DESIGNAR__VALOR:
				return getValor();
			case CaracteristicaPackage.DESIGNAR__ATRIBUTO:
				if (resolve) return getAtributo();
				return basicGetAtributo();
			case CaracteristicaPackage.DESIGNAR__TIPO_VALOR:
				return getTipoValor();
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
			case CaracteristicaPackage.DESIGNAR__VALOR:
				setValor((String)newValue);
				return;
			case CaracteristicaPackage.DESIGNAR__ATRIBUTO:
				setAtributo((Atributo)newValue);
				return;
			case CaracteristicaPackage.DESIGNAR__TIPO_VALOR:
				setTipoValor((TipoValor)newValue);
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
			case CaracteristicaPackage.DESIGNAR__VALOR:
				setValor(VALOR_EDEFAULT);
				return;
			case CaracteristicaPackage.DESIGNAR__ATRIBUTO:
				setAtributo((Atributo)null);
				return;
			case CaracteristicaPackage.DESIGNAR__TIPO_VALOR:
				setTipoValor(TIPO_VALOR_EDEFAULT);
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
			case CaracteristicaPackage.DESIGNAR__VALOR:
				return VALOR_EDEFAULT == null ? valor != null : !VALOR_EDEFAULT.equals(valor);
			case CaracteristicaPackage.DESIGNAR__ATRIBUTO:
				return atributo != null;
			case CaracteristicaPackage.DESIGNAR__TIPO_VALOR:
				return tipoValor != TIPO_VALOR_EDEFAULT;
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

} //DesignarImpl
