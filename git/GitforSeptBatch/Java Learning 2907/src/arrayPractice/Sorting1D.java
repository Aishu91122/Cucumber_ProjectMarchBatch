package arrayPractice;

public class Sorting1D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = {11, 55, 77, 1, 6};  //size=5
		
		for (int i =0; i<=array.length-1; i++) //i 1<=4 T
		{
			for (int j=i+1; j<=array.length-1; j++) // j 2<=4 T
			{
				int temp = 0;  //temp;
				if(array[i]>array[j]) //array [0] 1 > 6 F array[3]
				{
				  temp = array[i];  //  temp = 11
				  array[i] = array[j];  // array[0] = 1
				  array[j] = temp;    // array[3] =11
				}
				System.out.println(array[i]);
			}
			
		}

	}

}
