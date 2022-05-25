package practice;

public class Armstrong_no_for_loop 
{
	public static void main(String[] args)
	{
		int num=405;
		int length=3;
		int div=num;
		int remain;
		int add=0;
		int x=1;
		
		for(int a=0;a<4;a++)
		{
			remain=div%10;			//to get the digit
			if(length==3)
			{
				x=remain*remain*remain;
			}
			else
			{
			x=remain*remain*remain*remain;
			}
			div=div/10;
			add=add+x;
		}
		
		if(add==num)
		{
			System.out.println("The number "+num+" is Armstrong");
		}
		else
		{
			System.out.println("The number "+num+" is not Armstrong");
		}
		
	}
}
