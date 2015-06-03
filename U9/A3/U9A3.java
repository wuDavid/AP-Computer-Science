import java.util.ArrayList;
import javax.swing.JOptionPane;

public class U9A3
{
	public static void main (String args[])
	{
		ArrayList<Card> card = new ArrayList<Card>();
		String[] c = new String[5];
		String [] b = new String[5];

		for(int i = 0; i < c.length; i++)
		{
			c[i] = JOptionPane.showInputDialog("Enter Card " + (i+1));
		}

		for(int i = 0; i < b.length; i++)
		{
			String[] a = c[i].split(" ");
			int v = Integer.parseInt(a[1]);
			Card n = new Card(a[0], v);
			card.add(n);
		}

		Trick t = new Trick(card);

		System.out.println("The Trick: \n");
		for(int i = 0; i < card.size(); i++)
		{
			System.out.println(card.get(i));
		}
		System.out.println("\nWinning Card = " + t.getWinner()+"\n");
		System.out.println("Points in Trick = "+ t.getTotal());
	}
}

/* OUTPUT CODE:

The Trick:

4 of Diamonds
8 of Diamonds
Ace of Spades
King of Clubs
Ace of Diamonds

Winning Card = Ace of Diamonds

Points in Trick = 0

------------------------------
The Trick:

7 of Spades
3 of Spades
10 of Spades
Ace of Hearts
9 of Spades

Winning Card = 10 of Spades

Points in Trick = 1

------------------------------
The Trick:

5 of Clubs
8 of Hearts
2 of Clubs
Queen of Spades
Jack of Hearts

Winning Card = 5 of Clubs

Points in Trick = 15

*/