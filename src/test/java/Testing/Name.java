package Testing;

import org.junit.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Name {

	@Test
	public void test1() {
		given().
		when().
			get("https://www.swapi.co/api/vehicles/4/").
		then().
			assertThat().
			body("name", equalTo("Sand Crawler"));
	}

	@Test
	public void test2() {
		given().
		when().
			get("https://www.swapi.co/api/vehicles/6/").
		then().
			assertThat().
			body("name", equalTo("T-16 skyhopper"));
	}
	
	@Test
	public void test3() {
		given().
		when().
			get("https://www.swapi.co/api/vehicles/7/").
		then().
			assertThat().
			body("name", equalTo("X-34 landspeeder"));
	}
	
}
