//non parameterized constructor
class Point
{
	int x;
	int y;
	Point()
	{
		x = 2;
		y = 4;
	}
	void Display_point()
	{
		System.out.println("The point is:("+x+","+y+")");
	}
}  
	
class Point_Test
{
	public static void main(String args[])
	{
		Point p1 = new Point();
		Point p2 = new Point();
		p1.Display_point();
		p2.Display_point();
	}
}