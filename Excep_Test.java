//Exception Handelling 
//try catch throw throws and finally are five keywords of java
//Using try catch
//program
public class Excep_Test
{
	public static void main(String[] args)
	{
	try{
	
		int data[] = {2,3,4,5};
		System.out.println("Value at : " +data[4]);
	   }
	catch( ArrayIndexOutOfBoundsException e)
		{
			System.out.print("Sorry you are trying to print beyond the size of data[]");
		}
	}
}

