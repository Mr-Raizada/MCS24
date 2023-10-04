class Marks
{
	String name;
	int percentage;
	String grade;
	Marks(String n, int m)
	{
		name = n;	
		percentage = m;
	}
	void Display()
	{
		System.out.println("Student Name: " +name);		
		System.out.println("Percentage Marks: " +percentage);
		System.out.println("Grade :" +grade);
		System.out.println("*****************************");
	}
}
class Object_Pass
{
	public static void main(String[] args)
	{
		Marks ob1 = new Marks("Naveen", 75);
		Marks ob2 = new Marks("Neeraj", 45);
		Set_Grade(ob1);
		System.out.println("**********************");
		ob1.Display();
		Set_Grade(ob2);
		ob2.Display();
	}
	static void Set_Grade(Marks m)
	{
		if(m.percentage >= 60)
		m.grade = "A";
		else if (m.percentage >=40)
		m.grade = "B";
		else 
		m.grade = "F";
	}
}
		

		