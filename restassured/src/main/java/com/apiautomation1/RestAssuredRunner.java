package com.apiautomation1;

import io.restassured.RestAssured;

public class RestAssuredRunner
 {
    public static void main(String[] args) {
        try {
            RestAssured.given()
                //.baseUri("https://restful-api.dev")
                .log().all()
                .baseUri("https://google.com")
                .get()
                .prettyPeek()
                .then()
                .statusCode(400);
        } catch (AssertionError | RuntimeException error) {
            System.err.println("\u001B[31mEda oru Error: " + error.getMessage() + "\u001B[0m");
            throw error;
        }
    }
}