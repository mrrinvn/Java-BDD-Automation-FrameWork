package tests;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import drivers.SeleniumDrivers;

public class BaseTest {

    public static WebDriver driver;

    private SeleniumDrivers selenium;

    @Before
    public void initalDriver () {
        System.out.println("This will run before the Scenario1");
        selenium = new SeleniumDrivers("Chrome");
        driver = selenium.getDriver();
    }

    @After
    public void closeDriver () {
        System.out.println("This will run after the Scenario1");
        selenium.closeDriver();

    }

}



