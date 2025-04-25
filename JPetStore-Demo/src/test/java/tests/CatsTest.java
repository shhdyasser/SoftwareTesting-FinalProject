package tests;

import Helper.LoginHelper;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CatsPage;

public class CatsTest extends TestBase{
    CatsPage catsPage;
    LoginHelper loginHelper;

    @BeforeMethod
    public void init(){
        loginHelper = new LoginHelper(driver);
        catsPage = new CatsPage(driver);
    }

    @Test
    public void CatsPageTesttillCheckout() throws InterruptedException {
        System.out.println(driver);
        loginHelper.login("salem","Passw0rd123");

        catsPage.clickOncatsTab();
        Thread.sleep(2000);
        catsPage.clickOnManxTab();
        Thread.sleep(2000);
        catsPage.clickOnTaillessManxTab();
        Thread.sleep(3000);

        catsPage.clickOncatsTab();
        Thread.sleep(2000);
        catsPage.clickOnManxTab();
        Thread.sleep(2000);
        catsPage.clickOnTailManxTab();
        Thread.sleep(3000);

        catsPage.clickOncatsTab();
        Thread.sleep(2000);
        catsPage.clickOnPersianTab();
        Thread.sleep(2000);
        catsPage.clickOnFemalePersianTab();
        Thread.sleep(3000);

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
