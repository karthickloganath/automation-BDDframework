package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helpers.SearchWith;

/**
 * Class representing the Komoot SignIn page
 */

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

    /** Enter email id input provided by user
     * @param email
     */
    public void enterEmail(String email) {
        emailAddress.sendKeys(email);
    }

    // Click on the ClickContinueWithEmail Button
    public void clickContinueWithEmail() {
        continueWithEmailBtn.click();
    }

    /** Enter the password input form the user
     * @param pwd
     */
    public void enterPassWord(String pwd) {
        password.sendKeys(pwd);
    }

    // Click on Login Button
    public void clickLogin() {
        logInBtn.click();
    }
}
