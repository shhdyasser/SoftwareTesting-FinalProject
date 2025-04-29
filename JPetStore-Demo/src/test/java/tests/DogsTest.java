package tests;

import Helper.LoginHelper;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DogsPage;

public class DogsTest extends TestBase {
    DogsPage dogsPage;
    LoginHelper loginHelper;

    @BeforeMethod
    public void init() {
        loginHelper = new LoginHelper(driver);
        dogsPage = new DogsPage(driver);
        loginHelper.login("salem", "Passw0rd123");
    }

    @Test(priority = 1)
    public void verifyDogCategoriesLoad() {
        dogsPage.ClickOnDogePage();
        Assert.assertTrue(dogsPage.isCategoryHeaderDisplayed().contains("Dogs"),
                "Dog categories page should load properly");
    }

    @Test(priority = 2)
    public void testBulldogAdoption() {
        dogsPage.ClickOnDogePage();
        dogsPage.Bulldog();
        Assert.assertEquals(dogsPage.getCartCount(), "1");
    }

    @Test(priority = 3)
    public void testPoodleAdoption() {
        dogsPage.ClickOnDogePage();
        dogsPage.Poodle();
        Assert.assertEquals(dogsPage.isItemInCart(), "EST-8");
    }

    @Test(priority = 4)
    public void testVerifyEmptyCart() {
        dogsPage.ClickOnDogePage();
        Assert.assertEquals(dogsPage.getCartCount(), "0", "Cart should be empty initially");
    }

    @Test(priority = 5)
    public void testItemRemoval() throws InterruptedException {
        dogsPage.ClickOnDogePage();
        dogsPage.GoldenRetriever();
        dogsPage.removeItem("EST-28");
        Thread.sleep(3000);
        Assert.assertEquals(dogsPage.getCartCount(), "0",
                "Item should be removable from cart");
    }

    @Test(priority = 6)
    public void testTotalCalculation() throws InterruptedException {
        dogsPage.ClickOnDogePage();
        dogsPage.LabradorRetriever();
        dogsPage.ClickOnDogePage();
        dogsPage.Chihuahua();
        Thread.sleep(3000);
        Assert.assertEquals(dogsPage.getCartTotal(), "$261.00");
    }

    @Test(priority = 7)
    public void testCheckoutProcess() throws InterruptedException {
        dogsPage.ClickOnDogePage();
        dogsPage.Dalmation();
        dogsPage.CheckOut();
        Thread.sleep(3000);
        Assert.assertEquals(dogsPage.isCheckoutComplete(),"Thank you, your order has been submitted.");
    }
}