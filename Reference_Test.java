class Person 
{
	String name;
	int age;
	String address;
	void Display()
	{
		System.out.println("Personal Information  " + name + "("+age+")" + "\n"+address);
	}
}
class Reference_Test
{
	public static void main(String args[])
	{
		Person p = new Person();
		Person q = new Person();
		p.name = "Mr. Naveen Kumar";
		p.age = 24;
		p.address = "248, Sector 22, Noida"; 
		p.Display();
		p = q; // q refers to p// the Location of of p is changed with  the q, Working
		q.name = "Mr Suresh";
		q.age = 25;
		q.address = "22, Mahanadi, IGNOU Gandhi Maidan";
		p.Display();
		q.Display();
	}
}
	

		
		