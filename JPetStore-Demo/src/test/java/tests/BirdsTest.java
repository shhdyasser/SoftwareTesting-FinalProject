package tests;

import Helper.LoginHelper;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BirdsPage;



public class BirdsTest extends TestBase {
    BirdsPage birdsPage;
    LoginHelper loginHelper;

    @BeforeMethod
    public void init() {
        birdsPage = new BirdsPage(driver);
        loginHelper = new LoginHelper(driver);
        loginHelper.login("salem", "Passw0rd123");
    }

    @Test(priority = 1)
    public void verifyBirdsCategoriesLoad() {
        birdsPage.clickOnBirdsTab();
        Assert.assertEquals(birdsPage.isCategoryHeaderDisplayed(), "Birds");
    }

    @Test(priority = 2)
    public void testAmazonParrotAdoption() {
        birdsPage.clickOnBirdsTab();
        birdsPage.clickOnAmazonParrotTab();
        birdsPage.clickOnAddAmazonParrotToCartBtn();
        Assert.assertEquals(birdsPage.getCartCount(), "1");
    }

    @Test(priority = 3)
    public void testFinchAdoption() {
        birdsPage.clickOnBirdsTab();
        birdsPage.clickOnFinch();
        birdsPage.clickOnAddFinchToCartBtn();
        Assert.assertEquals(birdsPage.isItemInCart(), "EST-19");
    }

    @Test(priority = 4)
    public void testCheckoutProcess() throws InterruptedException {
        birdsPage.clickOnBirdsTab();
        birdsPage.clickOnAmazonParrotTab();
        birdsPage.clickOnAddAmazonParrotToCartBtn();
        birdsPage.clickOnCheckoutTab();
        Thread.sleep(3000);
        Assert.assertEquals(birdsPage.isCheckoutHeaderDisplayed(), "Payment Details");
    }

    @Test(priority = 5)
    public void testMultipleItemCart() {
        birdsPage.clickOnBirdsTab();
        birdsPage.clickOnAmazonParrotTab();
        birdsPage.clickOnAddAmazonParrotToCartBtn();

        birdsPage.clickOnBirdsTab();
        birdsPage.clickOnFinch();
        birdsPage.clickOnAddFinchToCartBtn();

        Assert.assertEquals(birdsPage.getCartCount(), "2", "Cart should contain 2 items");


    }
}