package exceldataProvider;

import org.testng.annotations.DataProvider;

public class DataSuppliers {
	
	Reader reader;
	
	@DataProvider(name = "FBLoginCredentials")
	public String[][] m1()
	{
		reader = new Reader("C:\\Users\\INFOMATS123\\Desktop\\Test Data Facebook.xlsx", "Sheet1");
		int rowSize = reader.getRowSize();
		int cellSize = reader.getCellSize();
		return reader.getAllValues(rowSize, cellSize);
	}
	
	
	

}
