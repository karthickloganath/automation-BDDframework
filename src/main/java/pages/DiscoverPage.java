package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import helpers.SearchWith;
import org.openqa.selenium.support.PageFactory;

public class DiscoverPage extends HomePage {
    public static final String PAGE = "DiscoverPage";

    @SearchWith(inPage = DiscoverPage.PAGE, locatorsFile = "src/main/resources/ObjectRepository.json", name = "hiking")
    public WebElement hiking;

    @SearchWith(inPage = DiscoverPage.PAGE, locatorsFile = "src/main/resources/ObjectRepository.json", name = "bike")
    public WebElement bike;

    @SearchWith(inPage = DiscoverPage.PAGE, locatorsFile = "src/main/resources/ObjectRepository.json", name = "running")
    public WebElement running;

    @SearchWith(inPage = DiscoverPage.PAGE, locatorsFile = "src/main/resources/ObjectRepository.json", name = "location")
    public WebElement location;

    @SearchWith(inPage = DiscoverPage.PAGE, locatorsFile = "src/main/resources/ObjectRepository.json", name = "searchBtn")
    public WebElement searchBtn;

    @SearchWith(inPage = DiscoverPage.PAGE, locatorsFile = "src/main/resources/ObjectRepository.json", name = "myMenu")
    private WebElement myMenu ;

    @SearchWith(inPage = DiscoverPage.PAGE, locatorsFile = "src/main/resources/ObjectRepository.json", name = "signOutBtn")
    private WebElement signOutBtn ;
    
    public DiscoverPage(WebDriver driver) {
        super(driver);
    }

    public void selectHiking() {
        hiking.click();
    }

    public void selectBike() {
        bike.click();
    }

    public void enterLocation(String testLocation) throws InterruptedException {
        location.click();
        location.sendKeys(testLocation);
        location.sendKeys(Keys.ARROW_DOWN);
        location.sendKeys(Keys.ENTER);
    }

    public void clickSearch() {
        searchBtn.click();
    }
    
    public void signOut() {
    	myMenu.click();
    	signOutBtn.click();
    }
}

