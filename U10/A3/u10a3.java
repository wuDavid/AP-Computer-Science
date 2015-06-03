//David Wu
//
/* Draws a list of 10 random vehicles
*/

import javax.swing.JFrame;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class u10a3 extends JFrame
{
	private ArrayList<Vehicle> list = new ArrayList<Vehicle>();

	public static void main(String args[])
	{
		u10a3 x = new u10a3();
		x.setSize(500, 500);
		x.setVisible(true);
		x.setBackground(Color.yellow);
		x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public u10a3()
	{
		super("Unit 10 Assignment 3");
		for(int i = 0; i<10; i++)
		{
			int r = (int)(Math.random()*101);
			int x = (int)(Math.random()*400+10);
			int y = (int)(Math.random()*420+50);

			if(r%2 == 0)
			{
				Vehicle c = new Car(x,y);
				list.add(c);
			}

			else
			{
				Vehicle t = new Truck(x,y);
				list.add(t);
			}
		}
	}

	public void paint(Graphics g)
	{
		for(int i = 0; i<list.size(); i++)
		{
			Vehicle x = list.get(i);
			x.draw(g);
		}
	}
}