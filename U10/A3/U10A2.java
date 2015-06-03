//David Wu
//
/* Prints out 3 different rectangles
*/

import javax.swing.JApplet;
import java.awt.Color;
import java.awt.Graphics;

public class U10A2 extends JApplet
{
	public void init()
	{
		setBackground(Color.yellow);
	}

	public void paint(Graphics g)
	{
		Rectangle r1 = new Rectangle(25, 30, 10, 5);
		r1.drawRectangle(g);
		Rectangle r2 = new Rectangle(75, 100, 15, 3);
		r2.drawRectangle(g);
		Rectangle r3 = new Rectangle(50, 200, 8, 12);
		r3.drawRectangle(g);
	}
}