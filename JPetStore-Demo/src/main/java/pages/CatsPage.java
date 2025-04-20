package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CatsPage extends PageBase {

    By signIn = By.xpath("//*[@id=\"Menu\"]/div[1]/a[2]");
    By userName = By.name("username");
    By password =By.name("password");
    By loginButton = By.xpath("//*[@id=\"Signon\"]/form/div/div/button");
    By catsTab = By.xpath("//div[@id='QuickLinks']/a[text()='Cats']");

    By manxTab = By.xpath("//tr/td/a[text()='FL-DSH-01']");
    By taillessManxTab = By.xpath("//a[@href='/cart/addItemToCart?itemId=EST-14']");
    By tailManxTab = By.xpath("//a[@href='/cart/addItemToCart?itemId=EST-15']");

    By persianTab = By.xpath("//tr/td/a[text()='FL-DLH-02']");
    By femalePersianTab = By.xpath("//a[@href='/cart/addItemToCart?itemId=EST-16']");
    By malePersianTab = By.xpath("//a[@href='/cart/addItemToCart?itemId=EST-17']");

    By checkoutTab = By.xpath("//a[@href='/order/newOrderForm']");

    public CatsPage(WebDriver driver) {
        super(driver);
    }

    public void clickSignIn(){
        scrollDown("window.scrollBy(0,368.79998779296875)");
        clickOnElement(signIn);
    }

    public void fillUserName(String name){
        scrollDown("window.scrollBy(0,368.79998779296875)");
        sendKeys(userName,name);
    }

    public void fillPassword(String password){

        sendKeys(this.password,password);
    }

    public void clickOnLoginButton() {

        clickOnElement(loginButton);
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

}
