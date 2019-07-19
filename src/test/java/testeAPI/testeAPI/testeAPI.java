package testeAPI.testeAPI;
import static io.restassured.RestAssured.given;

import org.hamcrest.Matchers;
import org.junit.Test;



public class testeAPI {

	@Test
	public void test_NumberOfCircuitsFor2017Season_ShouldBe20() {

		given().
		param("page",1).
		when().
		get("https://reqres.in/api/users").
		then().statusCode(200);
	
	}

}
