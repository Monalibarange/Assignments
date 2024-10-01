package Java_programs;

import java.util.Scanner ; 

public class area_of_rectangle 

// Area =  length * width 

{

	public static void main(String[] args) 
	{


      Scanner sc = new Scanner (System.in) ;
    
      System.out.println("Enter the length");
       
       int length = sc.nextInt();

       
       System.out.println ("Enter the value of width ");
       int width = sc.nextInt();
       
       int area =  length * width ;
       
       System.out.println (" area of rectangle is "+area);
       
       sc.close ();
	}

}
