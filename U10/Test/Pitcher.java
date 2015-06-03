// David Wu
//
/* subclass pitcher of superclass baseballplayer
*/

public class Pitcher extends BaseballPlayer
{
	private double innings;
	private int runs;
	private double ravg;

	public Pitcher(String n, int g, double i, int r)
	{
		super(n,g);
		innings = i;
		runs = r;
		setStat();
	}

	public String toString()
	{
		String out = String.format("%.2f", ravg);
		return super.toString() + "\nEarned Run Average: "+out+"\n";
	}

	public void setStat()
	{
		ravg = (9*runs)/innings;
	}
}