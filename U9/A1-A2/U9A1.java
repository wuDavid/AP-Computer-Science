//David Wu
//
/* Combines BankAccount and BBPlayer classes with an interface to simultaneously get statistics
*/

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.Container;
import java.awt.Font;
import java.io.*;
import java.util.Scanner;

public class U9A1 extends JFrame
{
	private JTextArea area;

	public static void main(String args[])
	{
		U9A1 x = new U9A1();
		x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public U9A1()
	{
		Container container = getContentPane();
		area = new JTextArea();
		Font font = new Font("MONOSPACED", Font.PLAIN, 14);
		area.setFont(font);
		container.add(area);
		setSize(500, 500);
		setVisible(true);

		testBBPlayer();
		testBankAccount();
	}
	public void testBBPlayer()
	{
		DataSet z = new DataSet();
		area.append("BBPlayer Stats\n______________\n\n");
		try
		{
			Scanner reader = new Scanner(new File("u7test.txt"));

			while (reader.hasNext())
			{
				String inputLine = reader.nextLine();
				BBPlayer n = new BBPlayer(inputLine);
				Measurable m1 = n;
				z = new DataSet(m1);
			}
			reader.close();
		}
		catch (IOException e)
		{
			throw new RuntimeException(e.toString());
		}
		area.append("Minimum Points Per Game = "+z.getMin()+"\n\n");
		area.append("Maximum Points Per Game = "+z.getMax()+"\n\n");
		String ap = String.format("%.2f",z.getAve());
		area.append("Average Points Per Game = "+ap+"\n\n");
		area.append("\n");
	}

	public void testBankAccount()
	{
		area.append("BankAccount Stats\n_________________\n\n");
		DataSet z = new DataSet();
		try
		{
			Scanner reader = new Scanner(new File("myCreditUnion.txt"));

			while (reader.hasNext())
			{
				String inputLine = reader.nextLine();
				String anum = inputLine.substring(0,4);
				String ibal = inputLine.substring(5,inputLine.length());
				double abal = Double.parseDouble(ibal);
				BankAccount a = new BankAccount(abal, anum);
				Measurable m2 = a;
				z = new DataSet(m2);
			}
			reader.close();
		}
		catch (IOException e)
		{
			throw new RuntimeException(e.toString());
		}
		area.append("Minimum Bank Account = "+z.getMin()+"\n\n");
		area.append("Maximum Bank Account = "+z.getMax()+"\n\n");
		String avr = String.format("%.2f", z.getAve());
		area.append("Average Bank Account = "+avr+"\n\n");
		area.append("\n");
	}
}
