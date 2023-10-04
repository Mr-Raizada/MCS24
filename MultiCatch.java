//program
public class MultiCatch
{
	public static void main(String[] args)
	{
		int repeat;
	try
	{
		repeat = Integer.parseInt(args[0]);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{	
		//picking up any default value
		repeat = 0;
	}
	catch (NumberFormatException e)
	{
		//print an error message
		System.err.println("Usage: repeat as count");
		System.err.println("where repeat is the number of times to say Hello Java ");
		System.err.println("and given as an integer like 2 or 5");
		return;
	}
	for(int i = 0; i<repeat; i++)
	{
		System.out.println("Hello");
	}
	}
}
