package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class StatusCode {

	@Test
	public void test() {
		given().
		when().
			//get("https://www.swapi.co/api/vehicles/").
			get("https://swapi.co/api/planets/1/").
		then().
			assertThat().
			statusCode(200);
	}

}
