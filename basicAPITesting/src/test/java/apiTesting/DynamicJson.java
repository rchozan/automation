package apiTesting;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import org.testng.Assert;

public class DynamicJson {


    @Test
    public void addBook() {
        RestAssured.baseURI = "http://216.10.245.166";
        String Response = given().log().all().header("Content-type", "application/json")
                .body(Payload.AddBook("asfge", "46564"))
                .when()
                .post("Library/Addbook.php")
                .then().assertThat().statusCode(200)
                .extract().response().asPrettyString();

        JsonPath js = ReUsableMethods.rawToJson(Response);
        String id = js.get("ID");
        String msg = js.getString("Msg");
        System.out.println(id);
        System.out.println(msg);

            String deleteResponse = given().log().all()
                    .header("Content-type", "application/json")
                    .body(Payload.DelBook(id))
                    .when()
                    .post("Library/DeleteBook.php")
                    .then().assertThat().statusCode(200)
                    .extract().response().asPrettyString();
            System.out.println("deleted successfully" + deleteResponse);


        }
    }


