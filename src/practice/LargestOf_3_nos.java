package practice;

public class LargestOf_3_nos 
{
	public static void main(String []args)
	{
		int a=13;
		int b=32;
		int c=53;
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println(" A is largest");
			}
			else
			{
				System.out.println(" C is largest");
			}
		}
		else if(b>c)
		{
			System.out.println("B is largest");
		}
		else
		{
			System.out.println("C is largest");
		}
	}
}
