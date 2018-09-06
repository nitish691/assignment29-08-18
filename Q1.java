public class Q1
{
	public static void main(String args[])
	{
		String str = "Hello World";
		String rev = "";
		char ch;
		int i,len;
		len = str.length();
		for(i=0;i<len;i++)
		{
			ch = str.charAt(len-i-1);
			rev = rev.concat(""+ch);
		}
		System.out.println("String : " + str);
		System.out.println("Reverse : " +rev);
	}
}