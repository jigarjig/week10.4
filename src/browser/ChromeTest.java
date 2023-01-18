package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeTest {
    public static void main(String[] args) {


        String baseurl = "https://courses.ultimateqa.com/users/sign_in";  // store base url
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe"); // setting chrome web driver
        WebDriver driver = new ChromeDriver(); // create object of chrome webdriver
        driver.get(baseurl);  // method to invoke url
        driver.manage().window().maximize(); // maximising window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  // timeout session
        String title = driver.getTitle();
        System.out.println("Title of the page" + title); // printing title
        String url = driver.getCurrentUrl();
        System.out.println("Current url " + url);  // printing url
        String source = driver.getPageSource();
        System.out.println("Page source" + source);  // printing page source

        WebElement Email = driver.findElement(By.id("user[email]"));  // store in email/username
        Email.sendKeys("mala_purohit76@yahoo.co.uk"); // sending key to email/username field
        WebElement Password = driver.findElement(By.id("user[password]")); // storing passwprd
        Password.sendKeys("Mala1234"); // sending key to password field
        driver.findElement(By.className("button")).click();  // clicking on login button
    }
}
