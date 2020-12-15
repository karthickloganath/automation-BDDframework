package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import helpers.SearchWith;

/**
 * Class representing the Discover Komoot Page
 */

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
    
    @SearchWith(inPage = DiscoverPage.PAGE, locatorsFile = "src/main/resources/ObjectRepository.json", name = "shop")
    private WebElement shop ;
    
    public DiscoverPage(WebDriver driver) {
        super(driver);
    }

    // To select Hiking Icon
    public void selectHiking() {
        hiking.click();
    }
    
    // To Select Biking Icon
    public void selectBike() {
        bike.click();
    }

/**
 * Enter the location and select from dropdown
 * @param testLocation
 */
    public void enterLocation(String testLocation) throws InterruptedException {
        location.click();
        location.sendKeys(testLocation);
        location.sendKeys(Keys.ARROW_DOWN);
        location.sendKeys(Keys.ENTER);
    }

    // To click on search button
    public void clickSearch() {
        searchBtn.click();
    }
 
    // To select Shop option present in Discover page
    public void clickShop() {
        shop.click();
    }
   
    // SignOut of Komoot account
    public void signOut() {
    	myMenu.click();
    	signOutBtn.click();
    }
}

