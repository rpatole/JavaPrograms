package practice;

public class Rhombus_Left 
{
	public static void main(String[] args)
	{
		int row=5;
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<row;k++)
			{
				System.out.print("* ");
			}
			for(int l=row-1;l>i;l--)
			{
				System.out.print(" ");
			}
			
			System.out.println();
		}
	}
}
