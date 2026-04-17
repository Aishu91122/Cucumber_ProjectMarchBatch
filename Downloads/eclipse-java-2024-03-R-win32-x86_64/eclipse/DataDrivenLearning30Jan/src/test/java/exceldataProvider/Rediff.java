package exceldataProvider;

import org.testng.annotations.Test;

public class Rediff {
	
	@Test
	public void m1()
	{
		Reader reader = new Reader("C:\\Users\\INFOMATS123\\Desktop\\RediffMailLogin.xlsx", "Sheet1");
		String singleValue = reader.getSingleValue(4, 1);
		System.out.println(singleValue);
		int rsize = reader.getRowSize();
		
		System.out.println("rSize = "+rsize);
		int csize = reader.getCellSize();
		
		System.out.println("CSize = "+csize);
		String[][] allValues = reader.getAllValues(rsize, csize);
		
		for (String aa[]:allValues)
		{
			for (String bb:aa)
			{
				System.out.print(bb + " ");
			}
			System.out.println();
		}
		
		
	}
	
	

}
