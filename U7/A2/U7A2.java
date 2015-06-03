//David Wu
//
/* reads/displays election results
*/

import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class U7A2
{
	public static void main(String args[])
	{
		for(int a=1; a<=3; a++)
		{
			Scanner in;

			String b = JOptionPane.showInputDialog("Enter number of candidates:");
			String c = JOptionPane.showInputDialog("Enter number of precincts:");
			int bi = Integer.parseInt(b);
			int ci = Integer.parseInt(c);

			int[][] results = new int[bi][ci];

			try
			{
				FileReader reader = new FileReader("Results"+(a)+".txt");
				in = new Scanner(reader);
			}
			catch (IOException e)
			{
				throw new RuntimeException(e.toString());
			}

			for (int i=0; i<bi; i++)
			{
				for (int j=0; j<ci; j++)
				{
					results[i][j] = in.nextInt();
				}
			}
			in.close();

			ElectionResults x = new ElectionResults(bi,ci,results);

			System.out.println("Total votes cast in each Precinct");
			System.out.println("---------------------------------");
			int[] ptotal = x.getptotal();
			int gtotal = x.getgrandtotal();
			for(int d=0; d<ci; d++)
			{
				System.out.println("Precinct "+(d+1)+": "+ptotal[d]);
			}
			System.out.println();
			System.out.println("Total votes cast = "+gtotal);
			System.out.println();
			System.out.println("Total votes cast for each Candidate");
			System.out.println("-----------------------------------");
			int[] ctotal = x.getctotal();
			double perc = 0;
			for(int e=0; e<bi; e++)
			{
				perc = ((double)ctotal[e]/(double)gtotal)*100;
				System.out.printf("Candidate %d: %d\t%.1f%%\n", e+1, ctotal[e],perc);

			}
			System.out.println();
			int small = ctotal[0];
			int win = 0;
			for(int f=0; f<ctotal.length; f++)
			{
				if(ctotal[f] > small)
				{
					small = ctotal[f];
					win = f+1;
				}
				else if(ctotal[f] == small)
					win = 1;
			}
			System.out.println("Candidate "+win+" is the WINNER!");
			System.out.println();
			System.out.println();
		}
	}
}

/*
OUTPUT CODE:

Total votes cast in each Precinct
---------------------------------
Precinct 1: 298
Precinct 2: 302
Precinct 3: 293
Precinct 4: 255

Total votes cast = 1148

Total votes cast for each Candidate
-----------------------------------
Candidate 1: 394        34.3%
Candidate 2: 386        33.6%
Candidate 3: 368        32.1%

Candidate 1 is the WINNER!


Total votes cast in each Precinct
---------------------------------
Precinct 1: 1431
Precinct 2: 810
Precinct 3: 756
Precinct 4: 1076
Precinct 5: 1582
Precinct 6: 1891

Total votes cast = 7546

Total votes cast for each Candidate
-----------------------------------
Candidate 1: 3825       50.7%
Candidate 2: 3721       49.3%

Candidate 1 is the WINNER!


Total votes cast in each Precinct
---------------------------------
Precinct 1: 851
Precinct 2: 1431
Precinct 3: 1306

Total votes cast = 3588

Total votes cast for each Candidate
-----------------------------------
Candidate 1: 1044       29.1%
Candidate 2: 848        23.6%
Candidate 3: 1176       32.8%
Candidate 4: 520        14.5%

Candidate 3 is the WINNER!
*/