package practice;

public class Armstrong_By_While_Loop 
{
 public static void main(String[] args)
 {
	 int num=1634;
	 int div=num;
	 int remain=1;
	 int x=1;
	 int add=0;	 
	 int i=0;
	 
//to find the number	 
	 while(div!=0)                  	// to find the length of number
	 {
		 remain=div%10;
		 div=div/10;
		 								//System.out.println(remain);
		 x=remain*remain*remain*remain;
		 								//System.out.println(x);
		 add=add+x;
		 								//System.out.println(add);
	 }
	 System.out.println("the addition of digits "+add);
	 
//to check the no. is armstrong or not
	 if(add==num)
	 {
		 System.out.println("The number "+num+" is Armstrong Number");
	 }
	 else
	 {
		 System.out.println("The number "+num+" is not Armstrong Number");
	 }
 }
}
