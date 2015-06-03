//David Wu
//
/* Prints statistics about a list of different baseball players
*/

import java.util.ArrayList;

public class u10test
{
	private ArrayList<BaseballPlayer> players = new ArrayList<>();

	public static void main(String args[])
	{
		u10test x = new u10test();
	}

	public u10test()
	{
		players.add(new Hitter("Tyler Lawson", 29, 78, 25));
		players.add(new Hitter("Jason Brown", 16, 54, 13));
		players.add(new Pitcher("Tom Jensen", 9, 50.7, 18));
		players.add(new Pitcher("Jason Brown", 10, 72.3, 15));
		players.add(new Fielder("Willie Starks", 30, 11, 97, 4));
		players.add(new Fielder("Jason Brown", 16, 23, 6, 3));

		for(int i = 0; i < players.size(); i++)
		{
			BaseballPlayer x = players.get(i);
			System.out.println(x);
		}
	}
}

/* OUTPUT CODE:

Name: Tyler Lawson
Games: 29
Batting Average: 0.321

Name: Jason Brown
Games: 16
Batting Average: 0.241

Name: Tom Jensen
Games: 9
Earned Run Average: 3.20

Name: Jason Brown
Games: 10
Earned Run Average: 1.87

Name: Willie Starks
Games: 30
Fielding Percentage: 0.964

Name: Jason Brown
Games: 16
Fielding Percentage: 0.906

*/