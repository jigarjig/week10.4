package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Multibrowsing {
        static String browser = " ";
        static String baseurl = "https://courses.ultimateqa.com/users/sign_in";
        static WebDriver driver;

        public static void main(String[] args) {
            browser = "chrome";
            //browser = "edge";
            // browser = "firefox";


            if (browser.equalsIgnoreCase("Chrome")) {
                System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
                driver = new ChromeDriver();
            } else if (browser.equalsIgnoreCase("Firefox")) {
                System.setProperty("webdriver.geco.driver", "src/drivers/geckodriver.exe"); //setting webriver
                driver = new FirefoxDriver();
            } else if (browser.equalsIgnoreCase("edge")) {
                System.setProperty("webdriver.edge.driver", "src/driver/msedgedriver.exe");
                driver = new EdgeDriver();
            } else {
                System.out.println("not valid browser ");
            }
            driver.get(baseurl);// method to invoke url
            driver.manage().window().maximize();  //maximising windows
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  // timeout session
            String url = driver.getCurrentUrl();
            System.out.println("Current url"+ url);  // printing url
            String source = driver.getPageSource();
            System.out.println("Page source" +source); // printing page source

            WebElement Email = driver.findElement(By.id("user[email]"));  // store in email/username
            Email.sendKeys("mala_purohit76@yahoo.co.uk"); // sending key to email/username field
            WebElement Password = driver.findElement(By.id("user[password]")); // storing passwprd
            Password.sendKeys("Mala1234"); // sending key to password field
            driver.findElement(By.className("button")).click();  // clicking on login button
        }
    }



