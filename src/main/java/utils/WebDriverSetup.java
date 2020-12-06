package utils;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.WebDriverSetup.SystemOS;

public class WebDriverSetup {
    private WebDriver webDriver = null;
    public static SystemOS systemOS = getOSName();

    public enum SystemOS {
        // TODO - Add OS names to the list
        Linux, Windows, Mac
    }

    /*public WebDriver getDriver(Properties properties) {
        System.setProperty("webdriver.chrome.driver", properties.getProperty("chromedriver.path"));
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        return webDriver;
    }*/

    /**
     * Initialise Web Driver based on 'browser' in config.properties file
     *
     * @return
     */
    public WebDriver getDriver(Properties properties) {
        String browserName = properties.getProperty("browser").toLowerCase();
        if (browserName.equals("chrome")) {
            try {
                System.setProperty("webdriver.chrome.driver", getDriverExe(browserName));
            } catch (Exception e) {
                String path = properties.getProperty("chromedriver.path");
                System.setProperty("webdriver.chrome.driver", path);
            } finally {
                webDriver = new ChromeDriver();
            }
        }
        webDriver.manage().window().maximize();
        return webDriver;
    }

    /**
     * Get corresponding driver executable from 'drivers' dir inside PROJECT_HOME
     * based on 'browser' value in config.properties file
     * Fetches name of OS to determine the name of the folder to select the appropriate the driver exec
     *
     * @param driverFileName
     * @return
     */
    public String getDriverExe(String driverFileName) throws IOException {
        String resourcePath = System.getProperty("user.dir") + File.separator
                + "drivers/" + systemOS + "/" + getDriverExeFileName(driverFileName);

        File driverFile = new File(resourcePath);
        return driverFile.getPath();
    }

    /**
     * Get system name and assign to the systemOS static variable
     *
     * @return
     */
    public static SystemOS getOSName() {
        String opSystemName = System.getProperty("os.name").toLowerCase();
        if (opSystemName.contains("win")) {
            systemOS = SystemOS.Windows;
        } else if (opSystemName.contains("nix") || opSystemName.contains("nux")) {
            systemOS = SystemOS.Linux;
        } else if (opSystemName.contains("mac")) {
            systemOS = SystemOS.Mac;
        }
        return systemOS;
    }

    /**
     * Get file extension of driver exe based on system OS
     * Required as Windows OS will fail if the file name do not end with ".exe"
     *
     * @param browser
     * @return
     */
    public String getDriverExeFileName(String browser) {
        if (systemOS.equals(SystemOS.Windows)) {
            return browser + "driver.exe";
        }
        return browser + "driver";
    }

}