package Recursion;

public class delete {

	class A{

		A()
		{
			System.out.println("A");
		}
	}


	class B extends A{


		B(){
			
	    super();
		System.out.println("B");
		}

	}




	public static void main(String args[])
	{
        delete obj = new delete();
        
        	A a= obj.new A();
	}
}
