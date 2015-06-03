//David Wu
//
/* subclass hitter of superclass baseball player
*/

public class Hitter extends BaseballPlayer
{
	private int atbats;
	private int hits;
	private double bavg;

	public Hitter(String n, int g, int at, int h)
	{
		super(n,g);
		atbats = at;
		hits = h;
		setStat();
	}

	public String toString()
	{
		String out = String.format("%.3f", bavg);
		return super.toString() + "\nBatting Average: "+out+"\n";
	}

	public void setStat()
	{
		bavg = (double)hits/(double)atbats;
	}
}