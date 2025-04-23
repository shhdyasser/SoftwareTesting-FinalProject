package tests;

import Helper.LoginHelper;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BirdsPage;
import pages.SignInPage;


public class BirdsTest extends TestBase {
    BirdsPage birdsPage;
    LoginHelper loginHelper;

    @BeforeMethod
    public void init() {
        birdsPage = new BirdsPage(driver);
        loginHelper = new LoginHelper(driver);
    }

    @Test
    public void BirdsPageTestUntilCheckout() throws InterruptedException {
        System.out.println(driver);
        loginHelper.login("salem","Passw0rd123");

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