/**
 */
package caracteristica.impl;

import caracteristica.Antecedente;
import caracteristica.CaracteristicaPackage;
import caracteristica.RegraDeComposicao;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Regra De Composicao</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link caracteristica.impl.RegraDeComposicaoImpl#getAntecedente <em>Antecedente</em>}</li>
 *   <li>{@link caracteristica.impl.RegraDeComposicaoImpl#getConsequente <em>Consequente</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegraDeComposicaoImpl extends RegraImpl implements RegraDeComposicao
{
  /**
   * The cached value of the '{@link #getAntecedente() <em>Antecedente</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAntecedente()
   * @generated
   * @ordered
   */
  protected Antecedente antecedente;

  /**
   * The cached value of the '{@link #getConsequente() <em>Consequente</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConsequente()
   * @generated
   * @ordered
   */
  protected Antecedente consequente;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RegraDeComposicaoImpl()
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
    return CaracteristicaPackage.Literals.REGRA_DE_COMPOSICAO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Antecedente getAntecedente()
  {
    if (antecedente != null && antecedente.eIsProxy())
    {
      InternalEObject oldAntecedente = (InternalEObject)antecedente;
      antecedente = (Antecedente)eResolveProxy(oldAntecedente);
      if (antecedente != oldAntecedente)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CaracteristicaPackage.REGRA_DE_COMPOSICAO__ANTECEDENTE, oldAntecedente, antecedente));
      }
    }
    return antecedente;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Antecedente basicGetAntecedente()
  {
    return antecedente;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAntecedente(Antecedente newAntecedente)
  {
    Antecedente oldAntecedente = antecedente;
    antecedente = newAntecedente;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.REGRA_DE_COMPOSICAO__ANTECEDENTE, oldAntecedente, antecedente));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Antecedente getConsequente()
  {
    if (consequente != null && consequente.eIsProxy())
    {
      InternalEObject oldConsequente = (InternalEObject)consequente;
      consequente = (Antecedente)eResolveProxy(oldConsequente);
      if (consequente != oldConsequente)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CaracteristicaPackage.REGRA_DE_COMPOSICAO__CONSEQUENTE, oldConsequente, consequente));
      }
    }
    return consequente;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Antecedente basicGetConsequente()
  {
    return consequente;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConsequente(Antecedente newConsequente)
  {
    Antecedente oldConsequente = consequente;
    consequente = newConsequente;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.REGRA_DE_COMPOSICAO__CONSEQUENTE, oldConsequente, consequente));
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
      case CaracteristicaPackage.REGRA_DE_COMPOSICAO__ANTECEDENTE:
        if (resolve) return getAntecedente();
        return basicGetAntecedente();
      case CaracteristicaPackage.REGRA_DE_COMPOSICAO__CONSEQUENTE:
        if (resolve) return getConsequente();
        return basicGetConsequente();
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
    switch (featureID)
    {
      case CaracteristicaPackage.REGRA_DE_COMPOSICAO__ANTECEDENTE:
        setAntecedente((Antecedente)newValue);
        return;
      case CaracteristicaPackage.REGRA_DE_COMPOSICAO__CONSEQUENTE:
        setConsequente((Antecedente)newValue);
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
      case CaracteristicaPackage.REGRA_DE_COMPOSICAO__ANTECEDENTE:
        setAntecedente((Antecedente)null);
        return;
      case CaracteristicaPackage.REGRA_DE_COMPOSICAO__CONSEQUENTE:
        setConsequente((Antecedente)null);
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
      case CaracteristicaPackage.REGRA_DE_COMPOSICAO__ANTECEDENTE:
        return antecedente != null;
      case CaracteristicaPackage.REGRA_DE_COMPOSICAO__CONSEQUENTE:
        return consequente != null;
    }
    return super.eIsSet(featureID);
  }

} //RegraDeComposicaoImpl
