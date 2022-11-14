import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {

    public static void main(String[] args) {
        String baseUrl = "https://www.saucedemo.com/";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        //Object of chrome
        WebDriver driver = new ChromeDriver();

        //Launch URL
        driver.get(baseUrl);

        //Maximise window
        driver.manage().window().maximize();

        //We give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get page title
        String title = driver.getTitle();
        System.out.println("Page title is:" + title);

        //Get current url
        System.out.println("Current URL is:" + driver.getCurrentUrl());

        //Get the  page source
        System.out.println("Page source is:" + driver.getPageSource());

        //Find username link element
        WebElement userNameField = driver.findElement(By.id("user-name"));

        //Enter username is username field
        userNameField.sendKeys("London@123");

        //Find password link element
        WebElement passwordField = driver.findElement(By.name("password"));

        //Enter password in password field
        passwordField.sendKeys("Money123");

        //Close the browser
        driver.close();
    }
}
