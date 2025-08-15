package apiTesting;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


public class Basics1
{
    //given all input details
    //when submit the api
    // then validate the response
    public static void main(String[] args) {
        RestAssured.baseURI="https://rahulshettyacademy.com";
        given()
                .log().all()
                .queryParam("key","qaclick123")
                .header("Content-type", "application/json")
                .body("{\"location\":{\"lat\":-38.383494,\"lng\":33.427362},\"accuracy\":50,\"name\":\"Frontlinehouse\",\"phone_number\":\"(+91)9838933937\",\"address\":\"29,sidelayout,cohen09\",\"types\":[\"shoepark\",\"shop\"],\"website\":\"http://google.com\",\"language\":\"French-IN\"}")
                .when()
                .post("maps/api/place/add/json")
                .then()
                .log().all()
                .assertThat().statusCode(200).body("scope", equalTo("APP1"))
                .header("server", equalTo("Apache/2.4.52 (Ubuntu)"));


    }







}
