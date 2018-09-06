import java.util.*;

class Q5
{
	public static void main(String x[])
	{
		String line;
		int count = 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string : ");
		line = sc.nextLine();
		
		System.out.println("The entered line : " + line);
		if(line.length() == 0)
			count = 0;
		else
		{
			for(int i=0;i<line.length()-1;i++)
			{
				if(line.charAt(i) == ' ' && line.charAt(i+1) != ' ')
				{
					count++;
				}
			}
		}
		System.out.println("The number of words : " + count);
	}
}