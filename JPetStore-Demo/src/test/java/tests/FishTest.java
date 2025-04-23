package tests;

import Helper.LoginHelper;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.FishPage;
import pages.SignInPage;

public class FishTest extends TestBase{

    FishPage fishPage;
    LoginHelper loginHelper;


    @BeforeMethod
    public void init(){
        loginHelper = new LoginHelper(driver);
        fishPage = new FishPage(driver);
    }

    @Test
    public void FishTestUntilCheckout() throws InterruptedException {
        System.out.println(driver);
        loginHelper.login("salem","Passw0rd123");

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
