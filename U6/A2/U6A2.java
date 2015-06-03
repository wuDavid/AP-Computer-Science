import java.util.Random;
import javax.swing.JApplet;
import javax.swing.JTextArea;
import java.awt.Container;

public class U6A2 extends JApplet
{
	private int[] merge = new int[5000];
	private int[] quick = new int[5000];

	public void init()
	{
		int c, d, e, f, g, h;
		buildArrays();

		JTextArea outputArea = new JTextArea();
		outputArea.setText("Unsorted Array\n\n");

		Container container = getContentPane();
		container.add(outputArea);

		for (c = 0; c < 15; c++)
		{
			outputArea.append(merge[c]+"\t");
		}
		outputArea.append("\n");
		outputArea.append(".\n.\n.\n\n");
		for (d = merge.length - 15; d < merge.length; d++)
		{
			outputArea.append(merge[d]+"\t");
		}
		outputArea.append("\n\n\n");

		MergeSorter msort = new MergeSorter(merge);
		long mstart = System.currentTimeMillis();
		msort.sort();
		long mend = System.currentTimeMillis();
		long mtime = mend - mstart;
		outputArea.append("Merge Sort\n\n");
		for (e = 0; e < 15; e++)
		{
			outputArea.append(merge[e]+"\t");
		}
		outputArea.append("\n");
		outputArea.append(".\n.\n.\n\n");
		for (f = merge.length - 15; f < merge.length; f++)
		{
			outputArea.append(merge[f]+"\t");
		}
		outputArea.append("\n\nTime = "+mtime+" milliseconds\n\n\n");

		QuickSorter qsort = new QuickSorter(quick);
		long qstart = System.currentTimeMillis();
		qsort.sort(0, 4999);
		long qend = System.currentTimeMillis();
		long qtime = qstart - qend;
		outputArea.append("QuickSort\n\n");
		for (g = 0; g < 15; g++)
		{
			outputArea.append(quick[g]+"\t");
		}
		outputArea.append("\n");
		outputArea.append(".\n.\n.\n\n");
		for (h = quick.length - 15; h < quick.length; h++)
		{
			outputArea.append(quick[h]+"\t");
		}
		outputArea.append("\n\nTime = "+qtime+" milliseconds\n\n\n");
	}

	public void buildArrays()
	{
		Random generator = new Random();
		int x;
		for(int i = 0; i < 5000; i++)
		{
			x = generator.nextInt(1000);
			merge[i] = x;
			quick[i] = x;
		}
	}
}