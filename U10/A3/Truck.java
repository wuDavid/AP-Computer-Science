//David Wu
//
/* subclass truck of superclass vehicle
*/

import java.awt.Graphics;
import java.awt.Color;

public final class Truck extends Vehicle
{
	public Truck(int x, int y)
	{
		super(x,y);
	}

	public void draw(Graphics g)
	{
		int x = getX();
		int y = getY();

		g.setColor(Color.blue);
		g.drawRect(x, y, 40, 50);
		g.drawRect(x+45, y-20, 120, 70);
		g.drawOval(x+5, y+50, 10, 10);
		g.drawOval(x+50, y+50, 10, 10);
		g.drawOval(x+60, y+50, 10, 10);
		g.drawOval(x+145, y+50, 10, 10);
		g.drawOval(x+155, y+50, 10, 10);
	}
}