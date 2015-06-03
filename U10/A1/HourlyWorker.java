//David Wu
//
/* Hourly worker subclass
*/

public class HourlyWorker extends Worker
{
	private int hours;

	public HourlyWorker(String n, double r, int h)
	{
		super(n,r);
		hours = h;
	}

	public double Wage()
	{
		if(hours <= 40)
			return computePay(hours);

		else
			return (computePay(40)+computePay(hours-40)*1.5);
	}
}