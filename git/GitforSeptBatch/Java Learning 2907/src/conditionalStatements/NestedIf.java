package conditionalStatements;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a= 5;   //Variable Declaration
		int b= 10;
		if (a==50)  
		{
			if (b==10) 
			{
				System.out.println("a is 5 and b is 10");
			}
			else
			{
				System.out.println("a is 5 but b is not 10");
			}
		}
		else 
		{
			System.out.println("a is not 5");
		}

	}

}
