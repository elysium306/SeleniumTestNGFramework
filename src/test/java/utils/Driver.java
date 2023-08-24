package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
	
	
	public static WebDriver getDriver() {
		return new ChromeDriver();
	}
}
