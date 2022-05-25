package practice;

public class FibonacciSeries 
{
	public static void main(String[]args)
	{
		int range=50;
		int  a=0;
		int b=1;
		int fib=0;
		
		System.out.print(a+" "+b);
		for(int i=1;i<=range;i++)
		{
			fib=a+b;
			System.out.print(" "+fib);
			a=b;
			b=fib;
			
		}
	}
}
