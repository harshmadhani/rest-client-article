package com.example.countries;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class CountryResourceTest {

    @Test
    public void testCapitalEndpoint() {
        given()
          .when().get("/countries/capital/delhi")
          .then()
             .statusCode(200);
    }
}