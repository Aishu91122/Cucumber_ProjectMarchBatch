package nestedLoops;

import com.basics.java.ArgumentsPassing;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=1; i<=3; i++)  //outer loop  4<=3 F
		{
			for (int j=1; j<=i; j++) //inner loop  j=4<=3 f
			{
				System.out.print(j);  //1
				                      //12
			}                        //123
			                          
			System.out.println();
		}
		
		System.out.println("============================");
		
		ArgumentsPassing obj	=  new ArgumentsPassing(); //Object Creation with reference
        obj.div(8, 2);
	}

}
