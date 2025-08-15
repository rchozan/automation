package apiTesting;

import groovy.json.JsonOutput;
import org.testng.annotations.Test;
import pojoclass.GetAddPojo;
import static io.restassured.RestAssured.*;
import org.hamcrest.Matchers.*;


@Test
public class GetAddress {

    //get place

    String placeId = "1bc3733f8f4e9b12899037969077d29f";
    GetAddPojo ga =
            given().log().all()
            .queryParam("key", "qaclick123")
            .queryParam("place_id", placeId)
            .when().get("http://rahulshettyacademy.com/maps/api/place/get/json")
            .then().assertThat().log().all().statusCode(200).extract().as(GetAddPojo.class);

    System.out.println();



}

