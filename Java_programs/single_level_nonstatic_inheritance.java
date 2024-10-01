package Java_programs;
 class parent 
 {
	 
	 void add()
	 {
		 
		 System.out.println("add");
	 }
 }
 
 public class single_level_nonstatic_inheritance extends parent

{

	 void mul()
	 {
		 System.out.println("mul");
	 }
	 
	public static void main(String[] args) 
	
	{
		single_level_nonstatic_inheritance c1 = new 	single_level_nonstatic_inheritance ();
				
			c1.mul();
			c1.add();

	}

}
