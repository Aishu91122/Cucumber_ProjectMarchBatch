package arrayPractice;

public class DiagonalMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[][] = {{55, 66, 77} , 
				         {88, 99, 11} , 
				         {44, 33, 22}};
		
		for (int i=0; i<=array.length-1; i++) //T 
		{
			System.out.println(array[i][i]);  //array[2][2] 55 99 22
		}
		
		
		
		

	}

}
