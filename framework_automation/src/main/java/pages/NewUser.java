package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class NewUser extends BasePage {

    public NewUser(WebDriver driver) {
        super(driver);
    }

    By nitTxt = By.cssSelector("#registrarUusario\\3a j_idt34_content > table > tbody > tr:nth-child(1) > td:nth-child(2) > input[type=\"text\"]");
    By consultBtn = By.cssSelector("#registrarUusario\\3a loginButtonR > span");
    By codigoDwn = By.cssSelector("#registrarUusario\\3a listBoxTipoUsuarioR_label");
    By alertTxt = By.cssSelector("div > div > div.ui-growl-message > p");


    public NewUser setNit (String value) {
        sendText(nitTxt,value);
        return this;
    }

    public NewUser clickConsultar() {
        clickElement(consultBtn);
        return this;
    }

    public String getTextCode () throws InterruptedException {
        String text = driver.findElement(codigoDwn).getText();
        Thread.sleep(5000);
        return text;
    }

    public String getAlertCode () throws InterruptedException{
        String alertText = driver.findElement(alertTxt).getText();
        Thread.sleep(2000);
        //System.out.println("alertText: " + alertText );
        return alertText;

    }

    public void waitElement(int n) throws InterruptedException{

        Thread.sleep(n*1000);
    }


}
