/**
 */
package caracteristica;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Informacao De Contexto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link caracteristica.InformacaoDeContexto#getElementoPai <em>Elemento Pai</em>}</li>
 * </ul>
 * </p>
 *
 * @see caracteristica.CaracteristicaPackage#getInformacaoDeContexto()
 * @model annotation="gmf.node label='nome' label.pattern='Informa\347\343o de Contexto: {0}'"
 * @generated
 */
public interface InformacaoDeContexto extends Contexto
{
  /**
   * Returns the value of the '<em><b>Elemento Pai</b></em>' reference.
   * It is bidirectional and its opposite is '{@link caracteristica.EntidadeDeContexto#getInformacoesDeContexto <em>Informacoes De Contexto</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elemento Pai</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elemento Pai</em>' reference.
   * @see #setElementoPai(EntidadeDeContexto)
   * @see caracteristica.CaracteristicaPackage#getInformacaoDeContexto_ElementoPai()
   * @see caracteristica.EntidadeDeContexto#getInformacoesDeContexto
   * @model opposite="informacoesDeContexto" required="true"
   * @generated
   */
  EntidadeDeContexto getElementoPai();

  /**
   * Sets the value of the '{@link caracteristica.InformacaoDeContexto#getElementoPai <em>Elemento Pai</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Elemento Pai</em>' reference.
   * @see #getElementoPai()
   * @generated
   */
  void setElementoPai(EntidadeDeContexto value);

} // InformacaoDeContexto
