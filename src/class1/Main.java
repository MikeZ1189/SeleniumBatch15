package class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
    public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
        WebDriver driver2 = new FirefoxDriver();
        driver.get("https://www.google.com");
    }
}