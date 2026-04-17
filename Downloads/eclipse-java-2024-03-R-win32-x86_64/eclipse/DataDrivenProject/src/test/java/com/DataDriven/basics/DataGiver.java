package com.DataDriven.basics;

import org.testng.annotations.DataProvider;

public class DataGiver {

	
	@DataProvider(name="data")
	public String[][] getData()
	{
		Reader reader = new Reader("C:\\\\Users\\\\INFOMATS123\\\\Desktop\\\\Sample.xlsx", "Sheet2");
		int rowCount = reader.getRowCount();
		int cellCount = reader.getCellCount();
		return reader.getEntireValue(rowCount, cellCount);
	}
}
