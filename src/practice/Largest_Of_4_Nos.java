package practice;

public class Largest_Of_4_Nos 
{
	public static void main(String []args)
	{
		int a=11;
		int b=222;
		int c=32;
		int d=46;
		
		if(a>b)
		{
			if(a>c)
			{
				if(a>d)
				{
					System.out.println("A is Largest");
				}
				else
				{
					System.out.println("D is Largest");
				}
			}	
			else if(c>d)
			{
					System.out.println("C is Largest");
			}
				else
				{
					System.out.println("D is Largest");
				}
		}
			else if(b>c)
			{
				if(b>d)
				{
					System.out.println("B  is the largest");
				}
				else
				{
					System.out.println("D is Greatest");
				}
			}
				else if(c>d)
				{
				System.out.println("C is the largest");
				}
			else
				{
				System.out.println("D is the Laegest");
				}
			}	
	}
