/**
 */
package caracteristica.impl;

import caracteristica.CaracteristicaPackage;
import caracteristica.ElementoExterno;
import caracteristica.EntidadeDeContexto;
import caracteristica.EntidadeDeContexto;
import caracteristica.RaizDeContexto;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Raiz De Contexto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link caracteristica.impl.RaizDeContextoImpl#getEntidadesDeContexto <em>Entidades De Contexto</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RaizDeContextoImpl extends ElementoImpl implements RaizDeContexto
{
  /**
   * The cached value of the '{@link #getEntidadesDeContexto() <em>Entidades De Contexto</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntidadesDeContexto()
   * @generated
   * @ordered
   */
  protected EList<EntidadeDeContexto> entidadesDeContexto;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RaizDeContextoImpl()
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
    return CaracteristicaPackage.Literals.RAIZ_DE_CONTEXTO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EntidadeDeContexto> getEntidadesDeContexto()
  {
    if (entidadesDeContexto == null)
    {
      entidadesDeContexto = new EObjectWithInverseResolvingEList<EntidadeDeContexto>(EntidadeDeContexto.class, this, CaracteristicaPackage.RAIZ_DE_CONTEXTO__ENTIDADES_DE_CONTEXTO, CaracteristicaPackage.ENTIDADE_DE_CONTEXTO__RAIZ);
    }
    return entidadesDeContexto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CaracteristicaPackage.RAIZ_DE_CONTEXTO__ENTIDADES_DE_CONTEXTO:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getEntidadesDeContexto()).basicAdd(otherEnd, msgs);
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
    switch (featureID)
    {
      case CaracteristicaPackage.RAIZ_DE_CONTEXTO__ENTIDADES_DE_CONTEXTO:
        return ((InternalEList<?>)getEntidadesDeContexto()).basicRemove(otherEnd, msgs);
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
    switch (featureID)
    {
      case CaracteristicaPackage.RAIZ_DE_CONTEXTO__ENTIDADES_DE_CONTEXTO:
        return getEntidadesDeContexto();
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
    switch (featureID)
    {
      case CaracteristicaPackage.RAIZ_DE_CONTEXTO__ENTIDADES_DE_CONTEXTO:
        getEntidadesDeContexto().clear();
        getEntidadesDeContexto().addAll((Collection<? extends EntidadeDeContexto>)newValue);
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
    switch (featureID)
    {
      case CaracteristicaPackage.RAIZ_DE_CONTEXTO__ENTIDADES_DE_CONTEXTO:
        getEntidadesDeContexto().clear();
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
    switch (featureID)
    {
      case CaracteristicaPackage.RAIZ_DE_CONTEXTO__ENTIDADES_DE_CONTEXTO:
        return entidadesDeContexto != null && !entidadesDeContexto.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RaizDeContextoImpl
