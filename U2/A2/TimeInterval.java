//David Wu
//
/* Provides methods to read amount of hours and minutes worked, then calculate pay
*/

public class TimeInterval
{
	private int startwork;
	private int endwork;
	private double payrate;

	public TimeInterval(int start, int end, double rate)
	{
		startwork = start;
		endwork = end;
		payrate = rate;
	}

	public int getHours()
	{
		int hwork = (((endwork/100)*60+(endwork%100))-((startwork/100)*60+(startwork%100)))/60;
		return hwork;
	}

	public int getMinutes()
	{
		int mwork = (((endwork/100)*60+(endwork%100))-((startwork/100)*60+(startwork%100)))%60;
		return mwork;
	}

	public double getPay()
	{
		int hwork = (((endwork/100)*60+(endwork%100))-((startwork/100)*60+(startwork%100)))/60;
		int mwork = (((endwork/100)*60+(endwork%100))-((startwork/100)*60+(startwork%100)))%60;
		double hpay = (double)hwork*payrate;
		double mpay = (double)mwork/60*payrate;
		double pay = hpay + mpay;
		return pay;
	}
}