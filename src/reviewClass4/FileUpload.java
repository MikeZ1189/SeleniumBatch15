package reviewClass4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileUpload {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(options);

        driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@multiple]")).sendKeys("/Users/michaelzurita/IdeaProjects/Projects/Group_Exercise_2.pdf");
// Note; this will work only for those file upload button for which the tag name is input and type is file
        // sendKeys use
        //1. entering values in the text boxes
        //2. uploading the file
        //3. for performing the keyboard interactions

        // Action class: to scroll, drag and drop, double click, hover
        // mouse actions
            // how to perform right click
            // how to perform double click
            // how to perform drag and drop
            // how to perform mouse hover


    }
}
