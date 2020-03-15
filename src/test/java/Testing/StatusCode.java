package Testing;

import org.junit.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class StatusCode {

	@Test
	public void test() {
		given().
		when().
			get("https://www.swapi.co/api/vehicles/").
		then().
			assertThat().
			statusCode(200);
	}

}
