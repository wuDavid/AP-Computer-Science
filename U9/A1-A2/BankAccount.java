//David Wu
//
/* methods to manage a balance of a bank account object
*/

public class BankAccount implements Measurable
{
	private String accountType;
	private String account;
	private double balance;
	private static final double rate = .04;

	public BankAccount(double a, String n)
	{
		balance = a;
		account = n;
		setAccountType(n);
	}

	public boolean accept()
	{
		if(balance > 1000)
		{
			return true;
		}
		else
			return false;
	}

	private void setAccountType(String b)
	{
		accountType = b.substring(3,4);
	}

	private void setBalance()
	{
		balance = Math.random() * 1000;
	}

	public String deposit(double d)
	{
		if(d > 0)
		{
			balance += d;
			return "Deposit Accepted";
		}

		else
		{
			return "Deposit Denied";
		}
	}

	public String withdrawal(double w)
	{
		if(w <= balance)
		{
			balance -= w;
			return "Withdrawal Accepted";
		}

		else
		{
			return "Withdrawal Denied - Insufficient Funds";
		}
	}

	public double interest()
	{
		if(accountType.equals("s"))
		{
			double total = (rate+1)*balance;
			balance = total;
			return total;
		}

		else
		{
			return balance;
		}
	}

	public String getNum()
	{
		return account;
	}

	public double getMeasure()
	{
		return balance;
	}

	public static String seeRate()
	{
		return (rate*100+" %");
	}
}