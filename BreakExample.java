public class BreakExample
{
	public static void main (String args[])
	{
		int []arrayOfInt = { 33, 65, 40, 66, 68, 54, 65, 97,3545 };
		int searchFor = 658;
		int i = 0;
		boolean foundIt = false;
		for (; i< arrayOfInt.length; i++)
		{
			if(arrayOfInt[i] == searchFor)
			{
				foundIt = true;
				break;
			}
		}
		if (foundIt)
		{
			System.out.println(searchFor + " at index " + i);
		}
		else
		{
			System.out.println(searchFor + " not in the Array ");
		}
	}
}