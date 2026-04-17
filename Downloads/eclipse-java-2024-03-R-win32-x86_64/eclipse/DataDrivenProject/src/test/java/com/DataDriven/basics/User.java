package com.DataDriven.basics;

import org.testng.annotations.Test;

public class User {
	
	@Test
	public void m1()
	{
		String fold = "‪C:\\Users\\INFOMATS123\\Desktop\\Sample.xlsx";
		
		String fnew = "C:\\Users\\INFOMATS123\\Desktop\\Sample.xlsx";
		
		System.out.println(fold.length());
		System.out.println(fnew.length());
		
		
		Reader reader = new Reader(fnew, "Sheet1");
		int rowCount = reader.getRowCount();
		int cellCount = reader.getCellCount();
		String singleValue = reader.getSingleValue(0, 1);
		System.out.println(singleValue);
		String[][] entireValue = reader.getEntireValue(rowCount, cellCount);
		for (String aa[]:entireValue)
		{
			for (String bb:aa) 
			{
				System.out.print(bb + " | ");
			}
			System.out.println();
		}
		
		
	}

}
