//David Wu
//
/* Computes a set of quizzes or dice rolls to find amount of each score
*/

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.Container;
import java.awt.Font;

public class U9Test extends JFrame
{
	private JTextArea area;

	public static void main(String args[])
	{
		U9Test x = new U9Test();
		x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public U9Test()
	{
		Container container = getContentPane();
		area = new JTextArea();
		Font font = new Font("MONOSPACED", Font.PLAIN, 14);
		area.setFont(font);
		container.add(area);
		setSize(500, 700);
		setVisible(true);

		testDice();
		testQuiz();
	}

	public void testDice()
	{
		int r1 = 0, r2 = 0;

		String[] roll = {"2","3","4","5","6","7","8","9","10","11","12"};

		Tally dice = new Tally(roll);

		for(int i = 0; i<100; i++)
		{
			r1 = 1+(int)(Math.random()*6);
			r2 = 1+(int)(Math.random()*6);
			Dice x = new Dice(r1, r2);
			dice.process(x);
		}

		int[] rollt = dice.getTally();
		area.append("\tDice Tally\n\t----------\n\n");
		area.append("Item\t\tTally\n----\t\t-----\n");
		for(int a = 0; a < roll.length; a++)
		{
			area.append(" "+roll[a]+"\t\t "+rollt[a]+"\n");
		}
		area.append("\n\n");
	}

	public void testQuiz()
	{
		int q = 0;
		String[] grade = {"A","B","C","D","F"};

		Tally quiz = new Tally(grade);

		for(int i = 0; i<100; i++)
		{
			q = 50+(int)(Math.random()*51);
			Quiz z = new Quiz(q);
			quiz.process(z);
		}

		int[] quizt = quiz.getTally();
		area.append("\tQuiz Tally\n\t----------\n\n");
		area.append("Item\t\tTally\n----\t\t-----\n");
		for(int a = 0; a < grade.length; a++)
		{
			area.append(" "+grade[a]+"\t\t "+quizt[a]+"\n");
		}
	}
}