package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class commonAPI {

    public static WebDriver driver = null;


    @BeforeMethod
    @Parameters({"url"})
    public void setUp(){
        //chrome setup
        System.setProperty("webdriver.chrome.driver",
                "D:\\IdeaProjects\\SeleniumHW1\\src\\main\\java\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


    }

    @AfterMethod
    public void cleanUp(){
        //close chrome
        driver.close();

    }
}
