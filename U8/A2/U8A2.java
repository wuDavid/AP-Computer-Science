//David Wu
//
/* Extensive methods on how to manipulate a group of bank accounts
*/

import javax.swing.JTextArea;
import java.awt.Container;
import javax.swing.JFrame;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class U8A2 extends JFrame
{
	private ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
	private JTextArea area;

	public static void main(String args[])
	{
		U8A2 x = new U8A2();

		x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public U8A2()
	{
		Container container = getContentPane();
		area = new JTextArea();
		area.setText("Account#\tBalance\n");
		container.add(area);
		setSize(500, 500);
		setVisible(true);

		BuildList();
		PrintList();
		Deposit("103s", 500);
		Withdraw("110s", 304.52);
		InsertNewAcct("105c", 300);
		DeleteDormantAccts();
		CorrectError("107s", 1113.88);
		ApplyInterest();
		InsertNewAcct("111s", 100);
		FileUpDated();
	}

	public void BuildList()
	{
		try
		{
			Scanner reader = new Scanner(new File("myCreditUnion.txt"));

			while (reader.hasNext())
			{
				String inputLine = reader.nextLine();
				String anum = inputLine.substring(0,4);
				String ibal = inputLine.substring(5,inputLine.length());
				double abal = Double.parseDouble(ibal);

				accounts.add(new BankAccount(abal, anum));
			}
			reader.close();
		}
		catch (IOException e)
		{
			throw new RuntimeException(e.toString());
		}
	}

	public void PrintList()
	{
		String num = "";
		double bal = 0;
		for(int x = 0; x<accounts.size(); x++)
		{
			BankAccount print = accounts.get(x);
			num = print.getNum();
			bal = print.getBalance();
			String output = String.format("%s\t$ %.2f\n", num, bal);
			area.append(output);
		}
		area.append("\n");
	}

	public void Deposit(String depNum, double dep)
	{
		for(int z = 0; z<accounts.size();z++)
		{
			BankAccount depo = accounts.get(z);
			if(depo.getNum().equals(depNum))
			{
				area.append(depo.deposit(dep)+"\n");
			}
		}
	}

	public void Withdraw(String withNum, double with)
	{
		for(int h = 0; h<accounts.size(); h++)
		{
			BankAccount withdraw = accounts.get(h);
			if(withdraw.getNum().equals(withNum))
			{
				area.append(withdraw.withdrawal(with)+"\n");
			}
		}
	}

	public void InsertNewAcct(String insNum, double initdep)
	{
		String act = "";
		BankAccount ins = new BankAccount(initdep, insNum);

		if(insNum.substring(3,4).equals("s"))
		{
			accounts.add(accounts.size(), ins);
			area.append("New Account Added\n");
		}

		else
		{
			for(int a = 0; a<accounts.size(); a++)
			{
				BankAccount nextins = accounts.get(a);
				act = nextins.getNum();
				if(act.substring(0,3).equals(insNum.substring(0,3)))
				{
					accounts.add(a+1, ins);
					area.append("New Account Added\n");
					break;
				}
			}
		}
	}

	public void DeleteDormantAccts()
	{
		double mon = 0;
		int count = 0;
		for(int b = 0; b<accounts.size(); b++)
		{
			BankAccount del = accounts.get(b);
			mon = del.getBalance();
			if(mon == 0)
			{
				accounts.remove(b);
				b--;
				count++;
			}
		}
		area.append(count+" Account(s) Removed\n");
	}

	public void CorrectError(String corrNum, double bal)
	{
		BankAccount correction = new BankAccount(bal, corrNum);
		for(int y = 0; y<accounts.size(); y++)
		{
			BankAccount corr = accounts.get(y);
			if(corrNum.equals(corr.getNum()))
			{
				accounts.set(y, correction);
				area.append("Correction Completed\n");
			}
		}
	}

	public void ApplyInterest()
	{
		for(int c = 0; c<accounts.size(); c++)
		{
			BankAccount appint = accounts.get(c);
			appint.interest();
		}
		area.append("Interest Applied to all Savings Accounts\n");
	}

	public void FileUpDated()
	{
		try
		{
			FileWriter writer = new FileWriter("temp.txt");
			PrintWriter out = new PrintWriter(writer);

			for(int d = 0; d<accounts.size(); d++)
			{
				BankAccount anAcct = accounts.get(d);
				String output = String.format("%s\t%.2f\n", anAcct.getNum(), anAcct.getBalance());
				out.println(output+"\n");
			}

			out.close();
			area.append("File Updated");
		}
		catch (IOException e)
		{
			throw new RuntimeException(e.toString());
		}
	}
}