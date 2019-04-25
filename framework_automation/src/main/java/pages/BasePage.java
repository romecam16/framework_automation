package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

    public WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public void sendText(By elem, String value){
        driver.findElement(elem).sendKeys(value);
    }

    public void clickElement(By elem){
        driver.findElement(elem).click();
    }


}
