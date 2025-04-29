package tests;

import Helper.LoginHelper;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.FishPage;

public class FishTest extends TestBase {
    FishPage fishPage;
    LoginHelper loginHelper;

    @BeforeMethod
    public void init() {
        loginHelper = new LoginHelper(driver);
        fishPage = new FishPage(driver);
        loginHelper.login("salem", "Passw0rd123");
    }

    @Test(priority = 1)
    public void verifyFishCategoriesLoad() {
        fishPage.ClickOnFishPage();
        Assert.assertTrue(fishPage.isCategoryHeaderDisplayed().contains("Fish"),
                "Fish categories page should load properly");
    }

    @Test(priority = 2)
    public void testAngelFishAdoption() {
        fishPage.ClickOnFishPage();
        fishPage.AngelFish();
        Assert.assertEquals(fishPage.isItemInCart(), "EST-1");
    }

    @Test(priority = 3)
    public void testItemRemoval() throws InterruptedException {
        fishPage.ClickOnFishPage();
        fishPage.TigerShark();
        fishPage.removeItem("EST-3");
        Thread.sleep(3000);
        Assert.assertEquals(fishPage.getCartCount(), "0",
                "Item should be removable from cart");
    }

    @Test(priority = 4)
    public void testTotalCalculation() throws InterruptedException {
        fishPage.ClickOnFishPage();
        fishPage.Koi();
        fishPage.ClickOnFishPage();
        fishPage.GoldFish();
        Thread.sleep(3000);
        Assert.assertEquals(fishPage.getCartTotal(), "$24.00");
    }

    @Test(priority = 5)
    public void testCheckoutProcess() throws InterruptedException {
        fishPage.ClickOnFishPage();
        fishPage.AngelFish();
        fishPage.CheckOut();
        Thread.sleep(3000);
        Assert.assertEquals(fishPage.isCheckoutComplete(), "Thank you, your order has been submitted.");
    }

    @Test(priority = 6)
    public void testUpdateProductQuantity() throws InterruptedException {
        fishPage.ClickOnFishPage();
        fishPage.AngelFish();
        fishPage.updateProductQuantity("EST-1", 3);
        Thread.sleep(3000);
        Assert.assertEquals(fishPage.getProductQuantity("EST-1"), "3",
                "Product quantity should be updated successfully");
    }
}