package arrayPractice;

public class ArraySample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long a = 077777777777777l;
		System.out.println(a);
		
		
		int array[] = {10, 20, 30, 40, 50, 60, 70}; //literal way
		
		int arraySize = array.length-1;
		
		System.out.println("Size of the Array = "+arraySize);
		
		for (int i=0; i<=arraySize; i++)
		{
			System.out.println(array[i]);
		}
		System.out.println("============================");
		
		for (int xx:array)    //for each
		{
			System.out.println(xx);
		}
		System.out.println("============================");
		
		for (int i=arraySize; i>=0; i--)
		{
			System.out.println(array[i]);
		}
		
		

	}

}
