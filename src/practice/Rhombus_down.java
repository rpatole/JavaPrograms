package practice;

public class Rhombus_down 
{
	public static void main(String[] args)
	{
		int row=5;
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int a=0;a<row;a++)
		{
			for(int b=0;b<=a;b++)
			{
				System.out.print(" ");
			}
			for(int c=row-1;c>a;c--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
