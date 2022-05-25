package practice;

public class StringCharCount 
{
	public static void main(String [] args)
	{
		String a = "Rishi kesh ";
		int space = 0;	
		int length= a.length();
		System.out.println(length);
	
		for(int i=0;i<a.length();i++)
		{
			char c=a.charAt(i);
			if(c==' ')
			{
				space++;
			}
		}
		
		int charcount=length-space;
		System.out.println(charcount);
	}
	
}
