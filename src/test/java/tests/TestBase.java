package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import pages.P01_RegisterPage;

import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;
    P01_RegisterPage registerPage;
    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://automationexercise.com");
        registerPage = new P01_RegisterPage(driver);


    }

  //  @AfterClass
    public void wrapUp(){
        if (driver!=null) {
            driver.quit();
        }
    }
}
