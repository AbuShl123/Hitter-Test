package org.abu.selenium;

import org.abu.framework.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public abstract class BaseElement {
    public final Locator locator;
    public final String selector;
    public final String name;
    public final By by;

    private WebElement element;

    public BaseElement(Locator locator, String selector, String name) {
        this.locator = locator;
        this.name = name;
        this.selector = selector;
        this.by = findBy(locator);
    }

    public WebElement getElement() {
        if (element == null) {
            this.element = Driver.getDriver().findElement(by);
        }

        return element;
    }

    private By findBy(Locator locator) {
        switch (locator) {
            case ClassName:
                return By.className(selector);
            case TagName:
                return By.tagName(selector);
            case Id:
                return By.id(selector);
            case CssSelector:
                return By.cssSelector(selector);
            case XPath:
                return By.xpath(selector);
            default:
                throw new RuntimeException("Unknown locator.");
        }
    }

    protected String toHtml() {
        return " " + name + " " + by;
    }
}
