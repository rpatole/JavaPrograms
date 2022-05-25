package practice;

public class StringToCharSequence 
{
	public static void main(String []args)
	{
		String a="Rishikesh";
		char b[];
		int l=a.length();
		b= new char[l];
		
		for(int i=0;i<l;i++)
		{
			b[i] = a.charAt(i);
			System.out.println(b[i]);
		}
		
		
		
	}
}
