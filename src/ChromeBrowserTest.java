import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {

    public static void main(String[] args){

        //launch the Chrome browser
        WebDriver driver = new ChromeDriver();
        //Open the URL into browser
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Print the title of the page
        String title = driver.getTitle();
        System.out.println(title);
        //Print the current URL
        System.out.println("current URL :" +driver.getCurrentUrl());
        //Print the page source
        System.out.println("Page source :" +driver.getPageSource());
        //Enter the username to username field
        WebElement usernamelink = driver.findElement(By.name("username"));
        usernamelink.sendKeys("prime123@gmail.com");
        //Enter the password to password field
        driver.findElement(By.name("password")).sendKeys("admin123");
        //Close the browser
        driver.close();


    }
}
