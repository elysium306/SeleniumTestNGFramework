package seleniumTestNGFramework.seleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridTest1 {
	
	@Test
	void test1(){
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.LINUX);
		
		// WebDriver driver = new WrbDriver
		try {
			WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.18:4444"), dc);
			driver.get("http://www.google.com");
			driver.manage().window().maximize();
			
			System.out.println("Chrome1 Title: " + driver.getTitle().toString());
			
			driver.quit();
		} catch (MalformedURLException e) {
			e.printStackTrace();
			System.out.println(e);
		}
		
	}
	
	@Test
	void test2() {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.LINUX);
		
		// WebDriver driver = new WrbDriver
		try {
			WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.18:4444"), dc);
			driver.get("http://www.amazon.com");
			driver.manage().window().maximize();
			
			System.out.println("Chrome2 Title: " + driver.getTitle().toString());
			
			driver.quit();
		} catch (MalformedURLException e) {
			e.printStackTrace();
			System.out.println(e);
		}
	}
	
	@Test
	void test3() {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("firefox");
		dc.setPlatform(Platform.LINUX);
		
		// WebDriver driver = new WrbDriver
		try {
			WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.18:4444"), dc);
			driver.get("http://www.yahoo.com");
			driver.manage().window().maximize();
			
			System.out.println("Firefox1 Title: " + driver.getTitle().toString());
			
			driver.quit();
		} catch (MalformedURLException e) {
			e.printStackTrace();
			System.out.println(e);
		}
	}
	
	@Test
	void test4() {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("firefox");
		dc.setPlatform(Platform.LINUX);
		
		// WebDriver driver = new WrbDriver
		try {
			WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.18:4444"), dc);
			driver.get("http://www.selenium.dev");
			driver.manage().window().maximize();
			
			System.out.println("Firefox2 Title: " + driver.getTitle().toString());
			
			driver.quit();
		} catch (MalformedURLException e) {
			e.printStackTrace();
			System.out.println(e);
		}
	}

}
