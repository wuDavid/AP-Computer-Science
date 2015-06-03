// David Wu
//
/* superclass of type baseball player
*/

public abstract class BaseballPlayer
{
	private String name;
	private int games;

	public BaseballPlayer(String n, int g)
	{
		name = n;
		games = g;
	}

	public String toString()
	{
		return "Name: "+name+"\nGames: "+games;
	}

	public abstract void setStat();
}