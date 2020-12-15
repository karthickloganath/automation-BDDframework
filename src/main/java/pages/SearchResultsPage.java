package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helpers.SearchWith;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Class representing the Search Results Page
 */

public class SearchResultsPage extends HomePage{
    public static final String PAGE = "SearchResultsPage";
    protected WebDriverWait wait;

    @SearchWith(inPage = SearchResultsPage.PAGE, locatorsFile = "src/main/resources/ObjectRepository.json", name = "easy")
    private WebElement easy ;

    @SearchWith(inPage = SearchResultsPage.PAGE, locatorsFile = "src/main/resources/ObjectRepository.json", name = "intermediate")
    private WebElement intermediate ;

    @SearchWith(inPage = SearchResultsPage.PAGE, locatorsFile = "src/main/resources/ObjectRepository.json", name = "difficult")
    private WebElement difficult ;

    @SearchWith(inPage = SearchResultsPage.PAGE, locatorsFile = "src/main/resources/ObjectRepository.json", name = "milesDropDown")
    private WebElement milesDropDown ;

    @SearchWith(inPage = SearchResultsPage.PAGE, locatorsFile = "src/main/resources/ObjectRepository.json", name = "milesThree")
    private WebElement milesThree ;

    @SearchWith(inPage = SearchResultsPage.PAGE, locatorsFile = "src/main/resources/ObjectRepository.json", name = "milesFive")
    private WebElement milesFive ;

    @SearchWith(inPage = SearchResultsPage.PAGE, locatorsFile = "src/main/resources/ObjectRepository.json", name = "milesTen")
    private WebElement milesTen ;

    @SearchWith(inPage = SearchResultsPage.PAGE, locatorsFile = "src/main/resources/ObjectRepository.json", name = "milesTwenty")
    private WebElement milesTwenty ;

    @SearchWith(inPage = SearchResultsPage.PAGE, locatorsFile = "src/main/resources/ObjectRepository.json", name = "searchResults")
    private WebElement searchResults ;
    
    @SearchWith(inPage = SearchResultsPage.PAGE, locatorsFile = "src/main/resources/ObjectRepository.json", name = "myTourName")
    private WebElement myTourName ;
    
    @SearchWith(inPage = SearchResultsPage.PAGE, locatorsFile = "src/main/resources/ObjectRepository.json", name = "saveMyTour")
    private WebElement saveMyTour ;
    
    public SearchResultsPage(WebDriver driver) {
        super(driver);
        wait = new WebDriverWait(driver, 10);
    }

    /**Select desired Difficulty to filter search results
     * @param difficulty
     */ 
    public void selectDifficulty(String difficulty) {
        if (difficulty.equalsIgnoreCase("easy")) {
            easy.click();
        } else if (difficulty.equalsIgnoreCase("intermediate")) {
            intermediate.click();
        } else if (difficulty.equalsIgnoreCase("difficult")) {
            difficult.click();
        }
    }

    /** Select Desired Miles to filter search results
     * @param miles
     */
    public void selectMiles(int miles) {
        milesDropDown.click();
        switch (miles) {
            case 3:
                milesThree.click();
                break;
            case 5:
                milesFive.click();
                break;
            case 10:
                milesTen.click();
                break;
            case 20:
                milesTwenty.click();
                break;
        }

    }

    /** Return the results count
     * @return
     */
    public int numOfFilteredResults() {
        return Integer.parseInt(searchResults.getText());
    }
    
    // Select and save the tour of your choice
    public void saveMyTour() {
    	saveMyTour.click();
    	driver.findElement(By.xpath("//div[contains(@class,'tw-p-3 tw-text-right')]/button")).click();
    	
    }
    
    /** Return the Tour name of the selected Tour
     * @return
     */
    public String tourNameSelected() {
    	return myTourName.getText();
    	
    }
}

