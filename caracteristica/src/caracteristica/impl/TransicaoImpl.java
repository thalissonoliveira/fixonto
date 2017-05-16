/**
 */
package caracteristica.impl;

import caracteristica.Acao;
import caracteristica.CaracteristicaPackage;
import caracteristica.Estado;
import caracteristica.RegraDeComposicao;
import caracteristica.Transicao;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transicao</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link caracteristica.impl.TransicaoImpl#getEAntigo <em>EAntigo</em>}</li>
 *   <li>{@link caracteristica.impl.TransicaoImpl#getENovo <em>ENovo</em>}</li>
 *   <li>{@link caracteristica.impl.TransicaoImpl#getRegrasQuebradas <em>Regras Quebradas</em>}</li>
 *   <li>{@link caracteristica.impl.TransicaoImpl#getAcoes <em>Acoes</em>}</li>
 *   <li>{@link caracteristica.impl.TransicaoImpl#isSafe <em>Safe</em>}</li>
 *   <li>{@link caracteristica.impl.TransicaoImpl#getEtiqueta <em>Etiqueta</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransicaoImpl extends EObjectImpl implements Transicao
{
  /**
	 * The cached value of the '{@link #getEAntigo() <em>EAntigo</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getEAntigo()
	 * @generated
	 * @ordered
	 */
  protected Estado eAntigo;

  /**
	 * The cached value of the '{@link #getENovo() <em>ENovo</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getENovo()
	 * @generated
	 * @ordered
	 */
  protected Estado eNovo;

  /**
	 * The cached value of the '{@link #getRegrasQuebradas() <em>Regras Quebradas</em>}' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRegrasQuebradas()
	 * @generated
	 * @ordered
	 */
  protected EList<RegraDeComposicao> regrasQuebradas;

  /**
	 * The cached value of the '{@link #getAcoes() <em>Acoes</em>}' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAcoes()
	 * @generated
	 * @ordered
	 */
  protected EList<Acao> acoes;

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
	 * The default value of the '{@link #getEtiqueta() <em>Etiqueta</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getEtiqueta()
	 * @generated
	 * @ordered
	 */
  protected static final String ETIQUETA_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getEtiqueta() <em>Etiqueta</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getEtiqueta()
	 * @generated
	 * @ordered
	 */
  protected String etiqueta = ETIQUETA_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected TransicaoImpl()
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
		return CaracteristicaPackage.Literals.TRANSICAO;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Estado getEAntigo()
  {
		if (eAntigo != null && eAntigo.eIsProxy()) {
			InternalEObject oldEAntigo = (InternalEObject)eAntigo;
			eAntigo = (Estado)eResolveProxy(oldEAntigo);
			if (eAntigo != oldEAntigo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CaracteristicaPackage.TRANSICAO__EANTIGO, oldEAntigo, eAntigo));
			}
		}
		return eAntigo;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Estado basicGetEAntigo()
  {
		return eAntigo;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setEAntigo(Estado newEAntigo)
  {
		Estado oldEAntigo = eAntigo;
		eAntigo = newEAntigo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.TRANSICAO__EANTIGO, oldEAntigo, eAntigo));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Estado getENovo()
  {
		if (eNovo != null && eNovo.eIsProxy()) {
			InternalEObject oldENovo = (InternalEObject)eNovo;
			eNovo = (Estado)eResolveProxy(oldENovo);
			if (eNovo != oldENovo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CaracteristicaPackage.TRANSICAO__ENOVO, oldENovo, eNovo));
			}
		}
		return eNovo;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Estado basicGetENovo()
  {
		return eNovo;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setENovo(Estado newENovo)
  {
		Estado oldENovo = eNovo;
		eNovo = newENovo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.TRANSICAO__ENOVO, oldENovo, eNovo));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<RegraDeComposicao> getRegrasQuebradas()
  {
		if (regrasQuebradas == null) {
			regrasQuebradas = new EObjectResolvingEList<RegraDeComposicao>(RegraDeComposicao.class, this, CaracteristicaPackage.TRANSICAO__REGRAS_QUEBRADAS);
		}
		return regrasQuebradas;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Acao> getAcoes()
  {
		if (acoes == null) {
			acoes = new EObjectResolvingEList<Acao>(Acao.class, this, CaracteristicaPackage.TRANSICAO__ACOES);
		}
		return acoes;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.TRANSICAO__SAFE, oldSafe, safe));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getEtiqueta()
  {
		return etiqueta;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setEtiqueta(String newEtiqueta)
  {
		String oldEtiqueta = etiqueta;
		etiqueta = newEtiqueta;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.TRANSICAO__ETIQUETA, oldEtiqueta, etiqueta));
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
			case CaracteristicaPackage.TRANSICAO__EANTIGO:
				if (resolve) return getEAntigo();
				return basicGetEAntigo();
			case CaracteristicaPackage.TRANSICAO__ENOVO:
				if (resolve) return getENovo();
				return basicGetENovo();
			case CaracteristicaPackage.TRANSICAO__REGRAS_QUEBRADAS:
				return getRegrasQuebradas();
			case CaracteristicaPackage.TRANSICAO__ACOES:
				return getAcoes();
			case CaracteristicaPackage.TRANSICAO__SAFE:
				return isSafe();
			case CaracteristicaPackage.TRANSICAO__ETIQUETA:
				return getEtiqueta();
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
			case CaracteristicaPackage.TRANSICAO__EANTIGO:
				setEAntigo((Estado)newValue);
				return;
			case CaracteristicaPackage.TRANSICAO__ENOVO:
				setENovo((Estado)newValue);
				return;
			case CaracteristicaPackage.TRANSICAO__REGRAS_QUEBRADAS:
				getRegrasQuebradas().clear();
				getRegrasQuebradas().addAll((Collection<? extends RegraDeComposicao>)newValue);
				return;
			case CaracteristicaPackage.TRANSICAO__ACOES:
				getAcoes().clear();
				getAcoes().addAll((Collection<? extends Acao>)newValue);
				return;
			case CaracteristicaPackage.TRANSICAO__SAFE:
				setSafe((Boolean)newValue);
				return;
			case CaracteristicaPackage.TRANSICAO__ETIQUETA:
				setEtiqueta((String)newValue);
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
			case CaracteristicaPackage.TRANSICAO__EANTIGO:
				setEAntigo((Estado)null);
				return;
			case CaracteristicaPackage.TRANSICAO__ENOVO:
				setENovo((Estado)null);
				return;
			case CaracteristicaPackage.TRANSICAO__REGRAS_QUEBRADAS:
				getRegrasQuebradas().clear();
				return;
			case CaracteristicaPackage.TRANSICAO__ACOES:
				getAcoes().clear();
				return;
			case CaracteristicaPackage.TRANSICAO__SAFE:
				setSafe(SAFE_EDEFAULT);
				return;
			case CaracteristicaPackage.TRANSICAO__ETIQUETA:
				setEtiqueta(ETIQUETA_EDEFAULT);
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
			case CaracteristicaPackage.TRANSICAO__EANTIGO:
				return eAntigo != null;
			case CaracteristicaPackage.TRANSICAO__ENOVO:
				return eNovo != null;
			case CaracteristicaPackage.TRANSICAO__REGRAS_QUEBRADAS:
				return regrasQuebradas != null && !regrasQuebradas.isEmpty();
			case CaracteristicaPackage.TRANSICAO__ACOES:
				return acoes != null && !acoes.isEmpty();
			case CaracteristicaPackage.TRANSICAO__SAFE:
				return safe != SAFE_EDEFAULT;
			case CaracteristicaPackage.TRANSICAO__ETIQUETA:
				return ETIQUETA_EDEFAULT == null ? etiqueta != null : !ETIQUETA_EDEFAULT.equals(etiqueta);
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
		result.append(" (safe: ");
		result.append(safe);
		result.append(", etiqueta: ");
		result.append(etiqueta);
		result.append(')');
		return result.toString();
	}

} //TransicaoImpl
