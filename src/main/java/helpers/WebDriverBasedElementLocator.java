package helpers;

import org.openqa.selenium.By;

public abstract class WebDriverBasedElementLocator extends By {

    public static By locateElement(String locateUsing, String locatorValue) {
        By elementLocPath = null;
        switch (locateUsing) {
            case "id":
                elementLocPath = By.id(locatorValue);
                break;
            case "name":
                elementLocPath = By.name(locatorValue);
                break;

            case "class":
                elementLocPath = By.className(locatorValue);
                break;
            case "css":
                elementLocPath = By.cssSelector(locatorValue);
                break;
            case "link":
                elementLocPath = By.linkText(locatorValue);
                break;
            case "partial":
                elementLocPath = By.partialLinkText(locatorValue);
                break;
            case "tag":
                elementLocPath = By.tagName(locatorValue);
                break;
            case "xpath":
                elementLocPath = By.xpath(locatorValue);
                break;
        }
        return elementLocPath;
    }
}