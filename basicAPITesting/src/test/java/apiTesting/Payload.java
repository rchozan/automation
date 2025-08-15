package apiTesting;

public class Payload {

    public static String addPlace() {
        String newAddress = "Summa45 Walk, Africa";
        return "{\"location\":{\"lat\":-38.383494,\"lng\":33.427362},\"accuracy\":50,\"name\":\"Frontlinehouse\",\"phone_number\":\"(+91)9838933937\",\"address\":\"" + newAddress + "\",\"types\":[\"shoepark\",\"shop\"],\"website\":\"http://google.com\",\"language\":\"French-IN\"}";
    }

    public static String dummey(){
            String new1 =

    }

    public static String coursePrice() {

        return "{\n" +
                "  \"dashboard\": {\n" +
                "    \"purchaseAmount\": 1560,\n" +
                "    \"website\": \"rahulshettyacademy.com\"\n" +
                "  },\n" +
                "  \"courses\": [\n" +
                "    {\n" +
                "      \"title\": \"Selenium Python\",\n" +
                "      \"price\": 50,\n" +
                "      \"copies\": 6\n" +
                "    },\n" +
                "    {\n" +
                "      \"title\": \"Cypress\",\n" +
                "      \"price\": 40,\n" +
                "      \"copies\": 4\n" +
                "    },\n" +
                "    {\n" +
                "      \"title\": \"RPA\",\n" +
                "      \"price\": 45,\n" +
                "      \"copies\": 10\n" +
                "    },\n" +
                "    {\n" +
                "      \"title\": \"Appium\",\n" +
                "      \"price\": 65,\n" +
                "      \"copies\": 10\n" +
                "    }\n" +
                "  ]\n" +
                "}";
    }


    public static String AddBook(String isbn, String aisle) {

        String payload = "{\"name\":\"LearnAppiumAutomationwithJava\",\"isbn\":\"" + isbn + "\",\"aisle\":\"" + aisle + "\",\"author\":\"Johnfoe\"}";
        return payload;

    }

    public static String DelBook(String id) {
        String payload = "{\n" + "\"ID\": \"" + id + "\"\n" + "}";
        return payload;
    }

}


