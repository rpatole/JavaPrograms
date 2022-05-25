package practice;

public class Reverse_each_word_of_string 
{
	public static void main(String[] args)
	{
		String str = new String("Rishikesh Patole");
		
		
		
		String []words=str.split(" ");  //split the input string
		System.out.println(words[0]); //index  0 value of string words
		System.out.println(words[1]); //index 1 value of string words
	
		String revstr="";  //declaring the string
		
		for(int i=0; i<words.length;i++)  //to get each value of String []words
		{
			String word=words[i]; 	// put copy the value from aray to string word
			String revWord="";      //declare the reverse word string
			
			
			for(int j=word.length()-1;j>=0;j--)	// for loop to get reverese values of array 
			{
				revWord=revWord+word.charAt(j);	
												//h
												//hs
												//hse
												//hsek
												//hseki
												//hsekih
												//hsekihs
												//hsekihsi
																//hsekihsiR
												//e
												//el
												//elo
												//elot
												//elota
																//elotaP
				

				System.out.println(revWord);
			}	
			revstr=revstr+revWord+" ";  //hsekihsiR elotaP
			
		}
		System.out.println(revstr);
	}
}
