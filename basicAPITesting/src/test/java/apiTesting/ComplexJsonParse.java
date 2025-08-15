package apiTesting;

import io.restassured.path.json.JsonPath;

public class ComplexJsonParse {
    public static void main(String[] args) {
        JsonPath js = new JsonPath(Payload.coursePrice());

        //print number of courses in api
        int count = js.getInt("courses.size()");
        System.out.println(count);

        //print purchase amount
        int pamount = js.getInt("dashboard.purchaseAmount");
        System.out.println(pamount);

        //print title of the first course
        String title = js.getString("courses[0].title");
        System.out.println(title);

        //Print course titles and their price
        for (int i = 0; i < count; i++) {
            String CourseTitles = js.getString("courses[" + i + "].title");
            String CoursePrice = js.getString("courses[" + i + "].price");
            System.out.println(CourseTitles);
            System.out.println(CoursePrice);
        }

        //print number of copies sold by rpa
        System.out.println("print number of copies sold by RPA");
        for (int i = 0; i < count; i++) {
            String CourseTitles = js.getString("courses[" + i + "].title");
            if (CourseTitles.equalsIgnoreCase("RPA")) {
                String Copies = js.getString("courses[" + i + "].copies");
                System.out.println(Copies);
            }
        }

    }
}




