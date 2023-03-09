package class6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
    public static void main(String[] args) {

        // first step in automation is to tell your project where the webdriver is located.
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        // create an instance of webdriver
        WebDriver driver=new ChromeDriver();
        // max the window
        driver.manage().window().maximize();
        // go to website
        driver.get("http://www.uitestpractice.com/Students/Switchto");
        // switch to the iframe which contains the input box
        // method : by index
        driver.switchTo().frame(0);
        // this statement will shift the focus to the first frame

       WebElement textBox = driver.findElement(By.xpath("//input[@id='name']"));
        // send some text
        textBox.sendKeys("abracadabra");
        // ge the text click on from parent window
        driver.switchTo().defaultContent();
        //find the text
        WebElement text=driver.findElement(By.xpath("//h3"));
        System.out.println("The text is: "+text.getText());

        //switch to frame
        //get the text enter name in iframe
        driver.switchTo().frame("iframe_a");

        WebElement getLabel=driver.findElement(By.xpath("//label"));
        System.out.println("The label is: "+getLabel.getText());

        //switch focus to the main page
        driver.switchTo().defaultContent();

        // third method switch to an iframe using WebElement
        // clear whatever is written in the text box
        // switch to correct frame first
        WebElement frame1=driver.findElement(By.xpath("//iframe[@name='iframe_a']"));
        driver.switchTo().frame(frame1);
        textBox.clear();



    }
}
