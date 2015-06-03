//David Wu
//
/* determines month and amount of days for a number input by user
*/

import javax.swing.JApplet;
import javax.swing.JTextArea;
import java.awt.Container;

public class U3A3 extends JApplet
{
	public void init()
	{
		String month;
		String monthnum = JOptionPane.showInputDialog
			("Please enter month as a number: ");

		switch(monthnum)
		{
			case "1":
				month = "January";
				break;
			case "2":
				month = "February";
				break;
			case "3":
				month = "March";
				break;
			case "4";
				month = "April";
				break;
			case "5";
				month = "May";
				break;
			case "6";
				month = "June";
				break;
			case "7";
				month = "July";
				break;
			case "8";
				month = "August";
				break;
			case "9";
				month = "September";
				break;
			case "10";
				month = "October";
				break;
			case "11";
				month = "November";
				break;
			case "12";
				month = "December";
				break;
		}

		Month x = new Month();
	}

