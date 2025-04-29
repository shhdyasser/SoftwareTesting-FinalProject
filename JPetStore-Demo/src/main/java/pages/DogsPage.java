package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class DogsPage extends PageBase {

    By dogsPage = By.xpath("//*[@id=\"QuickLinks\"]/a[2]");

    By Bulldog = By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a");
    By MaleAdultBulldog = By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a");

    By Poodle= By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a");
    By MalePuppyPoodle = By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a");

    By Dalmation = By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[4]/td[1]/a");
    By SpotlessMalePuppyDalmation = By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a");

    By GoldenRetriever = By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[5]/td[1]/a");
    By AdultFemaleGoldenRetriever=  By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a");

    By LabradorRetriever = By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[6]/td[1]/a");
    By AdultMaleLabradorRetriever =  By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a");
    By AdultFemaleLabradorRetriever =  By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a");

    By Chihuahua = By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[7]/td[1]/a");
    By AdultMaleChihuahua =  By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a");

    By categoryHeader = By.xpath("//h3");
    By itemLocator = By.xpath("//a[contains(@href, 'items')]");
    By addToCart = By.xpath("//*[@id=\"CenterForm\"]/div/a");
    By totalCheckout = By.xpath("/html/body/section/div[2]/div[2]/div[2]/div[1]/form/table/tbody/tr[4]/td[4]/strong");
    By proceedCheckout=By.xpath("//*[@id=\"Cart\"]/a");
    By continueButton=By.xpath("//*[@id=\"CenterForm\"]/form/div/button[1]");
    By confirmButton =By.xpath("//*[@id=\"CenterForm\"]/form/div/button[1]");
    By checkoutComplete = By.xpath("/html/body/section/div[2]/div[2]/div[1]/p");
    By Return=By.xpath("//*[@id=\"BackLink\"]/a");

    JavascriptExecutor js = (JavascriptExecutor)driver;

    public DogsPage(WebDriver driver) {
        super(driver);
    }


    public void ClickOnDogePage(){
        clickOnElement(dogsPage);
        scrollDown("window.scrollBy(0,368.79998779296875)");
    }

    public void Bulldog(){
        clickOnElement(Bulldog);
        scrollDown("window.scrollBy(0,368.79998779296875)");
        clickOnElement(MaleAdultBulldog);
        scrollDown("window.scrollBy(0,368.79998779296875)");
        clickOnElement(addToCart);
        scrollDown("window.scrollBy(0,368.79998779296875)");
    }

    public void Poodle(){
        clickOnElement(Poodle);
        scrollDown("window.scrollBy(0,368.79998779296875)");
        clickOnElement(MalePuppyPoodle);
        scrollDown("window.scrollBy(0,368.79998779296875)");
        clickOnElement(addToCart);
        scrollDown("window.scrollBy(0,368.79998779296875)");
    }

    public void Dalmation(){
        clickOnElement(Dalmation);
        scrollDown("window.scrollBy(0,368.79998779296875)");
        clickOnElement(SpotlessMalePuppyDalmation);
        scrollDown("window.scrollBy(0,368.79998779296875)");
        clickOnElement(addToCart);
        scrollDown("window.scrollBy(0,368.79998779296875)");
    }

    public void GoldenRetriever(){
        clickOnElement(GoldenRetriever);
        scrollDown("window.scrollBy(0,368.79998779296875)");
        clickOnElement(AdultFemaleGoldenRetriever);
        scrollDown("window.scrollBy(0,368.79998779296875)");
        clickOnElement(addToCart);
        scrollDown("window.scrollBy(0,368.79998779296875)");
    }

    public void LabradorRetriever(){
        clickOnElement(LabradorRetriever);
        scrollDown("window.scrollBy(0,368.79998779296875)");
        clickOnElement(AdultMaleLabradorRetriever);
        scrollDown("window.scrollBy(0,368.79998779296875)");
        clickOnElement(addToCart);
        scrollDown("window.scrollBy(0,368.79998779296875)");
    }

    public void Chihuahua(){
        clickOnElement(Chihuahua);
        scrollDown("window.scrollBy(0,368.79998779296875)");
        clickOnElement(AdultMaleChihuahua);
        scrollDown("window.scrollBy(0,368.79998779296875)");
        clickOnElement(addToCart);
        scrollDown("window.scrollBy(0,368.79998779296875)");
    }

    public void Return (){
        clickOnElement(Return);
        scrollDown("window.scrollBy(0,368.79998779296875)");
    }

    public void CheckOut(){
        clickOnElement(proceedCheckout);
        scrollDown("window.scrollBy(0,483.20001220703125)");
        scrollDown("window.scrollBy(0,634.4000244140625)");
        clickOnElement(continueButton);
        scrollDown("window.scrollBy(0,1028)");
        clickOnElement(confirmButton);
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

    public void removeItem(String itemId) {
        clickOnElement(By.xpath("//a[@hx-post='/cart/removeItemFromCart?cartItem=" + itemId + "']"));
    }

    public String getCartTotal() {
        return driver.findElement(totalCheckout).getText();
    }

    public String isCheckoutComplete() {
        return driver.findElement(checkoutComplete).getText();
    }

}