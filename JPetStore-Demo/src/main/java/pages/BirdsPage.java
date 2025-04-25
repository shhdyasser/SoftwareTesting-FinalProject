package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BirdsPage extends PageBase {
//    By signIn = By.xpath("//*[@id=\"Menu\"]/div[1]/a[2]");
//    By userName = By.name("username");
//    By password =By.name("password");
//    By loginButton = By.xpath("//*[@id=\"Signon\"]/form/div/div/button");
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


    public BirdsPage(WebDriver driver) {
        super(driver);
    }
//    public void clickSignIn(){
//        scrollDown("window.scrollBy(0,368.79998779296875)");
//        clickOnElement(signIn);
//    }
//    public void fillUserName(String name){
//        scrollDown("window.scrollBy(0,368.79998779296875)");
//        sendKeys(userName,name);
//    }
//    public void fillPassword(String password){
//
//        sendKeys(this.password,password);
//    }
//
//    public void clickOnLoginButton() {
//
//        clickOnElement(loginButton);
//    }
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



}
