//program
interface One
{
	void MethodOne();
}
interface Two extends One
{
	default  void MethodOne()
	{
		System.out.println("Method of interface One is implemented");
	}
	void MethodTwo();
	
}

class interfaceInherit implements Two {
	public void MethodTwo()
	{
		System.out.println("Method of interface Two is implemented");
	}
}	


class TestInterface 
{
	public static void main(String args[])
	{
		System.out.println("Interface Inheritance Demonstration");
		interfaceInherit object = new interfaceInherit();
		object.MethodOne();
		object.MethodTwo();
	}
}
