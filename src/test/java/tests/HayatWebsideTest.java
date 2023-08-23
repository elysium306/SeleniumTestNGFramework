package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HayatWebsideTest {
	
	static WebDriver driver;
	static String url = "https://matrix.abor.com/Matrix/Public/Portal.aspx?L=1&k=2563454X5K54&p=AE-1827960-294#1";
	
	@BeforeTest
	void setup() {
		System.setProperty("webdriver.chrome.driver", "/home/omutwar/Documents/Selenium_Projects/chromedriver");
	}
	
	@Test
	void numberOFProspects() {
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		List<WebElement> prospects = driver.findElements(By.className("[class=\"d-text d-fontWeight--bold d-paddingRight--4\"]"));
		for (Object item : prospects) {
			System.out.println(item);
		}
	}
	
	@AfterTest
	void teardown() {
		driver.quit();
	}

}
