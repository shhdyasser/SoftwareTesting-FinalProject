package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CatsPage;
import pages.SignInPage;

public class CatsTest extends TestBase{

    CatsPage catsPage;

    @BeforeMethod
    public void init(){
        catsPage = new CatsPage(driver);
    }

    @Test
    public void CatsPageTesttillCheckout() throws InterruptedException {
        System.out.println(driver);
        catsPage.clickSignIn();
        catsPage.fillUserName("salem");
        catsPage.fillPassword("Passw0rd123");
        catsPage.clickOnLoginButton();
        Thread.sleep(3000);

        catsPage.clickOncatsTab();
        Thread.sleep(2000);
        catsPage.clickOnManxTab();
        Thread.sleep(2000);
        catsPage.clickOnTaillessManxTab();
        Thread.sleep(3000); //the checkout page

        catsPage.clickOncatsTab();
        Thread.sleep(2000);
        catsPage.clickOnManxTab();
        Thread.sleep(2000);
        catsPage.clickOnTailManxTab();
        Thread.sleep(3000); //the checkout page

        catsPage.clickOncatsTab();
        Thread.sleep(2000);
        catsPage.clickOnPersianTab();
        Thread.sleep(2000);
        catsPage.clickOnFemalePersianTab();
        Thread.sleep(3000); //the checkout page

        catsPage.clickOncatsTab();
        Thread.sleep(2000);
        catsPage.clickOnPersianTab();
        Thread.sleep(2000);
        catsPage.clickOnMalePersianTab();
        Thread.sleep(4000);

        catsPage.clickOnCheckoutTab();
        Thread.sleep(6000);

    }
}
