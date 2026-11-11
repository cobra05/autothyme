import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import io.restassured.RestAssured;

//Udemy course: Rest Assured API Automation Testing from Scratch - Rest Assured Tutorial
//Tigran

public class GetBoards
 {

    @BeforeAll 
    public static void setBaseUrl() {
        RestAssured.baseURI = "https://api.restful-api.dev";
    }
    
    @Test
    public void checkGetBoards(){
        RestAssured.given()
            //.baseUri("https://restful-api.dev")
            .log().all()
            .get()
            .prettyPeek()
            .then()
            .statusCode(200);
    }
    
}
