package tests;

import org.apache.commons.lang3.RandomStringUtils;

import pages.AmazonHomePage;
import utils.DataReader;
import utils.Driver;

public class AmazonLoginTest {
	
	public static void main(String[] args) {
		amazonLoginTest();
	}
	
	public static void amazonLoginTest() {
		Driver.getDriver().get(DataReader.getProperty("amazon_url"));;
		Driver.getDriver().manage().window().maximize();
		
		AmazonHomePage amazonhp = new AmazonHomePage();
		
		amazonhp.searchField.sendKeys("Selenium Java");
		amazonhp.search_btn.click();
		
		String test_email = RandomStringUtils.randomAlphabetic(7) + "@me.com";
		System.out.println("*** Randoly Generated Email: " + test_email);
		amazonhp.signin_btn.click();
		amazonhp.sign_in_email_phone_box.sendKeys(test_email);
		amazonhp.continue_btn.click();
		
		// type in the password, and click to close the page
		String test_password = RandomStringUtils.randomAlphanumeric(10);
		System.out.println("*** Randoly Generated Password: " + test_password);
		amazonhp.password_field.sendKeys(test_password);
		amazonhp.sign_in_btn.click();
		
		if(amazonhp.incorrect_passwd_alert_message.isDisplayed()) {
			System.out.println(amazonhp.incorrect_passwd_alert_message.getText());
		}
		
//		Driver.getDriver().quit();
	}

}
