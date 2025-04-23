package Helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import pages.PageBase;
import pages.SignInPage;
import tests.TestBase;

public class LoginHelper extends PageBase {

    By signIn = By.xpath("//*[@id=\"Menu\"]/div[1]/a[2]");
    By userName = By.name("username");
    By password =By.name("password");
    By loginButton = By.xpath("//*[@id=\"Signon\"]/form/div/div/button");

    public LoginHelper(WebDriver driver) {
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

    public void login(String username, String password) {
        clickSignIn();
        fillUserName(username);
        fillPassword(password);
        clickOnLoginButton();
    }

}