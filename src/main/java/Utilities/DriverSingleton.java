package Utilities;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public final class DriverSingleton {
    private static volatile DriverSingleton instance = null;
    public static WebDriver driver;


    private DriverSingleton() {
    }


    public static WebDriver openBrowser() {
        driver = new ChromeDriver();
        return driver;
    }


    public void close() {
        driver.close();
    }


    public static DriverSingleton getInstance() {
        if (instance == null) {
            synchronized (DriverSingleton.class) {
                if (instance == null) {
                    instance = new DriverSingleton();
                }
            }
        }
        return instance;
    }


    public static void driverWait() {
        final int MAXIMUM_WAIT_TIME = 20;
        WebDriverWait wait = new WebDriverWait(driver, MAXIMUM_WAIT_TIME);
    }


    public static String description() {
        return "Version browser: " + "ChromeDriver";
    }
}
