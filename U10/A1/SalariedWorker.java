//David Wu
//
/* Salaried Worker subclass
*/

public class SalariedWorker extends Worker
{
	private int hours;

	public SalariedWorker(String n, double r, int h)
	{
		super(n,r);
		hours = h;
	}

	public double Wage()
	{
		return computePay(40);
	}
}