package apiTesting;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class Basics {
    //given all input details
    //when submit the api
    // then validate the response
    public static void main(String[] args) {
        ;

        RestAssured.baseURI = "https://rahulshettyacademy.com";
        String response = given().log().all().queryParam("key", "qaclick123").header("Content-type", "application/json")
                .body(Payload.addPlace())
                .when()
                .post("maps/api/place/add/json")
                .then()
                //.log().all()
                .assertThat().statusCode(200).body("scope", equalTo("APP")).header("server", equalTo("Apache/2.4.52 (Ubuntu)")).extract().response().asString();
        //System.out.println(response);
        JsonPath js = new JsonPath(response);
        String placeId = js.getString("place_id");
        System.out.println(placeId);

        //update place
        String newAddress = "newAddress updated Walk, Africa";
        String responsePut=given().log().all().queryParam("key", "qaclick123").header("Content-type", "application/json")
                //.body(Payload.updatePlace())
                .body("{\"place_id\":\""+placeId+"\",\"address\":\""+newAddress+"\",\"key\":\"qaclick123\"}").when().put("maps/api/place/update/json")
                .then().assertThat().statusCode(200).body("msg", equalTo("Address successfully updated")).extract().response().asString();
        System.out.println(newAddress);
        System.out.println(responsePut);


    //get place
        System.out.println("getplace  "+placeId);
        String getPlaceResponse = given().log().all()
                .queryParam("key", "qaclick123")
                .queryParam("place_id", placeId)
                .when().get("maps/api/place/get/json")
                .then().assertThat().log().all().statusCode(200).extract().asString();
        JsonPath Js1 = new JsonPath(getPlaceResponse);
        String actualAddress = Js1.getString("address");
        System.out.println(actualAddress);
        Assert.assertEquals(actualAddress, newAddress);


    }

}
