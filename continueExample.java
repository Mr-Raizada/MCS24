//The continue Statement to skip the iteration of for, while, do-while loop
public class continueExample
{
	public static void main(String args[])
	{
		StringBuffer searchStr = new StringBuffer ("she shell sea-shell on the sea shore");
		int max = searchStr.length();
		int numOfS = 0;
		for (int i = 0; i < max; i++)
		{	
			if (searchStr.charAt(i)!='s')//we want to count only s
			continue;
			numOfS++;
		}
		System.out.println("Found  " + numOfS + "S's in the String:");
		System.out.println(searchStr);
		}
	} 