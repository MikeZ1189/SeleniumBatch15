package class9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class TablesDemo {
    public static void main(String[] args) {

        // first step in automation is to tell your project where the webdriver is located.
        //System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        // create an instance of webdriver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        // max the window
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //go to website
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        //log in to website
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Hum@nhrm123");
        driver.findElement(By.xpath("//input[@value='LOGIN']")).click();

        //click on PIM
        driver.findElement(By.xpath("//b[text()='PIM']")).click();


        // in order to find the desired id
        boolean idFound=false;
        while(!idFound) {
            // as DOM is refreshed after the click on the next page so we find elements in the loop
            //get the employee id 52396A and click on th checkbox associated with it
            List<WebElement> ids = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));

            for (int i = 0; i < ids.size(); i++) {
                String id = ids.get(i).getText();
                if (id.equalsIgnoreCase("52097A")) {

                    System.out.println("id is on the row " + i);
                    // to click on the particular checkbox
                    WebElement cbx = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + (i + 1) + "]/td[1]"));
                    cbx.click();
                    idFound=true;
                    break;
                }
            }
            // click on the next page
            if(!idFound) {
                WebElement nextBtn = driver.findElement(By.xpath("//a[text()='Next']"));
                nextBtn.click();
            }
        }

    }
}