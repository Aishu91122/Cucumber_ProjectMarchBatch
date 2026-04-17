package browserLevel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Incognito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(opt); //Browser Launch
		driver.manage().window().maximize();  //method Chaining
	
		driver.manage().window().minimize();
	
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	 
		

	}

}
