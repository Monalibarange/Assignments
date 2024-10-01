package Java_programs;

import java.util.Scanner ;

// 2piR
public class circumfernceof_circle 

{

	public static void main(String[] args) 
	{

    Scanner sc = new Scanner (System.in);
    
    System.out.println("enter the value of radius");
    
    double radius = sc.nextDouble();
    
    double area =   2* Math.PI * radius;
    
    System.out.println (" area of circum ");

	}

}
