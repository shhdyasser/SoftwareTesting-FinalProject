package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class SearchPage extends PageBase {

    By searchBox = By.xpath("//input[@placeholder='Product Search']");
    By searchButton = By.xpath("/html/body/section/div[2]/div[1]/div[2]/div/form/div/div/button");
    By searchResultItems = By.xpath("//div[@id='Catalog']//table//tr[td//a]");
    By productLinks = By.xpath("//div[@id='Catalog']//table//tr/td[1]//a");
    By productTitle = By.xpath("//h3");

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public void enterSearchKeyword(String keyword) {
        sendKeys(searchBox, keyword);
    }

    public void clickSearchButton() {
        clickOnElement(searchButton);
    }

    public void performSearch(String keyword) {
        enterSearchKeyword(keyword);
        clickSearchButton();
    }

    public int getSearchResultsCount() throws InterruptedException {
        try{    
            waitTimeToBeVisible(searchResultItems);
            Thread.sleep(500);
            List<WebElement> results = driver.findElements(productLinks);
            return results.size();}
        catch (Exception e) {
            return 0;
        }
    }

    public String isProductInResults(int loc) {
            By productLocator = By.xpath("/html/body/section/div[2]/div[2]/div[2]/table/tbody/tr[" + loc + "]/td[1]/strong/a");
            return driver.findElement(productLocator).getText();
    }

    public void clickOnProduct(int loc) {
        By productLocator = By.xpath("/html/body/section/div[2]/div[2]/div[2]/table/tbody/tr[" + loc + "]/td[1]/strong/a");
        clickOnElement(productLocator);
    }
    
    public String getPageTitle() {
        return driver.findElement(productTitle).getText();
    }
}