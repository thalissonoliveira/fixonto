/**
 */
package caracteristica;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contexto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link caracteristica.Contexto#getCaracteristicasIncluir <em>Caracteristicas Incluir</em>}</li>
 *   <li>{@link caracteristica.Contexto#getCaracteristicasExcluir <em>Caracteristicas Excluir</em>}</li>
 * </ul>
 *
 * @see caracteristica.CaracteristicaPackage#getContexto()
 * @model annotation="gmf.node label='nome'"
 * @generated
 */
public interface Contexto extends Elemento
{
  /**
	 * Returns the value of the '<em><b>Caracteristicas Incluir</b></em>' reference list.
	 * The list contents are of type {@link caracteristica.Caracteristica}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Caracteristicas Incluir</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Caracteristicas Incluir</em>' reference list.
	 * @see caracteristica.CaracteristicaPackage#getContexto_CaracteristicasIncluir()
	 * @model annotation="gmf.link target.decoration='closedarrow' color='0,0,0' style='dot' width='3'"
	 * @generated
	 */
  EList<Caracteristica> getCaracteristicasIncluir();

  /**
	 * Returns the value of the '<em><b>Caracteristicas Excluir</b></em>' reference list.
	 * The list contents are of type {@link caracteristica.Caracteristica}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Caracteristicas Excluir</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Caracteristicas Excluir</em>' reference list.
	 * @see caracteristica.CaracteristicaPackage#getContexto_CaracteristicasExcluir()
	 * @model annotation="gmf.link target.decoration='closedarrow' source.decoration='closedarrow' color='0,0,0' style='dot' width='3'"
	 * @generated
	 */
  EList<Caracteristica> getCaracteristicasExcluir();

} // Contexto
