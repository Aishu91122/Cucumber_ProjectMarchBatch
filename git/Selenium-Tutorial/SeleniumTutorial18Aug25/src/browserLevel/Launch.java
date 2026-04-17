package browserLevel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver(); //Browser Launch
		driver.manage().window().maximize();  //method Chaining
	
		driver.manage().window().minimize();
	
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	    driver.close();
		
		
		
		

	}

}
