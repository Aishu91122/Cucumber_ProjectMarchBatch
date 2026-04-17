package com.DataDriven.basics;

import org.testng.annotations.DataProvider;

public class DataGiver {
	
	
	@DataProvider(name="data")
	public String[][] getData()
	{
		 Reader1 reader = new Reader1("C:\\Users\\INFOMATS123\\Desktop\\Demo.xlsx", "Sheet2");
	     int rowCount = reader.getRowCount();
	     int cellCount = reader.getCellCount();
	     return reader.getEntireValue(rowCount, cellCount);
	
	}

	
	
}
