package Helper;

import org.openqa.selenium.WebDriver;
import pages.SignInPage;

public class LoginHelper {
    private final SignInPage signInPage;

    public LoginHelper(WebDriver driver) {
        this.signInPage = new SignInPage(driver);
    }

    public void login(String username, String password) {
        signInPage.clickSignIn();
        signInPage.fillUserName(username);
        signInPage.fillPassword(password);
        signInPage.clickOnLoginButton();
    }
}