//David Wu
//
/* Count each outcome of a specific set of data
*/

public class Tally
{
	private String[] item;
	private int[] tally;

	public Tally(String[] a)
	{
		item = (String[])a.clone();
		tally = new int[item.length];
	}

	public void process(Measurable x)
	{
		for(int i = 0; i < item.length; i++)
		{
			if(x.getResult().equals(item[i]))
			{
				tally[i]++;
			}
		}

	}

	public int[] getTally()
	{
		return tally;
	}
}