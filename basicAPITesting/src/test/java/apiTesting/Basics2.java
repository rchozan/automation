package apiTesting;

import io.restassured.RestAssured;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


public class Basics2
{
    //given all input details
    //when submit the api
    // then validate the response
    public static void main(String[] args) throws IOException {
        RestAssured.baseURI="https://rahulshettyacademy.com";
        given()
                .log().all()
                .queryParam("key","qaclick123")
                .header("Content-type", "application/json")
                .body(new String(Files.readAllBytes(Path.of("/home/rajan/IdeaProjects/automation/basicAPITesting/src/test/java/files/addnew.json"))))
                .when()
                .post("maps/api/place/add/json")
                .then()
                .log().all()
                .assertThat().statusCode(200).body("scope", equalTo("APP1"))
                .header("server", equalTo("Apache/2.4.52 (Ubuntu)"));


    }







}
