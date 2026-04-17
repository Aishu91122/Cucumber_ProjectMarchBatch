package arrayPractice;

public class MemoryWastage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = new int[1000];  //literal way
		array[0]= 4;
		array[7]= 6;
		array[8]= 5;
		
		for (int i=0; i<=array.length-1; i++)
		{
			System.out.println(array[i]);
		}
		
		
		
		

	}

}
