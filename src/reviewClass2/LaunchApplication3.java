package reviewClass2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchApplication3 {
    public static void main(String[] args) {

        //System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");

       WebDriver driver=new ChromeDriver();
      //  driver.get("https://www.google.com/");
        driver.navigate().to("https://www.google.com/");  //another way to launch browser

    }
}
