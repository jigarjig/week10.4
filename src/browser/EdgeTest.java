package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeTest {
    public static void main(String[] args) {

        String baseurl = "https://courses.ultimateqa.com/users/sign_in";  // storing base url
        System.setProperty("webdriver.edge.driver","src/driver/msedgedriver.exe"); // setting edge web driver
        WebDriver driver = new EdgeDriver();  // create object of edge webdriver
        driver.get(baseurl); // method to invoke url
        driver.manage().window().maximize(); // window maximising
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // timeout session
        String title = driver.getTitle();
        System.out.println("Title of the page" +title);  // print title
        String url = driver.getCurrentUrl();
        System.out.println("Current url " +url);  // print url
        String source = driver.getPageSource();
        System.out.println("Page source" +source);   // print page source

        WebElement Email = driver.findElement(By.id("user[email]"));  // store email/username
        Email.sendKeys("mala_purohit76@yahoo.co.uk"); // sending key to email/username field
        WebElement Password = driver.findElement(By.id("user[password]")); // store password
        Password.sendKeys("Mala1234"); // sending key to password

        driver.findElement(By.className("button")).click();  // clickin on login button
    }
}


