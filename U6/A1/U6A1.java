//David Wu
//
/* compare times for executing selection versus insertion sorts
*/

import java.util.Random;
import javax.swing.JApplet;
import javax.swing.JTextArea;
import java.awt.Container;

public class U6A1 extends JApplet
{
	private int[] selection = new int[10000];
	private int[] insertion = new int[10000];
	private long insertionTime;
	private long selectionTime;

	public void init()
	{
		buildArrays();

		JTextArea outputArea = new JTextArea();
		outputArea.setText("Unsorted Array\n\n");

		Container container = getContentPane();
		container.add(outputArea);

		for (int c = 0; c < 15; c++)
		{
			outputArea.append(selection[c]+"\t");
		}
		outputArea.append("\n");
		outputArea.append(".\n.\n.\n\n");
		for (int d = selection.length - 16; d < selection.length; d++)
		{
			outputArea.append(selection[d]+"\t");
		}
		outputArea.append("\n\n\n");

		selectionSort();
		outputArea.append("After Selection Sort\n\n");
		for (int e = 0; e < 15; e++)
		{
			outputArea.append(selection[e]+"\t");
		}
		outputArea.append("\n");
		outputArea.append(".\n.\n.\n\n");
		for (int f = selection.length - 16; f < selection.length; f++)
		{
			outputArea.append(selection[f]+"\t");
		}
		outputArea.append("\n\nTime = "+selectionTime+"milliseconds\n\n\n");

		insertionSort();
		outputArea.append("After Insertion Sort\n\n");
		for (int g = 0; g < 15; g++)
		{
			outputArea.append(insertion[g]+"\t");
		}
		outputArea.append("\n");
		outputArea.append(".\n.\n.\n\n");
		for (int h = insertion.length - 16; h < insertion.length; h++)
		{
			outputArea.append(insertion[h]+"\t");
		}
		outputArea.append("\n\nTime = "+insertionTime+"milliseconds\n\n\n");
	}

	public void buildArrays()
	{
		Random generator = new Random();
		for(int i = 0; i < selection.length; i++)
		{
			selection[i] = generator.nextInt(1000);
			insertion[i] = selection[i];
		}
	}

	public void selectionSort()
	{
		int minPos, temp;
		long startTimeSelection = System.currentTimeMillis();
		for (int j = 0; j < selection.length; j++)
		{
			minPos = j;

			for (int k = j + 1; k < selection.length; k++)
			{
				if(selection[k] < selection[minPos])
					minPos = k;
			}
			temp = selection[j];
			selection[j] = selection[minPos];
			selection[minPos] = temp;
		long endTimeSelection = System.currentTimeMillis();
		selectionTime = endTimeSelection - startTimeSelection;
		}
	}

	public void insertionSort()
	{
		 int a, b;
		 long startTimeInsertion = System.currentTimeMillis();
		 for (int n = 1; n < insertion.length; n++)
		 {
			 b = insertion[n];
			 a = n;

			 while (a > 0 && b < insertion[a - 1])
			 {
				 insertion[a] = insertion[a - 1];
				 a--;
			 }
			 insertion[a] = b;
		long endTimeInsertion = System.currentTimeMillis();
		insertionTime = endTimeInsertion - startTimeInsertion;
		}
	}
}