package tests;

import Helper.LoginHelper;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.SearchPage;

public class SearchTest extends TestBase {
    SearchPage searchPage;
    LoginHelper loginHelper;

    @BeforeMethod
    public void init() {
        searchPage = new SearchPage(driver);
        loginHelper = new LoginHelper(driver);
        loginHelper.login("salem", "Passw0rd123");
    }

    @Test(priority = 1)
    public void testBasicSearch() throws InterruptedException {
        searchPage.performSearch("fish");
        Thread.sleep(1000);
        Assert.assertTrue(searchPage.getSearchResultsCount() > 0);
    }

    @Test(priority = 2)
    public void testSearchExactProductId() {
        searchPage.performSearch("Angelfish");
        Assert.assertEquals(searchPage.isProductInResults(2), "FI-SW-01");
    }

    @Test(priority = 3)
    public void testSearchNonExistentProduct() throws InterruptedException {
        searchPage.performSearch("noproduct");
        Thread.sleep(1000);
        Assert.assertEquals(searchPage.getSearchResultsCount(), 0);
    }

    @Test(priority = 4)
    public void testSearchAndNavigateToProduct() throws InterruptedException {
        searchPage.performSearch("dog");
        Assert.assertTrue(searchPage.getSearchResultsCount() > 0);
        searchPage.clickOnProduct(2);
        Thread.sleep(2000);
        Assert.assertEquals(searchPage.getPageTitle(), "Bulldog");
    }

    @Test(priority = 5)
    public void testSearchCaseSensitivity() throws InterruptedException {
        searchPage.performSearch("FISH");
        int upperCaseResults = searchPage.getSearchResultsCount();
        searchPage.performSearch("fish");
        int lowerCaseResults = searchPage.getSearchResultsCount();
        Assert.assertEquals(upperCaseResults, lowerCaseResults);
    }

    @Test(priority = 6)
    public void testPartialWordSearch() throws InterruptedException {
        searchPage.performSearch("gold");
        Thread.sleep(3000);
        Assert.assertEquals(searchPage.isProductInResults(2), "FI-FW-02");
        Assert.assertEquals(searchPage.isProductInResults(3), "K9-RT-01");
    }
}