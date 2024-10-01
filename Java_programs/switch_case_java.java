package Java_programs;

import java.util.Scanner;

public class switch_case_java 

{

	public static void main(String[] args) 
	
	{
        Scanner sc = new Scanner (System.in);
		     
				System.out.println("Enter 1 for chrome ");	
				System.out.println ("Enter 2 for edge");
				System.out.println("enter 3 for firebox");
				
				int input  = sc.nextInt();
				
				switch(input)
				
				{
				
			
			case 1:
				
					 System.out.println("launch chrome browser");
			break ;
			
			case 2:
			
			System.out.println ("launch edge browser");
			
			break;	
			case 3:	
			System.out.println ("launch firebox browser");
			 
			break;

		default :

			System.out.println ("sorry your selection is wrong ");

		     }		
			}
		

	}


