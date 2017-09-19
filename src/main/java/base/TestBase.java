package base;

import Utilities.DriverSingleton;
import helpers.Waiter;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import screenshot.Screenshot;

@Listeners({ Screenshot.class })
public class TestBase {

    //Selenium selenium new DefaultSelenium(“localhost”, 4444, “*firefox”, “https://192.168.100.26/”);

    protected static final String BASE_URL = "https://192.168.100.26/";
    public WebDriver driver;


    public WebDriver getWebDriver() {
        return driver;
    }


    @BeforeClass
    public void setup() {
        DriverSingleton tmp = DriverSingleton.getInstance();
        driver = tmp.openBrowser();
        driver.get(BASE_URL);
        Waiter.waitForPageTitle("RMSys - Sign In");
    }


    @AfterClass
    public void exit() {
        driver.close();
    }
}
