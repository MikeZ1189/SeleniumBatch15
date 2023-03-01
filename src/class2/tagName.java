package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagName {
    public static void main(String[] args) {

        // first step in automation is to tell your project where the webdriver is located.
        // for mac user please do not use .exe with chromedriver
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        // create an instance of webdriver
        WebDriver driver=new ChromeDriver();
        // maximize screen
        driver.manage().window().maximize();
        // navigate to the website
        driver.get("https://www.amazon.com/");
        // print all the links in the amazon.com
        driver.findElements(By.tagName("a"));
        // to be continued in the next class



    }
}
