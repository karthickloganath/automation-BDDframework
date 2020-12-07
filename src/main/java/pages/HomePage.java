package pages;

import helpers.FileBasedElementLocatorFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helpers.SearchWith;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	public static final String PAGE = "HomePage";
	protected WebDriver driver;
	protected WebDriverWait wait;

    @SearchWith(inPage = HomePage.PAGE, locatorsFile = "src/main/resources/ObjectRepository.json", name = "signUpOrLogin")
    public WebElement signUpOrLogin ;

    @SearchWith(inPage = HomePage.PAGE, locatorsFile = "src/main/resources/ObjectRepository.json", name = "acceptPrivacyPolicy")
    public WebElement acceptPrivacyPolicy ;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		ElementLocatorFactory factory = new FileBasedElementLocatorFactory(driver);
		PageFactory.initElements(factory, this);
		wait = new WebDriverWait(driver, 10);
	}

	public void acceptPolicy() {
		//wait.until(ExpectedConditions.elementToBeClickable(acceptPrivacyPolicy));
		acceptPrivacyPolicy.click();
	}

	public void clickSignUpOrLogin() {
		signUpOrLogin.click();
	}
}

