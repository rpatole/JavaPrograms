package practice;

public class ArrayPrimeNo 
{
	public static void main(String []args)
	{
		int a[]= {13,12,11,10};
		int temp=0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=2;j<a.length;j++)
			{
				int r = a[i]/j;
				if(r!=0)
				{
					temp=temp+1;
				}
				if(temp!=0)
				{
					System.out.println("This number "+a[i]+" is not a Prime_No");
					temp=0;
				}
				else if(a[i]==0 && a[i]==1)
				{
					System.out.println(a[i]+" is a Prime Number");
				}
			}
			
				
		}
	}
}
