//Multilevel Inheritance 
//Program to show the Multilevel effect
class A
{
	A()
	{
		System.out.println("Constructor of Class A has been called");
	}
}
class B extends A
{
	B()
	{
		super();
		System.out.println("Constructor of Class B has been called");
	}
}
class C extends  B
{
	C()
	{
		super();
		System.out.println("Constructor of Class C has been called");
	}
}
class Constructor_Call
{
	public static void main(String args[])
	{
		System.out.println(" === Welcome to Constructor Demo  ===" );
		C objc = new C();
	}
}