import base.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class HomePageTest extends TestBase {

    HomePage home;
    LoginPage page;


    @BeforeMethod
    public void gotoPage() {
        page = new LoginPage();
        page.login();
    }


    @Test
    public void homePage() {
        home = new HomePage();
        home.gotoOffice();
    }
}
