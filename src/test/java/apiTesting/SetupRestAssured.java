package apiTesting;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class SetupRestAssured {

	@Test
	public void test1() {
		given().
		when().
		then();
	}

}
