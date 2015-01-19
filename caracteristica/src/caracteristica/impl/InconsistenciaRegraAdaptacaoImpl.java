/**
 */
package caracteristica.impl;

import caracteristica.CaracteristicaPackage;
import caracteristica.Designar;
import caracteristica.InconsistenciaRegraAdaptacao;
import caracteristica.LiteralAcao;
import caracteristica.RegraDeContexto;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inconsistencia Regra Adaptacao</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link caracteristica.impl.InconsistenciaRegraAdaptacaoImpl#getRegrasInconsistentes <em>Regras Inconsistentes</em>}</li>
 *   <li>{@link caracteristica.impl.InconsistenciaRegraAdaptacaoImpl#getLiteraisInconsistentes <em>Literais Inconsistentes</em>}</li>
 *   <li>{@link caracteristica.impl.InconsistenciaRegraAdaptacaoImpl#getAtribuicoesInconsistentes <em>Atribuicoes Inconsistentes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InconsistenciaRegraAdaptacaoImpl extends EObjectImpl implements InconsistenciaRegraAdaptacao
{
  /**
	 * The cached value of the '{@link #getRegrasInconsistentes() <em>Regras Inconsistentes</em>}' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRegrasInconsistentes()
	 * @generated
	 * @ordered
	 */
  protected EList<RegraDeContexto> regrasInconsistentes;

  /**
	 * The cached value of the '{@link #getLiteraisInconsistentes() <em>Literais Inconsistentes</em>}' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLiteraisInconsistentes()
	 * @generated
	 * @ordered
	 */
  protected EList<LiteralAcao> literaisInconsistentes;

  /**
	 * The cached value of the '{@link #getAtribuicoesInconsistentes() <em>Atribuicoes Inconsistentes</em>}' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAtribuicoesInconsistentes()
	 * @generated
	 * @ordered
	 */
  protected EList<Designar> atribuicoesInconsistentes;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected InconsistenciaRegraAdaptacaoImpl()
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
		return CaracteristicaPackage.Literals.INCONSISTENCIA_REGRA_ADAPTACAO;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<RegraDeContexto> getRegrasInconsistentes()
  {
		if (regrasInconsistentes == null) {
			regrasInconsistentes = new EObjectResolvingEList<RegraDeContexto>(RegraDeContexto.class, this, CaracteristicaPackage.INCONSISTENCIA_REGRA_ADAPTACAO__REGRAS_INCONSISTENTES);
		}
		return regrasInconsistentes;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<LiteralAcao> getLiteraisInconsistentes()
  {
		if (literaisInconsistentes == null) {
			literaisInconsistentes = new EObjectResolvingEList<LiteralAcao>(LiteralAcao.class, this, CaracteristicaPackage.INCONSISTENCIA_REGRA_ADAPTACAO__LITERAIS_INCONSISTENTES);
		}
		return literaisInconsistentes;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Designar> getAtribuicoesInconsistentes()
  {
		if (atribuicoesInconsistentes == null) {
			atribuicoesInconsistentes = new EObjectResolvingEList<Designar>(Designar.class, this, CaracteristicaPackage.INCONSISTENCIA_REGRA_ADAPTACAO__ATRIBUICOES_INCONSISTENTES);
		}
		return atribuicoesInconsistentes;
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
			case CaracteristicaPackage.INCONSISTENCIA_REGRA_ADAPTACAO__REGRAS_INCONSISTENTES:
				return getRegrasInconsistentes();
			case CaracteristicaPackage.INCONSISTENCIA_REGRA_ADAPTACAO__LITERAIS_INCONSISTENTES:
				return getLiteraisInconsistentes();
			case CaracteristicaPackage.INCONSISTENCIA_REGRA_ADAPTACAO__ATRIBUICOES_INCONSISTENTES:
				return getAtribuicoesInconsistentes();
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
			case CaracteristicaPackage.INCONSISTENCIA_REGRA_ADAPTACAO__REGRAS_INCONSISTENTES:
				getRegrasInconsistentes().clear();
				getRegrasInconsistentes().addAll((Collection<? extends RegraDeContexto>)newValue);
				return;
			case CaracteristicaPackage.INCONSISTENCIA_REGRA_ADAPTACAO__LITERAIS_INCONSISTENTES:
				getLiteraisInconsistentes().clear();
				getLiteraisInconsistentes().addAll((Collection<? extends LiteralAcao>)newValue);
				return;
			case CaracteristicaPackage.INCONSISTENCIA_REGRA_ADAPTACAO__ATRIBUICOES_INCONSISTENTES:
				getAtribuicoesInconsistentes().clear();
				getAtribuicoesInconsistentes().addAll((Collection<? extends Designar>)newValue);
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
			case CaracteristicaPackage.INCONSISTENCIA_REGRA_ADAPTACAO__REGRAS_INCONSISTENTES:
				getRegrasInconsistentes().clear();
				return;
			case CaracteristicaPackage.INCONSISTENCIA_REGRA_ADAPTACAO__LITERAIS_INCONSISTENTES:
				getLiteraisInconsistentes().clear();
				return;
			case CaracteristicaPackage.INCONSISTENCIA_REGRA_ADAPTACAO__ATRIBUICOES_INCONSISTENTES:
				getAtribuicoesInconsistentes().clear();
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
			case CaracteristicaPackage.INCONSISTENCIA_REGRA_ADAPTACAO__REGRAS_INCONSISTENTES:
				return regrasInconsistentes != null && !regrasInconsistentes.isEmpty();
			case CaracteristicaPackage.INCONSISTENCIA_REGRA_ADAPTACAO__LITERAIS_INCONSISTENTES:
				return literaisInconsistentes != null && !literaisInconsistentes.isEmpty();
			case CaracteristicaPackage.INCONSISTENCIA_REGRA_ADAPTACAO__ATRIBUICOES_INCONSISTENTES:
				return atribuicoesInconsistentes != null && !atribuicoesInconsistentes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InconsistenciaRegraAdaptacaoImpl
