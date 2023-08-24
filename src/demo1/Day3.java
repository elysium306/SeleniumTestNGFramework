package demo1;

import org.testng.annotations.Test;

public class Day3 {

	@Test(groups = { "bank" })
	public void bankLoadApp() {
		System.out.println("This is bank app");
	}

	@Test(groups = { "bank" })
	public void bankLoadApp2() {
		System.out.println("This is bank app2");
	}

	@Test(groups = { "bank" })
	public void bankLoadApp3() {
		System.out.println("This is bank app3");
	}

}
