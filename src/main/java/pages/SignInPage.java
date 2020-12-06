package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helpers.SearchWith;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends HomePage {
    public static final String PAGE = "SignInPage";

    @SearchWith(inPage = SignInPage.PAGE, locatorsFile = "src/main/resources/ObjectRepository.json", name = "emailAddress")
    public WebElement emailAddress;

    @SearchWith(inPage = SignInPage.PAGE, locatorsFile = "src/main/resources/ObjectRepository.json", name = "continueWithEmailBtn")
    public WebElement continueWithEmailBtn;

    @SearchWith(inPage = SignInPage.PAGE, locatorsFile = "src/main/resources/ObjectRepository.json", name = "password")
    public WebElement password;

    @SearchWith(inPage = SignInPage.PAGE, locatorsFile = "src/main/resources/ObjectRepository.json", name = "logInBtn")
    public WebElement logInBtn;

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public void enterEmail(String email) {
        emailAddress.sendKeys(email);
    }

    public void clickContinueWithEmail() {
        continueWithEmailBtn.click();
    }

    public void enterPassWord(String pwd) {
        password.sendKeys(pwd);
    }

    public void clickLogin() {
        logInBtn.click();
    }
}
