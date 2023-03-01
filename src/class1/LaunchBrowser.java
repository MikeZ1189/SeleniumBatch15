package class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {

        // first step in automation is to tell your project where the webdriver is located.
        // for mac user please do not use .exe with chromedriver
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        // create an instance of WebDriver
        WebDriver driver=new ChromeDriver();
        // open website facebook.com
        driver.get("https://www.facebook.com/");
        // get the current url that is there in the browser
        String URL=driver.getCurrentUrl();
        // print out the url
        System.out.println(URL);
        // get the title of the webpage
        String title=driver.getTitle();
        // print out the title of the webpage
        System.out.println("The title of the page is "+title);
        // close the browser
        Thread.sleep(3000);
        driver.quit();
    }
}
