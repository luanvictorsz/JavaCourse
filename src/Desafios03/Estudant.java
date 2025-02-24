package Desafios03;

public class Estudant {
	
	public String Name;
	public double grade1, grade2, grade3;
	
	public double FinalGrade()
	{
		return grade1 + grade2 + grade3;
	}
	
	public double MissingPoints()
	{
		if(FinalGrade() <  60.0)
		{
			return 60.0 - FinalGrade();
		}
		else
		{
			return 0.0;
		}
			
	}
}
