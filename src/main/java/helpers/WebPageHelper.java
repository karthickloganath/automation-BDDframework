package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebPageHelper {
    protected WebDriverWait wait;
    protected WebDriver webDriver;
    public static final long WAIT_TIME = 10;

    public WebPageHelper(WebDriver webDriver) {
        this.webDriver = webDriver;
        this.wait = new WebDriverWait(webDriver, WAIT_TIME);
    }

    /**
     * Wait till an element is visible and enabled to click
     *
     * @param element the WebElement
     * @return the (same) WebElement once it is clickable (visible and enabled)
     */
    public WebElement waitTillVisible(final WebElement element) {
        return (new WebDriverWait(webDriver, WAIT_TIME)).until(ExpectedConditions.elementToBeClickable(element));
    }

    /**
     * Check if an element, known to be present on the DOM
     * of a page, is visible. Visibility means that the element is not only
     * displayed but also has a height and width that is greater than 0.
     *
     * @param element the WebElement
     * @return the (same) WebElement once it is visible
     */
    public WebElement checkVisibilityOf(final WebElement element) {
        return (new WebDriverWait(webDriver, WAIT_TIME)).until(ExpectedConditions.visibilityOf(element));
    }

}

