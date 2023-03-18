package class9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {
    public static void main(String[] args) {
        // first step in automation is to tell your project where the webdriver is located.
        //System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        // create an instance of webdriver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        // max the window
        driver.manage().window().maximize();

        driver.get("https://jqueryui.com/droppable/");

        driver.switchTo().frame(0);

        //get the element which u want to drag
        WebElement draggable = driver.findElement(By.id("draggable"));

        //get the dropable element
        WebElement dropable = driver.findElement(By.id("droppable"));

        // action class
        Actions action= new Actions(driver);
        action.dragAndDrop(draggable,dropable).perform();

    }
}
