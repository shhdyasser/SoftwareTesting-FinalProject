package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ReptilesPage extends PageBase{
    By reptilesTab = By.xpath("//div[@id='QuickLinks']/a[text()='Reptiles']");

    By rattleSnakeTab = By.xpath("//tr/td/a[text()='RP-SN-01']");
    By venomlessRattlesnake = By.xpath("//a[@href='/cart/addItemToCart?itemId=EST-11']");
    By rattlelessRattlesnake = By.xpath("//a[@href='/cart/addItemToCart?itemId=EST-12']");

    By iguanaTab = By.xpath("//tr/td/a[text()='RP-LI-02']");
    By greenAdultIguana = By.xpath("//a[@href='/cart/addItemToCart?itemId=EST-13']");

    By checkoutTab = By.xpath("//a[@href='/order/newOrderForm']");
    By categoryHeader = By.xpath("//h3");
    By itemLocator = By.xpath("//a[contains(@href, 'items')]");
    By checkoutHeader = By.xpath("/html/body/section/div[2]/div[2]/div/form/h3[1]");

    JavascriptExecutor js = (JavascriptExecutor)driver;
    public ReptilesPage(WebDriver driver){
        super(driver);
    }
    public void clickOnReptilesTab(){
        scrollDown("window.scrollBy(0,368.79998779296875)");
        clickOnElement(reptilesTab);
    }
    public void clickOnRattleSnakeTab(){
        scrollDown("window.scrollBy(0,368.79998779296875)");
        clickOnElement(rattleSnakeTab);
    }
    public void clickOnVenomlessSnakeTab(){
        scrollDown("window.scrollBy(0,368.79998779296875)");
        clickOnElement(venomlessRattlesnake);
    }

    public void clickOnRattlelessSnackTab(){
        scrollDown("window.scrollBy(0,368.79998779296875)");
        clickOnElement(rattlelessRattlesnake);
    }
    public void clickOnIguanaTab(){
        scrollDown("window.scrollBy(0,368.79998779296875)");
        clickOnElement(iguanaTab);
    }
    public void clickOnGreenAdultIguana(){
        scrollDown("window.scrollBy(0,368.79998779296875)");
        clickOnElement(greenAdultIguana);
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
