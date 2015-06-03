//David Wu
//
/* outputs text to bank account actions
*/

import javax.swing.JApplet;
import javax.swing.JTextArea;
import java.awt.Container;

public class U8A1 extends JApplet
{
	public void init()
	{
		JTextArea area = new JTextArea();
		area.setText("Account Information\n-------------------\n\n");

		Container container = getContentPane();
		container.add(area);

		BankAccount first = new BankAccount();
		BankAccount second = new BankAccount(1500);

		String initial1 = String.format("Initial Balance for Account %d = $ %.2f \n", first.getNum(), first.getBalance());
		String initial2 = String.format("Initial Balance for Account %d = $ %.2f \n", second.getNum(), second.getBalance());
		area.append(initial1);
		area.append(initial2);

		area.append("\n");

		area.append(first.deposit(300)+"\n");
		area.append(second.deposit(200)+"\n");

		area.append(first.withdrawal(250)+"\n");
		area.append(second.withdrawal(125)+"\n");

		first.interest();
		second.interest();

		String transfer = first.withdrawal(550);
		area.append(transfer+"\n");

		if(transfer == "Withdrawal Accepted")
		{
			area.append(second.deposit(550)+"\n");
		}

		else
		{
			area.append("Deposit Rejected\n");
		}

		area.append("\n");

		first.interest();
		second.interest();

		String final1 = String.format("Final Balance for Account %d = $ %.2f \n", first.getNum(), first.getBalance());
		String final2 = String.format("Final Balance for Account %d = $ %.2f \n", second.getNum(), second.getBalance());

		area.append(final1);
		area.append(final2);

		area.append("\n");

		area.append("Interest Rate = "+BankAccount.seeRate());
	}
}
