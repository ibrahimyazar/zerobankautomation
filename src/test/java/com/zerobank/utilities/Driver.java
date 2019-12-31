package com.zerobank.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Driver {

    private static RemoteWebDriver driver;

    // you can not do like this if constructor is private Driver obj = new Driver()
    private Driver(){   // drtiver constructor

    }
    //if switch statement complains on string parameter
    //change java version to 7+, better at least 8
    //File--> Project Structure--> Set Project language level to at least 8 or above
    public static WebDriver get(){
        // if webdriver object was not crated yet
        if(driver == null){
            //create webdriver object based on browser value from properties file
            String browser = ConfigurationReader.getProperty("browser");
            switch (browser){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    //to configure chrome browser for tests
                    // ChromeOptions chromeOptions = new ChromeOptions();  // day 12/12/2019 eklendi video 16:50
                    //to run tests without interface, set to true
//                    chromeOptions.setHeadless(true);
                    //   driver = new ChromeDriver(chromeOptions);
                    driver = new ChromeDriver();
                    break;

                case "chrome_headless":  // to run the
                    WebDriverManager.chromedriver().setup();
                    //to configure chrome browser for tests
                    ChromeOptions options = new ChromeOptions();
                    //to run tests without interface, set to true
                    options.setHeadless(true);
                    driver = new ChromeDriver(options);
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;

                case "ie":
                    WebDriverManager.iedriver().setup();
                    driver = new InternetExplorerDriver();
                    break;

                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;

                case "safare":
                    //WebDriverManager.getInstance(SafariDriver);
                    driver = new SafariDriver();
                    break;

                default:
                    // if browsr is wrong stop tst and throw exception
                    throw new RuntimeException("Wrong browser type");
            }
        }
        // if webdriver object was created you can use it
        return driver;
    }

    public static void close(){
        // if driver still exist
        if(driver != null){
            //close all browser
            driver.quit();
            //destroy driver object ready for go
            driver = null;

        }
    }


}
