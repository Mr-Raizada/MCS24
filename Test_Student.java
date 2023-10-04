class Student
{
	String name;
	String address;
	int age;
	Student(String a, String b, int c)
	{
		name = a;
		address = b;
		age = c;
	}
	void display()
	{
		System.out.print("*** Student Information ***");
		System.out.print("Name : " + name + "\n" + "Address : " + address + "\n" + "Age : " +age);
	}
}
	class PG_Student extends Student
	{
		int age; 
		int percentage;
		String course;
		PG_Student(String a, String b, String d , int c, int e )
		{
			super(a, b, c);
			course = d;
			age = super.age;
		}
		void display()
		{
			super.display();
			System.out.println("Course:" +course);
		}
	}
	class Test_Student
	{
		public static void main(String[] args)
		{
			Student std1 = new Student("Mr. Arvind Kumar","B/34/2 Saket",23);
			PG_Student pgstd1 = new PG_Student ("\nMr. Arun Kumar","\nB/36/2 Saket","\nMCA",27,80);
			std1.display();
			pgstd1.display();
		}	
	}
			


