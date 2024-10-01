package Java_programs;

import java.util.Scanner;

public class areaofcircle_usingscanner_class 

{

//	formula -pi * r ^2(r*r)
	
	public static void main(String[] args)
	
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the radius of circle: ");
		
		     double  radius= sc.nextDouble();
		     
		     double area = Math.PI * radius *radius ;
		     
		     System.out.println ("area of circle is:" +area );
		     sc.close();
	}

}
	
	/*public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);

     // Prompt the user for the radius
     System.out.print("Enter the radius of the circle: ");
     double radius = scanner.nextDouble();

     // Calculate the area
     double area = Math.PI * radius * radius;

     // Output the result
     System.out.println("The area of the circle is: " + area);

     // Close the scanner
     scanner.close();
 }
}*/

