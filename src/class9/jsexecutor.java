package class9;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class jsexecutor {
    public static void main(String[] args) {
        // first step in automation is to tell your project where the webdriver is located.
        //System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        // create an instance of webdriver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        // max the window
        driver.manage().window().maximize();
        //go to amazon.com
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        //find the username
        WebElement username= driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");

        //using js Executor, to highlight the username box
        //1. declare instance
        JavascriptExecutor js= (JavascriptExecutor) driver; // this will always be the same
        //2. execute script
        // arguments[0].style.border='10px dotted pink'  draw a box
        js.executeScript("arguments[0].style.border='10px dotted blue'", username);

        //find the WebElement
        WebElement loginBtn=driver.findElement(By.xpath("//input[@id='btnLogin]"));

        //click on the login button
        js.executeScript("arguments[0].click();",loginBtn);

    }
}
