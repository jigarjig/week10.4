package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFoxTest {
    public static void main(String[] args) {

        String baseurl = "https://courses.ultimateqa.com/users/sign_in";  // storing base url
        System.setProperty("webdriver.geco.driver","src/driver/geckodriver.exe"); // setting firefox web driver
        WebDriver driver = new FirefoxDriver();  // create object of firefox webdriver
        driver.get(baseurl); // method to invoke url
        driver.manage().window().maximize();  // maximising window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // timeout session
        String title = driver.getTitle();
        System.out.println("Title of the page" +title); // printing title
        String url = driver.getCurrentUrl();
        System.out.println("Current url " +url);  // printing url
        String source = driver.getPageSource();
        System.out.println("Page source" +source);  // print page source

        WebElement Email = driver.findElement(By.id("user[email]")); // storing email/username
        Email.sendKeys("mala_purohit76@yahoo.co.uk"); // sending key to emai/username field
        WebElement Password = driver.findElement(By.id("user[password]")); // storing password field
        Password.sendKeys("Mala1234"); // sending key to password field

        driver.findElement(By.className("button")).click(); // Clicking on login butoon
        //  driver.findElement(By.id("login-button")).click();
    }
}

