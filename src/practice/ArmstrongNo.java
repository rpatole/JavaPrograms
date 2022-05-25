package practice;

public class ArmstrongNo 
{
public static void main(String[] args)
	{
		int num=153;
		int t1=num;
		int div=num;
		int length=0;
		int remain;
		int add=0;
		
		
		while(t1!=0)
		{
			t1=t1/10;
			length++;
		}
		System.out.println(length);
		
		while(div!=0)
		{
			int mul=1;
			remain=div%10;
										//System.out.println(remain);
			div=div/10;
			
			for(int i=1;i<=length;i++)
			{
				mul=mul*remain;
			}
										//System.out.println(mul);
			add=add+mul;
		}
		System.out.println(add);
		
		
		if(add==num)
		{
			System.out.println("The number "+num+" is Armstrong");
		}
		else
		{
			System.out.println("The number "+num+" is Armstrong");
		}
	}
}
