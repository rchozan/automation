package jwttesting;

import groovy.transform.ASTTest;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

public class jwtest {

    public static void main(String[] args) {
        RestAssured.baseURI = "https://reqres.in/";
        String response = given().log().all()
                .header("Content-type", "application/json")
                .header("x-api-key", "reqres-free-v1")
                .body("{\n" +
                        "  \"email\": \"eve.holt@reqres.in\",\n" +
                        "  \"password\": \"cityslicka\"\n" +
                        "}")
                .when()
                .post("api/login")
                .then()
                .statusCode(200)
                .extract().asPrettyString();
        JsonPath js = new JsonPath(response);
        String token = js.getString("token");
        System.out.println(token);
    }
}





