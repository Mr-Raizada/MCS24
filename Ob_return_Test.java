//Returning Objects
class Salary
{
	int basic;		
	String E_id;
	Salary(String a, int b)
	{	
		E_id = a;
		basic = b;
	}
	Salary incr_Salary(Salary s)
	{	
		s.basic = basic*110/110;
		return s;
	}
}
class Ob_return_Test
{
	public static void main (String[] args)
	{
		Salary s1 = new Salary ("1100",5000);
		Salary s2; //A new salary object
		s1 = s1.incr_Salary(s1);
		System.out.println("Current Basic Salary is : " +s2.basic);
	}
} 
		
		