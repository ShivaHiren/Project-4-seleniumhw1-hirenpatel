import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeBrowserTest {

    public static void main(String[] args) {
        String baseUrl = "https://www.saucedemo.com/";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        //Object for Edge
        WebDriver driver = new EdgeDriver();

        //Launch URL
        driver.get(baseUrl);

        //Maximise window
        driver.manage().window().maximize();

        //We give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get the title of the page
        String title = driver.getTitle();
        System.out.println("Page title is:"+ title);

        //Get the current URL
        System.out.println("Current URL is:"+ driver.getCurrentUrl());

        //Get the page source
        System.out.println("Page source is:"+ driver.getPageSource());

        //Find username link element
        WebElement userNameField = driver.findElement(By.id("user-name"));

        //Type username
        userNameField.sendKeys("London@123");

        //Find password link element
        WebElement passwordElement = driver.findElement(By.name("password"));

        //Type password in password link
        passwordElement.sendKeys("Money123");

        //Close the window
        driver.close();
    }
}
