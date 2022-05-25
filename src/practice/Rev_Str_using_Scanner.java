package practice;

import java.util.Scanner;

public class Rev_Str_using_Scanner 
{
	public static void main(String []  args)
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the String");
		String str=s.next();
		
		String revword="";
			
			for(int j=str.length()-1;j>=0;j--)
			{
				revword=revword+str.charAt(j);
			}
		
		
		System.out.println(revword);
		
	
	
	
	}
}
