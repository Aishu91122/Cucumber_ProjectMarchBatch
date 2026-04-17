package com.DataDriven.basics;

import org.testng.annotations.Test;

public class ExcelSheet {
	
	@Test
	public void m1()
	{
		Reader excel = new Reader("C:\\Users\\INFOMATS123\\Desktop\\Sample.xlsx", "Sheet1");
		int rowCount = excel.getRowCount();
		System.out.println(rowCount);
		int cellCount = excel.getCellCount();
		System.out.println(cellCount);
		String singleValue = excel.getSingleValue(0, 1);
		System.out.println(singleValue);
		String[][] entireValue = excel.getEntireValue(rowCount, cellCount);
		for (String aa[]:entireValue)
		{
			for (String bb:aa)
			{
				System.out.print(bb+" | ");
			}
			System.out.println();
		}
		
		
		
	}

}
