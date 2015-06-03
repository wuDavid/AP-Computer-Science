//David Wu
//
/* Draws out a point
*/

import java.awt.Color;
import java.awt.Graphics;

public class Point
{
	private int xax;
	private int yax;

	public Point(int x, int y)
	{
		xax = x;
		yax = y;
	}

	public void Plot(Graphics g)
	{
		g.setColor(Color.green);
		g.drawString("*", xax, yax);
	}

	public void setX(int x)
	{
		xax += x;
	}

	public void setY(int y)
	{
		yax += y;
	}
}