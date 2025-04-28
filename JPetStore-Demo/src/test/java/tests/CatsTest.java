package tests;

import Helper.LoginHelper;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CatsPage;

public class CatsTest extends TestBase {
    CatsPage catsPage;
    LoginHelper loginHelper;

    @BeforeMethod
    public void init() {
        loginHelper = new LoginHelper(driver);
        catsPage = new CatsPage(driver);
        loginHelper.login("salem", "Passw0rd123");
    }

    @Test(priority = 1)
    public void verifyCatCategoriesLoad() {
        catsPage.clickOncatsTab();
        Assert.assertEquals(catsPage.isCategoryHeaderDisplayed(), "Cats");
    }

    @Test(priority = 2)
    public void testManxCatAdoption() {
        catsPage.clickOncatsTab();
        catsPage.clickOnManxTab();
        catsPage.clickOnTaillessManxTab();

        Assert.assertEquals(catsPage.getCartCount(), "1");
    }

    @Test(priority = 3)
    public void testPersianCatAdoption() {
        catsPage.clickOncatsTab();
        catsPage.clickOnPersianTab();
        catsPage.clickOnMalePersianTab();

        Assert.assertEquals(catsPage.isItemInCart(), "EST-17");
    }

    @Test(priority = 4)
    public void testCheckoutProcess() throws InterruptedException {
        catsPage.clickOncatsTab();
        catsPage.clickOnManxTab();
        catsPage.clickOnTailManxTab();

        catsPage.clickOnCheckoutTab();
        Thread.sleep(3000);
        Assert.assertEquals(catsPage.isCheckoutHeaderDisplayed(), "Payment Details");
    }

    @Test(priority = 5)
    public void testMultipleItemCart() {
        catsPage.clickOncatsTab();
        catsPage.clickOnManxTab();
        catsPage.clickOnTaillessManxTab();

        catsPage.clickOncatsTab();
        catsPage.clickOnPersianTab();
        catsPage.clickOnFemalePersianTab();

        Assert.assertEquals(catsPage.getCartCount(), "2","Cart should contain 2 items");
    }
}