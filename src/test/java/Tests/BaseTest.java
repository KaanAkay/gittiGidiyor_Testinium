package Tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.util.logging.Logger;

public class BaseTest {

    private static WebDriver driver;
    private static final Logger logger = Logger.getLogger(BaseTest.class.getName());
    private static final int DEFAULT_WAIT = 20;
    private static final String driverName = "webdriver.chrome.driver";
    private static final String googleDriverPath = "./driver/chromedriver";
    private static final String baseUrl = "https://www.gittigidiyor.com/";
    public static WebDriver getDriver() {return driver;}
    public static int getDefaultWait(){return DEFAULT_WAIT;}

    @Before
    public void setup(){
        System.setProperty(driverName,googleDriverPath);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximazed");
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.navigate().to(baseUrl);
        logger.info("site Açılıyor.");
        
    }

    @After
    public void tearDown(){
       driver.quit();
    }

}
