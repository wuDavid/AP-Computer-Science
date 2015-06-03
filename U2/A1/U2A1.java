//David Wu
//
/* Driver class for Cashier to read amount due and given to calculate change
*/

import java.util.Scanner;

public class U2A1
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);

		double due;
		double received;

		System.out.print("Amount due: ");
		due = in.nextDouble();

		System.out.print("Amount received: ");
		received = in.nextDouble();

		due = due*100;
		received = received*100;

		int centsdue = (int)due;
		int centsreceived = (int)received;

		double difference = received - due;
		int centsdifference = (int)(difference);

		Cashier x = new Cashier(centsdue, centsreceived, centsdifference);

		int dollars = x.getDollars();
		int quarters = x.getQuarters();
		int dimes = x.getDimes();
		int nickels = x.getNickels();
		int pennies = x.getPennies();

		System.out.printf("Dollars = %d%nQuarters = %d%nDimes = %d%nNickels = %d%nPennies = %d%n",dollars,quarters,dimes,nickels,pennies);
	}
}