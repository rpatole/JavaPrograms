package practice;

public class FactorialOfNo 
{
	public  static void main(String[] args)
	{
		int num=3;
		int fact=1;
		
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("the factorial of "+num+" is "+fact);
	}
}
