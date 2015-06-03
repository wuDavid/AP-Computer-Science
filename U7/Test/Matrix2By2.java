//David Wu
//
/* computes solution to system of equations by finding determinant, inverse, and multiplies
*/

public class Matrix2By2
{
	private int[][] matrix = new int[2][2];

 	public void setMatrix(int[][] a)
 	{
 	 	matrix = a;
 	}

 	private int determinant()
 	{
 	 	int det = matrix[0][0]*matrix[1][1] - matrix[0][1]*matrix[1][0];
 	 	return det;
 	}

 	public int getDet()
 	{
 		 return determinant();
 	}

 	private double[][] inverse()
 	{
 		 double[][] inv = new double[2][2];
 		 double d = 1/(double)determinant();
 		 inv[0][0] = (double)matrix[1][1]*d;
 		 inv[0][1] = (double)-matrix[0][1]*d;
 		 inv[1][0] = (double)-matrix[1][0]*d;
 		 inv[1][1] = (double)matrix[0][0]*d;

 		 return inv;
 	}

 	public double[] multiply(int[] c)
 	{
 		 double[] mul = new double[2];
 		 double[][] inv1 = inverse();
 		 mul[0] = (inv1[0][0]*c[0])+(inv1[0][1]*c[1]);
 		 mul[1] = (inv1[1][0]*c[0])+(inv1[1][1]*c[1]);
 		 return mul;
 	}
}