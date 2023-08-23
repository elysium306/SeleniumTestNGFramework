package main.java.demo1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "");
		System.out.println("This will set up the test!! ***");
	}

	@Test
	public void carLoan1() {
		System.out.println("carLoan1");
	}

	@Test
	public void carLoan2() {
		System.out.println("carLoan2");
	}

	@AfterTest
	public void teerDown() {
		System.out.println("This is to teer down the test!! ***");
	}

}