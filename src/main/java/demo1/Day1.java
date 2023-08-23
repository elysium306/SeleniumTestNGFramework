package main.java.demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day1 {
	static WebDriver driver;
	
	@BeforeSuite
	public void grandSetup() {
		System.out.println("This is before test.");
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