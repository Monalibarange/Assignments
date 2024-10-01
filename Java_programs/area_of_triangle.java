package Java_programs;

import java .util .Scanner; 
public class area_of_triangle 
{

	public static void main(String[] args) 
	
	{
	
   Scanner sc  =  new Scanner (System.in);
   
   System.out.println("Enter the value of base");
   
      double base  = sc.nextInt();
      
      System.out.println ("enter the value of length ");
       double length  = sc.nextDouble();
      
      double area  = 1/2 *base*length ;
      
      System.out.println ("area of triagle is "+ area);
      
      sc.close();
   
	}

}
