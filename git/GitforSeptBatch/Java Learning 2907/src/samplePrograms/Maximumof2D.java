package samplePrograms;

public class Maximumof2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[][] = {{22, 33, 44},
						{10, 20}, 
						{55, 66, 77, 88, 9},
						{100, 1, 3, 4, 6}};
		
		int max = array[0][0];
		
		for (int i=0; i<array.length; i++)
		{
			for (int j=0; j<array[i].length; j++)
			{
				if (max<array[i][j])
				{
					max=array[i][j];
				}
			}
		}
		
		System.out.println(max);

	}

}
