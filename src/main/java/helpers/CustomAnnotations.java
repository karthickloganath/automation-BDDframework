package helpers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Field;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.pagefactory.AbstractAnnotations;

import com.google.common.base.Preconditions;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

class CustomAnnotations extends AbstractAnnotations {
	
    private final Field field;
    CustomAnnotations(Field field) {
        this.field = field;
    }

    @Override
    public By buildBy() {
        SearchWith searchWith = field.getAnnotation(SearchWith.class);
        Preconditions.checkArgument(searchWith != null, "Failed to locate the annotation @SearchWith");

        String elementName = searchWith.name();
        Preconditions.checkArgument(isNotNullAndEmpty(elementName), "Element name not found");

        String pageName = searchWith.inPage();
        Preconditions.checkArgument(isNotNullAndEmpty(pageName), "Page name not found");

        String locatorsFile = searchWith.locatorsFile();
        Preconditions.checkArgument(isNotNullAndEmpty(locatorsFile), "Locators File name not provided");

        File file = new File(locatorsFile);
        Preconditions.checkArgument(file.exists(), "Unable to locate " + locatorsFile);

        try {
            JsonArray array = new JsonParser().parse(new FileReader(file)).getAsJsonArray();
            Iterator<JsonElement> iterator = array.iterator();
            JsonObject foundObject = null;
            while (iterator.hasNext()) {
                JsonObject object = iterator.next().getAsJsonObject();
                if (pageName.equalsIgnoreCase(object.get("pageName").getAsString()) &&
                        elementName.equalsIgnoreCase(object.get("name").getAsString())) {
                    foundObject = object;
                    break;
                }
            }
            Preconditions.checkState(foundObject != null, "No entry found for the page [" + pageName + "] in the "
                    + "locators file [" + locatorsFile + "]");
            String locateUsing = foundObject.get("locateUsing").getAsString();
            Preconditions.checkArgument(isNotNullAndEmpty(locateUsing), "Locate Using cannot be null (or) empty");

            String locator = foundObject.get("locator").getAsString();
            Preconditions.checkArgument(isNotNullAndEmpty(locator), "Locator cannot be null (or) empty");

            return WebDriverBasedElementLocator.locateElement(locateUsing, locator);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public boolean isLookupCached() {
        return (field.getAnnotation(CacheLookup.class) != null);
    }

    private boolean isNotNullAndEmpty(String arg) {
        return ((arg != null) && (! arg.trim().isEmpty()));
    }

}
