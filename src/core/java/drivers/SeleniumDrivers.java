package drivers;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;

public class SeleniumDrivers {

    // this is our driver that will be used for all selenium actions
    private WebDriver driver;

    private WebDriverWait wait;

    public SeleniumDrivers(String browser) {

        System.setProperty("webdriver.chrome.driver",
                "drivers//chromedriver.exe");

        // open a new driver instance to our application URL

        switch (browser) { // check our browser
            case "Firefox": {
                driver = new FirefoxDriver();
                break;
            }
            case "Chrome": {
                System.setProperty("webdriver.chrome.driver","drivers//chromedriver.exe");
                driver = new ChromeDriver();
                break;
            }
            case "IE": {
                driver = new InternetExplorerDriver();
                break;
            }
            case "Safari": {
                driver = new SafariDriver();
                break;
            }
            // if our browser is not listed, throw an error
            default: {
                driver = new ChromeDriver();
            }
        }
        setWait(new WebDriverWait(driver, 15));

        driver.manage().window().maximize();

    }

    // a method to allow retrieving our driver instance
    public WebDriver getDriver() {
        return driver;
    }

    // a method for allowing selenium to pause for a set amount of time
    public void wait(int seconds) throws InterruptedException {
        Thread.sleep(seconds * 1000);
    }

    public void wait(double seconds) throws InterruptedException {
        Thread.sleep(Double.doubleToLongBits(seconds * 1000));
    }

    public WebDriverWait getWait() {
        return wait;
    }

    public void setWait(WebDriverWait wait) {
        this.wait = wait;
    }

    public void closeDriver() {
        driver.close();
        driver.quit();
    }
}
