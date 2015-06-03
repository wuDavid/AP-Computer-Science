//David Wu
//
/* Sorts an array by alphabet and length, then finds position of an element
*/

import javax.swing.JApplet;
import javax.swing.JTextArea;
import java.awt.Container;

public class U6Test extends JApplet
{
	private String a[] = {"Barr", "Chamberlain", "Fullam", "Gertler", "Jones", "Krantzler", "Ferguson", "Litchfield", "Johnson", "Sundeen", "Baker", "Celebucki", "Dunagan", "Eckert", "Framke", "Hoekstra", "Jackson", "Klupchak", "Kurtz", "Mahler", "Maxwell", "Rothermel", "Tarjan", "Tiller", "Turek"};

	public void init()
	{
		JTextArea area = new JTextArea();
		area.setText("Sorted Alphabetically\tSorted by Length\n");
		area.append("---------------------\t\t----------------\n");

		Container container = getContentPane();
		container.add(area);

		alphabet();
		int BSearch = Binary("Jones");
		String[] copy = new String[a.length];
		System.arraycopy(a,0,copy,0,a.length);
		length();
		int LSearch = Sequential("Jones") - 1;
		for(int r = 0; r < copy.length; r++)
		{
			area.append(copy[r]+"\t\t"+a[r]+"\n");
		}
		area.append("\nJones at index "+BSearch+"\tJones at index "+LSearch);
	}

	public void alphabet()
	{
		int minPosA;
		String tempA;

		for (int j = 0; j < a.length - 1; j++)
		{
			minPosA = j;

			for (int k = j + 1; k < a.length; k++)
			{
				int z = a[k].compareTo(a[minPosA]);
				int y = a[minPosA].compareTo(a[k]);

				if (z < y)
					minPosA = k;
			}

			tempA = a[j];
			a[j] = a[minPosA];
			a[minPosA] = tempA;
		}
	}

	public void length()
	{
		int t;
		String tempL;

		for(int u = 1; u < a.length; u++)
		{
			tempL = a[u];
			t = u;

			while(t>0 && tempL.length() < a[t-1].length())
			{
				a[t] = a[t-1];
				t--;
			}

			a[t] = tempL;
		}
	}

	public int Binary(String Btarget)
	{
		int low = 0;
		int high = a.length - 1;
		int mid, dif, count = 0;

		while (low <= high)
		{
			count++;
			mid = (low + high)/2;
			dif = a[mid].compareTo(Btarget);

			if (dif == 0)
				return mid;
			else if (dif < 0)
				low = mid + 1;
			else
				high = mid - 1;
		}
		return -1;
	}

	public int Sequential(String Starget)
	{
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] == Starget)
				return i+1;
		}
		return -1;
	}
}