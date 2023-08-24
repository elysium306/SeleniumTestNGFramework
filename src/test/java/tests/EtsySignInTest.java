package tests;

import java.time.Duration;

import pages.EtsyHomePage;
import utils.DataReader;
import utils.Driver;

public class EtsySignInTest {
	public static void main(String[] args) {
		
	}
	
	public static void etsyInvalidSignInTest() {
		
		Driver.getDriver().get(DataReader.getProperty("eysy_url"));
		Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		EtsyHomePage etsyHomePage = new EtsyHomePage();
		
	}
}
