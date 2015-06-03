//David Wu
//
/* Draws a line using points
*/

import java.awt.Graphics;

public class Line extends Point
{
	private int length;

	public Line(int x , int y, int len)
	{
		super(x, y);
		length = len;
	}

	public void drawLine(Graphics g)
	{
		for(int i = 0; i<length; i++)
		{
			super.Plot(g);
			super.setX(10);
		}
		super.setX(-10*length);
	}
}