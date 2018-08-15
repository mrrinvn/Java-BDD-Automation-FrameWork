package elements;

import org.openqa.selenium.By;

public class ByLocators {

    public By findBy (enums.Locators locators, String selector)
    {
        switch (locators)
        {
            case id:
                return By.id(selector);
            case cssSelector:
                return By.cssSelector(selector);
            case tagname:
                return By.tagName(selector);
            case name:
                return By.name(selector);
            case classname:
                return By.className(selector);
            case xpath:
                return By.xpath(selector);
            case linktext:
                return By.linkText(selector);
            case paritallinktext:
                return By.partialLinkText(selector);
            default:
                return By.xpath(selector);
        }

    }
}
