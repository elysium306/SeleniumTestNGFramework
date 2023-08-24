package RestAPI;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DeckOfCargsGame {
	
	private final RestAssured.baseURI = "https://deckofcardsapi.com/";
	
	public static void main(String[] args) {
		
	}
	
	@Test
	public void shuffleing() {
		RestAssured.baseURI = baseURI;
		
		when().header
	}

}
