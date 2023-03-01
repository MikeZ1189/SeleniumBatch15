package class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
    public static void main(String[] args) throws InterruptedException {
        // first step is to connect to the webDriver
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        // initiate the instance of webDriver
        WebDriver driver=new ChromeDriver();
        // open google.com
        driver.get("https://www.google.com/?client=safari");
        // slow down
        Thread.sleep(2000);
        // now navigate to facebook.com
        driver.navigate().to("https://www.facebook.com/");
        // slow down
        Thread.sleep(2000);
        // go back
        driver.navigate().back();
        // slow down
        Thread.sleep(2000);
        // go to facebook again
        driver.navigate().forward();
        Thread.sleep(2000);
        // refreshing the page
        driver.navigate().refresh();
        // close the browser
        driver.close();

    }
}
