package class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitDemo2 {
    public static void main(String[] args) {

        // first step in automation is to tell your project where the webdriver is located.
       //System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        // create an instance of webdriver
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver=new ChromeDriver(options);
        // max the window
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //go to syntax projects.com
        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
        //  click on the alert button
        driver.findElement(By.xpath("//button[@id='alert']")).click();
        //wait until the alert is present
        // 1.
       WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
       wait.until(ExpectedConditions.alertIsPresent());

        driver.switchTo().alert().accept();


    }
}
