package reviewClass3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchApp {
    public static void main(String[] args) {

        //System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver=new ChromeDriver(options);
        //  driver.get("https://www.google.com/");
        driver.navigate().to("https://www.google.com/");  //another way to launch browser
        String pageTitle=driver.getTitle();
        System.out.println(pageTitle);

    }
}


