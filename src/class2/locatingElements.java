package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatingElements {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        WebDriver driver=new ChromeDriver();
        // open up facebook.com
        driver.get("https://www.facebook.com/");
        // send in the username
        driver.findElement(By.id("email")).sendKeys("moazzam");
        // send in the password
        driver.findElement(By.name("pass")).sendKeys("pass");
        // click on the button create new account
        //  driver.findElement(By.linkText("Create new account")).click();
        // click on forgotten password button
        driver.findElement(By.partialLinkText("password?")).click();

        driver.quit();
    }
}
