package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage extends  PageBase{

    By signIn = By.xpath("//*[@id=\"Menu\"]/div[1]/a[2]");
    By userName = By.name("username");
    By password =By.name("password");
    By loginButton = By.xpath("//*[@id=\"Signon\"]/form/div/div/button");

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public void clickSignIn(){
        clickOnElement(signIn);
    }

    public void fillUserName(String name){
        sendKeys(userName,name);
    }

    public void fillPassword(String password){
        sendKeys(this.password,password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }
}

