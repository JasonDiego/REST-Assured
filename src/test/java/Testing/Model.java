package Testing;

import org.junit.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Model {

	@Test
	public void test1() {
		given().
		when().
			get("https://www.swapi.co/api/vehicles/8/").
		then().
			assertThat().
			body("model", equalTo("Twin Ion Engine/Ln Starfighter"));
	}
	
	@Test
	public void test2() {
		given().
		when().
			get("https://www.swapi.co/api/vehicles/14/").
		then().
			assertThat().
			body("model", equalTo("t-47 airspeeder"));
	}
	
	@Test
	public void test3() {
		given().
		when().
			get("https://www.swapi.co/api/vehicles/16/").
		then().
			assertThat().
			body("model", equalTo("TIE/sa bomber"));
	}
	
}
