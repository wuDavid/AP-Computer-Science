import javax.swing.JApplet;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class U3A2 extends JApplet
{
	private String name;
	private String status;
	private String blind;
	private String age;
	private String exemp;
	private String money;
	private String tax;
	private double inquiry;
	private String type;
	private String sBlind;
	private String sAge;
	private int deduct;

	public void init()
	{
		name = JOptionPane.showInputDialog("Enter your name: ");
		status = JOptionPane.showInputDialog("Enter Filing Status - Single(S) or Married(M): ");
		blind = JOptionPane.showInputDialog("Are you blind? Yes or No: ");
		age = JOptionPane.showInputDialog("Are you over 65? Yes or No: ");

		if(status.equals("M"))
		{
			sBlind = JOptionPane.showInputDialog("Is your Spouse blind? Yes or No: ");
			sAge = JOptionPane.showInputDialog("Is your Spouse over 65? Yes or No: ");
		}

		exemp = JOptionPane.showInputDialog("Enter total number of exemptions: ");
		money = JOptionPane.showInputDialog("Enter wages, salaries, & tips: ");
		tax = JOptionPane.showInputDialog("Enter Income Tax Withheld: ");

		int numExemp = Integer.parseInt(exemp);
		if(blind.equals("Yes"))
			deduct = deduct+1;
		if(age.equals("Yes"))
			deduct = deduct+1;
		if(status.equals("M"))
		{
			if(sBlind.equals("Yes"))
				deduct = deduct+1;
			if(sAge.equals("Yes"))
				deduct = deduct+1;
		}
		deduct = deduct + numExemp;
		inquiry = inquiry - deduct*1000;

		double numMoney = Double.parseDouble(money);
		if(status.equals("S"))
		{
			if((numMoney > 0) && (numMoney <= 21450))
			{
				inquiry = numMoney*.15;
			}
			if((numMoney > 21450) && (numMoney <= 51900))
			{
				inquiry = 3217.5+(.28*numMoney);
			}
			if(numMoney > 51900)
			{
				inquiry = 11743+(.31*numMoney);
			}
		}

		if(status.equals("M"))
		{
			if((numMoney > 0) && (numMoney <= 35800))
			{
				inquiry = numMoney*.15;
			}
			if((numMoney > 35800) && (numMoney <= 86500))
			{
				inquiry = 5370+(.28*numMoney);
			}
			if(numMoney > 86500)
			{
				inquiry = 19566+(.31*numMoney);
			}
		}

		double numTax = Double.parseDouble(tax);
		if (inquiry >= numTax)
		{
			inquiry = inquiry - numTax;
			type = "Owe";
		}
		else
		{
			inquiry = numTax - inquiry;
			type = "Refund";
		}

		setBackground(Color.yellow);
	}

	public void paint(Graphics g)
	{
		g.setColor(Color.blue);
		Font myFont = new Font("Monospaced", Font.BOLD, 16);
		g.setFont(myFont);
		String result = String.format("%s, below you will find \nthe results of your Tax Inquiry.\n\n\t%s =   $%.2f",name, type, inquiry);
		g.drawString(result, 25, 50);
	}
}