/**
 */
package caracteristica.impl;

import caracteristica.Caracteristica;
import caracteristica.CaracteristicaPackage;
import caracteristica.Contexto;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contexto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link caracteristica.impl.ContextoImpl#getCaracteristicasIncluir <em>Caracteristicas Incluir</em>}</li>
 *   <li>{@link caracteristica.impl.ContextoImpl#getCaracteristicasExcluir <em>Caracteristicas Excluir</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContextoImpl extends ElementoImpl implements Contexto
{
  /**
	 * The cached value of the '{@link #getCaracteristicasIncluir() <em>Caracteristicas Incluir</em>}' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getCaracteristicasIncluir()
	 * @generated
	 * @ordered
	 */
  protected EList<Caracteristica> caracteristicasIncluir;

  /**
	 * The cached value of the '{@link #getCaracteristicasExcluir() <em>Caracteristicas Excluir</em>}' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getCaracteristicasExcluir()
	 * @generated
	 * @ordered
	 */
  protected EList<Caracteristica> caracteristicasExcluir;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ContextoImpl()
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
		return CaracteristicaPackage.Literals.CONTEXTO;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Caracteristica> getCaracteristicasIncluir()
  {
		if (caracteristicasIncluir == null) {
			caracteristicasIncluir = new EObjectResolvingEList<Caracteristica>(Caracteristica.class, this, CaracteristicaPackage.CONTEXTO__CARACTERISTICAS_INCLUIR);
		}
		return caracteristicasIncluir;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Caracteristica> getCaracteristicasExcluir()
  {
		if (caracteristicasExcluir == null) {
			caracteristicasExcluir = new EObjectResolvingEList<Caracteristica>(Caracteristica.class, this, CaracteristicaPackage.CONTEXTO__CARACTERISTICAS_EXCLUIR);
		}
		return caracteristicasExcluir;
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
			case CaracteristicaPackage.CONTEXTO__CARACTERISTICAS_INCLUIR:
				return getCaracteristicasIncluir();
			case CaracteristicaPackage.CONTEXTO__CARACTERISTICAS_EXCLUIR:
				return getCaracteristicasExcluir();
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
			case CaracteristicaPackage.CONTEXTO__CARACTERISTICAS_INCLUIR:
				getCaracteristicasIncluir().clear();
				getCaracteristicasIncluir().addAll((Collection<? extends Caracteristica>)newValue);
				return;
			case CaracteristicaPackage.CONTEXTO__CARACTERISTICAS_EXCLUIR:
				getCaracteristicasExcluir().clear();
				getCaracteristicasExcluir().addAll((Collection<? extends Caracteristica>)newValue);
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
			case CaracteristicaPackage.CONTEXTO__CARACTERISTICAS_INCLUIR:
				getCaracteristicasIncluir().clear();
				return;
			case CaracteristicaPackage.CONTEXTO__CARACTERISTICAS_EXCLUIR:
				getCaracteristicasExcluir().clear();
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
			case CaracteristicaPackage.CONTEXTO__CARACTERISTICAS_INCLUIR:
				return caracteristicasIncluir != null && !caracteristicasIncluir.isEmpty();
			case CaracteristicaPackage.CONTEXTO__CARACTERISTICAS_EXCLUIR:
				return caracteristicasExcluir != null && !caracteristicasExcluir.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContextoImpl
