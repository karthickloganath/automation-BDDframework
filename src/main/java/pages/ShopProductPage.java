package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helpers.SearchWith;

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
    	driver.findElement(By.xpath("//a/span[text()='Discover More']")).click();
    	
    }
    
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
    
    public boolean validateMapsPage() {
    	return(mapsLogo.isDisplayed());
    }
}
