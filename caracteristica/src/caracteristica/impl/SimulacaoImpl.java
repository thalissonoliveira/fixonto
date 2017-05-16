/**
 */
package caracteristica.impl;

import caracteristica.CaracteristicaPackage;
import caracteristica.Estado;
import caracteristica.Simulacao;
import caracteristica.Transicao;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simulacao</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link caracteristica.impl.SimulacaoImpl#getNome <em>Nome</em>}</li>
 *   <li>{@link caracteristica.impl.SimulacaoImpl#getTransicoes <em>Transicoes</em>}</li>
 *   <li>{@link caracteristica.impl.SimulacaoImpl#getEstados <em>Estados</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimulacaoImpl extends EObjectImpl implements Simulacao
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
	 * The cached value of the '{@link #getTransicoes() <em>Transicoes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTransicoes()
	 * @generated
	 * @ordered
	 */
  protected EList<Transicao> transicoes;

  /**
	 * The cached value of the '{@link #getEstados() <em>Estados</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getEstados()
	 * @generated
	 * @ordered
	 */
  protected EList<Estado> estados;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected SimulacaoImpl()
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
		return CaracteristicaPackage.Literals.SIMULACAO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.SIMULACAO__NOME, oldNome, nome));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Transicao> getTransicoes()
  {
		if (transicoes == null) {
			transicoes = new EObjectContainmentEList<Transicao>(Transicao.class, this, CaracteristicaPackage.SIMULACAO__TRANSICOES);
		}
		return transicoes;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Estado> getEstados()
  {
		if (estados == null) {
			estados = new EObjectContainmentEList<Estado>(Estado.class, this, CaracteristicaPackage.SIMULACAO__ESTADOS);
		}
		return estados;
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
			case CaracteristicaPackage.SIMULACAO__TRANSICOES:
				return ((InternalEList<?>)getTransicoes()).basicRemove(otherEnd, msgs);
			case CaracteristicaPackage.SIMULACAO__ESTADOS:
				return ((InternalEList<?>)getEstados()).basicRemove(otherEnd, msgs);
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
			case CaracteristicaPackage.SIMULACAO__NOME:
				return getNome();
			case CaracteristicaPackage.SIMULACAO__TRANSICOES:
				return getTransicoes();
			case CaracteristicaPackage.SIMULACAO__ESTADOS:
				return getEstados();
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
			case CaracteristicaPackage.SIMULACAO__NOME:
				setNome((String)newValue);
				return;
			case CaracteristicaPackage.SIMULACAO__TRANSICOES:
				getTransicoes().clear();
				getTransicoes().addAll((Collection<? extends Transicao>)newValue);
				return;
			case CaracteristicaPackage.SIMULACAO__ESTADOS:
				getEstados().clear();
				getEstados().addAll((Collection<? extends Estado>)newValue);
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
			case CaracteristicaPackage.SIMULACAO__NOME:
				setNome(NOME_EDEFAULT);
				return;
			case CaracteristicaPackage.SIMULACAO__TRANSICOES:
				getTransicoes().clear();
				return;
			case CaracteristicaPackage.SIMULACAO__ESTADOS:
				getEstados().clear();
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
			case CaracteristicaPackage.SIMULACAO__NOME:
				return NOME_EDEFAULT == null ? nome != null : !NOME_EDEFAULT.equals(nome);
			case CaracteristicaPackage.SIMULACAO__TRANSICOES:
				return transicoes != null && !transicoes.isEmpty();
			case CaracteristicaPackage.SIMULACAO__ESTADOS:
				return estados != null && !estados.isEmpty();
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

} //SimulacaoImpl
