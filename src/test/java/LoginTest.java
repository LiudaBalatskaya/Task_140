import base.TestBase;
import org.testng.annotations.Test;
import pages.LoginPage;


public class LoginTest extends TestBase {

    LoginPage page;


    @Test
    public void gotoPage() {
        page = new LoginPage();
        page.login();
    }
}
