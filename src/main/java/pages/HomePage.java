package pages;

import Utilities.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HomePage {
    private static final By HOME_PAGE = By.id("name");
    private static final By LIST_OFFICES = By.id("officeWidgetContent");
    private static final By OFFICE = By.cssSelector("div#main_div");
    private static final By LUNCH_VOTING = By.cssSelector(".resource-link-container.lunchvoting");
    private static final By SIGN_OUT = By.xpath(".//a[@href='/Authentication/SignOut']");

    public WebDriver driver;


    public HomePage() {
        this.driver = DriverSingleton.driver;
    }


    public void gotoOffice() {
        WebElement until = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(HOME_PAGE));
        List<WebElement> allElements = driver.findElements(LIST_OFFICES);

        for (WebElement element : allElements) {
            String str = element.getText();
            System.out.println(element.getText());
            if (str.contentEquals("Chapaeva 118")) {
                element.click();
            }
        }
        until = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(OFFICE));
    }


    public void lunchVoting() {
        WebElement until = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(OFFICE));
        driver.findElement(LUNCH_VOTING).click();
    }


    public void logout() {
        driver.findElement(SIGN_OUT).click();
    }
}
