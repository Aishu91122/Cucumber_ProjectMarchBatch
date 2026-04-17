package arrayPractice;

public class NoInbuilt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {4, 66, 77, 3}; //Literay Way
		
		
		System.out.println("===============Existing Array===========");
		
		for (int aa:array)
		{
			System.out.println(aa);
		}
		
		int newElement = 10; 
		
		int newArray[] = new int[array.length+2];  //using new keyword
		
		for (int i=0; i<array.length; i++) //i=4 <4 F
		{
			newArray[i]= array[i];   //newArray[3]=array[3]
			
		}
		
		int newElement1 = 4;
		newArray[array.length] = newElement;
		
		newArray[array.length+1] = newElement1;
		
		System.out.println("==========New Array==============");
		
		for (int aa:newArray)
		{
			System.out.println(aa);
		}

	}

}
