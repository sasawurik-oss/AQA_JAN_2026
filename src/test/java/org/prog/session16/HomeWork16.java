package org.prog.session16;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeWork16 {

//TODO: add location to request
//TODO: validate street number and name in location are not empty


        @Test
        public void testApiCall() {
            RequestSpecification requestSpecification = RestAssured.given();
            requestSpecification.baseUri("https://randomuser.me/");
            requestSpecification.basePath("/api/");
            requestSpecification.queryParam("noinfo");
            requestSpecification.queryParam("inc", "gender,name,nat,location");

            Response response = requestSpecification.get();
            response.prettyPrint();
            response.then()
                    .statusCode(200)
                    .contentType(ContentType.JSON);

            String gender = response.jsonPath()
                    .getString("results[0].gender");

            String streetName = response.jsonPath()
                    .getString("results[0].location.street.name");

            Integer streetNumber = response.jsonPath()
                    .getInt("results[0].location.street.number");


            Assert.assertEquals(gender, "female");
            Assert.assertFalse(streetName.isBlank());
            Assert.assertTrue(streetNumber > 0);


        }


