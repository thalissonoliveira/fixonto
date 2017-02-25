/*
 * 
 */
package caracteristica.diagram.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import caracteristica.diagram.edit.policies.EntidadeDeContextoInformacoesDeContextoItemSemanticEditPolicy;

/**
 * @generated
 */
public class EntidadeDeContextoInformacoesDeContextoEditPart extends ConnectionNodeEditPart
		implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4028;

	/**
	 * @generated
	 */
	public EntidadeDeContextoInformacoesDeContextoEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new EntidadeDeContextoInformacoesDeContextoItemSemanticEditPolicy());
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new EntidadeDeContextoInformacoesDeContextoFigure();
	}

	/**
	 * @generated
	 */
	public EntidadeDeContextoInformacoesDeContextoFigure getPrimaryShape() {
		return (EntidadeDeContextoInformacoesDeContextoFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class EntidadeDeContextoInformacoesDeContextoFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public EntidadeDeContextoInformacoesDeContextoFigure() {
			this.setLineWidth(3);
			this.setForegroundColor(THIS_FORE);

		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_FORE = new Color(null, 0, 0, 0);

}
