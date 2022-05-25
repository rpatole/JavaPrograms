package practice;

public class ArrayLargestNo 
{
	public static void main(String[] args)
	{
		int a[]= {10,20,30,40};
		int max=a[0];
		int min=a[0];
		
//maximum no. in array		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);

//minimum no.in array
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}	
		System.out.println(min);
	}
}
