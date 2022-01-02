package selenium4Demo;

import static org.openqa.selenium.support.locators.RelativeLocator.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeLoc {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/home/omutwar/Documents/Selenium_Projects/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com");

		WebElement nameEditBox = driver.findElement(By.cssSelector("[name=\"field-keywords\"]"));

		System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());

		WebElement dateofBirth = driver.findElement(By.cssSelector("[for='dateofBirth']"));

		driver.findElement(with(By.tagName("input")).below(dateofBirth)).click();
//		driver.switchTo().newWindow(WindowType.WINDOW);

		WebElement iceCreamLabel = driver
				.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));

		driver.findElement(with(By.tagName("input")).toLeftOf(iceCreamLabel)).click();

		WebElement rdb = driver.findElement(By.id("inlineRadio1"));

		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(rdb)).getText());
		
		

	}

}
