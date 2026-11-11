import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

//Udemy course: Rest Assured API Automation Testing from Scratch - Rest Assured Tutorial
//Chauhan

public class ExtractResponse
 {

    @BeforeAll 
    public static void setBaseUrl() {
        RestAssured.baseURI = "https://api.restful-api.dev";
    }
    
    @Test
    public void extract_response(){
        Response res = 
        RestAssured
        .given()
            .baseUri("https://api.restful-api.dev")
            .headers("x-api-key", "3641586e-68f5-48f2-bd8b-18aa883e1b8c")
         .when()    
            .get("/objects") 
           // .prettyPeek()        
        .then()
           // .log().all() 
            .assertThat()
            .statusCode(200 )
            .extract()
            .response();
            JsonPath jsonPath =new JsonPath(res.asString());

              System.out.println("Response is: " + jsonPath.getString("objects[10].id"));
            //System.out.println("Response is: " + res.path("objects[1].name"));
    
        }
    
}
