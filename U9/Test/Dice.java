//David Wu
//
/* Dice class to compute a single roll
*/

public class Dice implements Measurable
{
	private int die1, die2;
	private String sum;

	public Dice(int a, int b)
	{
		die1 = a;
		die2 = b;
		setSum();
	}

	public void setSum()
	{
		int s = die1 + die2;
		sum = Integer.toString(s);
	}

	public String getResult()
	{
		return sum;
	}

}