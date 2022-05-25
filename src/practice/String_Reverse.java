package practice;

public class String_Reverse 
{
	public static void main(String[] args)
	{
		String str="Rishikesh";
		int l=str.length();
		String revStr="";
		
		for(int i=l-1;i>=0;i--)  //to take each char from highest index
		{
			revStr=revStr+str.charAt(i); //to add all the char taken in revStr
		}
		
		System.out.println(revStr);
	}
}
