package RestAPI;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class SetupRestAssured {
	private String baseURI = "https://reqres.in/";
	/**
	 * Given(): all input details when(): submit the API then(): validate the
	 * response
	 */

	@Test
	public void getUsersTest() {

		// 1) Setup base URL
		RestAssured.baseURI = baseURI;

		// Statically import the package
		given().header("Content-Type", "application/json")
			.when().get("/api/users?page=2")
				.then().assertThat().statusCode(200);
	}
	
	@Test
	public void postUsersTest() {
		// 1) Setup base URL
		RestAssured.baseURI = baseURI;
		
		// 2) compose the HTTP request
		given().header("Content-Type", "application/json")
			.when().post("/api/users")
				.then().assertThat().statusCode(201);
	}
	


}
