package rahulshetty;
import org.junit.jupiter.api.Test;

import io.restassured.RestAssured;

//Rahul: Rest API Testing (Automation) from Scratch-Rest Assured Java UDEMY course


public class RestAPIbasics {


      @Test 
        public void rahul_getObjects() {
       RestAssured.given()
        .baseUri("https://api.restful-api.dev")     
        .queryParam("x-api-key", "3641586e-68f5-48f2-bd8b-18aa883e1b8c")
        .headers("Content-type","application/json")        
       /*
        .body("{\n" +
                "  \"name\": \"Siemens 26 Pro\",\n" +
                "  \"data\": {\n" +
                "    \"Color\": \"Red\",\n" +
                "    \"Capacity\": \"256 GB\"\n" +
                "  }\n" +
                "}")
       */
        .when()
        //.post("/objects")
        .get("/objects")
        .then()
        .log().all()
        .assertThat().statusCode(200);

        }


          @Test 
        public void rahul_Test1() {
       System.out.println("Logging into Application");
           }
           
     


           @Test 
        public void dahul_Test2() {
       System.out.println("Logging out of application. Awesome!");
       }

           @Test 
        public void aahul_Test3() {
       System.out.println("Running REO fetch Test ");
       }

        }




