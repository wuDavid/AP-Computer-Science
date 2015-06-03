//David Wu
//
/* runs the game of life and displays generation 0,2,4
*/

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.Container;
import java.awt.Font;

public class U7A1 extends JFrame
{
	private JTextArea output;'l
	private String board[][] = {{" ", " ", " ", " ", " ", " "},
                                  {" ", " ", "*", " ", " ", " "},
                                  {" ", " ", " ", "*", " ", " "},
                                  {" ", "*", "*", "*", " ", " "},
                                  {" ", " ", " ", " ", " ", " "},
                                  {" ", " ", " ", " ", " ", " "}};

	public U7A1()        // default constructor
	{
		Container container = getContentPane();
		output = new JTextArea();
		output.setFont(new Font("Monospaced", Font.PLAIN, 10));
		output.setText("Generation 0\n");
		container.add(output);

		PrintMatrix();

		for(int m = 0; m <= 4; m++)
		{
			ChangeMatrix();
			if(m == 1 || m == 3)
			{
				output.append("Generation "+(m+1)+"\n");
				PrintMatrix();
			}
		}

		setSize(200, 500);    // sets size of JFrame
		setVisible(true);     // makes JFrame visible
	}

	public void PrintMatrix()
	{
		for (int j=0; j<6; j++)
		{
			output.append("|");
			for (int k=0; k<6; k++)
			{
				output.append(board[j][k] + "|");
			}
			output.append("\n");
			output.append("-------------\n");
		}
	}

	public static void main(String args[])
	{
		U7A1 application = new U7A1();  // calling default
                                                        // constructor

		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// closes application when you close the JFrame
	}

	public void ChangeMatrix()
	{
		int change;
		String temp[][] = new String[6][6];
		for(int i = 0; i < board.length; i++)
		{
			System.arraycopy(board[i],0,temp[i],0,board[0].length);
		}
		for(int x = 0; x < 6; x++)
		{
			for(int y = 0; y < 6; y++)
			{
				change = NumNeighbors(x, y);
				System.out.println(change);
				if(change < 2 || change > 3)
					temp[x][y] = (" ");
				else if(change == 3)
					temp[x][y] = ("*");
			}
		}
		board = temp;
	}

	public int NumNeighbors(int row, int col)
	{
		int count = 0;
		for(int a = row-1; a <= row + 1; a++)
		{
			for(int b = col-1; b <= col + 1; b++)
			{
				try
				{
				if(board[a][b].equals("*"))
					count++;
				}
				catch(ArrayIndexOutOfBoundsException e)
				{
					continue;
				}
			}
		}
		if(board[row][col].equals("*"))
			count--;

		return count;
	}
}
