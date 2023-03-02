package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButton2 {
    public static void main(String[] args) throws InterruptedException {

        // first step in automation is to tell your project where the webdriver is located.
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        // create an instance of webdriver
        WebDriver driver = new ChromeDriver();
        // max the window
        driver.manage().window().maximize();
        // open syntaxprojects.com
        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");
        // find all the age group radio buttons
        List<WebElement> radioBtns = driver.findElements(By.xpath("//input[@name='ageGroup']"));
        // iterate over the list to see your desired one
        for (WebElement radioBtn : radioBtns) {
            String age = radioBtn.getAttribute("value");
            // if the value of the webelement is 5-10 click on it
        if(age.equalsIgnoreCase("5-15")){
            radioBtn.click();
        }

        }
    }
}

