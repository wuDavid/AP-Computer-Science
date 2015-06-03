//David Wu
//
/* subclass fielder of superclass baseball player
*/

public class Fielder extends BaseballPlayer
{
	private int assists;
	private int putouts;
	private int errors;
	private double fper;

	public Fielder(String n, int g, int a, int p, int e)
	{
		super(n,g);
		assists = a;
		putouts = p;
		errors = e;
		setStat();
	}

	public String toString()
	{
		String out = String.format("%.3f", fper);
		return super.toString() + "\nFielding Percentage: "+out+"\n";
	}

	public void setStat()
	{
		fper = (double)(assists+putouts)/(double)(assists+putouts+errors);
	}
}