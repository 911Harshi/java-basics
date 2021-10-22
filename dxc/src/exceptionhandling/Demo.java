package exceptionhandling;

public class Demo {
	public static void main(String[] args) {
		int divisor = 1;
		int data = 0 ;
		try {
			data = 100/divisor;
			System.out.println("data is "+data);
			
			  String s=null; System.out.println(s.length());//NullPointerException
			 

			/*
			  String s="xyz";
			  int i=Integer.parseInt(s);//numberformatexception
			  */
			 

			/*
			 * int a[]=new int[5];  //ArrayIndexoutofboundexception
			 
			a[10]=50;
			/*
			 * 
			 */

		} catch (Exception e) {
			e.printStackTrace();
			//increment the divisor and check
			divisor++;
			data = 100/divisor;
			System.out.println("data is "+data);
		}

		System.out.println("6 million lines of code");
	}

}
	


