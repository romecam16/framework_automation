package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.Main;
import pages.NewUser;

import static org.assertj.core.api.Assertions.assertThat;

public class Suite extends BaseTest {



    @Test
    public void firstTest() throws InterruptedException {

        Main mainPage = new Main(driver);

        mainPage.clickRegister();


        NewUser userPage = new NewUser(driver);
        userPage.waitElement(2);
        userPage.setNit("811007144");
        userPage.waitElement(2);
        userPage.clickConsultar();
        assertThat(userPage.getTextCode().contains("5001 - 050010433601")) ;

    }

    @Test
    public void secondTest() throws InterruptedException {

        Main mainPage = new Main(driver);

        mainPage.clickRegister();


        NewUser userPage = new NewUser(driver);
        userPage.waitElement(2);
        userPage.setNit("04657595");
        userPage.waitElement(2);
        userPage.clickConsultar();
        userPage.waitElement(2);
        userPage.getAlertCode();
        assertThat(userPage.getAlertCode().contains("Nit IPS no registrado en el Sistema")) ;

    }



}
