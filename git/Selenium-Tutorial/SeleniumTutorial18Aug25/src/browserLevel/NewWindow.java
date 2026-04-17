package browserLevel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NewWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.axisbank.com/");
		driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.makemytrip.com/");
	    driver.close();

	}

}
