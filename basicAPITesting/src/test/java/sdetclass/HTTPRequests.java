//package sdetclass;
////Static Packages to be added manually to Rest Assured
//import static io.restassured.RestAssured.*;
//import static io.restassured.matcher.RestAssuredMatchers.*;
//import static org.hamcrest.Matchers.*;
//import org.junit.Test;
//
//import java.util.HashMap;
//import java.util.PriorityQueue;
//
//import static io.restassured.RestAssured.given;
//import static io.restassured.RestAssured.when;
//
//public class HTTPRequests {
//    int id;
//
//    @Test
//    public void getUsers() {
//
//        given()
//                .when()
//                .get("https://reqres.in/api/users?page=2")
//                .then()
//
//                .statusCode(200)
//                .body("page", equalTo(2))
//                .log().all();
//
//
//    }
//    @Test
//    public void createUser(){
//
//        HashMap data = new HashMap();
//        data.put("name", "pavan");
//        data.put("job", "trainer");
//
//        given()
//                .contentType("application/json")
//                .body(data)
//                .when()
//                .post("https://reqres.in/api/users")
//                .then()
//                .statusCode(201)
//                .log().all();
//
//    }
//    @Test
//    public void createUserId(){
//        HashMap data = new HashMap();
//        data.put("name", "pavan");
//        data.put("job", "trainer");
//
//        id = given()
//                .contentType("application/json")
//                .body(data)
//                .when()
//                .post("https://reqres.in/api/users")
//                .jsonPath().getInt("id");
//
//    }
//    @Test
//    public void updateUser(){
//        HashMap data = new HashMap();
//        data.put("name", "john");
//        data.put("job", "teacher");
//
//        given()
//                .contentType("application/json")
//                .body(data)
//                .when()
//                .put("https://reqres.in/api/users/+id")
//                .then()
//                .statusCode(200)
//                .log().all();
//    }
//}
//
