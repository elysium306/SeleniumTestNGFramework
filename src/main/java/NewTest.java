package main.java;

import org.testng.annotations.Test;

public class NewTest {
	@Test
	public void f() {
		System.out.println("This is the default test created from TestNG option from the menu.");
	}

	@Test(groups = { "bank" })
	public void bankLoadApp4() {
		System.out.println("This is bank app4");
	}

	@Test(groups = { "bank" })
	public void bankLoadApp5() {
		System.out.println("This is bank app5");
	}
}
