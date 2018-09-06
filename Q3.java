import java.util.*;

class Q3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		StringBuffer str=new StringBuffer(sc.nextLine());
		System.out.println("string : " + str);
		
		System.out.print("After removing all vowels :");
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) =='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'
			 || str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U')
			{
				str.deleteCharAt(i);
				i--;
			}
		}
		System.out.println(str);
	}
}