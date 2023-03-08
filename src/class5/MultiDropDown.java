package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropDown {
    public static void main(String[] args) throws InterruptedException {

        // first step in automation is to tell your project where the webdriver is located.
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        // create an instance of webdriver
        WebDriver driver=new ChromeDriver();
        // max the window
        driver.manage().window().maximize();
        // open syntaxprojects.com
        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");
        // get the drop down
        WebElement DD=driver.findElement(By.xpath("//select[@id='multi-select']"));
        //use the select class
        Select sel=new Select(DD);
        // select by value
        sel.selectByValue("New Jersey");
        // select by visible text
        sel.selectByVisibleText("Ohio");
        // to slow down
        Thread.sleep(2000);

        // when it comes to multi select drop down, we can also deselect
        sel.deselectByValue("New Jersey");
        sel.deselectByVisibleText("Ohio");

        System.out.println("The drop down is multiple "+sel.isMultiple());


    }
}
