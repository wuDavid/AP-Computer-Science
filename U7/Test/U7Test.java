//David Wu
//
/* takes input system of equations and sends to compute solution
*/

import java.util.Scanner;

public class U7Test
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);

		for(int a=0;a<2;a++)
		{
			int[][] dank = new int[2][2];
			int[] cons = new int[2];

			System.out.print("Enter 1st X coefficient: ");
			dank[0][0] = in.nextInt();

			System.out.print("Enter 1st Y coefficient: ");
			dank[0][1] = in.nextInt();

			System.out.print("Enter 1st constant: ");
			cons[0] = in.nextInt();

			System.out.println();

			System.out.print("Enter 2nd X coefficient: ");
			dank[1][0] = in.nextInt();

			System.out.print("Enter 2nd Y coefficient: ");
			dank[1][1] = in.nextInt();

			System.out.print("Enter 2nd constant: ");
			cons[1] = in.nextInt();

			System.out.println();
			System.out.println();

			Matrix2By2 x = new Matrix2By2();
			x.setMatrix(dank);

			int det = x.getDet();
			if (det == 0)
			{
				System.out.println("NO SOLUTION");
			}
			else
			{
				double[] out = x.multiply(cons);
				System.out.println("X = "+out[0]);
				System.out.println("Y = "+out[1]);
			}

			System.out.println();
			System.out.println();
			System.out.println();
		}
	}
}

/* OUTPUT CODE:
 Enter 1st X coefficient: 7
 Enter 1st Y coefficient: 3
 Enter 1st constant: 25

 Enter 2nd X coefficient: 9
 Enter 2nd Y coefficient: -2
 Enter 2nd constant: -3


 X = 1.0
 Y = 6.0



 Enter 1st X coefficient: 3
 Enter 1st Y coefficient: -2
 Enter 1st constant: 11

 Enter 2nd X coefficient: 6
 Enter 2nd Y coefficient: -4
 Enter 2nd constant: 5


 NO SOLUTION


*/