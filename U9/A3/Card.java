public class Card implements Comparable
{
	private String suit;
	private int value;
	private int point;

	public Card(String s, int v)
	{
		suit = s;
		value = v;
		setPoints();
	}

	public int compareTo(Object obj)
	{
		Card tmp = (Card) obj;
		if(tmp.getSuit().equals(suit))
		{
			if(tmp.getValue() > value)
				return -1;

			else if(tmp.getValue() < value)
				return 1;

			else return 0;
		}
		else return 1;
	}

	public void setPoints()
	{
		if(suit.equals("Hearts"))
			point = 1;

		else if(suit.equals("Spades") && value == 12)
			point = 13;

		else
			point = 0;
	}

	public String getSuit()
	{
		return suit;
	}

	public int getValue()
	{
		return value;
	}

	public int getPoint()
	{
		return point;
	}

	public String toString()
	{
		if(value < 11)
			return (value + " of " + suit);

		else if(value == 11)
			return ("Jack of " + suit);

		else if(value == 12)
			return ("Queen of " + suit);

		else if(value == 13)
			return ("King of " + suit);

		else if(value == 14)
			return ("Ace of " + suit);

		else
			return "Illegal Card";
	}
}