package steps;

import helpers.WebPageHelper;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebDriver;
import pages.DiscoverPage;
import pages.HomePage;
import pages.SearchResultsPage;
import pages.SignInPage;
import utils.PropertyProvider;
import utils.WebDriverSetup;

import java.net.MalformedURLException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class SearchAndSaveTour  {
    public static WebDriver driver;
    private Properties properties;
    public static WebPageHelper webPageHelper;
    public HomePage homePage;
    public SignInPage signInPage;
    public DiscoverPage discoverPage;
    public SearchResultsPage searchResultsPage;

    @Before
    public void before() {
        properties = new PropertyProvider().getPropertyFile();
        driver = new WebDriverSetup().getDriver(properties);
        webPageHelper = new WebPageHelper(driver);
        homePage = new HomePage(driver);
        signInPage = new SignInPage(driver);
        discoverPage = new DiscoverPage(driver);
        searchResultsPage = new SearchResultsPage(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() {
    	discoverPage.signOut();
        driver.quit();
    }

    @Given("I launch the site")
    public void iLaunchSite() {
        driver.get(properties.getProperty("url.komoot"));
    }

    @When("I login using email {string} and password {string}")
    public void iLoginUsingEmailAndPassword(String email, String password) throws MalformedURLException {
    	
    	homePage.acceptPrivacyPolicy.click();
        homePage.clickSignUpOrLogin();
        signInPage.enterEmail(email);
        signInPage.clickContinueWithEmail();
        signInPage.enterPassWord(password);
        signInPage.clickLogin();
    }

    @When("I search for tour {string} in location {string}")
    public void i_Search_Tour_in_Location(String tour, String location) throws InterruptedException, MalformedURLException {
        Thread.sleep(3000);
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        if (tour.equalsIgnoreCase("bike")) {
            discoverPage.selectBike();
        } else if (tour.equalsIgnoreCase("hike")) {
            discoverPage.selectHiking();
        }
        discoverPage.enterLocation(location);
    }

    @When("I apply difficulty {string} and distance {int} filters")
    public void i_Apply_Diffculty_And_Distance_Filters(String difficulty, int miles) throws MalformedURLException {
        searchResultsPage.selectDifficulty(difficulty);
        searchResultsPage.selectMiles(miles);
    }

    @Then("the filtered search results are displayed")
    public void isDisplayingOnlyFilteredSearchResults() {
        int numofResults = searchResultsPage.numOfFilteredResults();
        assertTrue("Error in displaying filtered results", numofResults > 0);
    }
    
	@Then("I am able to select my tour {string} an save it")
	public void i_Select_MyTour_And_Save(String tourName){
		searchResultsPage.saveMyTour();
		String tourNameFormat = tourName.replaceAll("[^a-zA-Z0-9]", " "); 
		String selectedTourName = searchResultsPage.tourNameSelected();
		String selectedTourNameFormat = selectedTourName.replaceAll("[^a-zA-Z0-9]", " "); 
		assertTrue("Mismatch in Tour Name",selectedTourNameFormat.equals(tourNameFormat));
	}

}
