package tests;

import Helper.LoginHelper;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ReptilesPage;

public class ReptilesTest extends TestBase{
    ReptilesPage reptilesPage;
    LoginHelper loginHelper;
    @BeforeMethod
    public void init() {
        loginHelper = new LoginHelper(driver);
        reptilesPage = new ReptilesPage(driver);
        loginHelper.login("salem", "Passw0rd123");
    }

    @Test(priority = 1)
    public void verifyReptilesCategoriesLoad(){
        reptilesPage.clickOnReptilesTab();
        Assert.assertEquals(reptilesPage.isCategoryHeaderDisplayed(),"Reptiles");
    }

    @Test(priority = 2)
    public void venomlessRattlesnakeAdoption(){
        reptilesPage.clickOnReptilesTab();
        reptilesPage.clickOnRattleSnakeTab();
        reptilesPage.clickOnVenomlessSnakeTab();

        Assert.assertEquals(reptilesPage.getCartCount(),"1");
    }
    @Test(priority = 3)
    public void greenAdultIguanaAdoption(){
        reptilesPage.clickOnReptilesTab();
        reptilesPage.clickOnIguanaTab();
        reptilesPage.clickOnGreenAdultIguana();

        Assert.assertEquals(reptilesPage.isItemInCart(),"EST-13");
    }
    @Test(priority = 4)
    public void testCheckoutProcess() throws InterruptedException{
        reptilesPage.clickOnReptilesTab();
        reptilesPage.clickOnRattleSnakeTab();
        reptilesPage.clickOnRattlelessSnackTab();

        reptilesPage.clickOnCheckoutTab();
        Thread.sleep(3000);
        Assert.assertEquals(reptilesPage.isCheckoutHeaderDisplayed(),"Payment Details");
    }
    @Test(priority = 5)
    public void testMultipleItemCart(){
        reptilesPage.clickOnReptilesTab();
        reptilesPage.clickOnRattleSnakeTab();
        reptilesPage.clickOnRattlelessSnackTab();

        reptilesPage.clickOnReptilesTab();
        reptilesPage.clickOnIguanaTab();
        reptilesPage.clickOnGreenAdultIguana();

        Assert.assertEquals(reptilesPage.getCartCount(),"2","Cart should contain 2 items");
    }
}
