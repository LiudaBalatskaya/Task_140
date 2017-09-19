package pages;


import Utilities.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private static final String BASE_USER = "EugenBorisik";
    private static final String PASSWORD = "qwerty12345";

    private static final By USER_NAME = By.id("Username");
    private static final By PASSWORD_INPUT = By.id("Password");

    private static final By SIGN_IN = By.id("SubmitButton");

    public WebDriver driver;


    public LoginPage() {
        this.driver = DriverSingleton.driver;
    }


    public void enterUserName() {
        driver.findElement(USER_NAME).sendKeys(BASE_USER);
    }


    public void enterPassword() {
        driver.findElement(PASSWORD_INPUT).sendKeys(PASSWORD);
    }


    public void submit() {
        driver.findElement(SIGN_IN).click();
    }


    public void login() {
        enterUserName();
        enterPassword();
        submit();
    }
}
