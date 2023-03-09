package class6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class implicitwait {
    public static void main(String[] args) {

        // first step in automation is to tell your project where the webdriver is located.
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        // create an instance of webdriver
        WebDriver driver=new ChromeDriver();
        // max the window
        driver.manage().window().maximize();
        // implicit wait here
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        // go to website
        driver.get("https://www.facebook.com/");
        // click on the create new account
        driver.findElement(By.linkText("Create new account")).click();
        // send your firstname
        driver.findElement(By.name("firstname")).sendKeys("abracadabra");




    }
}
