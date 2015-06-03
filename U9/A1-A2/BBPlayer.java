//David Wu
//
/* separates string of data on each basketball player
*/

public class BBPlayer implements Measurable
{
	private int num;
	private int year;
	private String pos;
	private double ppg;

	public BBPlayer (String a)
	{
		String[] data = a.split(" ");
		num = Integer.parseInt(data[0]);
		year = Integer.parseInt(data[1]);
		pos = data[2];
		ppg = Double.parseDouble(data[3]);
	}

	public boolean accept()
	{
		if(ppg > 10)
		{
			return true;
		}
		else
			return false;
	}

	public int getNum()
	{
		return num;
	}

	public int getYear()
	{
		return year;
	}

	public String getPos()
	{
		return pos;
	}

	public double getMeasure()
	{
		return ppg;
	}
}