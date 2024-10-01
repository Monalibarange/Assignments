package Java_programs;

	 class one
	 
	 {
		 static void add ()
		 
		 {
		 System.out.println("add");
	 
		 }
		 
		 static void sub()
		 {
			 System.out.println("sub");
		 }
	 }
		 public class single_level_inheritance  extends one
		 {
	 
	     static void mul()
	 
		 {
			 System.out.println("mul");
	     }
		 
	     static void div()
		 
		 {
			 System.out.println("div");
	     }
		 
	     
	      public static void main(String[] args) 
	
	    {
         
           add();
           sub();
           div();
           mul();

	   }

    }

 
	 
