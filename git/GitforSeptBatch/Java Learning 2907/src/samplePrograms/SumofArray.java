package samplePrograms;

public class SumofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = {1, 2, 3, 4, 5};
		
		int length = array.length;
		
		int sum = 0;
		
		for (int i=0; i<length; i++) //3<5 T
		{
			sum = array[i]+sum; //4+6 sum=10
		}
		System.out.println(sum);	
		
		
		

	}

}
