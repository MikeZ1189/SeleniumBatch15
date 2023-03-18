package class9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class Calendar {
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
        driver.get("https://www.delta.com/");
        //click on the calendar
        WebElement calendar = driver.findElement(By.xpath("//span[text()='Depart']"));
        calendar.click();

        //get the month from the calendar
        WebElement month=driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']"));
        // get the next button
        WebElement next=driver.findElement(By.xpath("//span[text()='Next']"));
        //click on next button until you find the right month
        boolean isFound=false;
        while(!isFound){

            String month_= month.getText();
            if(month_.equalsIgnoreCase("January")){
//                select the day
                List<WebElement> days = driver.findElements(By.xpath("//table[@class='dl-datepicker-calendar']/tbody/tr/td"));
                for(WebElement day:days){
                    String day_text = day.getText();
                    if(day_text.equalsIgnoreCase("20")){
                        day.click();
                        isFound=true;
                        break;
                    }
                }
            }
            else {
                next.click();
            }
        }
    }
}