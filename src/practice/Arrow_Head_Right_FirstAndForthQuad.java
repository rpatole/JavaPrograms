package practice;

public class Arrow_Head_Right_FirstAndForthQuad 
{
	public static void main(String[] args)
	{
		int rows=5;
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int a=0;a<rows;a++)
		{
			for(int b=rows-1;b>a;b--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
