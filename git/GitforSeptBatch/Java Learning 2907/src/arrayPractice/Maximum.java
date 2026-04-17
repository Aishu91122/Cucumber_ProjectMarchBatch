package arrayPractice;

public class Maximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = {3, 4, 50, 6, 7};
		
		int max = array[0];  
		
		for (int i=0; i<=array.length-1; i++) //5
		{
			if (max<array[i]) //50 < 7 F
			{
				max=array[i]; // max=50
			}
		}
		System.out.println(max);

	}

}
