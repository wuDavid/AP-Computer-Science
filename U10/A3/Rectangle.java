//David Wu
//
/* Draws rectangles wih point and lines
*/

import java.awt.Graphics;

public final class Rectangle extends Line
{
	private int width;

	public Rectangle (int x, int y, int len, int wid)
	{
		super(x,y,len);
		width = wid;
	}

	public void drawRectangle(Graphics g)
	{
		for(int i = 0; i < width; i++)
		{
			super.drawLine(g);
			super.setY(10);
		}
	}
}
