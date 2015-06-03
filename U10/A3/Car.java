//David Wu
//
/* subclass car of superclass vehicle
*/

import java.awt.Graphics;
import java.awt.Color;

public final class Car extends Vehicle
{
	public Car(int x, int y)
	{
		super(x,y);
	}

	public void draw(Graphics g)
	{
		int x = getX();
		int y = getY();

		g.setColor(Color.red);
		g.drawRect(x, y, 55, 15);
		g.drawRect(x-15, y+15, 85, 20);
		g.drawOval(x-10, y+35, 10, 10);
		g.drawOval(x+55, y+35, 10, 10);
	}
}