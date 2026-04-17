package argumentPassing;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FaceBookArguments {

	WebDriver driver; // Global Variable

	@Parameters({ "browserName" })
	@BeforeClass (alwaysRun = true)
	public void launch(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else {
			System.err.println("Please enter valid browser");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://facebook.com");
	}

	@Test(priority = -1, invocationCount = 2)
	public void getURL() {
		System.out.println(driver.getCurrentUrl());
	}

	@Test(priority = 0, description = "Title of the Current Page")
	public void getTitle() {
		System.out.println(driver.getTitle());
	}

	@Parameters({ "uN", "pW" })
	@Test(priority = 4, description = "Login Module")
	public void loginModule(String userName, String passWord) {
		WebElement emailField = driver
				.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/div/form/div/div/input"));
		emailField.sendKeys(userName);
		WebElement passwordField = driver
				.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/div/form/div/div/div/input"));
		passwordField.sendKeys(passWord);
	}

	@Parameters({ "firstName", "lastName" })
	@Test(priority = 1, dependsOnMethods = "loginModule")
	public void createNewAccount(String firstName, String lastName) {
		WebElement createNewField = driver.findElement(By.linkText("Create new account"));
		createNewField.click();
		WebElement firstNameField = driver.findElement(By.name("firstname"));
		firstNameField.sendKeys(firstName);
		WebElement surNameField = driver.findElement(By.name("lastname"));
		surNameField.sendKeys(lastName);
	}

	@Parameters({ "tags" })
	@Test(priority = 0, alwaysRun = true, dependsOnMethods = "loginModule")
	public void allLinks(String tags) {
		List<WebElement> vTag = driver.findElements(By.tagName(tags));
		System.out.println("Number of a tags " + vTag.size());
		for (WebElement aa : vTag) {
			System.out.println(aa.getText() + "---->" + aa.getAttribute("href"));
		}
	}

	@AfterClass(alwaysRun = true)
	public void close() {
		driver.close();
	}

}
