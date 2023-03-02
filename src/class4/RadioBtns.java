package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.html.HTMLInputElement;

public class RadioBtns {
    public static void main(String[] args) throws InterruptedException {

        // first step in automation is to tell your project where the webdriver is located.
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        // create an instance of webdriver
        WebDriver driver=new ChromeDriver();
        // max the window
        driver.manage().window().maximize();
        // open syntaxprojects.com
        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");
        // click on the radio button male
        WebElement maleBtn=driver.findElement(By.cssSelector("input[value='Male']"));
        // check if the radio button is enabled
        boolean isEnabledMale=maleBtn.isEnabled();
        System.out.println("the radio button male is enabled "+isEnabledMale);

        // check if the radio button is displayed
        boolean isDisplayedMale=maleBtn.isDisplayed();
        System.out.println("The radio button male is displayed "+isDisplayedMale);

        //check if the radio button is selected
        boolean isSelectedMale=maleBtn.isSelected();
        System.out.println("The radio button male is selected "+isSelectedMale);

        //if the radio button is not selected then click on it
        if(!isSelectedMale){
            maleBtn.click();
        }
        // check if the radio button is selected after the click
        isSelectedMale=maleBtn.isSelected();
        System.out.println("The status of selections is "+isSelectedMale);


    }
}
