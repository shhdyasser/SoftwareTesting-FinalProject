package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.FishPage;
import pages.SignInPage;

public class FishTest extends TestBase{

    FishPage fishPage;
    SignInPage signInPage;


    @BeforeMethod
    public void init(){
        signInPage = new SignInPage(driver);
        fishPage = new FishPage(driver);
    }

    @Test
    public void FishTestUntilCheckout() throws InterruptedException {
        System.out.println(driver);
        signInPage.clickSignIn();
        signInPage.fillUserName("j2ee");
        signInPage.fillPassword("j2ee");
        signInPage.clickOnLoginButton();
        Thread.sleep(3000);
        fishPage.ClickOnFishPage();
        Thread.sleep(3000);
        fishPage.AngelFish();
        Thread.sleep(3000);
        fishPage.Return();
        Thread.sleep(3000);
        fishPage.ClickOnFishPage();
        Thread.sleep(3000);
        fishPage.TigerShark();
        Thread.sleep(3000);
        fishPage.Return();
        Thread.sleep(3000);
        fishPage.ClickOnFishPage();
        Thread.sleep(3000);
        fishPage.Koi();
        Thread.sleep(3000);
        fishPage.Return();
        Thread.sleep(3000);
        fishPage.ClickOnFishPage();
        Thread.sleep(3000);
        fishPage.GoldFish();
        Thread.sleep(3000);
        fishPage.RemoveFromCart();
        Thread.sleep(3000);
        fishPage.CheckOut();

    }
}
