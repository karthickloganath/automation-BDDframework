package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helpers.SearchWith;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage extends HomePage{
    public static final String PAGE = "SearchResultsPage";

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
    
    
    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public void selectDifficulty(String difficulty) {
        if (difficulty.equalsIgnoreCase("easy")) {
            easy.click();
        } else if (difficulty.equalsIgnoreCase("intermediate")) {
            intermediate.click();
        } else if (difficulty.equalsIgnoreCase("difficult")) {
            difficult.click();
        }
    }

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

    public int numOfFilteredResults() {
        int count = Integer.parseInt(searchResults.getText());
        return count;
    }
}

