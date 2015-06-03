//David Wu
//
/* Driver class for TimeInterval that takes input of work data and outputs pay
*/

import java.util.Scanner;

public class U2A2
{
	public static void main (String args[])
	{
		Scanner in = new Scanner(System.in);

		int starttime;
		int endtime;
		double payrate;
		int hours;
		int minutes;
		double pay;

		System.out.print("Start time: ");
		starttime = in.nextInt();

		System.out.print("End time: ");
		endtime = in.nextInt();

		System.out.print("Pay rate: ");
		payrate = in.nextDouble();

		TimeInterval x = new TimeInterval(starttime, endtime, payrate);

		hours = x.getHours();
		minutes = x.getMinutes();
		pay = x.getPay();

		System.out.printf("%nTime on task: %dh, %dm%n%n",hours,minutes);
		System.out.printf("Pay: $%.2f%n",pay);
	}
}
/* OUTPUT CODE:
Start time: 0930
End time: 1700
Pay rate: 12.75

Time on task: 7h, 30m

Pay: $95.63
*/