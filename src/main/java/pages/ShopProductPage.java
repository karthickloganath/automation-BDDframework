package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helpers.SearchWith;

/**
 * Class representing the Komoot Products Shopping
 */

public class ShopProductPage extends HomePage{
	
    public static final String PAGE = "ShopProductPage";
    
    @SearchWith(inPage = ShopProductPage.PAGE, locatorsFile = "src/main/resources/ObjectRepository.json", name = "singleRegion")
    private WebElement singleRegion ;

    @SearchWith(inPage = ShopProductPage.PAGE, locatorsFile = "src/main/resources/ObjectRepository.json", name = "singleRegionPrice")
    private WebElement singleRegionPrice ;

    @SearchWith(inPage = ShopProductPage.PAGE, locatorsFile = "src/main/resources/ObjectRepository.json", name = "regionBundle")
    private WebElement regionBundle ;

    @SearchWith(inPage = ShopProductPage.PAGE, locatorsFile = "src/main/resources/ObjectRepository.json", name = "regionBundlePrice")
    private WebElement regionBundlePrice ;
    
    @SearchWith(inPage = ShopProductPage.PAGE, locatorsFile = "src/main/resources/ObjectRepository.json", name = "theWorld")
    private WebElement theWorld ;

    @SearchWith(inPage = ShopProductPage.PAGE, locatorsFile = "src/main/resources/ObjectRepository.json", name = "theWorldPrice")
    private WebElement theWorldPrice ;
    
    @SearchWith(inPage = ShopProductPage.PAGE, locatorsFile = "src/main/resources/ObjectRepository.json", name = "mapsLogo")
    private WebElement mapsLogo ;
    
    public ShopProductPage(WebDriver driver) {
        super(driver);
    }
    
    // ***** The Xpath is Hard coded to avoid creating another page.class Just for clicking Discover More Button
    public void clickDiscoverMore() {
    	WebDriverWait webDriverWait = new WebDriverWait(driver, 10);
    	webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/product']")));		
    	driver.findElement(By.xpath("//a/span[text()='See all map options']")).click();
    	
    }
    
    /** Validate the Bundle name from user input and return the actual name
     * @param region
     * @return
     */
    public String regionText(String region) {
    	if(region.equalsIgnoreCase("Single Region")) {
    		return singleRegion.getText();
    	}else 
    		if(region.equalsIgnoreCase("Region Bundle")) {;
    			return regionBundle.getText();
    	} else
    		if(region.equalsIgnoreCase("The World")) {
    			return theWorld.getText();
    		}
    	return null;
    }
    
    /** Validate the Bundle name from user input and return the cost
     * @param region
     * @return
     */
    public Float regionPrice(String region) {
    	if(region.equalsIgnoreCase("Single Region")) {
    		return Float.parseFloat(singleRegionPrice.getText().substring(1));
    	}else 
    		if(region.equalsIgnoreCase("Region Bundle")) {
    			return Float.parseFloat(regionBundlePrice.getText().substring(1));
    	} else
    		if(region.equalsIgnoreCase("The World")) {
    			return Float.parseFloat(theWorldPrice.getText().substring(1));
    		}
    	return null;
    }
    
    /** Validate whether the Maps logo is displayed
     * @return
     */
    public boolean validateMapsPage() {
    	return(mapsLogo.isDisplayed());
    }
}
