package practice;

public class Array_Descending_Order
{
	public static void main(String[] args)
	{
		int a[]= {123,22,30,4,500};
		int temp=0;
		
		
		System.out.print("Original Array = ");		
		for(int b=0;b<a.length;b++)
		{
			System.out.print(" "+a[b]);
		}
	
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
			
		}
	
		System.out.println();
		System.out.print("Descending Array = ");		
		for(int c=0;c<a.length;c++)
		{
			System.out.print(" "+a[c]);
		}
	
	
	
	
	}
	
}
