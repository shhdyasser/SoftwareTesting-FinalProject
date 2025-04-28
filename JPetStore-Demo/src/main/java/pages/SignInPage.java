package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SignInPage extends  PageBase{

    By signIn = By.xpath("//*[@id=\"Menu\"]/div[1]/a[2]");
    By userName = By.name("username");
    By password =By.name("password");
    By loginButton = By.xpath("//*[@id=\"Signon\"]/form/div/div/button");
    By signOutHome = By.xpath("//a[@href='/account/signoff']");
    By errorMessage = By.xpath("//div[@class='panel failed']");

    public String signOutText = "Sign Out";


    public SignInPage(WebDriver driver) {
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

    public String ActualResultAssert(){
        return driver.findElement(signOutHome).getText();
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }

    public String getPasswordFieldType() {
        return driver.findElement(By.name("password")).getAttribute("type");
    }

}

