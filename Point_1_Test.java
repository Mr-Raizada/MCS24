//non parameterized constructor
class Point
{
	double x, y, z, g,k,l;
	Point(int a, int b)
	{
		x = a;
		y = b;
		z = a + b;
		g = a/b;
		k = a*b;
		l = a+b / b ;
	}
	
	void Display_point()
	{
		System.out.println("The point is:("+x+","+y+")");
		System.out.println("The addition is :" +z);
		System.out.println("The Divison  is:" +g);
		System.out.println("The Multiplication  is:" +k);
		System.out.println("The Arithmetic is:" +l);
		
	}
}  
	
class Point_1_Test
{
	public static void main(String args[])
	{
		Point p1 = new Point(2,5);
		Point p2 = new Point(5,8);
		p1.Display_point();
		p2.Display_point();
	}
}