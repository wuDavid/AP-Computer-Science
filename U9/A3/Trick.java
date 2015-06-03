import java.util.ArrayList;

public class Trick
{
	private ArrayList<Card> cards = new ArrayList<Card>();
	private int total;

	public Trick(ArrayList<Card> a)
	{
		cards = a;
		setTotalPoints();
	}

	public void setTotalPoints()
	{
		for(int i = 0; i < cards.size(); i++)
		{
			Card t = cards.get(i);
			total += t.getPoint();
		}
	}

	public int getTotal()
	{
		return total;
	}

	public String toString()
	{
		String str = "";
		for(int i = 0; i < cards.size(); i++)
		{
			Card p = cards.get(i);
			str += p+"\n";
		}
		return str;
	}

	public Card getWinner()
	{
		int c = 0;
		Card first = cards.get(0);
		Card winner = first;

		for(int i = 1; i < cards.size(); i++)
		{
			Object com = cards.get(i);
			c = winner.compareTo(com);
			if(c == -1)
			{
				winner = (Card) com;
			}
		}
		return winner;
	}
}