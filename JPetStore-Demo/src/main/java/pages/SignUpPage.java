package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage extends PageBase {

    // Locators
    By signUp = By.xpath("//*[@id=\"Menu\"]/div[1]/a[3]");
    By userId = By.name("username");
    By password = By.name("password");
    By confirmPassword = By.name("repeatedPassword");
    By email = By.name("email");
    By firstName = By.name("firstName");
    By lastName = By.name("lastName");
    By phone = By.name("phone");
    By address1 = By.name("address1");
    By address2 = By.name("address2");
    By city = By.name("city");
    By state = By.name("state");
    By zip = By.name("zip");
    By country = By.name("country");
    By languagePreference = By.name("languagePreference");
    By favouriteCategoryId = By.name("favouriteCategoryId");
    By listOption = By.name("listOption");
    By bannerOption = By.name("bannerOption");
    By SignUpButton = By.xpath("//div[@class='button-bar']/button");

    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    // Navigation
    public void clickSignUp() {
        scrollDown("window.scrollBy(0,368.79998779296875)");
        clickOnElement(signUp);
    }

    // Text field methods
    public void fillUserId(String name) {
        scrollDown("window.scrollBy(0,368.79998779296875)");
        sendKeys(userId, name);
    }

    public void fillPassword(String pwd) {
        sendKeys(password, pwd);
    }

    public void fillConfirmPassword(String pwd) {
        sendKeys(confirmPassword, pwd);
    }

    public void fillEmail(String emailAddress) {
        sendKeys(email, emailAddress);
    }

    public void fillFirstName(String fName) {
        sendKeys(firstName, fName);
    }

    public void fillLastName(String lName) {
        sendKeys(lastName, lName);
    }

    public void fillPhone(String phoneNumber) {
        sendKeys(phone, phoneNumber);
    }

    public void fillAddress1(String addr1) {
        scrollDown("window.scrollBy(0,857.5999755859375)");
        sendKeys(address1, addr1);
    }

    public void fillAddress2(String addr2) {
        sendKeys(address2, addr2);
    }

    public void fillCity(String cityName) {
        sendKeys(city, cityName);
    }

    public void fillState(String stateName) {
        sendKeys(state, stateName);
    }

    public void fillZip(String zipCode) {
        sendKeys(zip, zipCode);
    }

    public void fillCountry(String countryName) {
        sendKeys(country, countryName);
    }

    // Dropdown selection methods
    public void selectLanguagePreference(String language) {
        selectFromDropDownList(languagePreference, language);
    }

    public void selectFavouriteCategory(String category) {
        selectFromDropDownList(favouriteCategoryId, category);
    }

    // Checkbox methods
    public void enableListOption(boolean enable) {
        setCheckbox(listOption, enable);
    }

    public void enableBannerOption(boolean enable) {
        setCheckbox(bannerOption, enable);
    }


    public void clickOnSignUpButton() {
        clickOnElement(SignUpButton);
    }
}