//David Wu
//
/* Worker superclass
*/

public class Worker
{
	private String name;
	private double rate;

	public Worker(String n, double r)
	{
		name = n;
		rate = r;
	}

	public double computePay(int hours)
	{
		return hours*rate;
	}

	public String getName()
	{
		String[] split = name.split(" ");
		String initial = split[0].substring(0,1);
		return split[1]+", "+initial+".";
	}
}


