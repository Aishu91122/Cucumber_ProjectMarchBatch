package arrayPractice;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] array = { {2, 4, 6}, //2
				          {1, 3, 5, 7, 9}, //4 
				          {10, 20, 30, 40, 50, 60}, //5 
				          {6, 5}}; //1
		
		int rowSize = array.length-1;
		
		System.out.println("Row Size "+rowSize);
		
		for (int i=0; i<=rowSize; i++)
		{
			int columnSize =array[i].length-1;
			System.out.println("Column Size = "+columnSize);
			for (int j=0; j<=columnSize; j++)
			{
				
				System.out.println(array[i][j]);
			}
		}
		System.out.println("=============================");
		for (int xx[]:array)
		{
			for (int yy:xx)
			{
				System.out.println(yy);
			}
		}
		
		

	}

}
