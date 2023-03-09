package class5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) throws InterruptedException {

        // first step in automation is to tell your project where the webdriver is located.
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        // create an instance of webdriver
        WebDriver driver = new ChromeDriver();
        // max the window
        driver.manage().window().maximize();
        // open syntaxprojects.com
        driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S1409567013%3A1678243099833037&continue=https%3A%2F%2Fwww.google.com%2F&ec=GAZAmgQ&hl=en&passive=true&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AWnogHfBT01cQB8_eyv1NU6H53y32xh63kKWhruqgz5CWgch5fn2CIq2KdxfWKnXd2QghEvw7WAq3A");
        // click on the help button
        driver.findElement(By.xpath("//a[text()='Help']")).click();
        // click on privacy
        driver.findElement(By.xpath("//a[text()='Privacy']")).click();
        // get the window handle of the parent window
        String parentWindowHandle = driver.getWindowHandle();
        System.out.println(parentWindowHandle);

        // get window handles of all the windows that have been opened up
        Set<String> windowHandles = driver.getWindowHandles();
        for (String wh : windowHandles) {
            System.out.println(wh);

            // switch the focus of the driver to help window
            driver.switchTo().window(wh);
            // check the title of the window to which out focus is right now
            String title=driver.getTitle();
            if(title.equalsIgnoreCase("Privacy Policy – Privacy & Terms – Google")){
                break;
            }
        }
        // to verify we switched to the right window
        System.out.println(driver.getTitle());
        //switches focus back on parent handle
        driver.switchTo().window(parentWindowHandle);

    }
}
