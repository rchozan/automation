package jwttesting;

import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class jwttest {
    public static void main(String[] args) {

        RestAssured.baseURI = "https://reqres.in";
        String response = given().log().all()
                .header("Content-type", "application/json")
                .header("x-api-key", "reqres-free-v1")
                .body("{\n" +
                        "  \"email\": \"eve.holt@reqres.in\",\n" +
                        "  \"password\": \"cityslicka\"\n" +
                        "}")
                .when()
                .post("/api/login")
                .then()
                //.log().all()
                .assertThat().statusCode(200)
                .extract().response().asPrettyString();
        System.out.println(response);
        JsonPath js = new JsonPath(response);
        String token = js.getString("token");
        System.out.println(token);

    }
}