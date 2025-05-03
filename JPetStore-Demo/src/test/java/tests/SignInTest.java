package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.SignInPage;
import static org.testng.Assert.*;

public class SignInTest extends TestBase {

    SignInPage signInPage;

    @BeforeMethod
    public void init() {
        signInPage = new SignInPage(driver);
    }


    @Test
    public void loginWithValidCredentials() {
        signInPage.clickSignIn();
        signInPage.fillUserName("j2ee");
        signInPage.fillPassword("j2ee");
        signInPage.clickOnLoginButton();

        Assert.assertEquals(signInPage.ActualResultAssert(),signInPage.signOutText);

    }


    @Test
    public void loginWithInvalidPassword() {
        signInPage.clickSignIn();
        signInPage.fillUserName("j2ee");
        signInPage.fillPassword("wrongpass");
        signInPage.clickOnLoginButton();

        Assert.assertEquals(signInPage.getErrorMessage(),"Invalid username or password. Signon failed.");
    }

    @Test
    public void loginWithNonexistentUser() {
        signInPage.clickSignIn();
        signInPage.fillUserName("nonexistent_user");
        signInPage.fillPassword("anypass");
        signInPage.clickOnLoginButton();

        Assert.assertEquals(signInPage.getErrorMessage(),"Invalid username or password. Signon failed.");
    }


    @Test
    public void loginWithEmptyUsername() {
        signInPage.clickSignIn();
        signInPage.fillUserName("");
        signInPage.fillPassword("j2ee");
        signInPage.clickOnLoginButton();

        Assert.assertEquals(signInPage.getErrorMessage(),"Invalid username or password. Signon failed.");
    }

    @Test
    public void loginWithEmptyPassword() {
        signInPage.clickSignIn();
        signInPage.fillUserName("j2ee");
        signInPage.fillPassword("");
        signInPage.clickOnLoginButton();

        Assert.assertEquals(signInPage.getErrorMessage(),"Invalid username or password. Signon failed.");
    }

    @Test
    public void verifyPasswordMasked() {
        signInPage.clickSignIn();
        signInPage.fillPassword("secret");

        assertEquals(signInPage.getPasswordFieldType(), "password");
    }

}