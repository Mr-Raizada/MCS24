//Method Overloading
//Define the multiple methods in the same class with same name , but with different
// 
class Test
{
	int Area(int i)
	{		
		return i * i;
	}
	int Area(int a, int b)
	{
		return a * b;
	}
}
class Area_Overload 
{
	public static void main(String args[])
	{
		Test t = new Test();
		int area;
		area = t.Area(5);
		System.out.println("Area of Square is : " +area);
		area = t.Area(5,2);
		System.out.println("Area of Rectangle is : " +area);
	}
}