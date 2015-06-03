//David Wu
//
/* computes totals for 2D array of results
*/

public class ElectionResults
{
	private int numCandidates;
	private int numPrecincts;
	private int[][] results;
	private int[] cTotals;
	private int[] pTotals;
	private int grandTotal;

	public ElectionResults(int nC, int nP, int[][] r)
	{
		numCandidates = nC;
		numPrecincts = nP;
		results = r;

		cTotals = new int[numCandidates];
		pTotals = new int[numPrecincts];

		for(int a=0; a<nC; a++)
		{
			for(int b=0; b<nP; b++)
			{
				cTotals[a] += results[a][b];
			}
		}

		for(int c=0; c<nP; c++)
		{
			for(int d=0; d<nC; d++)
			{
				pTotals[c] += results[d][c];
			}
		}

		for(int e=0; e<nC; e++)
		{
			grandTotal += cTotals[e];
		}

	}
	public int[] getctotal()
	{
		return cTotals;
	}
	public int[] getptotal()
	{
		return pTotals;
	}
	public int getgrandtotal()
	{
		return grandTotal;
	}
}