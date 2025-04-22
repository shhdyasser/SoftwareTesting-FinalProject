package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.SignInPage;
import pages.SignUpPage;

public class SignUpTest extends TestBase{

    SignUpPage signUpPage;

    @BeforeMethod
    public void init(){
        signUpPage = new SignUpPage(driver);

    }

    @Test
    public void SignUpWithValidArguments() throws InterruptedException {
        System.out.println(driver);
        signUpPage.clickSignUp();
        signUpPage.fillUserId("salem");
        signUpPage.fillPassword("Passw0rd123");
        signUpPage.fillConfirmPassword("Passw0rd123");
        signUpPage.fillFirstName("Salem");
        signUpPage.fillLastName("Ali");
        signUpPage.fillEmail("salem.ali@example.com");
        signUpPage.fillPhone("010928871");
        signUpPage.fillAddress1("123 Main Street");
        signUpPage.fillAddress2("Apartment 4B");
        signUpPage.fillCity("Alexandria");
        signUpPage.fillState("Smouha");
        signUpPage.fillZip("12345");
        signUpPage.fillCountry("Egypt");
        signUpPage.selectLanguagePreference("Korean");
        signUpPage.selectFavouriteCategory("Cats");
        signUpPage.enableListOption(true);
        signUpPage.enableBannerOption(true);
        Thread.sleep(3000);

        signUpPage.clickOnSignUpButton();
        Thread.sleep(5000);

    }
}
