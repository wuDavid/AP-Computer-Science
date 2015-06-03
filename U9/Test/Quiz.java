//David Wu
//
/* Quiz class to compute a single quiz
*/

public class Quiz implements Measurable
{
	private int score;
	private String grade;

	public Quiz(int a)
	{
		score = a;
		setGrade();
	}

	public void setGrade()
	{
		if(score >= 90)
			grade = "A";

		if(score < 90 && score >= 80)
			grade = "B";

		if(score < 80 && score >= 70)
			grade = "C";

		if(score < 70 && score >= 60)
			grade = "D";

		if(score < 60)
			grade = "F";
	}

	public String getResult()
	{
		return grade;
	}

}