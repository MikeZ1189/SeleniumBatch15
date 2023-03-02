package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselector {
    public static void main(String[] args) throws InterruptedException {

        // first step in automation is to tell your project where the webdriver is located.
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        // create an instance of webdriver
        WebDriver driver=new ChromeDriver();
        // max the window
        driver.manage().window().maximize();
        // open smart bear
        driver.get("https://www.facebook.com/");
        // click on the button create account using CSS selector
        WebElement createNewBtn = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        // click on the button
        createNewBtn.click();
        //sleep
        Thread.sleep(2000);
        // fill in the first name
        WebElement firstName=driver.findElement(By.cssSelector("input[name='firstname']"));
        // click on the element
        firstName.sendKeys("abracadabra");




    }
}
