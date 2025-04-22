package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FishPage extends PageBase {

    By fishPage = By.xpath("//*[@id=\"QuickLinks\"]/a[1]");
    By Angelfish = By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a");
    By AngelfishProduct = By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a");
    By TigerShark = By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a");
    By TigerSharkProduct = By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a");
    By Koi = By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[4]/td[1]/a");
    By KoiProduct = By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a");
    By Goldfish = By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[5]/td[1]/a");
    By GoldfishProduct = By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a");
    By addToCart = By.xpath("//*[@id=\"CenterForm\"]/div/a");
    By Return=By.xpath("//*[@id=\"BackLink\"]/a");
    By removeFromCart = By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[2]/td[8]/a");
    By proceedCheckout=By.xpath("//*[@id=\"Cart\"]/a");
    By continueCheckout=By.xpath("//*[@id=\"CenterForm\"]/form/div/button[1]");
    By confirm =By.xpath("//*[@id=\"CenterForm\"]/form/div/button[1]");

    public FishPage(WebDriver driver) {
        super(driver);
    }

    public void ClickOnFishPage(){
        clickOnElement(fishPage);
        scrollDown("window.scrollBy(0,368.79998779296875)");
    }
    public void AngelFish(){
        clickOnElement(Angelfish);
        scrollDown("window.scrollBy(0,368.79998779296875)");
        clickOnElement(AngelfishProduct);
        scrollDown("window.scrollBy(0,368.79998779296875)");
        clickOnElement(addToCart);
        scrollDown("window.scrollBy(0,368.79998779296875)");
    }
    public void TigerShark(){
        clickOnElement(TigerShark);
        scrollDown("window.scrollBy(0,368.79998779296875)");
        clickOnElement(TigerSharkProduct);
        scrollDown("window.scrollBy(0,368.79998779296875)");
        clickOnElement(addToCart);
        scrollDown("window.scrollBy(0,368.79998779296875)");
    }
    public void Koi(){
        clickOnElement(Koi);
        scrollDown("window.scrollBy(0,368.79998779296875)");
        clickOnElement(KoiProduct);
        scrollDown("window.scrollBy(0,368.79998779296875)");
        clickOnElement(addToCart);
        scrollDown("window.scrollBy(0,368.79998779296875)");
    }
    public void GoldFish(){
        clickOnElement(Goldfish);
        scrollDown("window.scrollBy(0,368.79998779296875)");
        clickOnElement(GoldfishProduct);
        scrollDown("window.scrollBy(0,368.79998779296875)");
        clickOnElement(addToCart);
        scrollDown("window.scrollBy(0,368.79998779296875)");
    }
    public void Return(){
        clickOnElement(Return);
        scrollDown("window.scrollBy(0,368.79998779296875)");
    }
    public void RemoveFromCart(){
        clickOnElement(removeFromCart);
        scrollDown("window.scrollBy(0,368.79998779296875)");
    }
    public void CheckOut(){
        clickOnElement(proceedCheckout);
        scrollDown("window.scrollBy(0,483.20001220703125)");
        scrollDown("window.scrollBy(0,634.4000244140625)");
        clickOnElement(continueCheckout);
        scrollDown("window.scrollBy(0,1028)");
        clickOnElement(confirm);
        Return();
    }

}
