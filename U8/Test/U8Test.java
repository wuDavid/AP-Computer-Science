//David Wu
//
/* Reads, sorts, and prints data of basketball players
*/

import javax.swing.JTextArea;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class U8Test extends JFrame
{
	private ArrayList<BBPlayer> data = new ArrayList<BBPlayer>();
	private JTextArea area;

	public static void main(String args[])
	{
		U8Test x = new U8Test();

		x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public U8Test()
	{
		Container container = getContentPane();
		area = new JTextArea();
		Font font = new Font("MONOSPACED", Font.PLAIN, 14);
		area.setFont(font);
		container.add(area);
		setSize(500, 550);
		setVisible(true);

		try
		{
			Scanner reader = new Scanner(new File("u7test.txt"));

			while (reader.hasNext())
			{
				String inputLine = reader.nextLine();

				data.add(new BBPlayer(inputLine));
			}
			reader.close();
		}
		catch (IOException e)
		{
			throw new RuntimeException(e.toString());
		}
		area.append("Original List\n\n");
		PrintList();
		Sort();
		area.append("Sorted List\n\n");
		PrintList();

	}

	public void PrintList()
	{
		area.append("Number\tYear\tPosition\tPoint Per Game\n");
		area.append("------\t----\t--------\t--------------\n");
		int num = 0, year = 0;
		String pos = "";
		double ppg = 0;
		for(int x = 0; x<data.size(); x++)
		{
			BBPlayer print = data.get(x);
			num = print.getNum();
			year = print.getYear();
			pos = print.getPos();
			ppg = print.getPpg();
			String output = String.format("  %d\t %d\t   %s\t\t     %.1f\n", num, year, pos, ppg);
			area.append(output);
		}
		area.append("\n\n\n\n");
	}

	public void Sort()
	{
		double[] p = new double[data.size()];

		for(int b = 0; b < data.size(); b++)
		{
			BBPlayer player = data.get(b);
			p[b] = player.getPpg();
		}

		int minPos;
		double temp;
		for (int j = 0; j < p.length; j++)
		{
			minPos = j;

			for (int k = j + 1; k < p.length; k++)
			{
				if(p[k] > p[minPos])
					minPos = k;
			}
			BBPlayer te = data.get(j);
			data.set(j,data.get(minPos));
			data.set(minPos, te);

			temp = p[j];
			p[j] = p[minPos];
			p[minPos] = temp;
		}
	}
}