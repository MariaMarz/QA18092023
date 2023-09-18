import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import static org.junit.Assert.assertTrue;

public class LoginTest extends BaseTest {
    @Test
    public void successfulLogin() {
        LoginPage loginPage = new LoginPage(app.driver);
        loginPage.login("test@gmail.com", "test@gmail.com");
        HeaderPage headerPage = new HeaderPage(app.driver);
       AssertJUnit.assertTrue(headerPage.isHeaderPresent());
    }
}
