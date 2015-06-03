//David Wu
//
/* gets statistics for a certain dataset
*/

public class DataSet
{
	private static double max, min, ave, sum;
	private static int count;

	public DataSet()
	{
		max = 0.0;
		min = 0.0;
		ave = 0.0;
		sum = 0.0;
		count = 0;
	}

	public DataSet(Measurable p)
	{
		boolean flag = p.accept();

		if(flag)
		{
			count++;
			sum += p.getMeasure();
			if(count == 1)
			{
				min = p.getMeasure();
				max = p.getMeasure();
			}
			else
			{
				if(p.getMeasure() < min)
				{
					min = p.getMeasure();
				}
				if(p.getMeasure() > max)
				{
					max = p.getMeasure();
				}
			}
			ave = sum/count;
		}
	}

	public double getMax()
	{
		return max;
	}

	public double getMin()
	{
		return min;
	}

	public double getAve()
	{
		return ave;
	}
}