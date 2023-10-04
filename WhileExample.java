public class WhileExample
{
	public static void main(String args[])
	{
		int count = 1;
		int product;
		System.out.println("Table of 6");	
			while (count <= 10)
			{
				product = 6 * count;
			System.out.println("6 x " + count + "=" + product);
			count++;
			}
	}
}