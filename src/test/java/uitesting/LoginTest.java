package uitesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LoginTest {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://letcode.in/test");
        driver.findElement(By.xpath("//a[text()='Edit']")).click();
        driver.findElement(By.id("fullName")).sendKeys("Rajaraja");



    }
}
