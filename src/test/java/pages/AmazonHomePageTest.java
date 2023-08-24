package test.java.pages;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonHomePageTest {
	
	@Test
	void test1() {
		System.out.println("This is just a place holder method.");
	}
	
	@BeforeTest
	void setup() {
		System.out.println("Hello");
	}
	
	@Test(alwaysRun = true, priority = 1)
	void test2() {
		System.out.println("This is test 2");
	}

}
