package elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static java.lang.Thread.sleep;

public class UIElements implements WebElement{

    private WebElement element;
    private ByLocators locator;

    private WebDriver driver;
    private By by;

    public UIElements (WebDriver driver){
        this.driver = driver;
        locator = new ByLocators();


    }

    @Override
    public void click() {
        element.click();

    }

    @Override
    public void submit() {
        element.submit();

    }

    @Override
    public void sendKeys(CharSequence... keysToSend) {
        try {
            element.clear();

            sleep(3000);

            element.sendKeys(keysToSend);

            sleep(3000);

        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    @Override
    public void clear() {
        element.clear();

    }

    @Override
    public String getTagName() {
        return element.getTagName();
    }

    @Override
    public String getAttribute(String attributeName) {
        return element.getAttribute(attributeName);
    }

    @Override
    public boolean isSelected() {
        return element.isSelected();
    }

    @Override
    public boolean isEnabled() {
        if (element != null)
            return element.isEnabled();
        else
            return false;
    }

    @Override
    public String getText() {
        return element.getText();
    }



    @Override
    public WebElement findElement(By by) {
        // TODO Auto-generated method stub

        element=driver.findElement(by);
        return element;

    }

    @Override
    public boolean isDisplayed() {
        if (element != null)
            return element.isDisplayed();
        else
            return false;
    }

    @Override
    public Point getLocation() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Dimension getSize() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Rectangle getRect() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getCssValue(String propertyName) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <X> X getScreenshotAs(OutputType<X> target)
            throws WebDriverException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<WebElement> findElements(By by) {
        // TODO Auto-generated method stub
        return driver.findElements(by);

    }

    public void clickAndWait()  {

        if(isEnabled()) {
            System.out.println("test");
            element.click();
            try {
                sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public void hover()
    {
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
    }

    public void hoverAndClick() {
        Actions action = new Actions(driver);
        action.moveToElement(element).click(element).build().perform();
        try {
            sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



}

