//David Wu
//
/* abstract superclass vehicle designates position
*/

import java.awt.Graphics;

public abstract class Vehicle
{
	private int initX;
	private int initY;

	public Vehicle(int x, int y)
	{
		initX = x;
		initY = y;
	}

	public int getX()
	{
		return initX;
	}

	public int getY()
	{
		return initY;
	}

	public abstract void draw(Graphics g);
}