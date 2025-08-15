package apiTesting;

import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SumValidation {

    @Test
    public void sumOfCourses() {
        JsonPath js = new JsonPath(Payload.coursePrice());
        int sum = 0;
        int count = js.getInt("courses.size()");
        for (int i = 0; i < count; i++) {
            int price = js.getInt("courses[" + i + "].price");
            int copies = js.getInt("courses[" + i + "].copies");
            int amount = price * copies;
            sum = sum + amount;
            System.out.println(amount);
            System.out.println(sum);

        }

        //actual validation of the test case

        int purchaseAmount = js.getInt("dashboard.purchaseAmount");
        System.out.println(purchaseAmount);
        Assert.assertEquals(purchaseAmount, sum);


    }


}

