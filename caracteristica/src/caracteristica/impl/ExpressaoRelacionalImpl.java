/**
 */
package caracteristica.impl;

import caracteristica.Atributo;
import caracteristica.CaracteristicaPackage;
import caracteristica.ExpressaoRelacional;
import caracteristica.OperadorRelacional;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expressao Relacional</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link caracteristica.impl.ExpressaoRelacionalImpl#getVariaveldaExpressao <em>Variavelda Expressao</em>}</li>
 *   <li>{@link caracteristica.impl.ExpressaoRelacionalImpl#getOperadorRelacional <em>Operador Relacional</em>}</li>
 *   <li>{@link caracteristica.impl.ExpressaoRelacionalImpl#getValor <em>Valor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpressaoRelacionalImpl extends AntecedenteImpl implements ExpressaoRelacional
{
  /**
   * The cached value of the '{@link #getVariaveldaExpressao() <em>Variavelda Expressao</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariaveldaExpressao()
   * @generated
   * @ordered
   */
  protected Atributo variaveldaExpressao;

  /**
   * The default value of the '{@link #getOperadorRelacional() <em>Operador Relacional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperadorRelacional()
   * @generated
   * @ordered
   */
  protected static final OperadorRelacional OPERADOR_RELACIONAL_EDEFAULT = OperadorRelacional.MAIOR;

  /**
   * The cached value of the '{@link #getOperadorRelacional() <em>Operador Relacional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperadorRelacional()
   * @generated
   * @ordered
   */
  protected OperadorRelacional operadorRelacional = OPERADOR_RELACIONAL_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExpressaoRelacionalImpl()
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
    return CaracteristicaPackage.Literals.EXPRESSAO_RELACIONAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Atributo getVariaveldaExpressao()
  {
    if (variaveldaExpressao != null && variaveldaExpressao.eIsProxy())
    {
      InternalEObject oldVariaveldaExpressao = (InternalEObject)variaveldaExpressao;
      variaveldaExpressao = (Atributo)eResolveProxy(oldVariaveldaExpressao);
      if (variaveldaExpressao != oldVariaveldaExpressao)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CaracteristicaPackage.EXPRESSAO_RELACIONAL__VARIAVELDA_EXPRESSAO, oldVariaveldaExpressao, variaveldaExpressao));
      }
    }
    return variaveldaExpressao;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Atributo basicGetVariaveldaExpressao()
  {
    return variaveldaExpressao;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariaveldaExpressao(Atributo newVariaveldaExpressao)
  {
    Atributo oldVariaveldaExpressao = variaveldaExpressao;
    variaveldaExpressao = newVariaveldaExpressao;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.EXPRESSAO_RELACIONAL__VARIAVELDA_EXPRESSAO, oldVariaveldaExpressao, variaveldaExpressao));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperadorRelacional getOperadorRelacional()
  {
    return operadorRelacional;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperadorRelacional(OperadorRelacional newOperadorRelacional)
  {
    OperadorRelacional oldOperadorRelacional = operadorRelacional;
    operadorRelacional = newOperadorRelacional == null ? OPERADOR_RELACIONAL_EDEFAULT : newOperadorRelacional;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.EXPRESSAO_RELACIONAL__OPERADOR_RELACIONAL, oldOperadorRelacional, operadorRelacional));
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
      eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.EXPRESSAO_RELACIONAL__VALOR, oldValor, valor));
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
      case CaracteristicaPackage.EXPRESSAO_RELACIONAL__VARIAVELDA_EXPRESSAO:
        if (resolve) return getVariaveldaExpressao();
        return basicGetVariaveldaExpressao();
      case CaracteristicaPackage.EXPRESSAO_RELACIONAL__OPERADOR_RELACIONAL:
        return getOperadorRelacional();
      case CaracteristicaPackage.EXPRESSAO_RELACIONAL__VALOR:
        return getValor();
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
      case CaracteristicaPackage.EXPRESSAO_RELACIONAL__VARIAVELDA_EXPRESSAO:
        setVariaveldaExpressao((Atributo)newValue);
        return;
      case CaracteristicaPackage.EXPRESSAO_RELACIONAL__OPERADOR_RELACIONAL:
        setOperadorRelacional((OperadorRelacional)newValue);
        return;
      case CaracteristicaPackage.EXPRESSAO_RELACIONAL__VALOR:
        setValor((String)newValue);
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
      case CaracteristicaPackage.EXPRESSAO_RELACIONAL__VARIAVELDA_EXPRESSAO:
        setVariaveldaExpressao((Atributo)null);
        return;
      case CaracteristicaPackage.EXPRESSAO_RELACIONAL__OPERADOR_RELACIONAL:
        setOperadorRelacional(OPERADOR_RELACIONAL_EDEFAULT);
        return;
      case CaracteristicaPackage.EXPRESSAO_RELACIONAL__VALOR:
        setValor(VALOR_EDEFAULT);
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
      case CaracteristicaPackage.EXPRESSAO_RELACIONAL__VARIAVELDA_EXPRESSAO:
        return variaveldaExpressao != null;
      case CaracteristicaPackage.EXPRESSAO_RELACIONAL__OPERADOR_RELACIONAL:
        return operadorRelacional != OPERADOR_RELACIONAL_EDEFAULT;
      case CaracteristicaPackage.EXPRESSAO_RELACIONAL__VALOR:
        return VALOR_EDEFAULT == null ? valor != null : !VALOR_EDEFAULT.equals(valor);
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
    result.append(" (operadorRelacional: ");
    result.append(operadorRelacional);
    result.append(", valor: ");
    result.append(valor);
    result.append(')');
    return result.toString();
  }

} //ExpressaoRelacionalImpl
