//David Wu
//
/* Allows user input for type/weight of postage to calculate price
*/

import javax.swing.JApplet;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;
import java.awt.Container;
import java.awt.Graphics;

public class U3Test extends JApplet
{
	private double cost;
	public void init()
	{
		String postage = JOptionPane.showInputDialog
			("Enter Postage Type & ounces, separated by a space: ");

		String type = postage.substring(0,1);
		String strweight = postage.substring(2, postage.length());
		double weight = Double.parseDouble(strweight);

		Postage x = new Postage(type, weight);
		cost = x.calculate();

		setBackground(Color.yellow);
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.darkGray);
		Font myFont = new Font("Monospaced", Font.BOLD, 16);
		g.setFont(myFont);
		String script = "Cost to mail this item = ";
		g.drawString(script, 25, 50);
		String result = String.format("$ %.2f", cost);
		g.drawString(result, 40, 75);
	}
}