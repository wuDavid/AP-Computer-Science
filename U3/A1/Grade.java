//David Wu
//
/*Converts numeric grade to a letter grade and returns
*/

public class Grade
{
	private String origLetter;
	private String newLetter;
	private double origNumeric;
	private double newNumeric;

	public Grade (String letter, double numeric)
	{
		origLetter = letter;
		origNumeric = numeric;
		setNewNumeric();
		setNewLetter();
	}

	private void setNewNumeric()
	{
		String letter = origLetter.substring(0,1);
		if(letter.equalsIgnoreCase("A")) newNumeric = 4;
		else if(letter.equalsIgnoreCase("B")) newNumeric = 3;
		else if(letter.equalsIgnoreCase("C")) newNumeric = 2;
		else if(letter.equalsIgnoreCase("D")) newNumeric = 1;
		else if(letter.equalsIgnoreCase("F")) newNumeric = 0;

		String symbol = origLetter.substring(1,2);
		if((symbol.equals("+"))&&(newNumeric != 4)) newNumeric = newNumeric +.3;
		else if(symbol.equals("-")) newNumeric = newNumeric -.3;

	}

	private void setNewLetter()
	{
		if(origNumeric == 4.0) newLetter = "A+";
		else if((origNumeric <= 3.99)&&(origNumeric >= 3.85)) newLetter = "A";
		else if((origNumeric <= 3.84)&&(origNumeric >= 3.50)) newLetter = "A-";
		else if((origNumeric <= 3.49)&&(origNumeric >= 3.15)) newLetter = "B+";
		else if((origNumeric <= 3.14)&&(origNumeric >= 2.85)) newLetter = "B";
		else if((origNumeric <= 2.84)&&(origNumeric >= 2.50)) newLetter = "B-";
		else if((origNumeric <= 2.49)&&(origNumeric >= 2.15)) newLetter = "C+";
		else if((origNumeric <= 2.14)&&(origNumeric >= 1.85)) newLetter = "C";
		else if((origNumeric <= 1.84)&&(origNumeric >= 1.50)) newLetter = "C-";
		else if((origNumeric <= 1.49)&&(origNumeric >= 1.15)) newLetter = "D+";
		else if((origNumeric <= 1.14)&&(origNumeric >= 0.85)) newLetter = "D";
		else if((origNumeric <= 0.84)&&(origNumeric >= 0.50)) newLetter = "D-";
		else if(origNumeric <= 0.49) newLetter = "F";
	}

	public String getNewLetter()
	{
		return newLetter;
	}

	public double getNewNumeric()
	{
		return newNumeric;
	}
}