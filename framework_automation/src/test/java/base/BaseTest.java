package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    public WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void beforeTest(){
        System.setProperty("webdriver.chrome.driver", Thread.currentThread().getContextClassLoader().getResource("drivers/chromedriver.exe").getPath());

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://portal.mutualser.org/ZONASER/");
    }

    @AfterMethod(alwaysRun = true)
    public void afterTest(){
        driver.close();
        driver.quit();
    }

}
