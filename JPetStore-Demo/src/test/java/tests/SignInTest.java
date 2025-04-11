package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.SignInPage;


public class SignInTest extends TestBase{

    SignInPage signInPage;


    @BeforeMethod
    public void init(){
        signInPage = new SignInPage(driver);

    }

    @Test
    public void LoginWithValidUsernameAndValidPassword() throws InterruptedException {
        System.out.println(driver);
        signInPage.clickSignIn();
        signInPage.fillUserName("");
        signInPage.fillPassword("");
        signInPage.clickOnLoginButton();
        Thread.sleep(5000);


    }

}
