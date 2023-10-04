//Argument Passing
//Two Method are passed Area_S and Area_R - To calculate the Area's
//Argument Passing -  The Way you provide values (argumets) to a method when you call it
//Here Pass By Value method is utiltized - Where once the Obj Class gets the value it tries to //initial value and calculates the solution on it
//Pass by value means copying 

class Test
{
	int Area_S(int i)
	{
		return i * i;
	}
	int Area_R(int a, int b)
	{
		return b * a;
	}
}
class Area_Test
	{	
		public static void main(String args[])
		{
			Test t = new Test();
			int area;
			area = t.Area_S(5);
			System.out.println("The Area of the Square is : " +area);
			area = t.Area_R(5,405);
			System.out.println("The Area of Rectangle is :" +area);	
		}
	}
