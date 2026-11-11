import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import io.restassured.RestAssured;

public class RestAssuredTestClass1 {

    @BeforeAll 
    public static void setBaseUrl(String baseUri) {
        RestAssured.baseURI = "https://restful-api.dev";
    }
    
    @Test
    public void testGetRequest() {
        RestAssured.given()
            //.baseUri("https://restful-api.dev")
            .log().all()
            .get()
            .prettyPeek()
            .then()
            .statusCode(200);
    }
    
}
