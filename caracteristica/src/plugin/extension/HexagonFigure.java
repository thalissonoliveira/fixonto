package plugin.extension;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;

public class HexagonFigure  extends Figure {
	
	@Override
	public void paint(Graphics graphics) {
		
		Rectangle r = getBounds();
		
		// Define the points of a diamond
		Point p1 = new Point(r.x, r.y + r.height/2);
		Point p2 = new Point(r.x + r.width/3, r.y);
		Point p3 = new Point(r.x + 2*r.width/3, r.y);
		Point p4 = new Point(r.x + r.width, r.y + r.height/2);
		Point p5 = new Point(r.x + 2*r.width/3, r.y + r.height);
		Point p6 = new Point(r.x + r.width/3, r.y + r.height);
		
		PointList pointList = new PointList();
		pointList.addPoint(p1);
		pointList.addPoint(p2);
		pointList.addPoint(p3);
		pointList.addPoint(p4);
		pointList.addPoint(p5);
		pointList.addPoint(p6);
		
		// Fill the shape
		graphics.fillPolygon(pointList);
		graphics.setLineWidth(2);
		// Draw the outline
		graphics.drawLine(p1, p2);
		graphics.drawLine(p2, p3);
		graphics.drawLine(p3, p4);
		graphics.drawLine(p4, p5);
		graphics.drawLine(p5, p6);
		graphics.drawLine(p6, p1);
		
		// Move the label to the centre of the diamond
		WrappingLabel label = (WrappingLabel) getChildren().get(0);
		LayoutUtil.moveToCenter(label, this, graphics);
		label.paint(graphics);		
		
	}
	
}