package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class BirdsPage extends PageBase {
    By birdsTab = By.xpath("//div[@id='QuickLinks']/a[text()='Birds']");

    By amazonParrotTab =  By.xpath("//tr/td/a[text()='AV-CB-01']");
    By maleAmazonParrot = By.xpath("//tr/td/a[text()='EST-18']");

    By finch = By.xpath("//tr/td/a[text()='AV-SB-02']");
    By maleFinch =  By.xpath("//tr/td/a[text()='EST-19']");

    By addAmazonParrotToCartBtn = By.xpath("//a[@href='/cart/addItemToCart?itemId=EST-18']");
    By addFinchToCartBtn = By.xpath("//a[@href='/cart/addItemToCart?itemId=EST-19']");

    By checkoutTab = By.xpath("//a[@href='/order/newOrderForm']");
    By continueBtn = By.xpath("//button[@type='submit' and text()='Continue']");
    By confirmBtn = By.xpath("//button[@type='submit' and text()='Confirm']");
    By categoryHeader = By.xpath("//h3");
    By itemLocator = By.xpath("//a[contains(@href, 'items')]");
    By checkoutHeader = By.xpath("/html/body/section/div[2]/div[2]/div/form/h3[1]");
    JavascriptExecutor js = (JavascriptExecutor)driver;

    public BirdsPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnBirdsTab(){
        scrollDown("window.scrollBy(0,368.79998779296875)");
        clickOnElement(birdsTab);
    }

    public void clickOnAmazonParrotTab(){
        scrollDown("window.scrollBy(0,368.79998779296875)");
        clickOnElement(amazonParrotTab);
    }
    public void clickOnMaleAmazonParrotTab(){
        scrollDown("window.scrollBy(0,368.79998779296875)");
        clickOnElement(maleAmazonParrot);
    }
    public void clickOnFinch(){
        scrollDown("window.scrollBy(0,368.79998779296875)");
        clickOnElement(finch);
    }
    public void clickOnMaleFinch(){
        scrollDown("window.scrollBy(0,368.79998779296875)");
        clickOnElement(maleFinch);
    }
    public void clickOnCheckoutTab() {
        scrollDown("window.scrollBy(0,368.79998779296875)");
        clickOnElement(checkoutTab);
    }
    public void clickOnAddAmazonParrotToCartBtn() {
        scrollDown("window.scrollBy(0,368.79998779296875)");
        clickOnElement(addAmazonParrotToCartBtn);
    }
    public void clickOnAddFinchToCartBtn() {
        scrollDown("window.scrollBy(0,368.79998779296875)");
        clickOnElement(addFinchToCartBtn);
    }

    public void clickOnContinueBtn(){
        scrollDown("window.scrollBy(0,500)");
        clickOnElement(continueBtn);
    }
    public void clickOnConfirmBtn(){
        scrollDown("window.scrollBy(0,500)");
        clickOnElement(confirmBtn);
    }
    public String getCartCount() {
        return js.executeScript(
                "return document.evaluate(" +
                        "'//img[@name=\"img_cart\"]/following-sibling::text()[1]'," +
                        "document, null, XPathResult.STRING_TYPE, null).stringValue.trim();"
        ).toString();
    }
    public String isItemInCart() {
        return driver.findElement(itemLocator).getText();
    }

    public String isCheckoutHeaderDisplayed() {
        return driver.findElement(checkoutHeader).getText();
    }
    public String isCategoryHeaderDisplayed() {
        return driver.findElement(categoryHeader).getText();
    }


}