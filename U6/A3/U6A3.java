//David Wu
//
/* compares sequential and binary searches
*/

import javax.swing.JApplet;
import javax.swing.JTextArea;
import java.awt.Container;

public class U6A3 extends JApplet
{
	private int[] a = new int[300];
	private int[] find = {2, 2629, 11176, 27032, 43661};

	public void init()
	{
		JTextArea area = new JTextArea();
		area.setText("The Array\n\n");

		Container container = getContentPane();
		container.add(area);

		BuildArray();

		for(int z = 0; z < 20; z++)
		{
			for(int b = 0; b < 15; b++)
			{
				area.append(a[z*15+b]+"\t");
			}
			area.append("\n");
		}
		area.append("\n\n\nSearch Comparisons using # of visits to the Array\n\n");
		area.append("Number\tSequential\tBinary\n");
		area.append("------\t----------\t------\n");

		for(int f = 0; f < find.length; f++)
		{
			int seq = Sequential(find[f]);
			int bin = Binary(find[f]);
			String seqstr = "", binstr = "";
			if(seq == -1)
				seqstr = ("Not Found");
			else
				seqstr += seq;
			if(bin == -1)
				binstr = ("Not Found");
			else
				binstr += bin;

			area.append(find[f]+"\t"+seqstr+"\t"+binstr+"\n");
		}

	}
	public void BuildArray()
	{
		int counter = 1;
		for(int x = 0; x < 300; x++)
		{
			a[x] = counter*(counter-1)/2 + 1;
			counter++;
		}
	}

	public int Sequential(int targets)
	{
		for (int i=0; i<a.length; i++)
		{
			if (a[i] == targets)
				return i+1;
		}
		return -1;

	}

	public int Binary(int targetb)
	{
		int low = 0;
		int high = a.length - 1;
		int mid, dif, count = 0;

		while (low <= high)
		{
			count++;
			mid = (low + high)/2;
			dif = a[mid] - targetb;

			if (dif == 0)
				return count;
			else if (dif < 0)
				low = mid + 1;
			else
				high = mid - 1;
		}
		return -1;

	}
}