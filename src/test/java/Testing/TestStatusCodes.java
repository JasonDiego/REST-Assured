package Testing;

import org.junit.Test;
import static io.restassured.RestAssured.*;

public class TestStatusCodes {

	@Test
	public void testVehiclesWebPage() {
		given().
		when().
			get("https://www.swapi.co/api/vehicles/").
		then().
			assertThat().
			statusCode(200);
	}

}
