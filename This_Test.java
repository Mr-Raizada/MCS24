//Using of this as using the same name twice is illegal
class Test_This 
{
	int rate;
	int amount;
	int interest;
	Test_This(int r, int a)
	{	
		rate = r;	
		amount = a;
	}
	void Total_Interest()
	{
		int rate = 500;
		rate = this.rate + rate;
		interest = rate * amount /100;
		System.out.println(" Total Interest on " + amount + " is: " +interest);
	}
}
class This_Test
{
	public static void main(String[] args)
	{
		Test_This Ob1 = new Test_This(5,5000);
		Ob1.Total_Interest();
	}
}
