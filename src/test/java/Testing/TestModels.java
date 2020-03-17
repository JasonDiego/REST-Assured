package Testing;

import org.junit.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class TestModels {

	@Test
	public void testVehicle8Model() {
		given().
		when().
			get("https://www.swapi.co/api/vehicles/8/").
		then().
			assertThat().
			body("model", equalTo("Twin Ion Engine/Ln Starfighter"));
	}
	
	@Test
	public void testVehicle14Model() {
		given().
		when().
			get("https://www.swapi.co/api/vehicles/14/").
		then().
			assertThat().
			body("model", equalTo("t-47 airspeeder"));
	}
	
	@Test
	public void testVehicle16Model() {
		given().
		when().
			get("https://www.swapi.co/api/vehicles/16/").
		then().
			assertThat().
			body("model", equalTo("TIE/sa bomber"));
	}
	
}
