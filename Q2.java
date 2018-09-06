class Q2
{
	public static void main(String args[])
	{
		String str = "Hello";
		int i,j,len;
		len = str.length();
		System.out.println("Substrings of string are :");
		for(i=0;i<len;i++)
		{
			for(j=i;j<len;j++)
			{
				System.out.println(str.substring(i,j+1));
			}
		}
		System.out.println();
	}
}