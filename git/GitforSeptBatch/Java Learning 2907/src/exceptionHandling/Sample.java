package exceptionHandling;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {4, 7, 8, 9};
		
		int b= 0;
		
		try {                                 //try block
			System.out.println(a[1]/b);
		    }
		
		catch(ArithmeticException e)
		{
			System.out.println("Infinity");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Check the length of the Array");
		}
		finally
		{
			System.out.println("Always Executable");
		}
		
		
		
		
		
		
		
		
		

	}

}
