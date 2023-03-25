package reviewClass5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandlingDropDown2 {
    public static void main(String[] args) {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(options);
        driver.get("https://www.orangehrm.com/contact-sales/");
        driver.manage().window().maximize();

        WebElement countryDdl = driver.findElement(By.xpath("//select[@id='Form_getForm_Country']"));
        Select country = new Select(countryDdl);
        List<WebElement> countryList =  country.getOptions();
        for (WebElement nation: countryList){
            String countryName=nation.getText();
            if(countryName.equalsIgnoreCase("Australia")){
                nation.click();
                break;
            }
        }


    }
}
