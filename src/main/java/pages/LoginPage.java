package pages;

import enums.Locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver seleniumDriver) {
        super(seleniumDriver);

    }

    private String btnMyaccount = "//*[@id=\"li_myaccount\"]/a";


    private String txtboxEmail = "username";

    private String txtboxPass = "password";

    private String btnLogin = "//*[@id=\"loginfrm\"]//div/button";

    private String url = "https://www.phptravels.net/login";


    /**
     * Page's method
     * <p>
     * Click button have text 1
     */

    public void enterUserName() {

        findObject(Locators.name, txtboxEmail).sendKeys("user@phptravels.com");
    }

    public void enterPassWord() {

        findObject(Locators.name, txtboxPass).sendKeys("demouser");
    }

    public void clickToMainPage() {

       findObject(Locators.xpath, btnLogin).clickAndWait();
    }

    public void openPage() {

        navigate(url);


    }
}
