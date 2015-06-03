//David Wu
//
/* Driver for Grade class, sends input to be converted
*/

import javax.swing.JOptionPane;

public class U3A1
{
	public static void main (String args[])
	{
		String letter = JOptionPane.showInputDialog("Please enter Letter Grade: ");
		String numerical = JOptionPane.showInputDialog("Please enter Numeric Grade: ");

		double convNum = Double.parseDouble(numerical);
		Grade x = new Grade(letter, convNum);
		double newNum = x.getNewNumeric();
		String newLet = x.getNewLetter();

		String output = ("Numeric Grade Equivalent = "+newNum);
		output += ("\n\nLetter Grade Equivalent = "+newLet);

		JOptionPane.showMessageDialog(null, output, "U3A1", JOptionPane.INFORMATION_MESSAGE);
	}
}