package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BirdsPage;


public class BirdsTest extends TestBase {
    BirdsPage birdsPage;

    @BeforeMethod
    public void init() {
        birdsPage = new BirdsPage(driver);
    }

    @Test
    public void BirdsPageTestUntilCheckout() throws InterruptedException {
        System.out.println(driver);
        birdsPage.clickSignIn();
        birdsPage.fillUserName("salem");
        birdsPage.fillPassword("Passw0rd123");
        birdsPage.clickOnLoginButton();
        Thread.sleep(3000);

        birdsPage.clickOnBirdsTab();
        Thread.sleep(2000);
        birdsPage.clickOnAmazonParrotTab();
        Thread.sleep(2000);
        birdsPage.clickOnMaleAmazonParrotTab();
        Thread.sleep(3000); //the checkout page
        birdsPage.clickOnAddAmazonParrotToCartBtn();
        Thread.sleep(3000);

        birdsPage.clickOnBirdsTab();
        Thread.sleep(2000);
        birdsPage.clickOnFinch();
        Thread.sleep(2000);
        birdsPage.clickOnMaleFinch();
        Thread.sleep(3000); //the checkout page
        birdsPage.clickOnAddFinchToCartBtn();
        Thread.sleep(3000);

        birdsPage.clickOnCheckoutTab();
        Thread.sleep(4000);
        birdsPage.clickOnContinueBtn();
        Thread.sleep(3000);
        birdsPage.clickOnConfirmBtn();
        Thread.sleep(3000);



    }
}