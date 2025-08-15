package retrunType;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import static io.restassured.RestAssured.*;
import io.restassured.path.json.JsonPath;
import static org.hamcrest.Matchers.*;


public class DummyJWTTest {
    public static void main(String[] args) {
        baseURI="https://reqres.in";
        String response = given().log().all()
                .header("Content-Type", "application/json")
                .header("x-api-key", "reqres-free-v1")
                .body("{\n" +
                        "  \"email\": \"eve.holt@reqres.in\",\n" +
                        "  \"password\": \"cityslicka\"\n" +
                        "}")
                .when()
                .post("/api/login")
                .then()
                .statusCode(200)
                .log()
                .all()
                .extract().asString();

        JsonPath js = new JsonPath(response);
        System.out.println("JWT Token: " + js.getString("token"));
    }
}