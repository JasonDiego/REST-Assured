package Testing;

import org.junit.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Stats {

	@Test
	public void test1() {
		given().
		when().
			get("https://www.swapi.co/api/vehicles/18/").
		then().
			assertThat().
			body("length", equalTo("20")).
			body("max_atmosphering_speed", equalTo("60")).
			body("crew", equalTo("5")).
			body("passengers", equalTo("40")).
			body("cargo_capacity", equalTo("1000"));
	}
	
	@Test
	public void test2() {
		given().
		when().
			get("https://www.swapi.co/api/vehicles/19/").
		then().
			assertThat().
			body("length", equalTo("2")).
			body("max_atmosphering_speed", equalTo("90")).
			body("crew", equalTo("2")).
			body("passengers", equalTo("0")).
			body("cargo_capacity", equalTo("200"));
	}
	
	@Test
	public void test3() {
		given().
		when().
			get("https://www.swapi.co/api/vehicles/20/").
		then().
			assertThat().
			body("length", equalTo("7")).
			body("max_atmosphering_speed", equalTo("1500")).
			body("crew", equalTo("2")).
			body("passengers", equalTo("0")).
			body("cargo_capacity", equalTo("10"));
	}

}
