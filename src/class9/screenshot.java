package class9;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;

public class screenshot {
    public static void main(String[] args) throws IOException {

        // first step in automation is to tell your project where the webdriver is located.
        //System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        // create an instance of webdriver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        // max the window
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //go to website
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        //username Text Box
        WebElement userName = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        userName.sendKeys("Tester");

        //password field
        WebElement pass = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
        pass.sendKeys("test");
        //password field

        //take screenshot interface
        TakesScreenshot ss = (TakesScreenshot) driver;
//        take the scrren shot as file
        File sourceFile = ss.getScreenshotAs(OutputType.FILE);
        System.out.println(sourceFile);
//        save the file in computer
        FileUtils.copyFile(sourceFile,new File("/Users/michaelzurita/IdeaProjects/SeleniumBatch15/src/scren/iou.png"));


    }
}
