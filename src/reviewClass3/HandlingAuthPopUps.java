package reviewClass3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class HandlingAuthPopUps {
    public static void main(String[] args) {

        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver=new ChromeDriver(options);
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");



    }
}
