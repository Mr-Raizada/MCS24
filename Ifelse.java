class Ifelse 
{
	public static void main(String args[])
	{
		int testScore = 78;
		char grade;
		if (testScore >= 90)
		{	
			grade = 'A';
		}
		if (testScore >= 75)
		{
			grade = 'B';
		}
		if (testScore >=60)
		{
			grade = 'C';
		}
		if (testScore >= 50)
		{	
			grade = 'D';
		}
		else 
		{
			grade = 'F';
		}
		System.out.println("Grade =  " +grade);
		}
	}

		
		
		