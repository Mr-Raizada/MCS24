//Pass by value testing 
//
class Para_Test
{
	static int max(int a, int b )
	//Static - it becomes a class level method, not an instance - level method ,
	{
		if (a>b)
		return a;
		else 
		return b;
	}
	public static void main(String[] args)
	{
		int num1 = 40, num2 = 200, num3;
		num3 = max(num1, num2);
		System.out.println("The maximum in " +num1 + " and " + num2+ " is : " +num3);
	}
}