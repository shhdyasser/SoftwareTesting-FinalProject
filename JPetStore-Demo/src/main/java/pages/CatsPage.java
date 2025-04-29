package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class CatsPage extends PageBase {
    By catsTab = By.xpath("//div[@id='QuickLinks']/a[text()='Cats']");

    By manxTab = By.xpath("//tr/td/a[text()='FL-DSH-01']");
    By taillessManxTab = By.xpath("//a[@href='/cart/addItemToCart?itemId=EST-14']");
    By tailManxTab = By.xpath("//a[@href='/cart/addItemToCart?itemId=EST-15']");

    By persianTab = By.xpath("//tr/td/a[text()='FL-DLH-02']");
    By femalePersianTab = By.xpath("//a[@href='/cart/addItemToCart?itemId=EST-16']");
    By malePersianTab = By.xpath("//a[@href='/cart/addItemToCart?itemId=EST-17']");

    By checkoutTab = By.xpath("//a[@href='/order/newOrderForm']");
    By categoryHeader = By.xpath("//h3");
    By itemLocator = By.xpath("//a[contains(@href, 'items')]");
    By checkoutHeader = By.xpath("/html/body/section/div[2]/div[2]/div/form/h3[1]");

    JavascriptExecutor js = (JavascriptExecutor)driver;

    public CatsPage(WebDriver driver) {
        super(driver);
    }

    public void clickOncatsTab() {
        scrollDown("window.scrollBy(0,368.79998779296875)");
        clickOnElement(catsTab);
    }

    public void clickOnManxTab() {
        scrollDown("window.scrollBy(0,368.79998779296875)");
        clickOnElement(manxTab);
    }

    public void clickOnTaillessManxTab() {
        scrollDown("window.scrollBy(0,368.79998779296875)");
        clickOnElement(taillessManxTab);
    }

    public void clickOnTailManxTab() {
        scrollDown("window.scrollBy(0,368.79998779296875)");
        clickOnElement(tailManxTab);
    }

    public void clickOnPersianTab() {
        scrollDown("window.scrollBy(0,368.79998779296875)");
        clickOnElement(persianTab);
    }

    public void clickOnFemalePersianTab() {
        scrollDown("window.scrollBy(0,368.79998779296875)");
        clickOnElement(femalePersianTab);
    }

    public void clickOnMalePersianTab() {
        scrollDown("window.scrollBy(0,368.79998779296875)");
        clickOnElement(malePersianTab);
    }

    public void clickOnCheckoutTab() {
        scrollDown("window.scrollBy(0,368.79998779296875)");
        clickOnElement(checkoutTab);
    }

    public String isCategoryHeaderDisplayed() {
        return driver.findElement(categoryHeader).getText();
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

}
