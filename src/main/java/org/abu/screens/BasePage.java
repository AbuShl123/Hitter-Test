package org.abu.screens;

import org.abu.framework.Driver;
import org.abu.selenium.ControlFactory;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.FieldDecorator;

public abstract class BasePage implements IPage {

    public BasePage() {
        ControlFactory.initElements(Driver.getDriver(), this);
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
