//David Wu
//
/* Tells cashier how much change to give in return for a specified payment
*/

public class Cashier
{
	private int amtDue;
	private int amtRec;
	private int amtDiff;

	public Cashier(int due, int rec, int diff)
	{
		amtDue = due;
		amtRec = rec;
		amtDiff = diff;
	}

	public int getDollars()
	{
		int dollars = amtDiff/100;
		amtDiff = amtDiff - 100*dollars;
		return dollars;
	}

	public int getQuarters()
	{
		int quarters = amtDiff/25;
		amtDiff = amtDiff - 25*quarters;
		return quarters;
	}

	public int getDimes()
	{
		int dimes = amtDiff/10;
		amtDiff = amtDiff - 10*dimes;
		return dimes;
	}

	public int getNickels()
	{
		int nickels = amtDiff/5;
		amtDiff = amtDiff - 5*nickels;
		return nickels;
	}

	public int getPennies()
	{
		int pennies = amtDiff/1;
		amtDiff = amtDiff - 1*pennies;
		return pennies;
	}
}