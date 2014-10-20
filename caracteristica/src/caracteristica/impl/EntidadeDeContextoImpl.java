/**
 */
package caracteristica.impl;

import caracteristica.CaracteristicaPackage;
import caracteristica.EntidadeDeContexto;
import caracteristica.InformacaoDeContexto;
import caracteristica.RaizDeContexto;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entidadede Contexto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link caracteristica.impl.EntidadeDeContextoImpl#getRaiz <em>Raiz</em>}</li>
 *   <li>{@link caracteristica.impl.EntidadeDeContextoImpl#getInformacoesDeContexto <em>Informacoes De Contexto</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntidadeDeContextoImpl extends ElementoImpl implements EntidadeDeContexto
{
  /**
	 * The cached value of the '{@link #getRaiz() <em>Raiz</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRaiz()
	 * @generated
	 * @ordered
	 */
  protected RaizDeContexto raiz;

  /**
	 * The cached value of the '{@link #getInformacoesDeContexto() <em>Informacoes De Contexto</em>}' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getInformacoesDeContexto()
	 * @generated
	 * @ordered
	 */
  protected EList<InformacaoDeContexto> informacoesDeContexto;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected EntidadeDeContextoImpl()
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
		return CaracteristicaPackage.Literals.ENTIDADE_DE_CONTEXTO;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RaizDeContexto getRaiz()
  {
		if (raiz != null && raiz.eIsProxy()) {
			InternalEObject oldRaiz = (InternalEObject)raiz;
			raiz = (RaizDeContexto)eResolveProxy(oldRaiz);
			if (raiz != oldRaiz) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CaracteristicaPackage.ENTIDADE_DE_CONTEXTO__RAIZ, oldRaiz, raiz));
			}
		}
		return raiz;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RaizDeContexto basicGetRaiz()
  {
		return raiz;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetRaiz(RaizDeContexto newRaiz, NotificationChain msgs)
  {
		RaizDeContexto oldRaiz = raiz;
		raiz = newRaiz;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.ENTIDADE_DE_CONTEXTO__RAIZ, oldRaiz, newRaiz);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setRaiz(RaizDeContexto newRaiz)
  {
		if (newRaiz != raiz) {
			NotificationChain msgs = null;
			if (raiz != null)
				msgs = ((InternalEObject)raiz).eInverseRemove(this, CaracteristicaPackage.RAIZ_DE_CONTEXTO__ENTIDADES_DE_CONTEXTO, RaizDeContexto.class, msgs);
			if (newRaiz != null)
				msgs = ((InternalEObject)newRaiz).eInverseAdd(this, CaracteristicaPackage.RAIZ_DE_CONTEXTO__ENTIDADES_DE_CONTEXTO, RaizDeContexto.class, msgs);
			msgs = basicSetRaiz(newRaiz, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.ENTIDADE_DE_CONTEXTO__RAIZ, newRaiz, newRaiz));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<InformacaoDeContexto> getInformacoesDeContexto()
  {
		if (informacoesDeContexto == null) {
			informacoesDeContexto = new EObjectWithInverseResolvingEList<InformacaoDeContexto>(InformacaoDeContexto.class, this, CaracteristicaPackage.ENTIDADE_DE_CONTEXTO__INFORMACOES_DE_CONTEXTO, CaracteristicaPackage.INFORMACAO_DE_CONTEXTO__ELEMENTO_PAI);
		}
		return informacoesDeContexto;
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
		switch (featureID) {
			case CaracteristicaPackage.ENTIDADE_DE_CONTEXTO__RAIZ:
				if (raiz != null)
					msgs = ((InternalEObject)raiz).eInverseRemove(this, CaracteristicaPackage.RAIZ_DE_CONTEXTO__ENTIDADES_DE_CONTEXTO, RaizDeContexto.class, msgs);
				return basicSetRaiz((RaizDeContexto)otherEnd, msgs);
			case CaracteristicaPackage.ENTIDADE_DE_CONTEXTO__INFORMACOES_DE_CONTEXTO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInformacoesDeContexto()).basicAdd(otherEnd, msgs);
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
		switch (featureID) {
			case CaracteristicaPackage.ENTIDADE_DE_CONTEXTO__RAIZ:
				return basicSetRaiz(null, msgs);
			case CaracteristicaPackage.ENTIDADE_DE_CONTEXTO__INFORMACOES_DE_CONTEXTO:
				return ((InternalEList<?>)getInformacoesDeContexto()).basicRemove(otherEnd, msgs);
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
			case CaracteristicaPackage.ENTIDADE_DE_CONTEXTO__RAIZ:
				if (resolve) return getRaiz();
				return basicGetRaiz();
			case CaracteristicaPackage.ENTIDADE_DE_CONTEXTO__INFORMACOES_DE_CONTEXTO:
				return getInformacoesDeContexto();
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
			case CaracteristicaPackage.ENTIDADE_DE_CONTEXTO__RAIZ:
				setRaiz((RaizDeContexto)newValue);
				return;
			case CaracteristicaPackage.ENTIDADE_DE_CONTEXTO__INFORMACOES_DE_CONTEXTO:
				getInformacoesDeContexto().clear();
				getInformacoesDeContexto().addAll((Collection<? extends InformacaoDeContexto>)newValue);
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
			case CaracteristicaPackage.ENTIDADE_DE_CONTEXTO__RAIZ:
				setRaiz((RaizDeContexto)null);
				return;
			case CaracteristicaPackage.ENTIDADE_DE_CONTEXTO__INFORMACOES_DE_CONTEXTO:
				getInformacoesDeContexto().clear();
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
			case CaracteristicaPackage.ENTIDADE_DE_CONTEXTO__RAIZ:
				return raiz != null;
			case CaracteristicaPackage.ENTIDADE_DE_CONTEXTO__INFORMACOES_DE_CONTEXTO:
				return informacoesDeContexto != null && !informacoesDeContexto.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EntidadedeContextoImpl
