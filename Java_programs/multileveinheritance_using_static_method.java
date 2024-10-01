package Java_programs;

class T
{
	 
	static void div()
	 {
		 
		 System.out.println("divv");
	 }
}
class f extends T

{

	
	static void addition ()
	
	{
		int a,b,c;
		a = 20 ; b =50;
		c = a+b;
		
		System.out.println ("add "+c);
	}
}


public class multileveinheritance_using_static_method extends f

{

	
	static void mul ()
	
	{
		int a,b,c;
		a = 20 ; b =50;
		c = a *b;
		
		System.out.println ("mul "+c);
	}

	
	public static void main(String[] args) 
	
	{
	 
     mul();
     addition ();
     div();
	}

}



