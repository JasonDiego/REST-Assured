package Testing;

import org.junit.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class TestNames {

	@Test
	public void testVehicle4Name() {
		given().
		when().
			get("https://www.swapi.co/api/vehicles/4/").
		then().
			assertThat().
			body("name", equalTo("Sand Crawler"));
	}

	@Test
	public void testVehicle6Name() {
		given().
		when().
			get("https://www.swapi.co/api/vehicles/6/").
		then().
			assertThat().
			body("name", equalTo("T-16 skyhopper"));
	}
	
	@Test
	public void testVehicle7Name() {
		given().
		when().
			get("https://www.swapi.co/api/vehicles/7/").
		then().
			assertThat().
			body("name", equalTo("X-34 landspeeder"));
	}
	
}
