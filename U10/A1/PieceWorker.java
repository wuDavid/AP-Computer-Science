//David Wu
//
/* Piece worker subclass
*/

public class PieceWorker extends Worker
{
	private int hours;

	public PieceWorker(String n, double r, int h)
	{
		super(n,r);
		hours = h;
	}

	public double Wage(int pieces)
	{
		double p = computePay(pieces);
		return (p+super.computePay(hours));
	}

	public double computePay(int numOfPieces)
	{
		return numOfPieces*.12;
	}
}