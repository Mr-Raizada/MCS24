package MyPack;
class Student
{
	String Name;
	int Age;
	String Course;
	Student(String n, int a , String c)
	{
		Name = n;
		Age = a;
		Course = c;
	}
	void Student_Information()
	{
		System.out.println("Name of the Student : " +Name);
		System.out.println("Age of the Studnet: " +Age);
		System.out.println(" Enorolled in Course : " +Course);
	}
}

	class PackTest
	{
		public static void main(String[] args)
		{
			Std1.Student_Information();
		}
	}
	

	