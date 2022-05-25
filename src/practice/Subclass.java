package practice;

public class Subclass extends Superclass
{
		static void method2()
	{
		System.out.println("This is subclass");
	}
	 void method1()
	 {
		 System.out.println("This is the non static method of Subclass");
	 }
	public static void main (String[] args)
	{
		Superclass a = new Superclass();
		a.method2();
		
		Subclass b=new Subclass();
		b.method2();
		b.method1();
		
	
	}
}
