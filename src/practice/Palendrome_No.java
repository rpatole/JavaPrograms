package practice;

public class Palendrome_No 
{
	public static void main(String[] args)
	{
		int num=121;
		int n=num;
		int r=0;
		int s=0;
		
		while(n>0)
		{
			r=n%10;
			s=(s*10)+r; //important forma
			n=n/10;		
		}
		
		if(s==num)
		{
			System.out.println("The number is Palindrome");
		}
		else
		{
			System.out.println("The number is not Palindrome");
		}
	
	
	}
}
