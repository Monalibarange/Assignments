package Java_programs;

public class static_method 

{
	
	static void add()
	{
	
	int a = 10 ;
	int b = 20 ;
    int sum = a + b;
    System.out.println(sum);
	}
	
	
	
   static void sub ()
	
	{
		int a = 20 ; 
	    int b = 30 ;	
		int sub =  a-b;
	   System.out.println (sub);
	}
   
   
   static void mul()
   
   {
	   int a = 12;
	   int b= 2 ;
	   int  mul = a*b;
	  System.out.println(mul);
   }
	
   
   static void div()
   
   {
	   int a = 32;
	   int b = 34;
	   int div= (a/b);
	   
	  System.out.println(div);
   }
   
   
   
	public static void main(String[] args) 
	
	{
		
	add();
	sub();
	div();
	mul();
	
		
	}

}
