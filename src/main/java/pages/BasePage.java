package pages;
import elements.UIElements;
import elements.ByLocators;
import enums.Locators;
import org.openqa.selenium.WebDriver;
import static java.lang.Thread.sleep;

public class BasePage
{

    private WebDriver driver;

    public BasePage( WebDriver seleniumDriver) {
        this.driver = seleniumDriver;
    }


    public UIElements findObject (Locators locators, String selector)
    {
        UIElements element  =  new UIElements(driver);

        element.findElement(new ByLocators().findBy(locators,selector));

        return element;
    }

    public void navigate(String url)
    {
        driver.get(url);

        try {
            sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
