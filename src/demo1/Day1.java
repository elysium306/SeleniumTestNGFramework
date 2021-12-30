package demo1;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day1 {
	static WebDriver driver;
	@BeforeSuite
	public void grandSetup() {
		System.setProperty("webdriver.chrome.driver", "/home/omutwar/Documents/Selenium_Projects/chromedriver_linux64/chromedriver");
		System.out.println("Set up ***Suite*** test.");
	}

	@Test
	public void webAppLogin() {
		driver = new ChromeDriver();
		driver.get("https://www.amazom.com");
		driver.manage().window().maximize();
		System.out.println("webAppLogin");
		
		driver.quit();
	}

	@Test(dependsOnMethods = ("webAppLogin"))
	public void mobileAppLogin() {
		System.out.println("mobileAppLogin --<depends on method>--> webAppLogin");
	}

	@Test
	public void tabletAppLogin() {
		System.out.println("tabletAppLogin");
	}

	@Test(groups = { "bank" })
	public void bankLogin() {
		System.out.println("This one includes 'bank' keyword");
	}

	@Test(groups = { "bank" })
	public void bankLogout() {
		System.out.println("Jahan qeyerde bolsa, dunya shu yerde");
	}

	@AfterSuite
	public void grandTeerdown() {
		System.out.println("This is to ***teer down*** the test.");
	}
}