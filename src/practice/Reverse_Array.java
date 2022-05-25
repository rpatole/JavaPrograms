package practice;



public class Reverse_Array 
{
	public static void main(String[] args)
	{
		int l=0;
		int []array1=new int[] {1,2,3,4,5};
		int []array2=new int [5];
		System.out.println("the original array is= ");
		for(int i=0;i<array1.length;i++)
		{
			System.out.print(array1[i]+" ");
		}
		
		System.out.println();
		System.out.println("the reverse array is= ");
		
			for(int j=array1.length-1;j>=0;j--)
				{
				System.out.print(array1[j]+" ");
					array2[l]=array1[j];
					l++;
			}
		
			System.out.println();
		
		System.out.println("the new array is =");
		for(int k=0;k<array2.length;k++)
		{
			System.out.print(array2[k]+" ");
		}
	}
}
