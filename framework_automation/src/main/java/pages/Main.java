package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Main extends BasePage {


    By registerUser =By.cssSelector("#formLogin\\3a j_idt25");

    public Main(WebDriver driver) {
        super(driver);
    }


    public Main clickRegister(){
        clickElement(registerUser);
        return this;
    }



}
