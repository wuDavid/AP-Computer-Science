//David Wu
//
/* Finds wages for different types of workers
*/

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.Container;
import java.awt.Font;

public class U10A1 extends JFrame
{
	private JTextArea area;

	public static void main(String args[])
	{
		U10A1 x = new U10A1();
		x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public U10A1()
	{
		Container container = getContentPane();
		area = new JTextArea();
		Font font = new Font("MONOSPACED", Font.PLAIN, 16);
		area.setFont(font);
		container.add(area);
		setSize(400, 400);
		setVisible(true);

		TestHourly();
		TestSalaried();
		TestPiece();
	}

	public void TestHourly()
	{
		HourlyWorker a = new HourlyWorker("John Doe", 9.48, 43);
		area.append("Test Hourly Worker Class\n------------------------\n");
		area.append(String.format("Wage for %s = $%.2f\n\n\n",a.getName(), a.Wage()));
	}

	public void TestSalaried()
	{
		SalariedWorker b = new SalariedWorker("Karen Jones", 25.76, 52);
		area.append("Test Salaried Worker Class\n--------------------------\n");
		area.append(String.format("Wage for %s = $%.2f\n\n\n",b.getName(), b.Wage()));
	}

	public void TestPiece()
	{
		PieceWorker c = new PieceWorker("Wesley Smith", 5.65, 36);
		area.append("Test Piece Worker Class\n-----------------------\n");
		area.append(String.format("Wage for %s = $%.2f\n\n\n",c.getName(), c.Wage(1025)));
	}
}

