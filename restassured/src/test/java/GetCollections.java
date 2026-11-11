import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import io.restassured.RestAssured;

//Udemy course: Rest Assured API Automation Testing from Scratch - Rest Assured Tutorial
//Chauhan

public class GetCollections
 {

    @BeforeAll 
    public static void setBaseUrl() {
        RestAssured.baseURI = "https://api.restful-api.dev";
    }
    
    @Test
    public void validate_Test_Status_Code(){
        RestAssured.given()
            .baseUri("https://api.restful-api.dev")
            .headers("x-api-key", "3641586e-68f5-48f2-bd8b-18aa883e1b8c")
             
            .get("/objects") 
            .prettyPeek()        
            .then()
            .log().all() 
            .statusCode(200 );
    }
    
}
