package nestedLoops;

public class PracticePattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (char i='A'; i<='E'; i++)  //outerLoop i=C<= E T
		{
			for (char j='A'; j<=i; j++)  //inner loop j=C <=B F
			{
				System.out.print(j);  // inner loop body A
			}                                          //AB             
			System.out.println(); // outer loop body   //
		}
		
		System.out.println("=============================");
		
		for (int i=1; i<=5; i++) //i=1<=5 T
		{
			for (int j=5; j>=1; j--) //j=5 >=1 T
			{
				System.out.print(j); //
			}
			System.out.println();
		}

	}

}
