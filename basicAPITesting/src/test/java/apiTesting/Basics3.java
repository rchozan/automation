package apiTesting;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


public class Basics3 {


@Test
    public void addBook() throws IOException {
        RestAssured.baseURI = "http://216.10.245.166";
       String response = given().
                header("Content-Type", "application/json").
                body(GenerateStringFromResource("/home/rajan/IdeaProjects/automation/basicAPITesting/src/test/java/files/addnew.json")).
                when().
                post("/Library/Addbook.php").
                then().assertThat().statusCode(200).
                extract().response().asPrettyString();
        JsonPath js = ReUsableMethods.rawToJson(response);
        String id = js.get("ID");
        System.out.println(id);

        //deleteBOok


    }


    public static String GenerateStringFromResource(String path) throws IOException {
        return new String(Files.readAllBytes(Paths.get("/home/rajan/IdeaProjects/automation/basicAPITesting/src/test/java/files/addnew.json")));


    }

}


