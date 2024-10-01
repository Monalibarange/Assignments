package Java_programs;


class A 
{
	int a ,b,c ;
	
	void add ()
	{
		
     a = 10 ; b = 20 ;
	 c = a+b; 
     
     System.out.println("addition "+c);
	}
	
    void sub ()
    {
    	 c = a-b;
         System.out.println("sub "+c);
    }
	
}


class B extends A
{
	
	int a ,b,c;
	
	void mul ()
	{
	a = 10 ; b = 20 ;
	c = a*b; 
	 
	System.out.println("addition "+c);
	 
}

}


class c extends B
{
	
	int a ,b,c;
	
	void div ()
	{
	a = 10 ; b = 20 ;
	c = a/b; 
	 
	System.out.println("div "+c);
	
	}
}

public class multilevel_inheritance_usingnonstatic_method extends c
{
	
	int a ,b,c;
	
	void rem()
	{
	a = 10 ; b = 20 ;
	c = a%b; 
	 
	System.out.println("reminder " +c);
	
	}

	
	
	public static void main(String[] args) 
	
	{
		multilevel_inheritance_usingnonstatic_method obj = new multilevel_inheritance_usingnonstatic_method ();
		obj. rem();
		obj.add();
		obj.mul();
		obj.div();
		obj.sub();

	}

}
